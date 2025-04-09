package com.fal701.block.GrassDirt;

import com.fal701.Rhumtopia;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class GrassDirt {
    public static final Block BONE_DIRT = registerBlock("bone_dirt", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block THICK_GRASS_BLOCK = registerBlock("thick_grass_block", new GrassBlock(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK)));
    public static final Block CLASSIC_GRASS_BLOCK = registerBlock("classic_grass_block", new GrassBlock(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK)));
    public static final Block DIRT = registerBlock("dirt", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block DIRT_SLAB = registerBlock("dirt_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block PATH_DIRT = registerBlock("path_dirt", new FarmlandBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block GRASSY_DIRT = registerBlock("grassy_dirt", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block GRASSY_DIRT_SLAB = registerBlock("grassy_dirt_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block GRASSY_DIRT_PATH = registerBlock("grassy_dirt_path", new FarmlandBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block GRAVEL = registerBlock("gravel", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block GRAVEL_SLAB = registerBlock("gravel_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block PATH_GRAVEL = registerBlock("path_gravel", new FarmlandBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block REACH_GRAVEL = registerBlock("reach_gravel", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block REACH_GRAVEL_SLAB = registerBlock("reach_gravel_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block PATH_REACH_GRAVEL = registerBlock("path_reach_gravel", new FarmlandBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block DORNE_DUSTY_DIRT = registerBlock("dorne_dusty_dirt", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block DORNE_DUSTY_DIRT_SLAB = registerBlock("dorne_dusty_dirt_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block PATH_DORNE_DUSTY_DIRT = registerBlock("path_dorne_dusty_dirt", new FarmlandBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block DORNE_DRY_SOIL = registerBlock("dorne_dry_soil", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block DORNE_DRY_SOIL_SLAB = registerBlock("dorne_dry_soil_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block PATH_DORNE_DRY_SOIL = registerBlock("path_dorne_dry_soil", new FarmlandBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block MUD = registerBlock("mud", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block MUD_SLAB = registerBlock("mud_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block MUDDY_SNOW = registerBlock("muddy_snow", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block MUDDY_SNOW_SLAB = registerBlock("muddy_snow_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block PEAT = registerBlock("peat", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block PEAT_SLAB = registerBlock("peat_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block BOG = registerBlock("bog", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block BOG_SLAB = registerBlock("bog_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block SCORCHED_EARTH = registerBlock("scorched_earth", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block SCORCHED_EARTH_SLAB = registerBlock("scorched_earth_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block PLOWED_SOIL = registerBlock("plowed_soil", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block PLOWED_SOIL_SLAB = registerBlock("plowed_soil_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block FALLEN_LEAVES = registerBlock("fallen_leaves", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block FALLEN_LEAVES_SLAB = registerBlock("fallen_leaves_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block PINE_NEEDLES = registerBlock("pine_needles", new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block PINE_NEEDLES_SLAB = registerBlock("pine_needles_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));


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
