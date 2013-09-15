package net.divinerpg.mob.entity;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.mob.entity.item.EntityMamormeterShot;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityKingOfScorchers extends EntityMob implements IBossDisplayData, IRangedAttackMob
{
    private int special;

	public EntityKingOfScorchers(World var1)
    {
        super(var1);
        double moveSpeed = 0.56D;
        this.setSize(2.0F, 3.9F);
        this.tasks.addTask(4, new EntityAIArrowAttack(this, moveSpeed, 3, 10));
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(5, new EntityAIWander(this, moveSpeed));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(6, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
        this.special = 0;
    }
    
	@Override
    public void func_110147_ax()
    {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.25); // Speed
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(30); // Attack
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(6000); // MaxHP
    }
	
	@Override
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Integer(100));
		this.dataWatcher.addObject(13, new Byte((byte)0));
    }
	
    protected void updateAITasks()
    {
    	if (this.rand.nextInt(250) == 0 && this.special == 0)
    	{
    		this.special = 25;
    	}
    	
    	if (this.special > 0 && this.getAttackTarget() != null)
    	{
    		this.special--;
    		if (this.special % 5 == 0)
    		{
    			EntityMamormeterShot var1 = new EntityMamormeterShot(this.worldObj, (double)this.getAttackTarget().posX, (double)this.getAttackTarget().posY + 10, (double)this.getAttackTarget().posZ, true);
    			var1.setVelocity(0, -0.5, 0);
                this.worldObj.spawnEntityInWorld(var1);
    		}
    	}
    	else
    	{
        	super.updateAITasks();
    	}
    }

    public boolean isAIEnabled()
    {
        return true;
    }

    public int getTotalArmorValue()
    {
        return 10;
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    public void onLivingUpdate()
    {
        if (this.worldObj.isDaytime() && !this.worldObj.isRemote)
        {
            float var1 = this.getBrightness(1.0F);

            if (var1 > 0.5F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.rand.nextFloat() * 30.0F < (var1 - 0.4F) * 2.0F)
            {
                this.setFire(8);
            }
        }

        super.onLivingUpdate();
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "mob.kingScorcher";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected String getHurtSound()
    {
        return "mob.kingScorcherHit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected String getDeathSound()
    {
        return null;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected int getDropItemId()
    {
        return OverworldItemHelper.furyFire.itemID;
    }

    public void dropFewItems(boolean par1, int par2)
    {
        int var1 = this.rand.nextInt(4);
        this.dropItem(this.getDropItemId(), 1);
        this.dropItem(OverworldItemHelper.blueFireStone.itemID, 7);
		
		if (this.rand.nextInt(3) == 0)
		{
			//this.dropItem(OverworldBlockHelper.kosStatue.blockID, 1);
		}
    }

    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEFINED;
    }

	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase entityliving, float f) 
	{
		EntityArrow var3 = new EntityArrow(this.worldObj, this, entityliving, 1.6F, (float)(14 - this.worldObj.difficultySetting * 4));
        this.worldObj.playSoundAtEntity(this, "random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(var3);
        var3.setFire(100);
		
	}
}
