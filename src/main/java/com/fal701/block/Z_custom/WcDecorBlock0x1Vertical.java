package com.fal701.block.Z_custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class WcDecorBlock0x1Vertical extends HorizontalFacingBlock {

    public WcDecorBlock0x1Vertical(Settings settings) {
        super(settings);
    }

    VoxelShape SHAPE = Block.createCuboidShape(0,0,7.99,16,16,8);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
