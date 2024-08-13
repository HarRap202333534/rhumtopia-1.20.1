package com.fal701.block.Z_custom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FurnaceBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.Random;


public class WcFurnaceBlock extends FurnaceBlock {
    private boolean alwaysOn;
    public WcFurnaceBlock(Settings settings, boolean alwaysOn) {
        super(settings);
        this.alwaysOn = alwaysOn;
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, net.minecraft.util.math.random.Random random) {
        boolean lit = state.get(LIT);
        boolean active = alwaysOn || lit;

        if(active) {
            double d0 = (double) pos.getX() + 0.5D;
            double d1 = (double) pos.getY();
            double d2 = (double) pos.getZ() + 0.5D;
            if(random.nextDouble() < 0.1D){
                world.playSound(d0,d1,d2, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
            }

            Direction direction = state.get(FACING);
            Direction.Axis directionAxis = direction.getAxis();
            double d4 = random.nextDouble() * 0.6D - 0.3D;
            double d5 = directionAxis == Direction.Axis.X ? (double) direction.getOffsetX() * 0.52D: d4;
            double d6 = random.nextDouble() * 6.0D / 16.0D;
            double d7 = directionAxis == Direction.Axis.Z ? (double) direction.getOffsetZ() * 0.52D: d4;
            world.addParticle(ParticleTypes.SMOKE, d0 + d5, d1 + d6, d2 + d7, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, d0 + d5, d1 + d6, d2 + d7, 0.0D, 0.0D, 0.0D);

        }
    }


    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return super.getTicker(world, state, type);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new WcFurnaceBlockEntity(pos, state);
    }
}
