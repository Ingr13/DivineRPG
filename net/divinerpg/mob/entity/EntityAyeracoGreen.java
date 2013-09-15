package net.divinerpg.mob.entity;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityAyeracoGreen extends EntityAyeraco
{
    private EntityAyeraco aBlue;
    private EntityAyeraco aRed;
    private EntityAyeraco aYellow;
    private EntityAyeraco aPurple;

    private int beamX;
    private int beamY;
    private int beamZ;

    public EntityAyeracoGreen (World par1World)
    {
        super (par1World, "Green");
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
        return true;
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
        this.dropItem(OverworldItemHelper.enderSwordGreen.itemID, 1);
    }
}