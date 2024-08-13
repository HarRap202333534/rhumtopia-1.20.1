package com.fal701.block.Furniture;

import com.fal701.Rhumtopia;
import com.fal701.block.Z_custom.WcBed;
import com.fal701.block.Z_custom.WcDecorBlock0x1Vertical;
import com.fal701.block.Z_custom.WcFurnaceBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;

public class Furniture {

    public static final Block TABLE = registerBlock("table", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block BENCH_BUTCHER_KNIVES = registerBlock("bench_butcher_knives", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BENCH_CARPENTRY_HAMMER_SAW = registerBlock("bench_carpentry_hammer_saw", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BENCH_DRAWERS = registerBlock("bench_drawers", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BENCH_KITCHEN_KNIVES = registerBlock("bench_kitchen_knives", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BENCH_KITCHEN_PANS = registerBlock("bench_kitchen_pans", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BENCH_MASON_HAMMER_MALLET = registerBlock("bench_mason_hammer_mallet", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block TABLE_DRAWERS = registerBlock("table_drawers", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block TABLE_BOOKS = registerBlock("table_books", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block TABLE_WIDGETS = registerBlock("table_widgets", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block EMPTY_CABINET = registerBlock("empty_cabinet", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BROKEN_CABINET = registerBlock("broken_cabinet", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CABINET_DRAWER = registerBlock("cabinet_drawer", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CLOSED_CABINET = registerBlock("closed_cabinet", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BOOKSHELF_LIBRARY = registerBlock("bookshelf_library", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BOOKSHELF_ABANDONED = registerBlock("bookshelf_abandoned", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BOOKSHELF_MAESTER = registerBlock("bookshelf_maester", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block MIRROR_BLOCK = registerBlock("mirror_block", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block STOOL = registerBlock("stool", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block STOOL_CUSHION = registerBlock("stool_cushion", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block NIGHTS_WATCH_BED = registerBlock("nights_watch_bed", new WcBed(DyeColor.BLACK, FabricBlockSettings.copyOf(Blocks.WHITE_BED)));
    public static final Block NORTHERN_BED = registerBlock("northern_bed", new WcBed(DyeColor.BLACK, FabricBlockSettings.copyOf(Blocks.WHITE_BED)));
    public static final Block STRAW_BED = registerBlock("straw_bed", new WcBed(DyeColor.BLACK, FabricBlockSettings.copyOf(Blocks.WHITE_BED)));
    public static final Block ITCHY_STRAW_BED = registerBlock("itchy_straw_bed", new WcBed(DyeColor.BLACK, FabricBlockSettings.copyOf(Blocks.WHITE_BED)));
    public static final Block NOBLE_BLUE_BED = registerBlock("noble_blue_bed", new WcBed(DyeColor.BLACK, FabricBlockSettings.copyOf(Blocks.WHITE_BED).nonOpaque()));
    public static final Block NOBLE_RED_BED = registerBlock("noble_red_bed", new WcBed(DyeColor.BLACK, FabricBlockSettings.copyOf(Blocks.WHITE_BED).nonOpaque()));
    public static final Block PALE_RED_BED = registerBlock("pale_red_bed", new WcBed(DyeColor.BLACK, FabricBlockSettings.copyOf(Blocks.WHITE_BED)));
    public static final Block PALE_GREEN_BED = registerBlock("pale_green_bed", new WcBed(DyeColor.BLACK, FabricBlockSettings.copyOf(Blocks.WHITE_BED)));
    public static final Block HAMMOCK = registerBlock("hammock", new WcBed(DyeColor.BLACK, FabricBlockSettings.copyOf(Blocks.WHITE_BED).nonOpaque()));
    public static final Block DARK_GREY_BRICK_FURNACE = registerBlock("dark_grey_brick_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), false));
    public static final Block ALWAYS_ACTIVE_DARK_GREY_BRICK_FURNACE = registerBlock("always_active_dark_grey_brick_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), true));
    public static final Block STONE_FURNACE = registerBlock("stone_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), false));
    public static final Block ALWAYS_ACTIVE_STONE_FURNACE = registerBlock("always_active_stone_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), true));
    public static final Block LIGHT_GREY_BRICK_FURNACE = registerBlock("light_grey_brick_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), false));
    public static final Block ALWAYS_ACTIVE_LIGHT_GREY_BRICK_FURNACE = registerBlock("always_active_light_grey_brick_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), true));
    public static final Block REACH_BRICK_FURNACE = registerBlock("reach_brick_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), false));
    public static final Block ALWAYS_ACTIVE_REACH_BRICK_FURNACE = registerBlock("always_active_reach_brick_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), true));
    public static final Block DUN_BRICK_FURNACE = registerBlock("dun_brick_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), false));
    public static final Block ALWAYS_ACTIVE_DUN_BRICK_FURNACE = registerBlock("always_active_dun_brick_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), true));
    public static final Block OLDTOWN_BRICK_FURNACE = registerBlock("oldtown_brick_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), false));
    public static final Block ALWAYS_ACTIVE_OLDTOWN_BRICK_FURNACE = registerBlock("always_active_oldtown_brick_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), true));
    public static final Block SANDSTONE_FURNACE = registerBlock("sandstone_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), false));
    public static final Block ALWAYS_ACTIVE_SANDSTONE_FURNACE = registerBlock("always_active_sandstone_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), true));
    public static final Block ARBOR_BRICK_FURNACE = registerBlock("arbor_brick_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), false));
    public static final Block ALWAYS_ACTIVE_ARBOR_BRICK_FURNACE = registerBlock("always_active_arbor_brick_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), true));
    public static final Block DORNISH_MUD_FURNACE = registerBlock("dornish_mud_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), false));
    public static final Block ALWAYS_ACTIVE_DORNISH_MUD_FURNACE = registerBlock("always_active_dornish_mud_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), true));
    public static final Block ORANGE_BRICK_FURNACE = registerBlock("orange_brick_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), false));
    public static final Block ALWAYS_ACTIVE_BRICK_FURNACE = registerBlock("always_active_brick_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), true));
    public static final Block SOUTHERN_BRICK_FURNACE = registerBlock("southern_brick_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), false));
    public static final Block ALWAYS_ACTIVE_SOUTHERN_BRICK_FURNACE = registerBlock("always_active_southern_brick_furnace", new WcFurnaceBlock(FabricBlockSettings.copyOf(Blocks.FURNACE).nonOpaque(), true));

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
