package net.divinerpg.item;


import java.util.List;

import net.divinerpg.helper.item.OverworldItemHelper;
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

public class ItemRealmiteArmor extends ItemArmor{

    private String[] descriptors;
    private double damageReduction;

    public ItemRealmiteArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
        super(par1, par2EnumArmorMaterial, par3, par4);
    }

    public ItemRealmiteArmor setDamageReduction(double reduc) {
        damageReduction = reduc;
        return this;
    }

    public ItemRealmiteArmor setDescriptors(String[] descs) {
        descriptors = descs;
        return this;
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    {
        if (itemstack.itemID == OverworldItemHelper.realmiteHelmet.itemID || itemstack.itemID == OverworldItemHelper.realmiteBody.itemID || itemstack.itemID == OverworldItemHelper.realmiteBoots.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/real_1.png";

        if (itemstack.itemID == OverworldItemHelper.realmiteLegs.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/real_2.png";
        return Reference.MOD_ID + ":" + "/textures/armor/real_2.png";
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        if(itemID == OverworldItemHelper.realmiteHelmet.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Realmitehelmet");
        }
        if(itemID == OverworldItemHelper.realmiteBody.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Realmitebody");
        }
        if(itemID == OverworldItemHelper.realmiteLegs.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Realmitelegs");
        }
        if(itemID == OverworldItemHelper.realmiteBoots.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Realmiteboots");
        }	   
    }

    public void damageArmor(EntityLiving var1, ItemStack var2, DamageSource var3, int var4, int var5) {

        return;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        for (String desc : descriptors) {
            par3List.add(desc);
        }
    }
}
