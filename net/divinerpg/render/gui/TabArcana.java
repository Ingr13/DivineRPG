package net.divinerpg.render.gui;

import net.divinerpg.helper.item.ArcanaItemHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabArcana extends CreativeTabs {

    public TabArcana(String label) {
        super(label);

    }


    @Override
    public ItemStack getIconItemStack() { 
        return new ItemStack(ArcanaItemHelper.collector);

    }

}
