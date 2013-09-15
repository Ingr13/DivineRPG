package net.divinerpg.mob.entity;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityAyeracoRed extends EntityAyeraco
{
    private EntityAyeraco aGreen;
    private EntityAyeraco aBlue;
    private EntityAyeraco aYellow;
    private EntityAyeraco aPurple;
    private int healTick;

    private int beamX;
    private int beamY;
    private int beamZ;

    public EntityAyeracoRed (World par1World)
    {
        super (par1World, "Red");
        this.healTick = 0;
    }
    @Override
    public void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.25); // Speed
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(48); // Attack
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(1000); // MaxHP
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
        if (this.healTick == 0)
        {
            if (this.aGreen != null && !this.aGreen.isDead)
            {
                aGreen.heal(1);
            }
            if (this.aBlue != null && !this.aBlue.isDead)
            {
                aBlue.heal(1);
            }
            if (this.aYellow != null && !this.aYellow.isDead)
            {
                aYellow.heal(1);
            }
            if (this.aPurple != null && !this.aPurple.isDead)
            {
                aPurple.heal(1);
            }
        }
        else
        {
            healTick--;
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
        this.dropItem(OverworldItemHelper.enderSwordRed.itemID, 1);
    }
}