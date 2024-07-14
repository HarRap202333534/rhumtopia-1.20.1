package com.fal701.block.Foliage;

import com.fal701.Rhumtopia;
import com.fal701.block.Z_custom.WcDecorBlock0x1Horizontal;
import com.fal701.block.Z_custom.WcVines;
import com.fal701.block.Z_custom.WcWall;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Foliage {
    public static final Block FALLEN_WEIRWOOD_LEAVES = registerBlock("fallen_weirwood_leaves", new WcDecorBlock0x1Horizontal(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block DUCKWEED = registerBlock("duckweed", new WcDecorBlock0x1Horizontal(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block LILY_PAD = registerBlock("lily_pad", new WcDecorBlock0x1Horizontal(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block JASMINE_VINES = registerBlock("jasmine_vines", new WcVines(FabricBlockSettings.copyOf(Blocks.VINE).nonOpaque()));
    public static final Block VINES = registerBlock("vines", new WcVines(FabricBlockSettings.copyOf(Blocks.VINE).nonOpaque()));
    public static final Block DAPPLED_MOSS = registerBlock("dappled_moss", new WcVines(FabricBlockSettings.copyOf(Blocks.VINE).nonOpaque()));
    public static final Block APPLE_FRUIT_LEAVES = registerBlock("apple_fruit_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block APRICOT_FRUIT_LEAVES = registerBlock("apricot_fruit_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block CHERRY_FRUIT_LEAVES = registerBlock("cherry_fruit_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block PURPLE_GRAPE_FRUIT_LEAVES = registerBlock("purple_grape_fruit_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block LEMON_FRUIT_LEAVES = registerBlock("lemon_fruit_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block LIME_FRUIT_LEAVES = registerBlock("lime_fruit_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block ORANGE_FRUIT_LEAVES = registerBlock("orange_fruit_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block PEACH_FRUIT_LEAVES = registerBlock("peach_fruit_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block PLUM_FRUIT_LEAVES = registerBlock("plum_fruit_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block POMEGRANATE_FRUIT_LEAVES = registerBlock("pomegranate_fruit_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block WEIRWOOD_LEAVES = registerBlock("weirwood_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block BLACKBERRY_BUSH = registerBlock("blackberry_bush", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block BLUEBERRY_BUSH = registerBlock("blueberry_bush", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block RASPBERRY_BUSH = registerBlock("raspberry_bush", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block JUNIPER_BUSH = registerBlock("juniper_bush", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block RED_ROSE_BUSH = registerBlock("red_rose_bush", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block PINK_ROSE_BUSH = registerBlock("pink_rose_bush", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block WHITE_ROSE_BUSH = registerBlock("white_rose_bush", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block YELLOW_ROSE_BUSH = registerBlock("yellow_rose_bush", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block HOP_FRUIT_LEAVES = registerBlock("hop_fruit_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block OLIVE_FRUIT_LEAVES = registerBlock("olive_fruit_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block PALM_LEAVES = registerBlock("palm_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block WHITE_GRAPE_FRUIT_LEAVES = registerBlock("white_grape_fruit_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block SNOWY_SPRUCE_LEAVES = registerBlock("snowy_spruce_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block SNOWY_WEIRWOOD_LEAVES = registerBlock("snowy_weirwood_leaves", new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).nonOpaque()));
    public static final Block CUSHION_MOSS = registerBlock("cushion_moss", new Block(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK)));
    public static final Block CUSHION_MOSS_STAIRS = registerBlock("cushion_moss_stairs", new StairsBlock(Foliage.CUSHION_MOSS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK)));
    public static final Block CUSHION_MOSS_SLAB = registerBlock("cushion_moss_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK)));
    public static final Block CUSHION_MOSS_WALL = registerBlock("cushion_moss_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK)));




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
