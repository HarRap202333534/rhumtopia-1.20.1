package com.fal701.block.Lighting;

import com.fal701.Rhumtopia;
import com.fal701.block.Decor.Decor;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupLighting {
    public static final ItemGroup LIGHTING = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Lighting.LANTERN))
            .displayName(Text.translatable("itemGroup.WesterosLighting"))
            .entries((context, entries) -> {
                entries.add(Lighting.BRAZIER);
                entries.add(Lighting.CANDLE);
                entries.add(Lighting.TORCH);
                entries.add(Lighting.LANTERN);
                entries.add(Lighting.RED_LANTERN);
                entries.add(Lighting.RED_LANTERN2);
                entries.add(Lighting.BRAZIER2);
                entries.add(Lighting.GLOWING_EMBERS);
                entries.add(Lighting.CANDLE_ALTAR);


            }).build();


    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "lighting"), LIGHTING);
    }
}
