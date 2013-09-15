package net.divinerpg.item;

import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.lib.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemStack;

public class ItemMythrilArmor extends ItemDivineArmorBase{

	public ItemMythrilArmor(int itemID, EnumArmorMaterial material, int renderIndex, int armorType) {
		super(itemID, material, renderIndex, armorType);
	}
	
    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, int layer)
    {
        if (itemstack.itemID == TwilightItemHelper.MythrilHelmet.itemID || itemstack.itemID == TwilightItemHelper.MythrilChest.itemID || itemstack.itemID == TwilightItemHelper.MythrilBoots.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/mythril_1.png";

        if (itemstack.itemID == TwilightItemHelper.Mythrillegs.itemID)
            return Reference.MOD_ID + ":" + "/textures/armor/mythril_2.png";
        return Reference.MOD_ID + ":" + "/textures/armor/mythril_2.png";
    }
}
