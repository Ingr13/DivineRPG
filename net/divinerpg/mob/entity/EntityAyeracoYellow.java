package net.divinerpg.mob.entity;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EntityAyeracoYellow extends EntityAyeraco
{
    private EntityAyeraco aGreen;
    private EntityAyeraco aBlue;
    private EntityAyeraco aRed;
    private EntityAyeraco aPurple;

    private int beamX;
    private int beamY;
    private int beamZ;

    public EntityAyeracoYellow (World par1World)
    {
        super (par1World, "Yellow");
    }

    @Override
    public void func_110147_ax()
    {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.25); // Speed
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(48); // Attack
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(1000); // MaxHP
    }

    @Override
    protected boolean canBlockProjectiles()
    {
        if (this.aGreen != null && this.aGreen.abilityActive())
            return true;
        return false;
    }

    @Override
    protected boolean canTeleport()
    {
        if (this.aPurple != null && this.aPurple.abilityActive())
            return true;
        return false;
    }

    @Override
    protected void tickAbility()
    {
        this.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1, 1));
        if (this.aGreen != null && !this.aGreen.isDead)
        {
            aGreen.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1, 1));
        }
        if (this.aBlue != null && !this.aBlue.isDead)
        {
            aBlue.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1, 1));
        }
        if (this.aRed != null && !this.aRed.isDead)
        {
            aRed.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1, 1));
        }
        if (this.aPurple != null && !this.aPurple.isDead)
        {
            aPurple.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1, 1));
        }
    }

    @Override
    protected void dropRareDrop(int par1) 
    {
        this.dropItem(OverworldItemHelper.enderSwordYellow.itemID, 1);
    }
}
