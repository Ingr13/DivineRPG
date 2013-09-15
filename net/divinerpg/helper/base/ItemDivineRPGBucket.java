package net.divinerpg.helper.base;

import net.divinerpg.helper.TextureHelper;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBucket;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;



public class ItemDivineRPGBucket extends ItemBucket{

    private String iconPath;

    public ItemDivineRPGBucket(int par1, int par2) {
        super(par1, par2);
    }

    public Item registerTextures(String texture) {
        iconPath = texture;
        return this;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = TextureHelper.getIconFromTextureName(iconRegister, iconPath);
    }
}
