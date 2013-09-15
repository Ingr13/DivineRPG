package net.divinerpg.item;

import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.lib.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemAzuriteArmor extends ItemDivineArmorBase{

	public ItemAzuriteArmor(int itemID, EnumArmorMaterial material, int renderIndex, int armorType) {
		super(itemID, material, renderIndex, armorType);
	}
	
    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    {
        if (itemstack.itemID == TwilightItemHelper.AzuriteHelmet.itemID || itemstack.itemID == TwilightItemHelper.AzuriteChest.itemID || itemstack.itemID == TwilightItemHelper.AzuriteBoots.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/azurite_1.png";

        if (itemstack.itemID == TwilightItemHelper.Azuritelegs.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/azurite_2.png";
        return Reference.MOD_ID + ":" + "/textures/armor/azurite_2.png";
    }
}
