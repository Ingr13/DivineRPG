package net.divinerpg.mob.entity;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EntityAyeracoBlue extends EntityAyeraco
{
    private EntityAyeraco aGreen;
    private EntityAyeraco aRed;
    private EntityAyeraco aYellow;
    private EntityAyeraco aPurple;

    private int beamX;
    private int beamY;
    private int beamZ;

    public EntityAyeracoBlue (World par1World)
    {
        super (par1World, "Blue");
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
    protected void tickAbility()
    {
        this.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
        if (this.aGreen != null && !this.aGreen.isDead)
        {
            aGreen.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
        }
        if (this.aYellow != null && !this.aYellow.isDead)
        {
            aYellow.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
        }
        if (this.aRed != null && !this.aRed.isDead)
        {
            aRed.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
        }
        if (this.aPurple != null && !this.aPurple.isDead)
        {
            aPurple.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 1, 2));
        }
    }

    @Override
    protected boolean canTeleport()
    {
        if (this.aPurple != null && this.aPurple.abilityActive())
            return true;
        return false;
    }

    @Override
    protected void dropRareDrop(int par1) 
    {
        this.dropItem(OverworldItemHelper.enderSwordBlue.itemID, 1);
    }
}