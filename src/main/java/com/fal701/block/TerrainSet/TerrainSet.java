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
    public static final Block TERRAINSET_EASTERN_ISLANDS_FENCE = registerBlock("terrainset_eastern_islands_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_EASTERN_ISLANDS_HOPPER = registerBlock("terrainset_eastern_islands_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_EASTERN_ISLANDS_TIP = registerBlock("terrainset_eastern_islands_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH = registerBlock("terrainset_the_north", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_STAIRS = registerBlock("terrainset_the_north_stairs", new StairsBlock(TerrainSet.TERRAINSET_THE_NORTH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_SLAB = registerBlock("terrainset_the_north_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_WALL = registerBlock("terrainset_the_north_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_FENCE = registerBlock("terrainset_the_north_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_HOPPER = registerBlock("terrainset_the_north_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_TIP = registerBlock("terrainset_the_north_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_OCEAN_ROCKS = registerBlock("terrainset_ocean_rocks", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_OCEAN_ROCKS_STAIRS = registerBlock("terrainset_ocean_rocks_stairs", new StairsBlock(TerrainSet.TERRAINSET_OCEAN_ROCKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_OCEAN_ROCKS_SLAB = registerBlock("terrainset_ocean_rocks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_OCEAN_ROCKS_WALL = registerBlock("terrainset_ocean_rocks_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_OCEAN_ROCKS_FENCE = registerBlock("terrainset_ocean_rocks_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_OCEAN_ROCKS_HOPPER = registerBlock("terrainset_ocean_rocks_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_OCEAN_ROCKS_TIP = registerBlock("terrainset_ocean_rocks_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_ALT = registerBlock("terrainset_the_north_alt", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_ALT_STAIRS = registerBlock("terrainset_the_north_alt_stairs", new StairsBlock(TerrainSet.TERRAINSET_THE_NORTH_ALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_ALT_SLAB = registerBlock("terrainset_the_north_alt_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_ALT_WALL = registerBlock("terrainset_the_north_alt_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_ALT_FENCE = registerBlock("terrainset_the_north_alt_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_ALT_HOPPER = registerBlock("terrainset_the_north_alt_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_THE_NORTH_ALT_TIP = registerBlock("terrainset_the_north_alt_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_IRON_ISLANDS = registerBlock("terrainset_iron_islands", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_IRON_ISLANDS_STAIRS = registerBlock("terrainset_iron_islands_stairs", new StairsBlock(TerrainSet.TERRAINSET_IRON_ISLANDS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_IRON_ISLANDS_SLAB = registerBlock("terrainset_iron_islands_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_IRON_ISLANDS_WALL = registerBlock("terrainset_iron_islands_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_IRON_ISLANDS_FENCE = registerBlock("terrainset_iron_islands_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_IRON_ISLANDS_HOPPER = registerBlock("terrainset_iron_islands_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_IRON_ISLANDS_TIP = registerBlock("terrainset_iron_islands_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_MOUNTAINS_OF_THE_MOON = registerBlock("terrainset_mountains_of_the_moon", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_MOUNTAINS_OF_THE_MOON_STAIRS = registerBlock("terrainset_mountains_of_the_moon_stairs", new StairsBlock(TerrainSet.TERRAINSET_MOUNTAINS_OF_THE_MOON.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_MOUNTAINS_OF_THE_MOON_SLAB = registerBlock("terrainset_mountains_of_the_moon_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_MOUNTAINS_OF_THE_MOON_WALL = registerBlock("terrainset_mountains_of_the_moon_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_MOUNTAINS_OF_THE_MOON_FENCE = registerBlock("terrainset_mountains_of_the_moon_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_MOUNTAINS_OF_THE_MOON_HOPPER = registerBlock("terrainset_mountains_of_the_moon_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_MOUNTAINS_OF_THE_MOON_TIP = registerBlock("terrainset_mountains_of_the_moon_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RED_MOUNTAINS = registerBlock("terrainset_red_mountains", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RED_MOUNTAINS_STAIRS = registerBlock("terrainset_red_mountains_stairs", new StairsBlock(TerrainSet.TERRAINSET_RED_MOUNTAINS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RED_MOUNTAINS_SLAB = registerBlock("terrainset_red_mountains_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RED_MOUNTAINS_WALL = registerBlock("terrainset_red_mountains_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RED_MOUNTAINS_FENCE = registerBlock("terrainset_red_mountains_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RED_MOUNTAINS_HOPPER = registerBlock("terrainset_red_mountains_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RED_MOUNTAINS_TIP = registerBlock("terrainset_red_mountains_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_RIVER_ROCKS = registerBlock("terrainset_river_rocks", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RIVER_ROCKS_STAIRS = registerBlock("terrainset_river_rocks_stairs", new StairsBlock(TerrainSet.TERRAINSET_RIVER_ROCKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RIVER_ROCKS_SLAB = registerBlock("terrainset_river_rocks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RIVER_ROCKS_WALL = registerBlock("terrainset_river_rocks_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RIVER_ROCKS_FENCE = registerBlock("terrainset_river_rocks_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RIVER_ROCKS_HOPPER = registerBlock("terrainset_river_rocks_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RIVER_ROCKS_TIP = registerBlock("terrainset_river_rocks_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_WESTERLANDS = registerBlock("terrainset_westerlands", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_WESTERLANDS_STAIRS = registerBlock("terrainset_westerlands_stairs", new StairsBlock(TerrainSet.TERRAINSET_WESTERLANDS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_WESTERLANDS_SLAB = registerBlock("terrainset_westerlands_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_WESTERLANDS_WALL = registerBlock("terrainset_westerlands_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_WESTERLANDS_FENCE = registerBlock("terrainset_westerlands_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_WESTERLANDS_HOPPER = registerBlock("terrainset_westerlands_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_WESTERLANDS_TIP = registerBlock("terrainset_westerlands_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_ARBOR_DORNE = registerBlock("terrainset_arbor_dorne", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_ARBOR_DORNE_STAIRS = registerBlock("terrainset_arbor_dorne_stairs", new StairsBlock(TerrainSet.TERRAINSET_ARBOR_DORNE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_ARBOR_DORNE_SLAB = registerBlock("terrainset_arbor_dorne_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_ARBOR_DORNE_WALL = registerBlock("terrainset_arbor_dorne_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_ARBOR_DORNE_FENCE = registerBlock("terrainset_arbor_dorne_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_ARBOR_DORNE_HOPPER = registerBlock("terrainset_arbor_dorne_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_ARBOR_DORNE_TIP = registerBlock("terrainset_arbor_dorne_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block VOLCANIC_STONE = registerBlock("volcanic_stone", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block VOLCANIC_STONE_STAIRS = registerBlock("volcanic_stone_stairs", new StairsBlock(TerrainSet.VOLCANIC_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block VOLCANIC_STONE_SLAB = registerBlock("volcanic_stone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block VOLCANIC_STONE_WALL = registerBlock("volcanic_stone_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block VOLCANIC_STONE_FENCE = registerBlock("volcanic_stone_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block VOLCANIC_STONE_HOPPER = registerBlock("volcanic_stone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block VOLCANIC_STONE_TIP = registerBlock("volcanic_stone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_STORMLANDS = registerBlock("terrainset_stormlands", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_STORMLANDS_STAIRS = registerBlock("terrainset_stormlands_stairs", new StairsBlock(TerrainSet.TERRAINSET_STORMLANDS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_STORMLANDS_SLAB = registerBlock("terrainset_stormlands_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_STORMLANDS_WALL = registerBlock("terrainset_stormlands_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_STORMLANDS_FENCE = registerBlock("terrainset_stormlands_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_STORMLANDS_HOPPER = registerBlock("terrainset_stormlands_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_STORMLANDS_TIP = registerBlock("terrainset_stormlands_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_REACH = registerBlock("terrainset_reach", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_REACH_STAIRS = registerBlock("terrainset_reach_stairs", new StairsBlock(TerrainSet.TERRAINSET_REACH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_REACH_SLAB = registerBlock("terrainset_reach_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_REACH_WALL = registerBlock("terrainset_reach_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_REACH_FENCE = registerBlock("terrainset_reach_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_REACH_HOPPER = registerBlock("terrainset_reach_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_REACH_TIP = registerBlock("terrainset_reach_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_RED_MOUNTAINS_ALT = registerBlock("terrainset_red_mountains_alt", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RED_MOUNTAINS_ALT_STAIRS = registerBlock("terrainset_red_mountains_alt_stairs", new StairsBlock(TerrainSet.TERRAINSET_RED_MOUNTAINS_ALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RED_MOUNTAINS_ALT_SLAB = registerBlock("terrainset_red_mountains_alt_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RED_MOUNTAINS_ALT_WALL = registerBlock("terrainset_red_mountains_alt_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RED_MOUNTAINS_ALT_FENCE = registerBlock("terrainset_red_mountains_alt_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RED_MOUNTAINS_ALT_HOPPER = registerBlock("terrainset_red_mountains_alt_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RED_MOUNTAINS_ALT_TIP = registerBlock("terrainset_red_mountains_alt_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_WESTERLANDS_ALT = registerBlock("terrainset_westerlands_alt", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_WESTERLANDS_ALT_STAIRS = registerBlock("terrainset_westerlands_alt_stairs", new StairsBlock(TerrainSet.TERRAINSET_WESTERLANDS_ALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_WESTERLANDS_ALT_SLAB = registerBlock("terrainset_westerlands_alt_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_WESTERLANDS_ALT_WALL = registerBlock("terrainset_westerlands_alt_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_WESTERLANDS_ALT_FENCE = registerBlock("terrainset_westerlands_alt_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_WESTERLANDS_ALT_HOPPER = registerBlock("terrainset_westerlands_alt_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_WESTERLANDS_ALT_TIP = registerBlock("terrainset_westerlands_alt_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_ARBOR_DORNE_ALT = registerBlock("terrainset_arbor_dorne_alt", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_ARBOR_DORNE_ALT_STAIRS = registerBlock("terrainset_arbor_dorne_alt_stairs", new StairsBlock(TerrainSet.TERRAINSET_ARBOR_DORNE_ALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_ARBOR_DORNE_ALT_SLAB = registerBlock("terrainset_arbor_dorne_alt_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_ARBOR_DORNE_ALT_WALL = registerBlock("terrainset_arbor_dorne_alt_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_ARBOR_DORNE_ALT_FENCE = registerBlock("terrainset_arbor_dorne_alt_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_ARBOR_DORNE_ALT_HOPPER = registerBlock("terrainset_arbor_dorne_alt_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_ARBOR_DORNE_ALT_TIP = registerBlock("terrainset_arbor_dorne_alt_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_STORMLANDS_ALT = registerBlock("terrainset_stormlands_alt", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_STORMLANDS_ALT_STAIRS = registerBlock("terrainset_stormlands_alt_stairs", new StairsBlock(TerrainSet.TERRAINSET_STORMLANDS_ALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_STORMLANDS_ALT_SLAB = registerBlock("terrainset_stormlands_alt_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_STORMLANDS_ALT_WALL = registerBlock("terrainset_stormlands_alt_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_STORMLANDS_ALT_FENCE = registerBlock("terrainset_stormlands_alt_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_STORMLANDS_ALT_HOPPER = registerBlock("terrainset_stormlands_alt_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_STORMLANDS_ALT_TIP = registerBlock("terrainset_stormlands_alt_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_REACH_ALT = registerBlock("terrainset_reach_alt", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_REACH_ALT_STAIRS = registerBlock("terrainset_reach_alt_stairs", new StairsBlock(TerrainSet.TERRAINSET_REACH_ALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_REACH_ALT_SLAB = registerBlock("terrainset_reach_alt_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_REACH_ALT_WALL = registerBlock("terrainset_reach_alt_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_REACH_ALT_FENCE = registerBlock("terrainset_reach_alt_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_REACH_ALT_HOPPER = registerBlock("terrainset_reach_alt_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_REACH_ALT_TIP = registerBlock("terrainset_reach_alt_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_GREY_SANDSTONE = registerBlock("terrainset_grey_sandstone", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_GREY_SANDSTONE_STAIRS = registerBlock("terrainset_grey_sandstone_stairs", new StairsBlock(TerrainSet.TERRAINSET_GREY_SANDSTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_GREY_SANDSTONE_SLAB = registerBlock("terrainset_grey_sandstone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_GREY_SANDSTONE_WALL = registerBlock("terrainset_grey_sandstone_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_GREY_SANDSTONE_FENCE = registerBlock("terrainset_grey_sandstone_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_GREY_SANDSTONE_HOPPER = registerBlock("terrainset_grey_sandstone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_GREY_SANDSTONE_TIP = registerBlock("terrainset_grey_sandstone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_MOUNTAINS_OF_THE_MOON_ALT = registerBlock("terrainset_mountains_of_the_moon_alt", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_MOUNTAINS_OF_THE_MOON_ALT_STAIRS = registerBlock("terrainset_mountains_of_the_moon_alt_stairs", new StairsBlock(TerrainSet.TERRAINSET_MOUNTAINS_OF_THE_MOON_ALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_MOUNTAINS_OF_THE_MOON_ALT_SLAB = registerBlock("terrainset_mountains_of_the_moon_alt_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_MOUNTAINS_OF_THE_MOON_ALT_WALL = registerBlock("terrainset_mountains_of_the_moon_alt_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_MOUNTAINS_OF_THE_MOON_ALT_FENCE = registerBlock("terrainset_mountains_of_the_moon_alt_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_MOUNTAINS_OF_THE_MOON_ALT_HOPPER = registerBlock("terrainset_mountains_of_the_moon_alt_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_MOUNTAINS_OF_THE_MOON_ALT_TIP = registerBlock("terrainset_mountains_of_the_moon_alt_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_EASTERN_ISLANDS_ALT = registerBlock("terrainset_eastern_islands_alt", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_EASTERN_ISLANDS_ALT_STAIRS = registerBlock("terrainset_eastern_islands_alt_stairs", new WcStairs(TerrainSet.TERRAINSET_EASTERN_ISLANDS_ALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_EASTERN_ISLANDS_ALT_SLAB = registerBlock("terrainset_eastern_islands_alt_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_EASTERN_ISLANDS_ALT_WALL = registerBlock("terrainset_eastern_islands_alt_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_EASTERN_ISLANDS_ALT_FENCE = registerBlock("terrainset_eastern_islands_alt_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_EASTERN_ISLANDS_ALT_HOPPER = registerBlock("terrainset_eastern_islands_alt_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_EASTERN_ISLANDS_ALT_TIP = registerBlock("terrainset_eastern_islands_alt_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_IRON_ISLANDS_ALT = registerBlock("terrainset_iron_islands_alt", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_IRON_ISLANDS_ALT_STAIRS = registerBlock("terrainset_iron_islands_alt_stairs", new StairsBlock(TerrainSet.TERRAINSET_IRON_ISLANDS_ALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_IRON_ISLANDS_ALT_SLAB = registerBlock("terrainset_iron_islands_alt_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_IRON_ISLANDS_ALT_WALL = registerBlock("terrainset_iron_islands_alt_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_IRON_ISLANDS_ALT_FENCE = registerBlock("terrainset_iron_islands_alt_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_IRON_ISLANDS_ALT_HOPPER = registerBlock("terrainset_iron_islands_alt_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_IRON_ISLANDS_ALT_TIP = registerBlock("terrainset_iron_islands_alt_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_DARK_WESTERLANDS = registerBlock("terrainset_dark_westerlands", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_DARK_WESTERLANDS_STAIRS = registerBlock("terrainset_dark_westerlands_stairs", new StairsBlock(TerrainSet.TERRAINSET_DARK_WESTERLANDS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_DARK_WESTERLANDS_SLAB = registerBlock("terrainset_dark_westerlands_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_DARK_WESTERLANDS_WALL = registerBlock("terrainset_dark_westerlands_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_DARK_WESTERLANDS_FENCE = registerBlock("terrainset_dark_westerlands_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_DARK_WESTERLANDS_HOPPER = registerBlock("terrainset_dark_westerlands_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_DARK_WESTERLANDS_TIP = registerBlock("terrainset_dark_westerlands_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_RED_GRANITE = registerBlock("terrainset_red_granite", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RED_GRANITE_STAIRS = registerBlock("terrainset_red_granite_stairs", new StairsBlock(TerrainSet.TERRAINSET_RED_GRANITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RED_GRANITE_SLAB = registerBlock("terrainset_red_granite_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RED_GRANITE_WALL = registerBlock("terrainset_red_granite_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RED_GRANITE_FENCE = registerBlock("terrainset_red_granite_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RED_GRANITE_HOPPER = registerBlock("terrainset_red_granite_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_RED_GRANITE_TIP = registerBlock("terrainset_red_granite_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_DORNISH_MARHCES = registerBlock("terrainset_dornish_marches", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_DORNISH_MARHCES_STAIRS = registerBlock("terrainset_dornish_marches_stairs", new StairsBlock(TerrainSet.TERRAINSET_DORNISH_MARHCES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_DORNISH_MARHCES_SLAB = registerBlock("terrainset_dornish_marches_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_DORNISH_MARHCES_WALL = registerBlock("terrainset_dornish_marches_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_DORNISH_MARHCES_FENCE = registerBlock("terrainset_dornish_marches_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_DORNISH_MARHCES_HOPPER = registerBlock("terrainset_dornish_marches_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_DORNISH_MARHCES_TIP = registerBlock("terrainset_dornish_marches_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_DORNISH_MARHCES_ALT = registerBlock("terrainset_dornish_marches_alt", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_DORNISH_MARHCES_ALT_STAIRS = registerBlock("terrainset_dornish_marches_alt_stairs", new StairsBlock(TerrainSet.TERRAINSET_DORNISH_MARHCES_ALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_DORNISH_MARHCES_ALT_SLAB = registerBlock("terrainset_dornish_marches_alt_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_DORNISH_MARHCES_ALT_WALL = registerBlock("terrainset_dornish_marches_alt_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_DORNISH_MARHCES_ALT_FENCE = registerBlock("terrainset_dornish_marches_alt_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_DORNISH_MARHCES_ALT_HOPPER = registerBlock("terrainset_dornish_marches_alt_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_DORNISH_MARHCES_ALT_TIP = registerBlock("terrainset_dornish_marches_alt_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_BROWN_GRANITE = registerBlock("terrainset_brown_granite", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_BROWN_GRANITE_STAIRS = registerBlock("terrainset_brown_granite_stairs", new StairsBlock(TerrainSet.TERRAINSET_BROWN_GRANITE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_BROWN_GRANITE_SLAB = registerBlock("terrainset_brown_granite_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_BROWN_GRANITE_WALL = registerBlock("terrainset_brown_granite_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_BROWN_GRANITE_FENCE = registerBlock("terrainset_brown_granite_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_BROWN_GRANITE_HOPPER = registerBlock("terrainset_brown_granite_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_BROWN_GRANITE_TIP = registerBlock("terrainset_brown_granite_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block TERRAINSET_BROWN_GRANITE_ALT = registerBlock("terrainset_brown_granite_alt", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_BROWN_GRANITE_ALT_STAIRS = registerBlock("terrainset_brown_granite_alt_stairs", new StairsBlock(TerrainSet.TERRAINSET_BROWN_GRANITE_ALT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_BROWN_GRANITE_ALT_SLAB = registerBlock("terrainset_brown_granite_alt_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_BROWN_GRANITE_ALT_WALL = registerBlock("terrainset_brown_granite_alt_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_BROWN_GRANITE_ALT_FENCE = registerBlock("terrainset_brown_granite_alt_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_BROWN_GRANITE_ALT_HOPPER = registerBlock("terrainset_brown_granite_alt_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TERRAINSET_BROWN_GRANITE_ALT_TIP = registerBlock("terrainset_brown_granite_alt_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block VOLCANIC_ROCK = registerBlock("volcanic_rock", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block VOLCANIC_ROCK_STAIRS = registerBlock("volcanic_rock_stairs", new StairsBlock(TerrainSet.VOLCANIC_ROCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block VOLCANIC_ROCK_SLAB = registerBlock("volcanic_rock_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block VOLCANIC_ROCK_WALL = registerBlock("volcanic_rock_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block VOLCANIC_ROCK_FENCE = registerBlock("volcanic_rock_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block VOLCANIC_ROCK_HOPPER = registerBlock("volcanic_rock_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block VOLCANIC_ROCK_TIP = registerBlock("volcanic_rock_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block GOLD_ORE = registerBlock("gold_ore", new Block(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
    public static final Block GOLD_ORE_STAIRS = registerBlock("gold_ore_stairs", new WcStairs(TerrainSet.GOLD_ORE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
    public static final Block GOLD_ORE_SLAB = registerBlock("gold_ore_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
    public static final Block GOLD_ORE_WALL = registerBlock("gold_ore_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.GOLD_ORE)));
    public static final Block IRON_ORE = registerBlock("iron_ore", new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block IRON_ORE_STAIRS = registerBlock("iron_ore_stairs", new WcStairs(TerrainSet.IRON_ORE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block IRON_ORE_SLAB = registerBlock("iron_ore_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block IRON_ORE_WALL = registerBlock("iron_ore_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block SILVER_ORE = registerBlock("silver_ore", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block SILVER_ORE_STAIRS = registerBlock("silver_ore_stairs", new WcStairs(TerrainSet.SILVER_ORE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block SILVER_ORE_SLAB = registerBlock("silver_ore_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block SILVER_ORE_WALL = registerBlock("silver_ore_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TIN_ORE = registerBlock("tin_ore", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TIN_ORE_STAIRS = registerBlock("tin_ore_stairs", new WcStairs(TerrainSet.TIN_ORE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TIN_ORE_SLAB = registerBlock("tin_ore_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block TIN_ORE_WALL = registerBlock("tin_ore_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block COAL_ORE = registerBlock("coal_ore", new Block(FabricBlockSettings.copyOf(Blocks.COAL_ORE)));
    public static final Block COAL_ORE_STAIRS = registerBlock("coal_ore_stairs", new WcStairs(TerrainSet.COAL_ORE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COAL_ORE)));
    public static final Block COAL_ORE_SLAB = registerBlock("coal_ore_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COAL_ORE)));
    public static final Block COAL_ORE_WALL = registerBlock("coal_ore_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COAL_ORE)));
    public static final Block COPPER_ORE = registerBlock("copper_ore", new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block COPPER_ORE_STAIRS = registerBlock("copper_ore_stairs", new WcStairs(TerrainSet.COPPER_ORE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block COPPER_ORE_SLAB = registerBlock("copper_ore_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block COPPER_ORE_WALL = registerBlock("copper_ore_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COPPER_ORE)));
    public static final Block FLOWSTONE = registerBlock("flowstone", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block FLOWSTONE_STAIRS = registerBlock("flowstone_stairs", new WcStairs(TerrainSet.FLOWSTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block FLOWSTONE_SLAB = registerBlock("flowstone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block FLOWSTONE_FENCE = registerBlock("flowstone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block FLOWSTONE_WALL = registerBlock("flowstone_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block FLOWSTONE_HOPPER = registerBlock("flowstone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block FLOWSTONE_TIP = registerBlock("flowstone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.STONE)));


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
