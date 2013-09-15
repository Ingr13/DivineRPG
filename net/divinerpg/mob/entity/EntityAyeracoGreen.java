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
    public void func_110147_ax()
    {
        super.func_110147_ax();
        this.func_110148_a(SharedMonsterAttributes.field_111263_d).func_111128_a(0.25); // Speed
        this.func_110148_a(SharedMonsterAttributes.field_111264_e).func_111128_a(48); // Attack
        this.func_110148_a(SharedMonsterAttributes.field_111267_a).func_111128_a(1000); // MaxHP
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