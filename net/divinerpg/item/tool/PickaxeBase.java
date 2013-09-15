package net.divinerpg.item.tool;

import net.divinerpg.helper.TextureHelper;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PickaxeBase extends ItemPickaxe{

    private String iconPath;

    public PickaxeBase(int par1, EnumToolMaterial par3ENUM){
        super(par1, par3ENUM);
        setMaxStackSize(1);
    }

    public Item registerItemTexture(String texture) {
        iconPath = texture;
        return this;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        itemIcon = TextureHelper.getIconFromTextureName(iconRegister, iconPath);
    }
}
