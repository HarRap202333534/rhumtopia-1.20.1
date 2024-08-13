package com.fal701.block.QuarterAshlar;

import com.fal701.Rhumtopia;
import com.fal701.block.Z_custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class QuarterAshlar {

    public static final Block BASALT_BRICK = registerBlock("basalt_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BASALT_BRICK_STAIRS = registerBlock("basalt_brick_stairs", new WcStairs(BASALT_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BASALT_BRICK_SLAB = registerBlock("basalt_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BASALT_BRICK_WALL = registerBlock("basalt_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BASALT_BRICK_FENCE = registerBlock("basalt_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BASALT_BRICK_HOPPER = registerBlock("basalt_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BASALT_BRICK_TIP = registerBlock("basalt_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BASALT_BRICK_ARROW_SLIT = registerBlock("basalt_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BASALT_BRICK_ARROW_SLIT_WINDOW = registerBlock("basalt_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BASALT_BRICK_ARROW_SLIT_ORNATE = registerBlock("basalt_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SMALL_DARK_GREY_BRICK = registerBlock("small_dark_grey_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_DARK_GREY_BRICK_STAIRS = registerBlock("small_dark_grey_brick_stairs", new WcStairs(SMALL_DARK_GREY_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_DARK_GREY_BRICK_SLAB = registerBlock("small_dark_grey_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_DARK_GREY_BRICK_WALL = registerBlock("small_dark_grey_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_DARK_GREY_BRICK_FENCE = registerBlock("small_dark_grey_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_DARK_GREY_BRICK_HOPPER = registerBlock("small_dark_grey_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_DARK_GREY_BRICK_TIP = registerBlock("small_dark_grey_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_DARK_GREY_BRICK_ARROW_SLIT = registerBlock("small_dark_grey_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_DARK_GREY_BRICK_ARROW_SLIT_WINDOW = registerBlock("small_dark_grey_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_DARK_GREY_BRICK_ARROW_SLIT_ORNATE = registerBlock("small_dark_grey_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SMALL_SMOOTH_BROWN_GREY_BRICK = registerBlock("small_smooth_brown_grey_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_BROWN_GREY_BRICK_STAIRS = registerBlock("small_smooth_brown_grey_brick_stairs", new WcStairs(SMALL_SMOOTH_BROWN_GREY_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_BROWN_GREY_BRICK_SLAB = registerBlock("small_smooth_brown_grey_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_BROWN_GREY_BRICK_WALL = registerBlock("small_smooth_brown_grey_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_BROWN_GREY_BRICK_FENCE = registerBlock("small_smooth_brown_grey_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_BROWN_GREY_BRICK_HOPPER = registerBlock("small_smooth_brown_grey_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_BROWN_GREY_BRICK_TIP = registerBlock("small_smooth_brown_grey_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_BROWN_GREY_BRICK_ARROW_SLIT = registerBlock("small_smooth_brown_grey_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_BROWN_GREY_BRICK_ARROW_SLIT_WINDOW = registerBlock("small_smooth_brown_grey_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_BROWN_GREY_BRICK_ARROW_SLIT_ORNATE = registerBlock("small_smooth_brown_grey_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SMALL_BROWN_GREY_BRICK = registerBlock("small_brown_grey_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_BROWN_GREY_BRICK_STAIRS = registerBlock("small_brown_grey_brick_stairs", new WcStairs(SMALL_BROWN_GREY_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_BROWN_GREY_BRICK_SLAB = registerBlock("small_brown_grey_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_BROWN_GREY_BRICK_WALL = registerBlock("small_brown_grey_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_BROWN_GREY_BRICK_FENCE = registerBlock("small_brown_grey_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_BROWN_GREY_BRICK_HOPPER = registerBlock("small_brown_grey_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_BROWN_GREY_BRICK_TIP = registerBlock("small_brown_grey_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_BROWN_GREY_BRICK_ARROW_SLIT = registerBlock("small_brown_grey_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_BROWN_GREY_BRICK_ARROW_SLIT_WINDOW = registerBlock("small_brown_grey_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_BROWN_GREY_BRICK_ARROW_SLIT_ORNATE = registerBlock("small_brown_grey_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SMALL_STONE_BRICK = registerBlock("small_stone_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_STONE_BRICK_STAIRS = registerBlock("small_stone_brick_stairs", new WcStairs(SMALL_STONE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_STONE_BRICK_SLAB = registerBlock("small_stone_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_STONE_BRICK_WALL = registerBlock("small_stone_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_STONE_BRICK_FENCE = registerBlock("small_stone_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_STONE_BRICK_HOPPER = registerBlock("small_stone_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_STONE_BRICK_TIP = registerBlock("small_stone_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_STONE_BRICK_ARROW_SLIT = registerBlock("small_stone_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_STONE_BRICK_ARROW_SLIT_WINDOW = registerBlock("small_stone_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_STONE_BRICK_ARROW_SLIT_ORNATE = registerBlock("small_stone_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block MOSSY_SMALL_STONE_BRICK = registerBlock("mossy_small_stone_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MOSSY_SMALL_STONE_BRICK_STAIRS = registerBlock("mossy_small_stone_brick_stairs", new WcStairs(MOSSY_SMALL_STONE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MOSSY_SMALL_STONE_BRICK_SLAB = registerBlock("mossy_small_stone_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MOSSY_SMALL_STONE_BRICK_WALL = registerBlock("mossy_small_stone_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MOSSY_SMALL_STONE_BRICK_FENCE = registerBlock("mossy_small_stone_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MOSSY_SMALL_STONE_BRICK_HOPPER = registerBlock("mossy_small_stone_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MOSSY_SMALL_STONE_BRICK_TIP = registerBlock("mossy_small_stone_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SMALL_SMOOTH_STONE_BRICK = registerBlock("small_smooth_stone_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_STONE_BRICK_STAIRS = registerBlock("small_smooth_stone_brick_stairs", new WcStairs(SMALL_SMOOTH_STONE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_STONE_BRICK_SLAB = registerBlock("small_smooth_stone_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_STONE_BRICK_WALL = registerBlock("small_smooth_stone_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_STONE_BRICK_FENCE = registerBlock("small_smooth_stone_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_STONE_BRICK_HOPPER = registerBlock("small_smooth_stone_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_STONE_BRICK_TIP = registerBlock("small_smooth_stone_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_STONE_BRICK_ARROW_SLIT = registerBlock("small_smooth_stone_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_STONE_BRICK_ARROW_SLIT_WINDOW = registerBlock("small_smooth_stone_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_STONE_BRICK_ARROW_SLIT_ORNATE = registerBlock("small_smooth_stone_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SMALL_FAINT_LIGHT_GREY_BRICK = registerBlock("small_faint_light_grey_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_FAINT_LIGHT_GREY_BRICK_STAIRS = registerBlock("small_faint_light_grey_brick_stairs", new WcStairs(SMALL_FAINT_LIGHT_GREY_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_FAINT_LIGHT_GREY_BRICK_SLAB = registerBlock("small_faint_light_grey_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_FAINT_LIGHT_GREY_BRICK_WALL = registerBlock("small_faint_light_grey_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_FAINT_LIGHT_GREY_BRICK_FENCE = registerBlock("small_faint_light_grey_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_FAINT_LIGHT_GREY_BRICK_HOPPER = registerBlock("small_faint_light_grey_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_FAINT_LIGHT_GREY_BRICK_TIP = registerBlock("small_faint_light_grey_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_FAINT_LIGHT_GREY_BRICK_ARROW_SLIT = registerBlock("small_faint_light_grey_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_FAINT_LIGHT_GREY_BRICK_ARROW_SLIT_WINDOW = registerBlock("small_faint_light_grey_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_FAINT_LIGHT_GREY_BRICK_ARROW_SLIT_ORNATE = registerBlock("small_faint_light_grey_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SMALL_WHITE_BRICK = registerBlock("small_white_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_WHITE_BRICK_STAIRS = registerBlock("small_white_brick_stairs", new WcStairs(SMALL_WHITE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_WHITE_BRICK_SLAB = registerBlock("small_white_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_WHITE_BRICK_WALL = registerBlock("small_white_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_WHITE_BRICK_FENCE = registerBlock("small_white_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_WHITE_BRICK_HOPPER = registerBlock("small_white_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_WHITE_BRICK_TIP = registerBlock("small_white_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_WHITE_BRICK_ARROW_SLIT = registerBlock("small_white_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_WHITE_BRICK_ARROW_SLIT_WINDOW = registerBlock("small_white_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_WHITE_BRICK_ARROW_SLIT_ORNATE = registerBlock("small_white_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block REACH_BRICK = registerBlock("reach_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_BRICK_STAIRS = registerBlock("reach_brick_stairs", new WcStairs(REACH_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_BRICK_SLAB = registerBlock("reach_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_BRICK_WALL = registerBlock("reach_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_BRICK_FENCE = registerBlock("reach_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_BRICK_HOPPER = registerBlock("reach_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_BRICK_TIP = registerBlock("reach_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_BRICK_ARROW_SLIT = registerBlock("reach_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_BRICK_ARROW_SLIT_WINDOW = registerBlock("reach_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_BRICK_ARROW_SLIT_ORNATE = registerBlock("reach_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SANDY_PINK_BRICK = registerBlock("sandy_pink_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_BRICK_STAIRS = registerBlock("sandy_pink_brick_stairs", new WcStairs(SANDY_PINK_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_BRICK_SLAB = registerBlock("sandy_pink_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_BRICK_WALL = registerBlock("sandy_pink_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_BRICK_FENCE = registerBlock("sandy_pink_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_BRICK_HOPPER = registerBlock("sandy_pink_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_BRICK_TIP = registerBlock("sandy_pink_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_BRICK_ARROW_SLIT = registerBlock("sandy_pink_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_BRICK_ARROW_SLIT_WINDOW = registerBlock("sandy_pink_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_BRICK_ARROW_SLIT_ORNATE = registerBlock("sandy_pink_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SMALL_KL_DUN_BRICK = registerBlock("small_kl_dun_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_KL_DUN_BRICK_STAIRS = registerBlock("small_kl_dun_brick_stairs", new WcStairs(SMALL_KL_DUN_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_KL_DUN_BRICK_SLAB = registerBlock("small_kl_dun_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_KL_DUN_BRICK_WALL = registerBlock("small_kl_dun_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_KL_DUN_BRICK_FENCE = registerBlock("small_kl_dun_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_KL_DUN_BRICK_HOPPER = registerBlock("small_kl_dun_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_KL_DUN_BRICK_TIP = registerBlock("small_kl_dun_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_KL_DUN_BRICK_ARROW_SLIT = registerBlock("small_kl_dun_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_KL_DUN_BRICK_ARROW_SLIT_WINDOW = registerBlock("small_kl_dun_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_KL_DUN_BRICK_ARROW_SLIT_ORNATE = registerBlock("small_kl_dun_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SMALL_COARSE_RED_BRICK = registerBlock("small_coarse_red_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_COARSE_RED_BRICK_STAIRS = registerBlock("small_coarse_red_brick_stairs", new WcStairs(SMALL_COARSE_RED_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_COARSE_RED_BRICK_SLAB = registerBlock("small_coarse_red_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_COARSE_RED_BRICK_WALL = registerBlock("small_coarse_red_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_COARSE_RED_BRICK_FENCE = registerBlock("small_coarse_red_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_COARSE_RED_BRICK_HOPPER = registerBlock("small_coarse_red_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_COARSE_RED_BRICK_TIP = registerBlock("small_coarse_red_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_COARSE_RED_BRICK_ARROW_SLIT = registerBlock("small_coarse_red_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_COARSE_RED_BRICK_ARROW_SLIT_WINDOW = registerBlock("small_coarse_red_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_COARSE_RED_BRICK_ARROW_SLIT_ORNATE = registerBlock("small_coarse_red_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block UNUSED_PURPLE_BRICK = registerBlock("unused_purple_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block UNUSED_PURPLE_BRICK_STAIRS = registerBlock("unused_purple_brick_stairs", new WcStairs(UNUSED_PURPLE_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block UNUSED_PURPLE_BRICK_SLAB = registerBlock("unused_purple_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block UNUSED_PURPLE_BRICK_WALL = registerBlock("unused_purple_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block UNUSED_PURPLE_BRICK_FENCE = registerBlock("unused_purple_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block UNUSED_PURPLE_BRICK_HOPPER = registerBlock("unused_purple_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block UNUSED_PURPLE_BRICK_TIP = registerBlock("unused_purple_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block UNUSED_PURPLE_BRICK_ARROW_SLIT = registerBlock("unused_purple_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block UNUSED_PURPLE_BRICK_ARROW_SLIT_WINDOW = registerBlock("unused_purple_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block UNUSED_PURPLE_BRICK_ARROW_SLIT_ORNATE = registerBlock("unused_purple_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block DARK_RED_BRICK = registerBlock("dark_red_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_RED_BRICK_STAIRS = registerBlock("dark_red_brick_stairs", new WcStairs(DARK_RED_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_RED_BRICK_SLAB = registerBlock("dark_red_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_RED_BRICK_WALL = registerBlock("dark_red_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_RED_BRICK_FENCE = registerBlock("dark_red_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_RED_BRICK_HOPPER = registerBlock("dark_red_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_RED_BRICK_TIP = registerBlock("dark_red_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_RED_BRICK_ARROW_SLIT = registerBlock("dark_red_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_RED_BRICK_ARROW_SLIT_WINDOW = registerBlock("dark_red_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_RED_BRICK_ARROW_SLIT_ORNATE = registerBlock("dark_red_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SMALL_OLDTOWN_BRICK = registerBlock("small_oldtown_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_OLDTOWN_BRICK_STAIRS = registerBlock("small_oldtown_brick_stairs", new WcStairs(SMALL_OLDTOWN_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_OLDTOWN_BRICK_SLAB = registerBlock("small_oldtown_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_OLDTOWN_BRICK_WALL = registerBlock("small_oldtown_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_OLDTOWN_BRICK_FENCE = registerBlock("small_oldtown_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_OLDTOWN_BRICK_HOPPER = registerBlock("small_oldtown_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_OLDTOWN_BRICK_TIP = registerBlock("small_oldtown_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_OLDTOWN_BRICK_ARROW_SLIT = registerBlock("small_oldtown_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_OLDTOWN_BRICK_ARROW_SLIT_WINDOW = registerBlock("small_oldtown_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_OLDTOWN_BRICK_ARROW_SLIT_ORNATE = registerBlock("small_oldtown_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SMALL_SMOOTH_OLDTOWN_BRICK = registerBlock("small_smooth_oldtown_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_OLDTOWN_BRICK_STAIRS = registerBlock("small_smooth_oldtown_brick_stairs", new WcStairs(SMALL_SMOOTH_OLDTOWN_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_OLDTOWN_BRICK_SLAB = registerBlock("small_smooth_oldtown_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_OLDTOWN_BRICK_WALL = registerBlock("small_smooth_oldtown_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_OLDTOWN_BRICK_FENCE = registerBlock("small_smooth_oldtown_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_OLDTOWN_BRICK_HOPPER = registerBlock("small_smooth_oldtown_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_OLDTOWN_BRICK_TIP = registerBlock("small_smooth_oldtown_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_OLDTOWN_BRICK_ARROW_SLIT = registerBlock("small_smooth_oldtown_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_OLDTOWN_BRICK_ARROW_SLIT_WINDOW = registerBlock("small_smooth_oldtown_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_OLDTOWN_BRICK_ARROW_SLIT_ORNATE = registerBlock("small_smooth_oldtown_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SMALL_ARBOR_BRICK = registerBlock("small_arbor_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ARBOR_BRICK_STAIRS = registerBlock("small_arbor_brick_stairs", new WcStairs(SMALL_ARBOR_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ARBOR_BRICK_SLAB = registerBlock("small_arbor_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ARBOR_BRICK_WALL = registerBlock("small_arbor_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ARBOR_BRICK_FENCE = registerBlock("small_arbor_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ARBOR_BRICK_HOPPER = registerBlock("small_arbor_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ARBOR_BRICK_TIP = registerBlock("small_arbor_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ARBOR_BRICK_ARROW_SLIT = registerBlock("small_arbor_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ARBOR_BRICK_ARROW_SLIT_WINDOW = registerBlock("small_arbor_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_ARBOR_BRICK_ARROW_SLIT_ORNATE = registerBlock("small_arbor_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SMALL_LANNISPORT_BRICK = registerBlock("small_lannisport_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_LANNISPORT_BRICK_STAIRS = registerBlock("small_lannisport_brick_stairs", new WcStairs(SMALL_LANNISPORT_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_LANNISPORT_BRICK_SLAB = registerBlock("small_lannisport_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_LANNISPORT_BRICK_WALL = registerBlock("small_lannisport_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_LANNISPORT_BRICK_FENCE = registerBlock("small_lannisport_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_LANNISPORT_BRICK_HOPPER = registerBlock("small_lannisport_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_LANNISPORT_BRICK_TIP = registerBlock("small_lannisport_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_LANNISPORT_BRICK_ARROW_SLIT = registerBlock("small_lannisport_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_LANNISPORT_BRICK_ARROW_SLIT_WINDOW = registerBlock("small_lannisport_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_LANNISPORT_BRICK_ARROW_SLIT_ORNATE = registerBlock("small_lannisport_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SMALL_SMOOTH_LANNISPORT_BRICK = registerBlock("small_smooth_lannisport_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_LANNISPORT_BRICK_STAIRS = registerBlock("small_smooth_lannisport_brick_stairs", new WcStairs(SMALL_SMOOTH_LANNISPORT_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_LANNISPORT_BRICK_SLAB = registerBlock("small_smooth_lannisport_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_LANNISPORT_BRICK_WALL = registerBlock("small_smooth_lannisport_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_LANNISPORT_BRICK_FENCE = registerBlock("small_smooth_lannisport_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_LANNISPORT_BRICK_HOPPER = registerBlock("small_smooth_lannisport_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_LANNISPORT_BRICK_TIP = registerBlock("small_smooth_lannisport_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_LANNISPORT_BRICK_ARROW_SLIT = registerBlock("small_smooth_lannisport_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_LANNISPORT_BRICK_ARROW_SLIT_WINDOW = registerBlock("small_smooth_lannisport_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_SMOOTH_LANNISPORT_BRICK_ARROW_SLIT_ORNATE = registerBlock("small_smooth_lannisport_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block UNUSED_BROWN_BRICK = registerBlock("unused_brown_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block UNUSED_BROWN_BRICK_STAIRS = registerBlock("unused_brown_brick_stairs", new WcStairs(UNUSED_BROWN_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block UNUSED_BROWN_BRICK_SLAB = registerBlock("unused_brown_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block UNUSED_BROWN_BRICK_WALL = registerBlock("unused_brown_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block UNUSED_BROWN_BRICK_FENCE = registerBlock("unused_brown_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block UNUSED_BROWN_BRICK_HOPPER = registerBlock("unused_brown_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block UNUSED_BROWN_BRICK_TIP = registerBlock("unused_brown_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block UNUSED_BROWN_BRICK_ARROW_SLIT = registerBlock("unused_brown_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block UNUSED_BROWN_BRICK_ARROW_SLIT_WINDOW = registerBlock("unused_brown_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block UNUSED_BROWN_BRICK_ARROW_SLIT_ORNATE = registerBlock("unused_brown_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block STORMLANDS_BRICK = registerBlock("stormlands_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_BRICK_STAIRS = registerBlock("stormlands_brick_stairs", new WcStairs(STORMLANDS_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_BRICK_SLAB = registerBlock("stormlands_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_BRICK_WALL = registerBlock("stormlands_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_BRICK_FENCE = registerBlock("stormlands_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_BRICK_HOPPER = registerBlock("stormlands_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_BRICK_TIP = registerBlock("stormlands_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_BRICK_ARROW_SLIT = registerBlock("stormlands_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_BRICK_ARROW_SLIT_WINDOW = registerBlock("stormlands_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_BRICK_ARROW_SLIT_ORNATE = registerBlock("stormlands_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SMALL_TERRACOTTA_BRICK = registerBlock("small_terracotta_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_TERRACOTTA_BRICK_STAIRS = registerBlock("small_terracotta_brick_stairs", new WcStairs(SMALL_TERRACOTTA_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_TERRACOTTA_BRICK_SLAB = registerBlock("small_terracotta_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_TERRACOTTA_BRICK_WALL = registerBlock("small_terracotta_brick_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_TERRACOTTA_BRICK_FENCE = registerBlock("small_terracotta_brick_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_TERRACOTTA_BRICK_HOPPER = registerBlock("small_terracotta_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_TERRACOTTA_BRICK_TIP = registerBlock("small_terracotta_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_TERRACOTTA_BRICK_ARROW_SLIT = registerBlock("small_terracotta_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_TERRACOTTA_BRICK_ARROW_SLIT_WINDOW = registerBlock("small_terracotta_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SMALL_TERRACOTTA_BRICK_ARROW_SLIT_ORNATE = registerBlock("small_terracotta_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));


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
