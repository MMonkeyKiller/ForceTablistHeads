package me.monkeykiller.forcetablistheads.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.PlayerListHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(PlayerListHud.class)
public class PlayerListHudMixin {
  @Redirect(method = "render", at = @At(value = "INVOKE", target="Lnet/minecraft/client/MinecraftClient;isInSingleplayer()Z"))
  private boolean shouldRenderHeads(MinecraftClient instance) {
    return true;
  }
}
