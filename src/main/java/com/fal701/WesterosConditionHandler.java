package com.fal701;

import com.google.common.base.Preconditions;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.mojang.blaze3d.systems.RenderSystem;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.renderer.v1.material.BlendMode;
import net.fabricmc.fabric.impl.blockrenderlayer.BlockRenderLayerMapImpl;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderLayers;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.scoreboard.ScoreboardCriterion;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import team.chisel.ctm.client.util.BlockstatePredicateParser;

import java.lang.reflect.Type;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class WesterosConditionHandler {
    public final int condWidth;
    public final int condHeight;
    public final int condIndex;

    private static class SrcTexture {
        int index = MATCH_ANY;
        int row = MATCH_ANY;
        int col = MATCH_ANY;
    }

    ;
    private static final int MATCH_ANY = -1;
    private static final int OUT_EQ_SRC = -1;

    public static final String TYPE_SIMPLE = "simple";
    public static final String TYPE_HORIZONTAL = "horizontal";
    public static final String TYPE_PATTERN = "pattern";
    public static final String TYPE_VERTICAL = "vertical";
    public static final String TYPE_CTM = "ctm";
    public static final String TYPE_CTM_PATTERN = "ctm+pattern";
    public static final String TYPE_RANDOM = "random";
    public static final String TYPE_EDGES_FULL = "edges-full";
    public static final String TYPE_OVERLAY = "overlay";
    public static final String TYPE_NULL = "null";    // null quad

    public static final String[] TYPES = new String[]{TYPE_HORIZONTAL, TYPE_PATTERN, TYPE_VERTICAL, TYPE_CTM, TYPE_CTM_PATTERN, TYPE_RANDOM,
            TYPE_EDGES_FULL, TYPE_NULL, TYPE_OVERLAY};

    private static final ThreadLocal<Random> rand = ThreadLocal.withInitial(() -> new Random());

    private static class CondRule {
        SrcTexture[] source = null;    // If defined, only apply rule to source textures with given texture index, column, row
        String[] biomeNames = null;    // If defined, only apply rule to locations matching one of the biomes
        int yPosMin = Integer.MIN_VALUE;    // If defined, only apply rule if pos.getY() >= yPosMin
        int yPosMax = Integer.MAX_VALUE;    // If defined, pnly apply rule if pos.getY() <= yPosMax
        Boolean isFancy = null;        // If defined, only match if client is running fancy mode
        int rowOut = OUT_EQ_SRC, colOut = OUT_EQ_SRC;        // column, row for texture to be substituted (or origin of pattern)
        int patWidth = 1, patHeight = 1;    // width and height of pattern with 0,0 at patRow, patCol
        int patRow = 0, patCol = 0;        // origin of pattern, for pattern and ctm+pattern pattern grid
        int weights[] = null;    // Weights for type=random (row*width + col]
        int weightTotal;
        int rndOffX = 0, rndOffY = 0, rndOffZ = 0;    // position offset for random (for sake of consistency between adjacent blocks)
        boolean rndSameAllSides = false;
        String type = TYPE_SIMPLE;
        CondRule[] conds = null;    // If nested rules

        private TextureWesterosCommon.ConnectionCheck connCheck;

        boolean isMatch(int txtIdx, int txtRow, int txtCol, String biomename, BlockPos pos) {
            BlockState bs = MinecraftClient.getInstance().world.getBlockState(pos);
            boolean bool = RenderLayers.getBlockLayer(bs) == RenderLayer.getCutout();
            int y = pos.getY();
            if ((y < yPosMin) || (y > yPosMax)) return false;
            if (source != null) {
                boolean match = false;
                for (int i = 0; (i < source.length) && (!match); i++) {
                    // Match if equal or rule didn't specify value
                    match = ((source[i].index == txtIdx) || (source[i].index == MATCH_ANY)) &&
                            ((source[i].row == txtRow) || (source[i].row == MATCH_ANY)) &&
                            ((source[i].col == txtCol) || (source[i].col == MATCH_ANY));
                }
                if (!match) return false;
            }
            if (biomeNames != null) {
                boolean match = false;
                for (int i = 0; (i < biomeNames.length) && (!match); i++) {
                    match = biomeNames[i].equals(biomename);
                }
                if (!match) return false;
            }
            if ((isFancy != null) && (isFancy.booleanValue() != bool)) {
                return false;
            }
            return true;
        }
    }

    ;

    private final CondRule[] conds;

    static final Type MAP_TYPE = (new TypeToken<EnumMap<Direction, Predicate<BlockState>>>() {
    }).getType();
    static final Type PREDICATE_TYPE = (new TypeToken<Predicate<BlockState>>() {
    }).getType();
    final BlockstatePredicateParser.PredicateDeserializer predicateDeserializer = new BlockstatePredicateParser.PredicateDeserializer();
    private final Gson GSON = (new GsonBuilder()).registerTypeAdapter(PREDICATE_TYPE, this.predicateDeserializer).registerTypeAdapter(BlockstatePredicateParser.ComparisonType.class, new BlockstatePredicateParser.ComparisonType.Deserializer()).registerTypeAdapter(MAP_TYPE, (type) -> {
        return new EnumMap(Direction.class);
    }).registerTypeAdapter(BlockstatePredicateParser.PredicateMap.class, new BlockstatePredicateParser.MapDeserializer()).create();
    ;


    public BiPredicate<Direction, BlockState> parse(JsonElement json) {
        return (BiPredicate) this.GSON.fromJson(json, BlockstatePredicateParser.PredicateMap.class);
    }

    class PredicateDeserializer implements JsonDeserializer<Predicate<BlockState>> {
        private static final Predicate<BlockState> EMPTY = (p) -> {
            return false;
        };
        ThreadLocal<Predicate<BlockState>> defaultPredicate = new ThreadLocal();

        PredicateDeserializer() {
        }

        public Predicate<BlockState> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
            if (json.isJsonObject()) {
                JsonObject obj = json.getAsJsonObject();
                Block block = (Block) Registries.BLOCK.get(new Identifier(JsonHelper.getString(obj, "block")));
                if (block == Blocks.f_50016_) {
                    return EMPTY;
                }

                BlockstatePredicateParser.Composition composition = null;
                if (obj.has("defer")) {
                    if (this.defaultPredicate.get() == null) {
                        throw new JsonParseException("Cannot defer when no default is set!");
                    }

                    try {
                        composition = BlockstatePredicateParser.Composition.valueOf(GsonHelper.m_13906_(obj, "defer").toUpperCase(Locale.ROOT));
                    } catch (IllegalArgumentException var11) {
                        throw new JsonSyntaxException(GsonHelper.m_13906_(obj, "defer") + " is not a valid defer type.");
                    }
                }

                if (!obj.has("predicate")) {
                    return this.compose(composition, BlockstatePredicateParser.this.new BlockPredicate(block));
                }

                JsonElement propsEle = obj.get("predicate");
                if (propsEle.isJsonObject()) {
                    return this.compose(composition, this.parsePredicate(block, propsEle.getAsJsonObject(), context));
                }

                if (propsEle.isJsonArray()) {
                    List<Predicate<BlockState>> predicatesx = new ArrayList();
                    Iterator var9 = propsEle.getAsJsonArray().iterator();

                    while (var9.hasNext()) {
                        JsonElement elex = (JsonElement) var9.next();
                        if (!elex.isJsonObject()) {
                            throw new JsonSyntaxException("Predicate entry must be a JSON Object. Found: " + elex);
                        }

                        predicatesx.add(this.parsePredicate(block, elex.getAsJsonObject(), context));
                    }

                    return this.compose(composition, BlockstatePredicateParser.this.new PredicateComposition(BlockstatePredicateParser.Composition.AND, predicatesx));
                }
            } else if (json.isJsonArray()) {
                List<Predicate<BlockState>> predicates = new ArrayList();
                Iterator var13 = json.getAsJsonArray().iterator();

                while (var13.hasNext()) {
                    JsonElement ele = (JsonElement) var13.next();
                    Predicate<BlockState> p = (Predicate) context.deserialize(ele, BlockstatePredicateParser.PREDICATE_TYPE);
                    if (p != EMPTY) {
                        predicates.add(p);
                    }
                }

                return (Predicate) (predicates.isEmpty() ? EMPTY : (predicates.size() == 1 ? (Predicate) predicates.get(0) : BlockstatePredicateParser.this.new PredicateComposition(BlockstatePredicateParser.Composition.OR, predicates)));
            }

            throw new JsonSyntaxException("Predicate deserialization expects an object or an array. Found: " + json);
        }

        private Predicate<BlockState> compose(@Nullable BlockstatePredicateParser.Composition composition, @Nonnull Predicate<BlockState> child) {
            return composition == null ? child : (Predicate) composition.composer.apply((Predicate) this.defaultPredicate.get(), child);
        }

        private Predicate<BlockState> parsePredicate(@Nonnull Block block, JsonObject obj, JsonDeserializationContext context) {
            BlockstatePredicateParser.ComparisonType compareFunc = (BlockstatePredicateParser.ComparisonType) GsonHelper.m_13845_(obj, "compare_func", BlockstatePredicateParser.ComparisonType.EQUAL, context, BlockstatePredicateParser.ComparisonType.class);
            obj.remove("compare_func");
            Set<Map.Entry<String, JsonElement>> entryset = obj.entrySet();
            if (obj.size() != 1) {
                throw new JsonSyntaxException("Predicate entry must define exactly one property->value pair. Found: " + entryset.size());
            } else {
                String key = (String) ((Map.Entry) entryset.iterator().next()).getKey();
                Optional<Property<?>> prop = Optional.ofNullable(block.m_49965_().m_61081_(key));
                if (prop.isEmpty()) {
                    throw new JsonParseException(key + " is not a valid property for blockstate " + block.m_49966_());
                } else {
                    JsonElement valueEle = obj.get(key);
                    return (Predicate) (valueEle.isJsonArray() ? new BlockstatePredicateParser.MultiPropertyPredicate(block, (Property) prop.get(), (Set) StreamSupport.stream(valueEle.getAsJsonArray().spliterator(), false).map((e) -> {
                        return this.parseValue((Property) prop.get(), e);
                    }).collect(Collectors.toSet())) : BlockstatePredicateParser.this.new PropertyPredicate(block, (Property) prop.get(), this.parseValue((Property) prop.get(), valueEle), compareFunc));
                }
            }
        }

        private Comparable parseValue(Property prop, JsonElement ele) {
            String valstr = GsonHelper.m_13805_(ele, prop.m_61708_());
            Optional<Comparable> value = prop.m_6908_().stream().filter((v) -> {
                return prop.m_6940_((Comparable) v).equalsIgnoreCase(valstr);
            }).findFirst();
            if (value.isEmpty()) {
                throw new JsonParseException(valstr + " is not a valid value for property " + prop);
            } else {
                return (Comparable) value.get();
            }
        }
    }

    static enum ComparisonType {
        EQUAL("=", (i) -> {
            return i == 0;
        }),
        NOT_EQUAL("!=", (i) -> {
            return i != 0;
        }),
        GREATER_THAN(">", (i) -> {
            return i > 0;
        }),
        LESS_THAN("<", (i) -> {
            return i < 0;
        }),
        GREATER_THAN_EQ(">=", (i) -> {
            return i >= 0;
        }),
        LESS_THAN_EQ("<=", (i) -> {
            return i <= 0;
        });

        private final String key;
        private final IntPredicate compareFunc;

        private ComparisonType(String key, IntPredicate compareFunc) {
            this.key = key;
            this.compareFunc = compareFunc;
        }

        static class Deserializer implements JsonDeserializer<BlockstatePredicateParser.ComparisonType> {
            Deserializer() {
            }

            public BlockstatePredicateParser.ComparisonType deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
                if (json.isJsonPrimitive() && json.getAsJsonPrimitive().isString()) {
                    Optional<BlockstatePredicateParser.ComparisonType> type = Arrays.stream(BlockstatePredicateParser.ComparisonType.values()).filter((t) -> {
                        return t.key.equals(json.getAsString());
                    }).findFirst();
                    if (type.isPresent()) {
                        return (BlockstatePredicateParser.ComparisonType) type.get();
                    } else {
                        throw new JsonParseException("" + json + " is not a valid comparison type!");
                    }
                } else {
                    throw new JsonSyntaxException("ComparisonType must be a String");
                }
            }
        }
    }

    private CondRule parseRule(JsonObject crec, TextureWesterosCommon.ConnectionCheck parentConnCheck, List<TextureWesterosCommon.ConnectionCheck> connectionChecks, String defType,
                               int cWidth, int cHeight) {
        CondRule crule = new CondRule();
        crule.type = defType;    // Assume default type matching parent
        if (crec.has("sources")) {
            Preconditions.checkArgument(crec.get("sources").isJsonArray(), "sources must be an array!");
            JsonArray srclist = crec.getAsJsonArray("sources");
            crule.source = new SrcTexture[srclist.size()];
            int i = 0;
            for (JsonElement srec : srclist) {
                JsonObject srcrec = srec.getAsJsonObject();
                SrcTexture stxt = new SrcTexture();
                if (srcrec.has("index")) {
                    Preconditions.checkArgument(srcrec.get("index").isJsonPrimitive() && srcrec.get("index").getAsJsonPrimitive().isNumber(), "index must be a number!");
                    stxt.index = srcrec.get("index").getAsInt();
                }
                if (srcrec.has("row")) {
                    Preconditions.checkArgument(srcrec.get("row").isJsonPrimitive() && srcrec.get("row").getAsJsonPrimitive().isNumber(), "row must be a number!");
                    stxt.row = srcrec.get("row").getAsInt();
                }
                if (srcrec.has("col")) {
                    Preconditions.checkArgument(srcrec.get("col").isJsonPrimitive() && srcrec.get("col").getAsJsonPrimitive().isNumber(), "col must be a number!");
                    stxt.col = srcrec.get("col").getAsInt();
                }
                crule.source[i] = stxt;
                i++;
            }
        }
        if (crec.has("biomeNames")) {
            Preconditions.checkArgument(crec.get("biomeNames").isJsonArray(), "biomeNames must be an array!");
            JsonArray blist = crec.getAsJsonArray("biomeNames");
            crule.biomeNames = new String[blist.size()];
            int i = 0;
            for (JsonElement biome : blist) {
                String bstr = biome.getAsString();
                if (bstr.indexOf(':') < 0) {
                    bstr = "minecraft:" + bstr;
                }
                crule.biomeNames[i] = bstr;
                i++;
            }
        }
        if (crec.has("yPosMin")) {
            Preconditions.checkArgument(crec.get("yPosMin").isJsonPrimitive() && crec.get("yPosMin").getAsJsonPrimitive().isNumber(), "yPosMin must be a number!");
            crule.yPosMin = crec.get("yPosMin").getAsInt();
        }
        if (crec.has("yPosMax")) {
            Preconditions.checkArgument(crec.get("yPosMax").isJsonPrimitive() && crec.get("yPosMax").getAsJsonPrimitive().isNumber(), "yPosMax must be a number!");
            crule.yPosMax = crec.get("yPosMax").getAsInt();
        }
        if (crec.has("isFancy")) {
            Preconditions.checkArgument(crec.get("isFancy").isJsonPrimitive() && crec.get("isFancy").getAsJsonPrimitive().isBoolean(), "isFancy must be a boolean");
            crule.isFancy = crec.get("isFancy").getAsBoolean();
        }
        if (crec.has("type")) {
            Preconditions.checkArgument(crec.get("type").isJsonPrimitive() && crec.get("type").getAsJsonPrimitive().isString(), "type must be a string!");
            crule.type = crec.get("type").getAsString();
            int idx;
            for (idx = 0; (idx < TYPES.length) && (!TYPES[idx].equals(crule.type)); idx++) {
            }
            Preconditions.checkArgument((idx < TYPES.length), "type = " + crule.type + " is not supported!");
        }
        if (crec.has("rowOut")) {
            Preconditions.checkArgument(crec.get("rowOut").isJsonPrimitive() && crec.get("rowOut").getAsJsonPrimitive().isNumber(), "rowOut must be a number!");
            crule.rowOut = crec.get("rowOut").getAsInt();
            Preconditions.checkArgument(crule.rowOut < cHeight, "rowOut must be below condHeight");
        }
        if (crec.has("colOut")) {
            Preconditions.checkArgument(crec.get("colOut").isJsonPrimitive() && crec.get("colOut").getAsJsonPrimitive().isNumber(), "colOut must be a number!");
            crule.colOut = crec.get("colOut").getAsInt();
            Preconditions.checkArgument(crule.colOut < cWidth, "colOut must be below condWidth");
        }
        if (crule.type.equals(TYPE_CTM) || crule.type.equals(TYPE_CTM_PATTERN) || crule.type.equals(TYPE_VERTICAL) || crule.type.equals(TYPE_HORIZONTAL) ||
                crule.type.equals(TYPE_EDGES_FULL) || crule.type.equals(TYPE_OVERLAY)) {
            if (crec.has("ctmRow")) {
                Preconditions.checkArgument(crec.get("ctmRow").isJsonPrimitive() && crec.get("ctmRow").getAsJsonPrimitive().isNumber(), "ctmRow must be a number!");
                crule.rowOut = crec.get("ctmRow").getAsInt();
                Preconditions.checkArgument(crule.rowOut < cHeight, "ctmRow must be below condHeight");
            }
            if (crec.has("ctmCol")) {
                Preconditions.checkArgument(crec.get("ctmCol").isJsonPrimitive() && crec.get("ctmCol").getAsJsonPrimitive().isNumber(), "ctmCol must be a number!");
                crule.colOut = crec.get("ctmCol").getAsInt();
                Preconditions.checkArgument(crule.colOut < cWidth, "ctmCol must be below condWidth");
            }
            if (crule.type.equals(TYPE_CTM) || crule.type.equals(TYPE_CTM_PATTERN)) { // 12x4
                Preconditions.checkArgument((crule.rowOut + 4) <= cHeight, "ctmRow+4 must be below condHeight");
                Preconditions.checkArgument((crule.colOut + 12) <= cWidth, "ctmCol+12 must be below condWidth");
            } else if (crule.type.equals(TYPE_VERTICAL) || crule.type.equals(TYPE_HORIZONTAL)) { // 2x2
                Preconditions.checkArgument((crule.rowOut + 2) <= cHeight, "ctmRow+2 must be below condHeight");
                Preconditions.checkArgument((crule.colOut + 2) <= cWidth, "ctmCol+2 must be below condWidth");
            } else if (crule.type.equals(TYPE_EDGES_FULL)) { // 4x4
                Preconditions.checkArgument((crule.rowOut + 4) <= cHeight, "ctmRow+4 must be below condHeight");
                Preconditions.checkArgument((crule.colOut + 4) <= cWidth, "ctmCol+4 must be below condWidth");
            } else if (crule.type.equals(TYPE_OVERLAY)) {    // 7x3
                Preconditions.checkArgument((crule.rowOut + 3) <= cHeight, "ctmRow+3 must be below condHeight");
                Preconditions.checkArgument((crule.colOut + 7) <= cWidth, "ctmCol+7 must be below condWidth");
            }
        }
        if (crule.type.equals(TYPE_RANDOM)) {
            if (crec.has("rndRow")) {
                Preconditions.checkArgument(crec.get("rndRow").isJsonPrimitive() && crec.get("rndRow").getAsJsonPrimitive().isNumber(), "rndRow must be a number!");
                crule.patRow = crec.get("rndRow").getAsInt();
                Preconditions.checkArgument(crule.patRow < cHeight, "rndRow must be below condHeight");
            }
            if (crec.has("rndCol")) {
                Preconditions.checkArgument(crec.get("rndCol").isJsonPrimitive() && crec.get("rndCol").getAsJsonPrimitive().isNumber(), "rndCol must be a number!");
                crule.patCol = crec.get("rndCol").getAsInt();
                Preconditions.checkArgument(crule.patCol < cWidth, "rndCol must be below condWidth");
            }
            if (crec.has("rndWidth")) {
                Preconditions.checkArgument(crec.get("rndWidth").isJsonPrimitive() && crec.get("rndWidth").getAsJsonPrimitive().isNumber(), "rndWidth must be a number!");
                crule.patWidth = crec.get("rndWidth").getAsInt();
                Preconditions.checkArgument((crule.patCol + crule.patWidth) <= cWidth, "rndRow+rndWidth must be less than or equal to condWidth");
            }
            if (crec.has("rndHeight")) {
                Preconditions.checkArgument(crec.get("rndHeight").isJsonPrimitive() && crec.get("rndHeight").getAsJsonPrimitive().isNumber(), "rndHeight must be a number!");
                crule.patHeight = crec.get("rndHeight").getAsInt();
                Preconditions.checkArgument((crule.patRow + crule.patHeight) <= cHeight, "rndRow+rndHeight must be less than or equal to condHeight");
            }
            if (crec.has("rndOffX")) {
                Preconditions.checkArgument(crec.get("rndOffX").isJsonPrimitive() && crec.get("rndOffX").getAsJsonPrimitive().isNumber(), "rndOffX must be a number!");
                crule.rndOffX = crec.get("rndOffX").getAsInt();
            }
            if (crec.has("rndOffY")) {
                Preconditions.checkArgument(crec.get("rndOffY").isJsonPrimitive() && crec.get("rndOffY").getAsJsonPrimitive().isNumber(), "rndOffY must be a number!");
                crule.rndOffY = crec.get("rndOffY").getAsInt();
            }
            if (crec.has("rndOffZ")) {
                Preconditions.checkArgument(crec.get("rndOffZ").isJsonPrimitive() && crec.get("rndOffZ").getAsJsonPrimitive().isNumber(), "rndOffZ must be a number!");
                crule.rndOffZ = crec.get("rndOffZ").getAsInt();
            }
            if (crec.has("rndSameAllSides")) {
                Preconditions.checkArgument(crec.get("rndSameAllSides").isJsonPrimitive() && crec.get("rndSameAllSides").getAsJsonPrimitive().isBoolean(), "rndSameAllSides must be a boolean!");
                crule.rndSameAllSides = crec.get("rndSameAllSides").getAsBoolean();
            }
            Preconditions.checkArgument((crule.patHeight * crule.patWidth) > 0, "patternWidth and patternHeight must be nonzero!");
            crule.weights = new int[crule.patHeight * crule.patWidth];
            Arrays.fill(crule.weights, 1);
            if (crec.has("weights")) {
                Preconditions.checkArgument(crec.get("weights").isJsonArray(), "weights must be an array!");
                JsonArray blist = crec.getAsJsonArray("weights");
                for (int i = 0; i < crule.weights.length && i < blist.size(); i++) {
                    JsonElement elem = blist.get(i);
                    Preconditions.checkArgument(elem.isJsonPrimitive() && elem.getAsJsonPrimitive().isNumber(), "weights must be numbers!");
                    crule.weights[i] = elem.getAsInt();
                }
            }
            crule.weightTotal = 0;
            for (int i = 0; i < crule.weights.length; i++) {
                crule.weightTotal += crule.weights[i];
            }
        }
        if (crule.type.equals(TYPE_PATTERN) || (crule.type.equals(TYPE_CTM_PATTERN))) {
            if (crec.has("patRow")) {
                Preconditions.checkArgument(crec.get("patRow").isJsonPrimitive() && crec.get("patRow").getAsJsonPrimitive().isNumber(), "patRow must be a number!");
                crule.patRow = crec.get("patRow").getAsInt();
                Preconditions.checkArgument(crule.patRow < cHeight, "patRow must be below condHeight");
            }
            if (crec.has("patCol")) {
                Preconditions.checkArgument(crec.get("patCol").isJsonPrimitive() && crec.get("patCol").getAsJsonPrimitive().isNumber(), "patCol must be a number!");
                crule.patCol = crec.get("patCol").getAsInt();
                Preconditions.checkArgument(crule.patCol < cWidth, "patCol must be below condWidth");
            }
            if (crec.has("patWidth")) {
                Preconditions.checkArgument(crec.get("patWidth").isJsonPrimitive() && crec.get("patWidth").getAsJsonPrimitive().isNumber(), "patWidth must be a number!");
                crule.patWidth = crec.get("patWidth").getAsInt();
                Preconditions.checkArgument((crule.patCol + crule.patWidth) <= cWidth, "patRow+patWidth must be less than or equal to condWidth");
            }
            if (crec.has("patHeight")) {
                Preconditions.checkArgument(crec.get("patHeight").isJsonPrimitive() && crec.get("patHeight").getAsJsonPrimitive().isNumber(), "patHeight must be a number!");
                crule.patHeight = crec.get("patHeight").getAsInt();
                Preconditions.checkArgument((crule.patRow + crule.patHeight) <= cHeight, "patRow+patHeight must be less than or equal to condHeight");
            }
            Preconditions.checkArgument((crule.patHeight * crule.patWidth > 0), "patWidth and patHeight must be nonzero!");
        }
        boolean newConn = false;
        boolean ignoreStates = false;
        BiPredicate<Direction, BlockState> connCheck = null;
        String connect_to_tag = null;
        String connect_to_state = null;
        if (crec.has("ignore_states")) {
            Preconditions.checkArgument(crec.get("ignore_states").isJsonPrimitive() && crec.get("ignore_states").getAsJsonPrimitive().isBoolean(), "ignore_states must be a boolean");
            ignoreStates = crec.get("ignore_states").getAsBoolean();
            newConn = true;
        }
        if (crec.has("connect_to")) {

            connCheck = TextureWesterosCommon.predicateParser.parse(crec.get("connect_to"));
            newConn = true;
        }
        if (crec.has("connect_to_tag")) {
            connect_to_tag = crec.get("connect_to_tag").getAsString();
            newConn = true;
        }
        if (crec.has("connect_to_state")) {
            connect_to_state = crec.get("connect_to_state").getAsString();
            newConn = true;
        }
        if (newConn) {    // If new settings, assign new index
            crule.connCheck = new ConnectionCheck(connectionChecks.size(), ignoreStates, connCheck, connect_to_tag, connect_to_state);
            connectionChecks.add(crule.connCheck);
        } else {
            crule.connCheck = parentConnCheck;
        }
        // If any nested rules
        if (crec.has("conds")) {
            Preconditions.checkArgument(crec.get("conds").isJsonArray(), "conds must be an array!");
            JsonArray clist = crec.getAsJsonArray("conds");
            crule.conds = new CondRule[clist.size()];
            int ruleidx = 0;
            for (JsonElement rec : clist) {
                JsonObject crec2 = rec.getAsJsonObject();
                CondRule crule2 = parseRule(crec2, crule.connCheck, connectionChecks, defType, cWidth, cHeight);
                crule.conds[ruleidx] = crule2;
                ruleidx++;
            }
        }
        return crule;
    }
    static enum Composition {
        AND(Predicate::and),
        OR(Predicate::or);

        private final BiFunction<Predicate<BlockState>, Predicate<BlockState>, Predicate<BlockState>> composer;

        private Composition(BiFunction composer) {
            this.composer = composer;
        }
    }
}


