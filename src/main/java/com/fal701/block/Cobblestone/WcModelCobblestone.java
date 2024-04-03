package com.fal701.block.Cobblestone;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class WcModelCobblestone extends FabricModelProvider {
    public WcModelCobblestone(FabricDataOutput output) {
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
        basaltCPool.fence(Cobblestone.BASALT_COBBLESTONE_FENCE);//3
        BlockStateModelGenerator.BlockTexturePool bedrockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.BEDROCK);
        bedrockPool.stairs(Cobblestone.BEDROCK_STAIRS);
        bedrockPool.slab(Cobblestone.BEDROCK_SLAB);
        bedrockPool.wall(Cobblestone.BEDROCK_WALL);
        bedrockPool.fence(Cobblestone.BEDROCK_FENCE);//4
        BlockStateModelGenerator.BlockTexturePool ValSPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.VALYRIAN_STONE);
        ValSPool.stairs(Cobblestone.VALYRIAN_STONE_STAIRS);
        ValSPool.slab(Cobblestone.VALYRIAN_STONE_SLAB);
        ValSPool.wall(Cobblestone.VALYRIAN_STONE_WALL);
        ValSPool.fence(Cobblestone.VALYRIAN_STONE_FENCE);//4
        BlockStateModelGenerator.BlockTexturePool dGreyCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.DARK_GREY_COBBLESTONE);
        dGreyCPool.stairs(Cobblestone.DARK_GREY_COBBLESTONE_STAIRS);
        dGreyCPool.slab(Cobblestone.DARK_GREY_COBBLESTONE_SLAB);
        dGreyCPool.wall(Cobblestone.DARK_GREY_COBBLESTONE_WALL);
        dGreyCPool.fence(Cobblestone.DARK_GREY_COBBLESTONE_FENCE);//5
        BlockStateModelGenerator.BlockTexturePool dGreydCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.DARK_GREY_COBBLESTONE);
        dGreydCPool.stairs(Cobblestone.DARK_GREY_DARK_COBBLESTONE_STAIRS);
        dGreydCPool.slab(Cobblestone.DARK_GREY_DARK_COBBLESTONE_SLAB);
        dGreydCPool.wall(Cobblestone.DARK_GREY_DARK_COBBLESTONE_WALL);
        dGreydCPool.fence(Cobblestone.DARK_GREY_DARK_COBBLESTONE_FENCE);//6
        BlockStateModelGenerator.BlockTexturePool inorthernCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.ICY_NORTHERN_COBBLESTONE);
        inorthernCPool.stairs(Cobblestone.ICY_NORTHERN_COBBLESTONE_STAIRS);
        inorthernCPool.slab(Cobblestone.ICY_NORTHERN_COBBLESTONE_SLAB);
        inorthernCPool.wall(Cobblestone.ICY_NORTHERN_COBBLESTONE_WALL);
        inorthernCPool.fence(Cobblestone.ICY_NORTHERN_COBBLESTONE_FENCE);//7
        BlockStateModelGenerator.BlockTexturePool northernCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.NORTHERN_COBBLESTONE);
        northernCPool.stairs(Cobblestone.NORTHERN_COBBLESTONE_STAIRS);
        northernCPool.slab(Cobblestone.NORTHERN_COBBLESTONE_SLAB);
        northernCPool.wall(Cobblestone.NORTHERN_COBBLESTONE_WALL);
        northernCPool.fence(Cobblestone.NORTHERN_COBBLESTONE_FENCE);//8
        BlockStateModelGenerator.BlockTexturePool northernRPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.NORTHERN_COBBLESTONE);
        northernRPool.stairs(Cobblestone.NORTHERN_COBBLE_STAIRS);
        northernRPool.slab(Cobblestone.NORTHERN_COBBLE_SLAB);
        northernRPool.wall(Cobblestone.NORTHERN_COBBLE_WALL);
        northernRPool.fence(Cobblestone.NORTHERN_COBBLE_FENCE);//8.1
        BlockStateModelGenerator.BlockTexturePool bGreyCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.BROWN_GREY_COBBLESTONE);
        bGreyCPool.stairs(Cobblestone.BROWN_GREY_COBBLESTONE_STAIRS);
        bGreyCPool.slab(Cobblestone.BROWN_GREY_COBBLESTONE_SLAB);
        bGreyCPool.wall(Cobblestone.BROWN_GREY_COBBLESTONE_WALL);
        bGreyCPool.fence(Cobblestone.BROWN_GREY_COBBLESTONE_FENCE);//9
        BlockStateModelGenerator.BlockTexturePool bGreydCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.BROWN_GREY_DARK_COBBLESTONE);
        bGreydCPool.stairs(Cobblestone.BROWN_GREY_DARK_COBBLESTONE_STAIRS);
        bGreydCPool.slab(Cobblestone.BROWN_GREY_DARK_COBBLESTONE_SLAB);
        bGreydCPool.wall(Cobblestone.BROWN_GREY_DARK_COBBLESTONE_WALL);
        bGreydCPool.fence(Cobblestone.BROWN_GREY_DARK_COBBLESTONE_FENCE);//10
        BlockStateModelGenerator.BlockTexturePool bGreyRPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.BROWN_GREY_COBBLE);
        bGreyRPool.stairs(Cobblestone.BROWN_GREY_COBBLE_STAIRS);
        bGreyRPool.slab(Cobblestone.BROWN_GREY_COBBLE_SLAB);
        bGreyRPool.wall(Cobblestone.BROWN_GREY_COBBLE_WALL);
        bGreyRPool.fence(Cobblestone.BROWN_GREY_COBBLE_FENCE);//11
        BlockStateModelGenerator.BlockTexturePool bGreyRRPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.BROWN_GREY_RIVER_COBBLE);
        bGreyRRPool.stairs(Cobblestone.BROWN_GREY_RIVER_COBBLE_STAIRS);
        bGreyRRPool.slab(Cobblestone.BROWN_GREY_RIVER_COBBLE_SLAB);
        bGreyRRPool.wall(Cobblestone.BROWN_GREY_RIVER_COBBLE_WALL);
        bGreyRRPool.fence(Cobblestone.BROWN_GREY_RIVER_COBBLE_FENCE);//12
        BlockStateModelGenerator.BlockTexturePool darkCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.DARK_COBBLESTONE);
        darkCPool.stairs(Cobblestone.DARK_COBBLESTONE_STAIRS);
        darkCPool.slab(Cobblestone.DARK_COBBLESTONE_SLAB);
        darkCPool.wall(Cobblestone.DARK_COBBLESTONE_WALL);
        darkCPool.fence(Cobblestone.DARK_COBBLESTONE_FENCE);//13
        BlockStateModelGenerator.BlockTexturePool gGreyCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.GREEN_GREY_COBBLESTONE);
        gGreyCPool.stairs(Cobblestone.GREEN_GREY_COBBLESTONE_STAIRS);
        gGreyCPool.slab(Cobblestone.GREEN_GREY_COBBLESTONE_SLAB);
        gGreyCPool.wall(Cobblestone.GREEN_GREY_COBBLESTONE_WALL);
        gGreyCPool.fence(Cobblestone.GREEN_GREY_COBBLESTONE_FENCE);//14
        BlockStateModelGenerator.BlockTexturePool greydCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.GREY_DARK_COBBLESTONE);
        greydCPool.stairs(Cobblestone.GREY_DARK_COBBLESTONE_STAIRS);
        greydCPool.slab(Cobblestone.GREY_DARK_COBBLESTONE_SLAB);
        greydCPool.wall(Cobblestone.GREY_DARK_COBBLESTONE_WALL);
        greydCPool.fence(Cobblestone.GREY_DARK_COBBLESTONE_FENCE);//15
        BlockStateModelGenerator.BlockTexturePool riverCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.RIVER_COBBLE);
        riverCPool.stairs(Cobblestone.RIVER_COBBLE_STAIRS);
        riverCPool.slab(Cobblestone.RIVER_COBBLE_SLAB);
        riverCPool.wall(Cobblestone.RIVER_COBBLE_WALL);
        riverCPool.fence(Cobblestone.RIVER_COBBLE_FENCE);//16
        BlockStateModelGenerator.BlockTexturePool flGreyCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.FAINT_LIGHT_GREY_COBBLESTONE);
        flGreyCPool.stairs(Cobblestone.FAINT_LIGHT_GREY_COBBLESTONE_STAIRS);
        flGreyCPool.slab(Cobblestone.FAINT_LIGHT_GREY_COBBLESTONE_SLAB);
        flGreyCPool.wall(Cobblestone.FAINT_LIGHT_GREY_COBBLESTONE_WALL);
        flGreyCPool.fence(Cobblestone.FAINT_LIGHT_GREY_COBBLESTONE_FENCE);//17
        BlockStateModelGenerator.BlockTexturePool flGreydCpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.FAINT_LIGHT_GREY_DARK_COBBLESTONE);
        flGreydCpool.stairs(Cobblestone.FAINT_LIGHT_GREY_DARK_COBBLESTONE_STAIRS);
        flGreydCpool.slab(Cobblestone.FAINT_LIGHT_GREY_DARK_COBBLESTONE_SLAB);
        flGreydCpool.wall(Cobblestone.FAINT_LIGHT_GREY_DARK_COBBLESTONE_WALL);
        flGreydCpool.fence(Cobblestone.FAINT_LIGHT_GREY_DARK_COBBLESTONE_FENCE);//18
        BlockStateModelGenerator.BlockTexturePool whiteCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.WHITE_COBBLESTONE);
        whiteCPool.stairs(Cobblestone.WHITE_COBBLESTONE_STAIRS);
        whiteCPool.slab(Cobblestone.WHITE_COBBLESTONE_SLAB);
        whiteCPool.wall(Cobblestone.WHITE_COBBLESTONE_WALL);
        whiteCPool.fence(Cobblestone.WHITE_COBBLESTONE_FENCE);//19
        BlockStateModelGenerator.BlockTexturePool whitedCpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.WHITE_DARK_COBBLESTONE);
        whitedCpool.stairs(Cobblestone.WHITE_DARK_COBBLESTONE_STAIRS);
        whitedCpool.slab(Cobblestone.WHITE_DARK_COBBLESTONE_SLAB);
        whitedCpool.wall(Cobblestone.WHITE_DARK_COBBLESTONE_WALL);
        whitedCpool.fence(Cobblestone.WHITE_DARK_COBBLESTONE_FENCE);//20
        BlockStateModelGenerator.BlockTexturePool reachCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.REACH_COBBLESTONE);
        reachCPool.stairs(Cobblestone.REACH_COBBLESTONE_STAIRS);
        reachCPool.slab(Cobblestone.REACH_COBBLESTONE_SLAB);
        reachCPool.wall(Cobblestone.REACH_COBBLESTONE_WALL);
        reachCPool.fence(Cobblestone.REACH_COBBLESTONE_FENCE);//21
        BlockStateModelGenerator.BlockTexturePool reachdCpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.REACH_DARK_COBBLESTONE);
        reachdCpool.stairs(Cobblestone.REACH_DARK_COBBLESTONE_STAIRS);
        reachdCpool.slab(Cobblestone.REACH_DARK_COBBLESTONE_SLAB);
        reachdCpool.wall(Cobblestone.REACH_DARK_COBBLESTONE_WALL);
        reachdCpool.fence(Cobblestone.REACH_DARK_COBBLESTONE_FENCE);//22
        BlockStateModelGenerator.BlockTexturePool sPinkCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.SANDY_PINK_COBBLESTONE);
        sPinkCPool.stairs(Cobblestone.SANDY_PINK_COBBLESTONE_STAIRS);
        sPinkCPool.slab(Cobblestone.SANDY_PINK_COBBLESTONE_SLAB);
        sPinkCPool.wall(Cobblestone.SANDY_PINK_COBBLESTONE_WALL);
        sPinkCPool.fence(Cobblestone.SANDY_PINK_COBBLESTONE_FENCE);//23
        BlockStateModelGenerator.BlockTexturePool sPinkdCpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.SANDY_PINK_DARK_COBBLESTONE);
        sPinkdCpool.stairs(Cobblestone.SANDY_PINK_DARK_COBBLESTONE_STAIRS);
        sPinkdCpool.slab(Cobblestone.SANDY_PINK_DARK_COBBLESTONE_SLAB);
        sPinkdCpool.wall(Cobblestone.SANDY_PINK_DARK_COBBLESTONE_WALL);
        sPinkdCpool.fence(Cobblestone.SANDY_PINK_DARK_COBBLESTONE_FENCE);//24
        BlockStateModelGenerator.BlockTexturePool klDunCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.KL_DUN_COBBLE);
        sPinkCPool.stairs(Cobblestone.KL_DUN_COBBLE_STAIRS);
        sPinkCPool.slab(Cobblestone.KL_DUN_COBBLE_SLAB);
        sPinkCPool.wall(Cobblestone.KL_DUN_COBBLE_WALL);
        sPinkCPool.fence(Cobblestone.KL_DUN_COBBLE_FENCE);//25
        BlockStateModelGenerator.BlockTexturePool redCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.RED_COBBLESTONE);
        redCPool.stairs(Cobblestone.RED_COBBLESTONE_STAIRS);
        redCPool.slab(Cobblestone.RED_COBBLESTONE_SLAB);
        redCPool.wall(Cobblestone.RED_COBBLESTONE_WALL);
        redCPool.fence(Cobblestone.RED_COBBLESTONE_FENCE);//26
        BlockStateModelGenerator.BlockTexturePool creddCpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.COARSE_RED_DARK_COBBLESTONE);
        creddCpool.stairs(Cobblestone.COARSE_RED_DARK_COBBLESTONE_STAIRS);
        creddCpool.slab(Cobblestone.COARSE_RED_DARK_COBBLESTONE_SLAB);
        creddCpool.wall(Cobblestone.COARSE_RED_DARK_COBBLESTONE_WALL);
        creddCpool.fence(Cobblestone.COARSE_RED_DARK_COBBLESTONE_FENCE);//27
        BlockStateModelGenerator.BlockTexturePool oldtownCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.OLDTOWN_COBBLESTONE);
        oldtownCPool.stairs(Cobblestone.OLDTOWN_COBBLESTONE_STAIRS);
        oldtownCPool.slab(Cobblestone.OLDTOWN_COBBLESTONE_SLAB);
        oldtownCPool.wall(Cobblestone.OLDTOWN_COBBLESTONE_WALL);
        oldtownCPool.fence(Cobblestone.OLDTOWN_COBBLESTONE_FENCE);//28
        BlockStateModelGenerator.BlockTexturePool oldtowndCpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.OLDTOWN_DARK_COBBLESTONE);
        oldtowndCpool.stairs(Cobblestone.OLDTOWN_DARK_COBBLESTONE_STAIRS);
        oldtowndCpool.slab(Cobblestone.OLDTOWN_DARK_COBBLESTONE_SLAB);
        oldtowndCpool.wall(Cobblestone.OLDTOWN_DARK_COBBLESTONE_WALL);
        oldtowndCpool.fence(Cobblestone.OLDTOWN_DARK_COBBLESTONE_FENCE);//29
        BlockStateModelGenerator.BlockTexturePool arborCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.ARBOR_COBBLESTONE);
        arborCPool.stairs(Cobblestone.ARBOR_COBBLESTONE_STAIRS);
        arborCPool.slab(Cobblestone.ARBOR_COBBLESTONE_SLAB);
        arborCPool.wall(Cobblestone.ARBOR_COBBLESTONE_WALL);
        arborCPool.fence(Cobblestone.ARBOR_COBBLESTONE_FENCE);//30
        BlockStateModelGenerator.BlockTexturePool arbordCpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.ARBOR_DARK_COBBLESTONE);
        arbordCpool.stairs(Cobblestone.ARBOR_DARK_COBBLESTONE_STAIRS);
        arbordCpool.slab(Cobblestone.ARBOR_DARK_COBBLESTONE_SLAB);
        arbordCpool.wall(Cobblestone.ARBOR_DARK_COBBLESTONE_WALL);
        arbordCpool.fence(Cobblestone.ARBOR_DARK_COBBLESTONE_FENCE);//31
        BlockStateModelGenerator.BlockTexturePool lannisportCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.LANNISPORT_COBBLESTONE);
        lannisportCPool.stairs(Cobblestone.LANNISPORT_COBBLESTONE_STAIRS);
        lannisportCPool.slab(Cobblestone.LANNISPORT_COBBLESTONE_SLAB);
        lannisportCPool.wall(Cobblestone.LANNISPORT_COBBLESTONE_WALL);
        lannisportCPool.fence(Cobblestone.LANNISPORT_COBBLESTONE_FENCE);//32
        BlockStateModelGenerator.BlockTexturePool lannisportdCpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.LANNISPORT_DARK_COBBLESTONE);
        lannisportdCpool.stairs(Cobblestone.LANNISPORT_DARK_COBBLESTONE_STAIRS);
        lannisportdCpool.slab(Cobblestone.LANNISPORT_DARK_COBBLESTONE_SLAB);
        lannisportdCpool.wall(Cobblestone.LANNISPORT_DARK_COBBLESTONE_WALL);
        lannisportdCpool.fence(Cobblestone.LANNISPORT_DARK_COBBLESTONE_FENCE);//33
        BlockStateModelGenerator.BlockTexturePool stormlandCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.STORMLAND_COBBLESTONE);
        stormlandCPool.stairs(Cobblestone.STORMLAND_COBBLESTONE_STAIRS);
        stormlandCPool.slab(Cobblestone.STORMLAND_COBBLESTONE_SLAB);
        stormlandCPool.wall(Cobblestone.STORMLAND_COBBLESTONE_WALL);
        stormlandCPool.fence(Cobblestone.STORMLAND_COBBLESTONE_FENCE);//34
        BlockStateModelGenerator.BlockTexturePool stormlanddCpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.STORMLAND_DARK_COBBLESTONE);
        stormlanddCpool.stairs(Cobblestone.STORMLAND_DARK_COBBLESTONE_STAIRS);
        stormlanddCpool.slab(Cobblestone.STORMLAND_DARK_COBBLESTONE_SLAB);
        stormlanddCpool.wall(Cobblestone.STORMLAND_DARK_COBBLESTONE_WALL);
        stormlanddCpool.fence(Cobblestone.STORMLAND_DARK_COBBLESTONE_FENCE);//35
        BlockStateModelGenerator.BlockTexturePool stormlandmCpool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.STORMLAND_MOSSY_COBBLESTONE);
        stormlandmCpool.stairs(Cobblestone.STORMLAND_MOSSY_COBBLESTONE_STAIRS);
        stormlandmCpool.slab(Cobblestone.STORMLAND_MOSSY_COBBLESTONE_SLAB);
        stormlandmCpool.wall(Cobblestone.STORMLAND_MOSSY_COBBLESTONE_WALL);
        stormlandmCpool.fence(Cobblestone.STORMLAND_MOSSY_COBBLESTONE_FENCE);//36
        BlockStateModelGenerator.BlockTexturePool terracottaCPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Cobblestone.TERRACOTTA_COBBLESTONE);
        terracottaCPool.stairs(Cobblestone.TERRACOTTA_COBBLESTONE_STAIRS);
        terracottaCPool.slab(Cobblestone.TERRACOTTA_COBBLESTONE_SLAB);
        terracottaCPool.wall(Cobblestone.TERRACOTTA_COBBLESTONE_WALL);
        terracottaCPool.fence(Cobblestone.TERRACOTTA_COBBLESTONE_FENCE);//36

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(Cobblestone.FLAGSTONE, Models.GENERATED);
    }
}
