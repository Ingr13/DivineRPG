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

public class ItemAquaticArmor extends ItemArmor implements ISpecialArmor{

    private String[] descriptors;
    private double damageReduction;

    public ItemAquaticArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
        super(par1, par2EnumArmorMaterial, par3, par4);			
    }

    public ItemAquaticArmor setDamageReduction(double reduc) {
        damageReduction = reduc;
        return this;
    }

    public ItemAquaticArmor setDescriptors(String[] descs) {
        descriptors = descs;
        return this;
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    {
        if (itemstack.itemID == OverworldItemHelper.aquaticHelmet.itemID || itemstack.itemID == OverworldItemHelper.aquaticBody.itemID || itemstack.itemID == OverworldItemHelper.aquaticBoots.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/aquastrive_1.png";

        if (itemstack.itemID == OverworldItemHelper.aquaticLegs.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/aquastrive_2.png";
        return Reference.MOD_ID + ":" + "/textures/armor/aquastrive_1.png";
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        if(itemID == OverworldItemHelper.aquaticHelmet.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:AquastriveHelmet");
        }
        if(itemID == OverworldItemHelper.aquaticBody.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:AquastriveBody");
        }
        if(itemID == OverworldItemHelper.aquaticLegs.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:AquastriveLegs");
        }
        if(itemID == OverworldItemHelper.aquaticBoots.itemID)
        {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:AquastriveBoots");
            //Directory: "/assets/divinerpg/textures/items/(.png files)" /divinerpg/ MUST be lowercase, change what you need to.
        }
    }


    public ArmorProperties getProperties(EntityLiving player, ItemStack armor, DamageSource source, double damage, int slot) {
        return new ISpecialArmor.ArmorProperties(0, damageReduction, 50000);
    }


    @Override
    public int getArmorDisplay(EntityPlayer var1, ItemStack var2, int var3) {

        return 0;
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
