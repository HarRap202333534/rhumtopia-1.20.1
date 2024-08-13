package com.fal701.block.Z_custom;

import com.fal701.block.BlockStatecCustomEnum.StateFood;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class WcPlate extends Block {

    public static final EnumProperty<StateFood> FOOD = EnumProperty.of("state", StateFood.class);

    public WcPlate(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
       if(player.isCreative() && player.getMainHandStack() == ItemStack.EMPTY){
           if(state.get(FOOD) == StateFood.FOOD){
               world.setBlockState(pos, state.with(FOOD, StateFood.EMPTY));
           }
           else{
               world.setBlockState(pos, state.with(FOOD, StateFood.FOOD));
           }
           return ActionResult.SUCCESS;
       }
       return ActionResult.PASS;
    }

    VoxelShape SHAPE = Block.createCuboidShape(0,0,0,16,0.01,16);

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FOOD);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }
}
