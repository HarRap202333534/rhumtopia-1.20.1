package com.fal701.block.Cobblestone;

import com.fal701.Rhumtopia;
import com.fal701.block.Z_custom.WcFence;
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

public class Cobblestone {

    public static final Block FLAGSTONE = registerBlock("flagstone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_STONE_SLABS = registerBlock("sandy_stone_slabs", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block COBBLESTONE = registerBlock("cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLESTONE_STAIRS = registerBlock("cobblestone_stairs", new WcStairs(Cobblestone.COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLESTONE_SLAB = registerBlock("cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLESTONE_WALL = registerBlock("cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block COBBLESTONE_FENCE = registerBlock("cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLESTONE_HOPPER = registerBlock("cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COBBLESTONE_TIP = registerBlock("cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MOSSY_COBBLESTONE = registerBlock("mossy_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MOSSY_COBBLESTONE_STAIRS = registerBlock("mossy_cobblestone_stairs", new WcStairs(Cobblestone.COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MOSSY_COBBLESTONE_SLAB = registerBlock("mossy_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MOSSY_COBBLESTONE_WALL = registerBlock("mossy_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block MOSSY_COBBLESTONE_FENCE = registerBlock("mossy_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MOSSY_COBBLESTONE_HOPPER = registerBlock("mossy_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block MOSSY_COBBLESTONE_TIP = registerBlock("mossy_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block BASALT_COBBLESTONE = registerBlock("basalt_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BASALT_COBBLESTONE_STAIRS = registerBlock("basalt_cobblestone_stairs", new WcStairs(Cobblestone.BASALT_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BASALT_COBBLESTONE_SLAB = registerBlock("basalt_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BASALT_COBBLESTONE_WALL = registerBlock("basalt_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BASALT_COBBLESTONE_FENCE = registerBlock("basalt_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BASALT_COBBLESTONE_HOPPER = registerBlock("basalt_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BASALT_COBBLESTONE_TIP = registerBlock("basalt_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block BEDROCK = registerBlock("bedrock", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BEDROCK_STAIRS = registerBlock("bedrock_stairs", new WcStairs(Cobblestone.BEDROCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BEDROCK_SLAB = registerBlock("bedrock_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BEDROCK_WALL = registerBlock("bedrock_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BEDROCK_FENCE = registerBlock("bedrock_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BEDROCK_HOPPER = registerBlock("bedrock_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BEDROCK_TIP = registerBlock("bedrock_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block VALYRIAN_STONE = registerBlock("valyrian_stone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block VALYRIAN_STONE_STAIRS = registerBlock("valyrian_stone_stairs", new WcStairs(Cobblestone.VALYRIAN_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block VALYRIAN_STONE_SLAB = registerBlock("valyrian_stone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block VALYRIAN_STONE_WALL = registerBlock("valyrian_stone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block VALYRIAN_STONE_FENCE = registerBlock("valyrian_stone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block VALYRIAN_STONE_HOPPER = registerBlock("valyrian_stone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block VALYRIAN_STONE_TIP = registerBlock("valyrian_stone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block DARK_GREY_COBBLESTONE = registerBlock("dark_grey_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_GREY_COBBLESTONE_STAIRS = registerBlock("dark_grey_cobblestone_stairs", new WcStairs(Cobblestone.DARK_GREY_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_GREY_COBBLESTONE_SLAB = registerBlock("dark_grey_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_GREY_COBBLESTONE_WALL = registerBlock("dark_grey_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_GREY_COBBLESTONE_FENCE = registerBlock("dark_grey_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_GREY_COBBLESTONE_HOPPER = registerBlock("dark_grey_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_GREY_COBBLESTONE_TIP = registerBlock("dark_grey_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block DARK_GREY_DARK_COBBLESTONE = registerBlock("dark_grey_dark_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_GREY_DARK_COBBLESTONE_STAIRS = registerBlock("dark_grey_dark_cobblestone_stairs", new WcStairs(Cobblestone.DARK_GREY_DARK_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_GREY_DARK_COBBLESTONE_SLAB = registerBlock("dark_grey_dark_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_GREY_DARK_COBBLESTONE_WALL = registerBlock("dark_grey_dark_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_GREY_DARK_COBBLESTONE_FENCE = registerBlock("dark_grey_dark_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_GREY_DARK_COBBLESTONE_HOPPER = registerBlock("dark_grey_dark_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_GREY_DARK_COBBLESTONE_TIP = registerBlock("dark_grey_dark_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block ICY_NORTHERN_COBBLE = registerBlock("icy_northern_cobble", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ICY_NORTHERN_COBBLE_STAIRS = registerBlock("icy_northern_cobble_stairs", new WcStairs(Cobblestone.ICY_NORTHERN_COBBLE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ICY_NORTHERN_COBBLE_SLAB = registerBlock("icy_northern_cobble_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ICY_NORTHERN_COBBLE_WALL = registerBlock("icy_northern_cobble_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ICY_NORTHERN_COBBLE_FENCE = registerBlock("icy_northern_cobble_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ICY_NORTHERN_COBBLE_HOPPER = registerBlock("icy_northern_cobble_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ICY_NORTHERN_COBBLE_TIP = registerBlock("icy_northern_cobble_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block NORTHERN_COBBLE = registerBlock("northern_cobble", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block NORTHERN_COBBLE_STAIRS = registerBlock("northern_cobble_stairs", new WcStairs(Cobblestone.NORTHERN_COBBLE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block NORTHERN_COBBLE_SLAB = registerBlock("northern_cobble_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block NORTHERN_COBBLE_WALL = registerBlock("northern_cobble_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block NORTHERN_COBBLE_FENCE = registerBlock("northern_cobble_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block NORTHERN_COBBLE_HOPPER = registerBlock("northern_cobble_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block NORTHERN_COBBLE_TIP = registerBlock("northern_cobble_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block BROWN_GREY_COBBLESTONE = registerBlock("brown_grey_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_COBBLESTONE_STAIRS = registerBlock("brown_grey_cobblestone_stairs", new WcStairs(Cobblestone.BROWN_GREY_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_COBBLESTONE_SLAB = registerBlock("brown_grey_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_COBBLESTONE_WALL = registerBlock("brown_grey_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_COBBLESTONE_FENCE = registerBlock("brown_grey_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_COBBLESTONE_HOPPER = registerBlock("brown_grey_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_COBBLESTONE_TIP = registerBlock("brown_grey_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block BROWN_GREY_DARK_COBBLESTONE = registerBlock("brown_grey_dark_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_DARK_COBBLESTONE_STAIRS = registerBlock("brown_grey_dark_cobblestone_stairs", new WcStairs(Cobblestone.BROWN_GREY_DARK_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_DARK_COBBLESTONE_SLAB = registerBlock("brown_grey_dark_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_DARK_COBBLESTONE_WALL = registerBlock("brown_grey_dark_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_DARK_COBBLESTONE_FENCE = registerBlock("brown_grey_dark_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_DARK_COBBLESTONE_HOPPER = registerBlock("brown_grey_dark_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_DARK_COBBLESTONE_TIP = registerBlock("brown_grey_dark_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block BROWN_GREY_COBBLE = registerBlock("brown_grey_cobble", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_COBBLE_STAIRS = registerBlock("brown_grey_cobble_stairs", new WcStairs(Cobblestone.BROWN_GREY_COBBLE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_COBBLE_SLAB = registerBlock("brown_grey_cobble_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_COBBLE_WALL = registerBlock("brown_grey_cobble_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_COBBLE_FENCE = registerBlock("brown_grey_cobble_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_COBBLE_HOPPER = registerBlock("brown_grey_cobble_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_COBBLE_TIP = registerBlock("brown_grey_cobble_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block BROWN_GREY_RIVER_COBBLE = registerBlock("brown_grey_river_cobble", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_RIVER_COBBLE_STAIRS = registerBlock("brown_grey_river_cobble_stairs", new WcStairs(Cobblestone.BROWN_GREY_RIVER_COBBLE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_RIVER_COBBLE_SLAB = registerBlock("brown_grey_river_cobble_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_RIVER_COBBLE_WALL = registerBlock("brown_grey_river_cobble_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_RIVER_COBBLE_FENCE = registerBlock("brown_grey_river_cobble_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_RIVER_COBBLE_HOPPER = registerBlock("brown_grey_river_cobble_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block BROWN_GREY_RIVER_COBBLE_TIP = registerBlock("brown_grey_river_cobble_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block GREEN_GREY_COBBLESTONE = registerBlock("green_grey_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREEN_GREY_COBBLESTONE_STAIRS = registerBlock("green_grey_cobblestone_stairs", new WcStairs(Cobblestone.GREEN_GREY_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREEN_GREY_COBBLESTONE_SLAB = registerBlock("green_grey_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREEN_GREY_COBBLESTONE_WALL = registerBlock("green_grey_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREEN_GREY_COBBLESTONE_FENCE = registerBlock("green_grey_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREEN_GREY_COBBLESTONE_HOPPER = registerBlock("green_grey_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREEN_GREY_COBBLESTONE_TIP = registerBlock("green_grey_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block DARK_COBBLESTONE = registerBlock("dark_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_COBBLESTONE_STAIRS = registerBlock("dark_cobblestone_stairs", new WcStairs(Cobblestone.DARK_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_COBBLESTONE_SLAB = registerBlock("dark_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_COBBLESTONE_WALL = registerBlock("dark_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_COBBLESTONE_FENCE = registerBlock("dark_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_COBBLESTONE_HOPPER = registerBlock("dark_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block DARK_COBBLESTONE_TIP = registerBlock("dark_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block GREY_DARK_COBBLESTONE = registerBlock("grey_dark_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREY_DARK_COBBLESTONE_STAIRS = registerBlock("grey_dark_cobblestone_stairs", new WcStairs(Cobblestone.GREY_DARK_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREY_DARK_COBBLESTONE_SLAB = registerBlock("grey_dark_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREY_DARK_COBBLESTONE_WALL = registerBlock("grey_dark_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREY_DARK_COBBLESTONE_FENCE = registerBlock("grey_dark_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREY_DARK_COBBLESTONE_HOPPER = registerBlock("grey_dark_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block GREY_DARK_COBBLESTONE_TIP = registerBlock("grey_dark_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block RIVER_COBBLE = registerBlock("river_cobble", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RIVER_COBBLE_STAIRS = registerBlock("river_cobble_stairs", new WcStairs(Cobblestone.RIVER_COBBLE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RIVER_COBBLE_SLAB = registerBlock("river_cobble_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RIVER_COBBLE_WALL = registerBlock("river_cobble_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RIVER_COBBLE_FENCE = registerBlock("river_cobble_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RIVER_COBBLE_HOPPER = registerBlock("river_cobble_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RIVER_COBBLE_TIP = registerBlock("river_cobble_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block FAINT_LIGHT_GREY_COBBLESTONE = registerBlock("faint_light_grey_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_COBBLESTONE_STAIRS = registerBlock("faint_light_grey_cobblestone_stairs", new WcStairs(Cobblestone.FAINT_LIGHT_GREY_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_COBBLESTONE_SLAB = registerBlock("faint_light_grey_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_COBBLESTONE_WALL = registerBlock("faint_light_grey_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_COBBLESTONE_FENCE = registerBlock("faint_light_grey_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_COBBLESTONE_HOPPER = registerBlock("faint_light_grey_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_COBBLESTONE_TIP = registerBlock("faint_light_grey_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block FAINT_LIGHT_GREY_DARK_COBBLESTONE = registerBlock("faint_light_grey_dark_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_DARK_COBBLESTONE_STAIRS = registerBlock("faint_light_grey_dark_cobblestone_stairs", new WcStairs(Cobblestone.FAINT_LIGHT_GREY_DARK_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_DARK_COBBLESTONE_SLAB = registerBlock("faint_light_grey_dark_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_DARK_COBBLESTONE_WALL = registerBlock("faint_light_grey_dark_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_DARK_COBBLESTONE_FENCE = registerBlock("faint_light_grey_dark_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_DARK_COBBLESTONE_HOPPER = registerBlock("faint_light_grey_dark_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block FAINT_LIGHT_GREY_DARK_COBBLESTONE_TIP = registerBlock("faint_light_grey_dark_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block WHITE_COBBLESTONE = registerBlock("white_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_COBBLESTONE_STAIRS = registerBlock("white_cobblestone_stairs", new WcStairs(Cobblestone.WHITE_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_COBBLESTONE_SLAB = registerBlock("white_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_COBBLESTONE_WALL = registerBlock("white_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_COBBLESTONE_FENCE = registerBlock("white_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_COBBLESTONE_HOPPER = registerBlock("white_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_COBBLESTONE_TIP = registerBlock("white_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block WHITE_DARK_COBBLESTONE = registerBlock("white_dark_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_DARK_COBBLESTONE_STAIRS = registerBlock("white_dark_cobblestone_stairs", new WcStairs(Cobblestone.WHITE_DARK_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_DARK_COBBLESTONE_SLAB = registerBlock("white_dark_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_DARK_COBBLESTONE_WALL = registerBlock("white_dark_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_DARK_COBBLESTONE_FENCE = registerBlock("white_dark_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_DARK_COBBLESTONE_HOPPER = registerBlock("white_dark_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block WHITE_DARK_COBBLESTONE_TIP = registerBlock("white_dark_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block REACH_COBBLESTONE = registerBlock("reach_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_COBBLESTONE_STAIRS = registerBlock("reach_cobblestone_stairs", new WcStairs(Cobblestone.REACH_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_COBBLESTONE_SLAB = registerBlock("reach_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_COBBLESTONE_WALL = registerBlock("reach_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_COBBLESTONE_FENCE = registerBlock("reach_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_COBBLESTONE_HOPPER = registerBlock("reach_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_COBBLESTONE_TIP = registerBlock("reach_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block REACH_DARK_COBBLESTONE = registerBlock("reach_dark_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_DARK_COBBLESTONE_STAIRS = registerBlock("reach_dark_cobblestone_stairs", new WcStairs(Cobblestone.REACH_DARK_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_DARK_COBBLESTONE_SLAB = registerBlock("reach_dark_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_DARK_COBBLESTONE_WALL = registerBlock("reach_dark_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_DARK_COBBLESTONE_FENCE = registerBlock("reach_dark_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_DARK_COBBLESTONE_HOPPER = registerBlock("reach_dark_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block REACH_DARK_COBBLESTONE_TIP = registerBlock("reach_dark_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SANDY_PINK_COBBLESTONE = registerBlock("sandy_pink_light_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_COBBLESTONE_STAIRS = registerBlock("sandy_pink_light_cobblestone_stairs", new WcStairs(Cobblestone.SANDY_PINK_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_COBBLESTONE_SLAB = registerBlock("sandy_pink_light_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_COBBLESTONE_WALL = registerBlock("sandy_pink_light_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_COBBLESTONE_FENCE = registerBlock("sandy_pink_light_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_COBBLESTONE_HOPPER = registerBlock("sandy_pink_light_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_COBBLESTONE_TIP = registerBlock("sandy_pink_light_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block SANDY_PINK_DARK_COBBLESTONE = registerBlock("sandy_pink_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_DARK_COBBLESTONE_STAIRS = registerBlock("sandy_pink_cobble_stairs", new WcStairs(Cobblestone.SANDY_PINK_DARK_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_DARK_COBBLESTONE_SLAB = registerBlock("sandy_pink_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_DARK_COBBLESTONE_WALL = registerBlock("sandy_pink_cobble_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_DARK_COBBLESTONE_FENCE = registerBlock("sandy_pink_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_DARK_COBBLESTONE_HOPPER = registerBlock("sandy_pink_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block SANDY_PINK_DARK_COBBLESTONE_TIP = registerBlock("sandy_pink_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block KL_DUN_COBBLE = registerBlock("kl_dun_cobble", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block KL_DUN_COBBLE_STAIRS = registerBlock("kl_dun_cobble_stairs", new WcStairs(Cobblestone.KL_DUN_COBBLE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block KL_DUN_COBBLE_SLAB = registerBlock("kl_dun_cobble_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block KL_DUN_COBBLE_WALL = registerBlock("kl_dun_cobble_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block KL_DUN_COBBLE_FENCE = registerBlock("kl_dun_cobble_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block KL_DUN_COBBLE_HOPPER = registerBlock("kl_dun_cobble_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block KL_DUN_COBBLE_TIP = registerBlock("kl_dun_cobble_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block RED_COBBLESTONE = registerBlock("red_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RED_COBBLESTONE_STAIRS = registerBlock("red_cobblestone_stairs", new WcStairs(Cobblestone.RED_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RED_COBBLESTONE_SLAB = registerBlock("red_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RED_COBBLESTONE_WALL = registerBlock("red_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RED_COBBLESTONE_FENCE = registerBlock("red_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RED_COBBLESTONE_HOPPER = registerBlock("red_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block RED_COBBLESTONE_TIP = registerBlock("red_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block COARSE_RED_DARK_COBBLESTONE = registerBlock("coarse_red_dark_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COARSE_RED_DARK_COBBLESTONE_STAIRS = registerBlock("coarse_red_dark_cobblestone_stairs", new WcStairs(Cobblestone.COARSE_RED_DARK_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COARSE_RED_DARK_COBBLESTONE_SLAB = registerBlock("coarse_red_dark_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COARSE_RED_DARK_COBBLESTONE_WALL = registerBlock("coarse_red_dark_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COARSE_RED_DARK_COBBLESTONE_FENCE = registerBlock("coarse_red_dark_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COARSE_RED_DARK_COBBLESTONE_HOPPER = registerBlock("coarse_red_dark_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block COARSE_RED_DARK_COBBLESTONE_TIP = registerBlock("coarse_red_dark_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block OLDTOWN_COBBLESTONE = registerBlock("oldtown_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_COBBLESTONE_STAIRS = registerBlock("oldtown_cobblestone_stairs", new WcStairs(Cobblestone.OLDTOWN_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_COBBLESTONE_SLAB = registerBlock("oldtown_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_COBBLESTONE_WALL = registerBlock("oldtown_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_COBBLESTONE_FENCE = registerBlock("oldtown_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_COBBLESTONE_HOPPER = registerBlock("oldtown_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_COBBLESTONE_TIP = registerBlock("oldtown_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block OLDTOWN_DARK_COBBLESTONE = registerBlock("oldtown_dark_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_DARK_COBBLESTONE_STAIRS = registerBlock("oldtown_dark_cobblestone_stairs", new WcStairs(Cobblestone.OLDTOWN_DARK_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_DARK_COBBLESTONE_SLAB = registerBlock("oldtown_dark_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_DARK_COBBLESTONE_WALL = registerBlock("oldtown_dark_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_DARK_COBBLESTONE_FENCE = registerBlock("oldtown_dark_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_DARK_COBBLESTONE_HOPPER = registerBlock("oldtown_dark_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block OLDTOWN_DARK_COBBLESTONE_TIP = registerBlock("oldtown_dark_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block ARBOR_COBBLESTONE = registerBlock("arbor_light_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_COBBLESTONE_STAIRS = registerBlock("arbor_light_cobblestone_stairs", new WcStairs(Cobblestone.ARBOR_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_COBBLESTONE_SLAB = registerBlock("arbor_light_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_COBBLESTONE_WALL = registerBlock("arbor_light_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_COBBLESTONE_FENCE = registerBlock("arbor_light_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_COBBLESTONE_HOPPER = registerBlock("arbor_light_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_COBBLESTONE_TIP = registerBlock("arbor_light_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block ARBOR_DARK_COBBLESTONE = registerBlock("arbor_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_DARK_COBBLESTONE_STAIRS = registerBlock("arbor_cobblestone_stairs", new WcStairs(Cobblestone.ARBOR_DARK_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_DARK_COBBLESTONE_SLAB = registerBlock("arbor_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_DARK_COBBLESTONE_WALL = registerBlock("arbor_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_DARK_COBBLESTONE_FENCE = registerBlock("arbor_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_DARK_COBBLESTONE_HOPPER = registerBlock("arbor_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block ARBOR_DARK_COBBLESTONE_TIP = registerBlock("arbor_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block LANNISPORT_COBBLESTONE = registerBlock("lannisport_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_COBBLESTONE_STAIRS = registerBlock("lannisport_cobblestone_stairs", new WcStairs(Cobblestone.LANNISPORT_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_COBBLESTONE_SLAB = registerBlock("lannisport_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_COBBLESTONE_WALL = registerBlock("lannisport_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_COBBLESTONE_FENCE = registerBlock("lannisport_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_COBBLESTONE_HOPPER = registerBlock("lannisport_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_COBBLESTONE_TIP = registerBlock("lannisport_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block LANNISPORT_DARK_COBBLESTONE = registerBlock("lannisport_dark_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_DARK_COBBLESTONE_STAIRS = registerBlock("lannisport_dark_cobblestone_stairs", new WcStairs(Cobblestone.LANNISPORT_DARK_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_DARK_COBBLESTONE_SLAB = registerBlock("lannisport_dark_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_DARK_COBBLESTONE_WALL = registerBlock("lannisport_dark_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_DARK_COBBLESTONE_FENCE = registerBlock("lannisport_dark_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_DARK_COBBLESTONE_HOPPER = registerBlock("lannisport_dark_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block LANNISPORT_DARK_COBBLESTONE_TIP = registerBlock("lannisport_dark_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block STORMLANDS_COBBLESTONE = registerBlock("stormlands_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_COBBLESTONE_STAIRS = registerBlock("stormlands_cobblestone_stairs", new WcStairs(Cobblestone.STORMLANDS_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_COBBLESTONE_SLAB = registerBlock("stormlands_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_COBBLESTONE_WALL = registerBlock("stormlands_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_COBBLESTONE_FENCE = registerBlock("stormlands_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_COBBLESTONE_HOPPER = registerBlock("stormlands_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_COBBLESTONE_TIP = registerBlock("stormlands_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block STORMLANDS_DARK_COBBLESTONE = registerBlock("stormlands_dark_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_DARK_COBBLESTONE_STAIRS = registerBlock("stormlands_dark_cobblestone_stairs", new WcStairs(Cobblestone.STORMLANDS_DARK_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_DARK_COBBLESTONE_SLAB = registerBlock("stormlands_dark_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_DARK_COBBLESTONE_WALL = registerBlock("stormlands_dark_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_DARK_COBBLESTONE_FENCE = registerBlock("stormlands_dark_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_DARK_COBBLESTONE_HOPPER = registerBlock("stormlands_dark_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_DARK_COBBLESTONE_TIP = registerBlock("stormlands_dark_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block STORMLANDS_MOSSY_COBBLESTONE = registerBlock("stormlands_mossy_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_MOSSY_COBBLESTONE_STAIRS = registerBlock("stormlands_mossy_cobblestone_stairs", new WcStairs(Cobblestone.STORMLANDS_MOSSY_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_MOSSY_COBBLESTONE_SLAB = registerBlock("stormlands_mossy_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_MOSSY_COBBLESTONE_WALL = registerBlock("stormlands_mossy_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_MOSSY_COBBLESTONE_FENCE = registerBlock("stormlands_mossy_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_MOSSY_COBBLESTONE_HOPPER = registerBlock("stormlands_mossy_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block STORMLANDS_MOSSY_COBBLESTONE_TIP = registerBlock("stormlands_mossy_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));

    public static final Block TERRACOTTA_COBBLESTONE = registerBlock("terracotta_cobblestone", new Block(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block TERRACOTTA_COBBLESTONE_STAIRS = registerBlock("terracotta_cobblestone_stairs", new WcStairs(Cobblestone.TERRACOTTA_COBBLESTONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block TERRACOTTA_COBBLESTONE_SLAB = registerBlock("terracotta_cobblestone_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block TERRACOTTA_COBBLESTONE_WALL = registerBlock("terracotta_cobblestone_wall", new WallBlock(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block TERRACOTTA_COBBLESTONE_FENCE = registerBlock("terracotta_cobblestone_fence", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block TERRACOTTA_COBBLESTONE_HOPPER = registerBlock("terracotta_cobblestone_hopper", new WcHopper(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));
    public static final Block TERRACOTTA_COBBLESTONE_TIP = registerBlock("terracotta_cobblestone_tip", new WcHopperU(FabricBlockSettings.copyOf(Blocks.COBBLESTONE).requiresTool()));



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
