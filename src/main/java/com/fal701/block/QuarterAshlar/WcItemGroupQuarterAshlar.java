package com.fal701.block.QuarterAshlar;

import com.fal701.Rhumtopia;
import com.fal701.block.Fieldstone.Fieldstone;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupQuarterAshlar {

    public static final ItemGroup QUARTER_ASHLAR = FabricItemGroup.builder()
            .icon(() -> new ItemStack(QuarterAshlar.SMALL_STONE_BRICK))
            .displayName(Text.translatable("itemGroup.westerosblocks.quarter_ashlar"))
            .entries((context, entries) -> {
                entries.add(QuarterAshlar.BASALT_BRICK);
                entries.add(QuarterAshlar.BASALT_BRICK_STAIRS);
                entries.add(QuarterAshlar.BASALT_BRICK_SLAB);
                entries.add(QuarterAshlar.BASALT_BRICK_WALL);
                entries.add(QuarterAshlar.BASALT_BRICK_FENCE);
                entries.add(QuarterAshlar.BASALT_BRICK_HOPPER);
                entries.add(QuarterAshlar.BASALT_BRICK_TIP);
                entries.add(QuarterAshlar.BASALT_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.BASALT_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.BASALT_BRICK_ARROW_SLIT_ORNATE);//1
                entries.add(QuarterAshlar.SMALL_DARK_GREY_BRICK);
                entries.add(QuarterAshlar.SMALL_DARK_GREY_BRICK_STAIRS);
                entries.add(QuarterAshlar.SMALL_DARK_GREY_BRICK_SLAB);
                entries.add(QuarterAshlar.SMALL_DARK_GREY_BRICK_WALL);
                entries.add(QuarterAshlar.SMALL_DARK_GREY_BRICK_FENCE);
                entries.add(QuarterAshlar.SMALL_DARK_GREY_BRICK_HOPPER);
                entries.add(QuarterAshlar.SMALL_DARK_GREY_BRICK_TIP);
                entries.add(QuarterAshlar.SMALL_DARK_GREY_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.SMALL_DARK_GREY_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.SMALL_DARK_GREY_BRICK_ARROW_SLIT_ORNATE);//2
                entries.add(QuarterAshlar.SMALL_SMOOTH_BROWN_GREY_BRICK);
                entries.add(QuarterAshlar.SMALL_SMOOTH_BROWN_GREY_BRICK_STAIRS);
                entries.add(QuarterAshlar.SMALL_SMOOTH_BROWN_GREY_BRICK_SLAB);
                entries.add(QuarterAshlar.SMALL_SMOOTH_BROWN_GREY_BRICK_WALL);
                entries.add(QuarterAshlar.SMALL_SMOOTH_BROWN_GREY_BRICK_FENCE);
                entries.add(QuarterAshlar.SMALL_SMOOTH_BROWN_GREY_BRICK_HOPPER);
                entries.add(QuarterAshlar.SMALL_SMOOTH_BROWN_GREY_BRICK_TIP);
                entries.add(QuarterAshlar.SMALL_SMOOTH_BROWN_GREY_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.SMALL_SMOOTH_BROWN_GREY_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.SMALL_SMOOTH_BROWN_GREY_BRICK_ARROW_SLIT_ORNATE);//3
                entries.add(QuarterAshlar.SMALL_BROWN_GREY_BRICK);
                entries.add(QuarterAshlar.SMALL_BROWN_GREY_BRICK_STAIRS);
                entries.add(QuarterAshlar.SMALL_BROWN_GREY_BRICK_SLAB);
                entries.add(QuarterAshlar.SMALL_BROWN_GREY_BRICK_WALL);
                entries.add(QuarterAshlar.SMALL_BROWN_GREY_BRICK_FENCE);
                entries.add(QuarterAshlar.SMALL_BROWN_GREY_BRICK_HOPPER);
                entries.add(QuarterAshlar.SMALL_BROWN_GREY_BRICK_TIP);
                entries.add(QuarterAshlar.SMALL_BROWN_GREY_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.SMALL_BROWN_GREY_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.SMALL_BROWN_GREY_BRICK_ARROW_SLIT_ORNATE);//4
                entries.add(QuarterAshlar.SMALL_STONE_BRICK);
                entries.add(QuarterAshlar.SMALL_STONE_BRICK_STAIRS);
                entries.add(QuarterAshlar.SMALL_STONE_BRICK_SLAB);
                entries.add(QuarterAshlar.SMALL_STONE_BRICK_WALL);
                entries.add(QuarterAshlar.SMALL_STONE_BRICK_FENCE);
                entries.add(QuarterAshlar.SMALL_STONE_BRICK_HOPPER);
                entries.add(QuarterAshlar.SMALL_STONE_BRICK_TIP);
                entries.add(QuarterAshlar.SMALL_STONE_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.SMALL_STONE_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.SMALL_STONE_BRICK_ARROW_SLIT_ORNATE);//5
                entries.add(QuarterAshlar.MOSSY_SMALL_STONE_BRICK);
                entries.add(QuarterAshlar.MOSSY_SMALL_STONE_BRICK_STAIRS);
                entries.add(QuarterAshlar.MOSSY_SMALL_STONE_BRICK_SLAB);
                entries.add(QuarterAshlar.MOSSY_SMALL_STONE_BRICK_WALL);
                entries.add(QuarterAshlar.MOSSY_SMALL_STONE_BRICK_FENCE);
                entries.add(QuarterAshlar.MOSSY_SMALL_STONE_BRICK_HOPPER);
                entries.add(QuarterAshlar.MOSSY_SMALL_STONE_BRICK_TIP);//6
                entries.add(QuarterAshlar.SMALL_SMOOTH_STONE_BRICK);
                entries.add(QuarterAshlar.SMALL_SMOOTH_STONE_BRICK_STAIRS);
                entries.add(QuarterAshlar.SMALL_SMOOTH_STONE_BRICK_SLAB);
                entries.add(QuarterAshlar.SMALL_SMOOTH_STONE_BRICK_WALL);
                entries.add(QuarterAshlar.SMALL_SMOOTH_STONE_BRICK_FENCE);
                entries.add(QuarterAshlar.SMALL_SMOOTH_STONE_BRICK_HOPPER);
                entries.add(QuarterAshlar.SMALL_SMOOTH_STONE_BRICK_TIP);
                entries.add(QuarterAshlar.SMALL_SMOOTH_STONE_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.SMALL_SMOOTH_STONE_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.SMALL_SMOOTH_STONE_BRICK_ARROW_SLIT_ORNATE);//7
                entries.add(QuarterAshlar.SMALL_FAINT_LIGHT_GREY_BRICK);
                entries.add(QuarterAshlar.SMALL_FAINT_LIGHT_GREY_BRICK_STAIRS);
                entries.add(QuarterAshlar.SMALL_FAINT_LIGHT_GREY_BRICK_SLAB);
                entries.add(QuarterAshlar.SMALL_FAINT_LIGHT_GREY_BRICK_WALL);
                entries.add(QuarterAshlar.SMALL_FAINT_LIGHT_GREY_BRICK_FENCE);
                entries.add(QuarterAshlar.SMALL_FAINT_LIGHT_GREY_BRICK_HOPPER);
                entries.add(QuarterAshlar.SMALL_FAINT_LIGHT_GREY_BRICK_TIP);
                entries.add(QuarterAshlar.SMALL_FAINT_LIGHT_GREY_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.SMALL_FAINT_LIGHT_GREY_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.SMALL_FAINT_LIGHT_GREY_BRICK_ARROW_SLIT_ORNATE);//8
                entries.add(QuarterAshlar.SMALL_WHITE_BRICK);
                entries.add(QuarterAshlar.SMALL_WHITE_BRICK_STAIRS);
                entries.add(QuarterAshlar.SMALL_WHITE_BRICK_SLAB);
                entries.add(QuarterAshlar.SMALL_WHITE_BRICK_WALL);
                entries.add(QuarterAshlar.SMALL_WHITE_BRICK_FENCE);
                entries.add(QuarterAshlar.SMALL_WHITE_BRICK_HOPPER);
                entries.add(QuarterAshlar.SMALL_WHITE_BRICK_TIP);
                entries.add(QuarterAshlar.SMALL_WHITE_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.SMALL_WHITE_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.SMALL_WHITE_BRICK_ARROW_SLIT_ORNATE);//9
                entries.add(QuarterAshlar.REACH_BRICK);
                entries.add(QuarterAshlar.REACH_BRICK_STAIRS);
                entries.add(QuarterAshlar.REACH_BRICK_SLAB);
                entries.add(QuarterAshlar.REACH_BRICK_WALL);
                entries.add(QuarterAshlar.REACH_BRICK_FENCE);
                entries.add(QuarterAshlar.REACH_BRICK_HOPPER);
                entries.add(QuarterAshlar.REACH_BRICK_TIP);
                entries.add(QuarterAshlar.REACH_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.REACH_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.REACH_BRICK_ARROW_SLIT_ORNATE);//10
                entries.add(QuarterAshlar.SANDY_PINK_BRICK);
                entries.add(QuarterAshlar.SANDY_PINK_BRICK_STAIRS);
                entries.add(QuarterAshlar.SANDY_PINK_BRICK_SLAB);
                entries.add(QuarterAshlar.SANDY_PINK_BRICK_WALL);
                entries.add(QuarterAshlar.SANDY_PINK_BRICK_FENCE);
                entries.add(QuarterAshlar.SANDY_PINK_BRICK_HOPPER);
                entries.add(QuarterAshlar.SANDY_PINK_BRICK_TIP);
                entries.add(QuarterAshlar.SANDY_PINK_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.SANDY_PINK_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.SANDY_PINK_BRICK_ARROW_SLIT_ORNATE);//11
                entries.add(QuarterAshlar.SMALL_KL_DUN_BRICK);
                entries.add(QuarterAshlar.SMALL_KL_DUN_BRICK_STAIRS);
                entries.add(QuarterAshlar.SMALL_KL_DUN_BRICK_SLAB);
                entries.add(QuarterAshlar.SMALL_KL_DUN_BRICK_WALL);
                entries.add(QuarterAshlar.SMALL_KL_DUN_BRICK_FENCE);
                entries.add(QuarterAshlar.SMALL_KL_DUN_BRICK_HOPPER);
                entries.add(QuarterAshlar.SMALL_KL_DUN_BRICK_TIP);
                entries.add(QuarterAshlar.SMALL_KL_DUN_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.SMALL_KL_DUN_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.SMALL_KL_DUN_BRICK_ARROW_SLIT_ORNATE);//12
                entries.add(QuarterAshlar.SMALL_COARSE_RED_BRICK);
                entries.add(QuarterAshlar.SMALL_COARSE_RED_BRICK_STAIRS);
                entries.add(QuarterAshlar.SMALL_COARSE_RED_BRICK_SLAB);
                entries.add(QuarterAshlar.SMALL_COARSE_RED_BRICK_WALL);
                entries.add(QuarterAshlar.SMALL_COARSE_RED_BRICK_FENCE);
                entries.add(QuarterAshlar.SMALL_COARSE_RED_BRICK_HOPPER);
                entries.add(QuarterAshlar.SMALL_COARSE_RED_BRICK_TIP);
                entries.add(QuarterAshlar.SMALL_COARSE_RED_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.SMALL_COARSE_RED_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.SMALL_COARSE_RED_BRICK_ARROW_SLIT_ORNATE);//13
                entries.add(QuarterAshlar.UNUSED_PURPLE_BRICK);
                entries.add(QuarterAshlar.UNUSED_PURPLE_BRICK_STAIRS);
                entries.add(QuarterAshlar.UNUSED_PURPLE_BRICK_SLAB);
                entries.add(QuarterAshlar.UNUSED_PURPLE_BRICK_WALL);
                entries.add(QuarterAshlar.UNUSED_PURPLE_BRICK_FENCE);
                entries.add(QuarterAshlar.UNUSED_PURPLE_BRICK_HOPPER);
                entries.add(QuarterAshlar.UNUSED_PURPLE_BRICK_TIP);
                entries.add(QuarterAshlar.UNUSED_PURPLE_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.UNUSED_PURPLE_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.UNUSED_PURPLE_BRICK_ARROW_SLIT_ORNATE);//14
                entries.add(QuarterAshlar.DARK_RED_BRICK);
                entries.add(QuarterAshlar.DARK_RED_BRICK_STAIRS);
                entries.add(QuarterAshlar.DARK_RED_BRICK_SLAB);
                entries.add(QuarterAshlar.DARK_RED_BRICK_WALL);
                entries.add(QuarterAshlar.DARK_RED_BRICK_FENCE);
                entries.add(QuarterAshlar.DARK_RED_BRICK_HOPPER);
                entries.add(QuarterAshlar.DARK_RED_BRICK_TIP);
                entries.add(QuarterAshlar.DARK_RED_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.DARK_RED_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.DARK_RED_BRICK_ARROW_SLIT_ORNATE);//15
                entries.add(QuarterAshlar.SMALL_SMOOTH_OLDTOWN_BRICK);
                entries.add(QuarterAshlar.SMALL_SMOOTH_OLDTOWN_BRICK_STAIRS);
                entries.add(QuarterAshlar.SMALL_SMOOTH_OLDTOWN_BRICK_SLAB);
                entries.add(QuarterAshlar.SMALL_SMOOTH_OLDTOWN_BRICK_WALL);
                entries.add(QuarterAshlar.SMALL_SMOOTH_OLDTOWN_BRICK_FENCE);
                entries.add(QuarterAshlar.SMALL_SMOOTH_OLDTOWN_BRICK_HOPPER);
                entries.add(QuarterAshlar.SMALL_SMOOTH_OLDTOWN_BRICK_TIP);
                entries.add(QuarterAshlar.SMALL_SMOOTH_OLDTOWN_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.SMALL_SMOOTH_OLDTOWN_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.SMALL_SMOOTH_OLDTOWN_BRICK_ARROW_SLIT_ORNATE);//16
                entries.add(QuarterAshlar.SMALL_OLDTOWN_BRICK);
                entries.add(QuarterAshlar.SMALL_OLDTOWN_BRICK_STAIRS);
                entries.add(QuarterAshlar.SMALL_OLDTOWN_BRICK_SLAB);
                entries.add(QuarterAshlar.SMALL_OLDTOWN_BRICK_WALL);
                entries.add(QuarterAshlar.SMALL_OLDTOWN_BRICK_FENCE);
                entries.add(QuarterAshlar.SMALL_OLDTOWN_BRICK_HOPPER);
                entries.add(QuarterAshlar.SMALL_OLDTOWN_BRICK_TIP);
                entries.add(QuarterAshlar.SMALL_OLDTOWN_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.SMALL_OLDTOWN_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.SMALL_OLDTOWN_BRICK_ARROW_SLIT_ORNATE);//17
                entries.add(QuarterAshlar.SMALL_ARBOR_BRICK);
                entries.add(QuarterAshlar.SMALL_ARBOR_BRICK_STAIRS);
                entries.add(QuarterAshlar.SMALL_ARBOR_BRICK_SLAB);
                entries.add(QuarterAshlar.SMALL_ARBOR_BRICK_WALL);
                entries.add(QuarterAshlar.SMALL_ARBOR_BRICK_FENCE);
                entries.add(QuarterAshlar.SMALL_ARBOR_BRICK_HOPPER);
                entries.add(QuarterAshlar.SMALL_ARBOR_BRICK_TIP);
                entries.add(QuarterAshlar.SMALL_ARBOR_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.SMALL_ARBOR_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.SMALL_ARBOR_BRICK_ARROW_SLIT_ORNATE);//18
                entries.add(QuarterAshlar.SMALL_SMOOTH_LANNISPORT_BRICK);
                entries.add(QuarterAshlar.SMALL_SMOOTH_LANNISPORT_BRICK_STAIRS);
                entries.add(QuarterAshlar.SMALL_SMOOTH_LANNISPORT_BRICK_SLAB);
                entries.add(QuarterAshlar.SMALL_SMOOTH_LANNISPORT_BRICK_WALL);
                entries.add(QuarterAshlar.SMALL_SMOOTH_LANNISPORT_BRICK_FENCE);
                entries.add(QuarterAshlar.SMALL_SMOOTH_LANNISPORT_BRICK_HOPPER);
                entries.add(QuarterAshlar.SMALL_SMOOTH_LANNISPORT_BRICK_TIP);
                entries.add(QuarterAshlar.SMALL_SMOOTH_LANNISPORT_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.SMALL_SMOOTH_LANNISPORT_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.SMALL_SMOOTH_LANNISPORT_BRICK_ARROW_SLIT_ORNATE);//19
                entries.add(QuarterAshlar.SMALL_LANNISPORT_BRICK);
                entries.add(QuarterAshlar.SMALL_LANNISPORT_BRICK_STAIRS);
                entries.add(QuarterAshlar.SMALL_LANNISPORT_BRICK_SLAB);
                entries.add(QuarterAshlar.SMALL_LANNISPORT_BRICK_WALL);
                entries.add(QuarterAshlar.SMALL_LANNISPORT_BRICK_FENCE);
                entries.add(QuarterAshlar.SMALL_LANNISPORT_BRICK_HOPPER);
                entries.add(QuarterAshlar.SMALL_LANNISPORT_BRICK_TIP);
                entries.add(QuarterAshlar.SMALL_LANNISPORT_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.SMALL_LANNISPORT_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.SMALL_LANNISPORT_BRICK_ARROW_SLIT_ORNATE);//20
                entries.add(QuarterAshlar.UNUSED_BROWN_BRICK);
                entries.add(QuarterAshlar.UNUSED_BROWN_BRICK_STAIRS);
                entries.add(QuarterAshlar.UNUSED_BROWN_BRICK_SLAB);
                entries.add(QuarterAshlar.UNUSED_BROWN_BRICK_WALL);
                entries.add(QuarterAshlar.UNUSED_BROWN_BRICK_FENCE);
                entries.add(QuarterAshlar.UNUSED_BROWN_BRICK_HOPPER);
                entries.add(QuarterAshlar.UNUSED_BROWN_BRICK_TIP);
                entries.add(QuarterAshlar.UNUSED_BROWN_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.UNUSED_BROWN_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.UNUSED_BROWN_BRICK_ARROW_SLIT_ORNATE);//21
                entries.add(QuarterAshlar.STORMLANDS_BRICK);
                entries.add(QuarterAshlar.STORMLANDS_BRICK_STAIRS);
                entries.add(QuarterAshlar.STORMLANDS_BRICK_SLAB);
                entries.add(QuarterAshlar.STORMLANDS_BRICK_WALL);
                entries.add(QuarterAshlar.STORMLANDS_BRICK_FENCE);
                entries.add(QuarterAshlar.STORMLANDS_BRICK_HOPPER);
                entries.add(QuarterAshlar.STORMLANDS_BRICK_TIP);
                entries.add(QuarterAshlar.STORMLANDS_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.STORMLANDS_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.STORMLANDS_BRICK_ARROW_SLIT_ORNATE);//22
                entries.add(QuarterAshlar.SMALL_TERRACOTTA_BRICK);
                entries.add(QuarterAshlar.SMALL_TERRACOTTA_BRICK_STAIRS);
                entries.add(QuarterAshlar.SMALL_TERRACOTTA_BRICK_SLAB);
                entries.add(QuarterAshlar.SMALL_TERRACOTTA_BRICK_WALL);
                entries.add(QuarterAshlar.SMALL_TERRACOTTA_BRICK_FENCE);
                entries.add(QuarterAshlar.SMALL_TERRACOTTA_BRICK_HOPPER);
                entries.add(QuarterAshlar.SMALL_TERRACOTTA_BRICK_TIP);
                entries.add(QuarterAshlar.SMALL_TERRACOTTA_BRICK_ARROW_SLIT);
                entries.add(QuarterAshlar.SMALL_TERRACOTTA_BRICK_ARROW_SLIT_WINDOW);
                entries.add(QuarterAshlar.SMALL_TERRACOTTA_BRICK_ARROW_SLIT_ORNATE);//23


            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "quarter_ashlar"), QUARTER_ASHLAR);
    }
}
