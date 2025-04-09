package com.fal701.block.Z_custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class WcSphere extends Block {
    public WcSphere(Settings settings) {
        super(settings);
    }





    VoxelShape PART1 = Block.createCuboidShape(7,14,7,9,16,9);
    VoxelShape PART2 = Block.createCuboidShape(4,12,4,12,14,12);
    VoxelShape PART3 = Block.createCuboidShape(2,4,2,14,12,14);
    VoxelShape PART4 = Block.createCuboidShape(4,2,4,12,4,12);
    VoxelShape PART5 = Block.createCuboidShape(7,0,7,9,2,9);

    VoxelShape SHAPE = VoxelShapes.union(PART1,PART2,PART3,PART4,PART5);


    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
