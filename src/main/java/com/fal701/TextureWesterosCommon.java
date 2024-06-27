package com.fal701;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.render.model.BakedQuad;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.state.property.Property;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;
import team.chisel.ctm.api.texture.ITextureContext;
import team.chisel.ctm.api.texture.ITextureType;
import team.chisel.ctm.api.util.TextureInfo;
import team.chisel.ctm.client.texture.render.AbstractTexture;
import team.chisel.ctm.client.util.BlockstatePredicateParser;
import team.chisel.ctm.client.util.ParseUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;

public class TextureWesterosCommon<T extends ITextureType> extends AbstractTexture implements ITextureWesterosCompactedIndex {
    public final WesterosConditionHandler handler;
    public int compactedDims[];	// (width << 24) | (height << 16) | lastoffset

    private static final int COMPACT_LASTOFF_MASK = 0xFFFF;
    private static final int COMPACT_WIDTH_MASK = 0xFF000000;
    private static final int COMPACT_WIDTH_SHIFT = 24;
    private static final int COMPACT_HEIGHT_MASK = 0x00FF0000;
    private static final int COMPACT_HEIGHT_SHIFT = 16;
    public static final int getLastOffset(int dim) { return dim & COMPACT_LASTOFF_MASK; }
    public static final int getWidth(int dim) { return (dim & COMPACT_WIDTH_MASK) >> COMPACT_WIDTH_SHIFT; }
    public static final int getHeight(int dim) { return (dim & COMPACT_HEIGHT_MASK) >> COMPACT_HEIGHT_SHIFT; }
    public static final int makeDim(int width, int height, int prevLastOff) {
        return (width << COMPACT_WIDTH_SHIFT) + (height << COMPACT_HEIGHT_SHIFT) +
                (prevLastOff + (width * height));
    }
    // Compacted row/col encoding
    public static final int getCol(int dim) { return (dim & COMPACT_WIDTH_MASK) >> COMPACT_WIDTH_SHIFT; }
    public static final int getRow(int dim) { return (dim & COMPACT_HEIGHT_MASK) >> COMPACT_HEIGHT_SHIFT; }
    public static final int makeRowCol(int row, int col) {
        return (col << COMPACT_WIDTH_SHIFT) + (row << COMPACT_HEIGHT_SHIFT);
    }
    public static final BlockstatePredicateParser predicateParser = new BlockstatePredicateParser();

    public static class ConnectionCheck implements ITextureWesterosConnectTo {
        private final boolean ignoreStates;
        private final TagKey<Block> connTag;
        private final String connState;
        public final int connIndex;
        private ConnectToFunction func;
        @Nullable
        private final BiPredicate<Direction, BlockState> connectionChecks;
        public ConnectionCheck(int connIndex, boolean ignore, BiPredicate<Direction, BlockState> conncheck, String connTag, String connState) {
            this.connIndex = connIndex;
            this.ignoreStates = ignore;
            this.connectionChecks = conncheck;
            this.connState = connState;
            TagKey<Block> ct = null;
            if (connTag != null) {
                String[] parts = connTag.split(":");
                Identifier loc;
                if (parts.length == 2) {
                    loc = new Identifier(parts[0], parts[1]);
                }
                else {
                    loc = new Identifier("minecraft", parts[0]);
                }
                ct = TagKey.of(RegistryKeys.BLOCK, loc);
            }
            this.connTag = ct;
            if (connectionChecks != null) {
                func = (from, to, dir) -> connectionChecks.test(dir, to);
            }
            else if (connTag != null && connState != null) {
                func = (from, to, dir) -> {
                    Property<?> p = from.getBlock().getStateManager().getProperty(this.connState);
                    if (p == null || !from.contains(p) || !to.contains(p))
                        return false;
                    return (from.isIn(ConnectionCheck.this.connTag) && to.isIn(ConnectionCheck.this.connTag) && from.get(p).equals(to.get(p)));
                };
            }
            else if (connTag != null) {
                func = (from, to, dir) -> from.isIn(ConnectionCheck.this.connTag) && to.isIn(ConnectionCheck.this.connTag);
            }
            else if (connState != null) {
                func = (from, to, dir) -> {
                    Property<?> p = from.getBlock().getStateManager().getProperty(this.connState);
                    if (p == null || !from.contains(p) || !to.contains(p))
                        return false;
                    return (from.getBlock() == to.getBlock() && from.get(p).equals(to.get(p)));
                };
            }
            else if (this.ignoreStates) {
                func = (from, to, dir) -> from.getBlock() == to.getBlock();
            }
            else {
                func = (from, to, dir) -> from == to;
            }
        }

        public boolean connectTo(BlockState from, BlockState to, Direction dir) {
            try {
                return func.apply(from, to, dir);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public List<ConnectionCheck> connectionChecks = new ArrayList<ConnectionCheck>();

    public TextureWesterosCommon(ITextureType type, TextureInfo info, final int[] compactedDims, boolean conds, String defType, int defWidth, int defHeight) {
        super(type, info);
        // Set up base connection check
        Optional<JsonObject> infoobj = info.getInfo();
        boolean ignoreStates = infoobj.flatMap(obj -> ParseUtils.getBoolean(obj, "ignore_states")).orElse(false);
        String connect_to_tag = infoobj.flatMap(obj -> get(obj, "connect_to_tag")).orElse(null);
        String connect_to_state = infoobj.flatMap(obj -> getString(obj, "connect_to_state")).orElse(null);
        BiPredicate<Direction, BlockState> connChecks = info.getInfo().map(obj -> predicateParser.parse(obj.get("connect_to"))).orElse(null);
        // Add as base connection check
        connectionChecks.add(new ConnectionCheck(0, ignoreStates, connChecks, connect_to_tag, connect_to_state));

        if (conds) {
            this.handler = new WesterosConditionHandler(info, compactedDims.length, connectionChecks, defType, defWidth, defHeight);
        }
        else {
            this.handler = null;
        }
        computeCompactedDims(compactedDims, conds);
    }

    @Override
    public int getTextureIndexFromCompacted(int compacted) {
        return 0;
    }

    @Override
    public int getRowFromCompactedIndex(int compacted, int textureIdx) {
        return 0;
    }

    @Override
    public int getColumnFromCompactedIndex(int compacted, int textureIdx) {
        return 0;
    }

    @Override
    public int getCompactedIndexFromTextureRowColumn(int textureIndex, int row, int column) {
        return 0;
    }

    @Override
    public List<TextureWesterosCommon.ConnectionCheck> getConnectionChecks() {
        return null;
    }

    @Override
    public List<net.minecraft.client.render.model.BakedQuad> transformQuad(net.minecraft.client.render.model.BakedQuad bakedQuad, ITextureContext iTextureContext, int i) {
        BakedQuad bq = null;
        if (iTextureContext == null) {
            // Default to unmodified base image
            bq = defaultTexture(quad, context);
        }
        else {
            bq = getQuad(quad, context);
        }
        return (bq == null) ? Lists.newArrayList() : Lists.newArrayList(bq);
    }

    public static Optional<String> getString(JsonElement element) {
        if (element.isJsonPrimitive() && element.getAsJsonPrimitive().isString()) {
            return Optional.of(element.getAsString());
        }
        return Optional.empty();
    }

    public static Optional<String> getString(JsonObject object, String memberName) {
        if (object.has(memberName)) {
            return getString(object.get(memberName));
        }
        return Optional.empty();
    }
}
