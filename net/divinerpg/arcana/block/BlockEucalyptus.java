package net.divinerpg.arcana.block;

import java.util.ArrayList;

import net.divinerpg.block.BlockBase;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class BlockEucalyptus extends BlockBase
{
    public BlockEucalyptus(int var1, int var2)
    {
        super(var1, Material.wood);
    }

    /**
     * Returns the block texture based on the side being looked at.  Args: side

    public int getBlockTextureFromSide(int var1)
    {
        switch (var1)
        {
            case 0:
                return 94;

            case 1:
                return 94;

            case 2:
                return 93;

            case 3:
                return 93;

            case 4:
                return 93;

            default:
                return 93;
        }
    } */

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    @Override
    public int damageDropped(int var1)
    {
        return var1;
    }

    @Override
    public void addCreativeItems(ArrayList var1)
    {
        var1.add(new ItemStack(this, 1));
    }
}
