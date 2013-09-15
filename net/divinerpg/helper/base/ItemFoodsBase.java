package net.divinerpg.helper.base;

import net.divinerpg.helper.TextureHelper;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFoodsBase extends ItemFood
{
    private String iconPath;

    public ItemFoodsBase(int id, int foodReplenished, boolean foodForAnimals) {
        super(id, foodReplenished, foodForAnimals);

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
