package me.coder.vampwolfrevised;

import com.mojang.logging.LogUtils;
import me.coder.vampwolfrevised.config.DiscordConfiguration;
import me.coder.vampwolfrevised.items.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(REFERENCES.MODID)
public class Vampwolfrevised {
    public Vampwolfrevised() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(eventBus);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, DiscordConfiguration.SPEC, "vampwolf_discord_bot.toml");

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void serverSetup(FMLDedicatedServerSetupEvent ev) {

    }
}
