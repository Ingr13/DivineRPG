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
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAngelicArmor extends ItemArmor{

    private String[] descriptors;
    private double damageReduction;
    
    public ItemAngelicArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
        super(par1, par2EnumArmorMaterial, par3, par4);
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    {
        if (itemstack.itemID == OverworldItemHelper.angelicHelmet.itemID || itemstack.itemID == OverworldItemHelper.angelicBody.itemID || itemstack.itemID == OverworldItemHelper.angelicBoots.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/angelic_1.png";

        if (itemstack.itemID == OverworldItemHelper.angelicLegs.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/angelic_2.png";
        return Reference.MOD_ID + ":" + "/textures/armor/angelic_2.png";
    }
    
    public ItemAngelicArmor setDescriptors(String[] descs) {
        descriptors = descs;
        return this;
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        if(itemID == OverworldItemHelper.angelicHelmet.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Angelichelmet");
        }
        if(itemID == OverworldItemHelper.angelicBody.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Angelicbody");
        }
        if(itemID == OverworldItemHelper.angelicLegs.itemID) {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Angeliclegs");
        }
        if(itemID == OverworldItemHelper.angelicBoots.itemID)
        {
            this.itemIcon = par1IconRegister.registerIcon("DivineRPG:Angelicboots");
            //Directory: "/assets/divinerpg/textures/items/(.png files)" /divinerpg/ MUST be lowercase, change what you need to.
        }
    }

    @Override
    public void onArmorTickUpdate(World var1, EntityPlayer var2, ItemStack var3) {

        if (var2.getCurrentItemOrArmor(4) != null && var2.getCurrentArmor(3) != null && var2.getCurrentItemOrArmor(2) != null && var2.getCurrentItemOrArmor(1) != null) {
            ItemStack helmet = var2.getCurrentItemOrArmor(4);
            ItemStack plate = var2.getCurrentItemOrArmor(3);
            ItemStack legs = var2.getCurrentItemOrArmor(2);
            ItemStack boots = var2.getCurrentItemOrArmor(1); 

            if (helmet.getItem() == OverworldItemHelper.angelicHelmet && plate.getItem() == OverworldItemHelper.angelicBody && legs.getItem() == OverworldItemHelper.angelicLegs && boots.getItem() == OverworldItemHelper.angelicBoots) 
            {
                var2.fallDistance = 0.0F;
            }
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
