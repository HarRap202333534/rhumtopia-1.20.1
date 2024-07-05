package com.fal701.block.Decor;

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

public class Decor {
    public static final Block HORIZONTAL_PAPER = registerBlock("horizontal_paper", new WcHorizontalPaper(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).nonOpaque()));
    public static final Block PEWTER_FLAGON = registerBlock("pewter_flagon", new WcFlacon(FabricBlockSettings.copyOf(Blocks.GLASS)));

    public static final Block CLOSED_BARREL = registerBlock("closed_barrel", new WcDirectionalBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FIREWOOD = registerBlock("firewood", new WcDirectionalBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FIREWOOD_SLAB = registerBlock("firewood_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FIREWOOD_DIRECTIONAL_SLAB = registerBlock("firewood_directional_slab", new WcDirectionalSlab(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BROKEN_SWORD = registerBlock("broken_sword", new WcDecor2Facing(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).nonOpaque()));
    public static final Block BONES = registerBlock("bones", new WcBones(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).nonOpaque()));
    public static final Block PEWTER_PLATE = registerBlock("pewter_plate", new WcPlate(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).nonOpaque()));
    public static final Block WOODEN_PLATE = registerBlock("wooden_plate", new WcPlate(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).nonOpaque()));
    public static final Block GLASS_FLAGON = registerBlock("glass_flagon", new WcFlacon(FabricBlockSettings.copyOf(Blocks.GLASS)));
    public static final Block BLOOD = registerBlock("blood", new WcDecorBlock0x1Horizontal(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).nonOpaque()));
    public static final Block HORSE_SHOES = registerBlock("horse_shoes", new WcDecor2Facing(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).nonOpaque()));
    public static final Block COINS = registerBlock("coins", new WcCoins(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).nonOpaque()));
    public static final Block FRYING_PAN = registerBlock("frying_pan", new WcDecor2Facing(FabricBlockSettings.copyOf(Blocks.WHITE_CARPET).nonOpaque()));
    public static final Block CRATE3 = registerBlock("crate3", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block OPEN_CRATE = registerBlock("open_crate", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block IRON_CRATE = registerBlock("iron_crate", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block WATER_BARREL = registerBlock("water_barrel", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block EMPTY_BARREL = registerBlock("empty_barrel", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SILVER_TIN_CRATE = registerBlock("silver_tin_crate", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FISH_TRAP = registerBlock("fish_trap", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block CAGE = registerBlock("cage", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));
    public static final Block COBWEB = registerBlock("cobweb", new WcCobweb(FabricBlockSettings.copyOf(Blocks.COBWEB).nonOpaque()));
    public static final Block CLOSED_BASKET = registerBlock("closed_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block OPEN_BASKET = registerBlock("open_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block CLOSED_BASKET_SLAB = registerBlock("closed_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block OPEN_BASKET_SLAB = registerBlock("open_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block SEPT_CRYSTAL_MEDIUM = registerBlock("sept_crystal_medium", new WcWall(FabricBlockSettings.copyOf(Blocks.COBBLESTONE_WALL)));
    public static final Block SEPT_CRYSTAL_SMALL = registerBlock("sept_crystal_small", new WcFence(FabricBlockSettings.copyOf(Blocks.COBBLESTONE)));
    public static final Block BAELORS_SPHERE_CRONE_YELLOW = registerBlock("baelors_sphere_crone_yellow", new WcSphere(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block BAELORS_SPHERE_FATHER_GREEN = registerBlock("baelors_sphere_father_green", new WcSphere(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block BAELORS_SPHERE_MAIDEN_PINK = registerBlock("baelors_sphere_maiden_pink", new WcSphere(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block BAELORS_SPHERE_MOTHER_BLUE = registerBlock("baelors_sphere_mother_blue", new WcSphere(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block BAELORS_SPHERE_SMITH_ORANGE = registerBlock("baelors_sphere_smith_orange", new WcSphere(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block BAELORS_SPHERE_STRANGER_GREY = registerBlock("baelors_sphere_stranger_grey", new WcSphere(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block BAELORS_SPHERE_WARRIOR_RED = registerBlock("baelors_sphere_warrior_red", new WcSphere(FabricBlockSettings.copyOf(Blocks.GLASS).nonOpaque()));
    public static final Block SEWER_MANHOLE = registerBlock("sewer_manhole", new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR), BlockSetType.OAK));
    public static final Block KINGS_LANDING_SEWER_MANHOLE = registerBlock("kings_landing_sewer_manhole", new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR), BlockSetType.OAK));
    public static final Block WHITE_ARBOR_SEWER_MANHOLE = registerBlock("white_harbor_sewer_manhole", new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR), BlockSetType.OAK));
    public static final Block OLDTOWN_SEWER_MANHOLE = registerBlock("oldtown_sewer_manhole", new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR), BlockSetType.OAK));
    public static final Block LARGE_CLAY_POT_SOLID = registerBlock("large_clay_pot_solid", new Block(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block LARGE_CLAY_POT = registerBlock("large_clay_pot", new WcClayPot(FabricBlockSettings.copyOf(Blocks.TERRACOTTA)));
    public static final Block AXE_BLOCK = registerBlock("axe_block", new WcDecorBlock0x1Vertical(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block CLEAVER_BLOCK = registerBlock("cleaver_block", new WcDecorBlock0x1Vertical(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block DAGGER_BLOCK = registerBlock("dagger_block", new WcDecorBlock0x1Vertical(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block PICKAXE_BLOCK = registerBlock("pickaxe_block", new WcDecorBlock0x1Vertical(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));
    public static final Block SHOVEL_BLOCK = registerBlock("shovel_block", new WcDecorBlock0x1Vertical(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).nonOpaque()));






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
