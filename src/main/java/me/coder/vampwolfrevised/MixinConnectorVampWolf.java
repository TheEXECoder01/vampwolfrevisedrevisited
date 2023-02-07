package me.coder.vampwolfrevised;

import org.spongepowered.asm.mixin.Mixins;
import org.spongepowered.asm.mixin.connect.IMixinConnector;

public class MixinConnectorVampWolf implements IMixinConnector {
    @Override
    public void connect() {
        Mixins.addConfiguration("mixins.vampwolfrevised.json");
    }
}
