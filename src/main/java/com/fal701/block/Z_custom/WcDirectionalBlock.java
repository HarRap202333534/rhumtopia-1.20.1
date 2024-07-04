package com.fal701.block.Z_custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class WcDirectionalBlock extends Block {
    public static final EnumProperty<Direction.Axis> AXIS = Properties.AXIS;

    public WcDirectionalBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(AXIS, Direction.Axis.X));
    }


    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        if(placer.getHorizontalFacing().getAxis() == Direction.Axis.X){
            world.setBlockState(pos, state.with(AXIS, Direction.Axis.X));
        }
        else if(placer.getHorizontalFacing().getAxis() == Direction.Axis.Z){
            world.setBlockState(pos, state.with(AXIS, Direction.Axis.X));
        }
        else if(placer.getHorizontalFacing().getAxis() == Direction.Axis.Y){
            world.setBlockState(pos, state.with(AXIS, Direction.Axis.Y));
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AXIS);
    }
}
