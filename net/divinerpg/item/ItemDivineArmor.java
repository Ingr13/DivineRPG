package net.divinerpg.item;

import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.lib.Reference;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDivineArmor extends ItemDivineArmorBase{

	public ItemDivineArmor(int itemID, EnumArmorMaterial material, int renderIndex, int armorType) {
		super(itemID, material, renderIndex, armorType);
	}

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    {
        if (itemstack.itemID == TwilightItemHelper.divineHelmet.itemID || itemstack.itemID == TwilightItemHelper.divineBody.itemID || itemstack.itemID == TwilightItemHelper.divineBoots.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/divine_1.png";
        
        if (itemstack.itemID == TwilightItemHelper.divineLegs.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/divine_2.png";
        return Reference.MOD_ID + ":" + "/textures/armor/divine_2.png";
    }	
}
