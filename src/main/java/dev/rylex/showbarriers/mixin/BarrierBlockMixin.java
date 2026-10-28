package dev.rylex.showbarriers.mixin;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.BarrierBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BarrierBlock.class)
public abstract class BarrierBlockMixin extends Block {
    private BarrierBlockMixin(Properties properties) {
        super(properties);
    }

    @Inject(method = "getRenderShape", at = @At("HEAD"), cancellable = true)
    private void showbarriers$renderAsModel(BlockState state, CallbackInfoReturnable<RenderShape> cir) {
        cir.setReturnValue(RenderShape.MODEL);
    }

    @Override
    protected boolean skipRendering(BlockState state, BlockState adjacent, Direction direction) {
        return adjacent.is(this) || super.skipRendering(state, adjacent, direction);
    }
}
