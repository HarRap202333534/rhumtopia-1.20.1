package com.fal701.block.Z_custom;

import com.fal701.block.BlockStatecCustomEnum.StateGlobal;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;

public class WcSmoke extends Block {
    public static final EnumProperty<StateGlobal> STATE = EnumProperty.of("state", StateGlobal.class);

    public WcSmoke(Settings settings) {
        super(settings);
        setDefaultState(getDefaultState().with(STATE, StateGlobal.RANDOM));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(STATE);
    }
}
