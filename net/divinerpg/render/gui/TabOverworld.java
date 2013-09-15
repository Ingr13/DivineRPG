package net.divinerpg.render.gui;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabOverworld extends CreativeTabs {

    public TabOverworld(String label) {
        super(label);

    }


    @Override
	public Item getTabIconItem()
	{
		return OverworldItemHelper.rupeeIngot;
	}

}
