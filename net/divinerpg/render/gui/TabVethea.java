package net.divinerpg.render.gui;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.helper.item.VetheaItemHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TabVethea extends CreativeTabs {

    public TabVethea(String label) {
        super(label);

    }

    @Override
    public ItemStack getIconItemStack() { 
        return new ItemStack(VetheaItemHelper.amthrimisDisk);

    }
    
}
