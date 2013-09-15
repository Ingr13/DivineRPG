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
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEliteRealmiteArmor extends ItemArmor implements ISpecialArmor{

    private String[] descriptors;
    private double damageReduction;

    public ItemEliteRealmiteArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
        super(par1, par2EnumArmorMaterial, par3, par4);
    }

    public ItemEliteRealmiteArmor setDamageReduction(double reduc) {
        damageReduction = reduc;
        return this;
    }

    public ItemEliteRealmiteArmor setDescriptors(String[] descs) {
        descriptors = descs;
        return this;
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    {
        if (itemstack.itemID == OverworldItemHelper.eliteRealmiteHelmet.itemID || itemstack.itemID == OverworldItemHelper.eliteRealmiteBody.itemID || itemstack.itemID == OverworldItemHelper.eliteRealmiteBoots.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/eReal_1.png";

        if (itemstack.itemID == OverworldItemHelper.eliteRealmiteLegs.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/eReal_2.png";
        return Reference.MOD_ID + ":" + "/textures/armor/eReal_2.png";
    }

    @Override
    public void onArmorTickUpdate(World world, EntityPlayer var3, ItemStack itemStack) {

        if (var3.getCurrentItemOrArmor(4) != null && var3.getCurrentArmor(3) != null && var3.getCurrentItemOrArmor(2) != null && var3.getCurrentItemOrArmor(1) != null) {
            ItemStack helmet = var3.getCurrentItemOrArmor(4);
            ItemStack plate = var3.getCurrentItemOrArmor(3);
            ItemStack legs = var3.getCurrentItemOrArmor(2);
            ItemStack boots = var3.getCurrentItemOrArmor(1); 

            if (helmet.getItem() == OverworldItemHelper.eliteRealmiteHelmet && plate.getItem() == OverworldItemHelper.eliteRealmiteBody && legs.getItem() == OverworldItemHelper.eliteRealmiteLegs && boots.getItem() == OverworldItemHelper.eliteRealmiteBoots) 
            {
                var3.fallDistance = 0.0F;
            }
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        if(itemID == OverworldItemHelper.eliteRealmiteHelmet.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Eliterealmitehelmet");
        }
        if(itemID == OverworldItemHelper.eliteRealmiteBody.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Eliterealmitebody");
        }
        if(itemID == OverworldItemHelper.eliteRealmiteLegs.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Eliterealmitelegs");
        }
        if(itemID == OverworldItemHelper.eliteRealmiteBoots.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Eliterealmiteboots");
        }	   
    }


    public ArmorProperties getProperties(EntityLiving player, ItemStack armor, DamageSource source, double damage, int slot) {
        return new ISpecialArmor.ArmorProperties(0, damageReduction, 50000);
    }


    @Override
    public int getArmorDisplay(EntityPlayer var1, ItemStack var2, int var3) {

        return var3 != 0 && var3 != 2 ? (var3 == 1 ? 4 : 2) : 3;
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
