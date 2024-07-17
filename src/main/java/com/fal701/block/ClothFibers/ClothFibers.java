package com.fal701.block.ClothFibers;

import com.fal701.Rhumtopia;
import com.fal701.block.Z_custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ClothFibers {
    public static final Block CLOTHESLINE = registerBlock("clothesline", new WcClothesline(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block VERTICAL_ROPE = registerBlock("vertical_rope", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque().noCollision()));
    public static final Block ROPE_BLOCK_HARNESS = registerBlock("rope_block_harness", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque().noCollision()));
    public static final Block ROPE_LADDER = registerBlock("rope_ladder", new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER).nonOpaque()));
    public static final Block VERTICAL_NET = registerBlock("vertical_net", new PaneBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block HORIZONTAL_ROPE = registerBlock("horizontal_rope", new WcRail(false, FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block HORIZONTAL_NET = registerBlock("horizontal_net", new WcRail(true, FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block FANCY_RED_CARPET = registerBlock("fancy_red_carpet", new WcRail(true, FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block FANCY_BLUE_CARPET = registerBlock("fancy_blue_carpet", new WcRail(true, FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block BLACK_WOOL = registerBlock("black_wool", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs", new StairsBlock(ClothFibers.BLACK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BLACK_WOOL_SLAB = registerBlock("black_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BLACK_WOOL_WALL = registerBlock("black_wool_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BLACK_WOOL_FENCE = registerBlock("black_wool_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BLACK_WOOL_TIP = registerBlock("black_wool_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BLACK_WOOL_CARPET = registerBlock("black_wool_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GREY_WOOL = registerBlock("grey_wool", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GREY_WOOL_STAIRS = registerBlock("grey_wool_stairs", new StairsBlock(ClothFibers.BLACK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GREY_WOOL_SLAB = registerBlock("grey_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GREY_WOOL_WALL = registerBlock("grey_wool_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GREY_WOOL_FENCE = registerBlock("grey_wool_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GREY_WOOL_TIP = registerBlock("grey_wool_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GREY_WOOL_CARPET = registerBlock("grey_wool_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_GREY_WOOL = registerBlock("light_grey_wool", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_GREY_WOOL_STAIRS = registerBlock("light_grey_wool_stairs", new StairsBlock(ClothFibers.BLACK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_GREY_WOOL_SLAB = registerBlock("light_grey_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_GREY_WOOL_WALL = registerBlock("light_grey_wool_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_GREY_WOOL_FENCE = registerBlock("light_grey_wool_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_GREY_WOOL_TIP = registerBlock("light_grey_wool_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_GREY_WOOL_CARPET = registerBlock("light_grey_wool_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL = registerBlock("white_wool", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs", new StairsBlock(ClothFibers.BLACK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_WALL = registerBlock("white_wool_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_FENCE = registerBlock("white_wool_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_TIP = registerBlock("white_wool_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block WHITE_WOOL_CARPET = registerBlock("white_wool_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block DIRTY_WHITE_WOOL = registerBlock("dirty_white_wool", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block DIRTY_WHITE_WOOL_STAIRS = registerBlock("dirty_white_wool_stairs", new StairsBlock(ClothFibers.BLACK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block DIRTY_WHITE_WOOL_SLAB = registerBlock("dirty_white_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block DIRTY_WHITE_WOOL_WALL = registerBlock("dirty_white_wool_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block DIRTY_WHITE_WOOL_FENCE = registerBlock("dirty_white_wool_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block DIRTY_WHITE_WOOL_TIP = registerBlock("dirty_white_wool_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block DIRTY_WHITE_WOOL_CARPET = registerBlock("dirty_white_wool_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_BROWN_WOOL = registerBlock("light_brown_wool", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_BROWN_WOOL_STAIRS = registerBlock("light_brown_wool_stairs", new StairsBlock(ClothFibers.BLACK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_BROWN_WOOL_SLAB = registerBlock("light_brown_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_BROWN_WOOL_WALL = registerBlock("light_brown_wool_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_BROWN_WOOL_FENCE = registerBlock("light_brown_wool_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_BROWN_WOOL_TIP = registerBlock("light_brown_wool_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_BROWN_WOOL_CARPET = registerBlock("light_brown_wool_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BROWN_WOOL = registerBlock("brown_wool", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs", new StairsBlock(ClothFibers.BLACK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BROWN_WOOL_SLAB = registerBlock("brown_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BROWN_WOOL_WALL = registerBlock("brown_wool_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BROWN_WOOL_FENCE = registerBlock("brown_wool_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BROWN_WOOL_TIP = registerBlock("brown_wool_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BROWN_WOOL_CARPET = registerBlock("brown_wool_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block RED_WOOL = registerBlock("red_wool", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block RED_WOOL_STAIRS = registerBlock("red_wool_stairs", new StairsBlock(ClothFibers.BLACK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block RED_WOOL_SLAB = registerBlock("red_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block RED_WOOL_WALL = registerBlock("red_wool_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block RED_WOOL_FENCE = registerBlock("red_wool_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block RED_WOOL_TIP = registerBlock("red_wool_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block RED_WOOL_CARPET = registerBlock("red_wool_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block ORANGE_WOOL = registerBlock("orange_wool", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs", new StairsBlock(ClothFibers.BLACK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block ORANGE_WOOL_WALL = registerBlock("orange_wool_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block ORANGE_WOOL_FENCE = registerBlock("orange_wool_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block ORANGE_WOOL_TIP = registerBlock("orange_wool_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block ORANGE_WOOL_CARPET = registerBlock("orange_wool_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block YELLOW_WOOL = registerBlock("yellow_wool", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs", new StairsBlock(ClothFibers.BLACK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block YELLOW_WOOL_WALL = registerBlock("yellow_wool_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block YELLOW_WOOL_FENCE = registerBlock("yellow_wool_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block YELLOW_WOOL_TIP = registerBlock("yellow_wool_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block YELLOW_WOOL_CARPET = registerBlock("yellow_wool_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GREEN_WOOL = registerBlock("green_wool", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs", new StairsBlock(ClothFibers.BLACK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GREEN_WOOL_SLAB = registerBlock("green_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GREEN_WOOL_WALL = registerBlock("green_wool_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GREEN_WOOL_FENCE = registerBlock("green_wool_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GREEN_WOOL_TIP = registerBlock("green_wool_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GREEN_WOOL_CARPET = registerBlock("green_wool_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block CYAN_WOOL = registerBlock("cyan_wool", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs", new StairsBlock(ClothFibers.BLACK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block CYAN_WOOL_WALL = registerBlock("cyan_wool_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block CYAN_WOOL_FENCE = registerBlock("cyan_wool_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block CYAN_WOOL_TIP = registerBlock("cyan_wool_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block CYAN_WOOL_CARPET = registerBlock("cyan_wool_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL = registerBlock("light_blue_wool", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs", new StairsBlock(ClothFibers.BLACK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_WALL = registerBlock("light_blue_wool_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_FENCE = registerBlock("light_blue_wool_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_TIP = registerBlock("light_blue_wool_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIGHT_BLUE_WOOL_CARPET = registerBlock("light_blue_wool_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PURPLE_WOOL = registerBlock("purple_wool", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs", new StairsBlock(ClothFibers.BLACK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PURPLE_WOOL_WALL = registerBlock("purple_wool_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PURPLE_WOOL_FENCE = registerBlock("purple_wool_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PURPLE_WOOL_TIP = registerBlock("purple_wool_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PURPLE_WOOL_CARPET = registerBlock("purple_wool_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PINK_WOOL = registerBlock("pink_wool", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs", new StairsBlock(ClothFibers.BLACK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PINK_WOOL_SLAB = registerBlock("pink_wool_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PINK_WOOL_WALL = registerBlock("pink_wool_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PINK_WOOL_FENCE = registerBlock("pink_wool_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PINK_WOOL_TIP = registerBlock("pink_wool_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PINK_WOOL_CARPET = registerBlock("pink_wool_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LEATHER = registerBlock("leather", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LEATHER_STAIRS = registerBlock("leather_stairs", new StairsBlock(ClothFibers.BLACK_WOOL.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LEATHER_SLAB = registerBlock("leather_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LEATHER_WALL = registerBlock("leather_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
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
