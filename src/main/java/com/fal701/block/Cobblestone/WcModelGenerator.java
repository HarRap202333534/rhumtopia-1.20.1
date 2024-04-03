package com.fal701.block.Cobblestone;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class WcModelGenerator extends FabricModelProvider {
    public WcModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        //Cobblestone
        blockStateModelGenerator.registerSimpleCubeAll(Cobblestone.FLAGSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(Cobblestone.SANDY_STONE_SLAB);
        BlockStateModelGenerator.BlockTexturePool basaltCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.BASALT_COBBLESTONE);
        basaltCPool.stairs(Cobblestone.BASALT_COBBLESTONE_STAIRS);
        basaltCPool.slab(Cobblestone.BASALT_COBBLESTONE_SLAB);
        basaltCPool.wall(Cobblestone.BASALT_COBBLESTONE_WALL);
        basaltCPool.wall(Cobblestone.BASALT_COBBLESTONE_FENCE);//3
        BlockStateModelGenerator.BlockTexturePool bedrockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.BEDROCK);
        bedrockPool.stairs(Cobblestone.BEDROCK_STAIRS);
        bedrockPool.slab(Cobblestone.BEDROCK_SLAB);
        bedrockPool.wall(Cobblestone.BEDROCK_WALL);
        bedrockPool.wall(Cobblestone.BEDROCK_FENCE);//4
        BlockStateModelGenerator.BlockTexturePool ValSPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.VALYRIAN_STONE);
        ValSPool.stairs(Cobblestone.VALYRIAN_STONE_STAIRS);
        ValSPool.slab(Cobblestone.VALYRIAN_STONE_SLAB);
        ValSPool.wall(Cobblestone.VALYRIAN_STONE_WALL);
        ValSPool.wall(Cobblestone.VALYRIAN_STONE_FENCE);//4
        BlockStateModelGenerator.BlockTexturePool dGreyCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.DARK_GREY_COBBLESTONE);
        dGreyCPool.stairs(Cobblestone.DARK_GREY_COBBLESTONE_STAIRS);
        dGreyCPool.slab(Cobblestone.DARK_GREY_COBBLESTONE_SLAB);
        dGreyCPool.wall(Cobblestone.DARK_GREY_COBBLESTONE_WALL);
        dGreyCPool.wall(Cobblestone.DARK_GREY_COBBLESTONE_FENCE);//5
        BlockStateModelGenerator.BlockTexturePool dGreydCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.DARK_GREY_COBBLESTONE);
        dGreydCPool.stairs(Cobblestone.DARK_GREY_DARK_COBBLESTONE_STAIRS);
        dGreydCPool.slab(Cobblestone.DARK_GREY_DARK_COBBLESTONE_SLAB);
        dGreydCPool.wall(Cobblestone.DARK_GREY_DARK_COBBLESTONE_WALL);
        dGreydCPool.wall(Cobblestone.DARK_GREY_DARK_COBBLESTONE_FENCE);//6
        BlockStateModelGenerator.BlockTexturePool inorthernCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.ICY_NORTHERN_COBBLESTONE);
        inorthernCPool.stairs(Cobblestone.ICY_NORTHERN_COBBLESTONE_STAIRS);
        inorthernCPool.slab(Cobblestone.ICY_NORTHERN_COBBLESTONE_SLAB);
        inorthernCPool.wall(Cobblestone.ICY_NORTHERN_COBBLESTONE_WALL);
        inorthernCPool.wall(Cobblestone.ICY_NORTHERN_COBBLESTONE_FENCE);//7
        BlockStateModelGenerator.BlockTexturePool northernCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.NORTHERN_COBBLESTONE);
        northernCPool.stairs(Cobblestone.NORTHERN_COBBLESTONE_STAIRS);
        northernCPool.slab(Cobblestone.NORTHERN_COBBLESTONE_SLAB);
        northernCPool.wall(Cobblestone.NORTHERN_COBBLESTONE_WALL);
        northernCPool.wall(Cobblestone.NORTHERN_COBBLESTONE_FENCE);//8
        BlockStateModelGenerator.BlockTexturePool bGreyCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.BROWN_GREY_COBBLESTONE);
        bGreyCPool.stairs(Cobblestone.BROWN_GREY_COBBLESTONE_STAIRS);
        bGreyCPool.slab(Cobblestone.BROWN_GREY_COBBLESTONE_SLAB);
        bGreyCPool.wall(Cobblestone.BROWN_GREY_COBBLESTONE_WALL);
        bGreyCPool.wall(Cobblestone.BROWN_GREY_COBBLESTONE_FENCE);//9
        BlockStateModelGenerator.BlockTexturePool bGreydCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.BROWN_GREY_DARK_COBBLESTONE);
        bGreydCPool.stairs(Cobblestone.BROWN_GREY_DARK_COBBLESTONE_STAIRS);
        bGreydCPool.slab(Cobblestone.BROWN_GREY_DARK_COBBLESTONE_SLAB);
        bGreydCPool.wall(Cobblestone.BROWN_GREY_DARK_COBBLESTONE_WALL);
        bGreydCPool.wall(Cobblestone.BROWN_GREY_DARK_COBBLESTONE_FENCE);//10
        BlockStateModelGenerator.BlockTexturePool bGreyCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.BROWN_GREY_COBBLESTONE);
        bGreyCPool.stairs(Cobblestone.BROWN_GREY_COBBLESTONE_STAIRS);
        bGreyCPool.slab(Cobblestone.BROWN_GREY_COBBLESTONE_SLAB);
        bGreyCPool.wall(Cobblestone.BROWN_GREY_COBBLESTONE_WALL);
        bGreyCPool.wall(Cobblestone.BROWN_GREY_COBBLESTONE_FENCE);//11
        BlockStateModelGenerator.BlockTexturePool bGreyCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.BROWN_GREY_COBBLESTONE);
        bGreyCPool.stairs(Cobblestone.BROWN_GREY_COBBLESTONE_STAIRS);
        bGreyCPool.slab(Cobblestone.BROWN_GREY_COBBLESTONE_SLAB);
        bGreyCPool.wall(Cobblestone.BROWN_GREY_COBBLESTONE_WALL);
        bGreyCPool.wall(Cobblestone.BROWN_GREY_COBBLESTONE_FENCE);//12




        //Fieldstone

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
