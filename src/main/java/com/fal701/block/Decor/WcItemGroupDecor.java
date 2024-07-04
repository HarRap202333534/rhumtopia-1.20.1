package com.fal701.block.Decor;

import com.fal701.Rhumtopia;
import com.fal701.block.Furniture.Furniture;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupDecor {

    public static final ItemGroup DECOR = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Decor.HORIZONTAL_PAPER))
            .displayName(Text.translatable("itemGroup.WesterosDecor"))
            .entries((context, entries) -> {
                entries.add(Decor.HORIZONTAL_PAPER);
                entries.add(Decor.PEWTER_FLAGON);
                entries.add(Decor.BLOOD);
                entries.add(Decor.BONES);
                entries.add(Decor.BROKEN_SWORD);
                entries.add(Decor.CLOSED_BARREL);
                entries.add(Decor.FIREWOOD_SLAB);
                entries.add(Decor.FIREWOOD_DIRECTIONAL_SLAB);
                entries.add(Decor.FIREWOOD);
                entries.add(Decor.COINS);
                entries.add(Decor.FRYING_PAN);
                entries.add(Decor.GLASS_FLAGON);
                entries.add(Decor.PEWTER_PLATE);
                entries.add(Decor.WOODEN_PLATE);
                entries.add(Decor.HORSE_SHOES);

            }).build();



    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "decor"), DECOR);
    }
}
