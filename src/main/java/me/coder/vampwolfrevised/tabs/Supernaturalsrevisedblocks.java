package me.coder.vampwolfrevised.tabs;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class Supernaturalsrevisedblocks extends CreativeModeTab {
    private Supernaturalsrevisedblocks(int index, String label) {
        super(index, label);
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(Items.BARRIER);
    }

    public static final Supernaturalsrevisedblocks instance = new Supernaturalsrevisedblocks(CreativeModeTab.TABS.length, "vampwolfrevisedblocks");
}
