package net.divinerpg.helper.block;

import net.divinerpg.DivineRPG;
import net.divinerpg.block.BlockDivineSpawner;
import net.divinerpg.block.ModBlock;
import net.divinerpg.block.ModDirt;
import net.divinerpg.block.ModLeaves;
import net.divinerpg.block.ModLog;
import net.divinerpg.helper.config.BlockConfigHelper;
import net.divinerpg.iceika.block.BlockCoalStoneFurnace;
import net.divinerpg.iceika.block.BlockColoredGlass;
import net.divinerpg.iceika.block.BlockIceChest;
import net.divinerpg.iceika.block.BlockIceGrass;
import net.divinerpg.iceika.block.BlockIceikaPortal;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class IceikaBlockHelper {

	public static BlockConfigHelper x;
	
    public static final BlockIceikaPortal IceikaPortal = (BlockIceikaPortal) new BlockIceikaPortal(x.IceikaPortalID).registerTexture("IceikaPortal").setUnlocalizedName("IcePor").setBlockUnbreakable().setCreativeTab(DivineRPG.Iceika);
    public static final Block IceLog = new ModLog(x.IceLogID, "Ice").setUnlocalizedName("IceLog").setHardness(7.0F).setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Iceika);
    public static final Block IceLeaves = new ModLeaves(x.IceLeavesID, "Ice").registerTexture("IceLeaves").setHardness(5.0F).setUnlocalizedName("IceLeaves").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Iceika);
    public static final Block IceGrass = new BlockIceGrass(x.IceGrassID).setHardness(15.0F).setUnlocalizedName("IceGrass").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Iceika);
    public static final Block IceDirt = new ModDirt(x.IceDirtID).registerTexture("IceGrass_Bottom").setStepSound(Block.soundGravelFootstep).setHardness(15.0F).setUnlocalizedName("IceGrass").setCreativeTab(DivineRPG.Iceika);
    public static final Block icyStone = new ModBlock(x.IceStoneID).registerTexture("IcyStone").setHardness(7.0F).setUnlocalizedName("IcyStone").setCreativeTab(DivineRPG.Iceika);
    public static final Block coalstone = new ModBlock(x.CoalStoneID).registerTexture("CoalStone").setHardness(5.0F).setUnlocalizedName("CoalStone").setCreativeTab(DivineRPG.Iceika);
    public static final Block workshopLamp = new ModBlock(x.WorkLampID).registerTexture("WorkShopLamp").setHardness(5.0F).setUnlocalizedName("WorkLamp").setLightValue(1.0F).setCreativeTab(DivineRPG.Iceika);
    public static final Block snowyBricks = new ModBlock(x.SnowBrickID).registerTexture("SnowyBrick").setHardness(9.0F).setUnlocalizedName("SnowBrick").setCreativeTab(DivineRPG.Iceika);
    public static final Block icyBricks = new ModBlock(x.IceBrickID).registerTexture("IcyBrick").setBlockUnbreakable().setUnlocalizedName("IceBrick").setCreativeTab(DivineRPG.Iceika);
    public static final Block workshopBookcase = new ModBlock(x.WorkBookcaseID).registerTexture("WorkshopBookcase").setUnlocalizedName("BookCase").setHardness(7.0F).setCreativeTab(DivineRPG.Iceika);
    public static final Block frostedGlass = new BlockColoredGlass(x.FrostGlassID, false).registerTexture("FrostedGlass").setHardness(4.0F).setUnlocalizedName("FrostGlass").setStepSound(Block.soundGlassFootstep).setCreativeTab(DivineRPG.Iceika);
    public static final Block coalstoneFurnace = new BlockCoalStoneFurnace(x.CoalstoneFurnaceID, false).registerTexture("CoalStoneFurnace_Front_Off").setUnlocalizedName("CoalFurnace").setCreativeTab(DivineRPG.Iceika);
    public static final Block frostedChest = new BlockIceChest(x.FrostChestID).setUnlocalizedName("FC").setHardness(7.0F).setCreativeTab(DivineRPG.Iceika);
    public static final Block frostedStone = new ModBlock(x.FrostStoneID).registerTexture("FrostedStone").setUnlocalizedName("IceS").setHardness(8.0F).setCreativeTab(DivineRPG.Iceika);
    public static final Block rolumSpawner = new BlockDivineSpawner(x.RolumSpawnerID, "Rollum").registerTexture("FrozenDungeonSpawner").setUnlocalizedName("Rolum").setCreativeTab(DivineRPG.Iceika);
    public static final Block glacideSpawner = new BlockDivineSpawner(x.GlacideSpawnerID, "Glacide").registerTexture("FrozenDungeonSpawner").setUnlocalizedName("GSpawner").setCreativeTab(DivineRPG.Iceika);
    public static final Block workshopCarpet = new ModBlock(x.WorkCarpetID).registerTexture("WorkshopCarpet").setUnlocalizedName("workshopCarpet").setCreativeTab(DivineRPG.Iceika);
    public static final Block coalstoneFurnaceActive = new BlockCoalStoneFurnace(x.CoalstoneFurnaceOnID, true).setUnlocalizedName("CoalActive").setHardness(8.0F).setCreativeTab(null).setCreativeTab(DivineRPG.Iceika);

    public static void addNames(){
        LanguageRegistry.addName(IceGrass, "Frozen Grass");
        LanguageRegistry.addName(IceDirt, "Frozen Dirt");
        LanguageRegistry.addName(IceLog, "Frozen Log");
        LanguageRegistry.addName(IceLeaves, "Frozen Leaves");
        LanguageRegistry.addName(IceikaPortal, "Iceika Portal");
        LanguageRegistry.addName(coalstoneFurnaceActive, "Coalstone Furnace Active");
        LanguageRegistry.addName(frostedGlass, "Frosted Glass");
        LanguageRegistry.addName(glacideSpawner, "Glacide Spawner");
        LanguageRegistry.addName(frostedStone, "Frosted Stone");
        LanguageRegistry.addName(rolumSpawner, "Rolum Spawner");
        LanguageRegistry.addName(frostedChest, "Frost Chest");
        LanguageRegistry.addName(coalstoneFurnace, "Coalstone Furnace");
        LanguageRegistry.addName(workshopBookcase, "Workshop Bookcase");
        LanguageRegistry.addName(workshopCarpet, "Workshop Carpet");
        LanguageRegistry.addName(icyBricks, "Icy Brick");
        LanguageRegistry.addName(icyBricks, "Icy Brick");
        LanguageRegistry.addName(icyStone, "Icy Stone");
        LanguageRegistry.addName(workshopLamp, "Workshop Lamp");
        LanguageRegistry.addName(coalstone, "Coal Stone");

    }
}
