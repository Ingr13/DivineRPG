package net.divinerpg.mob.entity;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.village.Village;
import net.minecraft.world.World;

public class EntityAncient extends EntityMob
{
    private int field_48119_b = 0;
    Village villageObj = null;
    private int field_48120_c;
    private int field_48118_d;

    public EntityAncient(World var1)
    {
        super(var1);
        this.setSize(4.0F, 9.0F);
        this.isImmuneToFire = true;
    }

    @Override
    protected void func_110147_ax()
    {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.5); // speed
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(16); // Attack
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(4000); // MaxHP
    }

    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, new Integer(100));
    }
    
    @Override
    public String getEntityName()
    {
        return "The Ancient Entity";
    }

    public int getDragonHealth()
    {
        return (int) this.func_110138_aP();
    }

    @Override
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
    }


    /**
     * Called when the entity is attacked.
     */
    @Override
    public boolean attackEntityAsMob(Entity par1Entity)
    {
        super.attackEntityAsMob(par1Entity);

        if (this.entityToAttack != null)
        {
            this.entityToAttack.addVelocity(this.motionX * 10.0D, 3.0D, this.motionZ * 10.0D);
            if(this.entityToAttack instanceof EntityLiving)
            {
                ((EntityLiving)this.entityToAttack).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 5 * 20, 0));
            }
            return true;
        }

        return false;
    }
    /**
     * Decrements the entity's air supply when underwater
     */
    @Override
    protected int decreaseAirSupply(int var1)
    {
        return var1;
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return "none";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return "mob.irongolem.hit";
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return "mob.irongolem.death";
    }

    /**
     * Drop 0-2 items of this living's type
     */
    @Override
    protected void dropFewItems(boolean var1, int var2)
    {
        int var4 = 1;
        int var5;

        var4 = 3 + this.rand.nextInt(4);

        for (var5 = 0; var5 < var4; ++var5)
        {
            this.dropItem(OverworldItemHelper.divineShard.itemID, 7);
        }
    }

    /**
     * knocks back this entity
     */
    public void knockBack(Entity par1Entity, int par2, double par3, double par5)
    {
    }
}
