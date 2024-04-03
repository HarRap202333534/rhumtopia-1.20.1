package com.fal701.block.custom;

import net.minecraft.block.*;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.stream.Stream;

public class WcArrowSlit extends HorizontalFacingBlock{
    public WcArrowSlit(Settings settings) {
        super(settings);
    }

    private static final VoxelShape ARROW_SLIT = Stream.of(
            Block.createCuboidShape(0, 0, 0, 3, 16, 3),
            Block.createCuboidShape(0, 0, 13, 3, 16, 16),
            Block.createCuboidShape(13, 0, 13, 16, 16, 16),
            Block.createCuboidShape(13, 0, 0, 16, 16, 3)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return ARROW_SLIT;
    }
}
