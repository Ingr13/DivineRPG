package net.divinerpg.mob.entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityHerbomancerMinion extends EntityLiving implements IMob
{
    public float field_70813_a;
    public float field_70811_b;
    public float field_70812_c;

    /** the time between each jump of the slime */
    private int slimeJumpDelay = 0;

    public EntityHerbomancerMinion(World par1World)
    {
        super(par1World);
        this.yOffset = 0.0F;
        this.slimeJumpDelay = this.rand.nextInt(20) + 10;
        this.setSize(1.0F, 1.0F);
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.25); // speed
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setAttribute(5); // Attack
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(10); // MaxHP
    }
    protected String getSlimeParticle()
    {
        return "slime";
    }

    /**
     * Returns the name of the sound played when the slime jumps.
     */
    protected String getJumpSound()
    {
        return "mob.slime.";
    }

    /**
     * Called to update the entity's position/logic.
     */
    @Override
    public void onUpdate()
    {
        if (!this.worldObj.isRemote && this.worldObj.difficultySetting == 0)
        {
            this.isDead = true;
        }

        this.field_70811_b += (this.field_70813_a - this.field_70811_b) * 0.5F;
        this.field_70812_c = this.field_70811_b;
        boolean var1 = this.onGround;
        super.onUpdate();
        int var2;

        if (this.onGround && !var1)
        {
            var2 = 1;

            for (int var3 = 0; var3 < var2 * 8; ++var3)
            {
                float var4 = this.rand.nextFloat() * (float)Math.PI * 2.0F;
                float var5 = this.rand.nextFloat() * 0.5F + 0.5F;
                float var6 = MathHelper.sin(var4) * var2 * 0.5F * var5;
                float var7 = MathHelper.cos(var4) * var2 * 0.5F * var5;
                this.worldObj.spawnParticle(this.getSlimeParticle(), this.posX + var6, this.boundingBox.minY, this.posZ + var7, 0.0D, 0.0D, 0.0D);
            }

            this.playSound(this.getJumpSound(), this.getSoundVolume(), ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F) / 0.8F);

            this.field_70813_a = -0.5F;
        }
        else if (!this.onGround && var1)
        {
            this.field_70813_a = 1.0F;
        }

        this.func_70808_l();

        if (this.worldObj.isRemote)
        {
            this.setSize(1.0F, 1.0F);
        }
    }

    @Override
    protected void updateEntityActionState()
    {
        this.despawnEntity();
        EntityPlayer var1 = this.worldObj.getClosestVulnerablePlayerToEntity(this, 32.0D);

        if (var1 != null)
        {
            this.faceEntity(var1, 10.0F, 20.0F);
        }

        if (this.onGround && this.slimeJumpDelay-- <= 0)
        {
            this.slimeJumpDelay = this.getJumpDelay();

            if (var1 != null)
            {
                this.slimeJumpDelay /= 3;
            }

            this.isJumping = true;

            this.playSound(this.getJumpSound(), this.getSoundVolume(), ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F) * 0.8F);

            this.moveStrafing = 1.0F - this.rand.nextFloat() * 2.0F;
            this.moveForward = (1);
        }
        else
        {
            this.isJumping = false;

            if (this.onGround)
            {
                this.moveStrafing = this.moveForward = 0.0F;
            }
        }
    }

    protected void func_70808_l()
    {
        this.field_70813_a *= 0.6F;
    }

    /**
     * Gets the amount of time the slime needs to wait between jumps.
     */
    protected int getJumpDelay()
    {
        return this.rand.nextInt(20) + 10;
    }

    /**
     * Called by a player entity when they collide with an entity
     */
    @Override
    public void onCollideWithPlayer(EntityPlayer par1EntityPlayer)
    {

        if (this.canEntityBeSeen(par1EntityPlayer) && this.getDistanceSqToEntity(par1EntityPlayer) < 1.0D && par1EntityPlayer.attackEntityFrom(DamageSource.causeMobDamage(this), 5))
        {
            this.playSound("mob.attack", 1.0F, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F);
        }
    }

    @Override
    protected String getHurtSound()
    {
        return "";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return "";
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    @Override
    protected int getDropItemId()
    {
        return 0;
    }
}