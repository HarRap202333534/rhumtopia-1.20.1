package com.fal701.block.Brick;

import com.fal701.Rhumtopia;
import com.fal701.block.Z_custom.WcArrowSlit;
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

public class Brick {
    public static final Block ORANGE_BRICK_ROWLOCK = registerBlock("orange_brick_rowlock", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ORANGE_BRICK_DENTIL = registerBlock("orange_brick_dentil", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ORANGE_BRICK_ARCH_SINGLE = registerBlock("orange_brick_arch_single", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ORANGE_BRICK_ARCH_DOUBLE = registerBlock("orange_brick_arch_double", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SOUTHERN_BRICK_LINTEL = registerBlock("southern_brick_lintel", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SOUTHERN_BRICK_ARCH = registerBlock("southern_brick_arch", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SOUTHERN_BRICK_ARCH_FLAT = registerBlock("southern_brick_arch_flat", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ORANGE_BRICKS = registerBlock("small_orange_bricks", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ORANGE_BRICK_STAIRS = registerBlock("small_orange_brick_stairs", new WcStairs(SMALL_ORANGE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ORANGE_BRICK_SLAB = registerBlock("small_orange_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ORANGE_BRICK_WALL = registerBlock("small_orange_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ORANGE_BRICK_FENCE = registerBlock("small_orange_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ORANGE_BRICK_HOPPER = registerBlock("small_orange_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ORANGE_BRICK_TIP = registerBlock("small_orange_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ORANGE_BRICK_ARROW_SLIT = registerBlock("small_orange_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ORANGE_BRICK_ARROW_SLIT_WINDOW = registerBlock("small_orange_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ORANGE_BRICK_ARROW_SLIT_ORNATE = registerBlock("small_orange_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ORANGE_BRICK = registerBlock("orange_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BRICK_STAIRS = registerBlock("brick_stairs", new WcStairs(ORANGE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ORANGE_BRICK_SLAB = registerBlock("orange_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ORANGE_BRICK_WALL = registerBlock("orange_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ORANGE_BRICK_FENCE = registerBlock("orange_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ORANGE_BRICK_HOPPER = registerBlock("orange_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ORANGE_BRICK_TIP = registerBlock("orange_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_ORANGE_BRICK = registerBlock("dark_orange_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_ORANGE_BRICK_STAIRS = registerBlock("dark_orange_brick_stairs", new WcStairs(DARK_ORANGE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_ORANGE_BRICK_SLAB = registerBlock("dark_orange_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_ORANGE_BRICK_WALL = registerBlock("dark_orange_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_ORANGE_BRICK_FENCE = registerBlock("dark_orange_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_ORANGE_BRICK_HOPPER = registerBlock("dark_orange_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_ORANGE_BRICK_TIP = registerBlock("dark_orange_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SOUTHERN_BRICK = registerBlock("southern_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SOUTHERN_BRICK_STAIRS = registerBlock("southern_brick_stairs", new WcStairs(SOUTHERN_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SOUTHERN_BRICK_SLAB = registerBlock("southern_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SOUTHERN_BRICK_WALL = registerBlock("southern_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SOUTHERN_BRICK_FENCE = registerBlock("southern_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SOUTHERN_BRICK_HOPPER = registerBlock("southern_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SOUTHERN_BRICK_TIP = registerBlock("southern_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SOUTHERN_BRICK_ARROW_SLIT = registerBlock("southern_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SOUTHERN_BRICK_ARROW_SLIT_WINDOW = registerBlock("southern_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SOUTHERN_BRICK_ARROW_SLIT_ORNATE = registerBlock("southern_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ROUGH_SOUTHERN_BRICK = registerBlock("rough_southern_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ROUGH_SOUTHERN_BRICK_STAIRS = registerBlock("rough_southern_brick_stairs", new WcStairs(ROUGH_SOUTHERN_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ROUGH_SOUTHERN_BRICK_SLAB = registerBlock("rough_southern_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ROUGH_SOUTHERN_BRICK_WALL = registerBlock("rough_southern_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ROUGH_SOUTHERN_BRICK_FENCE = registerBlock("rough_southern_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ROUGH_SOUTHERN_BRICK_HOPPER = registerBlock("rough_southern_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ROUGH_SOUTHERN_BRICK_TIP = registerBlock("rough_southern_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_SOUTHERN_BRICK = registerBlock("dark_southern_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_SOUTHERN_BRICK_STAIRS = registerBlock("dark_southern_brick_stairs", new WcStairs(DARK_SOUTHERN_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_SOUTHERN_BRICK_SLAB = registerBlock("dark_southern_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_SOUTHERN_BRICK_WALL = registerBlock("dark_southern_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_SOUTHERN_BRICK_FENCE = registerBlock("dark_southern_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_SOUTHERN_BRICK_HOPPER = registerBlock("dark_southern_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_SOUTHERN_BRICK_TIP = registerBlock("dark_southern_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

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
