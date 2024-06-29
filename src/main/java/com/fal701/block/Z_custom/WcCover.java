package com.fal701.block.Z_custom;

import com.fal701.block.FacingState;
import com.fal701.block.ShapeState;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

import java.util.stream.Stream;

public class WcCover extends HorizontalFacingBlock {
    public static final EnumProperty<ShapeState> SHAPE = EnumProperty.of("shape", ShapeState.class);

    protected WcCover(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(SHAPE, ShapeState.ASCENDING_NORTH));
    }

    private static final VoxelShape COVERWC = Stream.of(
            Block.createCuboidShape(0, 0, 0, 16, 1, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(SHAPE);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return COVERWC;
    }
}
