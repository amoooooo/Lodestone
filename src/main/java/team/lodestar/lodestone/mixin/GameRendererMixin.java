package team.lodestar.lodestone.mixin;

import team.lodestar.lodestone.handlers.RenderHandler;
import team.lodestar.lodestone.systems.postprocess.PostProcessHandler;
import net.minecraft.client.renderer.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GameRenderer.class)
public class GameRendererMixin {
    @Inject(method = "resize", at = @At(value = "HEAD"))
    public void injectionResizeListener(int width, int height, CallbackInfo ci) {
        PostProcessHandler.resize(width, height);
    }
}
