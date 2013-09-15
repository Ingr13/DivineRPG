package net.divinerpg.helper.block;

import net.divinerpg.DivineRPG;
import net.divinerpg.augite.block.BlockAugiteGrass;
import net.divinerpg.augite.block.BlockAugiteOre;
import net.divinerpg.augite.block.BlockAugitePortal;
import net.divinerpg.azurite.block.BlockAzuriteGrass;
import net.divinerpg.azurite.block.BlockAzuriteOre;
import net.divinerpg.azurite.block.BlockAzuritePortal;
import net.divinerpg.block.ModBlock;
import net.divinerpg.block.ModDirt;
import net.divinerpg.block.ModLeaves;
import net.divinerpg.block.ModLog;
import net.divinerpg.dravite.block.BlockDraviteGrass;
import net.divinerpg.dravite.block.BlockDraviteOre;
import net.divinerpg.dravite.block.BlockDravitePortal;
import net.divinerpg.helper.config.BlockConfigHelper;
import net.divinerpg.mythril.block.BlockMythrilGrass;
import net.divinerpg.mythril.block.BlockMythrilOre;
import net.divinerpg.mythril.block.BlockMythrilPortal;
import net.divinerpg.uvite.block.BlockAzuriteVine;
import net.divinerpg.uvite.block.BlockUviteGrass;
import net.divinerpg.uvite.block.BlockUviteOre;
import net.divinerpg.uvite.block.BlockUvitePortal;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TwilightBlockHelper {
	
	public static BlockConfigHelper x;

    public static final Block draviteGrass = new BlockDraviteGrass(x.DraviteGrassID).setUnlocalizedName("DraviteGrass").setHardness(15.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Twilight);
    public static final Block draviteDirt = new ModDirt(x.DraviteDirtID).registerTexture("DraviteGrass_Bottom").setUnlocalizedName("DraviteDirt").setHardness(15.0F).setStepSound(Block.soundGravelFootstep).setCreativeTab(DivineRPG.Twilight);
    public static final Block draviteBlock = new ModBlock(x.DraviteBlockID).registerTexture("DraviteBlock").setHardness(8.0F).setUnlocalizedName("DraviteBlock").setCreativeTab(DivineRPG.Twilight);
    public static final Block draviteLog = new ModLog(x.DraviteLogID, "Dravite").setUnlocalizedName("DraviteLog").setHardness(5.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Twilight);
    public static final Block draviteLeaves = new ModLeaves(x.DraviteLeavesID, "Dravite").registerTexture("DraviteLeaves").setUnlocalizedName("DraviteLeaves").setHardness(4.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Twilight);
    public static final BlockDravitePortal DravitePortal = (BlockDravitePortal) new BlockDravitePortal(x.DravitePortalID).registerTexture("DravitePortal").setUnlocalizedName("DravitePortal").setBlockUnbreakable().setCreativeTab(DivineRPG.Twilight);

    public static final Block DraviteOre = new BlockDraviteOre(x.DraviteOreID).registerTexture("DraviteOre").setUnlocalizedName("DraviteOre").setHardness(7.0F).setCreativeTab(DivineRPG.Twilight);
    public static final Block AzuriteGrass = new BlockAzuriteGrass(x.AzuriteGrassID).setHardness(15.0F).setUnlocalizedName("AzuriteGrass").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Twilight);
    public static final Block AzuriteDirt = new ModDirt(x.AzuriteDirtID).registerTexture("AzuriteGrass_Bottom").setHardness(15.0F).setUnlocalizedName("AzuriteDirt").setStepSound(Block.soundGravelFootstep).setCreativeTab(DivineRPG.Twilight);
    public static final Block AzuriteOre = new BlockAzuriteOre(x.AzuriteOreID).registerTexture("AzuriteOre").setHardness(7.0F).setUnlocalizedName("AzuriteOre").setCreativeTab(DivineRPG.Twilight);
    public static final BlockAzuritePortal AzuritePortal = (BlockAzuritePortal) new BlockAzuritePortal(x.AzuritePortalID).registerTexture("AzuritePortal").setUnlocalizedName("AzurPor").setBlockUnbreakable().setCreativeTab(DivineRPG.Twilight);
    public static final Block azuriteLeaves = new ModLeaves(x.AzuriteLeavesID, "Azurite").registerTexture("AzuriteLeaves").setHardness(5.0F).setUnlocalizedName("AzurLeaves").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Twilight);
    public static final Block AzuriteLog = new ModLog(x.AzuriteLogID, "Azurite").setUnlocalizedName("AzurLog").setHardness(5.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Twilight);
    public static final Block azuriteVine = new BlockAzuriteVine(x.AzuriteVineID).setUnlocalizedName("AzuriteVine").setHardness(2.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Twilight);

    public static final Block azuriteBlock = new ModBlock(x.AzuriteBlockID).registerTexture("AzuriteBlock").setUnlocalizedName("UvitePortalBlock").setHardness(5.0F).setCreativeTab(DivineRPG.Twilight);
    public static final Block uviteGrass = new BlockUviteGrass(x.UviteGrassID).setUnlocalizedName("UviteGrass").setHardness(10.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Twilight);
    public static final Block uviteDirt = new ModDirt(x.UviteDirtID).registerTexture("UviteGrass_Bottom").setUnlocalizedName("UviteDirt").setHardness(10.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Twilight);
    public static final Block uviteLog = new ModLog(x.UviteLogID, "Uvite").setUnlocalizedName("UviteLog").setHardness(5.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Twilight);
    public static final Block uviteLeaves = new ModLeaves(x.UviteLeavesID, "Uvite").registerTexture("UviteLeaves").setUnlocalizedName("UviteLeaves").setHardness(4.0F).setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Twilight);
    public static final BlockUvitePortal UvitePortal = (BlockUvitePortal) new BlockUvitePortal(x.UvitePortalID).registerTexture("UvitePortal").setUnlocalizedName("UvitePortal").setBlockUnbreakable().setCreativeTab(DivineRPG.Twilight);
    public static final Block UviteOre = new BlockUviteOre(x.UviteOreID).registerTexture("UviteOre").setUnlocalizedName("UviteOre").setHardness(7.0F).setCreativeTab(DivineRPG.Twilight);

    
    public static final Block mythrilBlock = new ModBlock(x.MythrilBlockID).registerTexture("MythrilBlock").setUnlocalizedName("MythrilBlock").setHardness(7.0F).setCreativeTab(DivineRPG.Twilight);
    public static final BlockAugitePortal AugitePortal = (BlockAugitePortal) new BlockAugitePortal(x.AugitePortalID).registerTexture("AugitePortal").setUnlocalizedName("AugPor").setBlockUnbreakable().setCreativeTab(DivineRPG.Twilight);
    public static final Block AugiteLog = new ModLog(x.AugiteLogID, "Augite").setUnlocalizedName("AugiteLog").setHardness(7.0F).setCreativeTab(DivineRPG.Twilight);
    public static final Block AugiteLeaves = new ModLeaves(x.AugiteLeavesID, "Augite").registerTexture("AugiteLeaves").setHardness(5.0F).setUnlocalizedName("AugLeaves").setCreativeTab(DivineRPG.Twilight);
    public static final Block AugiteGrass = new BlockAugiteGrass(x.AugiteGrassID).setHardness(15.0F).setUnlocalizedName("AugiteGrass").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Twilight);
    public static final Block AugiteDirt = new ModDirt(x.AugiteDirtID).registerTexture("AugiteGrass_Bottom").setStepSound(Block.soundGravelFootstep).setHardness(15.0F).setUnlocalizedName("AugiteDirt").setCreativeTab(DivineRPG.Twilight);
    public static final Block augiteBlock = new ModBlock(x.AugiteBlockID).registerTexture("AugiteBlock").setUnlocalizedName("AugiteBlock").setHardness(7.0F).setCreativeTab(DivineRPG.Twilight);

    public static final Block uviteBlock = new ModBlock(x.UviteBlockID).registerTexture("UviteBlock").setUnlocalizedName("UviteBlock").setHardness(7.0F).setCreativeTab(DivineRPG.Twilight);
    public static final BlockMythrilPortal MythrilPortal = (BlockMythrilPortal) new BlockMythrilPortal(x.MythrilPortalID).registerTexture("MythrilPortal").setUnlocalizedName("MythPor").setBlockUnbreakable().setCreativeTab(DivineRPG.Twilight);
    public static final Block MythrilGrass = new BlockMythrilGrass(x.MythrilGrassID).setHardness(15.0F).setUnlocalizedName("MythrilGrass").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Twilight);
    public static final Block MythrilDirt = new ModDirt(x.MythrilDirtID).registerTexture("MythrilGrass_Bottom").setStepSound(Block.soundGravelFootstep).setHardness(15.0F).setUnlocalizedName("MythrilDirt").setCreativeTab(DivineRPG.Twilight);
    public static final Block MythrilLog = new ModLog(x.MythrilLogID, "Mythril").setUnlocalizedName("MythrilLog").setHardness(7.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Twilight);
    public static final Block MythrilLeaves = new ModLeaves(x.MythrilLeavesID, "Mythril").registerTexture("MythrilLeaves").setHardness(5.0F).setUnlocalizedName("MythLeaves").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Twilight);

    public static final Block mythrilOre = new BlockMythrilOre(x.MythrilOreID).registerTexture("MythrilOre").setHardness(7.0F).setUnlocalizedName("MythrilOre").setCreativeTab(DivineRPG.Twilight);
    public static final Block augiteOre = new BlockAugiteOre(x.AugiteOreID).registerTexture("AugiteOre").setHardness(7.0F).setUnlocalizedName("AugiteOre").setCreativeTab(DivineRPG.Twilight);

    //public static final Block draviteChest = new ModBlock(3250).registerTexture("DraviteChest").setUnlocalizedName("DC").setCreativeTab(DivineRPG.Twilight);
    //public static final Block DraviteLamp = new ModBlock(3251).registerTexture("DraviteLamp").setUnlocalizedName("DL").setCreativeTab(DivineRPG.Twilight);
    //public static final Block uviteRail = new ModBlock(3252).registerTexture("UviteRail").setUnlocalizedName("UR").setCreativeTab(DivineRPG.Twilight);
    public static final Block twilightStone = new ModBlock(x.TwilightStoneID).registerTexture("TwilightStone").setUnlocalizedName("Twilight").setHardness(7.0F).setCreativeTab(DivineRPG.Twilight);


    public static void addNames(){
       // LanguageRegistry.addName(draviteChest, "Dravite Chest");
       // LanguageRegistry.addName(DraviteLamp, "Dravite Lamp");
       // LanguageRegistry.addName(uviteRail, "Uvite Rail");
        LanguageRegistry.addName(augiteOre, "Augite Ore");
        LanguageRegistry.addName(mythrilOre, "Mythril Ore");
        LanguageRegistry.addName(mythrilBlock, "Mythril Block");
        LanguageRegistry.addName(AugiteGrass, "Augite Grass");
        LanguageRegistry.addName(AugiteDirt, "Augite Dirt");
        LanguageRegistry.addName(AugiteLog, "Augite Log");
        LanguageRegistry.addName(AugiteLeaves, "Augite Leaves");
        LanguageRegistry.addName(AugitePortal, "Augite Portal");

        LanguageRegistry.addName(azuriteBlock, "Azurite Block");
        LanguageRegistry.addName(MythrilGrass, "Mythril Grass");
        LanguageRegistry.addName(MythrilDirt, "Mythril Dirt");
        LanguageRegistry.addName(MythrilLog, "Mythril Log");
        LanguageRegistry.addName(MythrilLeaves, "Mythril Leaves");
        LanguageRegistry.addName(MythrilPortal, "Mythril Portal");
        LanguageRegistry.addName(twilightStone, "Twilight Stone");

        LanguageRegistry.addName(uviteBlock, "Uvite Block");
        LanguageRegistry.addName(AzuriteOre, "Azurite Ore");
        LanguageRegistry.addName(DraviteOre, "Dravite Ore");
        LanguageRegistry.addName(draviteGrass, "Dravite Grass");
        LanguageRegistry.addName(draviteDirt, "Dravite Dirt");
        LanguageRegistry.addName(draviteLog, "Dravite Log");
        LanguageRegistry.addName(draviteLeaves, "Dravite Leaves");
        LanguageRegistry.addName(DravitePortal, "Dravite Portal");

        LanguageRegistry.addName(draviteBlock, "Dravite Block");
        LanguageRegistry.addName(AzuriteGrass, "Azurite Grass");
        LanguageRegistry.addName(AzuriteDirt, "Azurite Dirt");
        LanguageRegistry.addName(AzuriteLog, "Azurite Log");
        LanguageRegistry.addName(azuriteLeaves, "Azurite Leaves");
        LanguageRegistry.addName(AzuritePortal, "Azurite Portal");
        LanguageRegistry.addName(AzuriteLog, "Azurite Log");

        LanguageRegistry.addName(UviteOre, "Uvite Ore");
        LanguageRegistry.addName(azuriteBlock, "Azurite Block");
        LanguageRegistry.addName(uviteGrass, "Uvite Grass");
        LanguageRegistry.addName(uviteDirt, "Uvite Dirt");
        LanguageRegistry.addName(uviteLog, "Uvite Log");
        LanguageRegistry.addName(uviteLeaves, "Uvite Leaves");
        LanguageRegistry.addName(azuriteVine, "Azurite Vine");
        LanguageRegistry.addName(UvitePortal, "Uvite Portal");		
        LanguageRegistry.addName(augiteBlock, "Augite Block");

    }
}
