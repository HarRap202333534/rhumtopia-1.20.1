package com.fal701.block.WoodPlanks;

import com.fal701.Rhumtopia;
import com.fal701.block.Roofing.Roofing;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupWoodPlanks {
    public static final ItemGroup WOODPLANKS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(WoodPlanks.LOCKED_OAK_DOOR))
            .displayName(Text.translatable("itemGroup.westerosblocks.wood_planks"))
            .entries((context, entries) -> {
                entries.add(WoodPlanks.OAK_FENCE_WITH_VINES);
                entries.add(WoodPlanks.SPRUCE_FENCE_WITH_VINES);
                entries.add(WoodPlanks.BIRCH_FENCE_WITH_VINES);
                entries.add(WoodPlanks.JUNGLE_FENCE_WITH_VINES);
                entries.add(WoodPlanks.OAK_FENCE_WITH_GRAPES);
                entries.add(WoodPlanks.SPRUCE_FENCE_WITH_GRAPES);
                entries.add(WoodPlanks.BIRCH_FENCE_WITH_GRAPES);
                entries.add(WoodPlanks.JUNGLE_FENCE_WITH_GRAPES);
                entries.add(WoodPlanks.REINFORCED_OAK_FENCE);
                entries.add(WoodPlanks.PARQUET_FLOOR);
                entries.add(WoodPlanks.WOOD_LADDER);
                entries.add(WoodPlanks.OAK_DOOR);
                entries.add(WoodPlanks.LOCKED_OAK_DOOR);
                entries.add(WoodPlanks.SPRUCE_DOOR);
                entries.add(WoodPlanks.LOCKED_SPRUCE_DOOR);
                entries.add(WoodPlanks.BIRCH_DOOR);
                entries.add(WoodPlanks.LOCKED_BIRCH_DOOR);
                entries.add(WoodPlanks.JUNGLE_DOOR);
                entries.add(WoodPlanks.LOCKED_JUNGLE_DOOR);
                entries.add(WoodPlanks.NORTHERN_WOOD_DOOR);
                entries.add(WoodPlanks.LOCKED_DARK_NORTHERN_WOOD_DOOR);
                entries.add(WoodPlanks.GREY_WOOD_DOOR);
                entries.add(WoodPlanks.LOCKED_GREY_WOOD_DOOR);
                entries.add(WoodPlanks.WHITE_WOOD_DOOR);
                entries.add(WoodPlanks.LOCKED_WHITE_WOOD_DOOR);
                entries.add(WoodPlanks.EYRIE_WEIRWOOD_DOOR);
                entries.add(WoodPlanks.WATTLE_FENCE);
                entries.add(WoodPlanks.WATTLE_FENCE_SHORT);
                entries.add(WoodPlanks.LIGHT_WATTLE_FENCE);
                entries.add(WoodPlanks.LIGHT_WATTLE_FENCE_SHORT);
                entries.add(WoodPlanks.DARK_WATTLE_FENCE);
                entries.add(WoodPlanks.DARK_WATTLE_FENCE_SHORT);
                entries.add(WoodPlanks.OAK_PLANKS);
                entries.add(WoodPlanks.OAK_STAIRS);
                entries.add(WoodPlanks.OAK_SLAB);
                entries.add(WoodPlanks.OAK_WALL);
                entries.add(WoodPlanks.OAK_FENCE);
                entries.add(WoodPlanks.OAK_HOPPER);
                entries.add(WoodPlanks.OAK_TIP);
                entries.add(WoodPlanks.OAK_CARPET);
                entries.add(WoodPlanks.LOCKED_OAK_FENCE_GATE);
                entries.add(WoodPlanks.OAK_COVER);
                entries.add(WoodPlanks.OAK_HALF_DOOR);
                entries.add(WoodPlanks.OAK_TIMBER_WINDOW_FRAME);
                entries.add(WoodPlanks.OAK_TIMBER_WINDOW_FRAME_MULLION);
                entries.add(WoodPlanks.SPRUCE_PLANKS);
                entries.add(WoodPlanks.SPRUCE_STAIRS);
                entries.add(WoodPlanks.SPRUCE_SLAB);
                entries.add(WoodPlanks.SPRUCE_WALL);
                entries.add(WoodPlanks.SPRUCE_FENCE);
                entries.add(WoodPlanks.SPRUCE_HOPPER);
                entries.add(WoodPlanks.SPRUCE_TIP);
                entries.add(WoodPlanks.SPRUCE_CARPET);
                entries.add(WoodPlanks.LOCKED_SPRUCE_FENCE_GATE);
                entries.add(WoodPlanks.SPRUCE_COVER);
                entries.add(WoodPlanks.SPRUCE_HALF_DOOR);
                entries.add(WoodPlanks.SPRUCE_TIMBER_WINDOW_FRAME);
                entries.add(WoodPlanks.SPRUCE_TIMBER_WINDOW_FRAME_MULLION);
                entries.add(WoodPlanks.BIRCH_PLANKS);
                entries.add(WoodPlanks.BIRCH_STAIRS);
                entries.add(WoodPlanks.BIRCH_SLAB);
                entries.add(WoodPlanks.BIRCH_WALL);
                entries.add(WoodPlanks.BIRCH_FENCE);
                entries.add(WoodPlanks.BIRCH_HOPPER);
                entries.add(WoodPlanks.BIRCH_TIP);
                entries.add(WoodPlanks.BIRCH_CARPET);
                entries.add(WoodPlanks.LOCKED_BIRCH_FENCE_GATE);
                entries.add(WoodPlanks.BIRCH_COVER);
                entries.add(WoodPlanks.BIRCH_HALF_DOOR);
                entries.add(WoodPlanks.BIRCH_TIMBER_WINDOW_FRAME);
                entries.add(WoodPlanks.BIRCH_TIMBER_WINDOW_FRAME_MULLION);
                entries.add(WoodPlanks.JUNGLE_PLANKS);
                entries.add(WoodPlanks.JUNGLE_STAIRS);
                entries.add(WoodPlanks.JUNGLE_SLAB);
                entries.add(WoodPlanks.JUNGLE_WALL);
                entries.add(WoodPlanks.JUNGLE_FENCE);
                entries.add(WoodPlanks.JUNGLE_HOPPER);
                entries.add(WoodPlanks.JUNGLE_TIP);
                entries.add(WoodPlanks.JUNGLE_CARPET);
                entries.add(WoodPlanks.LOCKED_JUNGLE_FENCE_GATE);
                entries.add(WoodPlanks.JUNGLE_COVER);
                entries.add(WoodPlanks.JUNGLE_HALF_DOOR);
                entries.add(WoodPlanks.JUNGLE_TIMBER_WINDOW_FRAME);
                entries.add(WoodPlanks.JUNGLE_TIMBER_WINDOW_FRAME_MULLION);
                entries.add(WoodPlanks.DARK_NORTHERN_WOOD);
                entries.add(WoodPlanks.DARK_NORTHERN_WOOD_STAIRS);
                entries.add(WoodPlanks.DARK_NORTHERN_WOOD_SLAB);
                entries.add(WoodPlanks.DARK_NORTHERN_WOOD_WALL);
                entries.add(WoodPlanks.DARK_NORTHERN_WOOD_FENCE);
                entries.add(WoodPlanks.DARK_NORTHERN_WOOD_HOPPER);
                entries.add(WoodPlanks.DARK_NORTHERN_WOOD_TIP);
                entries.add(WoodPlanks.DARK_NORTHERN_WOOD_CARPET);
                entries.add(WoodPlanks.LOCKED_DARK_NORTHERN_WOOD_FENCE_GATE);
                entries.add(WoodPlanks.NORTHERN_WOOD_COVER);
                entries.add(WoodPlanks.DARK_NORTHERN_WOOD_HALF_DOOR);
                entries.add(WoodPlanks.NORTHERN_TIMBER_WINDOW_FRAME);
                entries.add(WoodPlanks.NORTHERN_TIMBER_WINDOW_FRAME_MULLION);
                entries.add(WoodPlanks.BLACK_WOOD);
                entries.add(WoodPlanks.BLACK_WOOD_STAIRS);
                entries.add(WoodPlanks.BLACK_WOOD_SLAB);
                entries.add(WoodPlanks.BLACK_WOOD_WALL);
                entries.add(WoodPlanks.BLACK_WOOD_FENCE);
                entries.add(WoodPlanks.BLACK_WOOD_HOPPER);
                entries.add(WoodPlanks.BLACK_WOOD_TIP);
                entries.add(WoodPlanks.BLACK_WOOD_CARPET);
                entries.add(WoodPlanks.LOCKED_BLACK_WOOD_FENCE_GATE);
                entries.add(WoodPlanks.BLACK_TIMBER_WINDOW_FRAME);
                entries.add(WoodPlanks.BLACK_TIMBER_WINDOW_FRAME_MULLION);
                entries.add(WoodPlanks.BLACK_WOOD_HALF_DOOR);
                entries.add(WoodPlanks.WHITE_WOOD);
                entries.add(WoodPlanks.WHITE_WOOD_STAIRS);
                entries.add(WoodPlanks.WHITE_WOOD_SLAB);
                entries.add(WoodPlanks.WHITE_WOOD_WALL);
                entries.add(WoodPlanks.WHITE_WOOD_TIP);
                entries.add(WoodPlanks.WHITE_WOOD_HOPPER);
                entries.add(WoodPlanks.WHITE_WOOD_FENCE);
                entries.add(WoodPlanks.WHITE_WOOD_CARPET);
                entries.add(WoodPlanks.LOCKED_WHITE_WOOD_FENCE_GATE);
                entries.add(WoodPlanks.WHITE_WOOD_HALF_DOOR);
                entries.add(WoodPlanks.WHITE_TIMBER_WINDOW_FRAME);
                entries.add(WoodPlanks.WHITE_TIMBER_WINDOW_FRAME_MULLION);
                entries.add(WoodPlanks.GREEN_WOOD);
                entries.add(WoodPlanks.GREEN_WOOD_STAIRS);
                entries.add(WoodPlanks.GREEN_WOOD_SLAB);
                entries.add(WoodPlanks.GREEN_WOOD_WALL);
                entries.add(WoodPlanks.GREEN_WOOD_FENCE);
                entries.add(WoodPlanks.GREEN_WOOD_HOPPER);
                entries.add(WoodPlanks.GREEN_WOOD_TIP);
                entries.add(WoodPlanks.GREEN_WOOD_CARPET);
                entries.add(WoodPlanks.LOCKED_GREEN_WOOD_FENCE_GATE);
                entries.add(WoodPlanks.GREEN_TIMBER_WINDOW_FRAME);
                entries.add(WoodPlanks.GREEN_TIMBER_WINDOW_FRAME_MULLION);
                entries.add(WoodPlanks.GREEN_WOOD_HALF_DOOR);
                entries.add(WoodPlanks.GREY_WOOD);
                entries.add(WoodPlanks.GREY_WOOD_STAIRS);
                entries.add(WoodPlanks.GREY_WOOD_SLAB);
                entries.add(WoodPlanks.GREY_WOOD_WALL);
                entries.add(WoodPlanks.GREY_WOOD_FENCE);
                entries.add(WoodPlanks.GREY_WOOD_HOPPER);
                entries.add(WoodPlanks.GREY_WOOD_TIP);
                entries.add(WoodPlanks.GREY_WOOD_CARPET);
                entries.add(WoodPlanks.LOCKED_GREY_WOOD_FENCE_GATE);
                entries.add(WoodPlanks.GREY_TIMBER_WINDOW_FRAME);
                entries.add(WoodPlanks.GREY_TIMBER_WINDOW_FRAME_MULLION);
                entries.add(WoodPlanks.GREY_WOOD_HALF_DOOR);
                entries.add(WoodPlanks.RED_WOOD);
                entries.add(WoodPlanks.RED_WOOD_STAIRS);
                entries.add(WoodPlanks.RED_WOOD_SLAB);
                entries.add(WoodPlanks.RED_WOOD_WALL);
                entries.add(WoodPlanks.RED_WOOD_FENCE);
                entries.add(WoodPlanks.RED_WOOD_HOPPER);
                entries.add(WoodPlanks.RED_WOOD_TIP);
                entries.add(WoodPlanks.RED_WOOD_CARPET);
                entries.add(WoodPlanks.LOCKED_RED_WOOD_FENCE_GATE);
                entries.add(WoodPlanks.RED_WOOD_HALF_DOOR);
                entries.add(WoodPlanks.RED_TIMBER_WINDOW_FRAME);
                entries.add(WoodPlanks.RED_TIMBER_WINDOW_FRAME_MULLION);
                entries.add(WoodPlanks.ORANGE_WOOD);
                entries.add(WoodPlanks.ORANGE_WOOD_STAIRS);
                entries.add(WoodPlanks.ORANGE_WOOD_SLAB);
                entries.add(WoodPlanks.ORANGE_WOOD_WALL);
                entries.add(WoodPlanks.ORANGE_WOOD_FENCE);
                entries.add(WoodPlanks.ORANGE_WOOD_HOPPER);
                entries.add(WoodPlanks.ORANGE_WOOD_TIP);
                entries.add(WoodPlanks.ORANGE_WOOD_CARPET);
                entries.add(WoodPlanks.LOCKED_ORANGE_WOOD_FENCE_GATE);
                entries.add(WoodPlanks.ORANGE_WOOD_HALF_DOOR);
                entries.add(WoodPlanks.ORANGE_TIMBER_WINDOW_FRAME);
                entries.add(WoodPlanks.ORANGE_TIMBER_WINDOW_FRAME_MULLION);
                entries.add(WoodPlanks.YELLOW_WOOD);
                entries.add(WoodPlanks.YELLOW_WOOD_STAIRS);
                entries.add(WoodPlanks.YELLOW_WOOD_SLAB);
                entries.add(WoodPlanks.YELLOW_WOOD_WALL);
                entries.add(WoodPlanks.YELLOW_WOOD_FENCE);
                entries.add(WoodPlanks.YELLOW_WOOD_HOPPER);
                entries.add(WoodPlanks.YELLOW_WOOD_TIP);
                entries.add(WoodPlanks.YELLOW_WOOD_CARPET);
                entries.add(WoodPlanks.LOCKED_YELLOW_WOOD_FENCE_GATE);
                entries.add(WoodPlanks.YELLOW_WOOD_HALF_DOOR);
                entries.add(WoodPlanks.YELLOW_TIMBER_WINDOW_FRAME);
                entries.add(WoodPlanks.YELLOW_TIMBER_WINDOW_FRAME_MULLION);
                entries.add(WoodPlanks.BLUE_WOOD);
                entries.add(WoodPlanks.BLUE_WOOD_STAIRS);
                entries.add(WoodPlanks.BLUE_WOOD_SLAB);
                entries.add(WoodPlanks.BLUE_WOOD_WALL);
                entries.add(WoodPlanks.BLUE_WOOD_FENCE);
                entries.add(WoodPlanks.BLUE_WOOD_HOPPER);
                entries.add(WoodPlanks.BLUE_WOOD_TIP);
                entries.add(WoodPlanks.BLUE_WOOD_CARPET);
                entries.add(WoodPlanks.LOCKED_BLUE_WOOD_FENCE_GATE);
                entries.add(WoodPlanks.BLUE_WOOD_HALF_DOOR);
                entries.add(WoodPlanks.BLUE_TIMBER_WINDOW_FRAME);
                entries.add(WoodPlanks.BLUE_TIMBER_WINDOW_FRAME_MULLION);
                entries.add(WoodPlanks.PURPLE_WOOD);
                entries.add(WoodPlanks.PURPLE_WOOD_STAIRS);
                entries.add(WoodPlanks.PURPLE_WOOD_SLAB);
                entries.add(WoodPlanks.PURPLE_WOOD_WALL);
                entries.add(WoodPlanks.PURPLE_WOOD_FENCE);
                entries.add(WoodPlanks.PURPLE_WOOD_HOPPER);
                entries.add(WoodPlanks.PURPLE_WOOD_TIP);
                entries.add(WoodPlanks.PURPLE_WOOD_CARPET);
                entries.add(WoodPlanks.LOCKED_PURPLE_WOOD_FENCE_GATE);
                entries.add(WoodPlanks.PURPLE_WOOD_HALF_DOOR);
                entries.add(WoodPlanks.PURPLE_TIMBER_WINDOW_FRAME);
                entries.add(WoodPlanks.PURPLE_TIMBER_WINDOW_FRAME_MULLION);
                entries.add(WoodPlanks.OAK_VERTICAL_PLANKS);
                entries.add(WoodPlanks.OAK_VERTICAL_PLANKS_STAIRS);
                entries.add(WoodPlanks.OAK_VERTICAL_PLANKS_SLAB);
                entries.add(WoodPlanks.OAK_VERTICAL_PLANKS_WALL);
                entries.add(WoodPlanks.OAK_VERTICAL_PLANKS_FENCE);
                entries.add(WoodPlanks.OAK_VERTICAL_PLANKS_HOPPER);
                entries.add(WoodPlanks.OAK_VERTICAL_PLANKS_TIP);
                entries.add(WoodPlanks.OAK_VERTICAL_PLANKS_CARPET);
                entries.add(WoodPlanks.SPRUCE_VERTICAL_PLANKS);
                entries.add(WoodPlanks.SPRUCE_VERTICAL_PLANKS_STAIRS);
                entries.add(WoodPlanks.SPRUCE_VERTICAL_PLANKS_SLAB);
                entries.add(WoodPlanks.SPRUCE_VERTICAL_PLANKS_WALL);
                entries.add(WoodPlanks.SPRUCE_VERTICAL_PLANKS_FENCE);
                entries.add(WoodPlanks.SPRUCE_VERTICAL_PLANKS_HOPPER);
                entries.add(WoodPlanks.SPRUCE_VERTICAL_PLANKS_TIP);
                entries.add(WoodPlanks.SPRUCE_VERTICAL_PLANKS_CARPET);
                entries.add(WoodPlanks.BIRCH_VERTICAL_PLANKS);
                entries.add(WoodPlanks.BIRCH_VERTICAL_PLANKS_STAIRS);
                entries.add(WoodPlanks.BIRCH_VERTICAL_PLANKS_SLAB);
                entries.add(WoodPlanks.BIRCH_VERTICAL_PLANKS_WALL);
                entries.add(WoodPlanks.BIRCH_VERTICAL_PLANKS_FENCE);
                entries.add(WoodPlanks.BIRCH_VERTICAL_PLANKS_HOPPER);
                entries.add(WoodPlanks.BIRCH_VERTICAL_PLANKS_TIP);
                entries.add(WoodPlanks.BIRCH_VERTICAL_PLANKS_CARPET);
                entries.add(WoodPlanks.JUNGLE_VERTICAL_PLANKS);
                entries.add(WoodPlanks.JUNGLE_VERTICAL_PLANKS_STAIRS);
                entries.add(WoodPlanks.JUNGLE_VERTICAL_PLANKS_SLAB);
                entries.add(WoodPlanks.JUNGLE_VERTICAL_PLANKS_WALL);
                entries.add(WoodPlanks.JUNGLE_VERTICAL_PLANKS_FENCE);
                entries.add(WoodPlanks.JUNGLE_VERTICAL_PLANKS_HOPPER);
                entries.add(WoodPlanks.JUNGLE_VERTICAL_PLANKS_TIP);
                entries.add(WoodPlanks.JUNGLE_VERTICAL_PLANKS_CARPET);
                entries.add(WoodPlanks.DARK_NORTHERN_WOOD_VERTICAL_PLANKS);
                entries.add(WoodPlanks.DARK_NORTHERN_WOOD_VERTICAL_PLANKS_STAIRS);
                entries.add(WoodPlanks.DARK_NORTHERN_WOOD_VERTICAL_PLANKS_SLAB);
                entries.add(WoodPlanks.DARK_NORTHERN_WOOD_VERTICAL_PLANKS_WALL);
                entries.add(WoodPlanks.DARK_NORTHERN_WOOD_VERTICAL_PLANKS_FENCE);
                entries.add(WoodPlanks.DARK_NORTHERN_WOOD_VERTICAL_PLANKS_HOPPER);
                entries.add(WoodPlanks.DARK_NORTHERN_WOOD_VERTICAL_PLANKS_TIP);
                entries.add(WoodPlanks.DARK_NORTHERN_WOOD_VERTICAL_PLANKS_CARPET);
                entries.add(WoodPlanks.BLACK_WOOD_VERTICAL_PLANKS);
                entries.add(WoodPlanks.BLACK_WOOD_VERTICAL_PLANKS_STAIRS);
                entries.add(WoodPlanks.BLACK_WOOD_VERTICAL_PLANKS_SLAB);
                entries.add(WoodPlanks.BLACK_WOOD_VERTICAL_PLANKS_WALL);
                entries.add(WoodPlanks.BLACK_WOOD_VERTICAL_PLANKS_FENCE);
                entries.add(WoodPlanks.BLACK_WOOD_VERTICAL_PLANKS_HOPPER);
                entries.add(WoodPlanks.BLACK_WOOD_VERTICAL_PLANKS_TIP);
                entries.add(WoodPlanks.BLACK_WOOD_VERTICAL_PLANKS_CARPET);
                entries.add(WoodPlanks.GREY_WOOD_VERTICAL_PLANKS);
                entries.add(WoodPlanks.GREY_WOOD_VERTICAL_PLANKS_STAIRS);
                entries.add(WoodPlanks.GREY_WOOD_VERTICAL_PLANKS_SLAB);
                entries.add(WoodPlanks.GREY_WOOD_VERTICAL_PLANKS_WALL);
                entries.add(WoodPlanks.GREY_WOOD_VERTICAL_PLANKS_FENCE);
                entries.add(WoodPlanks.GREY_WOOD_VERTICAL_PLANKS_HOPPER);
                entries.add(WoodPlanks.GREY_WOOD_VERTICAL_PLANKS_TIP);
                entries.add(WoodPlanks.GREY_WOOD_VERTICAL_PLANKS_CARPET);
                entries.add(WoodPlanks.WHITE_WOOD_VERTICAL_PLANKS);
                entries.add(WoodPlanks.WHITE_WOOD_VERTICAL_PLANKS_STAIRS);
                entries.add(WoodPlanks.WHITE_WOOD_VERTICAL_PLANKS_SLAB);
                entries.add(WoodPlanks.WHITE_WOOD_VERTICAL_PLANKS_WALL);
                entries.add(WoodPlanks.WHITE_WOOD_VERTICAL_PLANKS_FENCE);
                entries.add(WoodPlanks.WHITE_WOOD_VERTICAL_PLANKS_HOPPER);
                entries.add(WoodPlanks.WHITE_WOOD_VERTICAL_PLANKS_TIP);
                entries.add(WoodPlanks.WHITE_WOOD_VERTICAL_PLANKS_CARPET);
                entries.add(WoodPlanks.RED_WOOD_VERTICAL_PLANKS);
                entries.add(WoodPlanks.RED_WOOD_VERTICAL_PLANKS_STAIRS);
                entries.add(WoodPlanks.RED_WOOD_VERTICAL_PLANKS_SLAB);
                entries.add(WoodPlanks.RED_WOOD_VERTICAL_PLANKS_WALL);
                entries.add(WoodPlanks.RED_WOOD_VERTICAL_PLANKS_FENCE);
                entries.add(WoodPlanks.RED_WOOD_VERTICAL_PLANKS_HOPPER);
                entries.add(WoodPlanks.RED_WOOD_VERTICAL_PLANKS_TIP);
                entries.add(WoodPlanks.RED_WOOD_VERTICAL_PLANKS_CARPET);
                entries.add(WoodPlanks.ORANGE_WOOD_VERTICAL_PLANKS);
                entries.add(WoodPlanks.ORANGE_WOOD_VERTICAL_PLANKS_STAIRS);
                entries.add(WoodPlanks.ORANGE_WOOD_VERTICAL_PLANKS_SLAB);
                entries.add(WoodPlanks.ORANGE_WOOD_VERTICAL_PLANKS_WALL);
                entries.add(WoodPlanks.ORANGE_WOOD_VERTICAL_PLANKS_FENCE);
                entries.add(WoodPlanks.ORANGE_WOOD_VERTICAL_PLANKS_HOPPER);
                entries.add(WoodPlanks.ORANGE_WOOD_VERTICAL_PLANKS_TIP);
                entries.add(WoodPlanks.ORANGE_WOOD_VERTICAL_PLANKS_CARPET);
                entries.add(WoodPlanks.YELLOW_WOOD_VERTICAL_PLANKS);
                entries.add(WoodPlanks.YELLOW_WOOD_VERTICAL_PLANKS_STAIRS);
                entries.add(WoodPlanks.YELLOW_WOOD_VERTICAL_PLANKS_SLAB);
                entries.add(WoodPlanks.YELLOW_WOOD_VERTICAL_PLANKS_WALL);
                entries.add(WoodPlanks.YELLOW_WOOD_VERTICAL_PLANKS_FENCE);
                entries.add(WoodPlanks.YELLOW_WOOD_VERTICAL_PLANKS_HOPPER);
                entries.add(WoodPlanks.YELLOW_WOOD_VERTICAL_PLANKS_TIP);
                entries.add(WoodPlanks.YELLOW_WOOD_VERTICAL_PLANKS_CARPET);
                entries.add(WoodPlanks.GREEN_WOOD_VERTICAL_PLANKS);
                entries.add(WoodPlanks.GREEN_WOOD_VERTICAL_PLANKS_STAIRS);
                entries.add(WoodPlanks.GREEN_WOOD_VERTICAL_PLANKS_SLAB);
                entries.add(WoodPlanks.GREEN_WOOD_VERTICAL_PLANKS_WALL);
                entries.add(WoodPlanks.GREEN_WOOD_VERTICAL_PLANKS_FENCE);
                entries.add(WoodPlanks.GREEN_WOOD_VERTICAL_PLANKS_HOPPER);
                entries.add(WoodPlanks.GREEN_WOOD_VERTICAL_PLANKS_TIP);
                entries.add(WoodPlanks.GREEN_WOOD_VERTICAL_PLANKS_CARPET);
                entries.add(WoodPlanks.BLUE_WOOD_VERTICAL_PLANKS);
                entries.add(WoodPlanks.BLUE_WOOD_VERTICAL_PLANKS_STAIRS);
                entries.add(WoodPlanks.BLUE_WOOD_VERTICAL_PLANKS_SLAB);
                entries.add(WoodPlanks.BLUE_WOOD_VERTICAL_PLANKS_WALL);
                entries.add(WoodPlanks.BLUE_WOOD_VERTICAL_PLANKS_FENCE);
                entries.add(WoodPlanks.BLUE_WOOD_VERTICAL_PLANKS_HOPPER);
                entries.add(WoodPlanks.BLUE_WOOD_VERTICAL_PLANKS_TIP);
                entries.add(WoodPlanks.BLUE_WOOD_VERTICAL_PLANKS_CARPET);
                entries.add(WoodPlanks.PURPLE_WOOD_VERTICAL_PLANKS);
                entries.add(WoodPlanks.PURPLE_WOOD_VERTICAL_PLANKS_STAIRS);
                entries.add(WoodPlanks.PURPLE_WOOD_VERTICAL_PLANKS_SLAB);
                entries.add(WoodPlanks.PURPLE_WOOD_VERTICAL_PLANKS_WALL);
                entries.add(WoodPlanks.PURPLE_WOOD_VERTICAL_PLANKS_FENCE);
                entries.add(WoodPlanks.PURPLE_WOOD_VERTICAL_PLANKS_HOPPER);
                entries.add(WoodPlanks.PURPLE_WOOD_VERTICAL_PLANKS_TIP);
                entries.add(WoodPlanks.PURPLE_WOOD_VERTICAL_PLANKS_CARPET);

            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "wood_planks"), WOODPLANKS);
    }
}
