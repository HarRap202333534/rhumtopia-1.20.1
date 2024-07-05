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
                entries.add(Decor.CRATE3);
                entries.add(Decor.OPEN_CRATE);
                entries.add(Decor.IRON_CRATE);
                entries.add(Decor.WATER_BARREL);
                entries.add(Decor.EMPTY_BARREL);
                entries.add(Decor.SILVER_TIN_CRATE);
                entries.add(Decor.FISH_TRAP);
                entries.add(Decor.CAGE);
                entries.add(Decor.COBWEB);
                entries.add(Decor.CLOSED_BASKET);
                entries.add(Decor.OPEN_BASKET);
                entries.add(Decor.CLOSED_BASKET_SLAB);
                entries.add(Decor.OPEN_BASKET_SLAB);
                entries.add(Decor.SEPT_CRYSTAL_MEDIUM);
                entries.add(Decor.SEPT_CRYSTAL_SMALL);
                entries.add(Decor.BAELORS_SPHERE_CRONE_YELLOW);
                entries.add(Decor.BAELORS_SPHERE_FATHER_GREEN);
                entries.add(Decor.BAELORS_SPHERE_MAIDEN_PINK);
                entries.add(Decor.BAELORS_SPHERE_MOTHER_BLUE);
                entries.add(Decor.BAELORS_SPHERE_SMITH_ORANGE);
                entries.add(Decor.BAELORS_SPHERE_STRANGER_GREY);
                entries.add(Decor.BAELORS_SPHERE_WARRIOR_RED);
                entries.add(Decor.SEWER_MANHOLE);
                entries.add(Decor.KINGS_LANDING_SEWER_MANHOLE);
                entries.add(Decor.WHITE_ARBOR_SEWER_MANHOLE);
                entries.add(Decor.OLDTOWN_SEWER_MANHOLE);
                entries.add(Decor.LARGE_CLAY_POT_SOLID);
                entries.add(Decor.LARGE_CLAY_POT);
                entries.add(Decor.AXE_BLOCK);
                entries.add(Decor.CLEAVER_BLOCK);
                entries.add(Decor.DAGGER_BLOCK);
                entries.add(Decor.PICKAXE_BLOCK);
                entries.add(Decor.SHOVEL_BLOCK);
            }).build();



    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "decor"), DECOR);
    }
}
