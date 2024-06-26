package com.fal701.block.TimberFrame;

import com.fal701.block.StateEnum;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;

public class TimberFrameBlock extends Block {
    public static final EnumProperty<StateEnum> STATE = EnumProperty.of("state", StateEnum.class);

    public TimberFrameBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(STATE, StateEnum.STATE0));
    }

    @Override
    public void onPlaced(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack itemStack) {
        BlockPos pos1 = new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ());
        BlockPos pos2 = new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ());
        BlockPos pos3 = new BlockPos(pos.getX() + 1, pos.getY() + 1, pos.getZ());

        BlockPos pos4 = new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ());
        BlockPos pos5 = new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ());
        BlockPos pos6 = new BlockPos(pos.getX() - 1, pos.getY() + 1, pos.getZ());

        BlockPos pos7 = new BlockPos(pos.getX() + 1, pos.getY(), pos.getZ());
        BlockPos pos8 = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ());
        BlockPos pos9 = new BlockPos(pos.getX() + 1, pos.getY() - 1, pos.getZ());

        BlockPos pos10 = new BlockPos(pos.getX() - 1, pos.getY(), pos.getZ());
        BlockPos pos11 = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ());
        BlockPos pos12 = new BlockPos(pos.getX() - 1, pos.getY() - 1, pos.getZ());

        BlockPos pos13 = new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1);
        BlockPos pos14 = new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ());
        BlockPos pos15 = new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ() + 1);

        BlockPos pos16 = new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1);
        BlockPos pos17 = new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ());
        BlockPos pos18 = new BlockPos(pos.getX(), pos.getY() + 1, pos.getZ() - 1);

        BlockPos pos19 = new BlockPos(pos.getX(), pos.getY(), pos.getZ() + 1);
        BlockPos pos20 = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ());
        BlockPos pos21 = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ() + 1);

        BlockPos pos22 = new BlockPos(pos.getX(), pos.getY(), pos.getZ() - 1);
        BlockPos pos23 = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ());
        BlockPos pos24 = new BlockPos(pos.getX(), pos.getY() - 1, pos.getZ() - 1);


        if(world.getBlockState(pos1).getBlock() == world.getBlockState(pos).getBlock() && world.getBlockState(pos2).getBlock() == world.getBlockState(pos).getBlock() && world.getBlockState(pos3).getBlock() == world.getBlockState(pos).getBlock()) {
            world.setBlockState(pos, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos1, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos2, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos3, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
        }
        if(world.getBlockState(pos4).getBlock() == world.getBlockState(pos).getBlock() && world.getBlockState(pos5).getBlock() == world.getBlockState(pos).getBlock() && world.getBlockState(pos6).getBlock() == world.getBlockState(pos).getBlock()) {
            world.setBlockState(pos, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos4, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos5, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos6, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
        }
        if(world.getBlockState(pos7).getBlock() == world.getBlockState(pos).getBlock() && world.getBlockState(pos8).getBlock() == world.getBlockState(pos).getBlock() && world.getBlockState(pos9).getBlock() == world.getBlockState(pos).getBlock()) {
            world.setBlockState(pos, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos7, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos8, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos9, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
        }
        if(world.getBlockState(pos10).getBlock() == world.getBlockState(pos).getBlock() && world.getBlockState(pos11).getBlock() == world.getBlockState(pos).getBlock() && world.getBlockState(pos12).getBlock() == world.getBlockState(pos).getBlock()) {
            world.setBlockState(pos, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos10, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos11, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos12, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
        }
        if(world.getBlockState(pos13).getBlock() == world.getBlockState(pos).getBlock() && world.getBlockState(pos14).getBlock() == world.getBlockState(pos).getBlock() && world.getBlockState(pos15).getBlock() == world.getBlockState(pos).getBlock()) {
            world.setBlockState(pos, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos13, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos14, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos15, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
        }
        if(world.getBlockState(pos16).getBlock() == world.getBlockState(pos).getBlock() && world.getBlockState(pos17).getBlock() == world.getBlockState(pos).getBlock() && world.getBlockState(pos18).getBlock() == world.getBlockState(pos).getBlock()) {
            world.setBlockState(pos, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos16, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos17, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos18, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
        }
        if(world.getBlockState(pos19).getBlock() == world.getBlockState(pos).getBlock() && world.getBlockState(pos20).getBlock() == world.getBlockState(pos).getBlock() && world.getBlockState(pos21).getBlock() == world.getBlockState(pos).getBlock()) {
            world.setBlockState(pos, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos19, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos20, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos21, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
        }
        if(world.getBlockState(pos22).getBlock() == world.getBlockState(pos).getBlock() && world.getBlockState(pos23).getBlock() == world.getBlockState(pos).getBlock() && world.getBlockState(pos24).getBlock() == world.getBlockState(pos).getBlock()) {
            world.setBlockState(pos, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos22, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos23, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
            world.setBlockState(pos24, state.with(STATE, StateEnum.STATE4), Block.NOTIFY_ALL);
        }
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(STATE);
    }
}
