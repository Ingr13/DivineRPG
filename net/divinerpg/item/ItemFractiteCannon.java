package net.divinerpg.item;

import java.util.List;

import net.divinerpg.helper.base.ItemsBase;
import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.lib.Sound;
import net.divinerpg.mob.entity.item.EntityFractiteCannonShot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFractiteCannon extends ItemsBase {

    public ItemFractiteCannon(int par1)
    {
        super(par1);
        this.setMaxDamage(10000);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    @Override
    public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
    {
        boolean var4 = var3.capabilities.isCreativeMode;

        if (!var4 && !var3.inventory.hasItem(OverworldItemHelper.iceShard.itemID))
            return var1;
        else
        {
            var2.playSoundAtEntity(var3, Sound.FractiteCannon, 1.0F, 1.0F);
            var3.inventory.consumeInventoryItem(OverworldItemHelper.iceShard.itemID);
            var2.spawnEntityInWorld(new EntityFractiteCannonShot(var2, var3));
            var1.damageItem(1, var3);
        }

        return var1;
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("15 Ranged Damage");
        par3List.add("Ammo: Frost Shards");
        if (par1ItemStack.getMaxDamage() != -1)
        {
            par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
        }
        else
        {
            par3List.add("Infinite Uses");
        }
    }

}
