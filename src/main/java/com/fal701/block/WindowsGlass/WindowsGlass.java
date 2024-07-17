package com.fal701.block.WindowsGlass;

import com.fal701.Rhumtopia;
import com.fal701.block.Z_custom.WcShutter;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class WindowsGlass {

    public static final Block SEPT_CRYSTAL_LARGE = registerBlock("sept_crystal_large", new Block(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block COLOURED_SEPT_WINDOW = registerBlock("coloured_sept_window", new Block(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block OAK_WINDOW_SHUTTERS = registerBlock("oak_window_shutters", new WcShutter(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK));
    public static final Block SPRUCE_WINDOW_SHUTTERS = registerBlock("spruce_window_shutters", new WcShutter(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK));
    public static final Block BIRCH_WINDOW_SHUTTERS = registerBlock("birch_window_shutters", new WcShutter(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK));
    public static final Block JUNGLE_WINDOW_SHUTTERS = registerBlock("jungle_window_shutters", new WcShutter(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK));
    public static final Block NORTHERN_WOOD_WINDOW_SHUTTERS = registerBlock("northern_wood_window_shutters", new WcShutter(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK));
    public static final Block GREY_WOOD_WINDOW_SHUTTERS = registerBlock("grey_wood_window_shutters", new WcShutter(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK));
    public static final Block WHITE_WOOD_WINDOW_SHUTTERS = registerBlock("white_wood_window_shutters", new WcShutter(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK));
    public static final Block DORNE_RED_WINDOW_SHUTTERS = registerBlock("dorne_red_window_shutters", new WcShutter(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK));
    public static final Block GREEN_LANNISPORT_WINDOW_SHUTTERS = registerBlock("green_lannisport_window_shutters", new WcShutter(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK));
    public static final Block REACH_BLUE_WINDOW_SHUTTERS = registerBlock("reach_blue_window_shutters", new WcShutter(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), BlockSetType.OAK));
    public static final Block DORNE_CARVED_WOODEN_WINDOW = registerBlock("dorne_carved_wooden_window", new PaneBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DORNE_CARVED_STONE_WINDOW = registerBlock("dorne_carved_stone_window", new PaneBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block STAINED_GLASS_RED = registerBlock("stained_glass_red", new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block STAINED_GLASS_PANE_RED = registerBlock("stained_glass_pane_red", new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block GLASS = registerBlock("glass", new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block GLASS_PANE = registerBlock("glass_pane", new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block STAINED_GLASS_BLACK = registerBlock("stained_glass_black", new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block STAINED_GLASS_ORANGE = registerBlock("stained_glass_orange", new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block STAINED_GLASS_YELLOW = registerBlock("stained_glass_yellow", new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block STAINED_GLASS_GREEN = registerBlock("stained_glass_green", new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block STAINED_GLASS_BLUE = registerBlock("stained_glass_blue", new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block STAINED_GLASS_PURPLE = registerBlock("stained_glass_purple", new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block STAINED_GLASS_PINK = registerBlock("stained_glass_pink", new GlassBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block STAINED_GLASS_PANE_BLACK = registerBlock("stained_glass_pane_black", new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block STAINED_GLASS_PANE_ORANGE = registerBlock("stained_glass_pane_orange", new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block STAINED_GLASS_PANE_YELLOW = registerBlock("stained_glass_pane_yellow", new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block STAINED_GLASS_PANE_GREEN = registerBlock("stained_glass_pane_green", new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block STAINED_GLASS_PANE_BLUE = registerBlock("stained_glass_pane_blue", new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block STAINED_GLASS_PANE_PURPLE = registerBlock("stained_glass_pane_purple", new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block STAINED_GLASS_PANE_PINK = registerBlock("stained_glass_pane_pink", new PaneBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));


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
