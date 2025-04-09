package com.fal701.block.Z_custom;

import com.fal701.block.BlockStatecCustomEnum.StateCoins;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class WcCoins extends HorizontalFacingBlock {

    public static final DirectionProperty FACING = Properties.FACING;
    public static final EnumProperty<StateCoins> COINS = EnumProperty.of("state", StateCoins.class);

    public WcCoins(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(FACING, Direction.NORTH).with(COINS, StateCoins.RANDOM));
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        if(placer.getHorizontalFacing() == Direction.NORTH){
            world.setBlockState(pos, state.with(FACING, Direction.NORTH));
        }
        else if(placer.getHorizontalFacing() == Direction.SOUTH){
            world.setBlockState(pos, state.with(FACING, Direction.NORTH));
        }
        else if(placer.getHorizontalFacing() == Direction.WEST){
            world.setBlockState(pos, state.with(FACING, Direction.EAST));
        }
        else if(placer.getHorizontalFacing() == Direction.EAST){
            world.setBlockState(pos, state.with(FACING, Direction.EAST));
        }
    }

    VoxelShape SHAPE = Block.createCuboidShape(0,0,0,16,0.01,16);

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, COINS);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
