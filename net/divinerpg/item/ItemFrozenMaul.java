package net.divinerpg.item;

import java.util.List;

import net.divinerpg.helper.base.ItemDivineRPGSword;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.EnumHelper;

public class ItemFrozenMaul extends ItemDivineRPGSword {

    private static final EnumToolMaterial material =  EnumHelper.addToolMaterial("frozenMaul", 1, -1, 1.5F, 30, 16);

    public ItemFrozenMaul(int par1) {
        super(par1, material, true);
    }

    @Override
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLiving, EntityLivingBase par3EntityLiving) {
        par3EntityLiving.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 40, 1));
        return super.hitEntity(par1ItemStack, par2EntityLiving, par3EntityLiving);
    }

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
        super.addInformation(par1ItemStack, par2EntityPlayer, par3List, par4);
        par3List.add("Slows Target on Hit");
    }
}