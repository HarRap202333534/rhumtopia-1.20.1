package com.fal701.block.SandGravel;

import com.fal701.Rhumtopia;
import com.fal701.block.Roofing.Roofing;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupSandGravel {
    public static final ItemGroup SANDGRAVEL = FabricItemGroup.builder()
            .icon(() -> new ItemStack(SandGravel.PEBBLES_WET_EASTERN_ISLANDS))
            .displayName(Text.translatable("itemGroup.WesterosSandGravel"))
            .entries((context, entries) -> {
                entries.add(SandGravel.SAND_SKELETON);
                entries.add(SandGravel.YELLOW_STAINED_CLAY);
                entries.add(SandGravel.PEBBLES_WET_EASTERN_ISLANDS);
                entries.add(SandGravel.PEBBLES_WET_EASTERN_ISLANDS_LAYER);
                entries.add(SandGravel.PEBBLES_WET_IRON_ISLANDS);
                entries.add(SandGravel.PEBBLES_WET_IRON_ISLANDS_LAYER);
                entries.add(SandGravel.PEBBLES_WET_OCEAN_ROCKS);
                entries.add(SandGravel.PEBBLES_WET_OCEAN_ROCKS_LAYER);
                entries.add(SandGravel.PEBBLES_WET_RIVER_ROCKS);
                entries.add(SandGravel.PEBBLES_WET_RIVER_ROCKS_LAYER);
                entries.add(SandGravel.PEBBLES_WET_ARBOR_DORNE);
                entries.add(SandGravel.PEBBLES_WET_ARBOR_DORNE_LAYER);
                entries.add(SandGravel.PEBBLES_WET_REACH);
                entries.add(SandGravel.PEBBLES_WET_REACH_LAYER);
                entries.add(SandGravel.PEBBLES_WET_DORNISH_MARCHES);
                entries.add(SandGravel.PEBBLES_WET_DORNISH_MARCHES_LAYER);
                entries.add(SandGravel.PEBBLES_WET_VOLCANIC);
                entries.add(SandGravel.PEBBLES_WET_VOLCANIC_LAYER);
                entries.add(SandGravel.PEBBLES_WET_MOUNTAINS_OF_THE_MOON);
                entries.add(SandGravel.PEBBLES_WET_MOUNTAINS_OF_THE_MOON_LAYER);
                entries.add(SandGravel.PEBBLES_WET_THE_NORTH);
                entries.add(SandGravel.PEBBLES_WET_THE_NORTH_LAYER);
                entries.add(SandGravel.PEBBLES_WET_RED_MOUNTAINS);
                entries.add(SandGravel.PEBBLES_WET_RED_MOUNTAINS_LAYER);
                entries.add(SandGravel.PEBBLES_WET_WESTERLANDS);
                entries.add(SandGravel.PEBBLES_WET_WESTERLANDS_LAYER);
                entries.add(SandGravel.PEBBLES_WET_STORMLANDS);
                entries.add(SandGravel.PEBBLES_WET_STORMLANDS_LAYER);
                entries.add(SandGravel.PEBBLES_WET_RED_GRANITE);
                entries.add(SandGravel.PEBBLES_WET_RED_GRANITE_LAYER);
                entries.add(SandGravel.PEBBLES_WET_BROWN_GRANITE);
                entries.add(SandGravel.PEBBLES_WET_BROWN_GRANITE_LAYER);
                entries.add(SandGravel.PEBBLES_DRY_EASTERN_ISLANDS);
                entries.add(SandGravel.PEBBLES_DRY_EASTERN_ISLANDS_LAYER);
                entries.add(SandGravel.PEBBLES_DRY_IRON_ISLANDS);
                entries.add(SandGravel.PEBBLES_DRY_IRON_ISLANDS_LAYER);
                entries.add(SandGravel.PEBBLES_DRY_MOUNTAINS_OF_THE_MOON);
                entries.add(SandGravel.PEBBLES_DRY_MOUNTAINS_OF_THE_MOON_LAYER);
                entries.add(SandGravel.PEBBLES_DRY_THE_NORTH);
                entries.add(SandGravel.PEBBLES_DRY_THE_NORTH_LAYER);
                entries.add(SandGravel.PEBBLES_DRY_OCEAN_ROCKS);
                entries.add(SandGravel.PEBBLES_DRY_OCEAN_ROCKS_LAYER);
                entries.add(SandGravel.PEBBLES_DRY_RED_MOUNTAINS);
                entries.add(SandGravel.PEBBLES_DRY_RED_MOUNTAINS_LAYER);
                entries.add(SandGravel.PEBBLES_DRY_RIVER_ROCKS);
                entries.add(SandGravel.PEBBLES_DRY_RIVER_ROCKS_LAYER);
                entries.add(SandGravel.PEBBLES_DRY_WESTERLANDS);
                entries.add(SandGravel.PEBBLES_DRY_WESTERLANDS_LAYER);
                entries.add(SandGravel.PEBBLES_DRY_ARBOR_DORNE);
                entries.add(SandGravel.PEBBLES_DRY_ARBOR_DORNE_LAYER);
                entries.add(SandGravel.PEBBLES_DRY_STORMLANDS);
                entries.add(SandGravel.PEBBLES_DRY_STORMLANDS_LAYER);
                entries.add(SandGravel.PEBBLES_DRY_REACH);
                entries.add(SandGravel.PEBBLES_DRY_REACH_LAYER);
                entries.add(SandGravel.PEBBLES_DRY_RED_GRANITE);
                entries.add(SandGravel.PEBBLES_DRY_RED_GRANITE_LAYER);
                entries.add(SandGravel.PEBBLES_DRY_DORNISH_MARCHES);
                entries.add(SandGravel.PEBBLES_DRY_DORNISH_MARCHES_LAYER);
                entries.add(SandGravel.PEBBLES_DRY_VOLCANIC);
                entries.add(SandGravel.PEBBLES_DRY_VOLCANIC_LAYER);
                entries.add(SandGravel.PEBBLES_DRY_BROWN_GRANITE);
                entries.add(SandGravel.PEBBLES_DRY_BROWN_GRANITE_LAYER);
                entries.add(SandGravel.TERRACOTTA_SAND);
                entries.add(SandGravel.TERRACOTTA_SAND_LAYER);
                entries.add(SandGravel.WET_SAND_STONES);
                entries.add(SandGravel.WET_SAND_STONES_LAYER);
                entries.add(SandGravel.VOLCANIC_SAND);
                entries.add(SandGravel.VOLCANIC_SAND_LAYER);
                entries.add(SandGravel.PINKORANGE_SAND);
                entries.add(SandGravel.PINKORANGE_SAND_LAYER);
                entries.add(SandGravel.RED_SAND);
                entries.add(SandGravel.RED_SAND_LAYER);
                entries.add(SandGravel.DESERT_SAND);
                entries.add(SandGravel.DESERT_SAND_LAYER);
                entries.add(SandGravel.SAND_STONES);
                entries.add(SandGravel.SAND_STONES_LAYER);
                entries.add(SandGravel.WET_SAND);
                entries.add(SandGravel.WET_SAND_LAYER);
                entries.add(SandGravel.VOLCANIC_SAND_STONES);
                entries.add(SandGravel.VOLCANIC_SAND_STONES_LAYER);
                entries.add(SandGravel.MUDDY_SAND);
                entries.add(SandGravel.MUDDY_SAND_SLAB);
                entries.add(SandGravel.MUDDY_SAND_LAYER);
                entries.add(SandGravel.GRASSY_SAND);
                entries.add(SandGravel.GRASSY_SAND_SLAB);
                entries.add(SandGravel.GRASSY_SAND_LAYER);
            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "sandgravel"), SANDGRAVEL);
    }
}
