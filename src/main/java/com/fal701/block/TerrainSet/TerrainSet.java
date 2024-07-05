package com.fal701.block.TerrainSet;

import com.fal701.Rhumtopia;
import com.fal701.block.Z_custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class TerrainSet {
    public static final BlockSetType TYPE = new BlockSetType("locked", false, BlockSoundGroup.WOOD, SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN, SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    public static final WoodType TYPE2 = new WoodType("locked_gate", TYPE);

    public static final Block TERRAINSET_EASTERN_ISLANDS = registerBlock("terrainset_eastern_islands", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_EASTERN_ISLANDS_STAIRS = registerBlock("terrainset_eastern_islands_stairs", new WcStairs(TerrainSet.TERRAINSET_EASTERN_ISLANDS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_EASTERN_ISLANDS_SLAB = registerBlock("terrainset_eastern_islands_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_EASTERN_ISLANDS_WALL = registerBlock("terrainset_eastern_islands_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_EASTERN_ISLANDS_FENCE = registerBlock("terrainset_eastern_islands_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_EASTERN_ISLANDS_HOPPER = registerBlock("terrainset_eastern_islands_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_EASTERN_ISLANDS_TIP = registerBlock("terrainset_eastern_islands_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_EASTERN_ISLANDS_FENCE_GATE = registerBlock("terrainset_eastern_islands_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.STONE), TYPE2));
    public static final Block TERRAINSET_THE_NORTH = registerBlock("terrainset_the_north", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_STAIRS = registerBlock("terrainset_the_north_stairs", new StairsBlock(TerrainSet.TERRAINSET_THE_NORTH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_SLAB = registerBlock("terrainset_the_north_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_WALL = registerBlock("terrainset_the_north_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_FENCE = registerBlock("terrainset_the_north_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_ALT = registerBlock("terrainset_the_north_alt", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_ALT_STAIRS = registerBlock("terrainset_the_north_alt_stairs", new StairsBlock(TerrainSet.TERRAINSET_THE_NORTH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_ALT_SLAB = registerBlock("terrainset_the_north_alt_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_ALT_WALL = registerBlock("terrainset_the_north_alt_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_ALT_FENCE = registerBlock("terrainset_the_north_alt_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.STONE)));



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
