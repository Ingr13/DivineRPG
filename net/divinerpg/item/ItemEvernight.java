package net.divinerpg.item;

import java.util.List;

import net.divinerpg.arcana.ArcanaHelper;
import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.item.EntityEvernightProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEvernight extends ItemVetheanStaff
{

    public ItemEvernight(int par1, int par2, int par3)
    {
        super(par1, par2, par3);
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("Deals " + this.damage + " Arcana Damage");
        par3List.add("Bouncing Projectile");
        par3List.add("Consumes " + this.cost + " Arcana");
        par3List.add("Deals 16 Arcana Damage to Player");
        par3List.add("\u00a72Vethean");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1, World par2, EntityPlayer par3)
    {
        if (!par2.isRemote && ArcanaHelper.useBar(par3, this.cost))
        {
            par3.attackEntityFrom(new EntityDamageSourceIndirect("arcana", par3, par3).setMagicDamage(), 16);
            par2.playSoundAtEntity(par3, Sound.Staff, 1.0F, 1.0F);
            par2.spawnEntityInWorld(new EntityEvernightProjectile(par2, par3, this.damage));
        }
        return par1;
    }
}