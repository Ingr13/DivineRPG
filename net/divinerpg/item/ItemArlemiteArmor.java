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

public class ItemArlemiteArmor extends ItemArmor{

    private String[] descriptors;
    private double damageReduction;

    public ItemArlemiteArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
        super(par1, par2EnumArmorMaterial, par3, par4);			
    }

    public ItemArlemiteArmor setDamageReduction(double reduc) {
        damageReduction = reduc;
        return this;
    }

    public ItemArlemiteArmor setDescriptors(String[] descs) {
        descriptors = descs;
        return this;
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    {
        if (itemstack.itemID == OverworldItemHelper.arlemiteHelmet.itemID || itemstack.itemID == OverworldItemHelper.arlemiteBody.itemID || itemstack.itemID == OverworldItemHelper.arlemiteBoots.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/arlemite_1.png";

        if (itemstack.itemID == OverworldItemHelper.arlemiteLegs.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/arlemite_2.png";
        return Reference.MOD_ID + ":" + "/textures/armor/arlemite_2.png";
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        if(itemID == OverworldItemHelper.arlemiteHelmet.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:arlemiteHelmet");
        }
        if(itemID == OverworldItemHelper.arlemiteBody.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:arlemiteBody");
        }
        if(itemID == OverworldItemHelper.arlemiteLegs.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:arlemiteLegs");
        }
        if(itemID == OverworldItemHelper.arlemiteBoots.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:arlemiteBoots");
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
