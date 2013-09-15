package net.divinerpg.item;


import java.util.List;

import net.divinerpg.helper.item.IceikaItemHelper;
import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSantaArmor extends ItemArmor{

    public ItemSantaArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
        super(par1, par2EnumArmorMaterial, par3, par4);
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    {
        if (itemstack.itemID == IceikaItemHelper.santaHead.itemID || itemstack.itemID == IceikaItemHelper.santaBody.itemID || itemstack.itemID == IceikaItemHelper.santaBoots.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/santa_1.png";

        if (itemstack.itemID == IceikaItemHelper.santaLegs.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/santa_2.png";
        return Reference.MOD_ID + ":" + "/textures/armor/santa_2.png";
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        if(itemID == IceikaItemHelper.santaHead.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:SantaHelmet");
        }
        if(itemID == IceikaItemHelper.santaBody.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:SantaBody");
        }
        if(itemID == IceikaItemHelper.santaLegs.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:SantaLegs");
        }
        if(itemID == IceikaItemHelper.santaBoots.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:SantaBoots");
        }		   
    }


    public void damageArmor(EntityLiving var1, ItemStack var2, DamageSource var3, int var4, int var5) {

        return;
    }

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
        par3List.add("Full set: Massive Buff in Iceika");
        par3List.add(" - Speeds up player");
        par3List.add(" - Adds 6 Melee Damage");
        par3List.add(" - Refils Hunger");
        par3List.add(" - 80% Damage Reduction");
    }
}
