package net.divinerpg.augite.gen;

import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.NETHER_BRIDGE;
import static net.minecraftforge.event.terraingen.InitMapGenEvent.EventType.NETHER_CAVE;

import java.util.List;
import java.util.Random;

import net.divinerpg.dravite.gen.WorldGenTwilightMineable;
import net.divinerpg.helper.block.TwilightBlockHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenCavesHell;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.structure.MapGenNetherBridge;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event.Result;
import net.minecraftforge.event.terraingen.ChunkProviderEvent;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class ChunkProviderDense implements IChunkProvider
{
    private Random hellRNG;

    /** A NoiseGeneratorOctaves used in generating nether terrain */
    private NoiseGeneratorOctaves netherNoiseGen1;
    private NoiseGeneratorOctaves netherNoiseGen2;
    private NoiseGeneratorOctaves netherNoiseGen3;

    /** Determines whether slowsand or gravel can be generated at a location */
    private NoiseGeneratorOctaves slowsandGravelNoiseGen;

    /**
     * Determines whether something other than nettherack can be generated at a location
     */
    private NoiseGeneratorOctaves netherrackExculsivityNoiseGen;
    public NoiseGeneratorOctaves netherNoiseGen6;
    public NoiseGeneratorOctaves netherNoiseGen7;

    /** Is the world that the nether is getting generated. */
    private World worldObj;
    private double[] noiseField;
    public MapGenNetherBridge genNetherBridge = new MapGenNetherBridge();

    /**
     * Holds the noise used to determine whether slowsand can be generated at a location
     */
    private double[] slowsandNoise = new double[256];
    private double[] gravelNoise = new double[256];

    /**
     * Holds the noise used to determine whether something other than netherrack can be generated at a location
     */
    private double[] netherrackExclusivityNoise = new double[256];
    private MapGenBase netherCaveGenerator = new MapGenCavesHell();
    double[] noiseData1;
    double[] noiseData2;
    double[] noiseData3;
    double[] noiseData4;
    double[] noiseData5;

    {
        genNetherBridge = (MapGenNetherBridge) TerrainGen.getModdedMapGen(genNetherBridge, NETHER_BRIDGE);
        netherCaveGenerator = TerrainGen.getModdedMapGen(netherCaveGenerator, NETHER_CAVE);
    }

    public ChunkProviderDense(World par1World, long par2)
    {
        this.worldObj = par1World;
        this.hellRNG = new Random(par2);
        this.netherNoiseGen1 = new NoiseGeneratorOctaves(this.hellRNG, 16);
        this.netherNoiseGen2 = new NoiseGeneratorOctaves(this.hellRNG, 16);
        this.netherNoiseGen3 = new NoiseGeneratorOctaves(this.hellRNG, 8);
        this.slowsandGravelNoiseGen = new NoiseGeneratorOctaves(this.hellRNG, 4);
        this.netherrackExculsivityNoiseGen = new NoiseGeneratorOctaves(this.hellRNG, 4);
        this.netherNoiseGen6 = new NoiseGeneratorOctaves(this.hellRNG, 10);
        this.netherNoiseGen7 = new NoiseGeneratorOctaves(this.hellRNG, 16);

        NoiseGeneratorOctaves[] noiseGens = {netherNoiseGen1, netherNoiseGen2, netherNoiseGen3, slowsandGravelNoiseGen, netherrackExculsivityNoiseGen, netherNoiseGen6, netherNoiseGen7};
        noiseGens = TerrainGen.getModdedNoiseGenerators(par1World, this.hellRNG, noiseGens);
        this.netherNoiseGen1 = noiseGens[0];
        this.netherNoiseGen2 = noiseGens[1];
        this.netherNoiseGen3 = noiseGens[2];
        this.slowsandGravelNoiseGen = noiseGens[3];
        this.netherrackExculsivityNoiseGen = noiseGens[4];
        this.netherNoiseGen6 = noiseGens[5];
        this.netherNoiseGen7 = noiseGens[6];
    }

    /**
     * Generates the shape of the terrain in the nether.
     */
    public void generateNetherTerrain(int par1, int par2, byte[] par3ArrayOfByte)
    {
        byte b0 = 4;
        byte b1 = 32;
        int k = b0 + 1;
        byte b2 = 17;
        int l = b0 + 1;
        this.noiseField = this.initializeNoiseField(this.noiseField, par1 * b0, 0, par2 * b0, k, b2, l);

        for (int i1 = 0; i1 < b0; ++i1)
        {
            for (int j1 = 0; j1 < b0; ++j1)
            {
                for (int k1 = 0; k1 < 16; ++k1)
                {
                    double d0 = 0.125D;
                    double d1 = this.noiseField[((i1 + 0) * l + j1 + 0) * b2 + k1 + 0];
                    double d2 = this.noiseField[((i1 + 0) * l + j1 + 1) * b2 + k1 + 0];
                    double d3 = this.noiseField[((i1 + 1) * l + j1 + 0) * b2 + k1 + 0];
                    double d4 = this.noiseField[((i1 + 1) * l + j1 + 1) * b2 + k1 + 0];
                    double d5 = (this.noiseField[((i1 + 0) * l + j1 + 0) * b2 + k1 + 1] - d1) * d0;
                    double d6 = (this.noiseField[((i1 + 0) * l + j1 + 1) * b2 + k1 + 1] - d2) * d0;
                    double d7 = (this.noiseField[((i1 + 1) * l + j1 + 0) * b2 + k1 + 1] - d3) * d0;
                    double d8 = (this.noiseField[((i1 + 1) * l + j1 + 1) * b2 + k1 + 1] - d4) * d0;

                    for (int l1 = 0; l1 < 8; ++l1)
                    {
                        double d9 = 0.25D;
                        double d10 = d1;
                        double d11 = d2;
                        double d12 = (d3 - d1) * d9;
                        double d13 = (d4 - d2) * d9;

                        for (int i2 = 0; i2 < 4; ++i2)
                        {
                            int j2 = i2 + i1 * 4 << 11 | 0 + j1 * 4 << 7 | k1 * 8 + l1;
                            short short1 = 128;
                            double d14 = 0.25D;
                            double d15 = d10;
                            double d16 = (d11 - d10) * d14;

                            for (int k2 = 0; k2 < 4; ++k2)
                            {
                                int l2 = 0;

                                if (d15 > 0.0D)
                                {
                                    l2 = TwilightBlockHelper.AugiteGrass.blockID;
                                }

                                par3ArrayOfByte[j2] = (byte)l2;
                                j2 += short1;
                                d15 += d16;
                            }

                            d10 += d12;
                            d11 += d13;
                        }

                        d1 += d5;
                        d2 += d6;
                        d3 += d7;
                        d4 += d8;
                    }
                }
            }
        }
    }

    /**
     * name based on ChunkProviderGenerate
     */
    public void replaceBlocksForBiome(int par1, int par2, byte[] par3ArrayOfByte)
    {
        ChunkProviderEvent.ReplaceBiomeBlocks event = new ChunkProviderEvent.ReplaceBiomeBlocks(this, par1, par2, par3ArrayOfByte, null);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.getResult() == Result.DENY) return;

        byte b0 = 64;
        double d0 = 0.03125D;
        this.slowsandNoise = this.slowsandGravelNoiseGen.generateNoiseOctaves(this.slowsandNoise, par1 * 16, par2 * 16, 0, 16, 16, 1, d0, d0, 1.0D);
        this.gravelNoise = this.slowsandGravelNoiseGen.generateNoiseOctaves(this.gravelNoise, par1 * 16, 109, par2 * 16, 16, 1, 16, d0, 1.0D, d0);
        this.netherrackExclusivityNoise = this.netherrackExculsivityNoiseGen.generateNoiseOctaves(this.netherrackExclusivityNoise, par1 * 16, par2 * 16, 0, 16, 16, 1, d0 * 2.0D, d0 * 2.0D, d0 * 2.0D);

        for (int k = 0; k < 16; ++k)
        {
            for (int l = 0; l < 16; ++l)
            {
                boolean flag = this.slowsandNoise[k + l * 16] + this.hellRNG.nextDouble() * 0.2D > 0.0D;
                boolean flag1 = this.gravelNoise[k + l * 16] + this.hellRNG.nextDouble() * 0.2D > 0.0D;
                int i1 = (int)(this.netherrackExclusivityNoise[k + l * 16] / 3.0D + 3.0D + this.hellRNG.nextDouble() * 0.25D);
                int j1 = -1;
                byte b1 = (byte)TwilightBlockHelper.AugiteGrass.blockID;
                byte b2 = (byte)TwilightBlockHelper.AugiteGrass.blockID;

                for (int k1 = 127; k1 >= 0; --k1)
                {
                    int l1 = (l * 16 + k) * 128 + k1;

                    if (k1 < 127 - this.hellRNG.nextInt(5) && k1 > 0 + this.hellRNG.nextInt(5))
                    {
                        byte b3 = par3ArrayOfByte[l1];

                        if (b3 == 0)
                        {
                            j1 = -1;
                        }
                        else if (b3 == TwilightBlockHelper.AugiteGrass.blockID)
                        {
                            if (j1 == -1)
                            {
                                if (i1 <= 0)
                                {
                                    b1 = 0;
                                    b2 = (byte)TwilightBlockHelper.AugiteGrass.blockID;
                                }
                                else if (k1 >= b0 - 4 && k1 <= b0 + 1)
                                {
                                    b1 = (byte)TwilightBlockHelper.AugiteGrass.blockID;
                                    b2 = (byte)TwilightBlockHelper.AugiteGrass.blockID;

                                    if (flag1)
                                    {
                                        b1 = (byte)TwilightBlockHelper.twilightStone.blockID;
                                    }

                                    if (flag1)
                                    {
                                        b2 = (byte)TwilightBlockHelper.twilightStone.blockID;
                                    }

                                    if (flag)
                                    {
                                        b1 = (byte)TwilightBlockHelper.twilightStone.blockID;
                                    }

                                    if (flag)
                                    {
                                        b2 = (byte)TwilightBlockHelper.twilightStone.blockID;
                                    }
                                }

                                if (k1 < b0 && b1 == 0)
                                {
                                    b1 = (byte)Block.waterStill.blockID;
                                }

                                j1 = i1;

                                if (k1 >= b0 - 1)
                                {
                                    par3ArrayOfByte[l1] = b1;
                                }
                                else
                                {
                                    par3ArrayOfByte[l1] = b2;
                                }
                            }
                            else if (j1 > 0)
                            {
                                --j1;
                                par3ArrayOfByte[l1] = b2;
                            }
                        }
                    }
                    else
                    {
                        par3ArrayOfByte[l1] = (byte)Block.bedrock.blockID;
                    }
                }
            }
        }
    }

    /**
     * loads or generates the chunk at the chunk location specified
     */
    @Override
    public Chunk loadChunk(int par1, int par2)
    {
        return this.provideChunk(par1, par2);
    }

    /**
     * Will return back a chunk, if it doesn't exist and its not a MP client it will generates all the blocks for the
     * specified chunk from the map seed and chunk seed
     */
    @Override
    public Chunk provideChunk(int par1, int par2)
    {
        this.hellRNG.setSeed(par1 * 341873128712L + par2 * 132897987541L);
        byte[] var3 = new byte[32768];
        this.generateNetherTerrain(par1, par2, var3);
        this.replaceBlocksForBiome(par1, par2, var3);
        this.netherCaveGenerator.generate(this, this.worldObj, par1, par2, var3);
        this.genNetherBridge.generate(this, this.worldObj, par1, par2, var3);
        Chunk var4 = new Chunk(this.worldObj, var3, par1, par2);
        BiomeGenBase[] var5 = this.worldObj.getWorldChunkManager().loadBlockGeneratorData((BiomeGenBase[])null, par1 * 16, par2 * 16, 16, 16);
        byte[] var6 = var4.getBiomeArray();

        for (int var7 = 0; var7 < var6.length; ++var7)
        {
            var6[var7] = (byte)var5[var7].biomeID;
        }

        var4.resetRelightChecks();
        return var4;
    }

    /**
     * generates a subset of the level's terrain data. Takes 7 arguments: the [empty] noise array, the position, and the
     * size.
     */
    private double[] initializeNoiseField(double[] par1ArrayOfDouble, int par2, int par3, int par4, int par5, int par6, int par7)
    {
        ChunkProviderEvent.InitNoiseField event = new ChunkProviderEvent.InitNoiseField(this, par1ArrayOfDouble, par2, par3, par4, par5, par6, par7);
        MinecraftForge.EVENT_BUS.post(event);
        if (event.getResult() == Result.DENY) return event.noisefield;
        if (par1ArrayOfDouble == null)
        {
            par1ArrayOfDouble = new double[par5 * par6 * par7];
        }

        double var8 = 684.412D;
        double var10 = 2053.236D;
        this.noiseData4 = this.netherNoiseGen6.generateNoiseOctaves(this.noiseData4, par2, par3, par4, par5, 1, par7, 1.0D, 0.0D, 1.0D);
        this.noiseData5 = this.netherNoiseGen7.generateNoiseOctaves(this.noiseData5, par2, par3, par4, par5, 1, par7, 100.0D, 0.0D, 100.0D);
        this.noiseData1 = this.netherNoiseGen3.generateNoiseOctaves(this.noiseData1, par2, par3, par4, par5, par6, par7, var8 / 80.0D, var10 / 60.0D, var8 / 80.0D);
        this.noiseData2 = this.netherNoiseGen1.generateNoiseOctaves(this.noiseData2, par2, par3, par4, par5, par6, par7, var8, var10, var8);
        this.noiseData3 = this.netherNoiseGen2.generateNoiseOctaves(this.noiseData3, par2, par3, par4, par5, par6, par7, var8, var10, var8);
        int var12 = 0;
        int var13 = 0;
        double[] var14 = new double[par6];
        int var15;

        for (var15 = 0; var15 < par6; ++var15)
        {
            var14[var15] = Math.cos(var15 * Math.PI * 6.0D / par6) * 2.0D;
            double var16 = var15;

            if (var15 > par6 / 2)
            {
                var16 = par6 - 1 - var15;
            }

            if (var16 < 4.0D)
            {
                var16 = 4.0D - var16;
                var14[var15] -= var16 * var16 * var16 * 10.0D;
            }
        }

        for (var15 = 0; var15 < par5; ++var15)
        {
            for (int var36 = 0; var36 < par7; ++var36)
            {
                double var17 = (this.noiseData4[var13] + 256.0D) / 512.0D;

                if (var17 > 1.0D)
                {
                    var17 = 1.0D;
                }

                double var19 = 0.0D;
                double var21 = this.noiseData5[var13] / 8000.0D;

                if (var21 < 0.0D)
                {
                    var21 = -var21;
                }

                var21 = var21 * 3.0D - 3.0D;

                if (var21 < 0.0D)
                {
                    var21 /= 2.0D;

                    if (var21 < -1.0D)
                    {
                        var21 = -1.0D;
                    }

                    var21 /= 1.4D;
                    var21 /= 2.0D;
                    var17 = 0.0D;
                }
                else
                {
                    if (var21 > 1.0D)
                    {
                        var21 = 1.0D;
                    }

                    var21 /= 6.0D;
                }

                var17 += 0.5D;
                var21 = var21 * par6 / 16.0D;
                ++var13;

                for (int var23 = 0; var23 < par6; ++var23)
                {
                    double var24 = 0.0D;
                    double var26 = var14[var23];
                    double var28 = this.noiseData2[var12] / 512.0D;
                    double var30 = this.noiseData3[var12] / 512.0D;
                    double var32 = (this.noiseData1[var12] / 10.0D + 1.0D) / 2.0D;

                    if (var32 < 0.0D)
                    {
                        var24 = var28;
                    }
                    else if (var32 > 1.0D)
                    {
                        var24 = var30;
                    }
                    else
                    {
                        var24 = var28 + (var30 - var28) * var32;
                    }

                    var24 -= var26;
                    double var34;

                    if (var23 > par6 - 4)
                    {
                        var34 = (var23 - (par6 - 4)) / 3.0F;
                        var24 = var24 * (1.0D - var34) + -10.0D * var34;
                    }

                    if (var23 < var19)
                    {
                        var34 = (var19 - var23) / 4.0D;

                        if (var34 < 0.0D)
                        {
                            var34 = 0.0D;
                        }

                        if (var34 > 1.0D)
                        {
                            var34 = 1.0D;
                        }

                        var24 = var24 * (1.0D - var34) + -10.0D * var34;
                    }

                    par1ArrayOfDouble[var12] = var24;
                    ++var12;
                }
            }
        }

        return par1ArrayOfDouble;
    }

    /**
     * Checks to see if a chunk exists at x, y
     */
    @Override
    public boolean chunkExists(int par1, int par2)
    {
        return true;
    }

    /**
     * Populates chunk with ores etc etc
     */
    @Override
    public void populate(IChunkProvider par1IChunkProvider, int par2, int par3)
    {
        BlockSand.fallInstantly = true;

        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Pre(par1IChunkProvider, worldObj, hellRNG, par2, par3, false));

        int var4 = par2 * 16;
        int var5 = par3 * 16;int var13;
        int var14;
        int var15;
        int var16;

        for (var13 = 0; var13 < 2; ++var13)
        {
            var14 = var4 + this.hellRNG.nextInt(16);
            var15 = this.hellRNG.nextInt(128);
            var16 = var5 + this.hellRNG.nextInt(16);
            (new WorldGenAugiteStone(50)).generate(this.worldObj, this.hellRNG, var14, var15, var16);
            (new WorldGenTwilightMineable(TwilightBlockHelper.augiteOre.blockID, 8)).generate(this.worldObj, this.hellRNG, var14, var15, var16);
        }

        WorldGenDenseTrees var17 = new WorldGenDenseTrees(false);
        int var19;
        int var18;
        int var21;
        int var20;

        for (var18 = 0; var18 < 15; ++var18)
        {
            var19 = var4 + this.hellRNG.nextInt(16);
            var20 = var5 + this.hellRNG.nextInt(16);
            var21 = this.hellRNG.nextInt(128);
            var17.generate(this.worldObj, this.hellRNG, var19, var21, var20);
        }

        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Post(worldObj, hellRNG, var4, var5));
        MinecraftForge.EVENT_BUS.post(new PopulateChunkEvent.Post(par1IChunkProvider, worldObj, hellRNG, par2, par3, false));

        BlockSand.fallInstantly = false;
    }

    /**
     * Two modes of operation: if passed true, save all Chunks in one go.  If passed false, save up to two chunks.
     * Return true if all chunks have been saved.
     */
    @Override
    public boolean saveChunks(boolean par1, IProgressUpdate par2IProgressUpdate)
    {
        return true;
    }

    /**
     * Unloads the 100 oldest chunks from memory, due to a bug with chunkSet.add() never being called it thinks the list
     * is always empty and will not remove any chunks.
     */
    public boolean unload100OldestChunks()
    {
        return false;
    }

    /**
     * Returns if the IChunkProvider supports saving.
     */
    @Override
    public boolean canSave()
    {
        return true;
    }

    /**
     * Converts the instance data to a readable string.
     */
    @Override
    public String makeString()
    {
        return "HellRandomLevelSource";
    }

    /**
     * Returns a list of creatures of the specified type that can spawn at the given location.
     */
    @Override
    public List getPossibleCreatures(EnumCreatureType par1EnumCreatureType, int par2, int par3, int par4)
    {
        if (par1EnumCreatureType == EnumCreatureType.monster && this.genNetherBridge.hasStructureAt(par2, par3, par4))
            return this.genNetherBridge.getSpawnList();
        else
        {
            BiomeGenBase var5 = this.worldObj.getBiomeGenForCoords(par2, par4);
            return var5 == null ? null : var5.getSpawnableList(par1EnumCreatureType);
        }
    }

    /**
     * Returns the location of the closest structure of the specified type. If not found returns null.
     */
    @Override
    public ChunkPosition findClosestStructure(World par1World, String par2Str, int par3, int par4, int par5)
    {
        return null;
    }

    @Override
    public int getLoadedChunkCount()
    {
        return 0;
    }

    @Override
    public void recreateStructures(int par1, int par2)
    {
        this.genNetherBridge.generate(this, this.worldObj, par1, par2, (byte[])null);
    }

    @Override
    public boolean unloadQueuedChunks() 
    {
        return false;
    }

	@Override
	public void saveExtraData() {
		// TODO Auto-generated method stub
		
	}
}
