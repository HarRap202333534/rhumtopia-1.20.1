package com.fal701.block.Logs;

import com.fal701.Rhumtopia;
import com.fal701.block.Z_custom.WcFence;
import com.fal701.block.Z_custom.WcWall;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class Logs {
    public static final BlockSetType TYPE = new BlockSetType("locked", false, BlockSoundGroup.WOOD, SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN, SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    public static final WoodType TYPE2 = new WoodType("locked_gate", TYPE);

    public static final Block OAK = registerBlock("6sided_oak", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block THIN_OAK_LOG = registerBlock("thin_oak_log", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_BARK_FENCE = registerBlock("oak_bark_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LOCKED_OAK_BARK_FENCE_GATE = registerBlock("locked_oak_bark_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), TYPE2));
    public static final Block MOSSY_OAK_LOG = registerBlock("mossy_oak_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_LOG_ROPE = registerBlock("oak_log_rope", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_LOG_CHAIN = registerBlock("oak_log_chain", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block SPRUCE = registerBlock("6sided_spruce", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block THIN_SPRUCE_LOG = registerBlock("thin_spruce_log", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_BARK_FENCE = registerBlock("spruce_bark_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LOCKED_SPRUCE_BARK_FENCE_GATE = registerBlock("locked_spruce_bark_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), TYPE2));
    public static final Block MOSSY_SPRUCE_LOG = registerBlock("mossy_spruce_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_LOG_ROPE = registerBlock("spruce_log_rope", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_LOG_CHAIN = registerBlock("spruce_log_chain", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block BIRCH = registerBlock("6sided_birch", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block THIN_BIRCH_LOG = registerBlock("thin_birch_log", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_BARK_FENCE = registerBlock("birch_bark_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LOCKED_BIRCH_BARK_FENCE_GATE = registerBlock("locked_birch_bark_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), TYPE2));
    public static final Block MOSSY_BIRCH_LOG = registerBlock("mossy_birch_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block JUNGLE = registerBlock("6sided_jungle", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block THIN_JUNGLE_LOG = registerBlock("thin_jungle_log", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_BARK_FENCE = registerBlock("jungle_bark_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LOCKED_JUNGLE_BARK_FENCE_GATE = registerBlock("locked_jungle_bark_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), TYPE2));
    public static final Block MOSSY_JUNGLE_LOG = registerBlock("mossy_jungle_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)) {
    });
    public static final Block JUNGLE_LOG_ROPE = registerBlock("jungle_log_rope", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)) {
    });
    public static final Block JUNGLE_LOG_CHAIN = registerBlock("jungle_log_chain", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)) {
    });

    public static final Block PALM_TREE_LOG = registerBlock("palm_tree_log", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG)));
    public static final Block THIN_PALM_LOG = registerBlock("thin_palm_log", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PALM_FENCE = registerBlock("palm_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block WEIRWOOD_FACE_0 = registerBlock("weirwood_face_0", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WEIRWOOD_FACE_1 = registerBlock("weirwood_face_1", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WEIRWOOD_FACE_2 = registerBlock("weirwood_face_2", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WEIRWOOD_FACE_3 = registerBlock("weirwood_face_3", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WEIRWOOD_FACE_4 = registerBlock("weirwood_face_4", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WEIRWOOD_FACE_5 = registerBlock("weirwood_face_5", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WEIRWOOD_FACE_6 = registerBlock("weirwood_face_6", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WEIRWOOD_FACE_7 = registerBlock("weirwood_face_7", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WEIRWOOD_FACE_8 = registerBlock("weirwood_face_8", new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));



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
