package com.fal701.block.WaterAir;

import com.fal701.Rhumtopia;
import com.fal701.block.Z_custom.WcFence;
import com.fal701.block.Z_custom.WcSmoke;
import com.fal701.block.Z_custom.WcStairs;
import com.fal701.block.Z_custom.WcWall;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class WaterAir {

    public static Block SMOKE = registerBlock("smoke", new WcSmoke(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque().noCollision()));
    public static Block ICICLE = registerBlock("icicle", new Block(FabricBlockSettings.copyOf(Blocks.ICE).nonOpaque()));
    public static Block SNOW = registerBlock("snow", new Block(FabricBlockSettings.copyOf(Blocks.SNOW)));
    public static Block SNOW_STAIRS = registerBlock("snow_stairs", new StairsBlock(WaterAir.SNOW.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SNOW)));
    public static Block SNOW_SLAB = registerBlock("snow_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.SNOW)));
    public static Block SNOW_WALL = registerBlock("snow_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.SNOW)));
    public static Block SNOW_FENCE = registerBlock("snow_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.SNOW)));
    public static Block SNOW_LAYER = registerBlock("snow_layer", new SnowBlock(FabricBlockSettings.copyOf(Blocks.SNOW)));
    public static Block ICE = registerBlock("ice", new Block(FabricBlockSettings.copyOf(Blocks.ICE)));
    public static Block ICE_STAIRS = registerBlock("ice_stairs", new StairsBlock(WaterAir.ICE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.ICE)));
    public static Block ICE_SLAB = registerBlock("ice_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.ICE)));
    public static Block ICE_WALL = registerBlock("ice_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.ICE)));
    public static Block ICE_FENCE = registerBlock("ice_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.ICE)));

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
