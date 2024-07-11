package com.fal701.block.FoodBlocks;

import com.fal701.Rhumtopia;
import com.fal701.block.Lighting.Lighting;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupFoodBlocks {
    public static final ItemGroup FOODBLOCKS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Lighting.LANTERN))
            .displayName(Text.translatable("itemGroup.WesterosFoodBlocks"))
            .entries((context, entries) -> {

            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "foodblocks"), FOODBLOCKS);
    }
}
