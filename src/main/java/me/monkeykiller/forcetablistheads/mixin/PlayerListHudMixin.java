package me.monkeykiller.forcetablistheads.mixin;

import net.minecraft.client.gui.hud.PlayerListHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(PlayerListHud.class)
public class PlayerListHudMixin {
  @ModifyVariable(method = "render", at = @At(value = "STORE"))
  private boolean shouldRenderHeads(boolean value) {
    return true;
  }
}
