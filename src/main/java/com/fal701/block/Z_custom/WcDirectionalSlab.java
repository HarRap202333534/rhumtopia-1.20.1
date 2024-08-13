package com.fal701.block.Z_custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class WcDirectionalSlab extends SlabBlock {
    public static final DirectionProperty FACING = Properties.FACING;

    public WcDirectionalSlab(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(FACING, Direction.NORTH));
    }


    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        if(placer.getHorizontalFacing() == Direction.NORTH){
            world.setBlockState(pos, state.with(FACING, Direction.NORTH));
        }
        else if(placer.getHorizontalFacing() == Direction.SOUTH){
            world.setBlockState(pos, state.with(FACING, Direction.NORTH));
        }
        else if(placer.getHorizontalFacing() == Direction.EAST){
            world.setBlockState(pos, state.with(FACING, Direction.EAST));
        }
        else{
            world.setBlockState(pos, state.with(FACING, Direction.EAST));
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, TYPE, WATERLOGGED);
    }
}
