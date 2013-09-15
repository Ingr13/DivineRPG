/*
 *** MADE BY MITHION'S .SCHEMATIC TO JAVA CONVERTING TOOL v1.6 ***
 */

package net.divinerpg.overworld.gen;
import java.util.Random;

import net.divinerpg.helper.block.OverworldBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenSpawner extends WorldGenerator
{
    protected int[] GetValidSpawnBlocks() {
        return new int[] {
                Block.stone.blockID
        };
    }

    public boolean LocationIsValidSpawn(World world, int i, int j, int k){
        int distanceToAir = 0;
        int checkID = world.getBlockId(i, j, k);

        while (checkID != 0){
            distanceToAir++;
            checkID = world.getBlockId(i, j + distanceToAir, k);
        }

        if (distanceToAir > 3)
            return false;
        j += distanceToAir - 1;

        int blockID = world.getBlockId(i, j, k);
        int blockIDAbove = world.getBlockId(i, j+1, k);
        int blockIDBelow = world.getBlockId(i, j-1, k);
        for (int x : GetValidSpawnBlocks()){
            if (blockIDAbove != 0)
                return false;
            if (blockID == x)
                return true;
            else if (blockID == Block.snow.blockID && blockIDBelow == x)
                return true;
        }
        return false;
    }

    public WorldGenSpawner() { }

    @Override
    public boolean generate(World world, Random rand, int i, int j, int k) {

        if(!LocationIsValidSpawn(world, i, j, k) || !LocationIsValidSpawn(world, i + 6, j, k) || !LocationIsValidSpawn(world, i + 6, j, k + 6) || !LocationIsValidSpawn(world, i, j, k + 6))
            return false;

        world.setBlock(i + 0, j + 0, k + 0, Block.stone.blockID);
        world.setBlock(i + 0, j + 0, k + 1, Block.stone.blockID);
        world.setBlock(i + 0, j + 0, k + 2, Block.stone.blockID);
        world.setBlock(i + 0, j + 0, k + 3, Block.stone.blockID);
        world.setBlock(i + 0, j + 0, k + 4, Block.stone.blockID);
        world.setBlock(i + 0, j + 0, k + 5, Block.stone.blockID);
        world.setBlock(i + 0, j + 0, k + 6, Block.stone.blockID);
        world.setBlock(i + 0, j + 1, k + 0, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 0, j + 1, k + 1, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 0, j + 1, k + 2, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 0, j + 1, k + 3, Block.cobblestone.blockID);
        world.setBlock(i + 0, j + 1, k + 4, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 0, j + 1, k + 5, Block.cobblestone.blockID);
        world.setBlock(i + 0, j + 1, k + 6, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 0, j + 2, k + 0, 0);
        world.setBlock(i + 0, j + 2, k + 1, 0);
        world.setBlock(i + 0, j + 2, k + 2, 0);
        world.setBlock(i + 0, j + 2, k + 3, Block.cobblestone.blockID);
        world.setBlock(i + 0, j + 2, k + 4, Block.cobblestone.blockID);
        world.setBlock(i + 0, j + 2, k + 5, Block.cobblestone.blockID);
        world.setBlock(i + 0, j + 2, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 0, j + 3, k + 0, 0);
        world.setBlock(i + 0, j + 3, k + 1, 0);
        world.setBlock(i + 0, j + 3, k + 2, 0);
        world.setBlock(i + 0, j + 3, k + 3, Block.cobblestone.blockID);
        world.setBlock(i + 0, j + 3, k + 4, Block.cobblestone.blockID);
        world.setBlock(i + 0, j + 3, k + 5, Block.cobblestone.blockID);
        world.setBlock(i + 0, j + 3, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 0, j + 4, k + 0, 0);
        world.setBlock(i + 0, j + 4, k + 1, 0);
        world.setBlock(i + 0, j + 4, k + 2, 0);
        world.setBlock(i + 0, j + 4, k + 3, Block.cobblestone.blockID);
        world.setBlock(i + 0, j + 4, k + 4, Block.cobblestone.blockID);
        world.setBlock(i + 0, j + 4, k + 5, Block.cobblestone.blockID);
        world.setBlock(i + 0, j + 4, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 0, j + 5, k + 0, 0);
        world.setBlock(i + 0, j + 5, k + 1, 0);
        world.setBlock(i + 0, j + 5, k + 2, 0);
        world.setBlock(i + 0, j + 5, k + 3, Block.cobblestone.blockID);
        world.setBlock(i + 0, j + 5, k + 4, Block.cobblestone.blockID);
        world.setBlock(i + 0, j + 5, k + 5, Block.cobblestone.blockID);
        world.setBlock(i + 0, j + 5, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 1, j + 0, k + 0, Block.stone.blockID);
        world.setBlock(i + 1, j + 0, k + 1, Block.stone.blockID);
        world.setBlock(i + 1, j + 0, k + 2, Block.stone.blockID);
        world.setBlock(i + 1, j + 0, k + 3, Block.stone.blockID);
        world.setBlock(i + 1, j + 0, k + 4, Block.stone.blockID);
        world.setBlock(i + 1, j + 0, k + 5, Block.stone.blockID);
        world.setBlock(i + 1, j + 0, k + 6, Block.stone.blockID);
        world.setBlock(i + 1, j + 1, k + 0, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 1, j + 1, k + 1, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 1, j + 1, k + 2, Block.cobblestone.blockID);
        world.setBlock(i + 1, j + 1, k + 3, Block.cobblestone.blockID);
        world.setBlock(i + 1, j + 1, k + 4, Block.cobblestone.blockID);
        world.setBlock(i + 1, j + 1, k + 5, Block.cobblestone.blockID);
        world.setBlock(i + 1, j + 1, k + 6, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 1, j + 2, k + 0, 0);
        world.setBlock(i + 1, j + 2, k + 1, 0);
        world.setBlock(i + 1, j + 2, k + 2, 0);
        world.setBlock(i + 1, j + 2, k + 3, 0);
        world.setBlock(i + 1, j + 2, k + 4, 0);
        world.setBlock(i + 1, j + 2, k + 5, 0);
        world.setBlock(i + 1, j + 2, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 1, j + 3, k + 0, 0);
        world.setBlock(i + 1, j + 3, k + 1, 0);
        world.setBlock(i + 1, j + 3, k + 2, 0);
        world.setBlock(i + 1, j + 3, k + 3, 0);
        world.setBlock(i + 1, j + 3, k + 4, 0);
        world.setBlock(i + 1, j + 3, k + 5, 0);
        world.setBlock(i + 1, j + 3, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 1, j + 4, k + 0, 0);
        world.setBlock(i + 1, j + 4, k + 1, 0);
        world.setBlock(i + 1, j + 4, k + 2, 0);
        world.setBlock(i + 1, j + 4, k + 3, 0);
        world.setBlock(i + 1, j + 4, k + 4, 0);
        world.setBlock(i + 1, j + 4, k + 5, 0);
        world.setBlock(i + 1, j + 4, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 1, j + 5, k + 0, 0);
        world.setBlock(i + 1, j + 5, k + 1, 0);
        world.setBlock(i + 1, j + 5, k + 2, 0);
        world.setBlock(i + 1, j + 5, k + 3, 0);
        world.setBlock(i + 1, j + 5, k + 4, 0);
        world.setBlock(i + 1, j + 5, k + 5, 0);
        world.setBlock(i + 1, j + 5, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 2, j + 0, k + 0, Block.stone.blockID);
        world.setBlock(i + 2, j + 0, k + 1, Block.stone.blockID);
        world.setBlock(i + 2, j + 0, k + 2, Block.stone.blockID);
        world.setBlock(i + 2, j + 0, k + 3, Block.stone.blockID);
        world.setBlock(i + 2, j + 0, k + 4, Block.stone.blockID);
        world.setBlock(i + 2, j + 0, k + 5, Block.stone.blockID);
        world.setBlock(i + 2, j + 0, k + 6, Block.stone.blockID);
        world.setBlock(i + 2, j + 1, k + 0, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 2, j + 1, k + 1, Block.cobblestone.blockID);
        world.setBlock(i + 2, j + 1, k + 2, Block.cobblestone.blockID);
        world.setBlock(i + 2, j + 1, k + 3, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 2, j + 1, k + 4, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 2, j + 1, k + 5, Block.cobblestone.blockID);
        world.setBlock(i + 2, j + 1, k + 6, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 2, j + 2, k + 0, 0);
        world.setBlock(i + 2, j + 2, k + 1, 0);
        world.setBlock(i + 2, j + 2, k + 2, 0);
        world.setBlock(i + 2, j + 2, k + 3, 0);
        world.setBlock(i + 2, j + 2, k + 4, 0);
        world.setBlock(i + 2, j + 2, k + 5, 0);
        world.setBlock(i + 2, j + 2, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 2, j + 3, k + 0, 0);
        world.setBlock(i + 2, j + 3, k + 1, 0);
        world.setBlock(i + 2, j + 3, k + 2, 0);
        world.setBlock(i + 2, j + 3, k + 3, 0);
        world.setBlock(i + 2, j + 3, k + 4, 0);
        world.setBlock(i + 2, j + 3, k + 5, 0);
        world.setBlock(i + 2, j + 3, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 2, j + 4, k + 0, 0);
        world.setBlock(i + 2, j + 4, k + 1, 0);
        world.setBlock(i + 2, j + 4, k + 2, 0);
        world.setBlock(i + 2, j + 4, k + 3, 0);
        world.setBlock(i + 2, j + 4, k + 4, 0);
        world.setBlock(i + 2, j + 4, k + 5, 0);
        world.setBlock(i + 2, j + 4, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 2, j + 5, k + 0, 0);
        world.setBlock(i + 2, j + 5, k + 1, 0);
        world.setBlock(i + 2, j + 5, k + 2, 0);
        world.setBlock(i + 2, j + 5, k + 3, 0);
        world.setBlock(i + 2, j + 5, k + 4, 0);
        world.setBlock(i + 2, j + 5, k + 5, 0);
        world.setBlock(i + 2, j + 5, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 3, j + 0, k + 0, Block.stone.blockID);
        world.setBlock(i + 3, j + 0, k + 1, Block.stone.blockID);
        world.setBlock(i + 3, j + 0, k + 2, Block.stone.blockID);
        world.setBlock(i + 3, j + 0, k + 3, Block.stone.blockID);
        world.setBlock(i + 3, j + 0, k + 4, Block.stone.blockID);
        world.setBlock(i + 3, j + 0, k + 5, Block.stone.blockID);
        world.setBlock(i + 3, j + 0, k + 6, Block.stone.blockID);
        world.setBlock(i + 3, j + 1, k + 0, Block.cobblestone.blockID);
        world.setBlock(i + 3, j + 1, k + 1, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 3, j + 1, k + 2, Block.cobblestone.blockID);
        world.setBlock(i + 3, j + 1, k + 3, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 3, j + 1, k + 4, Block.cobblestone.blockID);
        world.setBlock(i + 3, j + 1, k + 5, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 3, j + 1, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 3, j + 2, k + 0, Block.cobblestone.blockID);
        world.setBlock(i + 3, j + 2, k + 1, 0);
        world.setBlock(i + 3, j + 2, k + 2, 0);
        world.setBlock(i + 3, j + 2, k + 3, OverworldBlockHelper.spawner1.blockID);
        world.setBlock(i + 3, j + 2, k + 4, 0);
        world.setBlock(i + 3, j + 2, k + 5, 0);
        world.setBlock(i + 3, j + 2, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 3, j + 3, k + 0, Block.cobblestone.blockID);
        world.setBlock(i + 3, j + 3, k + 1, 0);
        world.setBlock(i + 3, j + 3, k + 2, 0);
        world.setBlock(i + 3, j + 3, k + 3, 0);
        world.setBlock(i + 3, j + 3, k + 4, 0);
        world.setBlock(i + 3, j + 3, k + 5, 0);
        world.setBlock(i + 3, j + 3, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 3, j + 4, k + 0, Block.cobblestone.blockID);
        world.setBlock(i + 3, j + 4, k + 1, 0);
        world.setBlock(i + 3, j + 4, k + 2, 0);
        world.setBlock(i + 3, j + 4, k + 3, 0);
        world.setBlock(i + 3, j + 4, k + 4, 0);
        world.setBlock(i + 3, j + 4, k + 5, 0);
        world.setBlock(i + 3, j + 4, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 3, j + 5, k + 0, Block.cobblestone.blockID);
        world.setBlock(i + 3, j + 5, k + 1, 0);
        world.setBlock(i + 3, j + 5, k + 2, 0);
        world.setBlock(i + 3, j + 5, k + 3, 0);
        world.setBlock(i + 3, j + 5, k + 4, 0);
        world.setBlock(i + 3, j + 5, k + 5, 0);
        world.setBlock(i + 3, j + 5, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 4, j + 0, k + 0, Block.stone.blockID);
        world.setBlock(i + 4, j + 0, k + 1, Block.stone.blockID);
        world.setBlock(i + 4, j + 0, k + 2, Block.stone.blockID);
        world.setBlock(i + 4, j + 0, k + 3, Block.stone.blockID);
        world.setBlock(i + 4, j + 0, k + 4, Block.stone.blockID);
        world.setBlock(i + 4, j + 0, k + 5, Block.stone.blockID);
        world.setBlock(i + 4, j + 0, k + 6, Block.stone.blockID);
        world.setBlock(i + 4, j + 1, k + 0, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 4, j + 1, k + 1, Block.cobblestone.blockID);
        world.setBlock(i + 4, j + 1, k + 2, Block.cobblestone.blockID);
        world.setBlock(i + 4, j + 1, k + 3, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 4, j + 1, k + 4, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 4, j + 1, k + 5, Block.cobblestone.blockID);
        world.setBlock(i + 4, j + 1, k + 6, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 4, j + 2, k + 0, Block.cobblestone.blockID);
        world.setBlock(i + 4, j + 2, k + 1, 0);
        world.setBlock(i + 4, j + 2, k + 2, 0);
        world.setBlock(i + 4, j + 2, k + 3, 0);
        world.setBlock(i + 4, j + 2, k + 4, 0);
        world.setBlock(i + 4, j + 2, k + 5, 0);
        world.setBlock(i + 4, j + 2, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 4, j + 3, k + 0, Block.cobblestone.blockID);
        world.setBlock(i + 4, j + 3, k + 1, 0);
        world.setBlock(i + 4, j + 3, k + 2, 0);
        world.setBlock(i + 4, j + 3, k + 3, 0);
        world.setBlock(i + 4, j + 3, k + 4, 0);
        world.setBlock(i + 4, j + 3, k + 5, 0);
        world.setBlock(i + 4, j + 3, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 4, j + 4, k + 0, Block.cobblestone.blockID);
        world.setBlock(i + 4, j + 4, k + 1, 0);
        world.setBlock(i + 4, j + 4, k + 2, 0);
        world.setBlock(i + 4, j + 4, k + 3, 0);
        world.setBlock(i + 4, j + 4, k + 4, 0);
        world.setBlock(i + 4, j + 4, k + 5, 0);
        world.setBlock(i + 4, j + 4, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 4, j + 5, k + 0, Block.cobblestone.blockID);
        world.setBlock(i + 4, j + 5, k + 1, 0);
        world.setBlock(i + 4, j + 5, k + 2, 0);
        world.setBlock(i + 4, j + 5, k + 3, 0);
        world.setBlock(i + 4, j + 5, k + 4, 0);
        world.setBlock(i + 4, j + 5, k + 5, 0);
        world.setBlock(i + 4, j + 5, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 5, j + 0, k + 0, Block.stone.blockID);
        world.setBlock(i + 5, j + 0, k + 1, Block.stone.blockID);
        world.setBlock(i + 5, j + 0, k + 2, Block.stone.blockID);
        world.setBlock(i + 5, j + 0, k + 3, Block.stone.blockID);
        world.setBlock(i + 5, j + 0, k + 4, Block.stone.blockID);
        world.setBlock(i + 5, j + 0, k + 5, Block.stone.blockID);
        world.setBlock(i + 5, j + 0, k + 6, Block.stone.blockID);
        world.setBlock(i + 5, j + 1, k + 0, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 5, j + 1, k + 1, Block.cobblestone.blockID);
        world.setBlock(i + 5, j + 1, k + 2, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 5, j + 1, k + 3, Block.cobblestone.blockID);
        world.setBlock(i + 5, j + 1, k + 4, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 5, j + 1, k + 5, Block.cobblestone.blockID);
        world.setBlock(i + 5, j + 1, k + 6, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 5, j + 2, k + 0, Block.cobblestone.blockID);
        world.setBlock(i + 5, j + 2, k + 1, Block.chest.blockID);
        world.setBlock(i + 5, j + 2, k + 2, 0);
        world.setBlock(i + 5, j + 2, k + 3, 0);
        world.setBlock(i + 5, j + 2, k + 4, 0);
        world.setBlock(i + 5, j + 2, k + 5, Block.chest.blockID);
        world.setBlock(i + 5, j + 2, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 5, j + 3, k + 0, Block.cobblestone.blockID);
        world.setBlock(i + 5, j + 3, k + 1, 0);
        world.setBlock(i + 5, j + 3, k + 2, 0);
        world.setBlock(i + 5, j + 3, k + 3, 0);
        world.setBlock(i + 5, j + 3, k + 4, 0);
        world.setBlock(i + 5, j + 3, k + 5, 0);
        world.setBlock(i + 5, j + 3, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 5, j + 4, k + 0, Block.cobblestone.blockID);
        world.setBlock(i + 5, j + 4, k + 1, 0);
        world.setBlock(i + 5, j + 4, k + 2, 0);
        world.setBlock(i + 5, j + 4, k + 3, 0);
        world.setBlock(i + 5, j + 4, k + 4, 0);
        world.setBlock(i + 5, j + 4, k + 5, 0);
        world.setBlock(i + 5, j + 4, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 5, j + 5, k + 0, Block.cobblestone.blockID);
        world.setBlock(i + 5, j + 5, k + 1, 0);
        world.setBlock(i + 5, j + 5, k + 2, 0);
        world.setBlock(i + 5, j + 5, k + 3, 0);
        world.setBlock(i + 5, j + 5, k + 4, 0);
        world.setBlock(i + 5, j + 5, k + 5, 0);
        world.setBlock(i + 5, j + 5, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 0, k + 0, Block.stone.blockID);
        world.setBlock(i + 6, j + 0, k + 1, Block.stone.blockID);
        world.setBlock(i + 6, j + 0, k + 2, Block.stone.blockID);
        world.setBlock(i + 6, j + 0, k + 3, Block.stone.blockID);
        world.setBlock(i + 6, j + 0, k + 4, Block.stone.blockID);
        world.setBlock(i + 6, j + 0, k + 5, Block.stone.blockID);
        world.setBlock(i + 6, j + 0, k + 6, Block.stone.blockID);
        world.setBlock(i + 6, j + 1, k + 0, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 6, j + 1, k + 1, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 6, j + 1, k + 2, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 6, j + 1, k + 3, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 6, j + 1, k + 4, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 1, k + 5, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 6, j + 1, k + 6, OverworldBlockHelper.divineStoneMossy.blockID);
        world.setBlock(i + 6, j + 2, k + 0, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 2, k + 1, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 2, k + 2, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 2, k + 3, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 2, k + 4, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 2, k + 5, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 2, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 3, k + 0, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 3, k + 1, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 3, k + 2, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 3, k + 3, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 3, k + 4, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 3, k + 5, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 3, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 4, k + 0, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 4, k + 1, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 4, k + 2, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 4, k + 3, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 4, k + 4, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 4, k + 5, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 4, k + 6, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 5, k + 0, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 5, k + 1, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 5, k + 2, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 5, k + 3, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 5, k + 4, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 5, k + 5, Block.cobblestone.blockID);
        world.setBlock(i + 6, j + 5, k + 6, Block.cobblestone.blockID);

        return true;
    }
}