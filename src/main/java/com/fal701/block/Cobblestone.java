package com.fal701.block;

import com.fal701.block.custom.WcHopper;
import com.fal701.block.custom.WcHopperU;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class Cobblestone {

    public static final Block COBBLESTONE_FENCE = registerBlock("cobblestone_fence", new FenceBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLESTONE_HOPPER = registerBlock("cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLESTONE_TIP = registerBlock("cobblestone_hopper_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));


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
