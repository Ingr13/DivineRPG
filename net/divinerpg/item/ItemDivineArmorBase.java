package net.divinerpg.item;

import java.util.List;

import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.common.ISpecialArmor.ArmorProperties;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;




/**
 * Base Armor class, other DivineRPG armor should extend this class.
 * This will make it easier to add new armor and increase consistency between armor files.
 * 
 * We will need to build upon this in order to maximize it's usage.
 * 
 * Maz, i added a few changes.
 * 
 * @author Mazetar
 * @author Brock
 */
public class ItemDivineArmorBase extends ItemArmor implements ISpecialArmor{

    private String[] descriptors;
	private double damageReduction;

    public ItemDivineArmorBase(int itemID, EnumArmorMaterial material, int renderIndex, int armorType) {
        super(itemID, material, renderIndex, armorType);

    }
    
    public ItemDivineArmorBase setDamageReduction(double reduction) {
		damageReduction = reduction;
		return this;
	}

	public ArmorProperties getProperties(EntityLiving var1, ItemStack var2, DamageSource var3, double var4, int var6)
	{
		return new ISpecialArmor.ArmorProperties(0, damageReduction, 50000);
	}


    public void setDescriptors (String[] desc) {
        descriptors = desc;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
    }	 	
    
    @Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		//for (String desc : descriptors)
		//	par3List.add(desc);
	}

	@Override
	public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot) {
		return null;
	}

	@Override
	public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) 
	{
		return;
	}

	@Override
	public int getArmorDisplay(EntityPlayer var1, ItemStack var2, int var3) 
	{
		return var3 != 0 && var3 != 2 ? (var3 == 1 ? 4 : 2) : 3;
	}
}
