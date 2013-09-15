package net.divinerpg.item;

import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.lib.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemUviteArmor extends ItemDivineArmorBase{

	public ItemUviteArmor(int itemID, EnumArmorMaterial material, int renderIndex, int armorType) {
		super(itemID, material, renderIndex, armorType);
	}
	
    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    {
        if (itemstack.itemID == TwilightItemHelper.UviteHelmet.itemID || itemstack.itemID == TwilightItemHelper.UviteChest.itemID || itemstack.itemID == TwilightItemHelper.UviteBoots.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/uvite_1.png";

        if (itemstack.itemID == TwilightItemHelper.Uvitelegs.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/uvite_2.png";
        return Reference.MOD_ID + ":" + "/textures/armor/uvite_2.png";
    }
}
