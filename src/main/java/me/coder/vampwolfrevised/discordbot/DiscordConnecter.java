package me.coder.vampwolfrevised.discordbot;

import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.network.NetworkConstants;

import java.util.ArrayList;
import java.util.UUID;

public class DiscordConnecter {
    public static final ArrayList<UUID> timeouts = new ArrayList<>();
    private boolean stopped = false;
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public DiscordConnecter() {
        ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class, () -> new IExtensionPoint.DisplayTest(() -> NetworkConstants.IGNORESERVERONLY, (a, b) -> true));
    }
}
