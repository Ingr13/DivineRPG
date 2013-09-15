package net.divinerpg.mob.entity;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.lib.Sound;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityJungleDramcryx extends EntityMob
{
    public EntityJungleDramcryx(World par1World)
    {
        super(par1World);        
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.7); // speed
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(19); // Attack
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(100); // MaxHP
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    @Override
    protected String getLivingSound()
    {
        return Sound.Dramcryx;
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    @Override
    protected String getHurtSound()
    {
        return Sound.DramcryxHurt;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    @Override
    protected String getDeathSound()
    {
        return Sound.DramcryxHurt;
    }



    /**
     * Returns the item ID for the item the mob drops on death.
     */
    @Override
    protected int getDropItemId()
    {
        return OverworldItemHelper.jungleShard.itemID;
    }

}
