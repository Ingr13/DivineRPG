package net.divinerpg.helper.block;

import net.divinerpg.DivineRPG;
import net.divinerpg.block.BlockDivineSpawner;
import net.divinerpg.block.ModBlock;
import net.divinerpg.block.ModLeaves;
import net.divinerpg.block.ModLog;
import net.divinerpg.block.ModPlank;
import net.divinerpg.helper.config.BlockConfigHelper;
import net.divinerpg.overworld.block.ArlemiteOre;
import net.divinerpg.overworld.block.BlockBlueFire;
import net.divinerpg.overworld.block.BloodGem;
import net.divinerpg.overworld.block.Netherite;
import net.divinerpg.overworld.block.RealmiteOre;
import net.divinerpg.overworld.block.RupeeOre;
import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.LanguageRegistry;



public class OverworldBlockHelper {

    public static BlockConfigHelper x;

	
    public static final Block rupeeOre = new RupeeOre(x.RupeeOreID).registerTexture("RupeeOre").setUnlocalizedName("Rupee").setHardness(7.0F).setCreativeTab(DivineRPG.Overworld);
    public static final Block arlemiteOre = new ArlemiteOre(x.ArlemiteOreID).registerTexture("ArlemiteOre").setUnlocalizedName("Arlemite").setHardness(7.0F).setCreativeTab(DivineRPG.Overworld);
    public static final Block realmiteOre = new RealmiteOre(x.RealmiteOreID).registerTexture("RealmiteOre").setUnlocalizedName("Realmite").setHardness(7.0F).setCreativeTab(DivineRPG.Overworld);
    public static final Block netheriteOre = new Netherite(x.NetheriteOreID).registerTexture("NetheriteOre").setUnlocalizedName("Netherite").setHardness(7.0F).setCreativeTab(DivineRPG.Overworld);
    public static final Block bloodGemOre = new BloodGem(x.BloodGemOreID).registerTexture("BloodGemOre").setUnlocalizedName("Blood").setHardness(7.0F).setCreativeTab(DivineRPG.Overworld);
    public static final BlockBlueFire bluefire = (BlockBlueFire)new BlockBlueFire(x.BlueFireID).setUnlocalizedName("Blue").setLightValue(50.0F).setCreativeTab(DivineRPG.Overworld);
    public static final Block divineRock = new ModBlock(x.DivineStoneID).registerTexture("DivineRock").setUnlocalizedName("DivineRock").setHardness(5.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(DivineRPG.Overworld);
  //  public static final Block superEnchantMentTable = new ModBlock(3220).setUnlocalizedName("SET").setCreativeTab(DivineRPG.Overworld);
   // public static final Block blockOfLight = new ModBlock(3221).registerTexture("BlockOfLight").setUnlocalizedName("light").setCreativeTab(DivineRPG.Overworld);
    public static final Block rupeeBlock = new ModBlock(x.RupeeBlockID).registerTexture("RupeeBlock").setUnlocalizedName("RB").setCreativeTab(DivineRPG.Overworld);
    public static final Block arlemiteBlock = new ModBlock(x.ArlemiteBlockID).registerTexture("ArlemiteBlock").setUnlocalizedName("AB").setCreativeTab(DivineRPG.Overworld);
    public static final Block obsidianBlock = new ModBlock(x.ObsidianBlockID).registerTexture("ObsidianBlock").setUnlocalizedName("OB").setCreativeTab(DivineRPG.Overworld);
    public static final Block realmiteBlock = new ModBlock(x.RealmiteBlockID).registerTexture("RealmiteBlock").setUnlocalizedName("RB").setCreativeTab(DivineRPG.Overworld);
    public static final Block netheriteBlock = new ModBlock(x.NetheriteBlockID).registerTexture("NetheriteBlock").setUnlocalizedName("NB").setCreativeTab(DivineRPG.Overworld);
    public static final Block DivineLog = new ModLog(x.DivineLogID, "Divine").setHardness(0.5F).setUnlocalizedName("DivineLog").setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Overworld);
    public static final Block DivinePlank = new ModPlank(x.DivinePlankID, "Divine").setHardness(0.5F).setUnlocalizedName("DivinePlank").setStepSound(Block.soundWoodFootstep).setCreativeTab(DivineRPG.Overworld);
    public static final Block DivineLeaves = new ModLeaves(x.DivineLeavesID, "Divine").setHardness(0.2F).setUnlocalizedName("DivineLeaves").setStepSound(Block.soundGrassFootstep).setCreativeTab(DivineRPG.Overworld);
    public static final Block spawner1 = new BlockDivineSpawner(x.Spawner1ID, "Jungle Dramcryx").registerTexture("DivineSpawner").setUnlocalizedName("Spawner1").setCreativeTab(DivineRPG.Overworld);
    public static final Block divineStoneMossy = new ModBlock(x.DivineMossyID).registerTexture("DivineStoneMossy").setUnlocalizedName("DivineStoneMossy").setCreativeTab(DivineRPG.Overworld);

    /*
	public static final Block ayeracoBeamBlue = new BlockAyeracoBeamBlue(4087).setUnlocalizedName("Blue");
	public static final Block ayeracoBeamGreen = new BlockAyeracoBeamGreen(4088).setUnlocalizedName("Green");
	public static final Block ayeracoBeamPurple = new BlockAyeracoBeamPurple(4089).setUnlocalizedName("Purple");
	public static final Block ayeracoBeamRed = new BlockAyeracoBeamRed(4090).setUnlocalizedName("Red");
	public static final Block ayeracoBeamYellow = new BlockAyeracoBeamYellow(4091).setUnlocalizedName("Yellow");
     */

    public static void addNames(){
        LanguageRegistry.addName(divineStoneMossy, "Divine Mossy Stone");
        LanguageRegistry.addName(DivineLeaves, "Divine Leaves");
        LanguageRegistry.addName(DivineLog, "Divine Wood");
        LanguageRegistry.addName(DivinePlank, "Divine Plank");
        LanguageRegistry.addName(spawner1, "Mob Spawner");
        //LanguageRegistry.addName(superEnchantMentTable, "Super Enchantment Table");
        //LanguageRegistry.addName(blockOfLight, "Block Of Light");
        LanguageRegistry.addName(rupeeBlock, "Rupee Block");
        LanguageRegistry.addName(arlemiteBlock, "Arlemtite Block");
        LanguageRegistry.addName(obsidianBlock, "Obsidian Block");
        LanguageRegistry.addName(realmiteBlock, "Realmite Block");
        LanguageRegistry.addName(netheriteBlock, "Netherite Block");
        LanguageRegistry.addName(rupeeOre, "Rupee Ore");
        LanguageRegistry.addName(arlemiteOre, "Arlemite Ore");
        LanguageRegistry.addName(realmiteOre, "Realmite Ore");
        LanguageRegistry.addName(netheriteOre, "Netherite Ore");
        LanguageRegistry.addName(bloodGemOre, "Bloodgem Ore");
        LanguageRegistry.addName(divineRock, "Divine Rock");
    }
}
