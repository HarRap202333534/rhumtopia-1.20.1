package com.fal701.block.Foliage;

import com.fal701.Rhumtopia;
import com.fal701.block.FoodBlocks.FoodBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupFoliage {
    public static final ItemGroup FOLIAGE = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Foliage.WEIRWOOD_LEAVES))
            .displayName(Text.translatable("itemGroup.WesterosFoliage"))
            .entries((context, entries) -> {
                entries.add(Foliage.FALLEN_WEIRWOOD_LEAVES);
                entries.add(Foliage.DUCKWEED);
                entries.add(Foliage.LILY_PAD);
                entries.add(Foliage.JASMINE_VINES);
                entries.add(Foliage.VINES);
                entries.add(Foliage.DAPPLED_MOSS);
                entries.add(Foliage.APPLE_FRUIT_LEAVES);
                entries.add(Foliage.APRICOT_FRUIT_LEAVES);
                entries.add(Foliage.CHERRY_FRUIT_LEAVES);
                entries.add(Foliage.PURPLE_GRAPE_FRUIT_LEAVES);
                entries.add(Foliage.LEMON_FRUIT_LEAVES);
                entries.add(Foliage.LIME_FRUIT_LEAVES);
                entries.add(Foliage.ORANGE_FRUIT_LEAVES);
                entries.add(Foliage.PEACH_FRUIT_LEAVES);
                entries.add(Foliage.PLUM_FRUIT_LEAVES);
                entries.add(Foliage.POMEGRANATE_FRUIT_LEAVES);
                entries.add(Foliage.WEIRWOOD_LEAVES);
                entries.add(Foliage.BLACKBERRY_BUSH);
                entries.add(Foliage.BLUEBERRY_BUSH);
                entries.add(Foliage.RASPBERRY_BUSH);
                entries.add(Foliage.JUNIPER_BUSH);
                entries.add(Foliage.RED_ROSE_BUSH);
                entries.add(Foliage.PINK_ROSE_BUSH);
                entries.add(Foliage.WHITE_ROSE_BUSH);
                entries.add(Foliage.YELLOW_ROSE_BUSH);
                entries.add(Foliage.HOP_FRUIT_LEAVES);
                entries.add(Foliage.OLIVE_FRUIT_LEAVES);
                entries.add(Foliage.PALM_LEAVES);
                entries.add(Foliage.WHITE_GRAPE_FRUIT_LEAVES);
                entries.add(Foliage.SNOWY_SPRUCE_LEAVES);
                entries.add(Foliage.SNOWY_WEIRWOOD_LEAVES);
                entries.add(Foliage.CUSHION_MOSS);
                entries.add(Foliage.CUSHION_MOSS_SLAB);
                entries.add(Foliage.CUSHION_MOSS_STAIRS);
                entries.add(Foliage.CUSHION_MOSS_WALL);
            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "foliage"), FOLIAGE);
    }
}
