package com.fal701.block.SandGravel;

import com.fal701.Rhumtopia;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SandGravel {
    public static final Block SAND_SKELETON = registerBlock("sand_skeleton", new SandBlock(0, FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block YELLOW_STAINED_CLAY = registerBlock("yellow_stained_clay", new Block(FabricBlockSettings.copyOf(Blocks.SAND)));

    public static final Block PEBBLES_WET_EASTERN_ISLANDS = registerBlock("pebbles_wet_eastern_islands", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_EASTERN_ISLANDS_LAYER = registerBlock("pebbles_wet_eastern_islands_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));

    public static final Block PEBBLES_WET_IRON_ISLANDS = registerBlock("pebbles_wet_iron_islands", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_IRON_ISLANDS_LAYER = registerBlock("pebbles_wet_iron_islands_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_OCEAN_ROCKS = registerBlock("pebbles_wet_ocean_rocks", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_OCEAN_ROCKS_LAYER = registerBlock("pebbles_wet_ocean_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_RIVER_ROCKS = registerBlock("pebbles_wet_river_rocks", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_RIVER_ROCKS_LAYER = registerBlock("pebbles_wet_river_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_ARBOR_DORNE = registerBlock("pebbles_wet_arbor_dorne", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_ARBOR_DORNE_LAYER = registerBlock("pebbles_wet_arbor_dorne_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_REACH = registerBlock("pebbles_wet_reach", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_REACH_LAYER = registerBlock("pebbles_wet_reach_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_DORNISH_MARCHES = registerBlock("pebbles_wet_dornish_marches", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_DORNISH_MARCHES_LAYER = registerBlock("pebbles_wet_dornish_marches_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_VOLCANIC = registerBlock("pebbles_wet_volcanic", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_VOLCANIC_LAYER = registerBlock("pebbles_wet_volcanic_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_MOUNTAINS_OF_THE_MOON = registerBlock("pebbles_wet_mountains_of_the_moon", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_MOUNTAINS_OF_THE_MOON_LAYER = registerBlock("pebbles_wet_mountains_of_the_moon_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_THE_NORTH = registerBlock("pebbles_wet_the_north", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_THE_NORTH_LAYER = registerBlock("pebbles_wet_north_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_RED_MOUNTAINS = registerBlock("pebbles_wet_red_mountains", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_RED_MOUNTAINS_LAYER = registerBlock("pebbles_wet_red_mountains_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_WESTERLANDS = registerBlock("pebbles_wet_westerlands", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_WESTERLANDS_LAYER = registerBlock("pebbles_wet_westerlands_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_STORMLANDS = registerBlock("pebbles_wet_stormlands", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_STORMLANDS_LAYER = registerBlock("pebbles_wet_stormlands_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_RED_GRANITE = registerBlock("pebbles_wet_red_granite", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_RED_GRANITE_LAYER = registerBlock("pebbles_wet_red_granite_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_BROWN_GRANITE = registerBlock("pebbles_wet_brown_granite", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_WET_BROWN_GRANITE_LAYER = registerBlock("pebbles_wet_brown_granite_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_EASTERN_ISLANDS = registerBlock("pebbles_dry_eastern_islands", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_EASTERN_ISLANDS_LAYER = registerBlock("pebbles_dry_eastern_islands_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_IRON_ISLANDS = registerBlock("pebbles_dry_iron_islands", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_IRON_ISLANDS_LAYER = registerBlock("pebbles_dry_iron_islands_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_MOUNTAINS_OF_THE_MOON = registerBlock("pebbles_dry_mountains_of_the_moon", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_MOUNTAINS_OF_THE_MOON_LAYER = registerBlock("pebbles_dry_mountains_of_the_moon_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_THE_NORTH = registerBlock("pebbles_dry_the_north", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_THE_NORTH_LAYER = registerBlock("pebbles_dry_north_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_OCEAN_ROCKS = registerBlock("pebbles_dry_ocean_rocks", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_OCEAN_ROCKS_LAYER = registerBlock("pebbles_dry_ocean_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_RED_MOUNTAINS = registerBlock("pebbles_dry_red_mountains", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_RED_MOUNTAINS_LAYER = registerBlock("pebbles_dry_red_mountains_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_RIVER_ROCKS = registerBlock("pebbles_dry_river_rocks", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_RIVER_ROCKS_LAYER = registerBlock("pebbles_dry_river_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_WESTERLANDS = registerBlock("pebbles_dry_westerlands", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_WESTERLANDS_LAYER = registerBlock("pebbles_dry_westerlands_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_ARBOR_DORNE = registerBlock("pebbles_dry_arbor_dorne", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_ARBOR_DORNE_LAYER = registerBlock("pebbles_dry_arbor_dorne_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_STORMLANDS = registerBlock("pebbles_dry_stormlands", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_STORMLANDS_LAYER = registerBlock("pebbles_dry_stormlands_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_REACH = registerBlock("pebbles_dry_reach", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_REACH_LAYER = registerBlock("pebbles_dry_reach_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_RED_GRANITE = registerBlock("pebbles_dry_red_granite", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_RED_GRANITE_LAYER = registerBlock("pebbles_dry_red_granite_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_DORNISH_MARCHES = registerBlock("pebbles_dry_dornish_marches", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_DORNISH_MARCHES_LAYER = registerBlock("pebbles_dry_dornish_marches_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_VOLCANIC = registerBlock("pebbles_dry_volcanic", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_VOLCANIC_LAYER = registerBlock("pebbles_dry_volcanic_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_BROWN_GRANITE = registerBlock("pebbles_dry_brown_granite", new GravelBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block PEBBLES_DRY_BROWN_GRANITE_LAYER = registerBlock("pebbles_dry_brown_granite_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.GRAVEL)));
    public static final Block TERRACOTTA_SAND = registerBlock("terracotta_sand", new SandBlock(0, FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block TERRACOTTA_SAND_LAYER = registerBlock("terracotta_sand_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block WET_SAND_STONES = registerBlock("wet_sand_stones", new SandBlock(0, FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block WET_SAND_STONES_LAYER = registerBlock("wet_sand_stones_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block PINKORANGE_SAND = registerBlock("pinkorange_sand", new SandBlock(0, FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block PINKORANGE_SAND_LAYER = registerBlock("pinkorange_sand_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block VOLCANIC_SAND = registerBlock("volcanic_sand", new SandBlock(0, FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block VOLCANIC_SAND_LAYER = registerBlock("volcanic_sand_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block RED_SAND = registerBlock("red_sand", new SandBlock(0, FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block RED_SAND_LAYER = registerBlock("red_sand_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block DESERT_SAND = registerBlock("desert_sand", new SandBlock(0, FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block DESERT_SAND_LAYER = registerBlock("desert_sand_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block SAND_STONES = registerBlock("sand_stones", new SandBlock(0, FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block SAND_STONES_LAYER = registerBlock("sand_stones_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block WET_SAND = registerBlock("wet_sand", new SandBlock(0, FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block WET_SAND_LAYER = registerBlock("wet_sand_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block VOLCANIC_SAND_STONES = registerBlock("volcanic_sand_stones", new SandBlock(0, FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block VOLCANIC_SAND_STONES_LAYER = registerBlock("volcanic_sand_stones_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.SAND)));
    public static final Block MUDDY_SAND = registerBlock("muddy_sand", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block MUDDY_SAND_SLAB = registerBlock("muddy_sand_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block MUDDY_SAND_LAYER = registerBlock("muddy_sand_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block GRASSY_SAND = registerBlock("grassy_sand", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block GRASSY_SAND_SLAB = registerBlock("grassy_sand_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block GRASSY_SAND_LAYER = registerBlock("grassy_sand_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));


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
