package com.fal701.block.Z_custom;

import com.fal701.block.BlockStatecCustomEnum.StateEnum;
import com.fal701.block.BlockStatecCustomEnum.StateGlobal;
import com.fal701.block.BlockStatecCustomEnum.StateStateBones;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CobwebBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WcCobweb extends CobwebBlock {
    private static final EnumProperty<StateGlobal> STATE = EnumProperty.of("state", StateGlobal.class);

    public WcCobweb(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(STATE, StateGlobal.RANDOM));
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(player.isCreative() && player.getMainHandStack().isEmpty()){
            if(state == state.with(STATE, StateGlobal.RANDOM)){
                world.setBlockState(pos, state.with(STATE, StateGlobal.COBWEB1));
            }else if(state == state.with(STATE, StateGlobal.COBWEB1)){
                world.setBlockState(pos, state.with(STATE, StateGlobal.COBWEB2));
            }else if(state == state.with(STATE, StateGlobal.COBWEB2)){
                world.setBlockState(pos, state.with(STATE, StateGlobal.COBWEB3));
            }else if(state == state.with(STATE, StateGlobal.COBWEB3)){
                world.setBlockState(pos, state.with(STATE, StateGlobal.COBWEB4));
            }else if(state == state.with(STATE, StateGlobal.COBWEB4)){
                world.setBlockState(pos, state.with(STATE, StateGlobal.COBWEB5));
            }else if(state == state.with(STATE, StateGlobal.COBWEB5)){
                world.setBlockState(pos, state.with(STATE, StateGlobal.COBWEB6));
            }else if(state == state.with(STATE, StateGlobal.COBWEB6)){
                world.setBlockState(pos, state.with(STATE, StateGlobal.COBWEB7));
            }else if(state == state.with(STATE, StateGlobal.COBWEB7)){
                world.setBlockState(pos, state.with(STATE, StateGlobal.COBWEB8));
            }else if(state == state.with(STATE, StateGlobal.COBWEB8)){
                world.setBlockState(pos, state.with(STATE, StateGlobal.RANDOM));
            }
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(STATE);
    }
}
