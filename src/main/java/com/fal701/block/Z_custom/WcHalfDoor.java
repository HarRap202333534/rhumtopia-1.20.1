package com.fal701.block.Z_custom;

import com.fal701.block.FacingState;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class WcHalfDoor extends HorizontalFacingBlock {
    public static final EnumProperty<FacingState> FACING = EnumProperty.of("facing", FacingState.class);
    public WcHalfDoor(Settings settings){
        super(settings);
        this.setDefaultState(this.getDefaultState().with(FACING, FacingState.NORTH));
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        if(placer.getHorizontalFacing() == Direction.NORTH){
            world.setBlockState(pos, state.with(FACING, FacingState.SOUTH));
        }
        else if(placer.getHorizontalFacing() == Direction.SOUTH){
            world.setBlockState(pos, state.with(FACING, FacingState.NORTH));
        }
        else if(placer.getHorizontalFacing() == Direction.EAST){
            world.setBlockState(pos, state.with(FACING, FacingState.WEST));
        }
        else if(placer.getHorizontalFacing() == Direction.WEST){
            world.setBlockState(pos, state.with(FACING, FacingState.EAST));
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    private static final VoxelShape HALFDOORWCWEST = Stream.of(
            Block.createCuboidShape(13, 0, 0, 16, 16, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape HALFDOORWCEAST = Stream.of(
            Block.createCuboidShape(0, 0, 0, 3, 16, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape HALFDOORWCSOUTH = Stream.of(
            Block.createCuboidShape(0, 0, 0, 16, 16, 3)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    private static final VoxelShape HALFDOORWCNORTH = Stream.of(
            Block.createCuboidShape(0, 0, 13, 16, 16, 16)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if(state.get(FACING) == FacingState.NORTH){
            return HALFDOORWCNORTH;
        }
        else if(state.get(FACING) == FacingState.EAST){
            return HALFDOORWCEAST;
        }
        else if(state.get(FACING) == FacingState.SOUTH){
            return HALFDOORWCSOUTH;
        }
        else{
            return HALFDOORWCWEST;
        }
    }
}
