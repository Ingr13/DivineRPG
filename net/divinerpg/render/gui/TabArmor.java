package net.divinerpg.render.gui;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabArmor extends CreativeTabs {

    public TabArmor(String label) {
        super(label);

    }


    @Override
    public ItemStack getIconItemStack() { 
        return new ItemStack(OverworldItemHelper.angelicHelmet);

    }

}
