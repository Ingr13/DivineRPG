package net.divinerpg.helper.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class BlockConfigHelper{
	
	public static int IceGrassID = 180;
	public static int IceDirtID = 181; 
	public static int IceStoneID = 182;
	public static int TwilightStoneID = 183;
	public static int DraviteGrassID;
	public static int DraviteDirtID;
	public static int AzuriteGrassID;
	public static int AzuriteDirtID;
	public static int UviteGrassID;
	public static int UviteDirtID;
	public static int MythrilGrassID;
	public static int MythrilDirtID;
	public static int AugiteGrassID;
	public static int AugiteDirtID;
	public static int DreamGrassID = 194;
	public static int DreamDirtID = 195;
	public static int ArcanaGrassID = 196;
	public static int ArcanaDirtID = 197;
	
	public static int RupeeOreID;
	public static int ArlemiteOreID;
	public static int RealmiteOreID;
	public static int NetheriteOreID;
	public static int BloodGemOreID;
	public static int BlueFireID;
	
	public static int DivineStoneID;
	public static int RupeeBlockID;
	public static int ArlemiteBlockID;
	public static int RealmiteBlockID;
	public static int NetheriteBlockID;
	public static int ObsidianBlockID;
	public static int DivineLogID;
	public static int DivinePlankID;
	public static int DivineLeavesID;
	public static int DivineMossyID;
	public static int Spawner1ID;
	
	public static int IceikaPortalID; 
	public static int IceLogID;
	public static int IceLeavesID;
	public static int CoalStoneID;
	public static int WorkLampID;
	public static int SnowBrickID;
	public static int IceBrickID;
	public static int WorkBookcaseID;
	public static int FrostGlassID;
	public static int CoalstoneFurnaceID;
	public static int FrostChestID;
	public static int FrostStoneID;
	public static int RolumSpawnerID; 
	public static int GlacideSpawnerID;
	public static int WorkCarpetID; 
	public static int CoalstoneFurnaceOnID;
	
	
	public static int DravitePortalID;
	public static int AzuritePortalID;
	public static int UvitePortalID;
	public static int MythrilPortalID;
	public static int AugitePortalID;
	public static int DraviteBlockID;
	public static int AzuriteBlockID;
	public static int UviteBlockID;
	public static int MythrilBlockID;
	public static int AugiteBlockID;	
	public static int DraviteOreID;
	public static int AzuriteOreID;
	public static int UviteOreID;
	public static int MythrilOreID;
	public static int AugiteOreID;
	public static int DraviteLogID;
	public static int AzuriteLogID;
	public static int UviteLogID;
	public static int MythrilLogID;
	public static int AugiteLogID;
	public static int DraviteLeavesID;
	public static int AzuriteLeavesID;
	public static int UviteLeavesID;
	public static int MythrilLeavesID;
	public static int AugiteLeavesID;
	public static int AzuriteVineID;
	
	public static int ArcanaPortalID;
	public static int MoltenFurnaceID;
	public static int MoltenFurnaceOnID;
	public static int MoonlightFurnaceID;
	public static int MoonlightFurnaceOnID;
	public static int OceanFireFurnaceID;
	public static int OceanFireFurnaceOnID;
	public static int WhiteFireFurnaceID;
	public static int WhiteFireFurnaceOnID;
	public static int GreenLightFurnaceID;
	public static int GreenLightFurnaceOnID;
	public static int DemonFurnaceID;
	public static int DemonFurnaceOnID;
	public static int ArcaniumOreID;
	public static int StarBridgeOnID;
	public static int StarBridgeID;
	public static int ArcanaPortalFrameID;
	public static int ExtractorID;
	public static int HeatTrapOnID;
	public static int HeatTrapID;
	public static int AncientBricksID;
	public static int DegradedBricksID;
	public static int ArcaniumMetalID;
	public static int ArcaniumPowerID;
	public static int AncientStoneID;
	public static int SoulStoneID;
	public static int DungeonLampID;
	public static int AncientTileID;
	public static int SoulSludgeID;
	public static int ParasectaAltarID;
	public static int DramixAltarID;
	public static int RoamerSpawnerID;
	public static int DeathcryxSpawnerID;
	public static int DeathHoundSpawnerID;
	public static int RazorbackSpawnerID;
	public static int LivingStatueSpawnerID;
	public static int DungeonPrisonerSpawnerID;
	public static int ArcaniteTubesID;
	public static int ArcaniteRailsID;
	public static int OreDoor1BlockID;
	public static int OreDoor2BlockID;
	public static int OreDoor3BlockID;
	public static int OreDoor4BlockID;
	
	
	
	
    public static void initConfig(FMLPreInitializationEvent event) {
		File file = new File(event.getModConfigurationDirectory(), "DivineRPGBlocks.cfg");
		Configuration config = new Configuration(file);
		
		
		config.load();
		
		DraviteGrassID = config.getTerrainBlock("Dravite", "DraviteGrass", 160, "Dravite Generation").getInt();
		DraviteDirtID = config.getTerrainBlock("Dravite", "DraviteDirt", 161, "Dravite Generation").getInt();
		AzuriteGrassID = config.getTerrainBlock("Azurite", "AzuriteGrass", 162, "Azurite Generation").getInt();
		AzuriteDirtID = config.getTerrainBlock("Azurite", "AzuriteDirt", 163, "Azurite Generation").getInt();
		UviteGrassID = config.getTerrainBlock("Uvite", "UviteGrass", 164, "Uvite Generation").getInt();
		UviteDirtID = config.getTerrainBlock("Uvite", "UviteDirt", 165, "Uvite Generation").getInt();
		MythrilGrassID = config.getTerrainBlock("Mythril", "MythrilGrass", 166, "Mythril Generation").getInt();
		MythrilDirtID = config.getTerrainBlock("Mythril", "MythrilDirt", 167, "Mythril Generation").getInt();
		AugiteGrassID = config.getTerrainBlock("Augite", "AugiteGrass", 168, "Augite Generation").getInt();
		AugiteDirtID = config.getTerrainBlock("Augite", "AugiteDirt", 169, "Augite Generation").getInt();
		
		RupeeOreID = config.getBlock("RupeeOre", 2000).getInt();
		ArlemiteOreID = config.getBlock("ArlemiteOre", 2001).getInt();
		RealmiteOreID = config.getBlock("RealmiteOre", 2002).getInt();
		NetheriteOreID = config.getBlock("NetheriteOre", 2003).getInt();
		BloodGemOreID = config.getBlock("BloodGemOre", 2004).getInt();
		BlueFireID = config.getBlock("BlueFire", 2005).getInt();
		DivineStoneID = config.getBlock("DivineStone", 2006).getInt();
		RupeeBlockID = config.getBlock("RupeeBlock", 2007).getInt();
		ArlemiteBlockID = config.getBlock("ArlemiteBlock", 2008).getInt();
		RealmiteBlockID = config.getBlock("RealmiteBlock", 2009).getInt();
		NetheriteBlockID = config.getBlock("NetheriteBlock", 2010).getInt();
		ObsidianBlockID = config.getBlock("ObsidianBlock", 2011).getInt();
		DivineLogID = config.getBlock("DivineLog", 2012).getInt();
		DivinePlankID = config.getBlock("DivinePlank", 2013).getInt();
		DivineLeavesID = config.getBlock("DivineLeaves", 2014).getInt();
		DivineMossyID = config.getBlock("DivineMossy", 2015).getInt();
		Spawner1ID = config.getBlock("Spawner1", 2016).getInt();
		
		IceikaPortalID = config.getBlock("IceikaPortal", 1250).getInt();
		IceLogID = config.getBlock("IceLog", 1251).getInt();
		IceLeavesID = config.getBlock("IceLeaves", 1252).getInt();
		CoalStoneID = config.getBlock("Coalstone", 1253).getInt();
		WorkLampID = config.getBlock("WorkLamp", 2254).getInt();
		SnowBrickID = config.getBlock("SnowBrick", 2255).getInt();
		IceBrickID = config.getBlock("IceBrick", 2256).getInt();
		WorkBookcaseID = config.getBlock("WorkBookcase", 2257).getInt();
		FrostGlassID = config.getBlock("FrostGlass", 2258).getInt();
		CoalstoneFurnaceID = config.getBlock("CoalstoneFurnaceIdle", 2259).getInt();
		FrostChestID = config.getBlock("FrostChest", 2260).getInt();
		FrostStoneID = config.getBlock("FrostStone", 2261).getInt();
		RolumSpawnerID = config.getBlock("RolumSpawner", 2262).getInt();
		GlacideSpawnerID = config.getBlock("GlacideSpawner", 2263).getInt();
		WorkCarpetID = config.getBlock("WorkCarpet", 2264).getInt();
		CoalstoneFurnaceOnID = config.getBlock("CoalstoneFurnaceOn", 2265).getInt();

		DravitePortalID = config.getBlock("DravitePortal", 2300).getInt();
		AzuritePortalID = config.getBlock("AzuritePortal", 2301).getInt();
		UvitePortalID = config.getBlock("UvitePortal", 2302).getInt();
		MythrilPortalID = config.getBlock("MythrilPortal", 2303).getInt();
		AugitePortalID = config.getBlock("AugitePortal", 2304).getInt();

		DraviteBlockID = config.getBlock("DraviteBlock", 2305).getInt();
		AzuriteBlockID = config.getBlock("AzuriteBlock", 2306).getInt();
		UviteBlockID = config.getBlock("UviteBlock", 2307).getInt();
		MythrilBlockID = config.getBlock("MythrilBlock", 2308).getInt();
		AugiteBlockID = config.getBlock("AugiteBlock", 2309).getInt();
		
		DraviteLeavesID = config.getBlock("DraviteLeaves", 2310).getInt();
		AzuriteLeavesID = config.getBlock("AzuriteLeaves", 2311).getInt();
		UviteLeavesID = config.getBlock("UviteLeaves", 2312).getInt();
		MythrilLeavesID = config.getBlock("MythrilLeaves", 2313).getInt();
		AugiteLeavesID = config.getBlock("AugiteLeaves", 2314).getInt();

		DraviteLogID = config.getBlock("DraviteLog", 2315).getInt();
		AzuriteLogID = config.getBlock("AzuriteLog", 2316).getInt();
		UviteLogID = config.getBlock("UviteLog", 2317).getInt();
		MythrilLogID = config.getBlock("MythrilLog", 2318).getInt();
		AugiteLogID = config.getBlock("AugiteLog", 2319).getInt();
		
		DraviteOreID = config.getBlock("DraviteOre", 2320).getInt();
		AzuriteOreID = config.getBlock("AzuriteOre", 2321).getInt();
		UviteOreID = config.getBlock("UviteOre", 2322).getInt();
		MythrilOreID = config.getBlock("MythrilOre", 2323).getInt();
		AugiteOreID = config.getBlock("AugiteOre", 2324).getInt();
		
		AzuriteVineID = config.getBlock("AzuriteVine", 2325).getInt();
		
		ArcanaPortalID = config.getBlock("ArcanaPortal", 2399).getInt();
		ArcanaPortalFrameID = config.getBlock("ArcanaPortalFrame", 2400).getInt();
		MoltenFurnaceID = config.getBlock("MoltenFurnace", 2401).getInt();
		MoltenFurnaceOnID = config.getBlock("MoltenFurnaceOn", 2402).getInt();
		MoonlightFurnaceID = config.getBlock("MoonlightFurnace", 2403).getInt();
		MoonlightFurnaceOnID = config.getBlock("MoonlightFurnaceOn", 2404).getInt();
		OceanFireFurnaceID = config.getBlock("OceanFireFurnace", 2405).getInt();
		OceanFireFurnaceOnID = config.getBlock("OceanFireFurnaceOn", 2406).getInt();
		WhiteFireFurnaceID = config.getBlock("WhiteFireFurnace", 2407).getInt();
		WhiteFireFurnaceOnID = config.getBlock("WhiteFireFurnaceOn", 2408).getInt();
		GreenLightFurnaceID = config.getBlock("GreenLightFurnace", 2409).getInt();
		GreenLightFurnaceOnID = config.getBlock("GreenLightFurnaceOn", 2410).getInt();
		DemonFurnaceID = config.getBlock("DemonFurnace", 2411).getInt();
		DemonFurnaceOnID = config.getBlock("DemonFurnaceOn", 2412).getInt();
		ArcaniumOreID = config.getBlock("ArcaniumOre", 2413).getInt();
		StarBridgeID = config.getBlock("StarBridge", 2414).getInt();
		StarBridgeOnID = config.getBlock("StarBridgeOn", 2415).getInt();
		ExtractorID = config.getBlock("Extractor", 2416).getInt();
		HeatTrapID = config.getBlock("HeatTramp", 2417).getInt();
		HeatTrapOnID = config.getBlock("HeatTrapOn", 2418).getInt();
		AncientBricksID = config.getBlock("AncientBrick", 2419).getInt();
		DegradedBricksID = config.getBlock("DegradedBrick", 2420).getInt();
		ArcaniumMetalID = config.getBlock("ArcaniumMetal", 2421).getInt();
		ArcaniumPowerID = config.getBlock("ArcaniumPower", 2422).getInt();
		AncientStoneID = config.getBlock("AncientStone", 2423).getInt();
		SoulStoneID = config.getBlock("SoulStone", 2424).getInt();
		DungeonLampID = config.getBlock("DungeonLamp", 2425).getInt();
		AncientTileID = config.getBlock("AncientTile", 2426).getInt();
		SoulSludgeID = config.getBlock("SoulSludge", 2427).getInt();
		ParasectaAltarID = config.getBlock("ParasectaAltar", 2428).getInt();
		DramixAltarID = config.getBlock("DramixAltar", 2429).getInt();
		RoamerSpawnerID = config.getBlock("RoamerSpawner", 2430).getInt();
		DeathcryxSpawnerID = config.getBlock("DeathcryxSpawner", 2431).getInt();
		DeathHoundSpawnerID = config.getBlock("DeathHoundSpawner", 2432).getInt();
		RazorbackSpawnerID = config.getBlock("RazorbackSpawner", 2433).getInt();
		LivingStatueSpawnerID = config.getBlock("LivingStatueSpawner", 2434).getInt();
		DungeonPrisonerSpawnerID = config.getBlock("DungeonPrisonerSpawner", 2435).getInt();
		ArcaniteTubesID = config.getBlock("ArcaniteTubes", 2436).getInt();
		ArcaniteRailsID = config.getBlock("ArcaniteRails", 2437).getInt();
		OreDoor1BlockID = config.getBlock("OreDoor1", 2438).getInt();
		OreDoor2BlockID = config.getBlock("OreDoor2", 2439).getInt();
		OreDoor3BlockID = config.getBlock("OreDoor3", 2440).getInt();
		OreDoor4BlockID = config.getBlock("OreDoor4", 2441).getInt();
		
		
        		
		config.save();
    }
}