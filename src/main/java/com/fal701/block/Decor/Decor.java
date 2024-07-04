package com.fal701.block.Decor;

import com.fal701.Rhumtopia;
import com.fal701.block.Z_custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Decor {
    public static final Block HORIZONTAL_PAPER = registerBlock("horizontal_paper", new WcHorizontalPaper(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).nonOpaque()));
    public static final Block PEWTER_FLAGON = registerBlock("pewter_flagon", new WcFlacon(FabricBlockSettings.copyOf(Blocks.GLASS)));

    public static final Block CLOSED_BARREL = registerBlock("closed_barrel", new WcDirectionalBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FIREWOOD = registerBlock("firewood", new WcDirectionalBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FIREWOOD_SLAB = registerBlock("firewood_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FIREWOOD_DIRECTIONAL_SLAB = registerBlock("firewood_directional_slab", new WcDirectionalSlab(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BROKEN_SWORD = registerBlock("broken_sword", new WcDecor2Facing(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).nonOpaque()));
    public static final Block BONES = registerBlock("bones", new WcBones(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).nonOpaque()));
    public static final Block PEWTER_PLATE = registerBlock("pewter_plate", new WcPlate(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).nonOpaque()));
    public static final Block WOODEN_PLATE = registerBlock("wooden_plate", new WcPlate(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).nonOpaque()));
    public static final Block GLASS_FLAGON = registerBlock("glass_flagon", new WcFlacon(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block BLOOD = registerBlock("blood", new WcDecorBlock0x1Horizontal(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).nonOpaque()));
    public static final Block HORSE_SHOES = registerBlock("horse_shoes", new WcDecor2Facing(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).nonOpaque()));
    public static final Block COINS = registerBlock("coins", new WcCoins(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).nonOpaque()));
    public static final Block FRYING_PAN = registerBlock("frying_pan", new WcDecor2Facing(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).nonOpaque()));


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
