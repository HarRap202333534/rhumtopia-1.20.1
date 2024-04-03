package com.fal701.block.Fieldstone;

import com.fal701.block.Cobblestone.Cobblestone;
import net.minecraft.data.client.BlockStateModelGenerator;

public class WcFieldstoneModelGenerator {
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool faintBrownPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Fieldstone.FAINT_BROWN_GREY_BRICK);
        faintBrownPool.stairs(Fieldstone.FAINT_BROWN_GREY_BRICK_STAIRS);
        faintBrownPool.slab(Fieldstone.FAINT_BROWN_GREY_BRICK_SLAB);
        faintBrownPool.wall(Fieldstone.FAINT_BROWN_GREY_BRICK_WALL);
        faintBrownPool.fence(Fieldstone.FAINT_BROWN_GREY_BRICK_FENCE);
        BlockStateModelGenerator.BlockTexturePool brownPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Fieldstone.BROWN_GREY_BRICK);
        brownPool.stairs(Fieldstone.BROWN_GREY_BRICK_STAIRS);
        brownPool.slab(Fieldstone.BROWN_GREY_BRICK_SLAB);
        brownPool.wall(Fieldstone.BROWN_GREY_BRICK_WALL);
        brownPool.fence(Fieldstone.BROWN_GREY_BRICK_FENCE);
        BlockStateModelGenerator.BlockTexturePool lightGreyPool = blockStateModelGenerator.registerCubeAllModelTexturePool(Fieldstone.LIGHT_GREY_BRICK);
        lightGreyPool.stairs(Fieldstone.LIGHT_GREY_BRICK_STAIRS);
        lightGreyPool.slab(Fieldstone.LIGHT_GREY_BRICK_SLAB);
        lightGreyPool.wall(Fieldstone.LIGHT_GREY_BRICK_WALL);
        lightGreyPool.fence(Fieldstone.LIGHT_GREY_BRICK_FENCE);
    }
}
