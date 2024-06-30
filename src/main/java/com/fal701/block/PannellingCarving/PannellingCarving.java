package com.fal701.block.PannellingCarving;

import com.fal701.Rhumtopia;
import com.fal701.block.Cobblestone.Cobblestone;
import com.fal701.block.Z_custom.WcStairs;
import com.fal701.block.Z_custom.WcWall;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PannellingCarving {
    public static final Block GREY_KEYSTONE = registerBlock("grey_keystone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DRAGON_CARVING = registerBlock("dragon_carving", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WINTERFELL_CARVING = registerBlock("winterfell_carving", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block NETHER_BRICK_KEYSTONE = registerBlock("nether_brick_keystone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLE_KEYSTONE = registerBlock("cobble_keystone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDSTONE_PILLAR = registerBlock("sandstone_pillar", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ORANGE_BRICKS_ORNATE_TOP = registerBlock("small_orange_bricks_ornate_top", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ORANGE_BRICKS_ORNATE = registerBlock("small_orange_bricks_ornate", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLUEGREEN_CARVED_SANDSTONE = registerBlock("bluegreen_carved_sandstone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ORNATE_SANDSTONE = registerBlock("ornate_sandstone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ORNATE_MARBLE = registerBlock("ornate_marble", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REDORANGE_CARVED_SANDSTONE = registerBlock("redorange_carved_sandstone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAITH_CARVE_BLACK_BRICK = registerBlock("faith_carved_black_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAITH_CARVE_DARK_GREY_BRICK = registerBlock("faith_carved_dark_grey_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAITH_CARVE_BROWN_GREY_BRICK = registerBlock("faith_carved_brown_grey_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAITH_CARVE_SMALL_STONE_BRICK = registerBlock("faith_carved_small_stone_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAITH_CARVE_GREY_BRICK = registerBlock("faith_carved_grey_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAITH_CARVE_STONE_BRICK = registerBlock("faith_carved_stone_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAITH_CARVE_REACH_BRICK = registerBlock("faith_carved_reach_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAITH_CARVE_PINK_SANDSTONE = registerBlock("faith_carved_pink_sandstone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAITH_CARVE_DUN_BRICK = registerBlock("faith_carved_dun_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAITH_CARVE_COARSE_RED_BRICK = registerBlock("faith_carved_coarse_red_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAITH_CARVE_OLDTOWN_BRICK = registerBlock("faith_carved_oldtown_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAITH_CARVE_ARBOR_BRICK = registerBlock("faith_carved_arbor_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAITH_CARVE_WESTERLANDS_BRICK = registerBlock("faith_carved_westerlands_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAITH_CARVE_STORMLANDS_BRICK = registerBlock("faith_carved_stormlands_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_BRICK_ENGRAVED = registerBlock("black_brick_engraved", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_BRICK_ENGRAVED_WALL = registerBlock("black_brick_engraved_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block KL_DUN_CARVED_BRICK = registerBlock("kl_dun_carved_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block KL_DUN_CARVED_BRICK_WALL = registerBlock("kl_dun_carved_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block VIVID_DARK_SANDSTONE_ENGRAVED = registerBlock("vivid_dark_sandstone_engraved", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block VIVID_DARK_SANDSTONE_ENGRAVED_WALL = registerBlock("vivid_dark_sandstone_engraved_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_GREY_BRICK_ENGRAVED = registerBlock("dark_grey_brick_engraved", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_GREY_BRICK_ENGRAVED_WALL = registerBlock("dark_grey_brick_engraved_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COARSE_RED_CARVED_SANDSTONE = registerBlock("coarse_red_carved_sandstone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COARSE_RED_CARVED_SANDSTONE_WALL = registerBlock("coarse_red_carved_sandstone_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MONOCHROME_DARK_SANDSTONE_ENGRAVED = registerBlock("monochrome_dark_sandstone_engraved", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MONOCHROME_DARK_SANDSTONE_ENGRAVED_WALL = registerBlock("monochrome_dark_sandstone_engraved_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREEN_GREY_BRICK_ENGRAVED = registerBlock("green_grey_brick_engraved", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREEN_GREY_BRICK_ENGRAVED_WALL = registerBlock("green_grey_brick_engraved_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COARSE_DARK_RED_CARVED_SANDSTONE = registerBlock("coarse_dark_red_carved_sandstone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COARSE_DARK_RED_CARVED_SANDSTONE_WALL = registerBlock("coarse_dark_red_carved_sandstone_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DESERT_SANDSTONE_ENGRAVED = registerBlock("desert_sandstone_engraved", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DESERT_SANDSTONE_ENGRAVED_WALL = registerBlock("desert_sandstone_engraved_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREY_BRICK_ENGRAVED = registerBlock("grey_brick_engraved", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREY_BRICK_ENGRAVED_WALL = registerBlock("grey_brick_engraved_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_BRICK_ORNATE = registerBlock("arbor_brick_ornate", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_BRICK_ORNATE_WALL = registerBlock("arbor_brick_ornate_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_BRICK_ENGRAVED = registerBlock("white_brick_engraved", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_BRICK_ENGRAVED_WALL = registerBlock("white_brick_engraved_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block VIVID_SANDSTONE_ENGRAVED = registerBlock("vivid_sandstone_engraved", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block VIVID_SANDSTONE_ENGRAVED_WALL = registerBlock("vivid_sandstone_engraved_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PINK_SANDSTONE_ENGRAVED = registerBlock("pink_sandstone_engraved", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PINK_SANDSTONE_ENGRAVED_WALL = registerBlock("pink_sandstone_engraved_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MONOCHROME_SANDSTONE_ENGRAVED = registerBlock("monochrome_sandstone_engraved", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MONOCHROME_SANDSTONE_ENGRAVED_WALL = registerBlock("monochrome_sandstone_engraved_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_OAK_WOOD_PANELLING = registerBlock("reach_oak_wood_panelling", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block REACH_OAK_WOOD_PANELLING_WALL = registerBlock("reach_oak_wood_panelling_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block REACH_SPRUCE_WOOD_PANELLING = registerBlock("reach_spruce_wood_panelling", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block REACH_SPRUCE_WOOD_PANELLING_WALL = registerBlock("reach_spruce_wood_panelling_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block BLACK_GRANITE_POLISHED = registerBlock("black_granite_polished", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_GRANITE_POLISHED_STAIRS = registerBlock("black_granite_polished_stairs", new WcStairs(BLACK_GRANITE_POLISHED.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_GRANITE_POLISHED_SLAB = registerBlock("black_granite_polished_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_GRANITE_POLISHED_WALL = registerBlock("black_granite_polished_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WINTERFELL_GRANITE_POLISHED = registerBlock("winterfell_granite_polished", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WINTERFELL_GRANITE_POLISHED_STAIRS = registerBlock("winterfell_granite_polished_stairs", new WcStairs(WINTERFELL_GRANITE_POLISHED.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WINTERFELL_GRANITE_POLISHED_SLAB = registerBlock("winterfell_granite_polished_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WINTERFELL_GRANITE_POLISHED_WALL = registerBlock("winterfell_granite_polished_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREEN_GREY_GRANITE_POLISHED = registerBlock("green_grey_granite_polished", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREEN_GREY_GRANITE_POLISHED_STAIRS = registerBlock("green_grey_granite_polished_stairs", new WcStairs(GREEN_GREY_GRANITE_POLISHED.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREEN_GREY_GRANITE_POLISHED_SLAB = registerBlock("green_grey_granite_polished_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREEN_GREY_GRANITE_POLISHED_WALL = registerBlock("green_grey_granite_polished_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_GRANITE_POLISHED = registerBlock("white_granite_polished", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_GRANITE_POLISHED_STAIRS = registerBlock("white_granite_polished_stairs", new WcStairs(WHITE_GRANITE_POLISHED.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_GRANITE_POLISHED_SLAB = registerBlock("white_granite_polished_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_GRANITE_POLISHED_WALL = registerBlock("white_granite_polished_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_GRANITE_POLISHED = registerBlock("oldtown_granite_polished", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_GRANITE_POLISHED_STAIRS = registerBlock("oldtown_granite_polished_stairs", new WcStairs(OLDTOWN_GRANITE_POLISHED.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_GRANITE_POLISHED_SLAB = registerBlock("oldtown_granite_polished_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_GRANITE_POLISHED_WALL = registerBlock("oldtown_granite_polished_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block VIVID_SANDSTONE_POLISHED = registerBlock("vivid_sandstone_polished", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block VIVID_SANDSTONE_POLISHED_STAIRS = registerBlock("vivid_sandstone_polished_stairs", new WcStairs(VIVID_SANDSTONE_POLISHED.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block VIVID_SANDSTONE_POLISHED_SLAB = registerBlock("vivid_sandstone_polished_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block VIVID_SANDSTONE_POLISHED_WALL = registerBlock("vivid_sandstone_polished_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MONOCRHOME_DARK_SANDSTONE_POLISHED = registerBlock("monochrome_dark_sandstone_polished", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MONOCRHOME_DARK_SANDSTONE_POLISHED_STAIRS = registerBlock("monochrome_dark_sandstone_polished_stairs", new WcStairs(MONOCRHOME_DARK_SANDSTONE_POLISHED.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MONOCRHOME_DARK_SANDSTONE_POLISHED_SLAB = registerBlock("monochrome_dark_sandstone_polished_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MONOCRHOME_DARK_SANDSTONE_POLISHED_WALL = registerBlock("monochrome_dark_sandstone_polished_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DORNE_DARK_SANDSTONE_POLISHED = registerBlock("dorne_dark_sandstone_polished", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DORNE_DARK_SANDSTONE_POLISHED_STAIRS = registerBlock("dorne_dark_sandstone_polished_stairs", new WcStairs(DORNE_DARK_SANDSTONE_POLISHED.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DORNE_DARK_SANDSTONE_POLISHED_SLAB = registerBlock("dorne_dark_sandstone_polished_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DORNE_DARK_SANDSTONE_POLISHED_WALL = registerBlock("dorne_dark_sandstone_polished_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DORNE_LIGHT_TERRACOTTA_POLISHED = registerBlock("dorne_light_terracotta_polished", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DORNE_LIGHT_TERRACOTTA_POLISHED_STAIRS = registerBlock("dorne_light_terracotta_polished_stairs", new WcStairs(DORNE_LIGHT_TERRACOTTA_POLISHED.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DORNE_LIGHT_TERRACOTTA_POLISHED_SLAB = registerBlock("dorne_light_terracotta_polished_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DORNE_LIGHT_TERRACOTTA_POLISHED_WALL = registerBlock("dorne_light_terracotta_polished_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PINK_SANDSTONE_POLISHED = registerBlock("pink_sandstone_polished", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PINK_SANDSTONE_POLISHED_STAIRS = registerBlock("pink_sandstone_polished_stairs", new WcStairs(PINK_SANDSTONE_POLISHED.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PINK_SANDSTONE_POLISHED_SLAB = registerBlock("pink_sandstone_polished_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PINK_SANDSTONE_POLISHED_WALL = registerBlock("pink_sandstone_polished_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block KL_DUN_BRICK_POLISHED = registerBlock("kl_dun_brick_polished", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block KL_DUN_BRICK_POLISHED_STAIRS = registerBlock("kl_dun_brick_polished_stairs", new WcStairs(KL_DUN_BRICK_POLISHED.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block KL_DUN_BRICK_POLISHED_SLAB = registerBlock("kl_dun_brick_polished_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block KL_DUN_BRICK_POLISHED_WALL = registerBlock("kl_dun_brick_polished_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RED_SANDSTONE_POLISHED = registerBlock("red_sandstone_polished", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RED_SANDSTONE_POLISHED_STAIRS = registerBlock("red_sandstone_polished_stairs", new WcStairs(RED_SANDSTONE_POLISHED.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RED_SANDSTONE_POLISHED_SLAB = registerBlock("red_sandstone_polished_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RED_SANDSTONE_POLISHED_WALL = registerBlock("red_sandstone_polished_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_RED_SANDSTONE_POLISHED = registerBlock("dark_red_sandstone_polished", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_RED_SANDSTONE_POLISHED_STAIRS = registerBlock("dark_red_sandstone_polished_stairs", new WcStairs(DARK_RED_SANDSTONE_POLISHED.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_RED_SANDSTONE_POLISHED_SLAB = registerBlock("dark_red_sandstone_polished_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_RED_SANDSTONE_POLISHED_WALL = registerBlock("dark_red_sandstone_polished_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_BRICK_POLISHED = registerBlock("arbor_brick_polished", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_BRICK_POLISHED_STAIRS = registerBlock("arbor_brick_polished_stairs", new WcStairs(ARBOR_BRICK_POLISHED.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_BRICK_POLISHED_SLAB = registerBlock("arbor_brick_polished_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_BRICK_POLISHED_WALL = registerBlock("arbor_brick_polished_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block VIVID_DARK_SANDSTONE_POLISHED = registerBlock("vivid_dark_sandstone_polished", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block VIVID_DARK_SANDSTONE_POLISHED_STAIRS = registerBlock("vivid_dark_sandstone_polished_stairs", new WcStairs(VIVID_DARK_SANDSTONE_POLISHED.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block VIVID_DARK_SANDSTONE_POLISHED_SLAB = registerBlock("vivid_dark_sandstone_polished_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block VIVID_DARK_SANDSTONE_POLISHED_WALL = registerBlock("vivid_dark_sandstone_polished_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DESERT_SANDSTONE_POLISHED = registerBlock("desert_sandstone_polished", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DESERT_SANDSTONE_POLISHED_STAIRS = registerBlock("desert_sandstone_polished_stairs", new WcStairs(DESERT_SANDSTONE_POLISHED.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DESERT_SANDSTONE_POLISHED_SLAB = registerBlock("desert_sandstone_polished_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DESERT_SANDSTONE_POLISHED_WALL = registerBlock("desert_sandstone_polished_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DORNE_DULL_TERRACOTTA_POLISHED = registerBlock("dorne_dull_terracotta_polished", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DORNE_DULL_TERRACOTTA_POLISHED_STAIRS = registerBlock("dorne_dull_terracotta_polished_stairs", new WcStairs(DORNE_DULL_TERRACOTTA_POLISHED.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DORNE_DULL_TERRACOTTA_POLISHED_SLAB = registerBlock("dorne_dull_terracotta_polished_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DORNE_DULL_TERRACOTTA_POLISHED_WALL = registerBlock("dorne_dull_terracotta_polished_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block TERRACOTTA_POLISHED = registerBlock("terracotta_polished", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block TERRACOTTA_POLISHED_STAIRS = registerBlock("terracotta_polished_stairs", new WcStairs(TERRACOTTA_POLISHED.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block TERRACOTTA_POLISHED_SLAB = registerBlock("terracotta_polished_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block TERRACOTTA_POLISHED_WALL = registerBlock("terracotta_polished_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));



    public static final Block NORTHERN_CARVINGS = registerBlock("northern_carvings", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block NORTHERN_CARVINGS_2 = registerBlock("northern_carvings_2", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Rhumtopia.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Rhumtopia.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks() {

    }
}
