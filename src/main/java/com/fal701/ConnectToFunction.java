package com.fal701;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.Direction;

public interface ConnectToFunction {
    public boolean apply(BlockState from, BlockState to, Direction dir);
}
