package net.divinerpg.item;


import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemRupeeArmor extends ItemArmor{

    private String[] descriptors;
    private double damageReduction;

    public ItemRupeeArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
        super(par1, par2EnumArmorMaterial, par3, par4);			
    }

    public ItemRupeeArmor setDamageReduction(double reduc) {
        damageReduction = reduc;
        return this;
    }

    public ItemRupeeArmor setDescriptors(String[] descs) {
        descriptors = descs;
        return this;
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    {
        if (itemstack.itemID == OverworldItemHelper.rupeeHelmet.itemID || itemstack.itemID == OverworldItemHelper.rupeeBody.itemID || itemstack.itemID == OverworldItemHelper.rupeeBoots.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/rupee_1.png";

        if (itemstack.itemID == OverworldItemHelper.rupeeLegs.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/rupee_2.png";
        return Reference.MOD_ID + ":" + "/textures/armor/rupee_2.png";
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        if(itemID == OverworldItemHelper.rupeeHelmet.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Rupeehelmet");
        }
        if(itemID == OverworldItemHelper.rupeeBody.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Rupeebody");
        }
        if(itemID == OverworldItemHelper.rupeeLegs.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Rupeelegs");
        }
        if(itemID == OverworldItemHelper.rupeeBoots.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Rupeeboots");
        }
    }

    public void damageArmor(EntityLiving var1, ItemStack var2, DamageSource var3, int var4, int var5) {

        return;
    }
}
