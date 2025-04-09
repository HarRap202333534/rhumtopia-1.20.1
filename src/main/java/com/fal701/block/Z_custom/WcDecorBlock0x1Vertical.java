package com.fal701.block.Z_custom;

import com.fal701.block.BlockStatecCustomEnum.StateGlobal;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class WcDecorBlock0x1Vertical extends HorizontalFacingBlock {

    private static final DirectionProperty FACING = Properties.FACING;

    public WcDecorBlock0x1Vertical(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(FACING, Direction.NORTH));
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        if(placer.getHorizontalFacing() == Direction.NORTH || placer.getHorizontalFacing() == Direction.SOUTH){
            world.setBlockState(pos, state.with(FACING, Direction.NORTH));
        }
        else{
            world.setBlockState(pos, state.with(FACING, Direction.EAST));
        }
    }

    VoxelShape SHAPE1 = Block.createCuboidShape(0,0,7.99,16,16,8);
    VoxelShape SHAPE2 = Block.createCuboidShape(7.99,0,0,8,16,16);

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        if(state.get(FACING) == Direction.EAST){
            return SHAPE1;
        }
        else{
            return SHAPE2;
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
