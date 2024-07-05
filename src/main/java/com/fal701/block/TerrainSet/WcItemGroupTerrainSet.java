package com.fal701.block.TerrainSet;

import com.fal701.Rhumtopia;
import com.fal701.block.Decor.Decor;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupTerrainSet {

    public static final ItemGroup TERRAIN = FabricItemGroup.builder()
            .icon(() -> new ItemStack(TerrainSet.TERRAINSET_EASTERN_ISLANDS))
            .displayName(Text.translatable("itemGroup.WesterosTerrainSets"))
            .entries((context, entries) -> {
                entries.add(TerrainSet.TERRAINSET_EASTERN_ISLANDS);
                entries.add(TerrainSet.TERRAINSET_EASTERN_ISLANDS_STAIRS);
                entries.add(TerrainSet.TERRAINSET_EASTERN_ISLANDS_SLAB);
                entries.add(TerrainSet.TERRAINSET_EASTERN_ISLANDS_WALL);
                entries.add(TerrainSet.TERRAINSET_EASTERN_ISLANDS_FENCE);
                entries.add(TerrainSet.TERRAINSET_EASTERN_ISLANDS_HOPPER);
                entries.add(TerrainSet.TERRAINSET_EASTERN_ISLANDS_TIP);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_FENCE);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_SLAB);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_STAIRS);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_WALL);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_HOPPER);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_TIP);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_ALT);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_ALT_FENCE);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_ALT_SLAB);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_ALT_WALL);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_ALT_STAIRS);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_ALT_HOPPER);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_ALT_TIP);
                entries.add(TerrainSet.TERRAINSET_IRON_ISLANDS);
                entries.add(TerrainSet.TERRAINSET_IRON_ISLANDS_FENCE);
                entries.add(TerrainSet.TERRAINSET_IRON_ISLANDS_SLAB);
                entries.add(TerrainSet.TERRAINSET_IRON_ISLANDS_WALL);
                entries.add(TerrainSet.TERRAINSET_IRON_ISLANDS_STAIRS);
                entries.add(TerrainSet.TERRAINSET_IRON_ISLANDS_HOPPER);
                entries.add(TerrainSet.TERRAINSET_IRON_ISLANDS_TIP);
                entries.add(TerrainSet.TERRAINSET_MOUNTAINS_OF_THE_MOON);
                entries.add(TerrainSet.TERRAINSET_MOUNTAINS_OF_THE_MOON_FENCE);
                entries.add(TerrainSet.TERRAINSET_MOUNTAINS_OF_THE_MOON_SLAB);
                entries.add(TerrainSet.TERRAINSET_MOUNTAINS_OF_THE_MOON_WALL);
                entries.add(TerrainSet.TERRAINSET_MOUNTAINS_OF_THE_MOON_STAIRS);
                entries.add(TerrainSet.TERRAINSET_MOUNTAINS_OF_THE_MOON_HOPPER);
                entries.add(TerrainSet.TERRAINSET_MOUNTAINS_OF_THE_MOON_TIP);
                entries.add(TerrainSet.TERRAINSET_RED_MOUNTAINS);
                entries.add(TerrainSet.TERRAINSET_RED_MOUNTAINS_FENCE);
                entries.add(TerrainSet.TERRAINSET_RED_MOUNTAINS_SLAB);
                entries.add(TerrainSet.TERRAINSET_RED_MOUNTAINS_WALL);
                entries.add(TerrainSet.TERRAINSET_RED_MOUNTAINS_STAIRS);
                entries.add(TerrainSet.TERRAINSET_RED_MOUNTAINS_HOPPER);
                entries.add(TerrainSet.TERRAINSET_RED_MOUNTAINS_TIP);
                entries.add(TerrainSet.TERRAINSET_RIVER_ROCKS);
                entries.add(TerrainSet.TERRAINSET_RIVER_ROCKS_FENCE);
                entries.add(TerrainSet.TERRAINSET_RIVER_ROCKS_SLAB);
                entries.add(TerrainSet.TERRAINSET_RIVER_ROCKS_WALL);
                entries.add(TerrainSet.TERRAINSET_RIVER_ROCKS_STAIRS);
                entries.add(TerrainSet.TERRAINSET_RIVER_ROCKS_HOPPER);
                entries.add(TerrainSet.TERRAINSET_RIVER_ROCKS_TIP);
                entries.add(TerrainSet.TERRAINSET_WESTERLANDS);
                entries.add(TerrainSet.TERRAINSET_WESTERLANDS_FENCE);
                entries.add(TerrainSet.TERRAINSET_WESTERLANDS_SLAB);
                entries.add(TerrainSet.TERRAINSET_WESTERLANDS_WALL);
                entries.add(TerrainSet.TERRAINSET_WESTERLANDS_STAIRS);
                entries.add(TerrainSet.TERRAINSET_WESTERLANDS_HOPPER);
                entries.add(TerrainSet.TERRAINSET_WESTERLANDS_TIP);
                entries.add(TerrainSet.TERRAINSET_ARBOR_DORNE);
                entries.add(TerrainSet.TERRAINSET_ARBOR_DORNE_FENCE);
                entries.add(TerrainSet.TERRAINSET_ARBOR_DORNE_SLAB);
                entries.add(TerrainSet.TERRAINSET_ARBOR_DORNE_WALL);
                entries.add(TerrainSet.TERRAINSET_ARBOR_DORNE_STAIRS);
                entries.add(TerrainSet.TERRAINSET_ARBOR_DORNE_HOPPER);
                entries.add(TerrainSet.TERRAINSET_ARBOR_DORNE_TIP);
                entries.add(TerrainSet.VOLCANIC_STONE);
                entries.add(TerrainSet.VOLCANIC_STONE_FENCE);
                entries.add(TerrainSet.VOLCANIC_STONE_SLAB);
                entries.add(TerrainSet.VOLCANIC_STONE_WALL);
                entries.add(TerrainSet.VOLCANIC_STONE_STAIRS);
                entries.add(TerrainSet.VOLCANIC_STONE_HOPPER);
                entries.add(TerrainSet.VOLCANIC_STONE_TIP);
                entries.add(TerrainSet.TERRAINSET_STORMLANDS);
                entries.add(TerrainSet.TERRAINSET_STORMLANDS_FENCE);
                entries.add(TerrainSet.TERRAINSET_STORMLANDS_SLAB);
                entries.add(TerrainSet.TERRAINSET_STORMLANDS_WALL);
                entries.add(TerrainSet.TERRAINSET_STORMLANDS_STAIRS);
                entries.add(TerrainSet.TERRAINSET_STORMLANDS_HOPPER);
                entries.add(TerrainSet.TERRAINSET_STORMLANDS_TIP);
                entries.add(TerrainSet.TERRAINSET_REACH);
                entries.add(TerrainSet.TERRAINSET_REACH_FENCE);
                entries.add(TerrainSet.TERRAINSET_REACH_SLAB);
                entries.add(TerrainSet.TERRAINSET_REACH_WALL);
                entries.add(TerrainSet.TERRAINSET_REACH_STAIRS);
                entries.add(TerrainSet.TERRAINSET_REACH_HOPPER);
                entries.add(TerrainSet.TERRAINSET_REACH_TIP);
                entries.add(TerrainSet.TERRAINSET_RED_MOUNTAINS_ALT);
                entries.add(TerrainSet.TERRAINSET_RED_MOUNTAINS_ALT_FENCE);
                entries.add(TerrainSet.TERRAINSET_RED_MOUNTAINS_ALT_SLAB);
                entries.add(TerrainSet.TERRAINSET_RED_MOUNTAINS_ALT_WALL);
                entries.add(TerrainSet.TERRAINSET_RED_MOUNTAINS_ALT_STAIRS);
                entries.add(TerrainSet.TERRAINSET_RED_MOUNTAINS_ALT_HOPPER);
                entries.add(TerrainSet.TERRAINSET_RED_MOUNTAINS_ALT_TIP);
                entries.add(TerrainSet.TERRAINSET_WESTERLANDS_ALT);
                entries.add(TerrainSet.TERRAINSET_WESTERLANDS_ALT_FENCE);
                entries.add(TerrainSet.TERRAINSET_WESTERLANDS_ALT_SLAB);
                entries.add(TerrainSet.TERRAINSET_WESTERLANDS_ALT_WALL);
                entries.add(TerrainSet.TERRAINSET_WESTERLANDS_ALT_STAIRS);
                entries.add(TerrainSet.TERRAINSET_WESTERLANDS_ALT_HOPPER);
                entries.add(TerrainSet.TERRAINSET_WESTERLANDS_ALT_TIP);
                entries.add(TerrainSet.TERRAINSET_ARBOR_DORNE_ALT);
                entries.add(TerrainSet.TERRAINSET_ARBOR_DORNE_ALT_FENCE);
                entries.add(TerrainSet.TERRAINSET_ARBOR_DORNE_ALT_SLAB);
                entries.add(TerrainSet.TERRAINSET_ARBOR_DORNE_ALT_WALL);
                entries.add(TerrainSet.TERRAINSET_ARBOR_DORNE_ALT_STAIRS);
                entries.add(TerrainSet.TERRAINSET_ARBOR_DORNE_ALT_HOPPER);
                entries.add(TerrainSet.TERRAINSET_ARBOR_DORNE_ALT_TIP);
                entries.add(TerrainSet.TERRAINSET_STORMLANDS_ALT);
                entries.add(TerrainSet.TERRAINSET_STORMLANDS_ALT_FENCE);
                entries.add(TerrainSet.TERRAINSET_STORMLANDS_ALT_SLAB);
                entries.add(TerrainSet.TERRAINSET_STORMLANDS_ALT_WALL);
                entries.add(TerrainSet.TERRAINSET_STORMLANDS_ALT_STAIRS);
                entries.add(TerrainSet.TERRAINSET_STORMLANDS_ALT_HOPPER);
                entries.add(TerrainSet.TERRAINSET_STORMLANDS_ALT_TIP);
                entries.add(TerrainSet.TERRAINSET_REACH_ALT);
                entries.add(TerrainSet.TERRAINSET_REACH_ALT_FENCE);
                entries.add(TerrainSet.TERRAINSET_REACH_ALT_SLAB);
                entries.add(TerrainSet.TERRAINSET_REACH_ALT_WALL);
                entries.add(TerrainSet.TERRAINSET_REACH_ALT_STAIRS);
                entries.add(TerrainSet.TERRAINSET_REACH_ALT_HOPPER);
                entries.add(TerrainSet.TERRAINSET_REACH_ALT_TIP);
                entries.add(TerrainSet.TERRAINSET_GREY_SANDSTONE);
                entries.add(TerrainSet.TERRAINSET_GREY_SANDSTONE_FENCE);
                entries.add(TerrainSet.TERRAINSET_GREY_SANDSTONE_SLAB);
                entries.add(TerrainSet.TERRAINSET_GREY_SANDSTONE_WALL);
                entries.add(TerrainSet.TERRAINSET_GREY_SANDSTONE_STAIRS);
                entries.add(TerrainSet.TERRAINSET_GREY_SANDSTONE_HOPPER);
                entries.add(TerrainSet.TERRAINSET_GREY_SANDSTONE_TIP);
                entries.add(TerrainSet.TERRAINSET_MOUNTAINS_OF_THE_MOON_ALT);
                entries.add(TerrainSet.TERRAINSET_MOUNTAINS_OF_THE_MOON_ALT_FENCE);
                entries.add(TerrainSet.TERRAINSET_MOUNTAINS_OF_THE_MOON_ALT_SLAB);
                entries.add(TerrainSet.TERRAINSET_MOUNTAINS_OF_THE_MOON_ALT_WALL);
                entries.add(TerrainSet.TERRAINSET_MOUNTAINS_OF_THE_MOON_ALT_STAIRS);
                entries.add(TerrainSet.TERRAINSET_MOUNTAINS_OF_THE_MOON_ALT_HOPPER);
                entries.add(TerrainSet.TERRAINSET_MOUNTAINS_OF_THE_MOON_ALT_TIP);
                entries.add(TerrainSet.TERRAINSET_EASTERN_ISLANDS_ALT);
                entries.add(TerrainSet.TERRAINSET_EASTERN_ISLANDS_ALT_STAIRS);
                entries.add(TerrainSet.TERRAINSET_EASTERN_ISLANDS_ALT_SLAB);
                entries.add(TerrainSet.TERRAINSET_EASTERN_ISLANDS_ALT_WALL);
                entries.add(TerrainSet.TERRAINSET_EASTERN_ISLANDS_ALT_FENCE);
                entries.add(TerrainSet.TERRAINSET_EASTERN_ISLANDS_ALT_HOPPER);
                entries.add(TerrainSet.TERRAINSET_EASTERN_ISLANDS_ALT_TIP);
                entries.add(TerrainSet.TERRAINSET_IRON_ISLANDS_ALT);
                entries.add(TerrainSet.TERRAINSET_IRON_ISLANDS_ALT_FENCE);
                entries.add(TerrainSet.TERRAINSET_IRON_ISLANDS_ALT_SLAB);
                entries.add(TerrainSet.TERRAINSET_IRON_ISLANDS_ALT_WALL);
                entries.add(TerrainSet.TERRAINSET_IRON_ISLANDS_ALT_STAIRS);
                entries.add(TerrainSet.TERRAINSET_IRON_ISLANDS_ALT_HOPPER);
                entries.add(TerrainSet.TERRAINSET_IRON_ISLANDS_ALT_TIP);
                entries.add(TerrainSet.TERRAINSET_DARK_WESTERLANDS);
                entries.add(TerrainSet.TERRAINSET_DARK_WESTERLANDS_FENCE);
                entries.add(TerrainSet.TERRAINSET_DARK_WESTERLANDS_SLAB);
                entries.add(TerrainSet.TERRAINSET_DARK_WESTERLANDS_WALL);
                entries.add(TerrainSet.TERRAINSET_DARK_WESTERLANDS_STAIRS);
                entries.add(TerrainSet.TERRAINSET_DARK_WESTERLANDS_HOPPER);
                entries.add(TerrainSet.TERRAINSET_DARK_WESTERLANDS_TIP);
                entries.add(TerrainSet.TERRAINSET_RED_GRANITE);
                entries.add(TerrainSet.TERRAINSET_RED_GRANITE_FENCE);
                entries.add(TerrainSet.TERRAINSET_RED_GRANITE_SLAB);
                entries.add(TerrainSet.TERRAINSET_RED_GRANITE_WALL);
                entries.add(TerrainSet.TERRAINSET_RED_GRANITE_STAIRS);
                entries.add(TerrainSet.TERRAINSET_RED_GRANITE_HOPPER);
                entries.add(TerrainSet.TERRAINSET_RED_GRANITE_TIP);
                entries.add(TerrainSet.TERRAINSET_DORNISH_MARHCES);
                entries.add(TerrainSet.TERRAINSET_DORNISH_MARHCES_FENCE);
                entries.add(TerrainSet.TERRAINSET_DORNISH_MARHCES_SLAB);
                entries.add(TerrainSet.TERRAINSET_DORNISH_MARHCES_WALL);
                entries.add(TerrainSet.TERRAINSET_DORNISH_MARHCES_STAIRS);
                entries.add(TerrainSet.TERRAINSET_DORNISH_MARHCES_HOPPER);
                entries.add(TerrainSet.TERRAINSET_DORNISH_MARHCES_TIP);
                entries.add(TerrainSet.TERRAINSET_DORNISH_MARHCES_ALT);
                entries.add(TerrainSet.TERRAINSET_DORNISH_MARHCES_ALT_FENCE);
                entries.add(TerrainSet.TERRAINSET_DORNISH_MARHCES_ALT_SLAB);
                entries.add(TerrainSet.TERRAINSET_DORNISH_MARHCES_ALT_WALL);
                entries.add(TerrainSet.TERRAINSET_DORNISH_MARHCES_ALT_STAIRS);
                entries.add(TerrainSet.TERRAINSET_DORNISH_MARHCES_ALT_HOPPER);
                entries.add(TerrainSet.TERRAINSET_DORNISH_MARHCES_ALT_TIP);
                entries.add(TerrainSet.TERRAINSET_BROWN_GRANITE);
                entries.add(TerrainSet.TERRAINSET_BROWN_GRANITE_FENCE);
                entries.add(TerrainSet.TERRAINSET_BROWN_GRANITE_SLAB);
                entries.add(TerrainSet.TERRAINSET_BROWN_GRANITE_WALL);
                entries.add(TerrainSet.TERRAINSET_BROWN_GRANITE_STAIRS);
                entries.add(TerrainSet.TERRAINSET_BROWN_GRANITE_HOPPER);
                entries.add(TerrainSet.TERRAINSET_BROWN_GRANITE_TIP);
                entries.add(TerrainSet.TERRAINSET_BROWN_GRANITE_ALT);
                entries.add(TerrainSet.TERRAINSET_BROWN_GRANITE_ALT_FENCE);
                entries.add(TerrainSet.TERRAINSET_BROWN_GRANITE_ALT_SLAB);
                entries.add(TerrainSet.TERRAINSET_BROWN_GRANITE_ALT_WALL);
                entries.add(TerrainSet.TERRAINSET_BROWN_GRANITE_ALT_STAIRS);
                entries.add(TerrainSet.TERRAINSET_BROWN_GRANITE_ALT_HOPPER);
                entries.add(TerrainSet.TERRAINSET_BROWN_GRANITE_ALT_TIP);
                entries.add(TerrainSet.VOLCANIC_ROCK);
                entries.add(TerrainSet.VOLCANIC_ROCK_FENCE);
                entries.add(TerrainSet.VOLCANIC_ROCK_SLAB);
                entries.add(TerrainSet.VOLCANIC_ROCK_WALL);
                entries.add(TerrainSet.VOLCANIC_ROCK_STAIRS);
                entries.add(TerrainSet.VOLCANIC_ROCK_HOPPER);
                entries.add(TerrainSet.VOLCANIC_ROCK_TIP);
                entries.add(TerrainSet.GOLD_ORE);
                entries.add(TerrainSet.GOLD_ORE_STAIRS);
                entries.add(TerrainSet.GOLD_ORE_SLAB);
                entries.add(TerrainSet.GOLD_ORE_WALL);
                entries.add(TerrainSet.IRON_ORE);
                entries.add(TerrainSet.IRON_ORE_STAIRS);
                entries.add(TerrainSet.IRON_ORE_SLAB);
                entries.add(TerrainSet.IRON_ORE_WALL);
                entries.add(TerrainSet.SILVER_ORE);
                entries.add(TerrainSet.SILVER_ORE_STAIRS);
                entries.add(TerrainSet.SILVER_ORE_SLAB);
                entries.add(TerrainSet.SILVER_ORE_WALL);
                entries.add(TerrainSet.TIN_ORE);
                entries.add(TerrainSet.TIN_ORE_STAIRS);
                entries.add(TerrainSet.TIN_ORE_SLAB);
                entries.add(TerrainSet.TIN_ORE_WALL);
                entries.add(TerrainSet.COAL_ORE);
                entries.add(TerrainSet.COAL_ORE_STAIRS);
                entries.add(TerrainSet.COAL_ORE_SLAB);
                entries.add(TerrainSet.COAL_ORE_WALL);
                entries.add(TerrainSet.COPPER_ORE);
                entries.add(TerrainSet.COPPER_ORE_SLAB);
                entries.add(TerrainSet.COPPER_ORE_STAIRS);
                entries.add(TerrainSet.COPPER_ORE_WALL);
                entries.add(TerrainSet.TERRAINSET_OCEAN_ROCKS);
                entries.add(TerrainSet.TERRAINSET_OCEAN_ROCKS_HOPPER);
                entries.add(TerrainSet.TERRAINSET_OCEAN_ROCKS_TIP);
                entries.add(TerrainSet.TERRAINSET_OCEAN_ROCKS_FENCE);
                entries.add(TerrainSet.TERRAINSET_OCEAN_ROCKS_SLAB);
                entries.add(TerrainSet.TERRAINSET_OCEAN_ROCKS_STAIRS);
                entries.add(TerrainSet.TERRAINSET_OCEAN_ROCKS_WALL);
            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "terrain"), TERRAIN);
    }
}
