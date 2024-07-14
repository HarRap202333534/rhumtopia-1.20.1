package com.fal701.block.FoodBlocks;

import com.fal701.Rhumtopia;
import com.fal701.block.Z_custom.WcFood;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CakeBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FoodBlocks {
    public static final Block TURNIP_CRATE = registerBlock("turnip_crate", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block FISH_BARREL = registerBlock("fish_barrel", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block GRAIN_CRATE = registerBlock("grain_crate", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block APPLE_CRATE = registerBlock("apple_crate", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CARROT_CRATE = registerBlock("carrot_crate", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block SALT_CRATE = registerBlock("salt_crate", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BERRY_CRATE = registerBlock("berry_crate", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block PURPLE_GRAPE_CRATE = registerBlock("purple_grape_crate", new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block CHEESE_BLOCK = registerBlock("cheese_block", new WcFood(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block BREAD_BLOCK = registerBlock("bread_block", new WcFood(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block DATES = registerBlock("dates", new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block SPIT_ROAST = registerBlock("spit_roast", new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block SQUASH = registerBlock("squash", new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block GRAIN_FLOUR_SACK = registerBlock("grain_flour_sack", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block CUT_GRAIN_FLOUR_SACK = registerBlock("cut_grain_flour_sack", new SlabBlock(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block SAUSAGES_LEG_OF_HAM = registerBlock("sausages_leg_of_ham", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block DEAD_HARE = registerBlock("dead_hare", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block DEAD_FOWL = registerBlock("dead_fowl", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block DEAD_FISH = registerBlock("dead_fish", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block GARLIC_STRAND = registerBlock("garlic_strand", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block BUSHEL_OF_HERBS = registerBlock("bushel_of_herbs", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block CHILI_RISTRA = registerBlock("chili_ristra", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block DEAD_FROG = registerBlock("dead_frog", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block DEAD_RAT = registerBlock("dead_rat", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).nonOpaque()));
    public static final Block APRICOT_BASKET = registerBlock("apricot_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block DATE_BASKET = registerBlock("date_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LEMON_BASKET = registerBlock("lemon_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIME_BASKET = registerBlock("lime_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block OLIVE_BASKET = registerBlock("olive_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block ORANGE_BASKET = registerBlock("orange_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block POMEGRANATE_BASKET = registerBlock("pomegranate_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block HOP_CRATE = registerBlock("hop_crate", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LAVENDER_CRATE = registerBlock("lavender_crate", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block SOURLEAF_CRATE = registerBlock("sourleaf_crate", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block WHITE_GRAPE_CRATE = registerBlock("white_grape_crate", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block TURNIP_BASKET = registerBlock("turnip_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GRAIN_BASKET = registerBlock("grain_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block APPLE_BASKET = registerBlock("apple_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block APRICOT_BASKET_SLAB = registerBlock("apricot_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block DATE_BASKET_SLAB = registerBlock("date_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LEMON_BASKET_SLAB = registerBlock("lemon_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LIME_BASKET_SLAB = registerBlock("lime_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block OLIVE_BASKET_SLAB = registerBlock("olive_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block ORANGE_BASKET_SLAB = registerBlock("orange_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block POMEGRANATE_BASKET_SLAB = registerBlock("pomegranate_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block TURNIP_BASKET_SLAB = registerBlock("turnip_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block GRAIN_BASKET_SLAB = registerBlock("grain_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block APPLE_BASKET_SLAB = registerBlock("apple_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block CARROT_BASKET_SLAB = registerBlock("carrot_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BERRY_BASKET_SLAB = registerBlock("berry_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block FISH_BASKET_SLAB = registerBlock("fish_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block CARROT_BASKET = registerBlock("carrot_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block BERRY_BASKET = registerBlock("berry_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block FISH_BASKET = registerBlock("fish_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PURPLE_GRAPE_BASKET = registerBlock("purple_grape_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block WHITE_GRAPE_BASKET = registerBlock("white_grape_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block HOP_BASKET = registerBlock("hop_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LAVENDER_BASKET = registerBlock("lavender_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block SOURLEAF_BASKET = registerBlock("sourleaf_basket", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block PURPLE_GRAPE_BASKET_SLAB = registerBlock("purple_grape_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block WHITE_GRAPE_BASKET_SLAB = registerBlock("white_grape_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block HOP_BASKET_SLAB = registerBlock("hop_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block LAVENDER_BASKET_SLAB = registerBlock("lavender_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));
    public static final Block SOURLEAF_BASKET_SLAB = registerBlock("sourleaf_basket_slab", new SlabBlock(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL)));


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
