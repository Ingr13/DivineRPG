package net.divinerpg.helper.block;

import net.divinerpg.DivineRPG;
import net.divinerpg.arcana.block.BlockArcaniteGrass;
import net.divinerpg.arcana.block.BlockArcaniteRails;
import net.divinerpg.arcana.block.BlockArcaniteTubes;
import net.divinerpg.arcana.block.BlockDemonFurnace;
import net.divinerpg.arcana.block.BlockDramixAltar;
import net.divinerpg.arcana.block.BlockDungeonBlock;
import net.divinerpg.arcana.block.BlockExtractinator;
import net.divinerpg.arcana.block.BlockGreenlightFurnace;
import net.divinerpg.arcana.block.BlockHeatTraps;
import net.divinerpg.arcana.block.BlockMoltenFurnace;
import net.divinerpg.arcana.block.BlockMoonlightFurnace;
import net.divinerpg.arcana.block.BlockOceanfireFurnace;
import net.divinerpg.arcana.block.BlockOreDoor1;
import net.divinerpg.arcana.block.BlockOreDoor2;
import net.divinerpg.arcana.block.BlockOreDoor3;
import net.divinerpg.arcana.block.BlockOreDoor4;
import net.divinerpg.arcana.block.BlockParasectaAltar;
import net.divinerpg.arcana.block.BlockPortalArcana;
import net.divinerpg.arcana.block.BlockPortalArcanaFrame;
import net.divinerpg.arcana.block.BlockStarBridge;
import net.divinerpg.arcana.block.BlockStarBridgeOn;
import net.divinerpg.arcana.block.BlockWhitefireFurnace;
import net.divinerpg.block.BlockDivineSpawner;
import net.divinerpg.block.ModBlock;
import net.divinerpg.block.ModDirt;
import net.divinerpg.helper.config.BlockConfigHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ArcanaBlockHelper {
	
	public static BlockConfigHelper x;
	
	public static final Block arcaniteDirt = new ModDirt(213).registerTexture("ArcaniteGrass_Bottom").setUnlocalizedName("arcaniteDirt").setCreativeTab(DivineRPG.Arcana).setCreativeTab(null);
    public static final Block arcaniteGrass = new BlockArcaniteGrass(212).setUnlocalizedName("ArcaniteG").setCreativeTab(DivineRPG.Arcana).setCreativeTab(null);
    public static final Block arcaniumOre = new ModBlock(x.ArcaniumOreID).registerTexture("ArcaniumOre").setUnlocalizedName("ArcaniumOre").setCreativeTab(DivineRPG.Arcana);
    public static final Block demonFurnace = new BlockDemonFurnace(x.DemonFurnaceID).setUnlocalizedName("demonFurnace").setCreativeTab(DivineRPG.Arcana);
    public static final Block starBridgeOn = new BlockStarBridgeOn(x.StarBridgeOnID, true).setUnlocalizedName("StarOn").setCreativeTab(null);
    public static final Block starBridge = new BlockStarBridge(x.StarBridgeID, false).setUnlocalizedName("Star").setCreativeTab(DivineRPG.Arcana);
    public static final BlockPortalArcanaFrame arcanaPortalFrame = (BlockPortalArcanaFrame) new BlockPortalArcanaFrame(x.ArcanaPortalFrameID).setUnlocalizedName("arcanaPortalFrame").setCreativeTab(DivineRPG.Arcana);
    public static final Block extractor = new BlockExtractinator(x.ExtractorID).setUnlocalizedName("BlockExtractinator").setCreativeTab(DivineRPG.Arcana);
    public static final Block greenlightFurnace = new BlockGreenlightFurnace(x.GreenLightFurnaceID, false).setUnlocalizedName("greenlightFurnace").setCreativeTab(DivineRPG.Arcana);
    public static final Block greenlightFurnaceOn = new BlockGreenlightFurnace(x.GreenLightFurnaceOnID, true).setUnlocalizedName("greenlightFurnaceOn").setCreativeTab(null);
    public static final Block heatTrapsOn = new BlockHeatTraps(x.HeatTrapOnID).registerTexture("HeatTrapOn").setBlockUnbreakable().setUnlocalizedName("HeatOn").setCreativeTab(null).setCreativeTab(DivineRPG.Arcana);
    public static final Block heatTraps = new BlockHeatTraps(x.HeatTrapID).registerTexture("HeatTrapOff").setBlockUnbreakable().setUnlocalizedName("Heat").setCreativeTab(DivineRPG.Arcana);
    public static final Block moltenFurnace = new BlockMoltenFurnace(x.MoltenFurnaceID, false).setUnlocalizedName("MoltenFurnace").setCreativeTab(DivineRPG.Arcana);
    public static final Block moltenFurnaceOn = new BlockMoltenFurnace(x.MoltenFurnaceOnID, true).setUnlocalizedName("MoltenFurnaceOn").setCreativeTab(null);
    public static final Block moonlightFurnace = new BlockMoonlightFurnace(x.MoonlightFurnaceID, false).setUnlocalizedName("moonlightFurnace").setCreativeTab(DivineRPG.Arcana);
    public static final Block moonlightFurnaceOn = new BlockMoonlightFurnace(x.MoonlightFurnaceOnID, true).setUnlocalizedName("moonlightFurnaceOn").setCreativeTab(null);
    public static final Block oceanfireFurnace = new BlockOceanfireFurnace(x.OceanFireFurnaceID, false).setUnlocalizedName("oceanfireFurnace").setCreativeTab(DivineRPG.Arcana);
    public static final Block oceanfireFurnaceOn = new BlockOceanfireFurnace(x.OceanFireFurnaceOnID, true).setUnlocalizedName("oceanfireFurnaceOn").setCreativeTab(null);
    public static final Block whitefireFurnace = new BlockWhitefireFurnace(x.WhiteFireFurnaceID, false).setUnlocalizedName("whitefireFurnace").setCreativeTab(DivineRPG.Arcana);
    public static final Block whitefireFurnaceOn = new BlockWhitefireFurnace(x.WhiteFireFurnaceOnID, true).setUnlocalizedName("whitefireFurnaceOn").setCreativeTab(null);

    public static final Block ancientBricks = new BlockDungeonBlock(x.AncientBricksID).registerTexture("YellowDegradedBricks").setBlockUnbreakable().setUnlocalizedName("ancientBricks").setCreativeTab(DivineRPG.Arcana);
    public static final Block degradedBricks = new BlockDungeonBlock(x.DegradedBricksID).registerTexture("DegradedBricks").setBlockUnbreakable().setUnlocalizedName("degradedBricks").setCreativeTab(DivineRPG.Arcana);
    public static final Block arcaniteMetal = new BlockDungeonBlock(x.ArcaniumMetalID).registerTexture("ArcaniumMetal").setBlockUnbreakable().setUnlocalizedName("arcaniteMetal").setCreativeTab(DivineRPG.Arcana);
    public static final Block arcaniumPower = new BlockDungeonBlock(x.ArcaniumPowerID).registerTexture("ArcaniumPower").setBlockUnbreakable().setUnlocalizedName("arcaniumPower").setCreativeTab(DivineRPG.Arcana);
    public static final Block ancientStone = new BlockDungeonBlock(x.AncientStoneID).registerTexture("AncientStone").setBlockUnbreakable().setUnlocalizedName("ancientStone").setCreativeTab(DivineRPG.Arcana);
    public static final Block soulStone = new BlockDungeonBlock(x.SoulStoneID).registerTexture("SoulStone").setBlockUnbreakable().setUnlocalizedName("soulStone").setCreativeTab(DivineRPG.Arcana);
    public static final Block dungeonLamp = new BlockDungeonBlock(x.DungeonLampID).registerTexture("DungeonLamp").setBlockUnbreakable().setUnlocalizedName("dungeonLamp").setLightValue(1.0F).setCreativeTab(DivineRPG.Arcana);
    public static final Block ancientTile = new BlockDungeonBlock(x.AncientTileID).registerTexture("AncientTile").setBlockUnbreakable().setUnlocalizedName("ancientTile").setCreativeTab(DivineRPG.Arcana);
    public static final Block soulSludge = new BlockDungeonBlock(x.SoulSludgeID).registerTexture("SoulSludge").setBlockUnbreakable().setUnlocalizedName("soulSludge").setCreativeTab(DivineRPG.Arcana);
    public static final Block parasectaAltar = new BlockParasectaAltar(x.ParasectaAltarID).registerTexture("ParasectaAltar").setBlockUnbreakable().setUnlocalizedName("parasectaAltar").setCreativeTab(DivineRPG.Arcana);
    public static final Block dramixAltar = new BlockDramixAltar(x.DramixAltarID).registerTexture("DramixAltar").setBlockUnbreakable().setUnlocalizedName("dramixAltar").setCreativeTab(DivineRPG.Arcana);
    public static final Block arcanaSpawner_Roamer = new BlockDivineSpawner(x.RoamerSpawnerID, "Roamer").registerTexture("ArcanaSpawner").setUnlocalizedName("arcanaSpawner Roamer").setCreativeTab(DivineRPG.Arcana);
    public static final Block arcanaSpawner_Deathcryx = new BlockDivineSpawner(x.DeathcryxSpawnerID, "Deathcryx").registerTexture("ArcanaSpawner").setUnlocalizedName("arcanaSpawner Deathcryx").setCreativeTab(DivineRPG.Arcana);
    public static final Block arcanaSpawner_DeathHound = new BlockDivineSpawner(x.DeathHoundSpawnerID, "Death Hound").registerTexture("ArcanaSpawner").setUnlocalizedName("arcanaSpawner Death Hound").setCreativeTab(DivineRPG.Arcana);
    public static final Block arcanaSpawner_Razorback = new BlockDivineSpawner(x.RazorbackSpawnerID, "Razorback").registerTexture("ArcanaSpawner").setUnlocalizedName("arcanaSpawner Razorback").setCreativeTab(DivineRPG.Arcana);
    public static final Block arcanaSpawner_LivingStatue = new BlockDivineSpawner(x.LivingStatueSpawnerID, "Living Statue").registerTexture("ArcanaSpawner").setUnlocalizedName("arcanaSpawner Living Statue").setCreativeTab(DivineRPG.Arcana);
    public static final Block arcanaSpawner_DungeonPrisoner = new BlockDivineSpawner(x.DungeonPrisonerSpawnerID, "Dungeon Prisoner").registerTexture("ArcanaSpawner").setUnlocalizedName("arcanaSpawner Dungeon Prisoner").setCreativeTab(DivineRPG.Arcana);
    public static final Block arcaniteTubes = new BlockArcaniteTubes(x.ArcaniteTubesID).registerTexture("ArcaniteTubes").setBlockUnbreakable().setUnlocalizedName("arcaniteTubes").setCreativeTab(DivineRPG.Arcana);
    public static final Block arcaniteRails = new BlockArcaniteRails(x.ArcaniteRailsID).registerTexture("ArcaniumRails").setUnlocalizedName("arcaniteRails").setCreativeTab(DivineRPG.Arcana);
    public static final BlockPortalArcana arcanaPortal = (BlockPortalArcana) new BlockPortalArcana(x.ArcanaPortalID).registerTexture("ArcanaPortal").setUnlocalizedName("arcanaPortal").setBlockUnbreakable().setCreativeTab(DivineRPG.Arcana);

    public static final Block oreDoor1 = new BlockOreDoor1(x.OreDoor1BlockID, Material.wood).setUnlocalizedName("OreDoor1").setBlockUnbreakable();
    public static final Block oreDoor2 = new BlockOreDoor2(x.OreDoor2BlockID, Material.wood).setUnlocalizedName("OreDoor2").setBlockUnbreakable();
    public static final Block oreDoor3 = new BlockOreDoor3(x.OreDoor3BlockID, Material.wood).setUnlocalizedName("OreDoor3").setBlockUnbreakable();
    public static final Block oreDoor4 = new BlockOreDoor4(x.OreDoor4BlockID, Material.wood).setUnlocalizedName("OreDoor4").setBlockUnbreakable();

    public static void addNames(){

        LanguageRegistry.addName(arcanaPortal, "Arcana Portal");
        LanguageRegistry.addName(ancientBricks, "Ancient Bricks");
        LanguageRegistry.addName(degradedBricks, "Degraded Bricks");
        LanguageRegistry.addName(arcaniteMetal, "Arcanite Metal");
        LanguageRegistry.addName(arcaniumPower, "Arcanium Power");
        LanguageRegistry.addName(ancientStone, "Ancient Stone");
        LanguageRegistry.addName(soulStone, "Soul Stone");
        LanguageRegistry.addName(dungeonLamp, "Dungeon Lamp");
        LanguageRegistry.addName(ancientTile, "Ancient Tile");
        LanguageRegistry.addName(oreDoor1, "Ore Door1");
        LanguageRegistry.addName(oreDoor2, "Ore Door2");
        LanguageRegistry.addName(soulSludge, "Soul Sludge");
        LanguageRegistry.addName(parasectaAltar, "Parasecta Altar");
        LanguageRegistry.addName(dramixAltar, "Dramix Altar");
        LanguageRegistry.addName(oreDoor4, "Ore Door4");
        LanguageRegistry.addName(arcanaSpawner_Roamer, "Arcana Spawner: Roamer");
        LanguageRegistry.addName(arcanaSpawner_DeathHound, "Arcana Spawner: Death Hound");
        LanguageRegistry.addName(arcanaSpawner_LivingStatue, "Arcana Spawner: Living Statue");
        LanguageRegistry.addName(arcanaSpawner_Razorback, "Arcana Spawner: Razorback");
        LanguageRegistry.addName(arcanaSpawner_DungeonPrisoner, "Arcana Dungeon Prisoner");
        LanguageRegistry.addName(arcanaSpawner_Deathcryx, "Arcana Spawner: Deathcryx");
        LanguageRegistry.addName(oreDoor3, "Ore Door3");
        LanguageRegistry.addName(arcaniteRails, "Arcanite Rails");
        LanguageRegistry.addName(arcaniteTubes, "Arcanite Tubes");
        LanguageRegistry.addName(heatTrapsOn, "Heat Traps On");
        LanguageRegistry.addName(heatTraps, "Heat Traps");
        LanguageRegistry.addName(whitefireFurnace, "Whitefire Furnace");
        LanguageRegistry.addName(whitefireFurnaceOn, "Whitefire Furnace On");
        LanguageRegistry.addName(oceanfireFurnace, "Oceanfire Furnace");
        LanguageRegistry.addName(oceanfireFurnaceOn, "Oceanfire Furnace On");
        LanguageRegistry.addName(moonlightFurnace, "Moonlight Furnace");
        LanguageRegistry.addName(moonlightFurnaceOn, "Moonlight Furnace On");
        LanguageRegistry.addName(moltenFurnace, "Molten Furnace");
        LanguageRegistry.addName(moltenFurnaceOn, "Molten Furnace On");
        LanguageRegistry.addName(greenlightFurnace, "Greenlight Furnace");
        LanguageRegistry.addName(greenlightFurnaceOn, "Greenlight Furnace On");
        LanguageRegistry.addName(arcanaPortalFrame, "Arcana Portal Frame");
        LanguageRegistry.addName(starBridgeOn, "Star Bridge On");
        LanguageRegistry.addName(starBridge, "Star Bridge");
        LanguageRegistry.addName(arcaniteGrass, "Arcanite Grass");
        LanguageRegistry.addName(arcaniteDirt, "Arcanite Dirt");
        LanguageRegistry.addName(demonFurnace, "Demon Furnace");
        LanguageRegistry.addName(arcaniumOre, "Arcanium Ore");

    }
}
