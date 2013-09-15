package net.divinerpg.render.gui;

import net.divinerpg.helper.item.TwilightItemHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabTwilight extends CreativeTabs {

    public TabTwilight(String label) {
        super(label);

    }


    @Override
    public ItemStack getIconItemStack() { 
        return new ItemStack(TwilightItemHelper.draviteSoul);

    }

}
