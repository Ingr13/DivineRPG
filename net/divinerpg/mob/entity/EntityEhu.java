package net.divinerpg.mob.entity;

import net.divinerpg.helper.item.VetheaItemHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityEhu extends EntityTameable
{
    private float field_70926_e;
    private float field_70924_f;
    private boolean isShaking;
    private boolean field_70928_h;
    private float timeWolfIsShaking;
    private float prevTimeWolfIsShaking;

    public EntityEhu(World var1)
    {
        super(var1);
        this.setSize(0.6F, 0.8F);
        float moveSpeed = 0.6F;
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(1, new EntityAISwimming(this));
        this.tasks.addTask(2, this.aiSit);
        this.tasks.addTask(3, new EntityAILeapAtTarget(this, 0.4F));
        this.tasks.addTask(4, new EntityAIAttackOnCollide(this, moveSpeed, true));
        this.tasks.addTask(5, new EntityAIFollowOwner(this, moveSpeed, 10.0F, 2.0F));
        this.tasks.addTask(6, new EntityAIMate(this, moveSpeed));
        this.tasks.addTask(7, new EntityAIWander(this, moveSpeed));
        this.tasks.addTask(9, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(9, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIOwnerHurtByTarget(this));
        this.targetTasks.addTask(2, new EntityAIOwnerHurtTarget(this));
        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
    }

    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setAttribute(0.2); // speed
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setAttribute(200); // MaxHP
    }

    @Override
    public boolean isAIEnabled()
    {
        return true;
    }

    /**
     * Sets the active target the Task system uses for tracking
     */
    @Override
    public void setAttackTarget(EntityLivingBase var1)
    {
        super.setAttackTarget(var1);

        if (var1 instanceof EntityPlayer)
        {
            this.setAngry(true);
        }
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(19, new Byte((byte)0));
    }

    /**
     * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
     * prevent them from trampling crops
     */
    @Override
    protected boolean canTriggerWalking()
    {
        return false;
    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    @Override
    public void writeEntityToNBT(NBTTagCompound var1)
    {
        super.writeEntityToNBT(var1);
        var1.setBoolean("Angry", this.isAngry());
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    @Override
    public void readEntityFromNBT(NBTTagCompound var1)
    {
        super.readEntityFromNBT(var1);
        this.setAngry(var1.getBoolean("Angry"));
    }

    /**
     * Determines if an entity can be despawned, used on idle far away entities
     */
    @Override
    protected boolean canDespawn()
    {
        return this.isAngry();
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return "";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
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
     * Returns the volume for the sounds this mob makes.
     */
    @Override
    protected float getSoundVolume()
    {
        return 0.4F;
    }

    /**
     * Returns the item ID for the item the mob drops on death.
     */
    @Override
    protected int getDropItemId()
    {
        return -1;
    }

    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();

        if (!this.worldObj.isRemote && this.isShaking && !this.field_70928_h && !this.hasPath() && this.onGround)
        {
            this.field_70928_h = true;
            this.timeWolfIsShaking = 0.0F;
            this.prevTimeWolfIsShaking = 0.0F;
            this.worldObj.setEntityState(this, (byte)8);
        }
    }

    /**
     * Called to update the entity's position/logic.
     */
    @Override
    public void onUpdate()
    {
        super.onUpdate();
        this.field_70924_f = this.field_70926_e;

        if (this.func_70922_bv())
        {
            this.field_70926_e += (1.0F - this.field_70926_e) * 0.4F;
        }
        else
        {
            this.field_70926_e += (0.0F - this.field_70926_e) * 0.4F;
        }

        if (this.func_70922_bv())
        {
            this.numTicksToChaseTarget = 10;
        }

        if (this.isWet())
        {
            this.isShaking = true;
            this.field_70928_h = false;
            this.timeWolfIsShaking = 0.0F;
            this.prevTimeWolfIsShaking = 0.0F;
        }
        else if ((this.isShaking || this.field_70928_h) && this.field_70928_h)
        {
            if (this.timeWolfIsShaking == 0.0F)
            {
            }

            this.prevTimeWolfIsShaking = this.timeWolfIsShaking;
            this.timeWolfIsShaking += 0.05F;

            if (this.prevTimeWolfIsShaking >= 2.0F)
            {
                this.isShaking = false;
                this.field_70928_h = false;
                this.prevTimeWolfIsShaking = 0.0F;
                this.timeWolfIsShaking = 0.0F;
            }

            if (this.timeWolfIsShaking > 0.4F)
            {
                float var1 = (float)this.boundingBox.minY;
                int var2 = (int)(MathHelper.sin((this.timeWolfIsShaking - 0.4F) * (float)Math.PI) * 7.0F);

                for (int var3 = 0; var3 < var2; ++var3)
                {
                    float var4 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width * 0.5F;
                    float var5 = (this.rand.nextFloat() * 2.0F - 1.0F) * this.width * 0.5F;
                }
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public boolean getWolfShaking()
    {
        return this.isShaking;
    }

    @SideOnly(Side.CLIENT)
    public float getShadingWhileShaking(float var1)
    {
        return 0.75F + (this.prevTimeWolfIsShaking + (this.timeWolfIsShaking - this.prevTimeWolfIsShaking) * var1) / 2.0F * 0.25F;
    }

    @SideOnly(Side.CLIENT)
    public float getShakeAngle(float var1, float var2)
    {
        float var3 = (this.prevTimeWolfIsShaking + (this.timeWolfIsShaking - this.prevTimeWolfIsShaking) * var1 + var2) / 1.8F;

        if (var3 < 0.0F)
        {
            var3 = 0.0F;
        }
        else if (var3 > 1.0F)
        {
            var3 = 1.0F;
        }

        return MathHelper.sin(var3 * (float)Math.PI) * MathHelper.sin(var3 * (float)Math.PI * 11.0F) * 0.15F * (float)Math.PI;
    }

    @SideOnly(Side.CLIENT)
    public float getInterestedAngle(float var1)
    {
        return (this.field_70924_f + (this.field_70926_e - this.field_70924_f) * var1) * 0.15F * (float)Math.PI;
    }

    @Override
    public float getEyeHeight()
    {
        return this.height * 0.8F;
    }

    /**
     * The speed it takes to move the entityliving's rotationPitch through the faceEntity method. This is only currently
     * use in wolves.
     */
    @Override
    public int getVerticalFaceSpeed()
    {
        return this.isSitting() ? 20 : super.getVerticalFaceSpeed();
    }

    /**
     * Called when the entity is attacked.
     */
    public boolean attackEntityFrom(DamageSource var1, int var2)
    {
        Entity var3 = var1.getEntity();
        this.aiSit.setSitting(false);

        if (var3 != null && !(var3 instanceof EntityPlayer) && !(var3 instanceof EntityArrow))
        {
            var2 = (var2 + 1) / 2;
        }

        return super.attackEntityFrom(var1, var2);
    }

    @Override
    public boolean interact(EntityPlayer var1)
    {
        ItemStack var2 = var1.inventory.getCurrentItem();

        if (this.isTamed())
        {
            if (var2 != null && Item.itemsList[var2.itemID] instanceof ItemFood)
            {
                ItemFood var3 = (ItemFood)Item.itemsList[var2.itemID];

                if (var3.isWolfsFavoriteMeat() && this.dataWatcher.getWatchableObjectInt(18) < 200)
                {
                    if (!var1.capabilities.isCreativeMode)
                    {
                        --var2.stackSize;
                    }

                    this.heal(var3.getHealAmount());

                    if (var2.stackSize <= 0)
                    {
                        var1.inventory.setInventorySlotContents(var1.inventory.currentItem, (ItemStack)null);
                    }

                    return true;
                }
            }

            if (var1.username.equalsIgnoreCase(this.getOwnerName()) && !this.worldObj.isRemote && !this.isWheat(var2))
            {
                this.aiSit.setSitting(!this.isSitting());
                this.isJumping = false;
                this.setPathToEntity((PathEntity)null);
            }
        }
        else if (var2 != null && var2.itemID == VetheaItemHelper.honeysuckle.itemID && !this.isAngry())
        {
            if (!var1.capabilities.isCreativeMode)
            {
                --var2.stackSize;
            }

            if (var2.stackSize <= 0)
            {
                var1.inventory.setInventorySlotContents(var1.inventory.currentItem, (ItemStack)null);
            }

            if (!this.worldObj.isRemote)
            {
                if (this.rand.nextInt(3) == 0)
                {
                    this.setTamed(true);
                    this.setPathToEntity((PathEntity)null);
                    this.setAttackTarget((EntityLiving)null);
                    this.aiSit.setSitting(true);
                    this.setHealth(200);
                    this.setOwner(var1.username);
                    this.playTameEffect(true);
                    this.worldObj.setEntityState(this, (byte)7);
                }
                else
                {
                    this.playTameEffect(false);
                    this.worldObj.setEntityState(this, (byte)6);
                }
            }

            return true;
        }

        return super.interact(var1);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleHealthUpdate(byte var1)
    {
        if (var1 == 8)
        {
            this.field_70928_h = true;
            this.timeWolfIsShaking = 0.0F;
            this.prevTimeWolfIsShaking = 0.0F;
        }
        else
        {
            super.handleHealthUpdate(var1);
        }
    }

    @SideOnly(Side.CLIENT)
    public float getTailRotation()
    {
        return this.isAngry() ? 1.5393804F : (this.isTamed() ? (0.55F - (20 - this.dataWatcher.getWatchableObjectInt(18)) * 0.02F) * (float)Math.PI : ((float)Math.PI / 5F));
    }

    /**
     * Checks if the parameter is an wheat item.
     */
    public boolean isWheat(ItemStack var1)
    {
        return var1 == null ? false : (!(Item.itemsList[var1.itemID] instanceof ItemFood) ? false : ((ItemFood)Item.itemsList[var1.itemID]).isWolfsFavoriteMeat());
    }

    public boolean isAngry()
    {
        return (this.dataWatcher.getWatchableObjectByte(16) & 2) != 0;
    }

    public void setAngry(boolean var1)
    {
        byte var2 = this.dataWatcher.getWatchableObjectByte(16);

        if (var1)
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 | 2)));
        }
        else
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)(var2 & -3)));
        }
    }

    /**
     * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
     */
    public EntityAnimal spawnBabyAnimal(EntityAnimal var1)
    {
        EntityEhu var2 = new EntityEhu(this.worldObj);
        var2.setOwner(this.getOwnerName());
        var2.setTamed(true);
        return var2;
    }

    public void func_70918_i(boolean var1)
    {
        byte var2 = this.dataWatcher.getWatchableObjectByte(19);

        if (var1)
        {
            this.dataWatcher.updateObject(19, Byte.valueOf((byte)1));
        }
        else
        {
            this.dataWatcher.updateObject(19, Byte.valueOf((byte)0));
        }
    }

    /**
     * Returns true if the mob is currently able to mate with the specified mob.
     */
    @Override
    public boolean canMateWith(EntityAnimal var1)
    {
        if (var1 == this)
            return false;
        else if (!this.isTamed())
            return false;
        else if (!(var1 instanceof EntityEhu))
            return false;
        else
        {
            EntityEhu var2 = (EntityEhu)var1;
            return !var2.isTamed() ? false : (var2.isSitting() ? false : this.isInLove() && var2.isInLove());
        }
    }

    public boolean func_70922_bv()
    {
        return this.dataWatcher.getWatchableObjectByte(19) == 1;
    }

    /**
     * Checks if the entity's current position is a valid location to spawn this entity.
     */
    @Override
    public boolean getCanSpawnHere()
    {
        int var1 = MathHelper.floor_double(this.posX);
        int var2 = MathHelper.floor_double(this.boundingBox.minY);
        int var3 = MathHelper.floor_double(this.posZ);
        return this.getBlockPathWeight(var1, var2, var3) >= 0.0F && this.worldObj.checkNoEntityCollision(this.boundingBox) && this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox);
    }

    @Override
    public EntityAgeable createChild(EntityAgeable var1)
    {
        return null;
    }
}