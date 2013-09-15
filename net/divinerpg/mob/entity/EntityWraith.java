package net.divinerpg.mob.entity;

import net.divinerpg.lib.Sound;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityWraith extends EntityParatiku
{
    private int age;
    private ChunkCoordinates currentFlightTarget;

    public EntityWraith(World par1World, EntityPlayer owner)
    {
        super(par1World);
        this.age = 120;
        this.setTamed(true);
        this.setOwner(owner.username);
    }

    public EntityWraith(World par1World)
    {
        super(par1World);
        this.age = 120;
    }

    @Override
    protected float getSoundVolume()
    {
        return 0.1F;
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
        return this.getIsBatHanging() && this.rand.nextInt(4) != 0 ? null : Sound.Wraith;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return Sound.WraithHit;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return Sound.WraithHit;
    }

    /**
     * Returns true if this entity should push and be pushed by other entities when colliding.
     */
    @Override
    public boolean canBePushed()
    {
        return false;
    }

    /**
     * Called to update the entity's position/logic.
     */
    @Override
    public void onUpdate()
    {
        super.onUpdate();

        if (this.getIsBatHanging())
        {
            this.motionX = this.motionY = this.motionZ = 0.0D;
            this.posY = MathHelper.floor_double(this.posY) + 1.0D - this.height;
        }
        else
        {
            this.motionY *= 0.6000000238418579D;
        }

        this.age--;
        if (this.age == 0)
        {
            this.setDead();
        }
    }

    @Override
    protected void updateAITasks()
    {
        super.updateAITasks();

        if (this.getAttackTarget() != null)
        {
            int var1 = (int) this.getAttackTarget().posX;
            int var2 = (int) this.getAttackTarget().posY;
            int var3 = (int) this.getAttackTarget().posZ;
            this.currentFlightTarget = new ChunkCoordinates(var1, var2, var3);
        }
        else if (this.getOwner() != null)
        {
            this.currentFlightTarget = this.worldObj.getPlayerEntityByName(this.getOwnerName()).getPlayerCoordinates();
        }

        if (this.getIsBatHanging())
        {
            if (!this.worldObj.isBlockNormalCube(MathHelper.floor_double(this.posX), (int)this.posY + 1, MathHelper.floor_double(this.posZ)))
            {
                this.setIsBatHanging(false);
                this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1015, (int)this.posX, (int)this.posY, (int)this.posZ, 0);
            }
            else
            {
                if (this.rand.nextInt(200) == 0)
                {
                    this.rotationYawHead = this.rand.nextInt(360);
                }

                if (this.worldObj.getClosestPlayerToEntity(this, 4.0D) != null)
                {
                    this.setIsBatHanging(false);
                    this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1015, (int)this.posX, (int)this.posY, (int)this.posZ, 0);
                }
            }
        }
        else
        {
            if (this.currentFlightTarget != null)
            {
                double var1 = this.currentFlightTarget.posX - this.posX;
                double var3 = this.currentFlightTarget.posY - this.posY;
                double var5 = this.currentFlightTarget.posZ - this.posZ;

                if (Math.signum(var1) != 0 || Math.signum(var3) != 0 || Math.signum(var5) != 0)
                {
                    this.motionX += (Math.signum(var1) * 0.5D - this.motionX) * 0.10000000149011612D;
                    this.motionY += (Math.signum(var3) * 1.699999988079071D - this.motionY) * 0.10000000149011612D;
                    this.motionZ += (Math.signum(var5) * 0.5D - this.motionZ) * 0.10000000149011612D;
                    float var7 = (float)(Math.atan2(this.motionZ, this.motionX) * 180.0D / Math.PI) - 90.0F;
                    float var8 = MathHelper.wrapAngleTo180_float(var7 - this.rotationYaw);
                    this.moveForward = 0.5F;
                    this.rotationYaw += var8;
                }
            }
        }
    }
}