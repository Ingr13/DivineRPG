package net.divinerpg.vethea.block;

import java.util.Random;

import net.divinerpg.block.BlockBase;
import net.divinerpg.helper.block.VetheaBlockHelper;
import net.minecraft.block.material.Material;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockDreamgrass extends BlockBase
{
    private Icon[] texture;

    public BlockDreamgrass(int par1)
    {
        super(par1, Material.grass);
        this.setTickRandomly(true);
        this.registerTexture("DreamGrass_Side", "DreamGrass_Top", "DreamGrass_Bottom");
    }


    /**
     * Ticks the block if it's been scheduled
     */
    @Override
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (!par1World.isRemote)
        {
            if (par1World.getBlockLightValue(par2, par3 + 1, par4) < 4 && par1World.getBlockLightOpacity(par2, par3 + 1, par4) > 2)
            {
                par1World.setBlock(par2, par3, par4, VetheaBlockHelper.dreamdirt.blockID);
            }
            else if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9)
            {
                for (int var6 = 0; var6 < 4; ++var6)
                {
                    int var7 = par2 + par5Random.nextInt(3) - 1;
                    int var8 = par3 + par5Random.nextInt(5) - 3;
                    int var9 = par4 + par5Random.nextInt(3) - 1;
                    int var10 = par1World.getBlockId(var7, var8 + 1, var9);

                    if (par1World.getBlockId(var7, var8, var9) == VetheaBlockHelper.dreamdirt.blockID && par1World.getBlockLightValue(var7, var8 + 1, var9) >= 4 && par1World.getBlockLightOpacity(var7, var8 + 1, var9) <= 2)
                    {
                        par1World.setBlock(var7, var8, var9, VetheaBlockHelper.dreamgrass.blockID);
                    }
                }
            }
        }
    }
}