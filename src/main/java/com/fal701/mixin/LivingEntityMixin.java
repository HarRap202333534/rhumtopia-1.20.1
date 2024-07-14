package com.fal701.mixin;

import com.fal701.block.Foliage.Foliage;
import net.minecraft.block.BlockState;
import net.minecraft.block.LadderBlock;
import net.minecraft.block.VineBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Optional;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
	@SuppressWarnings("OptionalUsedAsFieldOrParameterType")
	@Shadow
	private Optional<BlockPos> climbingPos;

	@Inject(at = @At("TAIL"), method = "isClimbing()Z", cancellable = true)
	public void isClimbingOnLadder(CallbackInfoReturnable<Boolean> cir){
		LivingEntity self = ((LivingEntity)(Object)this);

		BlockPos pos = self.getBlockPos();
		BlockState state = self.getBlockStateAtPos();

		boolean onLadder = state.getBlock() instanceof LadderBlock || state.getBlock() instanceof VineBlock;
		if(state.getBlock() == Foliage.DAPPLED_MOSS){
			onLadder = false;
		}

		if(onLadder) {
			climbingPos = Optional.of(pos);
			cir.setReturnValue(true);
		}
	}
}