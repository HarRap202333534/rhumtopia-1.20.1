package com.fal701.block.Roofing;

import com.fal701.Rhumtopia;
import com.fal701.block.Z_custom.WcFence;
import com.fal701.block.Z_custom.WcHopper;
import com.fal701.block.Z_custom.WcHopperU;
import com.fal701.block.Z_custom.WcStairs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Roofing {
    public static final Block BLACK_SLATE = registerBlock("black_slate", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_SLATE_STAIRS = registerBlock("black_slate_stairs", new WcStairs(BLACK_SLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_SLATE_SLAB = registerBlock("black_slate_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_SLATE_WALL = registerBlock("black_slate_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_SLATE_FENCE = registerBlock("black_slate_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_SLATE_HOPPER = registerBlock("black_slate_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_SLATE_TIP = registerBlock("black_slate_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block BLUE_SLATE = registerBlock("blue_slate", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLUE_SLATE_STAIRS = registerBlock("blue_slate_stairs", new WcStairs(BLUE_SLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLUE_SLATE_SLAB = registerBlock("blue_slate_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLUE_SLATE_WALL = registerBlock("blue_slate_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLUE_SLATE_FENCE = registerBlock("blue_slate_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLUE_SLATE_HOPPER = registerBlock("blue_slate_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLUE_SLATE_TIP = registerBlock("blue_slate_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block RED_SLATE = registerBlock("red_slate", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RED_SLATE_STAIRS = registerBlock("red_slate_stairs", new WcStairs(RED_SLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RED_SLATE_SLAB = registerBlock("red_slate_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RED_SLATE_WALL = registerBlock("red_slate_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RED_SLATE_FENCE = registerBlock("red_slate_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RED_SLATE_HOPPER = registerBlock("red_slate_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RED_SLATE_TIP = registerBlock("red_slate_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block BROWN_SLATE = registerBlock("brown_slate", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_SLATE_STAIRS = registerBlock("brown_slate_stairs", new WcStairs(BROWN_SLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_SLATE_SLAB = registerBlock("brown_slate_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_SLATE_WALL = registerBlock("brown_slate_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_SLATE_FENCE = registerBlock("brown_slate_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_SLATE_HOPPER = registerBlock("brown_slate_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_SLATE_TIP = registerBlock("brown_slate_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block GREEN_SLATE = registerBlock("green_slate", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREEN_SLATE_STAIRS = registerBlock("green_slate_stairs", new WcStairs(GREEN_SLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREEN_SLATE_SLAB = registerBlock("green_slate_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREEN_SLATE_WALL = registerBlock("green_slate_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREEN_SLATE_FENCE = registerBlock("green_slate_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREEN_SLATE_HOPPER = registerBlock("green_slate_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREEN_SLATE_TIP = registerBlock("green_slate_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block ORANGE_SLATE = registerBlock("orange_slate", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ORANGE_SLATE_STAIRS = registerBlock("orange_slate_stairs", new WcStairs(ORANGE_SLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ORANGE_SLATE_SLAB = registerBlock("orange_slate_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ORANGE_SLATE_WALL = registerBlock("orange_slate_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ORANGE_SLATE_FENCE = registerBlock("orange_slate_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ORANGE_SLATE_HOPPER = registerBlock("orange_slate_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ORANGE_SLATE_TIP = registerBlock("orange_slate_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block REDORANGE_SLATE = registerBlock("redorange_slate", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REDORANGE_SLATE_STAIRS = registerBlock("redorange_slate_stairs", new WcStairs(REDORANGE_SLATE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REDORANGE_SLATE_SLAB = registerBlock("redorange_slate_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REDORANGE_SLATE_WALL = registerBlock("redorange_slate_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REDORANGE_SLATE_FENCE = registerBlock("redorange_slate_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REDORANGE_SLATE_HOPPER = registerBlock("redorange_slate_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REDORANGE_SLATE_TIP = registerBlock("redorange_slate_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block THATCH_LIGHT_FUR = registerBlock("thatch_light_fur", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block THATCH_LIGHT_FUR_STAIRS = registerBlock("thatch_light_fur_stairs", new WcStairs(THATCH_LIGHT_FUR.getDefaultState(), FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block THATCH_LIGHT_FUR_SLAB = registerBlock("thatch_light_fur_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block THATCH_LIGHT_WALL = registerBlock("thatch_light_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block THATCH_LIGHT_FUR_FENCE = registerBlock("thatch_light_fur_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block THATCH_LIGHT_FUR_TIP = registerBlock("thatch_light_fur_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block THATCH_LIGHT_FUR_CARPET = registerBlock("thatch_light_fur_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));

    public static final Block THATCH_DARK_FUR = registerBlock("thatch_dark_fur", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block THATCH_DARK_FUR_STAIRS = registerBlock("thatch_dark_fur_stairs", new WcStairs(THATCH_DARK_FUR.getDefaultState(), FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block THATCH_DARK_FUR_SLAB = registerBlock("thatch_dark_fur_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block THATCH_DARK_WALL = registerBlock("thatch_dark_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block THATCH_DARK_FUR_FENCE = registerBlock("thatch_dark_fur_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block THATCH_DARK_FUR_TIP = registerBlock("thatch_dark_fur_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block THATCH_DARK_FUR_CARPET = registerBlock("thatch_dark_fur_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));

    public static final Block SNOWY_THATCH_LIGHT_FUR = registerBlock("snowy_thatch_light_fur", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block SNOWY_THATCH_LIGHT_FUR_STAIRS = registerBlock("snowy_thatch_light_fur_stairs", new WcStairs(SNOWY_THATCH_LIGHT_FUR.getDefaultState(), FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block SNOWY_THATCH_LIGHT_FUR_SLAB = registerBlock("snowy_thatch_light_fur_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block SNOWY_THATCH_LIGHT_WALL = registerBlock("snowy_thatch_light_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block SNOWY_THATCH_LIGHT_FUR_FENCE = registerBlock("snowy_thatch_light_fur_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block SNOWY_THATCH_LIGHT_FUR_TIP = registerBlock("snowy_thatch_light_fur_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block SNOWY_THATCH_LIGHT_FUR_CARPET = registerBlock("snowy_thatch_light_fur_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block SNOWY_THATCH_LIGHT_FUR2 = registerBlock("snowy_thatch_light_fur2", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));

    public static final Block SNOWY_THATCH_DARK_FUR = registerBlock("snowy_thatch_dark_fur", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block SNOWY_THATCH_DARK_FUR_STAIRS = registerBlock("snowy_thatch_dark_fur_stairs", new WcStairs(SNOWY_THATCH_DARK_FUR.getDefaultState(), FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block SNOWY_THATCH_DARK_FUR_SLAB = registerBlock("snowy_thatch_dark_fur_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block SNOWY_THATCH_DARK_WALL = registerBlock("snowy_thatch_dark_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block SNOWY_THATCH_DARK_FUR_FENCE = registerBlock("snowy_thatch_dark_fur_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block SNOWY_THATCH_DARK_FUR_TIP = registerBlock("snowy_thatch_dark_fur_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block SNOWY_THATCH_DARK_FUR_CARPET = registerBlock("snowy_thatch_dark_fur_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));
    public static final Block SNOWY_THATCH_DARK_FUR2 = registerBlock("snowy_thatch_dark_fur2", new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Rhumtopia.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Rhumtopia.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {

    }
}
