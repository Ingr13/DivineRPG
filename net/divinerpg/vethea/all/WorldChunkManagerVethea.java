package net.divinerpg.vethea.all;

import java.util.List;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.DimensionRegistry;
import net.minecraft.world.biome.WorldChunkManager;

public class WorldChunkManagerVethea extends WorldChunkManager
{

    /** A list of biomes that the player can spawn in. */
    private List spawnBiomes;
    
	public WorldChunkManagerVethea()
	{
		super();
		this.allowedBiomes.clear();
		this.allowedBiomes.add(DivineRPG.arksianeBiome);
		this.allowedBiomes.add(DivineRPG.heliosisBiome); //TODO: Check Heliosis biome.
	}
}
