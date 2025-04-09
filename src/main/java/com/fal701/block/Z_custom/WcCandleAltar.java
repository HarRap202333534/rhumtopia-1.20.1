package com.fal701.block.Z_custom;

import com.fal701.block.BlockStatecCustomEnum.StateGlobal;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;

public class WcCandleAltar extends Block {

    private static final EnumProperty<StateGlobal> STATE = EnumProperty.of("state", StateGlobal.class);


    public WcCandleAltar(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(STATE, StateGlobal.LIT));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(STATE);
    }
}
