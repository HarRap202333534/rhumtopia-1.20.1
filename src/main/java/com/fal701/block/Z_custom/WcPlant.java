package com.fal701.block.Z_custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PlantBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;

public class WcPlant extends Block {
    public static final IntProperty LAYERS = Properties.LAYERS;

    public WcPlant(Settings settings) {
        super(settings.nonOpaque().noCollision());
        setDefaultState(getDefaultState().with(LAYERS, 8));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LAYERS);
        super.appendProperties(builder);
    }
}
