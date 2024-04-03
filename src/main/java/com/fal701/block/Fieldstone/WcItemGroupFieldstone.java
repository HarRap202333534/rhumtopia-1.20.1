package com.fal701.block.Fieldstone;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupFieldstone {

    public static final ItemGroup FIELDSTONE = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Fieldstone.WHITE_LIGHT_BRICK))
            .displayName(Text.translatable("itemGrouo.wcrhum.fieldstone"))
            .entries((context, entries) -> {
                entries.add(Fieldstone.FAINT_BROWN_GREY_BRICK);
                entries.add(Fieldstone.FAINT_BROWN_GREY_BRICK_STAIRS);
                entries.add(Fieldstone.FAINT_BROWN_GREY_BRICK_SLAB);
                entries.add(Fieldstone.FAINT_BROWN_GREY_BRICK_WALL);
                entries.add(Fieldstone.FAINT_BROWN_GREY_BRICK_FENCE);
                entries.add(Fieldstone.FAINT_BROWN_GREY_BRICK_HOPPER);
                entries.add(Fieldstone.FAINT_BROWN_GREY_BRICK_TIP);
                entries.add(Fieldstone.FAINT_BROWN_GREY_BRICK_ARROW_SLIT);
                entries.add(Fieldstone.FAINT_BROWN_GREY_BRICK_ARROW_SLIT_WINDOW);
                entries.add(Fieldstone.FAINT_BROWN_GREY_BRICK_ARROW_SLIT_ORNATE);
                entries.add(Fieldstone.LIGHT_GREY_BRICK);
                entries.add(Fieldstone.LIGHT_GREY_BRICK_STAIRS);
                entries.add(Fieldstone.LIGHT_GREY_BRICK_SLAB);
                entries.add(Fieldstone.LIGHT_GREY_BRICK_WALL);
                entries.add(Fieldstone.LIGHT_GREY_BRICK_FENCE);
                entries.add(Fieldstone.LIGHT_GREY_BRICK_HOPPER);
                entries.add(Fieldstone.LIGHT_GREY_BRICK_TIP);
                entries.add(Fieldstone.LIGHT_GREY_BRICK_ARROW_SLIT);
                entries.add(Fieldstone.LIGHT_GREY_BRICK_ARROW_SLIT_WINDOW);
                entries.add(Fieldstone.LIGHT_GREY_BRICK_ARROW_SLIT_ORNATE);
                entries.add(Fieldstone.REACH_LIGHT_BRICK);
                entries.add(Fieldstone.REACH_LIGHT_BRICK_STAIRS);
                entries.add(Fieldstone.REACH_LIGHT_BRICK_SLAB);
                entries.add(Fieldstone.REACH_LIGHT_BRICK_WALL);
                entries.add(Fieldstone.REACH_LIGHT_BRICK_FENCE);
                entries.add(Fieldstone.REACH_LIGHT_BRICK_HOPPER);
                entries.add(Fieldstone.REACH_LIGHT_BRICK_TIP);
                entries.add(Fieldstone.REACH_LIGHT_BRICK_ARROW_SLIT);
                entries.add(Fieldstone.REACH_LIGHT_BRICK_ARROW_SLIT_WINDOW);
                entries.add(Fieldstone.REACH_LIGHT_BRICK_ARROW_SLIT_ORNATE);
                entries.add(Fieldstone.BROWN_GREY_BRICK);
                entries.add(Fieldstone.BROWN_GREY_BRICK_STAIRS);
                entries.add(Fieldstone.BROWN_GREY_BRICK_SLAB);
                entries.add(Fieldstone.BROWN_GREY_BRICK_WALL);
                entries.add(Fieldstone.BROWN_GREY_BRICK_FENCE);
                entries.add(Fieldstone.BROWN_GREY_BRICK_HOPPER);
                entries.add(Fieldstone.BROWN_GREY_BRICK_TIP);
                entries.add(Fieldstone.BROWN_GREY_BRICK_ARROW_SLIT);
                entries.add(Fieldstone.BROWN_GREY_BRICK_ARROW_SLIT_WINDOW);
                entries.add(Fieldstone.BROWN_GREY_BRICK_ARROW_SLIT_ORNATE);
                entries.add(Fieldstone.FAINT_LIGHT_GREY_BRICK);
                entries.add(Fieldstone.FAINT_LIGHT_GREY_BRICK_STAIRS);
                entries.add(Fieldstone.FAINT_LIGHT_GREY_BRICK_SLAB);
                entries.add(Fieldstone.FAINT_LIGHT_GREY_BRICK_WALL);
                entries.add(Fieldstone.FAINT_LIGHT_GREY_BRICK_FENCE);
                entries.add(Fieldstone.FAINT_LIGHT_GREY_BRICK_HOPPER);
                entries.add(Fieldstone.FAINT_LIGHT_GREY_BRICK_TIP);
                entries.add(Fieldstone.FAINT_LIGHT_GREY_BRICK_ARROW_SLIT);
                entries.add(Fieldstone.FAINT_LIGHT_GREY_BRICK_ARROW_SLIT_WINDOW);
                entries.add(Fieldstone.FAINT_LIGHT_GREY_BRICK_ARROW_SLIT_ORNATE);
                entries.add(Fieldstone.WHITE_LIGHT_BRICK);
                entries.add(Fieldstone.WHITE_LIGHT_BRICK_STAIRS);
                entries.add(Fieldstone.WHITE_LIGHT_BRICK_SLAB);
                entries.add(Fieldstone.WHITE_LIGHT_BRICK_WALL);
                entries.add(Fieldstone.WHITE_LIGHT_BRICK_FENCE);
                entries.add(Fieldstone.WHITE_LIGHT_BRICK_HOPPER);
                entries.add(Fieldstone.WHITE_LIGHT_BRICK_TIP);
                entries.add(Fieldstone.WHITE_LIGHT_BRICK_ARROW_SLIT);
                entries.add(Fieldstone.WHITE_LIGHT_BRICK_ARROW_SLIT_WINDOW);
                entries.add(Fieldstone.WHITE_LIGHT_BRICK_ARROW_SLIT_ORNATE);
                entries.add(Fieldstone.PALE_PINK_FAINT_LIGHT_BRICK);
                entries.add(Fieldstone.PALE_PINK_FAINT_LIGHT_BRICK_STAIRS);
                entries.add(Fieldstone.PALE_PINK_FAINT_LIGHT_BRICK_SLAB);
                entries.add(Fieldstone.PALE_PINK_FAINT_LIGHT_BRICK_WALL);
                entries.add(Fieldstone.PALE_PINK_FAINT_LIGHT_BRICK_FENCE);
                entries.add(Fieldstone.PALE_PINK_FAINT_LIGHT_BRICK_HOPPER);
                entries.add(Fieldstone.PALE_PINK_FAINT_LIGHT_BRICK_TIP);
                entries.add(Fieldstone.PALE_PINK_FAINT_LIGHT_BRICK_ARROW_SLIT);
                entries.add(Fieldstone.PALE_PINK_FAINT_LIGHT_BRICK_ARROW_SLIT_WINDOW);
                entries.add(Fieldstone.PALE_PINK_FAINT_LIGHT_BRICK_ARROW_SLIT_ORNATE);
                entries.add(Fieldstone.PALE_PINK_LIGHT_BRICK);
                entries.add(Fieldstone.PALE_PINK_LIGHT_BRICK_STAIRS);
                entries.add(Fieldstone.PALE_PINK_LIGHT_BRICK_SLAB);
                entries.add(Fieldstone.PALE_PINK_LIGHT_BRICK_WALL);
                entries.add(Fieldstone.PALE_PINK_LIGHT_BRICK_FENCE);
                entries.add(Fieldstone.PALE_PINK_LIGHT_BRICK_HOPPER);
                entries.add(Fieldstone.PALE_PINK_LIGHT_BRICK_TIP);
                entries.add(Fieldstone.PALE_PINK_LIGHT_BRICK_ARROW_SLIT);
                entries.add(Fieldstone.PALE_PINK_LIGHT_BRICK_ARROW_SLIT_WINDOW);
                entries.add(Fieldstone.PALE_PINK_LIGHT_BRICK_ARROW_SLIT_ORNATE);
                entries.add(Fieldstone.SANDY_PINK_FAINT_LIGHT_BRICK);
                entries.add(Fieldstone.SANDY_PINK_FAINT_LIGHT_BRICK_STAIRS);
                entries.add(Fieldstone.SANDY_PINK_FAINT_LIGHT_BRICK_SLAB);
                entries.add(Fieldstone.SANDY_PINK_FAINT_LIGHT_BRICK_WALL);
                entries.add(Fieldstone.SANDY_PINK_FAINT_LIGHT_BRICK_FENCE);
                entries.add(Fieldstone.SANDY_PINK_FAINT_LIGHT_BRICK_HOPPER);
                entries.add(Fieldstone.SANDY_PINK_FAINT_LIGHT_BRICK_TIP);
                entries.add(Fieldstone.SANDY_PINK_FAINT_LIGHT_BRICK_ARROW_SLIT);
                entries.add(Fieldstone.SANDY_PINK_FAINT_LIGHT_BRICK_ARROW_SLIT_WINDOW);
                entries.add(Fieldstone.SANDY_PINK_FAINT_LIGHT_BRICK_ARROW_SLIT_ORNATE);
                entries.add(Fieldstone.SANDY_PINK_LIGHT_BRICK);
                entries.add(Fieldstone.SANDY_PINK_LIGHT_BRICK_STAIRS);
                entries.add(Fieldstone.SANDY_PINK_LIGHT_BRICK_SLAB);
                entries.add(Fieldstone.SANDY_PINK_LIGHT_BRICK_WALL);
                entries.add(Fieldstone.SANDY_PINK_LIGHT_BRICK_FENCE);
                entries.add(Fieldstone.SANDY_PINK_LIGHT_BRICK_HOPPER);
                entries.add(Fieldstone.SANDY_PINK_LIGHT_BRICK_TIP);
                entries.add(Fieldstone.SANDY_PINK_LIGHT_BRICK_ARROW_SLIT);
                entries.add(Fieldstone.SANDY_PINK_LIGHT_BRICK_ARROW_SLIT_WINDOW);
                entries.add(Fieldstone.SANDY_PINK_LIGHT_BRICK_ARROW_SLIT_ORNATE);
                entries.add(Fieldstone.LIGHT_OLDTOWN_BRICK);
                entries.add(Fieldstone.LIGHT_OLDTOWN_BRICK_STAIRS);
                entries.add(Fieldstone.LIGHT_OLDTOWN_BRICK_SLAB);
                entries.add(Fieldstone.LIGHT_OLDTOWN_BRICK_WALL);
                entries.add(Fieldstone.LIGHT_OLDTOWN_BRICK_FENCE);
                entries.add(Fieldstone.LIGHT_OLDTOWN_BRICK_HOPPER);
                entries.add(Fieldstone.LIGHT_OLDTOWN_BRICK_TIP);
                entries.add(Fieldstone.LIGHT_OLDTOWN_BRICK_ARROW_SLIT);
                entries.add(Fieldstone.LIGHT_OLDTOWN_BRICK_ARROW_SLIT_WINDOW);
                entries.add(Fieldstone.LIGHT_OLDTOWN_BRICK_ARROW_SLIT_ORNATE);
                entries.add(Fieldstone.OLDTOWN_BRICK);
                entries.add(Fieldstone.OLDTOWN_BRICK_STAIRS);
                entries.add(Fieldstone.OLDTOWN_BRICK_SLAB);
                entries.add(Fieldstone.OLDTOWN_BRICK_WALL);
                entries.add(Fieldstone.OLDTOWN_BRICK_FENCE);
                entries.add(Fieldstone.OLDTOWN_BRICK_HOPPER);
                entries.add(Fieldstone.OLDTOWN_BRICK_TIP);
                entries.add(Fieldstone.OLDTOWN_BRICK_ARROW_SLIT);
                entries.add(Fieldstone.OLDTOWN_BRICK_ARROW_SLIT_WINDOW);
                entries.add(Fieldstone.OLDTOWN_BRICK_ARROW_SLIT_ORNATE);
                entries.add(Fieldstone.ARBOR_SMALL_BRICK);
                entries.add(Fieldstone.ARBOR_SMALL_BRICK_STAIRS);
                entries.add(Fieldstone.ARBOR_SMALL_BRICK_SLAB);
                entries.add(Fieldstone.ARBOR_SMALL_BRICK_WALL);
                entries.add(Fieldstone.ARBOR_SMALL_BRICK_FENCE);
                entries.add(Fieldstone.ARBOR_SMALL_BRICK_HOPPER);
                entries.add(Fieldstone.ARBOR_SMALL_BRICK_TIP);
                entries.add(Fieldstone.ARBOR_SMALL_BRICK_ARROW_SLIT);
                entries.add(Fieldstone.ARBOR_SMALL_BRICK_ARROW_SLIT_WINDOW);
                entries.add(Fieldstone.ARBOR_SMALL_BRICK_ARROW_SLIT_ORNATE);
                entries.add(Fieldstone.LANNISPORT_LIGHT_BRICK);
                entries.add(Fieldstone.LANNISPORT_LIGHT_BRICK_STAIRS);
                entries.add(Fieldstone.LANNISPORT_LIGHT_BRICK_SLAB);
                entries.add(Fieldstone.LANNISPORT_LIGHT_BRICK_WALL);
                entries.add(Fieldstone.LANNISPORT_LIGHT_BRICK_FENCE);
                entries.add(Fieldstone.LANNISPORT_LIGHT_BRICK_HOPPER);
                entries.add(Fieldstone.LANNISPORT_LIGHT_BRICK_TIP);
                entries.add(Fieldstone.LANNISPORT_LIGHT_BRICK_ARROW_SLIT);
                entries.add(Fieldstone.LANNISPORT_LIGHT_BRICK_ARROW_SLIT_WINDOW);
                entries.add(Fieldstone.LANNISPORT_LIGHT_BRICK_ARROW_SLIT_ORNATE);

            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("wcdom", "bricks"), FIELDSTONE);
    }
}



