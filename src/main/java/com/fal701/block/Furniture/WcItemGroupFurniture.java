package com.fal701.block.Furniture;

import com.fal701.Rhumtopia;
import com.fal701.block.WindowsGlass.WindowsGlass;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupFurniture {
    public static final ItemGroup FURNITURE = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Furniture.TABLE))
            .displayName(Text.translatable("itemGroup.WesterosFurniture"))
            .entries((context, entries) -> {
                entries.add(Furniture.HAMMOCK);
                entries.add(Furniture.STRAW_BED);
                entries.add(Furniture.ITCHY_STRAW_BED);
                entries.add(Furniture.NORTHERN_BED);
                entries.add(Furniture.NOBLE_BLUE_BED);
                entries.add(Furniture.NOBLE_RED_BED);
                entries.add(Furniture.PALE_GREEN_BED);
                entries.add(Furniture.PALE_RED_BED);
                entries.add(Furniture.DARK_GREY_BRICK_FURNACE);
                entries.add(Furniture.ALWAYS_ACTIVE_DARK_GREY_BRICK_FURNACE);
                entries.add(Furniture.BENCH_BUTCHER_KNIVES);
                entries.add(Furniture.BENCH_CARPENTRY_HAMMER_SAW);
                entries.add(Furniture.BENCH_DRAWERS);
                entries.add(Furniture.BENCH_KITCHEN_KNIVES);
                entries.add(Furniture.BENCH_KITCHEN_PANS);
                entries.add(Furniture.BENCH_MASON_HAMMER_MALLET);
                entries.add(Furniture.TABLE_DRAWERS);
                entries.add(Furniture.TABLE_BOOKS);
                entries.add(Furniture.TABLE_WIDGETS);
                entries.add(Furniture.EMPTY_CABINET);
                entries.add(Furniture.BROKEN_CABINET);
                entries.add(Furniture.CABINET_DRAWER);
                entries.add(Furniture.CLOSED_CABINET);
                entries.add(Furniture.BOOKSHELF_LIBRARY);
                entries.add(Furniture.BOOKSHELF_ABANDONED);
                entries.add(Furniture.BOOKSHELF_MAESTER);
                entries.add(Furniture.MIRROR_BLOCK);
                entries.add(Furniture.STOOL);
                entries.add(Furniture.STOOL_CUSHION);
                entries.add(Furniture.STONE_FURNACE);
                entries.add(Furniture.ALWAYS_ACTIVE_STONE_FURNACE);
                entries.add(Furniture.LIGHT_GREY_BRICK_FURNACE);
                entries.add(Furniture.ALWAYS_ACTIVE_LIGHT_GREY_BRICK_FURNACE);
                entries.add(Furniture.REACH_BRICK_FURNACE);
                entries.add(Furniture.ALWAYS_ACTIVE_REACH_BRICK_FURNACE);
                entries.add(Furniture.DUN_BRICK_FURNACE);
                entries.add(Furniture.ALWAYS_ACTIVE_DUN_BRICK_FURNACE);
                entries.add(Furniture.OLDTOWN_BRICK_FURNACE);
                entries.add(Furniture.ALWAYS_ACTIVE_OLDTOWN_BRICK_FURNACE);
                entries.add(Furniture.SANDSTONE_FURNACE);
                entries.add(Furniture.ALWAYS_ACTIVE_SANDSTONE_FURNACE);
                entries.add(Furniture.ARBOR_BRICK_FURNACE);
                entries.add(Furniture.ALWAYS_ACTIVE_ARBOR_BRICK_FURNACE);
                entries.add(Furniture.DORNISH_MUD_FURNACE);
                entries.add(Furniture.ALWAYS_ACTIVE_DORNISH_MUD_FURNACE);
                entries.add(Furniture.ORANGE_BRICK_FURNACE);
                entries.add(Furniture.ALWAYS_ACTIVE_BRICK_FURNACE);
                entries.add(Furniture.SOUTHERN_BRICK_FURNACE);
                entries.add(Furniture.ALWAYS_ACTIVE_SOUTHERN_BRICK_FURNACE);
            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "furniture"), FURNITURE);
    }
}
