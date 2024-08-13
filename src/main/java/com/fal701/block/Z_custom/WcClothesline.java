package com.fal701.block.Z_custom;

import com.fal701.block.BlockStatecCustomEnum.StateGlobal;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WcClothesline extends WcDecorBlock0x1Vertical{

    public static final EnumProperty<StateGlobal> STATE = EnumProperty.of("state", StateGlobal.class);


    public WcClothesline(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(STATE, StateGlobal.RANDOM));
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if(state.get(STATE) == StateGlobal.RANDOM){
            world.setBlockState(pos, state.with(STATE, StateGlobal.CLOTHES1));
        }
        else if(state.get(STATE) == StateGlobal.CLOTHES1){
            world.setBlockState(pos, state.with(STATE, StateGlobal.CLOTHES2));
        }
        else if(state.get(STATE) == StateGlobal.CLOTHES2){
            world.setBlockState(pos, state.with(STATE, StateGlobal.CLOTHES3));
        }
        else {
            world.setBlockState(pos, state.with(STATE, StateGlobal.RANDOM));
        }
        return ActionResult.SUCCESS;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.FACING, STATE);
    }
}
