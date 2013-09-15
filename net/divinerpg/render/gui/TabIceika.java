package net.divinerpg.render.gui;

import net.divinerpg.helper.item.IceikaItemHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabIceika extends CreativeTabs {

    public TabIceika(String label) {
        super(label);

    }


    @Override
    public ItemStack getIconItemStack() { 
        return new ItemStack(IceikaItemHelper.soundOfCarols);

    }

}
