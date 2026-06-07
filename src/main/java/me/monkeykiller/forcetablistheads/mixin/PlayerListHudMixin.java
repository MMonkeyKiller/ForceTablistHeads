package me.monkeykiller.forcetablistheads.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.PlayerTabOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PlayerTabOverlay.class)
public class PlayerListHudMixin {
  @Redirect(method = "extractRenderState", at = @At(value = "INVOKE", target="Lnet/minecraft/client/Minecraft;isLocalServer()Z"))
  private boolean shouldRenderHeads(Minecraft instance) {
    return true;
  }
}
