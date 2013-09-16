package net.divinerpg.helper;

import net.divinerpg.arcana.gen.BiomeGenArcana;
import net.divinerpg.arcana.gen.WorldProviderArcana;
import net.divinerpg.augite.gen.BiomeGenAugite;
import net.divinerpg.augite.gen.WorldProviderDense;
import net.divinerpg.azurite.gen.BiomeGenAzurite;
import net.divinerpg.azurite.gen.WorldProviderAzurite;
import net.divinerpg.dravite.gen.BiomeGenDraviteHills;
import net.divinerpg.dravite.gen.WorldProviderTwilight;
import net.divinerpg.helper.config.DimensionConfigHelper;
import net.divinerpg.iceika.gen.BiomeGenIceikaMountians;
import net.divinerpg.iceika.gen.WorldProviderIceika;
import net.divinerpg.mythril.gen.BiomeGenMythil;
import net.divinerpg.mythril.gen.WorldProviderMythil;
import net.divinerpg.uvite.gen.BiomeGenUvite;
import net.divinerpg.uvite.gen.WorldProviderEnergy;
import net.divinerpg.vethea.all.BiomeGenArksiane;
import net.divinerpg.vethea.all.BiomeGenHeliosis;
import net.divinerpg.vethea.all.WorldProviderVethea;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;

public class DimensionRegistry 
{
	public static DimensionConfigHelper x;
	
	public static int DraviteID = 2;
	public static int AzuriteID = 3;
	public static int UviteID = 4;
	public static int MythrilID = 5;
	public static int AugiteID = 6;
	public static int ArcanaID = 7;
	public static int IceikaID = 8;
	public static int VetheaID = 9;
	
	public static final BiomeGenBase DraviteHills = new BiomeGenDraviteHills(44); 
    public static final BiomeGenBase Azurite = new BiomeGenAzurite(45);
    public static final BiomeGenBase Uvite = new BiomeGenUvite(46);
    public static final BiomeGenBase mythilBiome = new BiomeGenMythil(47);
    public static final BiomeGenBase AugiteBiome = new BiomeGenAugite(48);
    public static final BiomeGenBase arcanaBiome = new BiomeGenArcana(49);
    public static final BiomeGenBase IceikaMountains = new BiomeGenIceikaMountians(50);  
    public static final BiomeGenBase arksianeBiome = new BiomeGenArksiane(51);
    public static final BiomeGenBase heliosisBiome = new BiomeGenHeliosis(52);

	public static void init(){		 

		DimensionManager.registerProviderType(DraviteID, WorldProviderTwilight.class, true);
		DimensionManager.registerDimension(DraviteID, DraviteID);

		DimensionManager.registerProviderType(AzuriteID, WorldProviderAzurite.class, true);
		DimensionManager.registerDimension(AzuriteID, AzuriteID);

		DimensionManager.registerProviderType(UviteID, WorldProviderEnergy.class, true);
		DimensionManager.registerDimension(UviteID, UviteID);

		DimensionManager.registerProviderType(MythrilID, WorldProviderMythil.class, true);
		DimensionManager.registerDimension(MythrilID, MythrilID);

		DimensionManager.registerProviderType(AugiteID, WorldProviderDense.class, true);
		DimensionManager.registerDimension(AugiteID, AugiteID);

		DimensionManager.registerProviderType(IceikaID, WorldProviderIceika.class, true);
		DimensionManager.registerDimension(IceikaID, IceikaID);

		DimensionManager.registerProviderType(ArcanaID, WorldProviderArcana.class, true);
		DimensionManager.registerDimension(ArcanaID, ArcanaID);

		DimensionManager.registerProviderType(VetheaID, WorldProviderVethea.class, true);
		DimensionManager.registerDimension(VetheaID, VetheaID); 
	}	





}

