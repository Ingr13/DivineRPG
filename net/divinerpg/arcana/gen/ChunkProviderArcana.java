package net.divinerpg.arcana.gen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.FlatGeneratorInfo;
import net.minecraft.world.gen.FlatLayerInfo;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.MapGenStructure;

public class ChunkProviderArcana implements IChunkProvider
{
    private World worldObj;
    private Random random;
    private final byte[] blocks = new byte[256];
    private final byte[] blocksMeta = new byte[256];
    private final FlatGeneratorInfo flatGenerator;
    private final List field_82696_f = new ArrayList();
    private final boolean hasDecoration;
    private final boolean hasDungeons;
    private WorldGenLakes lakeWater;
    private WorldGenLakes lakeLava;
    private  ArrayList<Object> rooms;
    private DungeonCeiling ceiling;

    public ChunkProviderArcana(World world, long seed, String flatGeneratorString)
    {
        this.worldObj = world;
        this.random = new Random(seed);
        this.flatGenerator = FlatGeneratorInfo.createFlatGeneratorFromString(flatGeneratorString);
        this.hasDecoration = this.flatGenerator.getWorldFeatures().containsKey("decoration");

        if (this.flatGenerator.getWorldFeatures().containsKey("lake"))
        {
            this.lakeWater = new WorldGenLakes(Block.waterStill.blockID);
        }

        if (this.flatGenerator.getWorldFeatures().containsKey("lava_lake"))
        {
            this.lakeLava = new WorldGenLakes(Block.lavaStill.blockID);
        }

        this.hasDungeons = this.flatGenerator.getWorldFeatures().containsKey("dungeon");
        Iterator layersIterator = this.flatGenerator.getFlatLayers().iterator();

        while (layersIterator.hasNext())
        {
            FlatLayerInfo flatLayer = (FlatLayerInfo)layersIterator.next();

            for (int var8 = flatLayer.getMinY(); var8 < flatLayer.getMinY() + flatLayer.getLayerCount(); ++var8)
            {
                this.blocks[var8] = (byte)(flatLayer.getFillBlock() & 255);
                this.blocksMeta[var8] = (byte)flatLayer.getFillBlockMeta();
            }
        }
        rooms = new ArrayList<Object>(22);
        rooms.add(new DungeonComponent());//0
        rooms.add(new DungeonComponent1());//1
        rooms.add(new DungeonComponent2());//2
        rooms.add(new DungeonComponent3());//3
        rooms.add(new DungeonComponent4());//4
        rooms.add(new DungeonComponent5());//5
        rooms.add(new DungeonComponent6());//6
        rooms.add(new DungeonComponent7());//7
        rooms.add(new DungeonComponent9());//8
        rooms.add(new DungeonComponent10());//9
        rooms.add(new DungeonComponent11());//10
        rooms.add(new DungeonComponent12());//11
        rooms.add(new DungeonComponent13());//12
        rooms.add(new DungeonComponent14());//13
        rooms.add(new DungeonComponent15());//14
        rooms.add(new DungeonComponent16());//15
        rooms.add(new DungeonComponent17());//16
        rooms.add(new DungeonComponent22()); //17
        rooms.add(new DungeonComponenet18()); //19
        rooms.add(new DungeonComponenet19()); //19
        rooms.add(new DungeonComponent8());//20 stairs
        rooms.add(new DungeonComponent20()); //21 boss
        rooms.add(new DungeonComponent21()); //22 boss
        ceiling = new DungeonCeiling();
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
    public Chunk provideChunk(int chunkX, int chunkY)
    {
        this.random.setSeed(chunkX * 341873128712L + chunkY * 132897987541L);
        byte[] var3 = new byte[32768];
        Chunk var4 = new Chunk(this.worldObj, var3, chunkX, chunkY);
        BiomeGenBase[] var5 = this.worldObj.getWorldChunkManager().loadBlockGeneratorData((BiomeGenBase[])null, chunkX * 16, chunkY * 16, 16, 16);
        byte[] var6 = var4.getBiomeArray();

        for (int var7 = 0; var7 < var6.length; ++var7)
        {
            var6[var7] = (byte)var5[var7].biomeID;
        }

        var4.resetRelightChecks();
        return var4;
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
    public void populate(IChunkProvider chunkProvider, int chunkX, int cunkY)
    {
        int x = chunkX * 16; // X the actual X position in world.
        int y = cunkY * 16;
        BiomeGenBase biome = this.worldObj.getBiomeGenForCoords(x + 16, y + 16);
        boolean flag = false;
        this.random.setSeed(this.worldObj.getSeed());
        long var8 = this.random.nextLong() / 2L * 2L + 1L;
        long var10 = this.random.nextLong() / 2L * 2L + 1L;
        this.random.setSeed(chunkX * var8 + cunkY * var10 ^ this.worldObj.getSeed());
        Iterator iterator = this.field_82696_f.iterator();
        int roomToGenerate;
        int boosRoomFlag;

        Random rand = random;
        Chunk chunk = this.worldObj.getChunkFromChunkCoords(chunkX, cunkY);
        ArrayList<Object> dungeonRooms = rooms;

        for (int i = 1; i < 5; i++)
        {
            roomToGenerate = rand.nextInt(23); //# of different rooms to generate
            boosRoomFlag = rand.nextInt(5); //Chance for boss rooms to generate 1/number specified

            if (roomToGenerate > 19 && boosRoomFlag != 0 || i > 3) // boss chance
            {
                roomToGenerate = rand.nextInt(20);
            }

            if (roomToGenerate < 21) //boss rooms have to use world gen while the rest use chunk gen
            {
                ((DungeonComponentBase)(dungeonRooms.get(roomToGenerate))).generate(chunk, rand, x, i * 8, y);
            }
            else
            {
                ((WorldGenerator)(dungeonRooms.get(roomToGenerate))).generate(this.worldObj, rand, x, i * 8, y);
            }
        }
        DungeonCeiling dungeonCeiling = ceiling;
        dungeonCeiling.generate(chunk, rand, x, 40, y);//80
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
        return "ArcanaDungeonSource";
    }

    /**
     * Returns a list of creatures of the specified type that can spawn at the given location.
     */
    @Override
    public List getPossibleCreatures(EnumCreatureType creatureType, int par2, int par3, int par4)
    {
        BiomeGenBase biome = this.worldObj.getBiomeGenForCoords(par2, par4);
        return biome == null ? null : biome.getSpawnableList(creatureType);
    }

    /**
     * Returns the location of the closest structure of the specified type. If not found returns null.
     *
    public ChunkPosition findClosestStructure(World par1World, String par2Str, int par3, int par4, int par5)
    {
        if ("Stronghold".equals(par2Str))
        {
            Iterator var6 = this.field_82696_f.iterator();

            while (var6.hasNext())
            {
                MapGenStructure var7 = (MapGenStructure)var6.next();

                if (var7 instanceof MapGenStronghold)
                {
                    return var7.getNearestInstance(par1World, par3, par4, par5);
                }
            }
        }

        return null;
    }
     */
    @Override
    public int getLoadedChunkCount()
    {
        return 0;
    }

    public void func_82695_e(int par1, int par2)
    {
        Iterator var3 = this.field_82696_f.iterator();

        while (var3.hasNext())
        {
            MapGenStructure var4 = (MapGenStructure)var3.next();
            var4.generate(this, this.worldObj, par1, par2, (byte[])null);
        }
    }

    @Override
    public void recreateStructures(int var1, int var2){}

    @Override
    public boolean unloadQueuedChunks() {
        return false;
    }

    @Override
    public ChunkPosition findClosestStructure(World world, String s, int i, int j, int k) {

        return null;
    }

	@Override
	public void saveExtraData() {
		// TODO Auto-generated method stub
		
	}
}
