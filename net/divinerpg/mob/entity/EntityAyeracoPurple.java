package net.divinerpg.mob.entity;

import net.divinerpg.helper.item.OverworldItemHelper;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityAyeracoPurple extends EntityAyeraco
{
    private EntityAyeraco aGreen;
    private EntityAyeraco aBlue;
    private EntityAyeraco aRed;
    private EntityAyeraco aYellow;

    private int beamX;
    private int beamY;
    private int beamZ;

    public EntityAyeracoPurple (World par1World)
    {
        super (par1World, "Purple");
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
        if (this.aGreen != null && this.aGreen.abilityActive())
            return true;
        return false;
    }

    @Override
    protected boolean canTeleport()
    {
        return true;
    }

    @Override
    protected void dropRareDrop(int par1) 
    {
        this.dropItem(OverworldItemHelper.enderSword.itemID, 1);
    }
}