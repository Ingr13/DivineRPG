package net.divinerpg.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.EnumToolMaterial;
import net.minecraftforge.common.EnumHelper;

public class ItemVetheanHammerSword extends ItemVetheanSword
{
    private int weaponDamage;
    public static EnumToolMaterial enumz = EnumHelper.addToolMaterial("enumz", 0, -1, 0, 1, 22);

    public ItemVetheanHammerSword(int i, String name, int damage)
    {
        super(i, enumz);
        this.setUnlocalizedName(name);
        this.weaponDamage = damage;
    }

    /**
     * Returns the damage against a given entity.
     */
    public int getDamageVsEntity(Entity par1)
    {
        return this.weaponDamage;
    }
}
