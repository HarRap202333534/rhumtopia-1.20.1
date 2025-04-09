package com.fal701.block.Lighting;

import com.fal701.Rhumtopia;
import com.fal701.block.Z_custom.WcCandleAltar;
import com.fal701.block.Z_custom.WcLantern;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LightBlock;
import net.minecraft.block.TorchBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Lighting {
    public static final Block CANDLE = registerBlock("candle", new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH).nonOpaque(), ParticleTypes.FLAME));
    public static final Block CANDLE_ALTAR = registerBlock("candle_altar", new WcCandleAltar(FabricBlockSettings.copyOf(Blocks.TORCH).nonOpaque()));
    public static final Block TORCH = registerBlock("torch", new TorchBlock(FabricBlockSettings.copyOf(Blocks.TORCH).nonOpaque(), ParticleTypes.FLAME));
    public static final Block BRAZIER = registerBlock("brazier", new Block(FabricBlockSettings.copyOf(Blocks.TORCH).nonOpaque()));
    public static final Block BRAZIER2 = registerBlock("brazier2", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).nonOpaque()));
    public static final Block LANTERN = registerBlock("lantern", new WcLantern(FabricBlockSettings.copyOf(Blocks.LANTERN).nonOpaque()));
    public static final Block RED_LANTERN = registerBlock("red_lantern", new WcLantern(FabricBlockSettings.copyOf(Blocks.LANTERN).nonOpaque()));
    public static final Block RED_LANTERN2 = registerBlock("red_lantern2", new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE)));
    public static final Block GLOWING_EMBERS = registerBlock("glowing_embers", new Block(FabricBlockSettings.copyOf(Blocks.MAGMA_BLOCK)));

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
