package net.divinerpg.item;

import net.divinerpg.mob.entity.item.EntityDarvenDisk;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemDarvenDisk extends ItemVetheanDisk
{

    public ItemDarvenDisk(int par1, int par2) {
        super(par1, par2);
    }

    @Override
    public void shoot(World par2, EntityPlayer par3)
    {
        par2.spawnEntityInWorld(new EntityDarvenDisk(par2, par3, this.damage, this));
    }
}
