package net.divinerpg.helper.item;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.base.ItemDivineRPG;
import net.divinerpg.helper.config.VetheaConfigHelper;
import net.divinerpg.item.ItemAmthirmisDisk;
import net.divinerpg.item.ItemArksianeDisk;
import net.divinerpg.item.ItemBarredDoor;
import net.divinerpg.item.ItemCermileDisk;
import net.divinerpg.item.ItemDarvenDisk;
import net.divinerpg.item.ItemDreamPowder;
import net.divinerpg.item.ItemDreamflint;
import net.divinerpg.item.ItemEvernight;
import net.divinerpg.item.ItemHeliosisDisk;
import net.divinerpg.item.ItemKarosDisk;
import net.divinerpg.item.ItemMoonclock;
import net.divinerpg.item.ItemPardimalDisk;
import net.divinerpg.item.ItemQuadroticDisk;
import net.divinerpg.item.ItemSpinebackChunk;
import net.divinerpg.item.ItemSpinebackDisc;
import net.divinerpg.item.ItemTeakerDisk;
import net.divinerpg.item.ItemVetheanBow;
import net.divinerpg.item.ItemVetheanCannon;
import net.divinerpg.item.ItemVetheanClaw;
import net.divinerpg.item.ItemVetheanEversight;
import net.divinerpg.item.ItemVetheanFood;
import net.divinerpg.item.ItemVetheanHammerSword;
import net.divinerpg.item.ItemVetheanHealingFood;
import net.divinerpg.item.ItemVetheanStaff;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class VetheaItemHelper {

	public static VetheaConfigHelper x;
	
    public static int HEAD = 0;
    public static int BODY = 1;
    public static int LEGS = 2;
    public static int BOOTS = 3;

    static int degradedRender = RenderingRegistry.addNewArmourRendererPrefix("degraded");
    static int finishedRender = RenderingRegistry.addNewArmourRendererPrefix("finished");
    static int glisteningRender = RenderingRegistry.addNewArmourRendererPrefix("glistening");
    static int demonizedRender = RenderingRegistry.addNewArmourRendererPrefix("demonized");
    static int tormentedRender = RenderingRegistry.addNewArmourRendererPrefix("tormented");

    public static final Item teakerDisk = new ItemTeakerDisk(x.teakerDiskID, 4).registerTextures("TeakerDisc").setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("Teaker Disk");
    public static final Item amthrimisDisk = new ItemAmthirmisDisk(x.amthirmisDiskID, 6).registerTextures("AmthirmisDisc").setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("Amthirmis Disk");
    public static final Item darvenDisk = new ItemDarvenDisk(x.darvenDiskID, 9).registerTextures("DarvenDisc").setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("Darven Disk");
    public static final Item cermileDisk = new ItemCermileDisk(x.cermileDiskID, 13).registerTextures("CermileDisc").setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("Cermile Disk");
    public static final Item pardimalDisk = new ItemPardimalDisk(x.pardimalDiskID, 16).registerTextures("PardimalWarDisc").setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("Pardimal Disk");
    public static final Item quadroticDisk = new ItemQuadroticDisk(x.quadroticDiskID, 20).registerTextures("QuadroticWarDisc").setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("Quadrotic Disk");
    public static final Item karosDisk = new ItemKarosDisk(x.karosDiskID, 22).registerTextures("KarosWarDisc").setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("Karos Disk");
    public static final Item heliosisDisk = new ItemHeliosisDisk(x.heliosisDiskID, 29).registerTextures("HeliosisWrathDisc").setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("Heliosis Disk");
    public static final Item arksianeDisk = new ItemArksianeDisk(x.arksianeDiskID, 37).registerTextures("ArksianeWrathDisc").setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("Arksiane Disk");       
    public static final Item spinebackDisk = new ItemSpinebackDisc(x.spinebackDiscID, 45).registerTextures("SpinebackDisc").setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("Spineback Disk");    

    public static final Item teakerHammer = new ItemVetheanHammerSword(x.teakerHammerID, "teakerHammer", 6).registerTextures("TeakerHammer").setCreativeTab(DivineRPG.Vethea);
    public static final Item amthrimisHammer = new ItemVetheanHammerSword(x.amthirmisHammerID, "amthirmisHammer", 8).registerTextures("AmthirmisHammer").setCreativeTab(DivineRPG.Vethea);
    public static final Item darvenHammer = new ItemVetheanHammerSword(x.darvenHammerID, "darvenHammer", 12).registerTextures("DarvenHammer").setCreativeTab(DivineRPG.Vethea);
    public static final Item cermileHammer = new ItemVetheanHammerSword(x.cermileHammerID, "cermileHammer", 15).registerTextures("CermileHammer").setCreativeTab(DivineRPG.Vethea);
    public static final Item pardimalHammer = new ItemVetheanHammerSword(x.pardimalHammerID, "pardimalHammer", 19).registerTextures("PardimalWarHammer").setCreativeTab(DivineRPG.Vethea);
    public static final Item quadroticHammer = new ItemVetheanHammerSword(x.quadroticHammerID, "quadroticHammer", 24).registerTextures("QuadroticWarHammer").setCreativeTab(DivineRPG.Vethea);
    public static final Item karosHammer = new ItemVetheanHammerSword(x.karosHammerID, "karosHammer", 26).registerTextures("KarosWarHammer").setCreativeTab(DivineRPG.Vethea);
    public static final Item heliosisHammer = new ItemVetheanHammerSword(x.heliosisHammerID, "heliosisHammer", 33).registerTextures("HeliosisWrathHammer").setCreativeTab(DivineRPG.Vethea);
    public static final Item arksianeHammer = new ItemVetheanHammerSword(x.arksianeHammerID, "arksianeHammer", 39).registerTextures("ArksianeWrathHammer").setCreativeTab(DivineRPG.Vethea);
    public static final Item spinebackHammer = new ItemVetheanHammerSword(x.spinebackHammerID, "spinebackHammer", 50).registerTextures("SpinebackHammer").setCreativeTab(DivineRPG.Vethea);

    public static final Item teakerSword = new ItemVetheanHammerSword(x.teakerSwordID, "teakerSword", 4).registerTextures("TeakerBacksword").setCreativeTab(DivineRPG.Vethea);
    public static final Item amthrimisSword = new ItemVetheanHammerSword(x.amthirmisSwordID, "amthirmisSword", 6).registerTextures("AmthirmisBacksword").setCreativeTab(DivineRPG.Vethea);
    public static final Item darvenSword = new ItemVetheanHammerSword(x.darvenSwordID, "darvenSword", 9).registerTextures("DarvenBacksword").setCreativeTab(DivineRPG.Vethea);
    public static final Item cermileSword = new ItemVetheanHammerSword(x.cermileSwordID, "cermileSword", 13).registerTextures("CermileBacksword").setCreativeTab(DivineRPG.Vethea);
    public static final Item pardimalSword = new ItemVetheanHammerSword(x.pardimalSwordID, "pardimalSword", 16).registerTextures("PardimalWarsword").setCreativeTab(DivineRPG.Vethea);
    public static final Item quadroticSword = new ItemVetheanHammerSword(x.quadroticSwordID, "quadroticSword", 20).registerTextures("QuadroticWarsword").setCreativeTab(DivineRPG.Vethea);
    public static final Item karosSword = new ItemVetheanHammerSword(x.karosSwordID, "karosSword", 22).registerTextures("KarosWarsword").setCreativeTab(DivineRPG.Vethea);
    public static final Item heliosisSword = new ItemVetheanHammerSword(x.heliosisSwordID, "heliosisSword", 29).registerTextures("HeliosisWrathsword").setCreativeTab(DivineRPG.Vethea);
    public static final Item arksianeSword = new ItemVetheanHammerSword(x.arksianeSwordID, "arksianeSword", 37).registerTextures("ArksianeWrathsword").setCreativeTab(DivineRPG.Vethea);

    public static final Item teakerClaw = new ItemVetheanClaw(x.teakerClawID, "teakerClaw", 3).registerTextures("TeakerClaw").setCreativeTab(DivineRPG.Vethea);
    public static final Item amthrimisClaw = new ItemVetheanClaw(x.amthirmisClawID, "amthirmisClaw", 5).registerTextures("AmthirmisClaw").setCreativeTab(DivineRPG.Vethea);
    public static final Item darvenClaw = new ItemVetheanClaw(x.darvenClawID, "darvenClaw", 7).registerTextures("DarvenClaw").setCreativeTab(DivineRPG.Vethea);
    public static final Item cermileClaw = new ItemVetheanClaw(x.cermileClawID, "cermileClaw", 8).registerTextures("CermileClaw").setCreativeTab(DivineRPG.Vethea);
    public static final Item pardimalClaw = new ItemVetheanClaw(x.pardimalClawID, "pardimalClaw", 12).registerTextures("PardimalWarClaw").setCreativeTab(DivineRPG.Vethea);
    public static final Item quadroticClaw = new ItemVetheanClaw(x.quadroticClawID, "quadroticClaw", 14).registerTextures("QuadroticWarClaw").setCreativeTab(DivineRPG.Vethea);
    public static final Item karosClaw = new ItemVetheanClaw(x.karosClawID, "karosClaw", 19).registerTextures("KarosWarClaw").setCreativeTab(DivineRPG.Vethea);
    public static final Item heliosisClaw = new ItemVetheanClaw(x.heliosisClawID, "heliosisClaw", 26).registerTextures("HeliosisWrathClaw").setCreativeTab(DivineRPG.Vethea);
    public static final Item arksianeClaw = new ItemVetheanClaw(x.arksianeClawID, "arksianeClaw", 35).registerTextures("AmthirmisClaw").setCreativeTab(DivineRPG.Vethea);

    public static final Item acidfire = new ItemDivineRPG(x.acidfireID).registerTextures("Acid").setUnlocalizedName("Acidfire").setCreativeTab(DivineRPG.Vethea);
    public static final Item vetheanArrow = new ItemDivineRPG(x.vetheanArrowID).registerTextures("TeakerArrow").setUnlocalizedName("Teaker Arrow").setCreativeTab(DivineRPG.Vethea);
    public static final Item vetheanArrow2 = new ItemDivineRPG(x.vetheanArrow2ID).registerTextures("DarvenArrow").setUnlocalizedName("Darven Arrow").setCreativeTab(DivineRPG.Vethea);
    public static final Item vetheanWarArrow = new ItemDivineRPG(x.vetheanWarArrowID).registerTextures("PardimalArrow").setUnlocalizedName("Pardimal Arrow").setCreativeTab(DivineRPG.Vethea);
    public static final Item vetheanWrathArrow = new ItemDivineRPG(x.vetheanWrathArrowID).registerTextures("KarosArrow").setUnlocalizedName("Karos Arrow").setCreativeTab(DivineRPG.Vethea);
    public static final Item everArrow = new ItemDivineRPG(x.everArrowID).registerTextures("EverArrow").setUnlocalizedName("Ever Arrow").setCreativeTab(DivineRPG.Vethea);

    public static final Item teakerBow = new ItemVetheanBow(x.teakerBowID, 0.5D, vetheanArrow, "teakerBow", false, 0, 0).setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("TeakerBow");
    public static final Item amthrimisBow = new ItemVetheanBow(x.amthirmisBowID, 0.7D, vetheanArrow, "amthrimisBow", false, 0, 0).setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("AmthirmisBow");
    public static final Item darvenBow = new ItemVetheanBow(x.darvenBowID, 1.1D, vetheanArrow2, "darvenBow", false, 0, 0).setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("DarvenBow");
    public static final Item cermileBow = new ItemVetheanBow(x.cermileBowID, 1.4D, vetheanArrow2, "cermileBow", false, 0, 0).setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("CermileBow");
    public static final Item pardimalBow = new ItemVetheanBow(x.pardimalBowID, 1.8D, vetheanWarArrow, "pardimalBow", false, 0, 0).setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("PardimalWarBow");
    public static final Item quadroticBow = new ItemVetheanBow(x.quadroticBowID, 2.1D, vetheanWarArrow, "quadroticBow", false, 0, 0).setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("QuadroticWarBow");
    public static final Item karosBow = new ItemVetheanBow(x.karosBowID, 2.3D, vetheanWrathArrow, "karosBow", false, 0, 0).setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("KarosWarBow");
    public static final Item heliosisBow = new ItemVetheanBow(x.heliosisBowID, 2.8D, vetheanWrathArrow, "heliosisBow", false, 0, 0).setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("HeliosisWrathBow");
    public static final Item arksianeBow = new ItemVetheanBow(x.arksianeBowID, 3.6D, vetheanWrathArrow, "arksianeBow", false, 0, 0).setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("ArksianeWrathBow");

    public static final Item dreamPowder = new ItemDreamPowder(x.dreamPowderID).registerTextures("DreamPowder").setUnlocalizedName("DreamPowder").setCreativeTab(DivineRPG.Vethea);

    public static final Item vetheanHammerTemplate = new ItemDivineRPG(x.vetheanHammerTemplateID).registerTextures("HammerTemplate").setUnlocalizedName("vetheanHammerTemplate").setCreativeTab(DivineRPG.Vethea);
    public static final Item vetheanBackswordTemplate = new ItemDivineRPG(x.vetheanBackswordTemplateID).registerTextures("BackswordTemplate").setUnlocalizedName("vetheanBackswordTemplate").setCreativeTab(DivineRPG.Vethea);
    public static final Item vetheanBowTemplate = new ItemDivineRPG(x.vetheanBowTemplateID).registerTextures("BowTemplate").setUnlocalizedName("vetheanBowTemplate").setCreativeTab(DivineRPG.Vethea);
    public static final Item vetheanCannonTemplate = new ItemDivineRPG(x.vetheanCannonTemplateID).registerTextures("CannonTemplate").setUnlocalizedName("vetheanCannonTemplate").setCreativeTab(DivineRPG.Vethea);
    public static final Item vetheanClawTemplate = new ItemDivineRPG(x.vetheanClawTemplateID).registerTextures("ClawTemplate").setUnlocalizedName("vetheanClawTemplate").setCreativeTab(DivineRPG.Vethea);
    public static final Item vetheanDiskTemplate = new ItemDivineRPG(x.vetheanDiskTemplateID).registerTextures("DiscTemplate").setUnlocalizedName("vetheanDiskTemplate").setCreativeTab(DivineRPG.Vethea);
    public static final Item vetheanStaffTemplate = new ItemDivineRPG(x.vetheanStaffTemplateID).registerTextures("StaffTemplate").setUnlocalizedName("vetheanStaffTemplate").setCreativeTab(DivineRPG.Vethea);
    public static final Item vetheanDegradedTemplate = new ItemDivineRPG(x.vetheanDegradedTemplateID).registerTextures("DegradedTemplate").setUnlocalizedName("vetheanDegradedTemplate").setCreativeTab(DivineRPG.Vethea);
    public static final Item vetheanFinishedTemplate = new ItemDivineRPG(x.vetheanFinishedTemplateID).registerTextures("FinishedTemplate").setUnlocalizedName("vetheanFinishedTemplate").setCreativeTab(DivineRPG.Vethea);
    public static final Item vetheanGlisteningTemplate = new ItemDivineRPG(x.vetheanGlisteningTemplateID).registerTextures("GlisteningTemplate").setUnlocalizedName("vetheanGlisteningTemplate").setCreativeTab(DivineRPG.Vethea);
    public static final Item vetheanDemonizedTemplate = new ItemDivineRPG(x.vetheanDemonizedTemplateID).registerTextures("DemonizedTemplate").setUnlocalizedName("vetheanDemonizedTemplate").setCreativeTab(DivineRPG.Vethea);
    public static final Item vetheanTormentedTemplate = new ItemDivineRPG(x.vetheanTormentedTemplateID).registerTextures("DegradedTemplate").setUnlocalizedName("vetheanTormentedTemplate").setCreativeTab(DivineRPG.Vethea);

    public static final Item teakerLump = new ItemDivineRPG(x.teakerLumpID).registerTextures("TeakerLump").setUnlocalizedName("TeakerLump").setCreativeTab(DivineRPG.Vethea);
    public static final Item amthrimisLump = new ItemDivineRPG(x.amthirmisLumpID).registerTextures("AmthirmisLump").setUnlocalizedName("AmthrimisLump").setCreativeTab(DivineRPG.Vethea);
    public static final Item darvenLump = new ItemDivineRPG(x.darvenLumpID).registerTextures("DarvenLump").setUnlocalizedName("DarvenLump").setCreativeTab(DivineRPG.Vethea);
    public static final Item cermileLump = new ItemDivineRPG(x.cermileLumpID).registerTextures("CermileLump").setUnlocalizedName("CermileLump").setCreativeTab(DivineRPG.Vethea);
    public static final Item pardimalLump = new ItemDivineRPG(x.pardimalLumpID).registerTextures("PardimalLump").setUnlocalizedName("pardimalLump").setCreativeTab(DivineRPG.Vethea);
    public static final Item quadroticLump = new ItemDivineRPG(x.quadroticLumpID).registerTextures("QuadroticLump").setUnlocalizedName("quadroticLump").setCreativeTab(DivineRPG.Vethea);
    public static final Item karosLump = new ItemDivineRPG(x.karosLumpID).registerTextures("KarosLump").setUnlocalizedName("karosLump").setCreativeTab(DivineRPG.Vethea);
    public static final Item heliosisLump = new ItemDivineRPG(x.heliosisLumpID).registerTextures("HeliosisLump").setUnlocalizedName("heliosisLump").setCreativeTab(DivineRPG.Vethea);
    public static final Item arksianeLump = new ItemDivineRPG(x.arksianeLumpID).registerTextures("ArksianeLump").setUnlocalizedName("arksaineLump").setCreativeTab(DivineRPG.Vethea);

    public static final Item honeysuckle = new ItemVetheanFood(x.honeysuckleID, 1, 0.2F, true).registerTextures("Honeysuckle").setUnlocalizedName("honeysuckle").setCreativeTab(DivineRPG.Vethea);
    public static final Item dreamCarrot = new ItemVetheanFood(x.dreamCarrotID, 3, 0.4F, true).registerTextures("DreamCarrot").setUnlocalizedName("dreamCarrot").setCreativeTab(DivineRPG.Vethea);
    public static final Item dreamMelon = new ItemVetheanFood(x.dreamMelonID, 6, 0.6F, true).registerTextures("DreamMelon").setUnlocalizedName("dreamMelon").setCreativeTab(DivineRPG.Vethea);
    public static final Item dreamPie = new ItemVetheanFood(x.dreamPieID, 4, 0.8F, true).registerTextures("DreamPie").setUnlocalizedName("dreamPie").setCreativeTab(DivineRPG.Vethea);
    public static final Item dreamCake = new ItemVetheanFood(x.dreamCakeID, 8, 0.8F, true).registerTextures("DreamCake").setUnlocalizedName("dreamCake").setCreativeTab(DivineRPG.Vethea);

    public static final Item dreamSweets = new ItemVetheanHealingFood(x.dreamSweetsID, 0, 0F, false, 2).registerTextures("DreamSweets").setUnlocalizedName("dreamSweets").setCreativeTab(DivineRPG.Vethea);
    public static final Item dreamSours = new ItemVetheanHealingFood(x.dreamSoursID, 0, 0F, false, 8).registerTextures("DreamSours").setUnlocalizedName("dreamSours").setCreativeTab(DivineRPG.Vethea);

    public static final Item dirtyPearls = new ItemDivineRPG(x.dirtyPearlsID).registerTextures("DirtyPearls").setUnlocalizedName("dirtyPearls").setCreativeTab(DivineRPG.Vethea);
    public static final Item cleanPearls = new ItemDivineRPG(x.cleanPearlsID).registerTextures("CleanPearls").setUnlocalizedName("cleanPearls").setCreativeTab(DivineRPG.Vethea);
    public static final Item polishedPearls = new ItemDivineRPG(x.polishedPearlsID).registerTextures("PolishedPearls").setUnlocalizedName("polishedPearls").setCreativeTab(DivineRPG.Vethea);
    public static final Item shinyPearls = new ItemDivineRPG(x.shinyPearlsID).registerTextures("ShinyPearls").setUnlocalizedName("shinyPearls").setCreativeTab(DivineRPG.Vethea);

    public static final Item honeychunk = new ItemDivineRPG(x.honeychunkID).registerTextures("Honeysuckle").setUnlocalizedName("honeychunk").setCreativeTab(DivineRPG.Vethea);
    public static final Item rockChunks = new ItemDivineRPG(x.rockChunksID).registerTextures("RockChunks").setUnlocalizedName("rockChunks").setCreativeTab(DivineRPG.Vethea);
    public static final Item fyrossom = new ItemDivineRPG(x.fyrossomID).registerTextures("Fyrossom").setUnlocalizedName("fyrossom").setCreativeTab(DivineRPG.Vethea);
    public static final Item heivaBelt = new ItemDivineRPG(x.heivaBeltID).registerTextures("HeivaBelt").setUnlocalizedName("heivaBelt").setCreativeTab(DivineRPG.Vethea);
    public static final Item mooncloud = new ItemDivineRPG(x.mooncloudID).registerTextures("MoonCloud").setUnlocalizedName("mooncloud").setCreativeTab(DivineRPG.Vethea);
    public static final Item wormChunks = new ItemDivineRPG(x.wormChunksID).registerTextures("WormChunk").setUnlocalizedName("wormChunk").setCreativeTab(DivineRPG.Vethea);
    public static final Item vhraakTeeth = new ItemDivineRPG(x.vhraakTeethID).registerTextures("VhraakTeeth").setUnlocalizedName("vhraakTeeth").setCreativeTab(DivineRPG.Vethea);

    public static final Item dreamflint = new ItemDreamflint(x.dreamflintID).registerTextures("DreamFlint").setUnlocalizedName("dreamflint").setCreativeTab(DivineRPG.Vethea);
    public static final Item moonclock = new ItemMoonclock(x.moonclockID).registerTextures("MoonClock").setUnlocalizedName("moonclock").setCreativeTab(DivineRPG.Vethea);
    public static final Item spinebackChunk = new ItemSpinebackChunk(x.spinebackChunkID).registerTextures("SpinebackChunk").setUnlocalizedName("spinebackChunk").setCreativeTab(DivineRPG.Vethea);

    public static final Item teakerCannon = new ItemVetheanCannon(x.teakerCannonID, 3, "TeakerCannon").registerTextures("TeakerCannon").setCreativeTab(DivineRPG.Vethea);
    public static final Item amthrimisCannon = new ItemVetheanCannon(x.amthirmisCannonID, 5, "amthirmisCannon").registerTextures("AmthirmisCannon").setCreativeTab(DivineRPG.Vethea);
    public static final Item darvenCannon = new ItemVetheanCannon(x.darvenCannonID, 8, "darvenCannon").registerTextures("DarvenCannon").setCreativeTab(DivineRPG.Vethea);
    public static final Item cermileCannon = new ItemVetheanCannon(x.cermileCannonID, 12, "cermileCannon").registerTextures("CermileCannon").setCreativeTab(DivineRPG.Vethea);
    public static final Item pardimalCannon = new ItemVetheanCannon(x.pardimalCannonID, 15, "pardimalCannon").registerTextures("PardimalWarCannon").setCreativeTab(DivineRPG.Vethea);
    public static final Item quadroticCannon = new ItemVetheanCannon(x.quadroticCannonID, 19, "quadroticCannon").registerTextures("QuadroticWarCannon").setCreativeTab(DivineRPG.Vethea);
    public static final Item karosCannonItem = new ItemVetheanCannon(x.karosCannonItemID, 21, "karosCannonItem").registerTextures("KarosWarCannon").setCreativeTab(DivineRPG.Vethea);
    public static final Item heliosisCannon = new ItemVetheanCannon(x.heliosisCannonID, 28, "heliosisCannon").registerTextures("HeliosisWrathCannon").setCreativeTab(DivineRPG.Vethea);
    public static final Item arksianeCannon = new ItemVetheanCannon(x.arksianeCannonID, 36, "arksianeCannon").registerTextures("ArksianeWrathCannon").setCreativeTab(DivineRPG.Vethea);

    public static final Item eversight = new ItemVetheanEversight(x.eversightID, 42, "eversight").registerTextures("Eversight").setCreativeTab(DivineRPG.Vethea);
    public static final Item everlight = new ItemVetheanHammerSword(x.everlightID, "everlight", 44).registerTextures("Everlight").setCreativeTab(DivineRPG.Vethea);
    public static final Item everbright = new ItemVetheanClaw(x.everbrightID, "everbright", 42).registerTextures("Everbright").setCreativeTab(DivineRPG.Vethea);
    public static final Item everfight = new ItemVetheanBow(x.everfightID, 4.6D, everArrow, "everfight", false, 25, 25).setUnlocalizedName("Everfright").setCreativeTab(DivineRPG.Vethea);
    public static final Item evernight = new ItemEvernight(x.evernightID, 115, 200).registerTextures("Evernight").setUnlocalizedName("evernight").setCreativeTab(DivineRPG.Vethea);

    public static final Item teakerStaff = new ItemVetheanStaff(x.teakerStaffID, 3, 10).registerTextures("TeakerStaff").setUnlocalizedName("TeakerStaff").setCreativeTab(DivineRPG.Vethea);
    public static final Item amthrimisStaff = new ItemVetheanStaff(x.amthirmisStaffID, 5, 10).registerTextures("AmthirmisStaff").setUnlocalizedName("amthirmisStaff").setCreativeTab(DivineRPG.Vethea);
    public static final Item darvenStaff = new ItemVetheanStaff(x.darvenStaffID, 8, 10).registerTextures("DarvenStaff").setUnlocalizedName("darvenStaff").setCreativeTab(DivineRPG.Vethea);
    public static final Item cermileStaff = new ItemVetheanStaff(x.cermileStaffID, 12, 10).registerTextures("CermileStaff").setUnlocalizedName("cermileStaff").setCreativeTab(DivineRPG.Vethea);
    public static final Item pardimalStaff = new ItemVetheanStaff(x.pardimalStaffID, 15, 10).registerTextures("PardimalWarStaff").setUnlocalizedName("pardimalStaff").setCreativeTab(DivineRPG.Vethea);
    public static final Item quadroticStaff = new ItemVetheanStaff(x.quadroticStaffID, 19, 10).registerTextures("QuadroticWarStaff").setUnlocalizedName("quadroticStaff").setCreativeTab(DivineRPG.Vethea);
    public static final Item karosStaff = new ItemVetheanStaff(x.karosStaffID, 21, 10).registerTextures("KarosWarStaff").setUnlocalizedName("karosStaffItem").setCreativeTab(DivineRPG.Vethea);
    public static final Item heliosisStaff = new ItemVetheanStaff(x.heliosisStaffID, 28, 10).registerTextures("HeliosisWrathStaff").setUnlocalizedName("heliosisStaff").setCreativeTab(DivineRPG.Vethea);
    public static final Item arksianeStaff = new ItemVetheanStaff(x.arksianeStaffID, 36, 10).registerTextures("ArksianeWrathStaff").setUnlocalizedName("arksianeStaff").setCreativeTab(DivineRPG.Vethea);
    public static final Item spinebackStaff = new ItemVetheanStaff(x.spinebackStaffID, 50, 10).registerTextures("SpinebackStaff").setUnlocalizedName("spinebackStaff").setCreativeTab(DivineRPG.Vethea);

    public static final Item BarredDoor = new ItemBarredDoor(x.barredDoorItemID, Material.wood).setCreativeTab(DivineRPG.Vethea).setUnlocalizedName("BarredDoor");

    /*public static final Item degradedHelmetMelee = new ItemVetheanArmor(4453, degradedRender, "DHM", 0, 15, "Melee", "").setUnlocalizedName("degradedHelmetMelee").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item degradedHelmetRanged = new ItemVetheanArmor(4454, degradedRender, "DMR", 0, 15, "Ranged", "").setUnlocalizedName("degradedHelmetRanged").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item degradedHelmetArcana = new ItemVetheanArmor(4456, degradedRender, "DHA", 0, 15, "Arcana", "").setUnlocalizedName("degradedHelmetArcana").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item degradedChest = new ItemVetheanArmor(4457, degradedRender, "DC", 1, 15, "", "").setUnlocalizedName("degradedChest").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item degradedLegs = new ItemVetheanArmor(4459, degradedRender, "DL", 2, 15, "", "").setUnlocalizedName("degradedLegs").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item degradedBoots = new ItemVetheanArmor(4460, degradedRender, "DB", 3, 15, "", "").setUnlocalizedName("degradedBoots").setCreativeTab(DivineRPG.DivineArmor);

        public static final Item finishedHelmetMelee = new ItemVetheanArmor(4461, finishedRender, "", 0, 30, "Melee", "").setUnlocalizedName("finishedHelmetMelee").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item finishedHelmetRanged = new ItemVetheanArmor(4461, finishedRender, "", 0, 30, "Ranged", "").setUnlocalizedName("finishedHelmetRanged").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item finishedHelmetArcana = new ItemVetheanArmor(4462, finishedRender, "", 0, 30, "Arcana", "").setUnlocalizedName("finishedHelmetArcana").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item finishedChest = new ItemVetheanArmor(4463, finishedRender, "", 1, 30, "", "").setUnlocalizedName("finishedChest").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item finishedLegs = new ItemVetheanArmor(4464, finishedRender, "", 2, 30, "", "").setUnlocalizedName("finishedLegs").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item finishedBoots = new ItemVetheanArmor(4465, finishedRender, "", 3, 30, "", "").setUnlocalizedName("finishedBoots").setCreativeTab(DivineRPG.DivineArmor);

        public static final Item glisteningHelmetMelee = new ItemVetheanArmor(4466, glisteningRender, "", 0, 45, "Melee", "+3 Melee Damage3").setUnlocalizedName("glisteningHelmetMelee").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item glisteningHelmetRanged = new ItemVetheanArmor(4467, glisteningRender, "", 0, 45, "Ranged", "1.4x Movement Speed").setUnlocalizedName("glisteningHelmetRanged").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item glisteningHelmetArcana = new ItemVetheanArmor(4468, glisteningRender, "", 0, 45, "Arcana", "2x Jump Height").setUnlocalizedName("glisteningHelmetArcana").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item glisteningChest = new ItemVetheanArmor(4469, glisteningRender, "", 1, 45, "", "").setUnlocalizedName("glisteningChest").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item glisteningLegs = new ItemVetheanArmor(4470, glisteningRender, "", 2, 45, "", "").setUnlocalizedName("glisteningLegs").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item glisteningBoots = new ItemVetheanArmor(4471, glisteningRender, "", 3, 45, "", "").setUnlocalizedName("glisteningBoots").setCreativeTab(DivineRPG.DivineArmor);

        public static final Item demonizedHelmetMelee = new ItemVetheanArmor(4472, demonizedRender, "", 0, 55, "Melee", "+6 Melee Damage").setUnlocalizedName("demonizedHelmetMelee").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item demonizedHelmetRanged = new ItemVetheanArmor(4473, demonizedRender, "", 0, 55, "Ranged", "1.8X Movement Speed").setUnlocalizedName("demonizedHelmetRanged").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item demonizedHelmetArcana = new ItemVetheanArmor(4474, demonizedRender, "", 0, 55, "Arcana", "3x Jump Height").setUnlocalizedName("demonizedHelmetArcana").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item demonizedChest = new ItemVetheanArmor(4475, demonizedRender, "", 1, 55, "", "").setUnlocalizedName("demonizedChest").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item demonizedLegs = new ItemVetheanArmor(4476, demonizedRender, "", 2, 55, "", "").setUnlocalizedName("demonizedLegs").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item demonizedBoots = new ItemVetheanArmor(4477, demonizedRender, "", 3, 55, "", "").setUnlocalizedName("demonizedBoots").setCreativeTab(DivineRPG.DivineArmor);

        public static final Item tormentedHelmetMelee = new ItemVetheanArmor(4478, tormentedRender, "", 0, 70, "Melee", "+9 Melee Damage").setUnlocalizedName("tormentedHelmetMelee").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item tormentedHelmetRanged = new ItemVetheanArmor(4479, tormentedRender, "", 0, 70, "Ranged", "2x Movement Speed").setUnlocalizedName("tormentedHelmetRanged").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item tormentedHelmetArcana = new ItemVetheanArmor(4480, tormentedRender, "", 0, 70, "Arcana", "4x Jump Height").setUnlocalizedName("tormentedHelmetArcana").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item tormentedChest = new ItemVetheanArmor(4481, tormentedRender, "", 1, 70, "", "").setUnlocalizedName("tormentedChest").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item tormentedLegs = new ItemVetheanArmor(4482, tormentedRender, "", 2, 70, "", "").setUnlocalizedName("tormentedLegs").setCreativeTab(DivineRPG.DivineArmor);
        public static final Item tormentedBoots = new ItemVetheanArmor(4483, tormentedRender, "", 3, 70, "", "").setUnlocalizedName("tormentedBoots").setCreativeTab(DivineRPG.DivineArmor);	
     */ 

    public static void addNames(){
        LanguageRegistry.addName(teakerBow, "Teaker Bow");
        LanguageRegistry.addName(amthrimisBow, "Amthirmis Bow"); 
        LanguageRegistry.addName(darvenBow, "Darven Bow");
        LanguageRegistry.addName(cermileBow, "Cermile Bow");
        LanguageRegistry.addName(pardimalBow, "Pardimal WarBow");
        LanguageRegistry.addName(quadroticBow, "Quadrotic WarBow");
        LanguageRegistry.addName(karosBow, "Karos WarBow");
        LanguageRegistry.addName(heliosisBow, "Heliosis WrathBow");
        LanguageRegistry.addName(arksianeBow, "Arksiane  WrathBow");

        LanguageRegistry.addName(teakerHammer, "Teaker Hammer");
        LanguageRegistry.addName(amthrimisHammer, "Amthirmis Hammer");
        LanguageRegistry.addName(darvenHammer, "Darven Hammer");
        LanguageRegistry.addName(cermileHammer, "Cermile Hammer");
        LanguageRegistry.addName(pardimalHammer, "Pardimal WarHammer");
        LanguageRegistry.addName(quadroticHammer, "Quadrotic WarHammer");
        LanguageRegistry.addName(karosHammer, "Karos WarHammer");
        LanguageRegistry.addName(heliosisHammer, "Heliosis WrathHammer");
        LanguageRegistry.addName(arksianeHammer, "Arksiane  WrathHammer");
        LanguageRegistry.addName(spinebackHammer, "Spineback  Hammer");


        LanguageRegistry.addName(teakerSword, "Teaker Backsword");
        LanguageRegistry.addName(amthrimisSword, "Amthirmis Backsword");
        LanguageRegistry.addName(darvenSword, "Darven Backsword");
        LanguageRegistry.addName(cermileSword, "Cermile Backsword");
        LanguageRegistry.addName(pardimalSword, "Pardimal WarBacksword");
        LanguageRegistry.addName(quadroticSword, "Quadrotic WarBacksword");
        LanguageRegistry.addName(karosSword, "Karos WarBacksword");
        LanguageRegistry.addName(heliosisSword, "Heliosis WrathBacksword");
        LanguageRegistry.addName(arksianeSword, "Arksiane  WrathBacksword");

        LanguageRegistry.addName(teakerSword, "Teaker Backsword");
        LanguageRegistry.addName(amthrimisSword, "Amthirmis Backsword");
        LanguageRegistry.addName(darvenSword, "Darven Backsword");
        LanguageRegistry.addName(cermileSword, "Cermile Backsword");
        LanguageRegistry.addName(pardimalSword, "Pardimal Warsword");
        LanguageRegistry.addName(quadroticSword, "Quadrotic Warsword");
        LanguageRegistry.addName(karosSword, "Karos Warsword");
        LanguageRegistry.addName(heliosisSword, "Heliosis Wrathsword");
        LanguageRegistry.addName(arksianeSword, "Arksiane  Wrathsword");

        LanguageRegistry.addName(teakerDisk, "Teaker Disc");
        LanguageRegistry.addName(amthrimisDisk, "Amthirmis Disc");
        LanguageRegistry.addName(darvenDisk, "Darven Disc");
        LanguageRegistry.addName(cermileDisk, "Cermile Disc");
        LanguageRegistry.addName(pardimalDisk, "Pardimal WarDisc");
        LanguageRegistry.addName(quadroticDisk, "Quadrotic WarDisc");
        LanguageRegistry.addName(karosDisk, "Karos WarDisc");
        LanguageRegistry.addName(heliosisDisk, "Heliosis WrathDisc");
        LanguageRegistry.addName(arksianeDisk, "Arksiane  WrathDisc");


        LanguageRegistry.addName(teakerStaff, "Teaker Staff");
        LanguageRegistry.addName(amthrimisStaff, "Amthirmis Staff");
        LanguageRegistry.addName(darvenStaff, "Darven Staff");
        LanguageRegistry.addName(cermileStaff, "Cermile Staff");
        LanguageRegistry.addName(pardimalStaff, "Pardimal WarStaff");
        LanguageRegistry.addName(quadroticStaff, "Quadrotic WarStaff");
        LanguageRegistry.addName(karosStaff, "Karos WarStaff");
        LanguageRegistry.addName(heliosisStaff, "Heliosis WrathStaff");
        LanguageRegistry.addName(arksianeStaff, "Arksiane WrathStaff");


        LanguageRegistry.addName(teakerCannon, "Teaker Cannon");
        LanguageRegistry.addName(amthrimisCannon, "Amthirmis Cannon");
        LanguageRegistry.addName(darvenCannon, "Darven Cannon");
        LanguageRegistry.addName(cermileCannon, "Cermile Cannon");
        LanguageRegistry.addName(pardimalCannon, "Pardimal WarCannon");
        LanguageRegistry.addName(quadroticCannon, "Quadrotic WarCannon");
        LanguageRegistry.addName(karosCannonItem, "Karos WarCannon");
        LanguageRegistry.addName(heliosisCannon, "Heliosis WrathCannon");
        LanguageRegistry.addName(arksianeCannon, "Arksiane  WrathCannon");


        LanguageRegistry.addName(teakerClaw, "Teaker Claw");
        LanguageRegistry.addName(amthrimisClaw, "Amthirmis Claw");
        LanguageRegistry.addName(darvenClaw, "Darven Claw");
        LanguageRegistry.addName(cermileClaw, "Cermile Claw");
        LanguageRegistry.addName(pardimalClaw, "Pardimal WarClaw");
        LanguageRegistry.addName(quadroticClaw, "Quadrotic WarClaw");
        LanguageRegistry.addName(karosClaw, "Karos WarClaw");
        LanguageRegistry.addName(heliosisClaw, "Heliosis WrathClaw");
        LanguageRegistry.addName(arksianeClaw, "Arksiane  WrathClaw");

        LanguageRegistry.addName(teakerLump, "Teaker Lump");
        LanguageRegistry.addName(amthrimisLump, "Amthirmis Lump");
        LanguageRegistry.addName(darvenLump, "Darven Lump");
        LanguageRegistry.addName(cermileLump, "Cermile Lump");
        LanguageRegistry.addName(pardimalLump, "Pardimal Lump");
        LanguageRegistry.addName(quadroticLump, "Quadrotic Lump");
        LanguageRegistry.addName(karosLump, "Karos Lump");
        LanguageRegistry.addName(heliosisLump, "Heliosis Lump");
        LanguageRegistry.addName(arksianeLump, "Arksiane  Lump");

        LanguageRegistry.addName(acidfire, "Acid");
        /*LanguageRegistry.addName(degradedHelmetArcana, "Degraded Hood");
		LanguageRegistry.addName(degradedHelmetRanged, "Degraded Mask");
		LanguageRegistry.addName(degradedHelmetMelee, "Degraded Helmet");
		LanguageRegistry.addName(degradedChest, "Degraded Body");
		LanguageRegistry.addName(degradedLegs, "Degraded Legs");
		LanguageRegistry.addName(degradedBoots, "Degraded Boots");

		LanguageRegistry.addName(finishedHelmetArcana, "Finished Hood");
		LanguageRegistry.addName(finishedHelmetRanged, "Finished Mask");
		LanguageRegistry.addName(finishedHelmetMelee, "Finished Helmet");
		LanguageRegistry.addName(finishedChest, "Finished Body");
		LanguageRegistry.addName(finishedLegs, "Finished Legs");
		LanguageRegistry.addName(finishedBoots, "Finished Boots");

		LanguageRegistry.addName(glisteningHelmetArcana, "Glistening Hood");
		LanguageRegistry.addName(glisteningHelmetRanged, "Glistening Mask");
		LanguageRegistry.addName(glisteningHelmetMelee, "Glistening Helmet");
		LanguageRegistry.addName(glisteningChest, "Glistening Body");
		LanguageRegistry.addName(glisteningLegs, "Glistening Legs");
		LanguageRegistry.addName(glisteningBoots, "Glistening Boots");

		LanguageRegistry.addName(demonizedHelmetArcana, "Demonized Hood");
		LanguageRegistry.addName(demonizedHelmetRanged, "Demonized Mask");
		LanguageRegistry.addName(demonizedHelmetMelee, "Demonized Helmet");
		LanguageRegistry.addName(demonizedChest, "Demonized Body");
		LanguageRegistry.addName(demonizedLegs, "Demonized Legs");
		LanguageRegistry.addName(demonizedBoots, "Demonized Boots");

		LanguageRegistry.addName(tormentedHelmetArcana, "Tormented Hood");
		LanguageRegistry.addName(tormentedHelmetRanged, "Tormented Mask");
		LanguageRegistry.addName(tormentedHelmetMelee, "Tormented Helmet");
		LanguageRegistry.addName(tormentedChest, "Tormented Body");
		LanguageRegistry.addName(tormentedLegs, "Tormented Legs");
		LanguageRegistry.addName(tormentedBoots, "Tormented Boots");
         */		
        LanguageRegistry.addName(dreamCarrot, "Dream Carrot");
        LanguageRegistry.addName(dreamPie, "Dream Pie");
        LanguageRegistry.addName(dreamCake, "Dream Cake");
        LanguageRegistry.addName(dreamMelon, "Dream Melon");
        LanguageRegistry.addName(dreamSweets, "Dream Sweets");
        LanguageRegistry.addName(dreamSours, "Dream Sours");
        LanguageRegistry.addName(dirtyPearls, "Dirty Pearls");
        LanguageRegistry.addName(cleanPearls, "Clean Pearls");
        LanguageRegistry.addName(polishedPearls, "Polished Pearls");
        LanguageRegistry.addName(shinyPearls, "Shiny Pearls");
        LanguageRegistry.addName(everlight, "Everlight");
        LanguageRegistry.addName(eversight, "Eversight");
        LanguageRegistry.addName(evernight, "Evernight");
        LanguageRegistry.addName(everfight, "Everfright");
        LanguageRegistry.addName(everbright, "Everbright");
        LanguageRegistry.addName(vetheanBowTemplate, "Bow Template");
        LanguageRegistry.addName(vetheanBackswordTemplate, "Backsword Template");
        LanguageRegistry.addName(vetheanDiskTemplate, "Disc Template");
        LanguageRegistry.addName(vetheanCannonTemplate, "Cannon Template");
        LanguageRegistry.addName(vetheanClawTemplate, "Claw Template");
        LanguageRegistry.addName(vetheanDegradedTemplate, "Degraded Template");
        LanguageRegistry.addName(vetheanTormentedTemplate, "Tormented Template");
        LanguageRegistry.addName(vetheanDemonizedTemplate, "Demonized Template");
        LanguageRegistry.addName(vetheanGlisteningTemplate, "Glistening Template");
        LanguageRegistry.addName(vetheanFinishedTemplate, "Finished Template");
        LanguageRegistry.addName(vetheanHammerTemplate, "Hammer Template");
        LanguageRegistry.addName(vetheanStaffTemplate, "Staff Template");

        LanguageRegistry.addName(honeysuckle, "Honeysuckle");
        LanguageRegistry.addName(honeychunk, "Honey Chunk");
        LanguageRegistry.addName(fyrossom, "Fyrossom");
        LanguageRegistry.addName(mooncloud, "Mooncloud");
        LanguageRegistry.addName(rockChunks, "Rock Chunks");

        LanguageRegistry.addName(dreamflint, "Dream Flint");
        LanguageRegistry.addName(moonclock, "Moon Clock");
        LanguageRegistry.addName(dreamPowder, "Dream Powder");
        LanguageRegistry.addName(heivaBelt, "Band of Heiva Hunting");

        LanguageRegistry.addName(vetheanArrow, "Teaker Arrows");
        LanguageRegistry.addName(vetheanArrow2, "Darven Arrows");
        LanguageRegistry.addName(vetheanWarArrow, "Pardimal Arrows");
        LanguageRegistry.addName(vetheanWrathArrow, "Karos Arrows");
        LanguageRegistry.addName(everArrow, "Ever Arrows");


    }
}
