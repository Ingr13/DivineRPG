package net.divinerpg.item;

import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.lib.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemAugiteArmor extends ItemDivineArmorBase{

	public ItemAugiteArmor(int itemID, EnumArmorMaterial material, int renderIndex, int armorType) {
		super(itemID, material, renderIndex, armorType);
	}
	
    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    {
        if (itemstack.itemID == TwilightItemHelper.AugiteHelmet.itemID || itemstack.itemID == TwilightItemHelper.AugiteChest.itemID || itemstack.itemID == TwilightItemHelper.AugiteBoots.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/augite_1.png";

        if (itemstack.itemID == TwilightItemHelper.Augitelegs.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/augite_2.png";
        return Reference.MOD_ID + ":" + "/textures/armor/augite_2.png";
    }
}
