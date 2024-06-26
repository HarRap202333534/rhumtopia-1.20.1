package com.fal701.block.TimberFrame;

import com.fal701.block.StateEnum;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;

import java.util.Collection;

public class TimberFrameBlock extends Block {
    public static final EnumProperty<StateEnum> STATE = EnumProperty.of("state", StateEnum.class);

    public TimberFrameBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getDefaultState().with(STATE, StateEnum.STATE0));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(STATE);
    }
}
