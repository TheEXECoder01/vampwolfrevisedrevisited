package me.coder.vampwolfrevised.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class DiscordConfiguration {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<String> Enable_Discord_Server;
    public static final ForgeConfigSpec.ConfigValue<Boolean> Enable_Discord_Bot;

    static {
        BUILDER.push("DiscordConfigs");

        Enable_Discord_Server = BUILDER.comment("Use a token from discord developer portal to get the token").define("Token", "TOKEN");

        Enable_Discord_Bot = BUILDER.comment("Should the discord bot be enabled").define("isDiscordEnabled", false);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
