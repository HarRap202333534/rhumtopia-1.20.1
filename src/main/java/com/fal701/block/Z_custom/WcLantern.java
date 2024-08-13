package com.fal701.block.Z_custom;

import com.fal701.block.BlockStatecCustomEnum.StateGlobal;
import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class WcLantern extends Block {
    private static final EnumProperty<StateGlobal> STATE = EnumProperty.of("state", StateGlobal.class);
    private static final IntProperty LEVEL = Properties.LEVEL_15;

    private static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    public WcLantern(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(LEVEL,3).with(WATERLOGGED, false).with(STATE, StateGlobal.LIT));
    }

    VoxelShape PART1 = Block.createCuboidShape(5,1,5,11,2,11);
    VoxelShape PART2 = Block.createCuboidShape(6,2,6,10,9,10);
    VoxelShape PART3 = Block.createCuboidShape(5,9,5,11,10,11);
    VoxelShape PART4 = Block.createCuboidShape(5,0,5,6,1,6);
    VoxelShape PART5 = Block.createCuboidShape(10,0,10,11,1,11);
    VoxelShape PART6 = Block.createCuboidShape(10,0,5,11,1,6);
    VoxelShape PART7 = Block.createCuboidShape(5,0,10,6,1,11);
    VoxelShape PART8 = Block.createCuboidShape(5,10,7.5,6,14.5,8.5);
    VoxelShape PART9 = Block.createCuboidShape(10,10,7.5,11,14.5,8.5);
    VoxelShape PART10 = Block.createCuboidShape(5.75,13.5,7.5,10.25,16,8.5);
    VoxelShape PART11 = Block.createCuboidShape(5,2,5,6,9,6);
    VoxelShape PART12 = Block.createCuboidShape(10,2,10,11,9,11);
    VoxelShape PART13 = Block.createCuboidShape(10,2,5,11,9,6);
    VoxelShape PART14 = Block.createCuboidShape(5,2,10,6,9,11);

    VoxelShape SHAPE = VoxelShapes.union(PART1,PART2,PART3,PART4,PART5,PART6,PART7,PART8,PART9,PART10,PART11,PART12,PART13,PART14);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LEVEL, WATERLOGGED, STATE);
    }
}
