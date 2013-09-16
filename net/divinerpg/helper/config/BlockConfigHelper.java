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
		
		RupeeOreID = config.getBlock("RupeeOre", 2000 - 256).getInt();
		ArlemiteOreID = config.getBlock("ArlemiteOre", 2001 - 256).getInt();
		RealmiteOreID = config.getBlock("RealmiteOre", 2002 - 256).getInt();
		NetheriteOreID = config.getBlock("NetheriteOre", 2003 - 256).getInt();
		BloodGemOreID = config.getBlock("BloodGemOre", 2004 - 256).getInt();
		BlueFireID = config.getBlock("BlueFire", 2005 - 256).getInt();
		DivineStoneID = config.getBlock("DivineStone", 2006 - 256).getInt();
		RupeeBlockID = config.getBlock("RupeeBlock", 2007 - 256).getInt();
		ArlemiteBlockID = config.getBlock("ArlemiteBlock", 2008 - 256).getInt();
		RealmiteBlockID = config.getBlock("RealmiteBlock", 2009 - 256).getInt();
		NetheriteBlockID = config.getBlock("NetheriteBlock", 2010 - 256).getInt();
		ObsidianBlockID = config.getBlock("ObsidianBlock", 2011 - 256).getInt();
		DivineLogID = config.getBlock("DivineLog", 2012 - 256).getInt();
		DivinePlankID = config.getBlock("DivinePlank", 2013 - 256).getInt();
		DivineLeavesID = config.getBlock("DivineLeaves", 2014 - 256).getInt();
		DivineMossyID = config.getBlock("DivineMossy", 2015 - 256).getInt();
		Spawner1ID = config.getBlock("Spawner1", 2016 - 256).getInt();
		
		IceikaPortalID = config.getBlock("IceikaPortal", 1250 - 256).getInt();
		IceLogID = config.getBlock("IceLog", 1251 - 256).getInt();
		IceLeavesID = config.getBlock("IceLeaves", 1252 - 256).getInt();
		CoalStoneID = config.getBlock("Coalstone", 1253 - 256).getInt();
		WorkLampID = config.getBlock("WorkLamp", 2254 - 256).getInt();
		SnowBrickID = config.getBlock("SnowBrick", 2255 - 256).getInt();
		IceBrickID = config.getBlock("IceBrick", 2256 - 256).getInt();
		WorkBookcaseID = config.getBlock("WorkBookcase", 2257 - 256).getInt();
		FrostGlassID = config.getBlock("FrostGlass", 2258 - 256).getInt();
		CoalstoneFurnaceID = config.getBlock("CoalstoneFurnaceIdle", 2259 - 256).getInt();
		FrostChestID = config.getBlock("FrostChest", 2260 - 256).getInt();
		FrostStoneID = config.getBlock("FrostStone", 2261 - 256).getInt();
		RolumSpawnerID = config.getBlock("RolumSpawner", 2262 - 256).getInt();
		GlacideSpawnerID = config.getBlock("GlacideSpawner", 2263 - 256).getInt();
		WorkCarpetID = config.getBlock("WorkCarpet", 2264 - 256).getInt();
		CoalstoneFurnaceOnID = config.getBlock("CoalstoneFurnaceOn", 2265 - 256).getInt();

		DravitePortalID = config.getBlock("DravitePortal", 2300 - 256).getInt();
		AzuritePortalID = config.getBlock("AzuritePortal", 2301 - 256).getInt();
		UvitePortalID = config.getBlock("UvitePortal", 2302 - 256).getInt();
		MythrilPortalID = config.getBlock("MythrilPortal", 2303 - 256).getInt();
		AugitePortalID = config.getBlock("AugitePortal", 2304 - 256).getInt();

		DraviteBlockID = config.getBlock("DraviteBlock", 2305 - 256).getInt();
		AzuriteBlockID = config.getBlock("AzuriteBlock", 2306 - 256).getInt();
		UviteBlockID = config.getBlock("UviteBlock", 2307 - 256).getInt();
		MythrilBlockID = config.getBlock("MythrilBlock", 2308 - 256).getInt();
		AugiteBlockID = config.getBlock("AugiteBlock", 2309 - 256).getInt();
		
		DraviteLeavesID = config.getBlock("DraviteLeaves", 2310 - 256).getInt();
		AzuriteLeavesID = config.getBlock("AzuriteLeaves", 2311 - 256).getInt();
		UviteLeavesID = config.getBlock("UviteLeaves", 2312 - 256).getInt();
		MythrilLeavesID = config.getBlock("MythrilLeaves", 2313 - 256).getInt();
		AugiteLeavesID = config.getBlock("AugiteLeaves", 2314 - 256).getInt();

		DraviteLogID = config.getBlock("DraviteLog", 2315 - 256).getInt();
		AzuriteLogID = config.getBlock("AzuriteLog", 2316 - 256).getInt();
		UviteLogID = config.getBlock("UviteLog", 2317 - 256).getInt();
		MythrilLogID = config.getBlock("MythrilLog", 2318 - 256).getInt();
		AugiteLogID = config.getBlock("AugiteLog", 2319 - 256).getInt();
		
		DraviteOreID = config.getBlock("DraviteOre", 2320 - 256).getInt();
		AzuriteOreID = config.getBlock("AzuriteOre", 2321 - 256).getInt();
		UviteOreID = config.getBlock("UviteOre", 2322 - 256).getInt();
		MythrilOreID = config.getBlock("MythrilOre", 2323 - 256).getInt();
		AugiteOreID = config.getBlock("AugiteOre", 2324 - 256).getInt();
		
		AzuriteVineID = config.getBlock("AzuriteVine", 2325 - 256).getInt();
		
		ArcanaPortalID = config.getBlock("ArcanaPortal", 2399 - 256).getInt();
		ArcanaPortalFrameID = config.getBlock("ArcanaPortalFrame", 2400 - 256).getInt();
		MoltenFurnaceID = config.getBlock("MoltenFurnace", 2401 - 256).getInt();
		MoltenFurnaceOnID = config.getBlock("MoltenFurnaceOn", 2402 - 256).getInt();
		MoonlightFurnaceID = config.getBlock("MoonlightFurnace", 2403 - 256).getInt();
		MoonlightFurnaceOnID = config.getBlock("MoonlightFurnaceOn", 2404 - 256).getInt();
		OceanFireFurnaceID = config.getBlock("OceanFireFurnace", 2405 - 256).getInt();
		OceanFireFurnaceOnID = config.getBlock("OceanFireFurnaceOn", 2406 - 256).getInt();
		WhiteFireFurnaceID = config.getBlock("WhiteFireFurnace", 2407 - 256).getInt();
		WhiteFireFurnaceOnID = config.getBlock("WhiteFireFurnaceOn", 2408 - 256).getInt();
		GreenLightFurnaceID = config.getBlock("GreenLightFurnace", 2409 - 256).getInt();
		GreenLightFurnaceOnID = config.getBlock("GreenLightFurnaceOn", 2410 - 256).getInt();
		DemonFurnaceID = config.getBlock("DemonFurnace", 2411 - 256).getInt();
		DemonFurnaceOnID = config.getBlock("DemonFurnaceOn", 2412 - 256).getInt();
		ArcaniumOreID = config.getBlock("ArcaniumOre", 2413 - 256).getInt();
		StarBridgeID = config.getBlock("StarBridge", 2414 - 256).getInt();
		StarBridgeOnID = config.getBlock("StarBridgeOn", 2415 - 256).getInt();
		ExtractorID = config.getBlock("Extractor", 2416 - 256).getInt();
		HeatTrapID = config.getBlock("HeatTramp", 2417 - 256).getInt();
		HeatTrapOnID = config.getBlock("HeatTrapOn", 2418 - 256).getInt();
		AncientBricksID = config.getBlock("AncientBrick", 2419 - 256).getInt();
		DegradedBricksID = config.getBlock("DegradedBrick", 2420 - 256).getInt();
		ArcaniumMetalID = config.getBlock("ArcaniumMetal", 2421 - 256).getInt();
		ArcaniumPowerID = config.getBlock("ArcaniumPower", 2422 - 256).getInt();
		AncientStoneID = config.getBlock("AncientStone", 2423 - 256).getInt();
		SoulStoneID = config.getBlock("SoulStone", 2424 - 256).getInt();
		DungeonLampID = config.getBlock("DungeonLamp", 2425 - 256).getInt();
		AncientTileID = config.getBlock("AncientTile", 2426 - 256).getInt();
		SoulSludgeID = config.getBlock("SoulSludge", 2427 - 256).getInt();
		ParasectaAltarID = config.getBlock("ParasectaAltar", 2428 - 256).getInt();
		DramixAltarID = config.getBlock("DramixAltar", 2429 - 256).getInt();
		RoamerSpawnerID = config.getBlock("RoamerSpawner", 2430 - 256).getInt();
		DeathcryxSpawnerID = config.getBlock("DeathcryxSpawner", 2431 - 256).getInt();
		DeathHoundSpawnerID = config.getBlock("DeathHoundSpawner", 2432 - 256).getInt();
		RazorbackSpawnerID = config.getBlock("RazorbackSpawner", 2433 - 256).getInt();
		LivingStatueSpawnerID = config.getBlock("LivingStatueSpawner", 2434 - 256).getInt();
		DungeonPrisonerSpawnerID = config.getBlock("DungeonPrisonerSpawner", 2435 - 256).getInt();
		ArcaniteTubesID = config.getBlock("ArcaniteTubes", 2436 - 256).getInt();
		ArcaniteRailsID = config.getBlock("ArcaniteRails", 2437 - 256).getInt();
		OreDoor1BlockID = config.getBlock("OreDoor1", 2438 - 256).getInt();
		OreDoor2BlockID = config.getBlock("OreDoor2", 2439 - 256).getInt();
		OreDoor3BlockID = config.getBlock("OreDoor3", 2440 - 256).getInt();
		OreDoor4BlockID = config.getBlock("OreDoor4", 2441 - 256).getInt();
		
		
        		
		config.save();
    }
}