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
                entries.add(TerrainSet.TERRAINSET_EASTERN_ISLANDS_FENCE_GATE);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_FENCE);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_SLAB);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_STAIRS);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_WALL);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_ALT);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_ALT_FENCE);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_ALT_SLAB);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_ALT_WALL);
                entries.add(TerrainSet.TERRAINSET_THE_NORTH_ALT_STAIRS);

            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "terrain"), TERRAIN);
    }
}
