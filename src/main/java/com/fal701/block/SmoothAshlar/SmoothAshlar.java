package com.fal701.block.SmoothAshlar;

import com.fal701.block.Z_custom.WcArrowSlit;
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

public class SmoothAshlar {
    public static final Block BLACK_LIGHT_STONE = registerBlock("black_light_stone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_LIGHT_STONE_STAIRS = registerBlock("black_light_stone_stairs", new WcStairs(SmoothAshlar.BLACK_LIGHT_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_LIGHT_STONE_SLAB = registerBlock("black_light_stone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_LIGHT_STONE_WALL = registerBlock("black_light_stone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_LIGHT_STONE_FENCE = registerBlock("black_light_stone_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_LIGHT_STONE_HOPPER = registerBlock("black_light_stone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_LIGHT_STONE_TIP = registerBlock("black_light_stone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_LIGHT_STONE_ARROW_SLIT = registerBlock("black_light_stone_arrow_slit", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_LIGHT_STONE_ARROW_SLIT_WINDOW = registerBlock("black_light_stone_arrow_slit_window", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BLACK_LIGHT_STONE_ARROW_SLIT_ORNATE = registerBlock("black_light_stone_arrow_slit_ornate", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));


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
