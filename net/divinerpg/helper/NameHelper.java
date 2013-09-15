package net.divinerpg.helper;

import net.divinerpg.helper.block.ArcanaBlockHelper;
import net.divinerpg.helper.block.IceikaBlockHelper;
import net.divinerpg.helper.block.OverworldBlockHelper;
import net.divinerpg.helper.block.TwilightBlockHelper;
import net.divinerpg.helper.block.VetheaBlockHelper;
import net.divinerpg.helper.item.ArcanaItemHelper;
import net.divinerpg.helper.item.IceikaItemHelper;
import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.helper.item.VetheaItemHelper;

public class NameHelper {

    public static void addNames(){
        OverworldBlockHelper.addNames();
        ArcanaBlockHelper.addNames();
        IceikaBlockHelper.addNames();
        TwilightBlockHelper.addNames();
        VetheaBlockHelper.addNames();
        ArcanaItemHelper.addNames();
        IceikaItemHelper.addNames();
        OverworldItemHelper.addNames();
        TwilightItemHelper.addNames();
        VetheaItemHelper.addNames();
    }
}
