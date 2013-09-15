package net.divinerpg.vethea.block;

import java.util.ArrayList;
import java.util.Random;

import net.divinerpg.block.BlockBase;
import net.divinerpg.helper.block.VetheaBlockHelper;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class BlockKarosHeatTileGreen extends BlockBase
{
    private final boolean powered;
    public boolean override;

    public BlockKarosHeatTileGreen(int var1, boolean var2)
    {
        super(var1, Material.glass);
        this.powered = var2;
        this.override = false;
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    @Override
    public void onBlockAdded(World var1, int var2, int var3, int var4)
    {
        if (!var1.isRemote && !this.override)
        {
            if (this.powered && !var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
            {
                var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, 4);
            }
            else if (!this.powered && var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
            {
                var1.setBlock(var2, var3, var4, VetheaBlockHelper.karosHeatTileRed.blockID);
            }
        }
    }

    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    @Override
    public void onNeighborBlockChange(World var1, int var2, int var3, int var4, int var5)
    {
        if (!var1.isRemote && !this.override)
        {
            if (this.powered && !var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
            {
                var1.scheduleBlockUpdate(var2, var3, var4, this.blockID, 4);
            }
            else if (!this.powered && var1.isBlockIndirectlyGettingPowered(var2, var3, var4))
            {
                var1.setBlock(var2, var3, var4, VetheaBlockHelper.karosHeatTileRed.blockID);
            }
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    @Override
    public void updateTick(World var1, int var2, int var3, int var4, Random var5)
    {
        if (!var1.isRemote && this.powered && !var1.isBlockIndirectlyGettingPowered(var2, var3, var4) && !this.override)
        {
            var1.setBlock(var2, var3, var4, VetheaBlockHelper.karosHeatTileGreen.blockID);
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    @Override
    public int idDropped(int var1, Random var2, int var3)
    {
        return VetheaBlockHelper.karosHeatTileGreen.blockID;
    }

    @Override
    public void addCreativeItems(ArrayList par1)
    {
        par1.add(new ItemStack(this, 1));
    }
}