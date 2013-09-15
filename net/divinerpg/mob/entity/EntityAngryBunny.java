package net.divinerpg.mob.entity;

import net.divinerpg.lib.Sound;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityAngryBunny extends EntityMob
{
	public EntityAngryBunny(World var1)
	{
		super(var1);
		float moveSpeed = 0.5F;
		this.setSize(1F, 1.5F);
		this.experienceValue = 40;
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(1, new EntityAISwimming(this));
		this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
		tasks.addTask(4, new EntityAIAttackOnCollide(this,  0.56D, true));
		this.tasks.addTask(7, new EntityAIWander(this, moveSpeed));
		this.tasks.addTask(9, new EntityAILookIdle(this));
		this.targetTasks.addTask(1, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	}

	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.56); // Speed
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(18); // Attack
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(60.0D);
	}


	@Override
	protected boolean isAIEnabled()
	{
		return true;
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
	}

	@Override
	protected String getLivingSound()
	{
		return Sound.Hiss;
	}

	/**
	 * Returns the sound this mob makes when it is hurt.
	 */
	@Override
	protected String getHurtSound()
	{
		return Sound.GrowlHit;
	}

	/**
	 * Returns the sound this mob makes on death.
	 */
	@Override
	protected String getDeathSound()
	{
		return Sound.GrowlHit;
	}
}
