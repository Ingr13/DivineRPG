package net.divinerpg.augite.block;

import java.util.Random;

import net.divinerpg.block.BlockBase;
import net.divinerpg.helper.block.TwilightBlockHelper;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class BlockAugiteGrass extends BlockBase
{


    public BlockAugiteGrass(int par1)
    {
        super(par1, Material.grass);
        this.setTickRandomly(true);
        this.registerTexture("AugiteGrass_Side", "AugiteGrass_Top", "AugiteGrass_Bottom");
    }

    @Override
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            if (par1World.getBlockLightValue(par2, par3 + 1, par4) < 4 && par1World.getBlockLightOpacity(par2, par3 + 1, par4) > 2)
            {
                par1World.setBlock(par2, par3, par4, TwilightBlockHelper.AugiteDirt.blockID);
            }
            else if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9)
            {
                for (int l = 0; l < 4; ++l)
                {
                    int i1 = par2 + par5Random.nextInt(3) - 1;
                    int j1 = par3 + par5Random.nextInt(5) - 3;
                    int k1 = par4 + par5Random.nextInt(3) - 1;
                    int l1 = par1World.getBlockId(i1, j1 + 1, k1);

                    if (par1World.getBlockId(i1, j1, k1) == TwilightBlockHelper.AugiteDirt.blockID && par1World.getBlockLightValue(i1, j1 + 1, k1) >= 4 && par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                    {
                        par1World.setBlock(i1, j1, k1, TwilightBlockHelper.AugiteGrass.blockID);
                    }
                }
            }
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    @Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return TwilightBlockHelper.AugiteDirt.idDropped(0, par2Random, par3);
    }
}
