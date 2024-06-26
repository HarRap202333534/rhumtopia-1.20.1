package com.fal701.block.TimberFrame;

import com.fal701.Rhumtopia;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class TimberFrame {
    public static final Block TIMBER_OAK_BROWN_CROSSHATCH = registerBlock("timber_oak_brown_crosshatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_BROWN_LEFTHATCH = registerBlock("timber_oak_brown_lefthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_BROWN_RIGHTHATCH = registerBlock("timber_oak_brown_righthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_BROWN_FRAME = registerBlock("timber_oak_brown_frame", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_BROWN_VERTICAL = registerBlock("timber_oak_brown_vertical", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_BROWN_CLOSE_STUDDING = registerBlock("timber_oak_brown_close_studding", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_BROWN_LEFTHATCH_LARGE = registerBlock("timber_oak_brown_lefthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_BROWN_RIGHTHATCH_LARGE = registerBlock("timber_oak_brown_righthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_BROWN_LEFTHATCH_STUDDED = registerBlock("timber_oak_brown_lefthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_BROWN_RIGHTHATCH_STUDDED = registerBlock("timber_oak_brown_righthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_BROWN_BRESSUMMER = registerBlock("timber_oak_brown_bressummer", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));

    public static final Block TIMBER_OAK_WHITE_CROSSHATCH = registerBlock("timber_oak_white_crosshatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_WHITE_LEFTHATCH = registerBlock("timber_oak_white_lefthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_WHITE_RIGHTHATCH = registerBlock("timber_oak_white_righthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_WHITE_FRAME = registerBlock("timber_oak_white_frame", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_WHITE_VERTICAL = registerBlock("timber_oak_white_vertical", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_WHITE_CLOSE_STUDDING = registerBlock("timber_oak_white_close_studding", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_WHITE_LEFTHATCH_LARGE = registerBlock("timber_oak_white_lefthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_WHITE_RIGHTHATCH_LARGE = registerBlock("timber_oak_white_righthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_WHITE_LEFTHATCH_STUDDED = registerBlock("timber_oak_white_lefthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_WHITE_RIGHTHATCH_STUDDED = registerBlock("timber_oak_white_righthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_WHITE_BRESSUMMER = registerBlock("timber_oak_white_bressummer", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));

    public static final Block TIMBER_OAK_ORANGE_BRICK_CROSSHATCH = registerBlock("timber_oak_orange_brick_crosshatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_BRICK_LEFTHATCH = registerBlock("timber_oak_orange_brick_lefthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_BRICK_RIGHTHATCH = registerBlock("timber_oak_orange_brick_righthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_BRICK_FRAME = registerBlock("timber_oak_orange_brick_frame", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_BRICK_VERTICAL = registerBlock("timber_oak_orange_brick_vertical", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_BRICK_CLOSE_STUDDING = registerBlock("timber_oak_orange_brick_close_studding", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_BRICK_LEFTHATCH_LARGE = registerBlock("timber_oak_orange_brick_lefthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_BRICK_RIGHTHATCH_LARGE = registerBlock("timber_oak_orange_brick_righthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_BRICK_LEFTHATCH_STUDDED = registerBlock("timber_oak_orange_brick_lefthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_BRICK_RIGHTHATCH_STUDDED = registerBlock("timber_oak_orange_brick_righthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_BRICK_BRESSUMMER = registerBlock("timber_oak_orange_brick_bressummer", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));

    public static final Block TIMBER_OAK_OLDTOWN_BRICK_CROSSHATCH = registerBlock("timber_oak_oldtown_brick_crosshatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_OLDTOWN_BRICK_LEFTHATCH = registerBlock("timber_oak_oldtown_brick_lefthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_OLDTOWN_BRICK_RIGHTHATCH = registerBlock("timber_oak_oldtown_brick_righthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_OLDTOWN_BRICK_FRAME = registerBlock("timber_oak_oldtown_brick_frame", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_OLDTOWN_BRICK_VERTICAL = registerBlock("timber_oak_oldtown_brick_vertical", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_OLDTOWN_BRICK_CLOSE_STUDDING = registerBlock("timber_oak_oldtown_brick_close_studding", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_OLDTOWN_BRICK_LEFTHATCH_LARGE = registerBlock("timber_oak_oldtown_brick_lefthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_OLDTOWN_BRICK_RIGHTHATCH_LARGE = registerBlock("timber_oak_oldtown_brick_righthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_OLDTOWN_BRICK_LEFTHATCH_STUDDED = registerBlock("timber_oak_oldtown_brick_lefthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_OLDTOWN_BRICK_RIGHTHATCH_STUDDED = registerBlock("timber_oak_oldtown_brick_righthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_OLDTOWN_BRICK_BRESSUMMER = registerBlock("timber_oak_oldtown_brick_bressummer", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));

    public static final Block TIMBER_OAK_YELLOW_CROSSHATCH = registerBlock("timber_oak_yellow_crosshatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_YELLOW_LEFTHATCH = registerBlock("timber_oak_yellow_lefthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_YELLOW_RIGHTHATCH = registerBlock("timber_oak_yellow_righthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_YELLOW_FRAME = registerBlock("timber_oak_yellow_frame", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_YELLOW_VERTICAL = registerBlock("timber_oak_yellow_vertical", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_YELLOW_CLOSE_STUDDING = registerBlock("timber_oak_yellow_close_studding", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_YELLOW_LEFTHATCH_LARGE = registerBlock("timber_oak_yellow_lefthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_YELLOW_RIGHTHATCH_LARGE = registerBlock("timber_oak_yellow_righthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_YELLOW_LEFTHATCH_STUDDED = registerBlock("timber_oak_yellow_lefthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_YELLOW_RIGHTHATCH_STUDDED = registerBlock("timber_oak_yellow_righthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_YELLOW_BRESSUMMER = registerBlock("timber_oak_yellow_bressummer", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));

    public static final Block TIMBER_OAK_ORANGE_CROSSHATCH = registerBlock("timber_oak_orange_crosshatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_LEFTHATCH = registerBlock("timber_oak_orange_lefthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_RIGHTHATCH = registerBlock("timber_oak_orange_righthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_FRAME = registerBlock("timber_oak_orange_frame", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_VERTICAL = registerBlock("timber_oak_orange_vertical", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_CLOSE_STUDDING = registerBlock("timber_oak_orange_close_studding", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_LEFTHATCH_LARGE = registerBlock("timber_oak_orange_lefthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_RIGHTHATCH_LARGE = registerBlock("timber_oak_orange_righthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_LEFTHATCH_STUDDED = registerBlock("timber_oak_orange_lefthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_RIGHTHATCH_STUDDED = registerBlock("timber_oak_orange_righthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_ORANGE_BRESSUMMER = registerBlock("timber_oak_orange_bressummer", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));

    public static final Block TIMBER_OAK_LANNISPORT_BRICK_CROSSHATCH = registerBlock("timber_oak_lannisport_brick_crosshatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_LANNISPORT_BRICK_LEFTHATCH = registerBlock("timber_oak_lannisport_brick_lefthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_LANNISPORT_BRICK_RIGHTHATCH = registerBlock("timber_oak_lannisport_brick_righthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_LANNISPORT_BRICK_FRAME = registerBlock("timber_oak_lannisport_brick_frame", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_LANNISPORT_BRICK_VERTICAL = registerBlock("timber_oak_lannisport_brick_vertical", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_LANNISPORT_BRICK_CLOSE_STUDDING = registerBlock("timber_oak_lannisport_brick_close_studding", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_LANNISPORT_BRICK_LEFTHATCH_LARGE = registerBlock("timber_oak_lannisport_brick_lefthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_LANNISPORT_BRICK_RIGHTHATCH_LARGE = registerBlock("timber_oak_lannisport_brick_righthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_LANNISPORT_BRICK_LEFTHATCH_STUDDED = registerBlock("timber_oak_lannisport_brick_lefthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_LANNISPORT_BRICK_RIGHTHATCH_STUDDED = registerBlock("timber_oak_lannisport_brick_righthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_OAK_LANNISPORT_BRICK_BRESSUMMER = registerBlock("timber_oak_lannisport_brick_bressummer", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));

    public static final Block TIMBER_NORTHERN_BROWN_CROSSHATCH = registerBlock("timber_northern_brown_crosshatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BROWN_LEFTHATCH = registerBlock("timber_northern_brown_lefthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BROWN_RIGHTHATCH = registerBlock("timber_northern_brown_righthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BROWN_FRAME = registerBlock("timber_northern_brown_frame", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BROWN_VERTICAL = registerBlock("timber_northern_brown_vertical", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BROWN_CLOSE_STUDDING = registerBlock("timber_northern_brown_close_studding", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BROWN_LEFTHATCH_LARGE = registerBlock("timber_northern_brown_lefthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BROWN_RIGHTHATCH_LARGE = registerBlock("timber_northern_brown_righthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BROWN_LEFTHATCH_STUDDED = registerBlock("timber_northern_brown_lefthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BROWN_RIGHTHATCH_STUDDED = registerBlock("timber_northern_brown_righthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BROWN_BRESSUMMER = registerBlock("timber_northern_brown_bressummer", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));

    public static final Block TIMBER_NORTHERN_WHITE_CROSSHATCH = registerBlock("timber_northern_white_crosshatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_WHITE_LEFTHATCH = registerBlock("timber_northern_white_lefthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_WHITE_RIGHTHATCH = registerBlock("timber_northern_white_righthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_WHITE_FRAME = registerBlock("timber_northern_white_frame", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_WHITE_VERTICAL = registerBlock("timber_northern_white_vertical", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_WHITE_CLOSE_STUDDING = registerBlock("timber_northern_white_close_studding", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_WHITE_LEFTHATCH_LARGE = registerBlock("timber_northern_white_lefthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_WHITE_RIGHTHATCH_LARGE = registerBlock("timber_northern_white_righthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_WHITE_LEFTHATCH_STUDDED = registerBlock("timber_northern_white_lefthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_WHITE_RIGHTHATCH_STUDDED = registerBlock("timber_northern_white_righthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_WHITE_BRESSUMMER = registerBlock("timber_northern_white_bressummer", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));

    public static final Block TIMBER_NORTHERN_ORANGE_BRICK_CROSSHATCH = registerBlock("timber_northern_orange_brick_crosshatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_ORANGE_BRICK_LEFTHATCH = registerBlock("timber_northern_orange_brick_lefthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_ORANGE_BRICK_RIGHTHATCH = registerBlock("timber_northern_orange_brick_righthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_ORANGE_BRICK_FRAME = registerBlock("timber_northern_orange_brick_frame", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_ORANGE_BRICK_VERTICAL = registerBlock("timber_northern_orange_brick_vertical", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_ORANGE_BRICK_CLOSE_STUDDING = registerBlock("timber_northern_orange_brick_close_studding", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_ORANGE_BRICK_LEFTHATCH_LARGE = registerBlock("timber_northern_orange_brick_lefthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_ORANGE_BRICK_RIGHTHATCH_LARGE = registerBlock("timber_northern_orange_brick_righthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_ORANGE_BRICK_LEFTHATCH_STUDDED = registerBlock("timber_northern_orange_brick_lefthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_ORANGE_BRICK_RIGHTHATCH_STUDDED = registerBlock("timber_northern_orange_brick_righthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_ORANGE_BRICK_BRESSUMMER = registerBlock("timber_northern_orange_brick_bressummer", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));

    public static final Block TIMBER_NORTHERN_GREY_BRICK_CROSSHATCH = registerBlock("timber_northern_grey_brick_crosshatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREY_BRICK_LEFTHATCH = registerBlock("timber_northern_grey_brick_lefthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREY_BRICK_RIGHTHATCH = registerBlock("timber_northern_grey_brick_righthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREY_BRICK_FRAME = registerBlock("timber_northern_grey_brick_frame", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREY_BRICK_VERTICAL = registerBlock("timber_northern_grey_brick_vertical", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREY_BRICK_CLOSE_STUDDING = registerBlock("timber_northern_grey_brick_close_studding", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREY_BRICK_LEFTHATCH_LARGE = registerBlock("timber_northern_grey_brick_lefthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREY_BRICK_RIGHTHATCH_LARGE = registerBlock("timber_northern_grey_brick_righthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREY_BRICK_LEFTHATCH_STUDDED = registerBlock("timber_northern_grey_brick_lefthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREY_BRICK_RIGHTHATCH_STUDDED = registerBlock("timber_northern_grey_brick_righthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREY_BRICK_BRESSUMMER = registerBlock("timber_northern_grey_brick_bressummer", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));

    public static final Block TIMBER_NORTHERN_RED_CROSSHATCH = registerBlock("timber_northern_red_crosshatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_RED_LEFTHATCH = registerBlock("timber_northern_red_lefthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_RED_RIGHTHATCH = registerBlock("timber_northern_red_righthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_RED_FRAME = registerBlock("timber_northern_red_frame", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_RED_VERTICAL = registerBlock("timber_northern_red_vertical", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_RED_CLOSE_STUDDING = registerBlock("timber_northern_red_close_studding", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_RED_LEFTHATCH_LARGE = registerBlock("timber_northern_red_lefthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_RED_RIGHTHATCH_LARGE = registerBlock("timber_northern_red_righthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_RED_LEFTHATCH_STUDDED = registerBlock("timber_northern_red_lefthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_RED_RIGHTHATCH_STUDDED = registerBlock("timber_northern_red_righthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_RED_BRESSUMMER = registerBlock("timber_northern_red_bressummer", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));

    public static final Block TIMBER_NORTHERN_PALE_YELLOW_CROSSHATCH = registerBlock("timber_northern_pale_yellow_crosshatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_PALE_YELLOW_LEFTHATCH = registerBlock("timber_northern_pale_yellow_lefthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_PALE_YELLOW_RIGHTHATCH = registerBlock("timber_northern_pale_yellow_righthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_PALE_YELLOW_FRAME = registerBlock("timber_northern_pale_yellow_frame", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_PALE_YELLOW_VERTICAL = registerBlock("timber_northern_pale_yellow_vertical", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_PALE_YELLOW_CLOSE_STUDDING = registerBlock("timber_northern_pale_yellow_close_studding", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_PALE_YELLOW_LEFTHATCH_LARGE = registerBlock("timber_northern_pale_yellow_lefthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_PALE_YELLOW_RIGHTHATCH_LARGE = registerBlock("timber_northern_pale_yellow_righthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_PALE_YELLOW_LEFTHATCH_STUDDED = registerBlock("timber_northern_pale_yellow_lefthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_PALE_YELLOW_RIGHTHATCH_STUDDED = registerBlock("timber_northern_pale_yellow_righthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_PALE_YELLOW_BRESSUMMER = registerBlock("timber_northern_pale_yellow_bressummer", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));

    public static final Block TIMBER_NORTHERN_BLUE_CROSSHATCH = registerBlock("timber_northern_blue_crosshatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BLUE_LEFTHATCH = registerBlock("timber_northern_blue_lefthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BLUE_RIGHTHATCH = registerBlock("timber_northern_blue_righthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BLUE_FRAME = registerBlock("timber_northern_blue_frame", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BLUE_VERTICAL = registerBlock("timber_northern_blue_vertical", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BLUE_CLOSE_STUDDING = registerBlock("timber_northern_blue_close_studding", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BLUE_LEFTHATCH_LARGE = registerBlock("timber_northern_blue_lefthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BLUE_RIGHTHATCH_LARGE = registerBlock("timber_northern_blue_righthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BLUE_LEFTHATCH_STUDDED = registerBlock("timber_northern_blue_lefthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BLUE_RIGHTHATCH_STUDDED = registerBlock("timber_northern_blue_righthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_BLUE_BRESSUMMER = registerBlock("timber_northern_blue_bressummer", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));

    public static final Block TIMBER_NORTHERN_GREEN_CROSSHATCH = registerBlock("timber_northern_green_crosshatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREEN_LEFTHATCH = registerBlock("timber_northern_green_lefthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREEN_RIGHTHATCH = registerBlock("timber_northern_green_righthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREEN_FRAME = registerBlock("timber_northern_green_frame", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREEN_VERTICAL = registerBlock("timber_northern_green_vertical", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREEN_CLOSE_STUDDING = registerBlock("timber_northern_green_close_studding", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREEN_LEFTHATCH_LARGE = registerBlock("timber_northern_green_lefthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREEN_RIGHTHATCH_LARGE = registerBlock("timber_northern_green_righthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREEN_LEFTHATCH_STUDDED = registerBlock("timber_northern_green_lefthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREEN_RIGHTHATCH_STUDDED = registerBlock("timber_northern_green_righthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_NORTHERN_GREEN_BRESSUMMER = registerBlock("timber_northern_green_bressummer", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));

    public static final Block TIMBER_WHITEWASHED_CROSSHATCH = registerBlock("timber_whitewashed_crosshatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_WHITEWASHED_LEFTHATCH = registerBlock("timber_whitewashed_lefthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_WHITEWASHED_RIGHTHATCH = registerBlock("timber_whitewashed_righthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_WHITEWASHED_FRAME = registerBlock("timber_whitewashed_frame", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_WHITEWASHED_VERTICAL = registerBlock("timber_whitewashed_vertical", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_WHITEWASHED_CLOSE_STUDDING = registerBlock("timber_whitewashed_close_studding", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_WHITEWASHED_LEFTHATCH_LARGE = registerBlock("timber_whitewashed_lefthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_WHITEWASHED_RIGHTHATCH_LARGE = registerBlock("timber_whitewashed_righthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_WHITEWASHED_LEFTHATCH_STUDDED = registerBlock("timber_whitewashed_lefthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_WHITEWASHED_RIGHTHATCH_STUDDED = registerBlock("timber_whitewashed_righthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_WHITEWASHED_BRESSUMMER = registerBlock("timber_whitewashed_bressummer", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));

    public static final Block TIMBER_RED_WHITE_CROSSHATCH = registerBlock("timber_red_white_crosshatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_RED_WHITE_LEFTHATCH = registerBlock("timber_red_white_lefthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_RED_WHITE_RIGHTHATCH = registerBlock("timber_red_white_righthatch", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_RED_WHITE_FRAME = registerBlock("timber_red_white_frame", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_RED_WHITE_VERTICAL = registerBlock("timber_red_white_vertical", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_RED_WHITE_CLOSE_STUDDING = registerBlock("timber_red_white_close_studding", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_RED_WHITE_LEFTHATCH_LARGE = registerBlock("timber_red_white_lefthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_RED_WHITE_RIGHTHATCH_LARGE = registerBlock("timber_red_white_righthatch_large", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_RED_WHITE_LEFTHATCH_STUDDED = registerBlock("timber_red_white_lefthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_RED_WHITE_RIGHTHATCH_STUDDED = registerBlock("timber_red_white_righthatch_studded", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));
    public static final Block TIMBER_RED_WHITE_BRESSUMMER = registerBlock("timber_red_white_bressummer", new TimberFrameBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).requiresTool()));


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
