package net.divinerpg.mob.entity;

import net.divinerpg.lib.Sound;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntitySpinebackWorm extends EntityMob
{
    public boolean attack;

    public EntitySpinebackWorm(World var1)
    {
        super(var1);
        this.setSize(2F, 2F);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIAttackOnCollide(this, 0.56D, true));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 32.0F));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.tasks.addTask(6, new EntityAIWander(this, 0.56D));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, false));
        this.targetTasks.addTask(2, new EntityAIHurtByTarget(this, true));
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.15); // Speed
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(1); // Attack
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(1); // MaxHP
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setAttribute(128.0); // FollowRange
    }

    @Override
    protected boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Gets the pitch of living sounds in living entities.
     */
    @Override
    protected float getSoundPitch()
    {
        return super.getSoundPitch() * 0.95F;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return this.rand.nextInt(4) != 0 ? null : Sound.AlicantoHit;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return Sound.AlicantoHit;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return Sound.AlicantoHit;
    }

    /**
     * Called to update the entity's position/logic.
     */
    @Override
    public void onUpdate()
    {
        super.onUpdate();
    }

    @Override
    protected void updateAITasks()
    {
        super.updateAITasks();
    }

    @Override
    protected boolean canTriggerWalking()
    {
        return false;
    }

    @Override
    public boolean doesEntityNotTriggerPressurePlate()
    {
        return true;
    }

    @Override
    public boolean attackEntityAsMob(Entity par1Entity)
    {
        this.attack = false;
        return super.attackEntityAsMob(par1Entity);
    }
}