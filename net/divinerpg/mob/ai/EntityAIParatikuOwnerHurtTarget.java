package net.divinerpg.mob.ai;

import net.divinerpg.mob.entity.EntityParatiku;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAITarget;

public class EntityAIParatikuOwnerHurtTarget extends EntityAITarget
{
    EntityParatiku theEntityTameable;
    EntityLivingBase theTarget;

    public EntityAIParatikuOwnerHurtTarget(EntityParatiku par1EntityTameable)
    {
        super(par1EntityTameable, false);
        this.theEntityTameable = par1EntityTameable;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    @Override
    public boolean shouldExecute()
    {
        if (!this.theEntityTameable.isTamed())
            return false;
        else
        {
            EntityLivingBase var1 = this.theEntityTameable.getOwner();

            if (var1 == null)
                return false;
            else
            {
                this.theTarget = var1.func_94060_bK();
                return this.isSuitableTarget(this.theTarget, false);
            }
        }
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    @Override
    public void startExecuting()
    {
        this.taskOwner.setAttackTarget(this.theTarget);
        super.startExecuting();
    }
}
