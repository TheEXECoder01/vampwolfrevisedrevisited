package me.coder.vampwolfrevised.items;

import me.coder.vampwolfrevised.REFERENCES;
import me.coder.vampwolfrevised.tabs.Supernaturalsrevisedblocks;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, REFERENCES.MODID);

    public static final RegistryObject<Item> Vampire_Fang = ITEMS.register("vampire_fang", () -> new Item(new Item.Properties().tab(Supernaturalsrevisedblocks.instance)));

}
