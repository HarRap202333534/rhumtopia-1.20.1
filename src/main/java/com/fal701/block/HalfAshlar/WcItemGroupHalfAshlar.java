package com.fal701.block.HalfAshlar;

import com.fal701.Rhumtopia;
import com.fal701.block.MediumAshlar.MediumAshlar;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupHalfAshlar {

    public static final ItemGroup HALF_ASHLAR = FabricItemGroup.builder()
            .icon(() -> new ItemStack(HalfAshlar.DARK_GREY_LARGE_BRICK))
            .displayName(Text.translatable("itemGroup.westerosblocks.half_ashlar"))
            .entries((context, entries) -> {
                entries.add(HalfAshlar.SIDED_STONE_SLAB);
                entries.add(HalfAshlar.NETHER_BRICK);
                entries.add(HalfAshlar.NETHER_BRICK_STAIRS);
                entries.add(HalfAshlar.NETHER_BRICK_SLAB);
                entries.add(HalfAshlar.NETHER_BRICK_WALL);
                entries.add(HalfAshlar.NETHER_BRICK_FENCE);
                entries.add(HalfAshlar.NETHER_BRICK_HOPPER);
                entries.add(HalfAshlar.NETHER_BRICK_TIP);
                entries.add(HalfAshlar.NETHER_BRICK_ARROW_SLIT);
                entries.add(HalfAshlar.NETHER_BRICK_ARROW_SLIT_WINDOW);
                entries.add(HalfAshlar.NETHER_BRICK_ARROW_SLIT_ORNATE);
                entries.add(HalfAshlar.DARK_GREY_LARGE_BRICK);
                entries.add(HalfAshlar.DARK_GREY_LARGE_BRICK_STAIRS);
                entries.add(HalfAshlar.DARK_GREY_LARGE_BRICK_SLAB);
                entries.add(HalfAshlar.DARK_GREY_LARGE_BRICK_WALL);
                entries.add(HalfAshlar.DARK_GREY_LARGE_BRICK_FENCE);
                entries.add(HalfAshlar.DARK_GREY_LARGE_BRICK_HOPPER);
                entries.add(HalfAshlar.DARK_GREY_LARGE_BRICK_TIP);
                entries.add(HalfAshlar.DARK_GREY_LARGE_BRICK_ARROW_SLIT);
                entries.add(HalfAshlar.DARK_GREY_LARGE_BRICK_ARROW_SLIT_WINDOW);
                entries.add(HalfAshlar.DARK_GREY_LARGE_BRICK_ARROW_SLIT_ORNATE);
                entries.add(HalfAshlar.BROWN_GREY_LARGE_BRICK);
                entries.add(HalfAshlar.BROWN_GREY_LARGE_BRICK_STAIRS);
                entries.add(HalfAshlar.BROWN_GREY_LARGE_BRICK_SLAB);
                entries.add(HalfAshlar.BROWN_GREY_LARGE_BRICK_WALL);
                entries.add(HalfAshlar.BROWN_GREY_LARGE_BRICK_FENCE);
                entries.add(HalfAshlar.BROWN_GREY_LARGE_BRICK_HOPPER);
                entries.add(HalfAshlar.BROWN_GREY_LARGE_BRICK_TIP);
                entries.add(HalfAshlar.BROWN_GREY_LARGE_BRICK_ARROW_SLIT);
                entries.add(HalfAshlar.BROWN_GREY_LARGE_BRICK_ARROW_SLIT_WINDOW);
                entries.add(HalfAshlar.BROWN_GREY_LARGE_BRICK_ARROW_SLIT_ORNATE);
                entries.add(HalfAshlar.GREEN_GREY_LARGE_BRICK);
                entries.add(HalfAshlar.GREEN_GREY_LARGE_BRICK_STAIRS);
                entries.add(HalfAshlar.GREEN_GREY_LARGE_BRICK_SLAB);
                entries.add(HalfAshlar.GREEN_GREY_LARGE_BRICK_WALL);
                entries.add(HalfAshlar.GREEN_GREY_LARGE_BRICK_FENCE);
                entries.add(HalfAshlar.GREEN_GREY_LARGE_BRICK_HOPPER);
                entries.add(HalfAshlar.GREEN_GREY_LARGE_BRICK_TIP);
                entries.add(HalfAshlar.GREEN_GREY_LARGE_BRICK_ARROW_SLIT);
                entries.add(HalfAshlar.GREEN_GREY_LARGE_BRICK_ARROW_SLIT_WINDOW);
                entries.add(HalfAshlar.GREEN_GREY_LARGE_BRICK_ARROW_SLIT_ORNATE);
                entries.add(HalfAshlar.STONE_BRICK);
                entries.add(HalfAshlar.STONE_BRICK_STAIRS);
                entries.add(HalfAshlar.STONE_BRICK_SLAB);
                entries.add(HalfAshlar.STONE_BRICK_WALL);
                entries.add(HalfAshlar.STONE_BRICK_FENCE);
                entries.add(HalfAshlar.STONE_BRICK_HOPPER);
                entries.add(HalfAshlar.STONE_BRICK_TIP);
                entries.add(HalfAshlar.STONE_BRICK_ARROW_SLIT);
                entries.add(HalfAshlar.STONE_BRICK_ARROW_SLIT_WINDOW);
                entries.add(HalfAshlar.STONE_BRICK_ARROW_SLIT_ORNATE);
                entries.add(HalfAshlar.MOSSY_STONE_BRICK);
                entries.add(HalfAshlar.MOSSY_STONE_BRICK_STAIRS);
                entries.add(HalfAshlar.MOSSY_STONE_BRICK_SLAB);
                entries.add(HalfAshlar.MOSSY_STONE_BRICK_WALL);
                entries.add(HalfAshlar.MOSSY_STONE_BRICK_FENCE);
                entries.add(HalfAshlar.MOSSY_STONE_BRICK_HOPPER);
                entries.add(HalfAshlar.MOSSY_STONE_BRICK_TIP);
                entries.add(HalfAshlar.MOSSY_STONE_BRICK_ARROW_SLIT);
                entries.add(HalfAshlar.MOSSY_STONE_BRICK_ARROW_SLIT_WINDOW);
                entries.add(HalfAshlar.MOSSY_STONE_BRICK_ARROW_SLIT_ORNATE);
                entries.add(HalfAshlar.FAINT_LIGHT_GREY_LARGE_BRICK);
                entries.add(HalfAshlar.FAINT_LIGHT_GREY_LARGE_BRICK_STAIRS);
                entries.add(HalfAshlar.FAINT_LIGHT_GREY_LARGE_BRICK_SLAB);
                entries.add(HalfAshlar.FAINT_LIGHT_GREY_LARGE_BRICK_WALL);
                entries.add(HalfAshlar.FAINT_LIGHT_GREY_LARGE_BRICK_FENCE);
                entries.add(HalfAshlar.FAINT_LIGHT_GREY_LARGE_BRICK_HOPPER);
                entries.add(HalfAshlar.FAINT_LIGHT_GREY_LARGE_BRICK_TIP);
                entries.add(HalfAshlar.FAINT_LIGHT_GREY_LARGE_BRICK_ARROW_SLIT);
                entries.add(HalfAshlar.FAINT_LIGHT_GREY_LARGE_BRICK_ARROW_SLIT_WINDOW);
                entries.add(HalfAshlar.FAINT_LIGHT_GREY_LARGE_BRICK_ARROW_SLIT_ORNATE);
                entries.add(HalfAshlar.STONE_SLAB);
                entries.add(HalfAshlar.STONE_SLAB_STAIRS);
                entries.add(HalfAshlar.STONE_SLAB_SLAB);
                entries.add(HalfAshlar.STONE_SLAB_WALL);
                entries.add(HalfAshlar.STONE_SLAB_FENCE);
                entries.add(HalfAshlar.STONE_SLAB_HOPPER);
                entries.add(HalfAshlar.STONE_SLAB_TIP);
                entries.add(HalfAshlar.STONE_SLAB_ARROW_SLIT);
                entries.add(HalfAshlar.STONE_SLAB_ARROW_SLIT_WINDOW);
                entries.add(HalfAshlar.STONE_SLAB_ARROW_SLIT_ORNATE);
                entries.add(HalfAshlar.REACH_LARGE_BRICK);
                entries.add(HalfAshlar.REACH_LARGE_BRICK_STAIRS);
                entries.add(HalfAshlar.REACH_LARGE_BRICK_SLAB);
                entries.add(HalfAshlar.REACH_LARGE_BRICK_WALL);
                entries.add(HalfAshlar.REACH_LARGE_BRICK_FENCE);
                entries.add(HalfAshlar.REACH_LARGE_BRICK_HOPPER);
                entries.add(HalfAshlar.REACH_LARGE_BRICK_TIP);
                entries.add(HalfAshlar.REACH_LARGE_BRICK_ARROW_SLIT);
                entries.add(HalfAshlar.REACH_LARGE_BRICK_ARROW_SLIT_WINDOW);
                entries.add(HalfAshlar.REACH_LARGE_BRICK_ARROW_SLIT_ORNATE);
                entries.add(HalfAshlar.SANDY_PINK_LARGE_BRICK);
                entries.add(HalfAshlar.SANDY_PINK_LARGE_BRICK_STAIRS);
                entries.add(HalfAshlar.SANDY_PINK_LARGE_BRICK_SLAB);
                entries.add(HalfAshlar.SANDY_PINK_LARGE_BRICK_WALL);
                entries.add(HalfAshlar.SANDY_PINK_LARGE_BRICK_FENCE);
                entries.add(HalfAshlar.SANDY_PINK_LARGE_BRICK_HOPPER);
                entries.add(HalfAshlar.SANDY_PINK_LARGE_BRICK_TIP);
                entries.add(HalfAshlar.SANDY_PINK_LARGE_BRICK_ARROW_SLIT);
                entries.add(HalfAshlar.SANDY_PINK_LARGE_BRICK_ARROW_SLIT_WINDOW);
                entries.add(HalfAshlar.SANDY_PINK_LARGE_BRICK_ARROW_SLIT_ORNATE);
                entries.add(HalfAshlar.KL_DUN_LARGE_BRICK);
                entries.add(HalfAshlar.KL_DUN_LARGE_BRICK_STAIRS);
                entries.add(HalfAshlar.KL_DUN_LARGE_BRICK_SLAB);
                entries.add(HalfAshlar.KL_DUN_LARGE_BRICK_WALL);
                entries.add(HalfAshlar.KL_DUN_LARGE_BRICK_FENCE);
                entries.add(HalfAshlar.KL_DUN_LARGE_BRICK_HOPPER);
                entries.add(HalfAshlar.KL_DUN_LARGE_BRICK_TIP);
                entries.add(HalfAshlar.KL_DUN_LARGE_BRICK_ARROW_SLIT);
                entries.add(HalfAshlar.KL_DUN_LARGE_BRICK_ARROW_SLIT_WINDOW);
                entries.add(HalfAshlar.KL_DUN_LARGE_BRICK_ARROW_SLIT_ORNATE);
                entries.add(HalfAshlar.COARSE_RED_LARGE_BRICK);
                entries.add(HalfAshlar.COARSE_RED_LARGE_BRICK_STAIRS);
                entries.add(HalfAshlar.COARSE_RED_LARGE_BRICK_SLAB);
                entries.add(HalfAshlar.COARSE_RED_LARGE_BRICK_WALL);
                entries.add(HalfAshlar.COARSE_RED_LARGE_BRICK_FENCE);
                entries.add(HalfAshlar.COARSE_RED_LARGE_BRICK_HOPPER);
                entries.add(HalfAshlar.COARSE_RED_LARGE_BRICK_TIP);
                entries.add(HalfAshlar.COARSE_RED_LARGE_BRICK_ARROW_SLIT);
                entries.add(HalfAshlar.COARSE_RED_LARGE_BRICK_ARROW_SLIT_WINDOW);
                entries.add(HalfAshlar.COARSE_RED_LARGE_BRICK_ARROW_SLIT_ORNATE);
                entries.add(HalfAshlar.OLDTOWN_LARGE_BRICK);
                entries.add(HalfAshlar.OLDTOWN_LARGE_BRICK_STAIRS);
                entries.add(HalfAshlar.OLDTOWN_LARGE_BRICK_SLAB);
                entries.add(HalfAshlar.OLDTOWN_LARGE_BRICK_WALL);
                entries.add(HalfAshlar.OLDTOWN_LARGE_BRICK_FENCE);
                entries.add(HalfAshlar.OLDTOWN_LARGE_BRICK_HOPPER);
                entries.add(HalfAshlar.OLDTOWN_LARGE_BRICK_TIP);
                entries.add(HalfAshlar.OLDTOWN_LARGE_BRICK_ARROW_SLIT);
                entries.add(HalfAshlar.OLDTOWN_LARGE_BRICK_ARROW_SLIT_WINDOW);
                entries.add(HalfAshlar.OLDTOWN_LARGE_BRICK_ARROW_SLIT_ORNATE);
                entries.add(HalfAshlar.ARBOR_LARGE_BRICK);
                entries.add(HalfAshlar.ARBOR_LARGE_BRICK_STAIRS);
                entries.add(HalfAshlar.ARBOR_LARGE_BRICK_SLAB);
                entries.add(HalfAshlar.ARBOR_LARGE_BRICK_WALL);
                entries.add(HalfAshlar.ARBOR_LARGE_BRICK_FENCE);
                entries.add(HalfAshlar.ARBOR_LARGE_BRICK_HOPPER);
                entries.add(HalfAshlar.ARBOR_LARGE_BRICK_TIP);
                entries.add(HalfAshlar.ARBOR_LARGE_BRICK_ARROW_SLIT);
                entries.add(HalfAshlar.ARBOR_LARGE_BRICK_ARROW_SLIT_WINDOW);
                entries.add(HalfAshlar.ARBOR_LARGE_BRICK_ARROW_SLIT_ORNATE);
                entries.add(HalfAshlar.LARGE_BRICK_SANDSTONE);
                entries.add(HalfAshlar.LARGE_BRICK_SANDSTONE_STAIRS);
                entries.add(HalfAshlar.LARGE_BRICK_SANDSTONE_SLAB);
                entries.add(HalfAshlar.LARGE_BRICK_SANDSTONE_WALL);
                entries.add(HalfAshlar.LARGE_BRICK_SANDSTONE_FENCE);
                entries.add(HalfAshlar.LARGE_BRICK_SANDSTONE_HOPPER);
                entries.add(HalfAshlar.LARGE_BRICK_SANDSTONE_TIP);
                entries.add(HalfAshlar.LARGE_BRICK_SANDSTONE_ARROW_SLIT);
                entries.add(HalfAshlar.LARGE_BRICK_SANDSTONE_ARROW_SLIT_WINDOW);
                entries.add(HalfAshlar.LARGE_BRICK_SANDSTONE_ARROW_SLIT_ORNATE);
                entries.add(HalfAshlar.STORMLANDS_LARGE_BRICK);
                entries.add(HalfAshlar.STORMLANDS_LARGE_BRICK_STAIRS);
                entries.add(HalfAshlar.STORMLANDS_LARGE_BRICK_SLAB);
                entries.add(HalfAshlar.STORMLANDS_LARGE_BRICK_WALL);
                entries.add(HalfAshlar.STORMLANDS_LARGE_BRICK_FENCE);
                entries.add(HalfAshlar.STORMLANDS_LARGE_BRICK_HOPPER);
                entries.add(HalfAshlar.STORMLANDS_LARGE_BRICK_TIP);
                entries.add(HalfAshlar.STORMLANDS_LARGE_BRICK_ARROW_SLIT);
                entries.add(HalfAshlar.STORMLANDS_LARGE_BRICK_ARROW_SLIT_WINDOW);
                entries.add(HalfAshlar.STORMLANDS_LARGE_BRICK_ARROW_SLIT_ORNATE);
                entries.add(HalfAshlar.TERRACOTTA_LARGE_BRICK);
                entries.add(HalfAshlar.TERRACOTTA_LARGE_BRICK_STAIRS);
                entries.add(HalfAshlar.TERRACOTTA_LARGE_BRICK_SLAB);
                entries.add(HalfAshlar.TERRACOTTA_LARGE_BRICK_WALL);
                entries.add(HalfAshlar.TERRACOTTA_LARGE_BRICK_FENCE);
                entries.add(HalfAshlar.TERRACOTTA_LARGE_BRICK_HOPPER);
                entries.add(HalfAshlar.TERRACOTTA_LARGE_BRICK_TIP);
                entries.add(HalfAshlar.TERRACOTTA_LARGE_BRICK_ARROW_SLIT);
                entries.add(HalfAshlar.TERRACOTTA_LARGE_BRICK_ARROW_SLIT_WINDOW);
                entries.add(HalfAshlar.TERRACOTTA_LARGE_BRICK_ARROW_SLIT_ORNATE);
                entries.add(HalfAshlar.DARK_BROWN_SANDSTONE);
                entries.add(HalfAshlar.DARK_BROWN_SANDSTONE_STAIRS);
                entries.add(HalfAshlar.DARK_BROWN_SANDSTONE_SLAB);
                entries.add(HalfAshlar.DARK_BROWN_SANDSTONE_WALL);
                entries.add(HalfAshlar.DARK_BROWN_SANDSTONE_FENCE);
                entries.add(HalfAshlar.DARK_BROWN_SANDSTONE_HOPPER);
                entries.add(HalfAshlar.DARK_BROWN_SANDSTONE_TIP);
            }).build();
    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "half_ashlar"), HALF_ASHLAR);
    }
}
