package net.divinerpg.item;

import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.lib.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemDraviteArmor extends ItemDivineArmorBase{

	public ItemDraviteArmor(int itemID, EnumArmorMaterial material, int renderIndex, int armorType) {
		super(itemID, material, renderIndex, armorType);
	}
	
    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    {
        if (itemstack.itemID == TwilightItemHelper.DraviteHelmet.itemID || itemstack.itemID == TwilightItemHelper.DraviteChest.itemID || itemstack.itemID == TwilightItemHelper.DraviteBoots.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/dravite_1.png";

        if (itemstack.itemID == TwilightItemHelper.Dravitelegs.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/dravite_2.png";
        return Reference.MOD_ID + ":" + "/textures/armor/dravite_2.png";
    }
}
