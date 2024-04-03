package com.fal701.block;

import com.fal701.block.custom.WcArrowSlit;
import com.fal701.block.custom.WcHopper;
import com.fal701.block.custom.WcHopperU;
import com.fal701.block.custom.WcStairs;
import net.fabricmc.fabric.api.block.v1.FabricBlockState;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Fieldstone {
    public static final Block FAINT_BROWN_GREY_BRICK = registerBlock("faint_brown_grey_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_BROWN_GREY_BRICK_STAIRS = registerBlock("faint_brown_grey_brick_stairs", new WcStairs(Fieldstone.FAINT_BROWN_GREY_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_BROWN_GREY_BRICK_SLAB = registerBlock("faint_brown_grey_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_BROWN_GREY_BRICK_WALL = registerBlock("faint_brown_grey_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_BROWN_GREY_BRICK_FENCE = registerBlock("faint_brown_grey_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_BROWN_GREY_BRICK_HOPPER = registerBlock("faint_brown_grey_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_BROWN_GREY_BRICK_TIP = registerBlock("faint_brown_grey_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_BROWN_GREY_BRICK_ARROW_SLIT = registerBlock("faint_brown_grey_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_BROWN_GREY_BRICK_ARROW_SLIT_WINDOW = registerBlock("faint_brown_grey_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_BROWN_GREY_BRICK_ARROW_SLIT_ORNATE = registerBlock("faint_brown_grey_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block BROWN_GREY_BRICK = registerBlock("brown_grey_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_BRICK_STAIRS = registerBlock("brown_grey_brick_stairs", new WcStairs(Fieldstone.FAINT_BROWN_GREY_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_BRICK_SLAB = registerBlock("brown_grey_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_BRICK_WALL = registerBlock("brown_grey_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_BRICK_FENCE = registerBlock("brown_grey_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_BRICK_HOPPER = registerBlock("brown_grey_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_BRICK_TIP = registerBlock("brown_grey_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_BRICK_ARROW_SLIT = registerBlock("brown_grey_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_BRICK_ARROW_SLIT_WINDOW = registerBlock("brown_grey_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_BRICK_ARROW_SLIT_ORNATE = registerBlock("brown_grey_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block LIGHT_GREY_BRICK = registerBlock("light_grey_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LIGHT_GREY_BRICK_STAIRS = registerBlock("light_grey_brick_stairs", new WcStairs(Fieldstone.FAINT_BROWN_GREY_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LIGHT_GREY_BRICK_SLAB = registerBlock("light_grey_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LIGHT_GREY_BRICK_WALL = registerBlock("light_grey_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LIGHT_GREY_BRICK_FENCE = registerBlock("light_grey_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LIGHT_GREY_BRICK_HOPPER = registerBlock("light_grey_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LIGHT_GREY_BRICK_TIP = registerBlock("light_grey_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LIGHT_GREY_BRICK_ARROW_SLIT = registerBlock("light_grey_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LIGHT_GREY_BRICK_ARROW_SLIT_WINDOW = registerBlock("light_grey_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LIGHT_GREY_BRICK_ARROW_SLIT_ORNATE = registerBlock("light_grey_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block FAINT_LIGHT_GREY_BRICK = registerBlock("faint_light_grey_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_BRICK_STAIRS = registerBlock("faint_light_grey_brick_stairs", new WcStairs(Fieldstone.FAINT_BROWN_GREY_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_BRICK_SLAB = registerBlock("faint_light_grey_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_BRICK_WALL = registerBlock("faint_light_grey_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_BRICK_FENCE = registerBlock("faint_light_grey_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_BRICK_HOPPER = registerBlock("faint_light_grey_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_BRICK_TIP = registerBlock("faint_light_grey_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_BRICK_ARROW_SLIT = registerBlock("faint_light_grey_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_BRICK_ARROW_SLIT_WINDOW = registerBlock("faint_light_grey_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_BRICK_ARROW_SLIT_ORNATE = registerBlock("faint_light_grey_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block WHITE_LIGHT_BRICK = registerBlock("white_light_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_LIGHT_BRICK_STAIRS = registerBlock("white_light_brick_stairs", new WcStairs(Fieldstone.FAINT_BROWN_GREY_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_LIGHT_BRICK_SLAB = registerBlock("white_light_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_LIGHT_BRICK_WALL = registerBlock("white_light_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_LIGHT_BRICK_FENCE = registerBlock("white_light_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_LIGHT_BRICK_HOPPER = registerBlock("white_light_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_LIGHT_BRICK_TIP = registerBlock("white_light_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_LIGHT_BRICK_ARROW_SLIT = registerBlock("white_light_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_LIGHT_BRICK_ARROW_SLIT_WINDOW = registerBlock("white_light_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_LIGHT_BRICK_ARROW_SLIT_ORNATE = registerBlock("white_light_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block REACH_LIGHT_BRICK = registerBlock("reach_light_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_LIGHT_BRICK_STAIRS = registerBlock("reach_light_brick_stairs", new WcStairs(Fieldstone.FAINT_BROWN_GREY_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_LIGHT_BRICK_SLAB = registerBlock("reach_light_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_LIGHT_BRICK_WALL = registerBlock("reach_light_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_LIGHT_BRICK_FENCE = registerBlock("reach_light_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_LIGHT_BRICK_HOPPER = registerBlock("reach_light_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_LIGHT_BRICK_TIP = registerBlock("reach_light_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_LIGHT_BRICK_ARROW_SLIT = registerBlock("reach_light_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_LIGHT_BRICK_ARROW_SLIT_WINDOW = registerBlock("reach_light_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_LIGHT_BRICK_ARROW_SLIT_ORNATE = registerBlock("reach_light_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block PALE_PINK_FAINT_LIGHT_BRICK = registerBlock("pale_pink_faint_light_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PALE_PINK_FAINT_LIGHT_BRICK_STAIRS = registerBlock("pale_pink_faint_light_brick_stairs", new WcStairs(Fieldstone.FAINT_BROWN_GREY_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PALE_PINK_FAINT_LIGHT_BRICK_SLAB = registerBlock("pale_pink_faint_light_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PALE_PINK_FAINT_LIGHT_BRICK_WALL = registerBlock("pale_pink_faint_light_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PALE_PINK_FAINT_LIGHT_BRICK_FENCE = registerBlock("pale_pink_faint_light_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PALE_PINK_FAINT_LIGHT_BRICK_HOPPER = registerBlock("pale_pink_faint_light_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PALE_PINK_FAINT_LIGHT_BRICK_TIP = registerBlock("pale_pink_faint_light_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PALE_PINK_FAINT_LIGHT_BRICK_ARROW_SLIT = registerBlock("pale_pink_faint_light_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PALE_PINK_FAINT_LIGHT_BRICK_ARROW_SLIT_WINDOW = registerBlock("pale_pink_faint_light_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PALE_PINK_FAINT_LIGHT_BRICK_ARROW_SLIT_ORNATE = registerBlock("pale_pink_faint_light_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block PALE_PINK_LIGHT_BRICK = registerBlock("pale_pink_light_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PALE_PINK_LIGHT_BRICK_STAIRS = registerBlock("pale_pink_light_brick_stairs", new WcStairs(Fieldstone.FAINT_BROWN_GREY_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PALE_PINK_LIGHT_BRICK_SLAB = registerBlock("pale_pink_light_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PALE_PINK_LIGHT_BRICK_WALL = registerBlock("pale_pink_light_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PALE_PINK_LIGHT_BRICK_FENCE = registerBlock("pale_pink_light_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PALE_PINK_LIGHT_BRICK_HOPPER = registerBlock("pale_pink_light_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PALE_PINK_LIGHT_BRICK_TIP = registerBlock("pale_pink_light_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PALE_PINK_LIGHT_BRICK_ARROW_SLIT = registerBlock("pale_pink_light_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PALE_PINK_LIGHT_BRICK_ARROW_SLIT_WINDOW = registerBlock("pale_pink_light_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block PALE_PINK_LIGHT_BRICK_ARROW_SLIT_ORNATE = registerBlock("pale_pink_light_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SANDY_PINK_FAINT_LIGHT_BRICK = registerBlock("sandy_pink_faint_light_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_FAINT_LIGHT_BRICK_STAIRS = registerBlock("sandy_pink_faint_light_brick_stairs", new WcStairs(Fieldstone.FAINT_BROWN_GREY_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_FAINT_LIGHT_BRICK_SLAB = registerBlock("sandy_pink_faint_light_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_FAINT_LIGHT_BRICK_WALL = registerBlock("sandy_pink_faint_light_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_FAINT_LIGHT_BRICK_FENCE = registerBlock("sandy_pink_faint_light_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_FAINT_LIGHT_BRICK_HOPPER = registerBlock("sandy_pink_faint_light_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_FAINT_LIGHT_BRICK_TIP = registerBlock("sandy_pink_faint_light_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_FAINT_LIGHT_BRICK_ARROW_SLIT = registerBlock("sandy_pink_faint_light_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_FAINT_LIGHT_BRICK_ARROW_SLIT_WINDOW = registerBlock("sandy_pink_faint_light_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_FAINT_LIGHT_BRICK_ARROW_SLIT_ORNATE = registerBlock("sandy_pink_faint_light_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SANDY_PINK_LIGHT_BRICK = registerBlock("sandy_pink_light_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_LIGHT_BRICK_STAIRS = registerBlock("sandy_pink_light_brick_stairs", new WcStairs(Fieldstone.FAINT_BROWN_GREY_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_LIGHT_BRICK_SLAB = registerBlock("sandy_pink_light_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_LIGHT_BRICK_WALL = registerBlock("sandy_pink_light_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_LIGHT_BRICK_FENCE = registerBlock("sandy_pink_light_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_LIGHT_BRICK_HOPPER = registerBlock("sandy_pink_light_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_LIGHT_BRICK_TIP = registerBlock("sandy_pink_light_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_LIGHT_BRICK_ARROW_SLIT = registerBlock("sandy_pink_light_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_LIGHT_BRICK_ARROW_SLIT_WINDOW = registerBlock("sandy_pink_light_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_LIGHT_BRICK_ARROW_SLIT_ORNATE = registerBlock("sandy_pink_light_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block LIGHT_OLDTOWN_BRICK = registerBlock("light_oldtown_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LIGHT_OLDTOWN_BRICK_STAIRS = registerBlock("light_oldtown_brick_stairs", new WcStairs(Fieldstone.FAINT_BROWN_GREY_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LIGHT_OLDTOWN_BRICK_SLAB = registerBlock("light_oldtown_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LIGHT_OLDTOWN_BRICK_WALL = registerBlock("light_oldtown_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LIGHT_OLDTOWN_BRICK_FENCE = registerBlock("light_oldtown_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LIGHT_OLDTOWN_BRICK_HOPPER = registerBlock("light_oldtown_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LIGHT_OLDTOWN_BRICK_TIP = registerBlock("light_oldtown_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LIGHT_OLDTOWN_BRICK_ARROW_SLIT = registerBlock("light_oldtown_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LIGHT_OLDTOWN_BRICK_ARROW_SLIT_WINDOW = registerBlock("light_oldtown_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LIGHT_OLDTOWN_BRICK_ARROW_SLIT_ORNATE = registerBlock("light_oldtown_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block OLDTOWN_BRICK = registerBlock("oldtown_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_BRICK_STAIRS = registerBlock("oldtown_brick_stairs", new WcStairs(Fieldstone.FAINT_BROWN_GREY_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_BRICK_SLAB = registerBlock("oldtown_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_BRICK_WALL = registerBlock("oldtown_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_BRICK_FENCE = registerBlock("oldtown_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_BRICK_HOPPER = registerBlock("oldtown_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_BRICK_TIP = registerBlock("oldtown_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_BRICK_ARROW_SLIT = registerBlock("oldtown_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_BRICK_ARROW_SLIT_WINDOW = registerBlock("oldtown_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_BRICK_ARROW_SLIT_ORNATE = registerBlock("oldtown_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block ARBOR_SMALL_BRICK = registerBlock("arbor_small_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_SMALL_BRICK_STAIRS = registerBlock("arbor_small_brick_stairs", new WcStairs(Fieldstone.FAINT_BROWN_GREY_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_SMALL_BRICK_SLAB = registerBlock("arbor_small_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_SMALL_BRICK_WALL = registerBlock("arbor_small_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_SMALL_BRICK_FENCE = registerBlock("arbor_small_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_SMALL_BRICK_HOPPER = registerBlock("arbor_small_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_SMALL_BRICK_TIP = registerBlock("arbor_small_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_SMALL_BRICK_ARROW_SLIT = registerBlock("arbor_small_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_SMALL_BRICK_ARROW_SLIT_WINDOW = registerBlock("arbor_small_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_SMALL_BRICK_ARROW_SLIT_ORNATE = registerBlock("arbor_small_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block LANNISPORT_LIGHT_BRICK = registerBlock("arbor_small_brick", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_LIGHT_BRICK_STAIRS = registerBlock("arbor_small_brick_stairs", new WcStairs(Fieldstone.FAINT_BROWN_GREY_BRICK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_LIGHT_BRICK_SLAB = registerBlock("arbor_small_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_LIGHT_BRICK_WALL = registerBlock("arbor_small_brick_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_LIGHT_BRICK_FENCE = registerBlock("arbor_small_brick_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_LIGHT_BRICK_HOPPER = registerBlock("arbor_small_brick_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_LIGHT_BRICK_TIP = registerBlock("arbor_small_brick_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_LIGHT_BRICK_ARROW_SLIT = registerBlock("arbor_small_brick_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_LIGHT_BRICK_ARROW_SLIT_WINDOW = registerBlock("arbor_small_brick_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_LIGHT_BRICK_ARROW_SLIT_ORNATE = registerBlock("arbor_small_brick_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier("wcrhum", name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier("wcrhum", name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {

    }
}
