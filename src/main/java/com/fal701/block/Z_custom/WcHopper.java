package com.fal701.block.Z_custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.stream.Stream;

public class WcHopper extends HorizontalFacingBlock {
    public WcHopper(Settings settings) {
        super(settings);
    }

    private static final VoxelShape HOPPERWC = Stream.of(
            Block.createCuboidShape(6, 0, 6, 10, 6, 10),
            Block.createCuboidShape(4, 4.5, 4, 12, 10.5, 12),
            Block.createCuboidShape(0, 10, 0, 16, 16, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return HOPPERWC;
    }
}
