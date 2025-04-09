package com.fal701.block.Miscellaneous;

import com.fal701.Rhumtopia;
import com.fal701.block.WaterAir.WaterAir;
import com.fal701.block.Z_custom.WcDirectionalBlock;
import com.fal701.block.Z_custom.WcWall;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Miscellaneous {
    public static Block BEES = registerBlock("bees", new Block(FabricBlockSettings.create().noCollision().nonOpaque()));
    public static Block DRAGONFLY = registerBlock("dragonfly", new Block(FabricBlockSettings.create().noCollision().nonOpaque()));
    public static Block BUTTERFLY_WHITE = registerBlock("butterfly_white", new Block(FabricBlockSettings.create().noCollision().nonOpaque()));
    public static Block BUTTERFLY_RED = registerBlock("butterfly_red", new Block(FabricBlockSettings.create().noCollision().nonOpaque()));
    public static Block BUTTERFLY_ORANGE = registerBlock("butterfly_orange", new Block(FabricBlockSettings.create().noCollision().nonOpaque()));
    public static Block BUTTERFLY_YELLOW = registerBlock("butterfly_yellow", new Block(FabricBlockSettings.create().noCollision().nonOpaque()));
    public static Block BUTTERFLY_BLUE = registerBlock("butterfly_blue", new Block(FabricBlockSettings.create().noCollision().nonOpaque()));
    public static Block WINTERFELL_STONE_LADDER = registerBlock("winterfell_stone_ladder", new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).nonOpaque()));
    public static Block CHAIN_PULLEY = registerBlock("chain_pulley", new WcDirectionalBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static Block ROPE_PULLEY = registerBlock("rope_pulley", new WcDirectionalBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static Block ARCHERY_TARGET = registerBlock("archery_target", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static Block STACKED_BONES = registerBlock("stacked_bones", new PillarBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static Block STACKED_BONES_SOLID = registerBlock("stacked_bones_solid", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static Block STACKED_BONES_STAIRS = registerBlock("stacked_bones_stairs", new StairsBlock(Miscellaneous.STACKED_BONES_SOLID.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SNOW)));
    public static Block STACKED_BONES_SLAB = registerBlock("stacked_bones_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static Block STACKED_BONES_WALL = registerBlock("stacked_bones_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static Block PILED_BONES = registerBlock("piled_bones", new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static Block PILED_BONES_STAIRS = registerBlock("piled_bones_stairs", new StairsBlock(Miscellaneous.PILED_BONES.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SNOW)));
    public static Block PILED_BONES_SLAB = registerBlock("piled_bones_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static Block PILED_BONES_WALL = registerBlock("piled_bones_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static Block ASH = registerBlock("ash", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static Block ASH_SLAB = registerBlock("ash_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static Block ASH_LAYER = registerBlock("ash_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));

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
