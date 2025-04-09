package com.fal701.block.Z_custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class WcFlacon extends HorizontalFacingBlock {
    public WcFlacon(Settings settings) {
        super(settings);
    }

    private static final VoxelShape PART1 = Block.createCuboidShape(5,0,5,11,1,11);
    private static final VoxelShape PART2 = Block.createCuboidShape(4,1,4,12,7,12);
    private static final VoxelShape PART3 = Block.createCuboidShape(6.5,7,6.5,9.5,8,9.5);
    private static final VoxelShape PART4 = Block.createCuboidShape(6,8,6,10,9,10);

    private static final VoxelShape SHAPE = VoxelShapes.union(PART1, PART2, PART3, PART4);





    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
