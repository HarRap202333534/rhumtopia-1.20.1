package com.fal701.block.Z_custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class WcClayPot extends Block {
    public WcClayPot(Settings settings) {
        super(settings);
    }

    VoxelShape PART1 = Block.createCuboidShape(0,0,0,16,13,16);
    VoxelShape PART2 = Block.createCuboidShape(4,13,4,12,16,12);

    VoxelShape SHAPE = VoxelShapes.union(PART1, PART2);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
