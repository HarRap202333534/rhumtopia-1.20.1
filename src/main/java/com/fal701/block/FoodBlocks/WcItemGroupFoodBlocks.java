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
            .icon(() -> new ItemStack(FoodBlocks.APPLE_BASKET))
            .displayName(Text.translatable("itemGroup.WesterosFoodBlocks"))
            .entries((context, entries) -> {
                entries.add(FoodBlocks.TURNIP_CRATE);
                entries.add(FoodBlocks.FISH_BARREL);
                entries.add(FoodBlocks.GRAIN_CRATE);
                entries.add(FoodBlocks.APPLE_CRATE);
                entries.add(FoodBlocks.CARROT_CRATE);
                entries.add(FoodBlocks.SALT_CRATE);
                entries.add(FoodBlocks.BERRY_CRATE);
                entries.add(FoodBlocks.PURPLE_GRAPE_CRATE);
                entries.add(FoodBlocks.CHEESE_BLOCK);
                entries.add(FoodBlocks.BREAD_BLOCK);
                entries.add(FoodBlocks.DATES);
                entries.add(FoodBlocks.SPIT_ROAST);
                entries.add(FoodBlocks.SQUASH);
                entries.add(FoodBlocks.GRAIN_FLOUR_SACK);
                entries.add(FoodBlocks.CUT_GRAIN_FLOUR_SACK);
                entries.add(FoodBlocks.SAUSAGES_LEG_OF_HAM);
                entries.add(FoodBlocks.DEAD_HARE);
                entries.add(FoodBlocks.DEAD_FOWL);
                entries.add(FoodBlocks.DEAD_FISH);
                entries.add(FoodBlocks.GARLIC_STRAND);
                entries.add(FoodBlocks.BUSHEL_OF_HERBS);
                entries.add(FoodBlocks.CHILI_RISTRA);
                entries.add(FoodBlocks.DEAD_FROG);
                entries.add(FoodBlocks.DEAD_RAT);
                entries.add(FoodBlocks.APRICOT_BASKET);
                entries.add(FoodBlocks.DATE_BASKET);
                entries.add(FoodBlocks.LEMON_BASKET);
                entries.add(FoodBlocks.LIME_BASKET);
                entries.add(FoodBlocks.OLIVE_BASKET);
                entries.add(FoodBlocks.ORANGE_BASKET);
                entries.add(FoodBlocks.POMEGRANATE_BASKET);
                entries.add(FoodBlocks.HOP_CRATE);
                entries.add(FoodBlocks.LAVENDER_CRATE);
                entries.add(FoodBlocks.SOURLEAF_CRATE);
                entries.add(FoodBlocks.WHITE_GRAPE_CRATE);
                entries.add(FoodBlocks.TURNIP_BASKET);
                entries.add(FoodBlocks.GRAIN_BASKET);
                entries.add(FoodBlocks.APPLE_BASKET);
                entries.add(FoodBlocks.APRICOT_BASKET_SLAB);
                entries.add(FoodBlocks.DATE_BASKET_SLAB);
                entries.add(FoodBlocks.LEMON_BASKET_SLAB);
                entries.add(FoodBlocks.LIME_BASKET_SLAB);
                entries.add(FoodBlocks.OLIVE_BASKET_SLAB);
                entries.add(FoodBlocks.ORANGE_BASKET_SLAB);
                entries.add(FoodBlocks.POMEGRANATE_BASKET_SLAB);
                entries.add(FoodBlocks.TURNIP_BASKET_SLAB);
                entries.add(FoodBlocks.GRAIN_BASKET_SLAB);
                entries.add(FoodBlocks.APPLE_BASKET_SLAB);
                entries.add(FoodBlocks.CARROT_BASKET_SLAB);
                entries.add(FoodBlocks.BERRY_BASKET_SLAB);
                entries.add(FoodBlocks.FISH_BASKET_SLAB);
                entries.add(FoodBlocks.CARROT_BASKET);
                entries.add(FoodBlocks.BERRY_BASKET);
                entries.add(FoodBlocks.FISH_BASKET);
                entries.add(FoodBlocks.PURPLE_GRAPE_BASKET);
                entries.add(FoodBlocks.WHITE_GRAPE_BASKET_SLAB);
                entries.add(FoodBlocks.WHITE_GRAPE_BASKET);
                entries.add(FoodBlocks.HOP_BASKET);
                entries.add(FoodBlocks.LAVENDER_BASKET);
                entries.add(FoodBlocks.SOURLEAF_BASKET);
                entries.add(FoodBlocks.PURPLE_GRAPE_BASKET_SLAB);
                entries.add(FoodBlocks.HOP_BASKET_SLAB);
                entries.add(FoodBlocks.LAVENDER_BASKET_SLAB);
                entries.add(FoodBlocks.SOURLEAF_BASKET_SLAB);
            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "foodblocks"), FOODBLOCKS);
    }
}
