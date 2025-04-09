package com.fal701.block.WaterAir;

import com.fal701.Rhumtopia;
import com.fal701.block.TerrainSet.TerrainSet;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupWaterAir {
    public static final ItemGroup WATER = FabricItemGroup.builder()
            .icon(() -> new ItemStack(WaterAir.SMOKE))
            .displayName(Text.translatable("itemGroup.WesterosWaterAir"))
            .entries((context, entries) -> {
                entries.add(WaterAir.SMOKE);
                entries.add(WaterAir.ICICLE);
                entries.add(WaterAir.SNOW);
                entries.add(WaterAir.SNOW_STAIRS);
                entries.add(WaterAir.SNOW_SLAB);
                entries.add(WaterAir.SNOW_WALL);
                entries.add(WaterAir.SNOW_FENCE);
                entries.add(WaterAir.SNOW_LAYER);
                entries.add(WaterAir.ICE);
                entries.add(WaterAir.ICE_STAIRS);
                entries.add(WaterAir.ICE_SLAB);
                entries.add(WaterAir.ICE_WALL);
                entries.add(WaterAir.ICE_FENCE);
            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "water"), WATER);
    }
}
