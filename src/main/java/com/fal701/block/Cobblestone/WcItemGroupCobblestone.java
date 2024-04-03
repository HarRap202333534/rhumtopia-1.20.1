package com.fal701.block.Cobblestone;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupCobblestone {
    public static final ItemGroup COBBLESTONE = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Items.COBBLESTONE))
            .displayName(Text.translatable("itemGroup.wcrhum.cobblestone"))
            .entries((context, entries) -> {
                entries.add(Cobblestone.FLAGSTONE);
                entries.add(Cobblestone.SANDY_STONE_SLAB);
                entries.add(Blocks.COBBLESTONE);
                entries.add(Blocks.COBBLESTONE_STAIRS);
                entries.add(Blocks.COBBLESTONE_SLAB);
                entries.add(Blocks.COBBLESTONE_WALL);
                entries.add(Cobblestone.COBBLESTONE_FENCE);
                entries.add(Cobblestone.COBBLESTONE_HOPPER);
                entries.add(Cobblestone.COBBLESTONE_TIP); //1
                entries.add(Blocks.MOSSY_COBBLESTONE);
                entries.add(Blocks.MOSSY_COBBLESTONE_STAIRS);
                entries.add(Blocks.MOSSY_COBBLESTONE_SLAB);
                entries.add(Blocks.MOSSY_COBBLESTONE_WALL);
                entries.add(Cobblestone.MOSSY_COBBLESTONE_FENCE);
                entries.add(Cobblestone.MOSSY_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.MOSSY_COBBLESTONE_TIP); //2
                entries.add(Cobblestone.BASALT_COBBLESTONE);
                entries.add(Cobblestone.BASALT_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.BASALT_COBBLESTONE_SLAB);
                entries.add(Cobblestone.BASALT_COBBLESTONE_WALL);
                entries.add(Cobblestone.BASALT_COBBLESTONE_FENCE);
                entries.add(Cobblestone.BASALT_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.BASALT_COBBLESTONE_TIP); //2
                entries.add(Cobblestone.BEDROCK);
                entries.add(Cobblestone.BEDROCK_STAIRS);
                entries.add(Cobblestone.BEDROCK_SLAB);
                entries.add(Cobblestone.BEDROCK_WALL);
                entries.add(Cobblestone.BEDROCK_FENCE);
                entries.add(Cobblestone.BEDROCK_HOPPER);
                entries.add(Cobblestone.BEDROCK_TIP); //3
                entries.add(Cobblestone.VALYRIAN_STONE);
                entries.add(Cobblestone.VALYRIAN_STONE_STAIRS);
                entries.add(Cobblestone.VALYRIAN_STONE_SLAB);
                entries.add(Cobblestone.VALYRIAN_STONE_WALL);
                entries.add(Cobblestone.VALYRIAN_STONE_FENCE);
                entries.add(Cobblestone.VALYRIAN_STONE_HOPPER);
                entries.add(Cobblestone.VALYRIAN_STONE_TIP); //4
                entries.add(Cobblestone.DARK_GREY_COBBLESTONE);
                entries.add(Cobblestone.DARK_GREY_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.DARK_GREY_COBBLESTONE_SLAB);
                entries.add(Cobblestone.DARK_GREY_COBBLESTONE_WALL);
                entries.add(Cobblestone.DARK_GREY_COBBLESTONE_FENCE);
                entries.add(Cobblestone.DARK_GREY_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.DARK_GREY_COBBLESTONE_TIP); //5
                entries.add(Cobblestone.DARK_GREY_DARK_COBBLESTONE);
                entries.add(Cobblestone.DARK_GREY_DARK_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.DARK_GREY_DARK_COBBLESTONE_SLAB);
                entries.add(Cobblestone.DARK_GREY_DARK_COBBLESTONE_WALL);
                entries.add(Cobblestone.DARK_GREY_DARK_COBBLESTONE_FENCE);
                entries.add(Cobblestone.DARK_GREY_DARK_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.DARK_GREY_DARK_COBBLESTONE_TIP); //6
                entries.add(Cobblestone.ICY_NORTHERN_COBBLESTONE);
                entries.add(Cobblestone.ICY_NORTHERN_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.ICY_NORTHERN_COBBLESTONE_SLAB);
                entries.add(Cobblestone.ICY_NORTHERN_COBBLESTONE_WALL);
                entries.add(Cobblestone.ICY_NORTHERN_COBBLESTONE_FENCE);
                entries.add(Cobblestone.ICY_NORTHERN_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.ICY_NORTHERN_COBBLESTONE_TIP); //7
                entries.add(Cobblestone.NORTHERN_COBBLESTONE);
                entries.add(Cobblestone.NORTHERN_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.NORTHERN_COBBLESTONE_SLAB);
                entries.add(Cobblestone.NORTHERN_COBBLESTONE_WALL);
                entries.add(Cobblestone.NORTHERN_COBBLESTONE_FENCE);
                entries.add(Cobblestone.NORTHERN_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.NORTHERN_COBBLESTONE_TIP); //8
                entries.add(Cobblestone.BROWN_GREY_COBBLESTONE);
                entries.add(Cobblestone.BROWN_GREY_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.BROWN_GREY_COBBLESTONE_SLAB);
                entries.add(Cobblestone.BROWN_GREY_COBBLESTONE_WALL);
                entries.add(Cobblestone.BROWN_GREY_COBBLESTONE_FENCE);
                entries.add(Cobblestone.BROWN_GREY_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.BROWN_GREY_COBBLESTONE_TIP); //9
                entries.add(Cobblestone.BROWN_GREY_DARK_COBBLESTONE);
                entries.add(Cobblestone.BROWN_GREY_DARK_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.BROWN_GREY_DARK_COBBLESTONE_SLAB);
                entries.add(Cobblestone.BROWN_GREY_DARK_COBBLESTONE_WALL);
                entries.add(Cobblestone.BROWN_GREY_DARK_COBBLESTONE_FENCE);
                entries.add(Cobblestone.BROWN_GREY_DARK_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.BROWN_GREY_DARK_COBBLESTONE_TIP); //10
                entries.add(Cobblestone.BROWN_GREY_COBBLE);
                entries.add(Cobblestone.BROWN_GREY_COBBLE_STAIRS);
                entries.add(Cobblestone.BROWN_GREY_COBBLE_SLAB);
                entries.add(Cobblestone.BROWN_GREY_COBBLE_WALL);
                entries.add(Cobblestone.BROWN_GREY_COBBLE_FENCE);
                entries.add(Cobblestone.BROWN_GREY_COBBLE_HOPPER);
                entries.add(Cobblestone.BROWN_GREY_COBBLE_TIP); //11
                entries.add(Cobblestone.BROWN_GREY_RIVER_COBBLE);
                entries.add(Cobblestone.BROWN_GREY_RIVER_COBBLE_STAIRS);
                entries.add(Cobblestone.BROWN_GREY_RIVER_COBBLE_SLAB);
                entries.add(Cobblestone.BROWN_GREY_RIVER_COBBLE_WALL);
                entries.add(Cobblestone.BROWN_GREY_RIVER_COBBLE_FENCE);
                entries.add(Cobblestone.BROWN_GREY_RIVER_COBBLE_HOPPER);
                entries.add(Cobblestone.BROWN_GREY_RIVER_COBBLE_TIP); //12
                entries.add(Cobblestone.DARK_COBBLESTONE);
                entries.add(Cobblestone.DARK_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.DARK_COBBLESTONE_SLAB);
                entries.add(Cobblestone.DARK_COBBLESTONE_WALL);
                entries.add(Cobblestone.DARK_COBBLESTONE_FENCE);
                entries.add(Cobblestone.DARK_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.DARK_COBBLESTONE_TIP); //13
                entries.add(Cobblestone.GREEN_GREY_COBBLESTONE);
                entries.add(Cobblestone.GREEN_GREY_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.GREEN_GREY_COBBLESTONE_SLAB);
                entries.add(Cobblestone.GREEN_GREY_COBBLESTONE_WALL);
                entries.add(Cobblestone.GREEN_GREY_COBBLESTONE_FENCE);
                entries.add(Cobblestone.GREEN_GREY_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.GREEN_GREY_COBBLESTONE_TIP); //14
                entries.add(Cobblestone.GREY_DARK_COBBLESTONE);
                entries.add(Cobblestone.GREY_DARK_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.GREY_DARK_COBBLESTONE_SLAB);
                entries.add(Cobblestone.GREY_DARK_COBBLESTONE_WALL);
                entries.add(Cobblestone.GREY_DARK_COBBLESTONE_FENCE);
                entries.add(Cobblestone.GREY_DARK_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.GREY_DARK_COBBLESTONE_TIP); //15
                entries.add(Cobblestone.RIVER_COBBLE);
                entries.add(Cobblestone.RIVER_COBBLE_STAIRS);
                entries.add(Cobblestone.RIVER_COBBLE_SLAB);
                entries.add(Cobblestone.RIVER_COBBLE_WALL);
                entries.add(Cobblestone.RIVER_COBBLE_FENCE);
                entries.add(Cobblestone.RIVER_COBBLE_HOPPER);
                entries.add(Cobblestone.RIVER_COBBLE_TIP); //16
                entries.add(Cobblestone.FAINT_LIGHT_GREY_COBBLESTONE);
                entries.add(Cobblestone.FAINT_LIGHT_GREY_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.FAINT_LIGHT_GREY_COBBLESTONE_SLAB);
                entries.add(Cobblestone.FAINT_LIGHT_GREY_COBBLESTONE_WALL);
                entries.add(Cobblestone.FAINT_LIGHT_GREY_COBBLESTONE_FENCE);
                entries.add(Cobblestone.FAINT_LIGHT_GREY_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.FAINT_LIGHT_GREY_COBBLESTONE_TIP); //17
                entries.add(Cobblestone.FAINT_LIGHT_GREY_DARK_COBBLESTONE);
                entries.add(Cobblestone.FAINT_LIGHT_GREY_DARK_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.FAINT_LIGHT_GREY_DARK_COBBLESTONE_SLAB);
                entries.add(Cobblestone.FAINT_LIGHT_GREY_DARK_COBBLESTONE_WALL);
                entries.add(Cobblestone.FAINT_LIGHT_GREY_DARK_COBBLESTONE_FENCE);
                entries.add(Cobblestone.FAINT_LIGHT_GREY_DARK_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.FAINT_LIGHT_GREY_DARK_COBBLESTONE_TIP); //18
                entries.add(Cobblestone.WHITE_COBBLESTONE);
                entries.add(Cobblestone.WHITE_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.WHITE_COBBLESTONE_SLAB);
                entries.add(Cobblestone.WHITE_COBBLESTONE_WALL);
                entries.add(Cobblestone.WHITE_COBBLESTONE_FENCE);
                entries.add(Cobblestone.WHITE_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.WHITE_COBBLESTONE_TIP); //19
                entries.add(Cobblestone.WHITE_DARK_COBBLESTONE);
                entries.add(Cobblestone.WHITE_DARK_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.WHITE_DARK_COBBLESTONE_SLAB);
                entries.add(Cobblestone.WHITE_DARK_COBBLESTONE_WALL);
                entries.add(Cobblestone.WHITE_DARK_COBBLESTONE_FENCE);
                entries.add(Cobblestone.WHITE_DARK_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.WHITE_DARK_COBBLESTONE_TIP); //20
                entries.add(Cobblestone.REACH_COBBLESTONE);
                entries.add(Cobblestone.REACH_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.REACH_COBBLESTONE_SLAB);
                entries.add(Cobblestone.REACH_COBBLESTONE_WALL);
                entries.add(Cobblestone.REACH_COBBLESTONE_FENCE);
                entries.add(Cobblestone.REACH_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.REACH_COBBLESTONE_TIP); //21
                entries.add(Cobblestone.REACH_DARK_COBBLESTONE);
                entries.add(Cobblestone.REACH_DARK_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.REACH_DARK_COBBLESTONE_SLAB);
                entries.add(Cobblestone.REACH_DARK_COBBLESTONE_WALL);
                entries.add(Cobblestone.REACH_DARK_COBBLESTONE_FENCE);
                entries.add(Cobblestone.REACH_DARK_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.REACH_DARK_COBBLESTONE_TIP); //22
                entries.add(Cobblestone.SANDY_PINK_COBBLESTONE);
                entries.add(Cobblestone.SANDY_PINK_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.SANDY_PINK_COBBLESTONE_SLAB);
                entries.add(Cobblestone.SANDY_PINK_COBBLESTONE_WALL);
                entries.add(Cobblestone.SANDY_PINK_COBBLESTONE_FENCE);
                entries.add(Cobblestone.SANDY_PINK_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.SANDY_PINK_COBBLESTONE_TIP); //23
                entries.add(Cobblestone.SANDY_PINK_DARK_COBBLESTONE);
                entries.add(Cobblestone.SANDY_PINK_DARK_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.SANDY_PINK_DARK_COBBLESTONE_SLAB);
                entries.add(Cobblestone.SANDY_PINK_DARK_COBBLESTONE_WALL);
                entries.add(Cobblestone.SANDY_PINK_DARK_COBBLESTONE_FENCE);
                entries.add(Cobblestone.SANDY_PINK_DARK_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.SANDY_PINK_DARK_COBBLESTONE_TIP); //24
                entries.add(Cobblestone.KL_DUN_COBBLE);
                entries.add(Cobblestone.KL_DUN_COBBLE_STAIRS);
                entries.add(Cobblestone.KL_DUN_COBBLE_SLAB);
                entries.add(Cobblestone.KL_DUN_COBBLE_WALL);
                entries.add(Cobblestone.KL_DUN_COBBLE_FENCE);
                entries.add(Cobblestone.KL_DUN_COBBLE_HOPPER);
                entries.add(Cobblestone.KL_DUN_COBBLE_TIP); //25
                entries.add(Cobblestone.RED_COBBLESTONE);
                entries.add(Cobblestone.RED_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.RED_COBBLESTONE_SLAB);
                entries.add(Cobblestone.RED_COBBLESTONE_WALL);
                entries.add(Cobblestone.RED_COBBLESTONE_FENCE);
                entries.add(Cobblestone.RED_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.RED_COBBLESTONE_TIP); //26
                entries.add(Cobblestone.COARSE_RED_DARK_COBBLESTONE);
                entries.add(Cobblestone.COARSE_RED_DARK_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.COARSE_RED_DARK_COBBLESTONE_SLAB);
                entries.add(Cobblestone.COARSE_RED_DARK_COBBLESTONE_WALL);
                entries.add(Cobblestone.COARSE_RED_DARK_COBBLESTONE_FENCE);
                entries.add(Cobblestone.COARSE_RED_DARK_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.COARSE_RED_DARK_COBBLESTONE_TIP); //27
                entries.add(Cobblestone.OLDTOWN_COBBLESTONE);
                entries.add(Cobblestone.OLDTOWN_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.OLDTOWN_COBBLESTONE_SLAB);
                entries.add(Cobblestone.OLDTOWN_COBBLESTONE_WALL);
                entries.add(Cobblestone.OLDTOWN_COBBLESTONE_FENCE);
                entries.add(Cobblestone.OLDTOWN_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.OLDTOWN_COBBLESTONE_TIP); //28
                entries.add(Cobblestone.OLDTOWN_DARK_COBBLESTONE);
                entries.add(Cobblestone.OLDTOWN_DARK_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.OLDTOWN_DARK_COBBLESTONE_SLAB);
                entries.add(Cobblestone.OLDTOWN_DARK_COBBLESTONE_WALL);
                entries.add(Cobblestone.OLDTOWN_DARK_COBBLESTONE_FENCE);
                entries.add(Cobblestone.OLDTOWN_DARK_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.OLDTOWN_DARK_COBBLESTONE_TIP); //29
                entries.add(Cobblestone.ARBOR_COBBLESTONE);
                entries.add(Cobblestone.ARBOR_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.ARBOR_COBBLESTONE_SLAB);
                entries.add(Cobblestone.ARBOR_COBBLESTONE_WALL);
                entries.add(Cobblestone.ARBOR_COBBLESTONE_FENCE);
                entries.add(Cobblestone.ARBOR_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.ARBOR_COBBLESTONE_TIP); //30
                entries.add(Cobblestone.ARBOR_DARK_COBBLESTONE);
                entries.add(Cobblestone.ARBOR_DARK_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.ARBOR_DARK_COBBLESTONE_SLAB);
                entries.add(Cobblestone.ARBOR_DARK_COBBLESTONE_WALL);
                entries.add(Cobblestone.ARBOR_DARK_COBBLESTONE_FENCE);
                entries.add(Cobblestone.ARBOR_DARK_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.ARBOR_DARK_COBBLESTONE_TIP); //31
                entries.add(Cobblestone.LANNISPORT_COBBLESTONE);
                entries.add(Cobblestone.LANNISPORT_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.LANNISPORT_COBBLESTONE_SLAB);
                entries.add(Cobblestone.LANNISPORT_COBBLESTONE_WALL);
                entries.add(Cobblestone.LANNISPORT_COBBLESTONE_FENCE);
                entries.add(Cobblestone.LANNISPORT_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.LANNISPORT_COBBLESTONE_TIP); //32
                entries.add(Cobblestone.LANNISPORT_DARK_COBBLESTONE);
                entries.add(Cobblestone.LANNISPORT_DARK_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.LANNISPORT_DARK_COBBLESTONE_SLAB);
                entries.add(Cobblestone.LANNISPORT_DARK_COBBLESTONE_WALL);
                entries.add(Cobblestone.LANNISPORT_DARK_COBBLESTONE_FENCE);
                entries.add(Cobblestone.LANNISPORT_DARK_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.LANNISPORT_DARK_COBBLESTONE_TIP); //33
                entries.add(Cobblestone.STORMLAND_COBBLESTONE);
                entries.add(Cobblestone.STORMLAND_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.STORMLAND_COBBLESTONE_SLAB);
                entries.add(Cobblestone.STORMLAND_COBBLESTONE_WALL);
                entries.add(Cobblestone.STORMLAND_COBBLESTONE_FENCE);
                entries.add(Cobblestone.STORMLAND_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.STORMLAND_COBBLESTONE_TIP); //34
                entries.add(Cobblestone.STORMLAND_DARK_COBBLESTONE);
                entries.add(Cobblestone.STORMLAND_DARK_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.STORMLAND_DARK_COBBLESTONE_SLAB);
                entries.add(Cobblestone.STORMLAND_DARK_COBBLESTONE_WALL);
                entries.add(Cobblestone.STORMLAND_DARK_COBBLESTONE_FENCE);
                entries.add(Cobblestone.STORMLAND_DARK_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.STORMLAND_DARK_COBBLESTONE_TIP); //35
                entries.add(Cobblestone.STORMLAND_MOSSY_COBBLESTONE);
                entries.add(Cobblestone.STORMLAND_MOSSY_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.STORMLAND_MOSSY_COBBLESTONE_SLAB);
                entries.add(Cobblestone.STORMLAND_MOSSY_COBBLESTONE_WALL);
                entries.add(Cobblestone.STORMLAND_MOSSY_COBBLESTONE_FENCE);
                entries.add(Cobblestone.STORMLAND_MOSSY_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.STORMLAND_MOSSY_COBBLESTONE_TIP); //36
                entries.add(Cobblestone.TERRACOTTA_COBBLESTONE);
                entries.add(Cobblestone.TERRACOTTA_COBBLESTONE_STAIRS);
                entries.add(Cobblestone.TERRACOTTA_COBBLESTONE_SLAB);
                entries.add(Cobblestone.TERRACOTTA_COBBLESTONE_WALL);
                entries.add(Cobblestone.TERRACOTTA_COBBLESTONE_FENCE);
                entries.add(Cobblestone.TERRACOTTA_COBBLESTONE_HOPPER);
                entries.add(Cobblestone.TERRACOTTA_COBBLESTONE_TIP); //37
            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier("wcdom", "bricks"), COBBLESTONE);
    }
}
