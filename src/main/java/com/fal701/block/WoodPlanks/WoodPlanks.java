package com.fal701.block.WoodPlanks;

import com.fal701.Rhumtopia;
import com.fal701.block.Z_custom.*;
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

public class WoodPlanks {
    public static final BlockSetType TYPE = new BlockSetType("locked", false, BlockSoundGroup.WOOD, SoundEvents.BLOCK_WOODEN_DOOR_CLOSE, SoundEvents.BLOCK_WOODEN_DOOR_OPEN, SoundEvents.BLOCK_WOODEN_TRAPDOOR_CLOSE, SoundEvents.BLOCK_WOODEN_TRAPDOOR_OPEN, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_WOODEN_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON);
    public static final WoodType TYPE2 = new WoodType("locked_gate", TYPE);

    public static final Block OAK_FENCE_WITH_VINES = registerBlock("oak_fence_with_vines", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block SPRUCE_FENCE_WITH_VINES = registerBlock("spruce_fence_with_vines", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block BIRCH_FENCE_WITH_VINES = registerBlock("birch_fence_with_vines", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block JUNGLE_FENCE_WITH_VINES = registerBlock("jungle_fence_with_vines", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block OAK_FENCE_WITH_GRAPES = registerBlock("oak_fence_with_grapes", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block SPRUCE_FENCE_WITH_GRAPES = registerBlock("spruce_fence_with_grapes", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block BIRCH_FENCE_WITH_GRAPES = registerBlock("birch_fence_with_grapes", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block JUNGLE_FENCE_WITH_GRAPES = registerBlock("jungle_fence_with_grapes", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block REINFORCED_OAK_FENCE = registerBlock("reinforced_oak_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block PARQUET_FLOOR = registerBlock("parquet_floor", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WOOD_LADDER = registerBlock("wood_ladder", new LadderBlock(FabricBlockSettings.copyOf(Blocks.LADDER)));

    public static final Block OAK_DOOR = registerBlock("oak_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block LOCKED_OAK_DOOR = registerBlock("locked_oak_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), TYPE));
    public static final Block SPRUCE_DOOR = registerBlock("spruce_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block LOCKED_SPRUCE_DOOR = registerBlock("locked_spruce_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), TYPE));
    public static final Block BIRCH_DOOR = registerBlock("birch_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block LOCKED_BIRCH_DOOR = registerBlock("locked_birch_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), TYPE));
    public static final Block JUNGLE_DOOR = registerBlock("jungle_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block LOCKED_JUNGLE_DOOR = registerBlock("locked_jungle_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), TYPE));
    public static final Block NORTHERN_WOOD_DOOR = registerBlock("northern_wood_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block LOCKED_DARK_NORTHERN_WOOD_DOOR = registerBlock("locked_dark_northern_wood_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), TYPE));
    public static final Block GREY_WOOD_DOOR = registerBlock("grey_wood_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block LOCKED_GREY_WOOD_DOOR = registerBlock("locked_grey_wood_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), TYPE));
    public static final Block WHITE_WOOD_DOOR = registerBlock("white_wood_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block LOCKED_WHITE_WOOD_DOOR = registerBlock("locked_white_wood_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), TYPE));
    public static final Block EYRIE_WEIRWOOD_DOOR = registerBlock("eyrie_weirwood_door", new DoorBlock(FabricBlockSettings.copyOf(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final Block WATTLE_FENCE = registerBlock("wattle_fence", new WcWattleFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block WATTLE_FENCE_SHORT = registerBlock("wattle_fence_short", new WcWattleFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block LIGHT_WATTLE_FENCE = registerBlock("light_wattle_fence", new WcWattleFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block LIGHT_WATTLE_FENCE_SHORT = registerBlock("light_wattle_fence_short", new WcWattleFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block DARK_WATTLE_FENCE = registerBlock("dark_wattle_fence", new WcWattleFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block DARK_WATTLE_FENCE_SHORT = registerBlock("dark_wattle_fence_short", new WcWattleFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block OAK_PLANKS = registerBlock("oak_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_STAIRS = registerBlock("oak_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_SLAB = registerBlock("oak_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_WALL = registerBlock("oak_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_FENCE = registerBlock("oak_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_HOPPER = registerBlock("oak_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_TIP = registerBlock("oak_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_CARPET = registerBlock("oak_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LOCKED_OAK_FENCE_GATE = registerBlock("locked_oak_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), TYPE2));
    public static final Block OAK_COVER = registerBlock("oak_cover", new WcRail(true,FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block OAK_TIMBER_WINDOW_FRAME = registerBlock("oak_timber_window_frame", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_TIMBER_WINDOW_FRAME_MULLION = registerBlock("oak_timber_window_frame_mullion", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block SPRUCE_PLANKS = registerBlock("spruce_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_STAIRS = registerBlock("spruce_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_SLAB = registerBlock("spruce_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_WALL = registerBlock("spruce_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_FENCE = registerBlock("spruce_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_HOPPER = registerBlock("spruce_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_TIP = registerBlock("spruce_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_CARPET = registerBlock("spruce_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LOCKED_SPRUCE_FENCE_GATE = registerBlock("locked_spruce_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), TYPE2));
    public static final Block SPRUCE_COVER = registerBlock("spruce_cover", new WcRail(true, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block SPRUCE_TIMBER_WINDOW_FRAME = registerBlock("spruce_timber_window_frame", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_TIMBER_WINDOW_FRAME_MULLION = registerBlock("spruce_timber_window_frame_mullion", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block BIRCH_PLANKS = registerBlock("birch_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_STAIRS = registerBlock("birch_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_SLAB = registerBlock("birch_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_WALL = registerBlock("birch_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_FENCE = registerBlock("birch_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_HOPPER = registerBlock("birch_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_TIP = registerBlock("birch_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_CARPET = registerBlock("birch_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LOCKED_BIRCH_FENCE_GATE = registerBlock("locked_birch_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), TYPE2));
    public static final Block BIRCH_COVER = registerBlock("birch_cover", new WcRail(true, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block BIRCH_TIMBER_WINDOW_FRAME = registerBlock("birch_timber_window_frame", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_TIMBER_WINDOW_FRAME_MULLION = registerBlock("birch_timber_window_frame_mullion", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block JUNGLE_PLANKS = registerBlock("jungle_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_STAIRS = registerBlock("jungle_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_SLAB = registerBlock("jungle_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_WALL = registerBlock("jungle_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_FENCE = registerBlock("jungle_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_HOPPER = registerBlock("jungle_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_TIP = registerBlock("jungle_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_CARPET = registerBlock("jungle_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LOCKED_JUNGLE_FENCE_GATE = registerBlock("locked_jungle_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), TYPE2));
    public static final Block JUNGLE_COVER = registerBlock("jungle_cover", new WcRail(true, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block JUNGLE_TIMBER_WINDOW_FRAME = registerBlock("jungle_timber_window_frame", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_TIMBER_WINDOW_FRAME_MULLION = registerBlock("jungle_timber_window_frame_mullion", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block DARK_NORTHERN_WOOD = registerBlock("dark_northern_wood", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DARK_NORTHERN_WOOD_STAIRS = registerBlock("dark_northern_wood_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DARK_NORTHERN_WOOD_SLAB = registerBlock("dark_northern_wood_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DARK_NORTHERN_WOOD_WALL = registerBlock("dark_northern_wood_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DARK_NORTHERN_WOOD_FENCE = registerBlock("dark_northern_wood_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block DARK_NORTHERN_WOOD_HOPPER = registerBlock("dark_northern_wood_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DARK_NORTHERN_WOOD_TIP = registerBlock("dark_northern_wood_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DARK_NORTHERN_WOOD_CARPET = registerBlock("dark_northern_wood_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LOCKED_DARK_NORTHERN_WOOD_FENCE_GATE = registerBlock("locked_dark_northern_wood_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), TYPE2));
    public static final Block NORTHERN_WOOD_COVER = registerBlock("northern_wood_cover", new WcRail(true, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block NORTHERN_TIMBER_WINDOW_FRAME = registerBlock("northern_timber_window_frame", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block NORTHERN_TIMBER_WINDOW_FRAME_MULLION = registerBlock("northern_timber_window_frame_mullion", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block BLACK_WOOD = registerBlock("black_wood", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_WOOD_STAIRS = registerBlock("black_wood_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_WOOD_SLAB = registerBlock("black_wood_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_WOOD_WALL = registerBlock("black_wood_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_WOOD_FENCE = registerBlock("black_wood_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_WOOD_HOPPER = registerBlock("black_wood_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_WOOD_TIP = registerBlock("black_wood_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_WOOD_CARPET = registerBlock("black_wood_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LOCKED_BLACK_WOOD_FENCE_GATE = registerBlock("locked_black_wood_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), TYPE2));
    public static final Block BLACK_TIMBER_WINDOW_FRAME = registerBlock("black_timber_window_frame", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_TIMBER_WINDOW_FRAME_MULLION = registerBlock("black_timber_window_frame_mullion", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block GREY_WOOD = registerBlock("grey_wood", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREY_WOOD_STAIRS = registerBlock("grey_wood_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREY_WOOD_SLAB = registerBlock("grey_wood_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREY_WOOD_WALL = registerBlock("grey_wood_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREY_WOOD_FENCE = registerBlock("grey_wood_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREY_WOOD_HOPPER = registerBlock("grey_wood_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREY_WOOD_TIP = registerBlock("grey_wood_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREY_WOOD_CARPET = registerBlock("grey_wood_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LOCKED_GREY_WOOD_FENCE_GATE = registerBlock("locked_grey_wood_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), TYPE2));
    public static final Block GREY_TIMBER_WINDOW_FRAME = registerBlock("grey_timber_window_frame", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREY_TIMBER_WINDOW_FRAME_MULLION = registerBlock("grey_timber_window_frame_mullion", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block WHITE_WOOD = registerBlock("white_wood", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_WOOD_STAIRS = registerBlock("white_wood_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_WOOD_SLAB = registerBlock("white_wood_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_WOOD_WALL = registerBlock("white_wood_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_WOOD_FENCE = registerBlock("white_wood_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_WOOD_HOPPER = registerBlock("white_wood_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_WOOD_TIP = registerBlock("white_wood_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_WOOD_CARPET = registerBlock("white_wood_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LOCKED_WHITE_WOOD_FENCE_GATE = registerBlock("locked_white_wood_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), TYPE2));
    public static final Block WHITE_TIMBER_WINDOW_FRAME = registerBlock("whitewashed_timber_window_frame", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_TIMBER_WINDOW_FRAME_MULLION = registerBlock("whitewashed_timber_window_frame_mullion", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block RED_WOOD = registerBlock("red_wood", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_WOOD_STAIRS = registerBlock("red_wood_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_WOOD_SLAB = registerBlock("red_wood_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_WOOD_WALL = registerBlock("red_wood_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_WOOD_FENCE = registerBlock("red_wood_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_WOOD_HOPPER = registerBlock("red_wood_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_WOOD_TIP = registerBlock("red_wood_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_WOOD_CARPET = registerBlock("red_wood_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LOCKED_RED_WOOD_FENCE_GATE = registerBlock("locked_red_wood_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), TYPE2));
    public static final Block RED_TIMBER_WINDOW_FRAME = registerBlock("red_timber_window_frame", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_TIMBER_WINDOW_FRAME_MULLION = registerBlock("red_timber_window_frame_mullion", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block ORANGE_WOOD = registerBlock("orange_wood", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_WOOD_STAIRS = registerBlock("orange_wood_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_WOOD_SLAB = registerBlock("orange_wood_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_WOOD_WALL = registerBlock("orange_wood_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_WOOD_FENCE = registerBlock("orange_wood_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_WOOD_HOPPER = registerBlock("orange_wood_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_WOOD_TIP = registerBlock("orange_wood_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_WOOD_CARPET = registerBlock("orange_wood_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LOCKED_ORANGE_WOOD_FENCE_GATE = registerBlock("locked_orange_wood_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), TYPE2));
    public static final Block ORANGE_TIMBER_WINDOW_FRAME = registerBlock("orange_timber_window_frame", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_TIMBER_WINDOW_FRAME_MULLION = registerBlock("orange_timber_window_frame_mullion", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block YELLOW_WOOD = registerBlock("yellow_wood", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_WOOD_STAIRS = registerBlock("yellow_wood_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_WOOD_SLAB = registerBlock("yellow_wood_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_WOOD_WALL = registerBlock("yellow_wood_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_WOOD_FENCE = registerBlock("yellow_wood_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_WOOD_HOPPER = registerBlock("yellow_wood_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_WOOD_TIP = registerBlock("yellow_wood_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_WOOD_CARPET = registerBlock("yellow_wood_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LOCKED_YELLOW_WOOD_FENCE_GATE = registerBlock("locked_yellow_wood_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), TYPE2));
    public static final Block YELLOW_TIMBER_WINDOW_FRAME = registerBlock("yellow_timber_window_frame", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_TIMBER_WINDOW_FRAME_MULLION = registerBlock("yellow_timber_window_frame_mullion", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block GREEN_WOOD = registerBlock("green_wood", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_WOOD_STAIRS = registerBlock("green_wood_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_WOOD_SLAB = registerBlock("green_wood_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_WOOD_WALL = registerBlock("green_wood_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_WOOD_FENCE = registerBlock("green_wood_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_WOOD_HOPPER = registerBlock("green_wood_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_WOOD_TIP = registerBlock("green_wood_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_WOOD_CARPET = registerBlock("green_wood_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LOCKED_GREEN_WOOD_FENCE_GATE = registerBlock("locked_green_wood_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), TYPE2));
    public static final Block GREEN_TIMBER_WINDOW_FRAME = registerBlock("green_timber_window_frame", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_TIMBER_WINDOW_FRAME_MULLION = registerBlock("green_timber_window_frame_mullion", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block BLUE_WOOD = registerBlock("blue_wood", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_WOOD_STAIRS = registerBlock("blue_wood_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_WOOD_SLAB = registerBlock("blue_wood_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_WOOD_WALL = registerBlock("blue_wood_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_WOOD_FENCE = registerBlock("blue_wood_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_WOOD_HOPPER = registerBlock("blue_wood_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_WOOD_TIP = registerBlock("blue_wood_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_WOOD_CARPET = registerBlock("blue_wood_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LOCKED_BLUE_WOOD_FENCE_GATE = registerBlock("locked_blue_wood_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), TYPE2));
    public static final Block BLUE_TIMBER_WINDOW_FRAME = registerBlock("blue_timber_window_frame", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_TIMBER_WINDOW_FRAME_MULLION = registerBlock("blue_timber_window_frame_mullion", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block PURPLE_WOOD = registerBlock("purple_wood", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_WOOD_STAIRS = registerBlock("purple_wood_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_WOOD_SLAB = registerBlock("purple_wood_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_WOOD_WALL = registerBlock("purple_wood_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_WOOD_FENCE = registerBlock("purple_wood_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_WOOD_HOPPER = registerBlock("purple_wood_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_WOOD_TIP = registerBlock("purple_wood_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_WOOD_CARPET = registerBlock("purple_wood_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block LOCKED_PURPLE_WOOD_FENCE_GATE = registerBlock("locked_purple_wood_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS), TYPE2));
    public static final Block PURPLE_TIMBER_WINDOW_FRAME = registerBlock("purple_timber_window_frame", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_TIMBER_WINDOW_FRAME_MULLION = registerBlock("purple_timber_window_frame_mullion", new WcArrowSlit(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block OAK_VERTICAL_PLANKS = registerBlock("oak_vertical_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_VERTICAL_PLANKS_STAIRS = registerBlock("oak_vertical_planks_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_VERTICAL_PLANKS_SLAB = registerBlock("oak_vertical_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_VERTICAL_PLANKS_WALL = registerBlock("oak_vertical_planks_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_VERTICAL_PLANKS_FENCE = registerBlock("oak_vertical_planks_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_VERTICAL_PLANKS_HOPPER = registerBlock("oak_vertical_planks_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_VERTICAL_PLANKS_TIP = registerBlock("oak_vertical_planks_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_VERTICAL_PLANKS_CARPET = registerBlock("oak_vertical_planks_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OAK_HALF_DOOR = registerBlock("oak_half_door", new WcHalfDoor(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block SPRUCE_VERTICAL_PLANKS = registerBlock("spruce_vertical_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_VERTICAL_PLANKS_STAIRS = registerBlock("spruce_vertical_planks_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_VERTICAL_PLANKS_SLAB = registerBlock("spruce_vertical_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_VERTICAL_PLANKS_WALL = registerBlock("spruce_vertical_planks_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_VERTICAL_PLANKS_FENCE = registerBlock("spruce_vertical_planks_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_VERTICAL_PLANKS_HOPPER = registerBlock("spruce_vertical_planks_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_VERTICAL_PLANKS_TIP = registerBlock("spruce_vertical_planks_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_VERTICAL_PLANKS_CARPET = registerBlock("spruce_vertical_planks_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SPRUCE_HALF_DOOR = registerBlock("spruce_half_door", new WcHalfDoor(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block BIRCH_VERTICAL_PLANKS = registerBlock("birch_vertical_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_VERTICAL_PLANKS_STAIRS = registerBlock("birch_vertical_planks_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_VERTICAL_PLANKS_SLAB = registerBlock("birch_vertical_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_VERTICAL_PLANKS_WALL = registerBlock("birch_vertical_planks_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_VERTICAL_PLANKS_FENCE = registerBlock("birch_vertical_planks_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_VERTICAL_PLANKS_HOPPER = registerBlock("birch_vertical_planks_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_VERTICAL_PLANKS_TIP = registerBlock("birch_vertical_planks_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_VERTICAL_PLANKS_CARPET = registerBlock("birch_vertical_planks_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BIRCH_HALF_DOOR = registerBlock("birch_half_door", new WcHalfDoor(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block JUNGLE_VERTICAL_PLANKS = registerBlock("jungle_vertical_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_VERTICAL_PLANKS_STAIRS = registerBlock("jungle_vertical_planks_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_VERTICAL_PLANKS_SLAB = registerBlock("jungle_vertical_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_VERTICAL_PLANKS_WALL = registerBlock("jungle_vertical_planks_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_VERTICAL_PLANKS_FENCE = registerBlock("jungle_vertical_planks_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_VERTICAL_PLANKS_HOPPER = registerBlock("jungle_vertical_planks_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_VERTICAL_PLANKS_TIP = registerBlock("jungle_vertical_planks_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_VERTICAL_PLANKS_CARPET = registerBlock("jungle_vertical_planks_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block JUNGLE_HALF_DOOR = registerBlock("jungle_half_door", new WcHalfDoor(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block DARK_NORTHERN_WOOD_VERTICAL_PLANKS = registerBlock("dark_northern_wood_vertical_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DARK_NORTHERN_WOOD_VERTICAL_PLANKS_STAIRS = registerBlock("dark_northern_wood_vertical_planks_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DARK_NORTHERN_WOOD_VERTICAL_PLANKS_SLAB = registerBlock("dark_northern_wood_vertical_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DARK_NORTHERN_WOOD_VERTICAL_PLANKS_WALL = registerBlock("dark_northern_wood_vertical_planks_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DARK_NORTHERN_WOOD_VERTICAL_PLANKS_FENCE = registerBlock("dark_northern_wood_vertical_planks_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DARK_NORTHERN_WOOD_VERTICAL_PLANKS_HOPPER = registerBlock("dark_northern_wood_vertical_planks_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DARK_NORTHERN_WOOD_VERTICAL_PLANKS_TIP = registerBlock("dark_northern_wood_vertical_planks_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DARK_NORTHERN_WOOD_VERTICAL_PLANKS_CARPET = registerBlock("dark_northern_wood_vertical_planks_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DARK_NORTHERN_WOOD_HALF_DOOR = registerBlock("dark_northern_wood_half_door", new WcHalfDoor(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block BLACK_WOOD_VERTICAL_PLANKS = registerBlock("black_wood_vertical_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_WOOD_VERTICAL_PLANKS_STAIRS = registerBlock("black_wood_vertical_planks_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_WOOD_VERTICAL_PLANKS_SLAB = registerBlock("black_wood_vertical_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_WOOD_VERTICAL_PLANKS_WALL = registerBlock("black_wood_vertical_planks_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_WOOD_VERTICAL_PLANKS_FENCE = registerBlock("black_wood_vertical_planks_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_WOOD_VERTICAL_PLANKS_HOPPER = registerBlock("black_wood_vertical_planks_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_WOOD_VERTICAL_PLANKS_TIP = registerBlock("black_wood_vertical_planks_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_WOOD_VERTICAL_PLANKS_CARPET = registerBlock("black_wood_vertical_planks_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLACK_WOOD_HALF_DOOR = registerBlock("black_wood_half_door", new WcHalfDoor(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block GREY_WOOD_VERTICAL_PLANKS = registerBlock("grey_wood_vertical_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREY_WOOD_VERTICAL_PLANKS_STAIRS = registerBlock("grey_wood_vertical_planks_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREY_WOOD_VERTICAL_PLANKS_SLAB = registerBlock("grey_wood_vertical_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREY_WOOD_VERTICAL_PLANKS_WALL = registerBlock("grey_wood_vertical_planks_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREY_WOOD_VERTICAL_PLANKS_FENCE = registerBlock("grey_wood_vertical_planks_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREY_WOOD_VERTICAL_PLANKS_HOPPER = registerBlock("grey_wood_vertical_planks_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREY_WOOD_VERTICAL_PLANKS_TIP = registerBlock("grey_wood_vertical_planks_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREY_WOOD_VERTICAL_PLANKS_CARPET = registerBlock("grey_wood_vertical_planks_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREY_WOOD_HALF_DOOR = registerBlock("grey_wood_half_door", new WcHalfDoor(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block WHITE_WOOD_VERTICAL_PLANKS = registerBlock("white_wood_vertical_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_WOOD_VERTICAL_PLANKS_STAIRS = registerBlock("white_wood_vertical_planks_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_WOOD_VERTICAL_PLANKS_SLAB = registerBlock("white_wood_vertical_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_WOOD_VERTICAL_PLANKS_WALL = registerBlock("white_wood_vertical_planks_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_WOOD_VERTICAL_PLANKS_FENCE = registerBlock("white_wood_vertical_planks_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_WOOD_VERTICAL_PLANKS_HOPPER = registerBlock("white_wood_vertical_planks_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_WOOD_VERTICAL_PLANKS_TIP = registerBlock("white_wood_vertical_planks_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_WOOD_VERTICAL_PLANKS_CARPET = registerBlock("white_wood_vertical_planks_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WHITE_WOOD_HALF_DOOR = registerBlock("white_wood_half_door", new WcHalfDoor(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));


    public static final Block RED_WOOD_VERTICAL_PLANKS = registerBlock("red_wood_vertical_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_WOOD_VERTICAL_PLANKS_STAIRS = registerBlock("red_wood_vertical_planks_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_WOOD_VERTICAL_PLANKS_SLAB = registerBlock("red_wood_vertical_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_WOOD_VERTICAL_PLANKS_WALL = registerBlock("red_wood_vertical_planks_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_WOOD_VERTICAL_PLANKS_FENCE = registerBlock("red_wood_vertical_planks_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_WOOD_VERTICAL_PLANKS_HOPPER = registerBlock("red_wood_vertical_planks_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_WOOD_VERTICAL_PLANKS_TIP = registerBlock("red_wood_vertical_planks_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_WOOD_VERTICAL_PLANKS_CARPET = registerBlock("red_wood_vertical_planks_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RED_WOOD_HALF_DOOR = registerBlock("red_wood_half_door", new WcHalfDoor(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block ORANGE_WOOD_VERTICAL_PLANKS = registerBlock("orange_wood_vertical_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_WOOD_VERTICAL_PLANKS_STAIRS = registerBlock("orange_wood_vertical_planks_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_WOOD_VERTICAL_PLANKS_SLAB = registerBlock("orange_wood_vertical_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_WOOD_VERTICAL_PLANKS_WALL = registerBlock("orange_wood_vertical_planks_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_WOOD_VERTICAL_PLANKS_FENCE = registerBlock("orange_wood_vertical_planks_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_WOOD_VERTICAL_PLANKS_HOPPER = registerBlock("orange_wood_vertical_planks_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_WOOD_VERTICAL_PLANKS_TIP = registerBlock("orange_wood_vertical_planks_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_WOOD_VERTICAL_PLANKS_CARPET = registerBlock("orange_wood_vertical_planks_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ORANGE_WOOD_HALF_DOOR = registerBlock("orange_wood_half_door", new WcHalfDoor(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block YELLOW_WOOD_VERTICAL_PLANKS = registerBlock("yellow_wood_vertical_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_WOOD_VERTICAL_PLANKS_STAIRS = registerBlock("yellow_wood_vertical_planks_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_WOOD_VERTICAL_PLANKS_SLAB = registerBlock("yellow_wood_vertical_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_WOOD_VERTICAL_PLANKS_WALL = registerBlock("yellow_wood_vertical_planks_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_WOOD_VERTICAL_PLANKS_FENCE = registerBlock("yellow_wood_vertical_planks_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_WOOD_VERTICAL_PLANKS_HOPPER = registerBlock("yellow_wood_vertical_planks_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_WOOD_VERTICAL_PLANKS_TIP = registerBlock("yellow_wood_vertical_planks_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_WOOD_VERTICAL_PLANKS_CARPET = registerBlock("yellow_wood_vertical_planks_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block YELLOW_WOOD_HALF_DOOR = registerBlock("yellow_wood_half_door", new WcHalfDoor(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block GREEN_WOOD_VERTICAL_PLANKS = registerBlock("green_wood_vertical_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_WOOD_VERTICAL_PLANKS_STAIRS = registerBlock("green_wood_vertical_planks_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_WOOD_VERTICAL_PLANKS_SLAB = registerBlock("green_wood_vertical_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_WOOD_VERTICAL_PLANKS_WALL = registerBlock("green_wood_vertical_planks_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_WOOD_VERTICAL_PLANKS_FENCE = registerBlock("green_wood_vertical_planks_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_WOOD_VERTICAL_PLANKS_HOPPER = registerBlock("green_wood_vertical_planks_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_WOOD_VERTICAL_PLANKS_TIP = registerBlock("green_wood_vertical_planks_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_WOOD_VERTICAL_PLANKS_CARPET = registerBlock("green_wood_vertical_planks_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GREEN_WOOD_HALF_DOOR = registerBlock("green_wood_half_door", new WcHalfDoor(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));


    public static final Block BLUE_WOOD_VERTICAL_PLANKS = registerBlock("blue_wood_vertical_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_WOOD_VERTICAL_PLANKS_STAIRS = registerBlock("blue_wood_vertical_planks_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_WOOD_VERTICAL_PLANKS_SLAB = registerBlock("blue_wood_vertical_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_WOOD_VERTICAL_PLANKS_WALL = registerBlock("blue_wood_vertical_planks_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_WOOD_VERTICAL_PLANKS_FENCE = registerBlock("blue_wood_vertical_planks_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_WOOD_VERTICAL_PLANKS_HOPPER = registerBlock("blue_wood_vertical_planks_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_WOOD_VERTICAL_PLANKS_TIP = registerBlock("blue_wood_vertical_planks_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_WOOD_VERTICAL_PLANKS_CARPET = registerBlock("blue_wood_vertical_planks_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BLUE_WOOD_HALF_DOOR = registerBlock("blue_wood_half_door", new WcHalfDoor(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block PURPLE_WOOD_VERTICAL_PLANKS = registerBlock("purple_wood_vertical_planks", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_WOOD_VERTICAL_PLANKS_STAIRS = registerBlock("purple_wood_vertical_planks_stairs", new WcStairs(OAK_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_WOOD_VERTICAL_PLANKS_SLAB = registerBlock("purple_wood_vertical_planks_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_WOOD_VERTICAL_PLANKS_WALL = registerBlock("purple_wood_vertical_planks_wall", new WcWall(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_WOOD_VERTICAL_PLANKS_FENCE = registerBlock("purple_wood_vertical_planks_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_WOOD_VERTICAL_PLANKS_HOPPER = registerBlock("purple_wood_vertical_planks_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_WOOD_VERTICAL_PLANKS_TIP = registerBlock("purple_wood_vertical_planks_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_WOOD_VERTICAL_PLANKS_CARPET = registerBlock("purple_wood_vertical_planks_carpet", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_WOOD_HALF_DOOR = registerBlock("purple_wood_half_door", new WcHalfDoor(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));



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
