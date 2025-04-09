package com.fal701.block.Metal;

import com.fal701.Rhumtopia;
import com.fal701.block.Z_custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Metal {
    public static final Block VERTICAL_CHAIN = registerBlock("vertical_chain", new Block(FabricBlockSettings.copyOf(Blocks.CHAIN).nonOpaque().noCollision()));
    public static final Block HORIZONTAL_CHAIN = registerBlock("horizontal_chain", new WcRail(false, FabricBlockSettings.copyOf(Blocks.CHAIN).nonOpaque().noCollision()));
    public static final Block IRON_RUNGS = registerBlock("iron_rungs", new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).nonOpaque()));
    public static final Block IRON_RUNGS_BROKEN = registerBlock("iron_rungs_broken", new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).nonOpaque()));

    public static final Block CHAIN_BLOCK_HARNESS = registerBlock("chain_block_harness", new Block(FabricBlockSettings.copyOf(Blocks.CHAIN).nonOpaque().noCollision()));
    public static final Block IRON_BARS = registerBlock("iron_bars", new PaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS).nonOpaque()));
    public static final Block IRON_CROSSBAR = registerBlock("iron_crossbar", new PaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS).nonOpaque()));
    public static final Block OXIDIZED_IRON_BARS = registerBlock("oxidized_iron_bars", new PaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS).nonOpaque()));
    public static final Block OXIDIZED_IRON_CROSSBAR = registerBlock("oxidized_iron_crossbar", new PaneBlock(FabricBlockSettings.copyOf(Blocks.IRON_BARS).nonOpaque()));
    public static final Block IRON_BLOCK = registerBlock("iron_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block IRON_STAIRS = registerBlock("iron_stairs", new WcStairs(IRON_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block IRON_SLAB = registerBlock("iron_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block IRON_WALL = registerBlock("iron_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block IRON_FENCE = registerBlock("iron_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block IRON_HOPPER = registerBlock("iron_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block IRON_TIP = registerBlock("iron_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_IRON_BLOCK = registerBlock("oxidized_iron_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_IRON_STAIRS = registerBlock("oxidized_iron_stairs", new WcStairs(IRON_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_IRON_SLAB = registerBlock("oxidized_iron_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_IRON_WALL = registerBlock("oxidized_iron_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_IRON_FENCE = registerBlock("oxidized_iron_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_IRON_HOPPER = registerBlock("oxidized_iron_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_IRON_TIP = registerBlock("oxidized_iron_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block STEEL_BLOCK = registerBlock("steel_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block STEEL_STAIRS = registerBlock("steel_stairs", new WcStairs(IRON_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block STEEL_SLAB = registerBlock("steel_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block STEEL_WALL = registerBlock("steel_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block STEEL_FENCE = registerBlock("steel_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block STEEL_HOPPER = registerBlock("steel_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block STEEL_TIP = registerBlock("steel_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_STEEL_BLOCK = registerBlock("oxidized_steel_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_STEEL_STAIRS = registerBlock("oxidized_steel_stairs", new WcStairs(IRON_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_STEEL_SLAB = registerBlock("oxidized_steel_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_STEEL_WALL = registerBlock("oxidized_steel_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_STEEL_FENCE = registerBlock("oxidized_steel_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_STEEL_HOPPER = registerBlock("oxidized_steel_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_STEEL_TIP = registerBlock("oxidized_steel_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BRONZE_BLOCK = registerBlock("bronze_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BRONZE_STAIRS = registerBlock("bronze_stairs", new WcStairs(IRON_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BRONZE_SLAB = registerBlock("bronze_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BRONZE_WALL = registerBlock("bronze_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BRONZE_FENCE = registerBlock("bronze_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BRONZE_HOPPER = registerBlock("bronze_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block BRONZE_TIP = registerBlock("bronze_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_BRONZE_BLOCK = registerBlock("oxidized_bronze_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_BRONZE_STAIRS = registerBlock("oxidized_bronze_stairs", new WcStairs(IRON_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_BRONZE_SLAB = registerBlock("oxidized_bronze_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_BRONZE_WALL = registerBlock("oxidized_bronze_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_BRONZE_FENCE = registerBlock("oxidized_bronze_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_BRONZE_HOPPER = registerBlock("oxidized_bronze_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block OXIDIZED_BRONZE_TIP = registerBlock("oxidized_bronze_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GOLD_BLOCK = registerBlock("gold_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GOLD_STAIRS = registerBlock("gold_stairs", new WcStairs(IRON_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GOLD_SLAB = registerBlock("gold_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GOLD_WALL = registerBlock("gold_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GOLD_FENCE = registerBlock("gold_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GOLD_HOPPER = registerBlock("gold_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GOLD_TIP = registerBlock("gold_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GOLD_BRICK = registerBlock("gold_brick", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GOLD_BRICK_STAIRS = registerBlock("gold_brick_stairs", new WcStairs(IRON_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GOLD_BRICK_SLAB = registerBlock("gold_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GOLD_BRICK_WALL = registerBlock("gold_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GOLD_BRICK_FENCE = registerBlock("gold_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GOLD_BRICK_HOPPER = registerBlock("gold_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block GOLD_BRICK_TIP = registerBlock("gold_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block IRON_THRONE_BLADE_BLOCK = registerBlock("iron_throne_blade_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block IRON_THRONE_BLADE_STAIRS = registerBlock("iron_throne_blade_stairs", new WcStairs(IRON_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block IRON_THRONE_BLADE_SLAB = registerBlock("iron_throne_blade_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block IRON_THRONE_BLADE_WALL = registerBlock("iron_throne_blade_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block IRON_THRONE_BLADE_FENCE = registerBlock("iron_throne_blade_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block IRON_THRONE_RANDOM_BLADES = registerBlock("iron_throne_random_blades", new Block(FabricBlockSettings.copyOf(Blocks.CHAIN).nonOpaque().noCollision()));

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
