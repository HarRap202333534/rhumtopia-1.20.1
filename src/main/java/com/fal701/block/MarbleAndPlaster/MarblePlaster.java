package com.fal701.block.MarbleAndPlaster;

import com.fal701.Rhumtopia;
import com.fal701.block.Cobblestone.Cobblestone;
import com.fal701.block.Z_custom.WcHopper;
import com.fal701.block.Z_custom.WcHopperU;
import com.fal701.block.Z_custom.WcStairs;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MarblePlaster {

    public static final Block MARBLE_PILLAR_VERTICAL_CTM = registerBlock("marble_pillar_vertical_ctm", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block MARBLE_WALL = registerBlock("marble_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block MARBLE_PILLAR = registerBlock("marble_pillar", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block THIN_MARBLE_COLUMN = registerBlock("thin_marble_column", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block MARBLE_COLUMN_FENCE = registerBlock("marble_column_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block LANNISPORT_KEYSTONE_YELLOW_PLASTER = registerBlock("lannisport_keystone_yellow_plaster", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block LANNISPORT_KEYSTONE_ORANGE_PLASTER = registerBlock("lannisport_keystone_orange_plaster", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block SMALL_SMOOTH_STONE_BRICK_BLUE_PLASTER = registerBlock("small_smooth_stone_brick_blue_plaster", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block SMALL_WHITE_BRICK_BROWNISH_WHITE_PLASTER = registerBlock("small_white_brick_brownish_white_plaster", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block SMALL_SMOOTH_STONE_BRICK_WHITE_PLASTER = registerBlock("small_smooth_stone_brick_white_plaster", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block SMALL_STONE_BRICK_WHITE_PLASTER = registerBlock("small_stone_brick_white_plaster", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block SMALL_WHITE_BRICK_WHITE_PLASTER = registerBlock("small_white_brick_white_plaster", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block UNUSED_BROWN_PLASTER = registerBlock("unused_brown_plaster", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block UNUSED_PURPLE_PLASTER = registerBlock("unused_purple_plaster", new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));

    public static final Block QUARTZ = registerBlock("quartz", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block QUARTZ_STAIRS = registerBlock("quartz_stairs", new WcStairs(QUARTZ.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block QUARTZ_SLAB = registerBlock("quartz_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block QUARTZ_WALL = registerBlock("quartz_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block QUARTZ_FENCE = registerBlock("quartz_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block QUARTZ_HOPPER = registerBlock("quartz_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block QUARTZ_TIP = registerBlock("quartz_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block WHITE_STAINED_CLAY = registerBlock("white_stained_clay", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block WHITE_STAINED_CLAY_STAIRS = registerBlock("white_stained_clay_stairs", new WcStairs(WHITE_STAINED_CLAY.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block WHITE_STAINED_CLAY_SLAB = registerBlock("white_stained_clay_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block WHITE_STAINED_CLAY_WALL = registerBlock("white_stained_clay_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block WHITE_STAINED_CLAY_FENCE = registerBlock("white_stained_clay_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block WHITE_STAINED_CLAY_HOPPER = registerBlock("white_stained_clay_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block WHITE_STAINED_CLAY_TIP = registerBlock("white_stained_clay_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block EYRIE_BLUE_VEINED_MARBLE = registerBlock("eyrie_blue_veined_marble", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block EYRIE_BLUE_VEINED_MARBLE_STAIRS = registerBlock("eyrie_blue_veined_marble_stairs", new WcStairs(EYRIE_BLUE_VEINED_MARBLE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block EYRIE_BLUE_VEINED_MARBLE_SLAB = registerBlock("eyrie_blue_veined_marble_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block EYRIE_BLUE_VEINED_MARBLE_WALL = registerBlock("eyrie_blue_veined_marble_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block EYRIE_BLUE_VEINED_MARBLE_FENCE = registerBlock("eyrie_blue_veined_marble_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block EYRIE_BLUE_VEINED_MARBLE_HOPPER = registerBlock("eyrie_blue_veined_marble_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block EYRIE_BLUE_VEINED_MARBLE_TIP = registerBlock("eyrie_blue_veined_marble_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block BAELORS_BROWN_VEINED_MARBLE = registerBlock("baelors_brown_veined_marble", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BAELORS_BROWN_VEINED_MARBLE_STAIRS = registerBlock("baelors_brown_veined_marble_stairs", new WcStairs(BAELORS_BROWN_VEINED_MARBLE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BAELORS_BROWN_VEINED_MARBLE_SLAB = registerBlock("baelors_brown_veined_marble_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BAELORS_BROWN_VEINED_MARBLE_WALL = registerBlock("baelors_brown_veined_marble_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BAELORS_BROWN_VEINED_MARBLE_FENCE = registerBlock("baelors_brown_veined_marble_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BAELORS_BROWN_VEINED_MARBLE_HOPPER = registerBlock("baelors_brown_veined_marble_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BAELORS_BROWN_VEINED_MARBLE_TIP = registerBlock("baelors_brown_veined_marble_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block HIGHGARDEN_PINK_VEINED_MARBLE = registerBlock("highgarden_pink_veined_marble", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_VEINED_MARBLE_STAIRS = registerBlock("highgarden_pink_veined_marble_stairs", new WcStairs(HIGHGARDEN_PINK_VEINED_MARBLE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_VEINED_MARBLE_SLAB = registerBlock("highgarden_pink_veined_marble_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_VEINED_MARBLE_WALL = registerBlock("highgarden_pink_veined_marble_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_VEINED_MARBLE_FENCE = registerBlock("highgarden_pink_veined_marble_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_VEINED_MARBLE_HOPPER = registerBlock("highgarden_pink_veined_marble_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_VEINED_MARBLE_TIP = registerBlock("highgarden_pink_veined_marble_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block HIGHGARDEN_PINK_MARBLE = registerBlock("highgarden_pink_marble", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_MARBLE_STAIRS = registerBlock("highgarden_pink_marble_stairs", new WcStairs(HIGHGARDEN_PINK_MARBLE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_MARBLE_SLAB = registerBlock("highgarden_pink_marble_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_MARBLE_WALL = registerBlock("highgarden_pink_marble_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_MARBLE_FENCE = registerBlock("highgarden_pink_marble_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_MARBLE_HOPPER = registerBlock("highgarden_pink_marble_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_MARBLE_TIP = registerBlock("highgarden_pink_marble_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block SUNSPEAR_YELLOW_VEINED_MARBLE = registerBlock("sunspear_yellow_veined_marble", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block SUNSPEAR_YELLOW_VEINED_MARBLE_STAIRS = registerBlock("sunspear_yellow_veined_marble_stairs", new WcStairs(SUNSPEAR_YELLOW_VEINED_MARBLE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block SUNSPEAR_YELLOW_VEINED_MARBLE_SLAB = registerBlock("sunspear_yellow_veined_marble_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block SUNSPEAR_YELLOW_VEINED_MARBLE_WALL = registerBlock("sunspear_yellow_veined_marble_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block SUNSPEAR_YELLOW_VEINED_MARBLE_FENCE = registerBlock("sunspear_yellow_veined_marble_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block SUNSPEAR_YELLOW_VEINED_MARBLE_HOPPER = registerBlock("sunspear_yellow_veined_marble_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block SUNSPEAR_YELLOW_VEINED_MARBLE_TIP = registerBlock("sunspear_yellow_veined_marble_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block STARRY_SEPT_MARBLE = registerBlock("starry_sept_marble", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block STARRY_SEPT_MARBLE_STAIRS = registerBlock("starry_sept_marble_stairs", new WcStairs(STARRY_SEPT_MARBLE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block STARRY_SEPT_MARBLE_SLAB = registerBlock("starry_sept_marble_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block STARRY_SEPT_MARBLE_WALL = registerBlock("starry_sept_marble_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block STARRY_SEPT_MARBLE_FENCE = registerBlock("starry_sept_marble_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block STARRY_SEPT_MARBLE_HOPPER = registerBlock("starry_sept_marble_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block STARRY_SEPT_MARBLE_TIP = registerBlock("starry_sept_marble_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block CITADEL_GREEN_MARBLE = registerBlock("citadel_green_marble", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block CITADEL_GREEN_MARBLE_STAIRS = registerBlock("citadel_green_marble_stairs", new WcStairs(CITADEL_GREEN_MARBLE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block CITADEL_GREEN_MARBLE_SLAB = registerBlock("citadel_green_marble_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block CITADEL_GREEN_MARBLE_WALL = registerBlock("citadel_green_marble_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block CITADEL_GREEN_MARBLE_FENCE = registerBlock("citadel_green_marble_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block CITADEL_GREEN_MARBLE_HOPPER = registerBlock("citadel_green_marble_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block CITADEL_GREEN_MARBLE_TIP = registerBlock("citadel_green_marble_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));


    public static final Block WHITE_PLASTER = registerBlock("white_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block WHITE_PLASTER_STAIRS = registerBlock("white_plaster_stairs", new WcStairs(WHITE_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block WHITE_PLASTER_SLAB = registerBlock("white_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block WHITE_PLASTER_WALL = registerBlock("white_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block WHITE_PLASTER_FENCE = registerBlock("white_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block WHITE_PLASTER_HOPPER = registerBlock("white_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block WHITE_PLASTER_TIP = registerBlock("white_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block WHITE_PLASTER_ROUGH = registerBlock("white_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block WHITE_PLASTER_ROUGH_STAIRS = registerBlock("white_plaster_rough_stairs", new WcStairs(WHITE_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block WHITE_PLASTER_ROUGH_SLAB = registerBlock("white_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block WHITE_PLASTER_ROUGH_WALL = registerBlock("white_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block WHITE_PLASTER_ROUGH_FENCE = registerBlock("white_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block WHITE_PLASTER_ROUGH_HOPPER = registerBlock("white_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block WHITE_PLASTER_ROUGH_TIP = registerBlock("white_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block PLAIN_WHITE_DAUB = registerBlock("plain_white_daub", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_WHITE_DAUB_STAIRS = registerBlock("plain_white_daub_stairs", new WcStairs(PLAIN_WHITE_DAUB.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_WHITE_DAUB_SLAB = registerBlock("plain_white_daub_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_WHITE_DAUB_WALL = registerBlock("plain_white_daub_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_WHITE_DAUB_FENCE = registerBlock("plain_white_daub_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_WHITE_DAUB_HOPPER = registerBlock("plain_white_daub_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_WHITE_DAUB_TIP = registerBlock("plain_white_daub_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block PLAIN_WHITE_DAUB_ROUGH = registerBlock("plain_white_daub_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_WHITE_DAUB_ROUGH_STAIRS = registerBlock("plain_white_daub_rough_stairs", new WcStairs(PLAIN_WHITE_DAUB_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_WHITE_DAUB_ROUGH_SLAB = registerBlock("plain_white_daub_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_WHITE_DAUB_ROUGH_WALL = registerBlock("plain_white_daub_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_WHITE_DAUB_ROUGH_FENCE = registerBlock("plain_white_daub_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_WHITE_DAUB_ROUGH_HOPPER = registerBlock("plain_white_daub_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_WHITE_DAUB_ROUGH_TIP = registerBlock("plain_white_daub_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));


    public static final Block BROWNISH_WHITE_PLASTER = registerBlock("brownish_white_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BROWNISH_WHITE_PLASTER_STAIRS = registerBlock("brownish_white_plaster_stairs", new WcStairs(BROWNISH_WHITE_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BROWNISH_WHITE_PLASTER_SLAB = registerBlock("brownish_white_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BROWNISH_WHITE_PLASTER_WALL = registerBlock("brownish_white_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BROWNISH_WHITE_PLASTER_FENCE = registerBlock("brownish_white_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BROWNISH_WHITE_PLASTER_HOPPER = registerBlock("brownish_white_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BROWNISH_WHITE_PLASTER_TIP = registerBlock("brownish_white_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block BROWNISH_WHITE_PLASTER_ROUGH = registerBlock("brownish_white_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BROWNISH_WHITE_PLASTER_ROUGH_STAIRS = registerBlock("brownish_white_plaster_rough_stairs", new WcStairs(BROWNISH_WHITE_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BROWNISH_WHITE_PLASTER_ROUGH_SLAB = registerBlock("brownish_white_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BROWNISH_WHITE_PLASTER_ROUGH_WALL = registerBlock("brownish_white_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BROWNISH_WHITE_PLASTER_ROUGH_FENCE = registerBlock("brownish_white_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BROWNISH_WHITE_PLASTER_ROUGH_HOPPER = registerBlock("brownish_white_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BROWNISH_WHITE_PLASTER_ROUGH_TIP = registerBlock("brownish_white_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block PALE_WHITE_PLASTER = registerBlock("pale_white_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_WHITE_PLASTER_STAIRS = registerBlock("pale_white_plaster_stairs", new WcStairs(PALE_WHITE_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_WHITE_PLASTER_SLAB = registerBlock("pale_white_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_WHITE_PLASTER_WALL = registerBlock("pale_white_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_WHITE_PLASTER_FENCE = registerBlock("pale_white_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_WHITE_PLASTER_HOPPER = registerBlock("pale_white_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_WHITE_PLASTER_TIP = registerBlock("pale_white_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block PALE_WHITE_PLASTER_ROUGH = registerBlock("pale_white_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_WHITE_PLASTER_ROUGH_STAIRS = registerBlock("pale_white_plaster_rough_stairs", new WcStairs(PALE_WHITE_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_WHITE_PLASTER_ROUGH_SLAB = registerBlock("pale_white_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_WHITE_PLASTER_ROUGH_WALL = registerBlock("pale_white_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_WHITE_PLASTER_ROUGH_FENCE = registerBlock("pale_white_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_WHITE_PLASTER_ROUGH_HOPPER = registerBlock("pale_white_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_WHITE_PLASTER_ROUGH_TIP = registerBlock("pale_white_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block YELLOWISH_WHITE_PLASTER = registerBlock("yellowish_white_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block YELLOWISH_WHITE_PLASTER_STAIRS = registerBlock("yellowish_white_plaster_stairs", new WcStairs(YELLOWISH_WHITE_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block YELLOWISH_WHITE_PLASTER_SLAB = registerBlock("yellowish_white_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block YELLOWISH_WHITE_PLASTER_WALL = registerBlock("yellowish_white_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block YELLOWISH_WHITE_PLASTER_FENCE = registerBlock("yellowish_white_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block YELLOWISH_WHITE_PLASTER_HOPPER = registerBlock("yellowish_white_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block YELLOWISH_WHITE_PLASTER_TIP = registerBlock("yellowish_white_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block YELLOWISH_WHITE_PLASTER_ROUGH = registerBlock("yellowish_white_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block YELLOWISH_WHITE_PLASTER_ROUGH_STAIRS = registerBlock("yellowish_white_plaster_rough_stairs", new WcStairs(YELLOWISH_WHITE_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block YELLOWISH_WHITE_PLASTER_ROUGH_SLAB = registerBlock("yellowish_white_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block YELLOWISH_WHITE_PLASTER_ROUGH_WALL = registerBlock("yellowish_white_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block YELLOWISH_WHITE_PLASTER_ROUGH_FENCE = registerBlock("yellowish_white_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block YELLOWISH_WHITE_PLASTER_ROUGH_HOPPER = registerBlock("yellowish_white_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block YELLOWISH_WHITE_PLASTER_ROUGH_TIP = registerBlock("yellowish_white_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block GREYISH_WHITE_PLASTER = registerBlock("greyish_white_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREYISH_WHITE_PLASTER_STAIRS = registerBlock("greyish_white_plaster_stairs", new WcStairs(GREYISH_WHITE_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREYISH_WHITE_PLASTER_SLAB = registerBlock("greyish_white_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREYISH_WHITE_PLASTER_WALL = registerBlock("greyish_white_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREYISH_WHITE_PLASTER_FENCE = registerBlock("greyish_white_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREYISH_WHITE_PLASTER_HOPPER = registerBlock("greyish_white_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREYISH_WHITE_PLASTER_TIP = registerBlock("greyish_white_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block GREYISH_WHITE_PLASTER_ROUGH = registerBlock("greyish_white_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREYISH_WHITE_PLASTER_ROUGH_STAIRS = registerBlock("greyish_white_plaster_rough_stairs", new WcStairs(GREYISH_WHITE_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREYISH_WHITE_PLASTER_ROUGH_SLAB = registerBlock("greyish_white_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREYISH_WHITE_PLASTER_ROUGH_WALL = registerBlock("greyish_white_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREYISH_WHITE_PLASTER_ROUGH_FENCE = registerBlock("greyish_white_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREYISH_WHITE_PLASTER_ROUGH_HOPPER = registerBlock("greyish_white_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREYISH_WHITE_PLASTER_ROUGH_TIP = registerBlock("greyish_white_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block LIGHT_GREY_PLASTER = registerBlock("light_grey_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_GREY_PLASTER_STAIRS = registerBlock("light_grey_plaster_stairs", new WcStairs(LIGHT_GREY_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_GREY_PLASTER_SLAB = registerBlock("light_grey_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_GREY_PLASTER_WALL = registerBlock("light_grey_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_GREY_PLASTER_FENCE = registerBlock("light_grey_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_GREY_PLASTER_HOPPER = registerBlock("light_grey_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_GREY_PLASTER_TIP = registerBlock("light_grey_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block LIGHT_GREY_PLASTER_ROUGH = registerBlock("light_grey_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_GREY_PLASTER_ROUGH_STAIRS = registerBlock("light_grey_plaster_rough_stairs", new WcStairs(LIGHT_GREY_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_GREY_PLASTER_ROUGH_SLAB = registerBlock("light_grey_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_GREY_PLASTER_ROUGH_WALL = registerBlock("light_grey_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_GREY_PLASTER_ROUGH_FENCE = registerBlock("light_grey_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_GREY_PLASTER_ROUGH_HOPPER = registerBlock("light_grey_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_GREY_PLASTER_ROUGH_TIP = registerBlock("light_grey_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block GREY_PLASTER = registerBlock("grey_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREY_PLASTER_STAIRS = registerBlock("grey_plaster_stairs", new WcStairs(GREY_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREY_PLASTER_SLAB = registerBlock("grey_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREY_PLASTER_WALL = registerBlock("grey_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREY_PLASTER_FENCE = registerBlock("grey_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREY_PLASTER_HOPPER = registerBlock("grey_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREY_PLASTER_TIP = registerBlock("grey_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block GREY_PLASTER_ROUGH = registerBlock("grey_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREY_PLASTER_ROUGH_STAIRS = registerBlock("grey_plaster_rough_stairs", new WcStairs(GREY_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREY_PLASTER_ROUGH_SLAB = registerBlock("grey_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREY_PLASTER_ROUGH_WALL = registerBlock("grey_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREY_PLASTER_ROUGH_FENCE = registerBlock("grey_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREY_PLASTER_ROUGH_HOPPER = registerBlock("grey_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREY_PLASTER_ROUGH_TIP = registerBlock("grey_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block DARK_GREY_PLASTER = registerBlock("dark_grey_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_GREY_PLASTER_STAIRS = registerBlock("dark_grey_plaster_stairs", new WcStairs(DARK_GREY_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_GREY_PLASTER_SLAB = registerBlock("dark_grey_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_GREY_PLASTER_WALL = registerBlock("dark_grey_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_GREY_PLASTER_FENCE = registerBlock("dark_grey_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_GREY_PLASTER_HOPPER = registerBlock("dark_grey_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_GREY_PLASTER_TIP = registerBlock("dark_grey_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block DARK_GREY_PLASTER_ROUGH = registerBlock("dark_grey_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_GREY_PLASTER_ROUGH_STAIRS = registerBlock("dark_grey_plaster_rough_stairs", new WcStairs(DARK_GREY_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_GREY_PLASTER_ROUGH_SLAB = registerBlock("dark_grey_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_GREY_PLASTER_ROUGH_WALL = registerBlock("dark_grey_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_GREY_PLASTER_ROUGH_FENCE = registerBlock("dark_grey_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_GREY_PLASTER_ROUGH_HOPPER = registerBlock("dark_grey_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_GREY_PLASTER_ROUGH_TIP = registerBlock("dark_grey_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block LIGHT_RED_PLASTER = registerBlock("light_red_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_RED_PLASTER_STAIRS = registerBlock("light_red_plaster_stairs", new WcStairs(LIGHT_RED_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_RED_PLASTER_SLAB = registerBlock("light_red_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_RED_PLASTER_WALL = registerBlock("light_red_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_RED_PLASTER_FENCE = registerBlock("light_red_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_RED_PLASTER_HOPPER = registerBlock("light_red_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_RED_PLASTER_TIP = registerBlock("light_red_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block LIGHT_RED_PLASTER_ROUGH = registerBlock("light_red_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_RED_PLASTER_ROUGH_STAIRS = registerBlock("light_red_plaster_rough_stairs", new WcStairs(LIGHT_RED_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_RED_PLASTER_ROUGH_SLAB = registerBlock("light_red_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_RED_PLASTER_ROUGH_WALL = registerBlock("light_red_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_RED_PLASTER_ROUGH_FENCE = registerBlock("light_red_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_RED_PLASTER_ROUGH_HOPPER = registerBlock("light_red_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_RED_PLASTER_ROUGH_TIP = registerBlock("light_red_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block RED_PLASTER = registerBlock("red_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block RED_PLASTER_STAIRS = registerBlock("red_plaster_stairs", new WcStairs(RED_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block RED_PLASTER_SLAB = registerBlock("red_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block RED_PLASTER_WALL = registerBlock("red_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block RED_PLASTER_FENCE = registerBlock("red_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block RED_PLASTER_HOPPER = registerBlock("red_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block RED_PLASTER_TIP = registerBlock("red_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block RED_PLASTER_ROUGH = registerBlock("red_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block RED_PLASTER_ROUGH_STAIRS = registerBlock("red_plaster_rough_stairs", new WcStairs(RED_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block RED_PLASTER_ROUGH_SLAB = registerBlock("red_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block RED_PLASTER_ROUGH_WALL = registerBlock("red_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block RED_PLASTER_ROUGH_FENCE = registerBlock("red_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block RED_PLASTER_ROUGH_HOPPER = registerBlock("red_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block RED_PLASTER_ROUGH_TIP = registerBlock("red_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block CASTERLY_ROCK_CRIMSON_PLASTER = registerBlock("casterly_rock_crimson_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block CASTERLY_ROCK_CRIMSON_PLASTER_STAIRS = registerBlock("casterly_rock_crimson_plaster_stairs", new WcStairs(CASTERLY_ROCK_CRIMSON_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block CASTERLY_ROCK_CRIMSON_PLASTER_SLAB = registerBlock("casterly_rock_crimson_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block CASTERLY_ROCK_CRIMSON_PLASTER_WALL = registerBlock("casterly_rock_crimson_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block CASTERLY_ROCK_CRIMSON_PLASTER_FENCE = registerBlock("casterly_rock_crimson_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block CASTERLY_ROCK_CRIMSON_PLASTER_HOPPER = registerBlock("casterly_rock_crimson_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block CASTERLY_ROCK_CRIMSON_PLASTER_TIP = registerBlock("casterly_rock_crimson_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block CASTERLY_ROCK_CRIMSON_PLASTER_ROUGH = registerBlock("casterly_rock_crimson_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block CASTERLY_ROCK_CRIMSON_PLASTER_ROUGH_STAIRS = registerBlock("casterly_rock_crimson_plaster_rough_stairs", new WcStairs(CASTERLY_ROCK_CRIMSON_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block CASTERLY_ROCK_CRIMSON_PLASTER_ROUGH_SLAB = registerBlock("casterly_rock_crimson_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block CASTERLY_ROCK_CRIMSON_PLASTER_ROUGH_WALL = registerBlock("casterly_rock_crimson_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block CASTERLY_ROCK_CRIMSON_PLASTER_ROUGH_FENCE = registerBlock("casterly_rock_crimson_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block CASTERLY_ROCK_CRIMSON_PLASTER_ROUGH_HOPPER = registerBlock("casterly_rock_crimson_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block CASTERLY_ROCK_CRIMSON_PLASTER_ROUGH_TIP = registerBlock("casterly_rock_crimson_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block DARK_RED_PLASTER = registerBlock("dark_red_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_RED_PLASTER_STAIRS = registerBlock("dark_red_plaster_stairs", new WcStairs(DARK_RED_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_RED_PLASTER_SLAB = registerBlock("dark_red_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_RED_PLASTER_WALL = registerBlock("dark_red_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_RED_PLASTER_FENCE = registerBlock("dark_red_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_RED_PLASTER_HOPPER = registerBlock("dark_red_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_RED_PLASTER_TIP = registerBlock("dark_red_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block DARK_RED_PLASTER_ROUGH = registerBlock("dark_red_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_RED_PLASTER_ROUGH_STAIRS = registerBlock("dark_red_plaster_rough_stairs", new WcStairs(DARK_RED_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_RED_PLASTER_ROUGH_SLAB = registerBlock("dark_red_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_RED_PLASTER_ROUGH_WALL = registerBlock("dark_red_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_RED_PLASTER_ROUGH_FENCE = registerBlock("dark_red_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_RED_PLASTER_ROUGH_HOPPER = registerBlock("dark_red_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_RED_PLASTER_ROUGH_TIP = registerBlock("dark_red_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block LANNISPORT_ORANGE_PLASTER = registerBlock("lannisport_orange_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_ORANGE_PLASTER_STAIRS = registerBlock("lannisport_orange_plaster_stairs", new WcStairs(LANNISPORT_ORANGE_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_ORANGE_PLASTER_SLAB = registerBlock("lannisport_orange_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_ORANGE_PLASTER_WALL = registerBlock("lannisport_orange_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_ORANGE_PLASTER_FENCE = registerBlock("lannisport_orange_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_ORANGE_PLASTER_HOPPER = registerBlock("lannisport_orange_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_ORANGE_PLASTER_TIP = registerBlock("lannisport_orange_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block LANNISPORT_ORANGE_PLASTER_ROUGH = registerBlock("lannisport_orange_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_ORANGE_PLASTER_ROUGH_STAIRS = registerBlock("lannisport_orange_plaster_rough_stairs", new WcStairs(LANNISPORT_ORANGE_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_ORANGE_PLASTER_ROUGH_SLAB = registerBlock("lannisport_orange_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_ORANGE_PLASTER_ROUGH_WALL = registerBlock("lannisport_orange_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_ORANGE_PLASTER_ROUGH_FENCE = registerBlock("lannisport_orange_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_ORANGE_PLASTER_ROUGH_HOPPER = registerBlock("lannisport_orange_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_ORANGE_PLASTER_ROUGH_TIP = registerBlock("lannisport_orange_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block ORANGE_PLASTER = registerBlock("orange_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ORANGE_PLASTER_STAIRS = registerBlock("orange_plaster_stairs", new WcStairs(ORANGE_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ORANGE_PLASTER_SLAB = registerBlock("orange_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ORANGE_PLASTER_WALL = registerBlock("orange_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ORANGE_PLASTER_FENCE = registerBlock("orange_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ORANGE_PLASTER_HOPPER = registerBlock("orange_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ORANGE_PLASTER_TIP = registerBlock("orange_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block ORANGE_PLASTER_ROUGH = registerBlock("orange_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ORANGE_PLASTER_ROUGH_STAIRS = registerBlock("orange_plaster_rough_stairs", new WcStairs(ORANGE_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ORANGE_PLASTER_ROUGH_SLAB = registerBlock("orange_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ORANGE_PLASTER_ROUGH_WALL = registerBlock("orange_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ORANGE_PLASTER_ROUGH_FENCE = registerBlock("orange_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ORANGE_PLASTER_ROUGH_HOPPER = registerBlock("orange_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ORANGE_PLASTER_ROUGH_TIP = registerBlock("orange_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block DARK_ORANGE_PLASTER = registerBlock("dark_orange_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_ORANGE_PLASTER_STAIRS = registerBlock("dark_orange_plaster_stairs", new WcStairs(DARK_ORANGE_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_ORANGE_PLASTER_SLAB = registerBlock("dark_orange_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_ORANGE_PLASTER_WALL = registerBlock("dark_orange_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_ORANGE_PLASTER_FENCE = registerBlock("dark_orange_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_ORANGE_PLASTER_HOPPER = registerBlock("dark_orange_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_ORANGE_PLASTER_TIP = registerBlock("dark_orange_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block DARK_ORANGE_PLASTER_ROUGH = registerBlock("dark_orange_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_ORANGE_PLASTER_ROUGH_STAIRS = registerBlock("dark_orange_plaster_rough_stairs", new WcStairs(DARK_ORANGE_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_ORANGE_PLASTER_ROUGH_SLAB = registerBlock("dark_orange_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_ORANGE_PLASTER_ROUGH_WALL = registerBlock("dark_orange_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_ORANGE_PLASTER_ROUGH_FENCE = registerBlock("dark_orange_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_ORANGE_PLASTER_ROUGH_HOPPER = registerBlock("dark_orange_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DARK_ORANGE_PLASTER_ROUGH_TIP = registerBlock("dark_orange_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block LANNISPORT_YELLOW_PLASTER = registerBlock("lannisport_yellow_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_YELLOW_PLASTER_STAIRS = registerBlock("lannisport_yellow_plaster_stairs", new WcStairs(LANNISPORT_YELLOW_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_YELLOW_PLASTER_SLAB = registerBlock("lannisport_yellow_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_YELLOW_PLASTER_WALL = registerBlock("lannisport_yellow_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_YELLOW_PLASTER_FENCE = registerBlock("lannisport_yellow_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_YELLOW_PLASTER_HOPPER = registerBlock("lannisport_yellow_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_YELLOW_PLASTER_TIP = registerBlock("lannisport_yellow_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block LANNISPORT_YELLOW_PLASTER_ROUGH = registerBlock("lannisport_yellow_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_YELLOW_PLASTER_ROUGH_STAIRS = registerBlock("lannisport_yellow_plaster_rough_stairs", new WcStairs(LANNISPORT_YELLOW_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_YELLOW_PLASTER_ROUGH_SLAB = registerBlock("lannisport_yellow_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_YELLOW_PLASTER_ROUGH_WALL = registerBlock("lannisport_yellow_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_YELLOW_PLASTER_ROUGH_FENCE = registerBlock("lannisport_yellow_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_YELLOW_PLASTER_ROUGH_HOPPER = registerBlock("lannisport_yellow_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LANNISPORT_YELLOW_PLASTER_ROUGH_TIP = registerBlock("lannisport_yellow_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block DORNE_MUD_PLASTER = registerBlock("dorne_mud_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_MUD_PLASTER_STAIRS = registerBlock("dorne_mud_plaster_stairs", new WcStairs(DORNE_MUD_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_MUD_PLASTER_SLAB = registerBlock("dorne_mud_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_MUD_PLASTER_WALL = registerBlock("dorne_mud_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_MUD_PLASTER_FENCE = registerBlock("dorne_mud_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_MUD_PLASTER_HOPPER = registerBlock("dorne_mud_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_MUD_PLASTER_TIP = registerBlock("dorne_mud_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block DORNE_MUD_PLASTER_ROUGH = registerBlock("dorne_mud_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_MUD_PLASTER_ROUGH_STAIRS = registerBlock("dorne_mud_plaster_rough_stairs", new WcStairs(DORNE_MUD_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_MUD_PLASTER_ROUGH_SLAB = registerBlock("dorne_mud_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_MUD_PLASTER_ROUGH_WALL = registerBlock("dorne_mud_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_MUD_PLASTER_ROUGH_FENCE = registerBlock("dorne_mud_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_MUD_PLASTER_ROUGH_HOPPER = registerBlock("dorne_mud_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_MUD_PLASTER_ROUGH_TIP = registerBlock("dorne_mud_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block PALE_YELLOW_PLASTER = registerBlock("pale_yellow_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_YELLOW_PLASTER_STAIRS = registerBlock("pale_yellow_plaster_stairs", new WcStairs(PALE_YELLOW_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_YELLOW_PLASTER_SLAB = registerBlock("pale_yellow_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_YELLOW_PLASTER_WALL = registerBlock("pale_yellow_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_YELLOW_PLASTER_FENCE = registerBlock("pale_yellow_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_YELLOW_PLASTER_HOPPER = registerBlock("pale_yellow_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_YELLOW_PLASTER_TIP = registerBlock("pale_yellow_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block PALE_YELLOW_PLASTER_ROUGH = registerBlock("pale_yellow_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_YELLOW_PLASTER_ROUGH_STAIRS = registerBlock("pale_yellow_plaster_rough_stairs", new WcStairs(PALE_YELLOW_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_YELLOW_PLASTER_ROUGH_SLAB = registerBlock("pale_yellow_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_YELLOW_PLASTER_ROUGH_WALL = registerBlock("pale_yellow_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_YELLOW_PLASTER_ROUGH_FENCE = registerBlock("pale_yellow_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_YELLOW_PLASTER_ROUGH_HOPPER = registerBlock("pale_yellow_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_YELLOW_PLASTER_ROUGH_TIP = registerBlock("pale_yellow_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block DORNE_DARK_MUD_PLASTER = registerBlock("dorne_dark_mud_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_DARK_MUD_PLASTER_STAIRS = registerBlock("dorne_dark_mud_plaster_stairs", new WcStairs(DORNE_DARK_MUD_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_DARK_MUD_PLASTER_SLAB = registerBlock("dorne_dark_mud_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_DARK_MUD_PLASTER_WALL = registerBlock("dorne_dark_mud_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_DARK_MUD_PLASTER_FENCE = registerBlock("dorne_dark_mud_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_DARK_MUD_PLASTER_HOPPER = registerBlock("dorne_dark_mud_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_DARK_MUD_PLASTER_TIP = registerBlock("dorne_dark_mud_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block DORNE_DARK_MUD_PLASTER_ROUGH = registerBlock("dorne_dark_mud_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_DARK_MUD_PLASTER_ROUGH_STAIRS = registerBlock("dorne_dark_mud_plaster_rough_stairs", new WcStairs(DORNE_DARK_MUD_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_DARK_MUD_PLASTER_ROUGH_SLAB = registerBlock("dorne_dark_mud_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_DARK_MUD_PLASTER_ROUGH_WALL = registerBlock("dorne_dark_mud_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_DARK_MUD_PLASTER_ROUGH_FENCE = registerBlock("dorne_dark_mud_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_DARK_MUD_PLASTER_ROUGH_HOPPER = registerBlock("dorne_dark_mud_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block DORNE_DARK_MUD_PLASTER_ROUGH_TIP = registerBlock("dorne_dark_mud_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block ARBOR_BROWN_PLASTER = registerBlock("arbor_brown_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ARBOR_BROWN_PLASTER_STAIRS = registerBlock("arbor_brown_plaster_stairs", new WcStairs(ARBOR_BROWN_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ARBOR_BROWN_PLASTER_SLAB = registerBlock("arbor_brown_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ARBOR_BROWN_PLASTER_WALL = registerBlock("arbor_brown_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ARBOR_BROWN_PLASTER_FENCE = registerBlock("arbor_brown_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ARBOR_BROWN_PLASTER_HOPPER = registerBlock("arbor_brown_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ARBOR_BROWN_PLASTER_TIP = registerBlock("arbor_brown_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block ARBOR_BROWN_PLASTER_ROUGH = registerBlock("arbor_brown_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ARBOR_BROWN_PLASTER_ROUGH_STAIRS = registerBlock("arbor_brown_plaster_rough_stairs", new WcStairs(ARBOR_BROWN_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ARBOR_BROWN_PLASTER_ROUGH_SLAB = registerBlock("arbor_brown_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ARBOR_BROWN_PLASTER_ROUGH_WALL = registerBlock("arbor_brown_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ARBOR_BROWN_PLASTER_ROUGH_FENCE = registerBlock("arbor_brown_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ARBOR_BROWN_PLASTER_ROUGH_HOPPER = registerBlock("arbor_brown_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block ARBOR_BROWN_PLASTER_ROUGH_TIP = registerBlock("arbor_brown_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block PLAIN_BROWN_DAUB = registerBlock("plain_brown_daub", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_BROWN_DAUB_STAIRS = registerBlock("plain_brown_daub_stairs", new WcStairs(PLAIN_BROWN_DAUB.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_BROWN_DAUB_SLAB = registerBlock("plain_brown_daub_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_BROWN_DAUB_WALL = registerBlock("plain_brown_daub_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_BROWN_DAUB_FENCE = registerBlock("plain_brown_daub_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_BROWN_DAUB_HOPPER = registerBlock("plain_brown_daub_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_BROWN_DAUB_TIP = registerBlock("plain_brown_daub_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block PLAIN_BROWN_DAUB_ROUGH = registerBlock("plain_brown_daub_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_BROWN_DAUB_ROUGH_STAIRS = registerBlock("plain_brown_daub_rough_stairs", new WcStairs(PLAIN_BROWN_DAUB_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_BROWN_DAUB_ROUGH_SLAB = registerBlock("plain_brown_daub_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_BROWN_DAUB_ROUGH_WALL = registerBlock("plain_brown_daub_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_BROWN_DAUB_ROUGH_FENCE = registerBlock("plain_brown_daub_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_BROWN_DAUB_ROUGH_HOPPER = registerBlock("plain_brown_daub_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PLAIN_BROWN_DAUB_ROUGH_TIP = registerBlock("plain_brown_daub_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block GULLTOWN_GREEN_PLASTER = registerBlock("gulltown_green_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_GREEN_PLASTER_STAIRS = registerBlock("gulltown_green_plaster_stairs", new WcStairs(GULLTOWN_GREEN_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_GREEN_PLASTER_SLAB = registerBlock("gulltown_green_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_GREEN_PLASTER_WALL = registerBlock("gulltown_green_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_GREEN_PLASTER_FENCE = registerBlock("gulltown_green_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_GREEN_PLASTER_HOPPER = registerBlock("gulltown_green_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_GREEN_PLASTER_TIP = registerBlock("gulltown_green_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block GULLTOWN_GREEN_PLASTER_ROUGH = registerBlock("gulltown_green_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_GREEN_PLASTER_ROUGH_STAIRS = registerBlock("gulltown_green_plaster_rough_stairs", new WcStairs(GULLTOWN_GREEN_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_GREEN_PLASTER_ROUGH_SLAB = registerBlock("gulltown_green_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_GREEN_PLASTER_ROUGH_WALL = registerBlock("gulltown_green_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_GREEN_PLASTER_ROUGH_FENCE = registerBlock("gulltown_green_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_GREEN_PLASTER_ROUGH_HOPPER = registerBlock("gulltown_green_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_GREEN_PLASTER_ROUGH_TIP = registerBlock("gulltown_green_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block GREEN_PLASTER = registerBlock("green_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREEN_PLASTER_STAIRS = registerBlock("green_plaster_stairs", new WcStairs(GREEN_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREEN_PLASTER_SLAB = registerBlock("green_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREEN_PLASTER_WALL = registerBlock("green_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREEN_PLASTER_FENCE = registerBlock("green_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREEN_PLASTER_HOPPER = registerBlock("green_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREEN_PLASTER_TIP = registerBlock("green_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block GREEN_PLASTER_ROUGH = registerBlock("green_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREEN_PLASTER_ROUGH_STAIRS = registerBlock("green_plaster_rough_stairs", new WcStairs(GREEN_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREEN_PLASTER_ROUGH_SLAB = registerBlock("green_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREEN_PLASTER_ROUGH_WALL = registerBlock("green_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREEN_PLASTER_ROUGH_FENCE = registerBlock("green_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREEN_PLASTER_ROUGH_HOPPER = registerBlock("green_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GREEN_PLASTER_ROUGH_TIP = registerBlock("green_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block HIGHGARDEN_GREEN_PLASTER = registerBlock("highgarden_green_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_GREEN_PLASTER_STAIRS = registerBlock("highgarden_green_plaster_stairs", new WcStairs(HIGHGARDEN_GREEN_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_GREEN_PLASTER_SLAB = registerBlock("highgarden_green_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_GREEN_PLASTER_WALL = registerBlock("highgarden_green_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_GREEN_PLASTER_FENCE = registerBlock("highgarden_green_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_GREEN_PLASTER_HOPPER = registerBlock("highgarden_green_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_GREEN_PLASTER_TIP = registerBlock("highgarden_green_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block HIGHGARDEN_GREEN_PLASTER_ROUGH = registerBlock("highgarden_green_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_GREEN_PLASTER_ROUGH_STAIRS = registerBlock("highgarden_green_plaster_rough_stairs", new WcStairs(HIGHGARDEN_GREEN_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_GREEN_PLASTER_ROUGH_SLAB = registerBlock("highgarden_green_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_GREEN_PLASTER_ROUGH_WALL = registerBlock("highgarden_green_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_GREEN_PLASTER_ROUGH_FENCE = registerBlock("highgarden_green_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_GREEN_PLASTER_ROUGH_HOPPER = registerBlock("highgarden_green_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_GREEN_PLASTER_ROUGH_TIP = registerBlock("highgarden_green_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block GULLTOWN_BLUE_PLASTER = registerBlock("gulltown_blue_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_BLUE_PLASTER_STAIRS = registerBlock("gulltown_blue_plaster_stairs", new WcStairs(GULLTOWN_BLUE_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_BLUE_PLASTER_SLAB = registerBlock("gulltown_blue_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_BLUE_PLASTER_WALL = registerBlock("gulltown_blue_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_BLUE_PLASTER_FENCE = registerBlock("gulltown_blue_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_BLUE_PLASTER_HOPPER = registerBlock("gulltown_blue_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_BLUE_PLASTER_TIP = registerBlock("gulltown_blue_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block GULLTOWN_BLUE_PLASTER_ROUGH = registerBlock("gulltown_blue_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_BLUE_PLASTER_ROUGH_STAIRS = registerBlock("gulltown_blue_plaster_rough_stairs", new WcStairs(GULLTOWN_BLUE_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_BLUE_PLASTER_ROUGH_SLAB = registerBlock("gulltown_blue_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_BLUE_PLASTER_ROUGH_WALL = registerBlock("gulltown_blue_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_BLUE_PLASTER_ROUGH_FENCE = registerBlock("gulltown_blue_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_BLUE_PLASTER_ROUGH_HOPPER = registerBlock("gulltown_blue_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block GULLTOWN_BLUE_PLASTER_ROUGH_TIP = registerBlock("gulltown_blue_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block LIGHT_BLUE_PLASTER = registerBlock("light_blue_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_BLUE_PLASTER_STAIRS = registerBlock("light_blue_plaster_stairs", new WcStairs(LIGHT_BLUE_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_BLUE_PLASTER_SLAB = registerBlock("light_blue_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_BLUE_PLASTER_WALL = registerBlock("light_blue_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_BLUE_PLASTER_FENCE = registerBlock("light_blue_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_BLUE_PLASTER_HOPPER = registerBlock("light_blue_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_BLUE_PLASTER_TIP = registerBlock("light_blue_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block LIGHT_BLUE_PLASTER_ROUGH = registerBlock("light_blue_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_BLUE_PLASTER_ROUGH_STAIRS = registerBlock("light_blue_plaster_rough_stairs", new WcStairs(LIGHT_BLUE_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_BLUE_PLASTER_ROUGH_SLAB = registerBlock("light_blue_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_BLUE_PLASTER_ROUGH_WALL = registerBlock("light_blue_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_BLUE_PLASTER_ROUGH_FENCE = registerBlock("light_blue_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_BLUE_PLASTER_ROUGH_HOPPER = registerBlock("light_blue_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_BLUE_PLASTER_ROUGH_TIP = registerBlock("light_blue_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block BLUE_PLASTER = registerBlock("blue_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BLUE_PLASTER_STAIRS = registerBlock("blue_plaster_stairs", new WcStairs(BLUE_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BLUE_PLASTER_SLAB = registerBlock("blue_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BLUE_PLASTER_WALL = registerBlock("blue_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BLUE_PLASTER_FENCE = registerBlock("blue_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BLUE_PLASTER_HOPPER = registerBlock("blue_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BLUE_PLASTER_TIP = registerBlock("blue_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block BLUE_PLASTER_ROUGH = registerBlock("blue_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BLUE_PLASTER_ROUGH_STAIRS = registerBlock("blue_plaster_rough_stairs", new WcStairs(BLUE_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BLUE_PLASTER_ROUGH_SLAB = registerBlock("blue_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BLUE_PLASTER_ROUGH_WALL = registerBlock("blue_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BLUE_PLASTER_ROUGH_FENCE = registerBlock("blue_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BLUE_PLASTER_ROUGH_HOPPER = registerBlock("blue_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block BLUE_PLASTER_ROUGH_TIP = registerBlock("blue_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block LIGHT_PURPLE_PLASTER = registerBlock("light_purple_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_PURPLE_PLASTER_STAIRS = registerBlock("light_purple_plaster_stairs", new WcStairs(LIGHT_PURPLE_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_PURPLE_PLASTER_SLAB = registerBlock("light_purple_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_PURPLE_PLASTER_WALL = registerBlock("light_purple_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_PURPLE_PLASTER_FENCE = registerBlock("light_purple_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_PURPLE_PLASTER_HOPPER = registerBlock("light_purple_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_PURPLE_PLASTER_TIP = registerBlock("light_purple_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block LIGHT_PURPLE_PLASTER_ROUGH = registerBlock("light_purple_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_PURPLE_PLASTER_ROUGH_STAIRS = registerBlock("light_purple_plaster_rough_stairs", new WcStairs(LIGHT_PURPLE_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_PURPLE_PLASTER_ROUGH_SLAB = registerBlock("light_purple_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_PURPLE_PLASTER_ROUGH_WALL = registerBlock("light_purple_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_PURPLE_PLASTER_ROUGH_FENCE = registerBlock("light_purple_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_PURPLE_PLASTER_ROUGH_HOPPER = registerBlock("light_purple_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block LIGHT_PURPLE_PLASTER_ROUGH_TIP = registerBlock("light_purple_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block PURPLE_PLASTER = registerBlock("purple_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PURPLE_PLASTER_STAIRS = registerBlock("purple_plaster_stairs", new WcStairs(PURPLE_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PURPLE_PLASTER_SLAB = registerBlock("purple_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PURPLE_PLASTER_WALL = registerBlock("purple_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PURPLE_PLASTER_FENCE = registerBlock("purple_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PURPLE_PLASTER_HOPPER = registerBlock("purple_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PURPLE_PLASTER_TIP = registerBlock("purple_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block PURPLE_PLASTER_ROUGH = registerBlock("purple_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PURPLE_PLASTER_ROUGH_STAIRS = registerBlock("purple_plaster_rough_stairs", new WcStairs(PURPLE_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PURPLE_PLASTER_ROUGH_SLAB = registerBlock("purple_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PURPLE_PLASTER_ROUGH_WALL = registerBlock("purple_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PURPLE_PLASTER_ROUGH_FENCE = registerBlock("purple_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PURPLE_PLASTER_ROUGH_HOPPER = registerBlock("purple_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PURPLE_PLASTER_ROUGH_TIP = registerBlock("purple_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block PALE_PURPLE_PLASTER = registerBlock("pale_purple_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PURPLE_PLASTER_STAIRS = registerBlock("pale_purple_plaster_stairs", new WcStairs(PALE_PURPLE_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PURPLE_PLASTER_SLAB = registerBlock("pale_purple_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PURPLE_PLASTER_WALL = registerBlock("pale_purple_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PURPLE_PLASTER_FENCE = registerBlock("pale_purple_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PURPLE_PLASTER_HOPPER = registerBlock("pale_purple_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PURPLE_PLASTER_TIP = registerBlock("pale_purple_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block PALE_PURPLE_PLASTER_ROUGH = registerBlock("pale_purple_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PURPLE_PLASTER_ROUGH_STAIRS = registerBlock("pale_purple_plaster_rough_stairs", new WcStairs(PALE_PURPLE_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PURPLE_PLASTER_ROUGH_SLAB = registerBlock("pale_purple_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PURPLE_PLASTER_ROUGH_WALL = registerBlock("pale_purple_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PURPLE_PLASTER_ROUGH_FENCE = registerBlock("pale_purple_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PURPLE_PLASTER_ROUGH_HOPPER = registerBlock("pale_purple_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PURPLE_PLASTER_ROUGH_TIP = registerBlock("pale_purple_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block HIGHGARDEN_PINK_PLASTER = registerBlock("highgarden_pink_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_PLASTER_STAIRS = registerBlock("highgarden_pink_plaster_stairs", new WcStairs(HIGHGARDEN_PINK_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_PLASTER_SLAB = registerBlock("highgarden_pink_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_PLASTER_WALL = registerBlock("highgarden_pink_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_PLASTER_FENCE = registerBlock("highgarden_pink_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_PLASTER_HOPPER = registerBlock("highgarden_pink_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_PLASTER_TIP = registerBlock("highgarden_pink_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block HIGHGARDEN_PINK_PLASTER_ROUGH = registerBlock("highgarden_pink_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_PLASTER_ROUGH_STAIRS = registerBlock("highgarden_pink_plaster_rough_stairs", new WcStairs(HIGHGARDEN_PINK_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_PLASTER_ROUGH_SLAB = registerBlock("highgarden_pink_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_PLASTER_ROUGH_WALL = registerBlock("highgarden_pink_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_PLASTER_ROUGH_FENCE = registerBlock("highgarden_pink_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_PLASTER_ROUGH_HOPPER = registerBlock("highgarden_pink_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block HIGHGARDEN_PINK_PLASTER_ROUGH_TIP = registerBlock("highgarden_pink_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block PINK_PLASTER = registerBlock("pink_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PINK_PLASTER_STAIRS = registerBlock("pink_plaster_stairs", new WcStairs(PINK_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PINK_PLASTER_SLAB = registerBlock("pink_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PINK_PLASTER_WALL = registerBlock("pink_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PINK_PLASTER_FENCE = registerBlock("pink_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PINK_PLASTER_HOPPER = registerBlock("pink_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PINK_PLASTER_TIP = registerBlock("pink_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block PINK_PLASTER_ROUGH = registerBlock("pink_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PINK_PLASTER_ROUGH_STAIRS = registerBlock("pink_plaster_rough_stairs", new WcStairs(PINK_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PINK_PLASTER_ROUGH_SLAB = registerBlock("pink_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PINK_PLASTER_ROUGH_WALL = registerBlock("pink_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PINK_PLASTER_ROUGH_FENCE = registerBlock("pink_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PINK_PLASTER_ROUGH_HOPPER = registerBlock("pink_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PINK_PLASTER_ROUGH_TIP = registerBlock("pink_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block PALE_PINK_PLASTER = registerBlock("pale_pink_plaster", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PINK_PLASTER_STAIRS = registerBlock("pale_pink_plaster_stairs", new WcStairs(PALE_PINK_PLASTER.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PINK_PLASTER_SLAB = registerBlock("pale_pink_plaster_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PINK_PLASTER_WALL = registerBlock("pale_pink_plaster_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PINK_PLASTER_FENCE = registerBlock("pale_pink_plaster_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PINK_PLASTER_HOPPER = registerBlock("pale_pink_plaster_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PINK_PLASTER_TIP = registerBlock("pale_pink_plaster_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));

    public static final Block PALE_PINK_PLASTER_ROUGH = registerBlock("pale_pink_plaster_rough", new Block(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PINK_PLASTER_ROUGH_STAIRS = registerBlock("pale_pink_plaster_rough_stairs", new WcStairs(PALE_PINK_PLASTER_ROUGH.getDefaultState(), FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PINK_PLASTER_ROUGH_SLAB = registerBlock("pale_pink_plaster_rough_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PINK_PLASTER_ROUGH_WALL = registerBlock("pale_pink_plaster_rough_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PINK_PLASTER_ROUGH_FENCE = registerBlock("pale_pink_plaster_rough_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PINK_PLASTER_ROUGH_HOPPER = registerBlock("pale_pink_plaster_rough_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));
    public static final Block PALE_PINK_PLASTER_ROUGH_TIP = registerBlock("pale_pink_plaster_rough_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.QUARTZ_BLOCK).requiresTool()));


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
