package net.divinerpg.item;


import java.util.List;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemShadowArmor extends ItemArmor implements ISpecialArmor{

    private String[] descriptors;
    private double damageReduction;

    public ItemShadowArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
        super(par1, par2EnumArmorMaterial, par3, par4);			
    }

    public ItemShadowArmor setDamageReduction(double reduc) {
        damageReduction = reduc;
        return this;
    }

    public ItemShadowArmor setDescriptors(String[] descs) {
        descriptors = descs;
        return this;
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    {
        if (itemstack.itemID == OverworldItemHelper.shadowHelmet.itemID || itemstack.itemID == OverworldItemHelper.shadowBody.itemID || itemstack.itemID == OverworldItemHelper.shadowBoots.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/shadow_1.png";

        if (itemstack.itemID == OverworldItemHelper.shadowLegs.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/shadow_2.png";
        return Reference.MOD_ID + ":" + "/textures/armor/shadow_2.png";
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        if(itemID == OverworldItemHelper.shadowHelmet.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Shadowhelmet");
        }
        if(itemID == OverworldItemHelper.shadowBody.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Shadowbody");
        }
        if(itemID == OverworldItemHelper.shadowLegs.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Shadowlegs");
        }
        if(itemID == OverworldItemHelper.shadowBoots.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Shadowboots");
        }	    
    }


    public ArmorProperties getProperties(EntityLiving player, ItemStack armor, DamageSource source, double damage, int slot) {
        return new ISpecialArmor.ArmorProperties(0, damageReduction, 50000);
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

    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
        return 0;
    }

    @Override
    public ArmorProperties getProperties(EntityLivingBase player,
            ItemStack armor, DamageSource source, double damage, int slot) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack,
            DamageSource source, int damage, int slot) {
        // TODO Auto-generated method stub

    }
}
