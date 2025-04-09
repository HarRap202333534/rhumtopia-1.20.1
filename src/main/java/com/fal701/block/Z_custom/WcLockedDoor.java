package com.fal701.block.Z_custom;

import com.fal701.block.BlockStatecCustomEnum.FacingState;
import com.fal701.block.BlockStatecCustomEnum.HalfState;
import com.fal701.block.BlockStatecCustomEnum.HingeState;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
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

public class WcLockedDoor extends HorizontalFacingBlock {

    public static final EnumProperty<FacingState> FACING = EnumProperty.of("facing", FacingState.class);
    public static final BooleanProperty OPEN = BooleanProperty.of("open");
    public static final EnumProperty<HalfState> HALF = EnumProperty.of("half", HalfState.class);
    public static final EnumProperty<HingeState> HINGE = EnumProperty.of("hinge", HingeState.class);

    public WcLockedDoor(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(FACING, FacingState.NORTH));
        this.setDefaultState(this.getDefaultState().with(OPEN, true));
        this.setDefaultState(this.getDefaultState().with(HALF, HalfState.LOWER));
        this.setDefaultState(this.getDefaultState().with(HINGE, HingeState.RIGHT));
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        if(placer.getHorizontalFacing() == Direction.NORTH){
            world.setBlockState(pos, state.with(FACING, FacingState.NORTH));
        }
        else if(placer.getHorizontalFacing() == Direction.SOUTH){
            world.setBlockState(pos, state.with(FACING, FacingState.SOUTH));
        }
        else if(placer.getHorizontalFacing() == Direction.EAST){
            world.setBlockState(pos, state.with(FACING, FacingState.EAST));
        }
        else if(placer.getHorizontalFacing() == Direction.WEST){
            world.setBlockState(pos, state.with(FACING, FacingState.WEST));
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, OPEN, HALF, HINGE);
    }

    private static final VoxelShape LOCKEDDOORWC = Stream.of(
            Block.createCuboidShape(0, 0, 0, 16, 32, 3)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return LOCKEDDOORWC;
    }
}
