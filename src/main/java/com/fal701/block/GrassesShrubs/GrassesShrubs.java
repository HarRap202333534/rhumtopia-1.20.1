package com.fal701.block.GrassesShrubs;

import com.fal701.Rhumtopia;
import com.fal701.block.Z_custom.WcPlant;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GrassesShrubs {
    public static final Block THICK_GRASS = registerBlock("thick_grass", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block GRASS = registerBlock("grass", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block GREEN_SPINY_HERB = registerBlock("green_spiny_herb", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block GREEN_LEAFY_HERB = registerBlock("green_leafy_herb", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block GREEN_SCRUB_GRASS = registerBlock("green_scrub_grass", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block DEAD_SCRUB_GRASS = registerBlock("dead_scrub_grass", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block MEADOW_FESCUE = registerBlock("meadow_fescue", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block BROWN_MUSHROOM_1 = registerBlock("brown_mushroom_1", new WcPlant(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM)));
    public static final Block BROWN_MUSHROOM_2 = registerBlock("brown_mushroom_2", new WcPlant(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM)));
    public static final Block BROWN_MUSHROOM_3 = registerBlock("brown_mushroom_3", new WcPlant(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM)));
    public static final Block BROWN_MUSHROOM_4 = registerBlock("brown_mushroom_4", new WcPlant(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM)));
    public static final Block BROWN_MUSHROOM_5 = registerBlock("brown_mushroom_5", new WcPlant(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM)));
    public static final Block BROWN_MUSHROOM_6 = registerBlock("brown_mushroom_6", new WcPlant(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM)));
    public static final Block BROWN_MUSHROOM_7 = registerBlock("brown_mushroom_7", new WcPlant(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM)));
    public static final Block BROWN_MUSHROOM_8 = registerBlock("brown_mushroom_8", new WcPlant(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM)));
    public static final Block BROWN_MUSHROOM_9 = registerBlock("brown_mushroom_9", new WcPlant(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM)));
    public static final Block BROWN_MUSHROOM_10 = registerBlock("brown_mushroom_10", new WcPlant(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM)));
    public static final Block BROWN_MUSHROOM_11 = registerBlock("brown_mushroom_11", new WcPlant(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM)));
    public static final Block BROWN_MUSHROOM_12 = registerBlock("brown_mushroom_12", new WcPlant(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM)));
    public static final Block BROWN_MUSHROOM_13 = registerBlock("brown_mushroom_13", new WcPlant(FabricBlockSettings.copyOf(Blocks.BROWN_MUSHROOM)));
    public static final Block RED_MUSHROOM_1 = registerBlock("red_mushroom_1", new WcPlant(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)));
    public static final Block RED_MUSHROOM_2 = registerBlock("red_mushroom_2", new WcPlant(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)));
    public static final Block RED_MUSHROOM_3 = registerBlock("red_mushroom_3", new WcPlant(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)));
    public static final Block RED_MUSHROOM_4 = registerBlock("red_mushroom_4", new WcPlant(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)));
    public static final Block RED_MUSHROOM_5 = registerBlock("red_mushroom_5", new WcPlant(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)));
    public static final Block RED_MUSHROOM_6 = registerBlock("red_mushroom_6", new WcPlant(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)));
    public static final Block RED_MUSHROOM_7 = registerBlock("red_mushroom_7", new WcPlant(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)));
    public static final Block RED_MUSHROOM_8 = registerBlock("red_mushroom_8", new WcPlant(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)));
    public static final Block RED_MUSHROOM_9 = registerBlock("red_mushroom_9", new WcPlant(FabricBlockSettings.copyOf(Blocks.RED_MUSHROOM)));
    public static final Block UNSHADED_GRASS = registerBlock("unshaded_grass", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block JUNGLE_TALL_FERN = registerBlock("jungle_tall_fern", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block JUNGLE_TALL_GRASS = registerBlock("jungle_tall_grass", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block SAVANNA_TALL_GRASS = registerBlock("savanna_tall_grass", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block DEAD_JUNGLE_TALL_GRASS = registerBlock("dead_jungle_tall_grass", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block DEAD_SAVANNA_TALL_GRASS = registerBlock("dead_savanna_tall_grass", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block CATTAILS = registerBlock("cattails", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block DEAD_BUSH = registerBlock("dead_bush", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block COW_PARSELY = registerBlock("cow_parsely", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block BRACKEN = registerBlock("bracken", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block LADY_FERN = registerBlock("lady_fern", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block NETTLE = registerBlock("nettle", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block DEAD_BRACKEN = registerBlock("dead_bracken", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block FIREWEED = registerBlock("fireweed", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block HEATHER = registerBlock("heather", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));
    public static final Block RED_FERN = registerBlock("red_fern", new WcPlant(FabricBlockSettings.copyOf(Blocks.GRASS)));




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
