package com.fal701.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class WcItemGroups {
    public static final ItemGroup COBBLESTONE = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Items.COBBLESTONE))
            .displayName(Text.translatable("itemGroup.wcrhum.cobblestone"))
            .entries((context, entries) -> {

            }).build();

    public static void addItemsWithTagToGroup(ItemGroup group, String tag) {
        List<Item> items = Registry.ITEM.stream()
                .filter(item -> item.getTags().contains(new Identifier(tag)))
                .toList();
        items.forEach(item -> group.appendStack(() -> new ItemStack(item)));
    }

    static {
        // Add items with the "minecraft:stone" tag to the COBBLESTONE group
        addItemsWithTagToGroup(COBBLESTONE, "minecraft:stone");
    }
}

