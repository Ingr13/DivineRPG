package net.divinerpg.block;

import net.divinerpg.helper.base.LeavesBase;

public class ModLeaves extends LeavesBase
{
    public ModLeaves(int par1, String par2)
    {
        super(par1, true);
        this.setTickRandomly(true);
        this.registerTexture(par2 + "Leaves");
    }
}