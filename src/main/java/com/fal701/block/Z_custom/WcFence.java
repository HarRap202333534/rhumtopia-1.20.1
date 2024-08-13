package com.fal701.block.Z_custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.Direction;

public class WcFence extends FenceBlock {
    public WcFence(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canConnect(BlockState state, boolean neighborIsFullSquare, Direction dir) {
        Block block = state.getBlock();
        boolean bl = block instanceof FenceBlock;
        boolean bl2 = block instanceof FenceGateBlock && FenceGateBlock.canWallConnect(state, dir);
        return !cannotConnect(state) && neighborIsFullSquare || bl || bl2;
    }
}
