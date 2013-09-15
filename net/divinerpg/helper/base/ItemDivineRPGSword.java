package net.divinerpg.helper.base;

import java.util.List;

import net.divinerpg.helper.TextureHelper;
import net.divinerpg.item.IItemDivineRPG;
import net.divinerpg.item.tool.SwordBase;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDivineRPGSword extends SwordBase implements IItemDivineRPG {
    private String iconPath;
    boolean unbreakable;
    float dmg;

    public ItemDivineRPGSword(int par1, EnumToolMaterial par2EnumToolMaterial) {
        this(par1, par2EnumToolMaterial, false);
    }

    public ItemDivineRPGSword(int par1, EnumToolMaterial enumToolMaterial, boolean unbreakable) {
        super(par1 - 256, enumToolMaterial);
        this.unbreakable = unbreakable;
        dmg = enumToolMaterial.getDamageVsEntity();
    }

    public ItemDivineRPGSword(int par1, int img, EnumToolMaterial par2EnumToolMaterial, boolean unbreakable) {
        super(par1 - 256, par2EnumToolMaterial);
        this.unbreakable = unbreakable;
        dmg = par2EnumToolMaterial.getDamageVsEntity();

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

    @Override
    public Icon getIconFromDamageForRenderPass(int par1, int par2) {
        return getIconFromDamage(par1);
    }

    @Override
    public boolean hitEntity(ItemStack item,
            EntityLivingBase entityLivingBase,
            EntityLivingBase entityLivingBase2) {
        if(!unbreakable) {
            item.damageItem(1, entityLivingBase2);
        }
        return true;
    }

    @Override
    public boolean onBlockDestroyed(ItemStack item, World world,
            int blockID, int x, int y, int z,
            EntityLivingBase entityLivingBase) {
        if (!unbreakable && Block.blocksList[blockID].getBlockHardness(world, x, y, z) != 0.0D) {
            item.damageItem(2, entityLivingBase);
        }

        return true;
    }

    @Override
    public boolean isItemTool(ItemStack par1ItemStack) {
        return true;
    }

    @Override
    public void addInformation(ItemStack item, EntityPlayer player, List infoList, boolean par4) {
        // infoList.add(item.getDamageVsEntity(player) + " Melee Damage");   TODO: Missing getDamageVsEntity - Find and reimplment the replacement if there is one.
        infoList.add(!unbreakable ? (item.getMaxDamage() - item.getItemDamage() + " Uses Remaining") : "Unlimited Uses");
    }
}
