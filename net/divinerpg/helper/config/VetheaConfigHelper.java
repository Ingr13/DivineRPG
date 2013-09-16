package net.divinerpg.helper.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class VetheaConfigHelper {
	
	public static int teakerSwordID;
    public static int amthirmisSwordID;
    public static int darvenSwordID;
    public static int cermileSwordID;
    public static int pardimalSwordID;
    public static int quadroticSwordID;
    public static int karosSwordID;
    public static int heliosisSwordID;
    public static int arksianeSwordID;
    
    public static int teakerHammerID;
    public static int amthirmisHammerID;
    public static int darvenHammerID;
    public static int cermileHammerID;
    public static int pardimalHammerID;
    public static int quadroticHammerID;
    public static int karosHammerID;
    public static int heliosisHammerID;
    public static int arksianeHammerID;
    
    public static int teakerBowID;
    public static int amthirmisBowID;
    public static int darvenBowID;
    public static int cermileBowID;
    public static int pardimalBowID;
    public static int quadroticBowID;
    public static int karosBowID;
    public static int heliosisBowID;
    public static int arksianeBowID;
    
    public static int teakerCannonID;
    public static int amthirmisCannonID;
    public static int darvenCannonID;
    public static int cermileCannonID;
    public static int pardimalCannonID;
    public static int quadroticCannonID;
    public static int karosCannonItemID;
    public static int heliosisCannonID;
    public static int arksianeCannonID;
    
    public static int teakerClawID;
    public static int amthirmisClawID;
    public static int darvenClawID;
    public static int cermileClawID;
    public static int pardimalClawID;
    public static int quadroticClawID;
    public static int karosClawID;
    public static int heliosisClawID;
    public static int arksianeClawID;
    
    public static int teakerDiskID;
    public static int amthirmisDiskID;
    public static int darvenDiskID;
    public static int cermileDiskID;
    public static int pardimalDiskID;
    public static int quadroticDiskID;
    public static int karosDiskID;
    public static int heliosisDiskID;
    public static int arksianeDiskID;

    public static int acidfireID;
    public static int vetheanArrowID;
    public static int vetheanArrow2ID;
    public static int vetheanWarArrowID;
    public static int vetheanWrathArrowID;
    

    public static int vetheanHammerTemplateID;
    public static int vetheanBackswordTemplateID;
    public static int vetheanBowTemplateID;
    public static int vetheanCannonTemplateID;
    public static int vetheanClawTemplateID;
    public static int vetheanDiskTemplateID;
    public static int vetheanStaffTemplateID;

    public static int vetheanDegradedTemplateID;
    public static int vetheanFinishedTemplateID;
    public static int vetheanGlisteningTemplateID;
    public static int vetheanDemonizedTemplateID;
    public static int vetheanTormentedTemplateID;
    
    public static int honeysuckleID;
    public static int dreamCarrotID;
    public static int dreamMelonID;
    public static int dreamPieID;
    public static int dreamCakeID;
    
    public static int teakerLumpID;
    public static int amthirmisLumpID;
    public static int darvenLumpID;
    public static int cermileLumpID;
    public static int pardimalLumpID;
    public static int quadroticLumpID;
    public static int karosLumpID;
    public static int heliosisLumpID;
    public static int arksianeLumpID;

    public static int dreamSweetsID;
    public static int dreamSoursID;
    

    public static int degradedHelmetMeleeID;
    public static int degradedHelmetRangedID;
    public static int degradedHelmetArcanaID;
    public static int degradedChestID;
    public static int degradedLegsID;
    public static int degradedBootsID;

    public static int finishedHelmetMeleeID;
    public static int finishedHelmetRangedID;
    public static int finishedHelmetArcanaID;
    public static int finishedChestID;
    public static int finishedLegsID;
    public static int finishedBootsID;

    public static int glisteningHelmetMeleeID;
    public static int glisteningHelmetRangedID;
    public static int glisteningHelmetArcanaID;
    public static int glisteningChestID;
    public static int glisteningLegsID;
    public static int glisteningBootsID;

    public static int demonizedHelmetMeleeID;
    public static int demonizedHelmetRangedID;
    public static int demonizedHelmetArcanaID;
    public static int demonizedChestID;
    public static int demonizedLegsID;
    public static int demonizedBootsID;

    public static int tormentedHelmetMeleeID;
    public static int tormentedHelmetRangedID;
    public static int tormentedHelmetArcanaID;
    public static int tormentedChestID;
    public static int tormentedLegsID;
    public static int tormentedBootsID;
    

    public static int dirtyPearlsID;
    public static int cleanPearlsID;
    public static int polishedPearlsID;
    public static int shinyPearlsID;
    
    public static int honeychunkID;
    public static int rockChunksID;
    public static int fyrossomID;
    public static int heivaBeltID;
    public static int mooncloudID;
    public static int wormChunksID;
    public static int vhraakTeethID;
    
    public static int dreamflintID;
    public static int moonclockID;
    public static int spinebackChunkID;

    public static int spinebackCannonID;
    public static int spinebackDiscID;
    public static int spinebackHammerID;
    public static int spinebackStaffID;
    
    public static int barredDoorItemID;

    public static int everlightID;
    public static int everbrightID;
    public static int evernightID;
    public static int eversightID;
    public static int everfightID;

    public static int everArrowID;
    
    public static int teakerStaffID;
    public static int amthirmisStaffID;
    public static int darvenStaffID;
    public static int cermileStaffID;
    public static int pardimalStaffID;
    public static int quadroticStaffID;
    public static int karosStaffID;
    public static int heliosisStaffID;
    public static int arksianeStaffID;
    
    public static int ArcanaBarYoffset;
    
    public static int dreamPowderID;
    
    public static int vetheaPortalID;
    public static int dreamstoneID;
    public static int dreamgrassID;
    public static int dreamdirtID;
    public static int dreamwoodID;
    public static int dreamwoodLeavesID;
    public static int dreambricksID;
    public static int dreambricks2ID;
    public static int lunastoneID;
    public static int lunabricksID;
    public static int metalCagingID;
    public static int dreamlampID;
    public static int dreamlampOnID;
    public static int weedwoodVineID;
    public static int blossomingWeedwoodVineID;
    public static int cryptWallID;
    public static int smoothGlassID;
    public static int villageLampID;
    public static int infusionTableID;
    public static int cellLampID;
    public static int barredDoorID;
    public static int firecrystalID;
    public static int firelightID;
    public static int hyrewoodID;
    public static int mintwoodLeavesID;
    public static int firewallID;
    public static int karosHeatTileRedID;
    public static int karosHeatTileGreenID;
    public static int karosCannonID;
    public static int helioticBeamID;
    public static int cryptFloorID;
    public static int firewoodID;
    public static int bacterialAcidID;
    public static int blockAcidID;
    public static int hallWallID;
    public static int wreckAltarID;
    public static int raglokAltarID;
    public static int karosAltarID;
    public static int lunicAltarID;
    public static int hiveWallID;
    public static int quadroticAltarID;
    public static int everstoneID;
    public static int lunicAcidID;
    public static int firewoodLeavesID;
    public static int hyrewoodLeavesID;
    public static int gemtopGreenID;
    public static int gemtopPurpleID;
    public static int greenDulahID;
    public static int yellowDulahID;
    public static int mintwoodID;
    public static int lightFirewoodLeavesID;
    public static int cracklespikeID;
    public static int ferniteID;
    public static int bulatobeID;
    public static int shineGrassID;
    public static int shimmerID;
    public static int dreamglowID;
    public static int hyrewoodVineID;
    public static int chamberWallID;
    public static int chamberWall1ID;
    public static int chamberWall2ID;
    public static int darkEverstoneID;
    public static int whiteEverstoneID;
    public static int karosBricksID;
    public static int karosBricks2ID;
    public static int hungerstone1ID;
    public static int hungerstone2ID;
    public static int biphronSpawnerID;
    public static int gorgosionSpawnerID;
    public static int duoSpawnerID;
    public static int twinsSpawnerID;
    public static int vermenousSpawnerID;
    public static int dreamwreckerSpawnerID;
    public static int lorgaSpawnerID;
    public static int purpleFireID;

	public static void initConfig(FMLPreInitializationEvent event){
		File file = new File(event.getModConfigurationDirectory(), "VetheaConfigHelper.cfg");
		Configuration config = new Configuration(file);
		
		config.load();
		
		teakerDiskID = config.getItem("TeakerDisk", 3194).getInt();
        amthirmisDiskID = config.getItem("amthirmisDisk", 3195).getInt();
        darvenDiskID = config.getItem("darvenDisk", 3196).getInt();
        cermileDiskID = config.getItem("cermileDisk", 3197).getInt();
        pardimalDiskID = config.getItem("pardimalDisk", 3198).getInt();
        quadroticDiskID = config.getItem("quadroticDisk", 3199).getInt();
        karosDiskID = config.getItem("karosDisk", 3200).getInt();
        heliosisDiskID = config.getItem("heliosisDisk", 3201).getInt();
        arksianeDiskID = config.getItem("arksianeDisk", 3202).getInt();
        
        teakerHammerID = config.getItem("teakerHammer", 3203).getInt();
        amthirmisHammerID = config.getItem("AmthirmisHammer", 3204).getInt();
        darvenHammerID = config.getItem("darvenHammer", 3205).getInt();
        cermileHammerID = config.getItem("cermileHammer", 3206).getInt();
        pardimalHammerID = config.getItem("pardimalHammer", 3207).getInt();
        quadroticHammerID = config.getItem("quadroticHammer", 3208).getInt();
        karosHammerID = config.getItem("karosHammer", 3209).getInt();
        heliosisHammerID = config.getItem("heliosisHammer", 3210).getInt();
        arksianeHammerID = config.getItem("arksianeHammer", 3211).getInt();
        
        teakerSwordID = config.getItem("teakerSword", 3212).getInt();
        amthirmisSwordID = config.getItem("AmthirmisSword", 3213).getInt();
        darvenSwordID = config.getItem("darvenSword", 3214).getInt();
        cermileSwordID = config.getItem("cermileSword", 3215).getInt();
        pardimalSwordID = config.getItem("pardimalSword", 3216).getInt();
        quadroticSwordID = config.getItem("quadroticSword", 3217).getInt();
        karosSwordID = config.getItem("karosSword", 3218).getInt();
        heliosisSwordID = config.getItem("heliosisSword", 3219).getInt();
        arksianeSwordID = config.getItem("arksianeSword", 3220).getInt();
        
        teakerClawID = config.getItem("teakerClaw", 3221).getInt();
        amthirmisClawID = config.getItem("AmthirmisClaw", 3222).getInt();
        darvenClawID = config.getItem("darvenClaw", 3223).getInt();
        cermileClawID = config.getItem("cermileClaw", 3224).getInt();
        pardimalClawID = config.getItem("pardimalClaw", 3225).getInt();
        quadroticClawID = config.getItem("quadroticClaw", 3226).getInt();
        karosClawID = config.getItem("karosClaw", 3227).getInt();
        heliosisClawID = config.getItem("heliosisClaw", 3228).getInt();
        arksianeClawID = config.getItem("arksianeClaw", 3229).getInt();
        
        teakerCannonID = config.getItem("teakerCannon", 3230).getInt();
        amthirmisCannonID = config.getItem("AmthirmisCannon", 3231).getInt();
        darvenCannonID = config.getItem("darvenCannon", 3232).getInt();
        cermileCannonID = config.getItem("cermileCannon", 3233).getInt();
        pardimalCannonID = config.getItem("pardimalCannon", 3234).getInt();
        quadroticCannonID = config.getItem("quadroticCannon", 3235).getInt();
        karosCannonItemID = config.getItem("karosCannon", 3236).getInt();
        heliosisCannonID = config.getItem("heliosisCannon", 3237).getInt();
        arksianeCannonID = config.getItem("arksianeCannon", 3238).getInt();
        
        acidfireID = config.getItem("acidfire", 3239).getInt();
        
        teakerBowID = config.getItem("teakerBow", 3240).getInt();
        amthirmisBowID = config.getItem("AmthirmisBow", 3241).getInt();
        darvenBowID = config.getItem("darvenBow", 3242).getInt();
        cermileBowID = config.getItem("cermileBow", 3243).getInt();
        pardimalBowID = config.getItem("pardimalBow", 3244).getInt();
        quadroticBowID = config.getItem("quadroticBow", 3245).getInt();
        karosBowID = config.getItem("karosBow", 3246).getInt();
        heliosisBowID = config.getItem("heliosisBow", 3247).getInt();
        arksianeBowID = config.getItem("arksianeBow", 3248).getInt();

        vetheanArrowID = config.getItem("vetheanArrow", 3249).getInt();
        vetheanArrow2ID = config.getItem("vetheanArrow2", 3250).getInt();
        vetheanWarArrowID = config.getItem("vetheanWarArrow", 3251).getInt();
        vetheanWrathArrowID = config.getItem("vetheanWrathArrow", 3252).getInt();

        vetheanHammerTemplateID = config.getItem("vetheanHammerTemplate", 3253).getInt();
        vetheanBackswordTemplateID = config.getItem("vetheanBackswordTemplate", 3254).getInt();
        vetheanBowTemplateID = config.getItem("vetheanBowTemplate", 3255).getInt();
        vetheanCannonTemplateID = config.getItem("vetheanCannonTemplate", 3256).getInt();
        vetheanClawTemplateID = config.getItem("vetheanClawTemplate", 3257).getInt();
        vetheanDiskTemplateID = config.getItem("vetheanDiskTemplate", 3258).getInt();
        vetheanStaffTemplateID = config.getItem("vetheanStaffTemplate", 3259).getInt();
        vetheanDegradedTemplateID = config.getItem("vetheanDegradedTemplate", 3260).getInt();
        vetheanFinishedTemplateID = config.getItem("vetheanFinishedTemplate", 3261).getInt();
        vetheanGlisteningTemplateID = config.getItem("vetheanGlisteningTemplate", 3262).getInt();
        vetheanDemonizedTemplateID = config.getItem("vetheanDemonizedTemplate", 3263).getInt();
        vetheanTormentedTemplateID = config.getItem("vetheanTormentedTemplate", 3264).getInt();

        honeysuckleID = config.getItem("honeysuckle", 3265).getInt();
        dreamCarrotID = config.getItem("dreamCarrot", 3266).getInt();
        dreamMelonID = config.getItem("dreamMelon", 3267).getInt();
        dreamPieID = config.getItem("dreamPie", 3268).getInt();
        dreamCakeID = config.getItem("dreamCake", 3269).getInt();
        
        teakerLumpID = config.getItem("teakerLump", 3270).getInt();
        amthirmisLumpID = config.getItem("AmthirmisLump", 3271).getInt();
        darvenLumpID = config.getItem("darvenLump", 3272).getInt();
        cermileLumpID = config.getItem("cermileLump", 3273).getInt();
        pardimalLumpID = config.getItem("pardimalLump", 3274).getInt();
        quadroticLumpID = config.getItem("quadroticLump", 3275).getInt();
        karosLumpID = config.getItem("karosLump", 2276).getInt();
        heliosisLumpID = config.getItem("heliosisLump", 3277).getInt();
        arksianeLumpID = config.getItem("arksianeLump", 3278).getInt();

        dreamSweetsID = config.getItem("dreamSweets", 3279).getInt();
        dreamSoursID = config.getItem("dreamSours", 3280).getInt();
        
        degradedHelmetMeleeID = config.getItem("degradedHelmetMelee", 3281).getInt();
        degradedHelmetRangedID = config.getItem("degradedHelmetRanged", 3282).getInt();
        degradedHelmetArcanaID = config.getItem("degradedHelmetArcana", 3283).getInt();
        degradedChestID = config.getItem("degradedChest", 3284).getInt();
        degradedLegsID = config.getItem("degradedLegs", 3285).getInt();
        degradedBootsID = config.getItem("degradedBoots", 3286).getInt();

        finishedHelmetMeleeID = config.getItem("finishedHelmetMelee", 3287).getInt();
        finishedHelmetRangedID = config.getItem("finishedHelmetRanged", 3288).getInt();
        finishedHelmetArcanaID = config.getItem("finishedHelmetArcana", 3289).getInt();
        finishedChestID = config.getItem("finishedChest", 3290).getInt();
        finishedLegsID = config.getItem("finishedLegs", 3291).getInt();
        finishedBootsID = config.getItem("finishedBoots", 3292).getInt();

        glisteningHelmetMeleeID = config.getItem("glisteningHelmetMelee", 3293).getInt();
        glisteningHelmetRangedID = config.getItem("glisteningHelmetRanged", 3294).getInt();
        glisteningHelmetArcanaID = config.getItem("glisteningHelmetArcana", 3295).getInt();
        glisteningChestID = config.getItem("glisteningChest", 3296).getInt();
        glisteningLegsID = config.getItem("glisteningLegs", 3294).getInt();
        glisteningBootsID = config.getItem("glisteningBoots", 3298).getInt();

        demonizedHelmetMeleeID = config.getItem("demonizedHelmetMelee", 3299).getInt();
        demonizedHelmetRangedID = config.getItem("demonizedHelmetRanged", 3300).getInt();
        demonizedHelmetArcanaID = config.getItem("demonizedHelmetArcana", 3301).getInt();
        demonizedChestID = config.getItem("demonizedChest", 3302).getInt();
        demonizedLegsID = config.getItem("demonizedLegs", 3303).getInt();
        demonizedBootsID = config.getItem("demonizedBoots", 3304).getInt();

        tormentedHelmetMeleeID = config.getItem("tormentedHelmetMelee", 3305).getInt();
        tormentedHelmetRangedID = config.getItem("tormentedHelmetRanged", 3306).getInt();
        tormentedHelmetArcanaID = config.getItem("tormentedHelmetArcana", 3307).getInt();
        tormentedChestID = config.getItem("tormentedChest", 3308).getInt();
        tormentedLegsID = config.getItem("tormentedLegs", 3309).getInt();
        tormentedBootsID = config.getItem("tormentedBoots", 3310).getInt();

        dirtyPearlsID = config.getItem("dirtyPearls", 3311).getInt();
        cleanPearlsID = config.getItem("cleanPearls", 3312).getInt();
        polishedPearlsID = config.getItem("polishedPearls", 3313).getInt();
        shinyPearlsID = config.getItem("shinyPearls", 3314).getInt();

        honeychunkID = config.getItem("honeychunk", 3315).getInt();
        rockChunksID = config.getItem("rockChunks", 3316).getInt();
        fyrossomID = config.getItem("fyrossom", 3317).getInt();
        heivaBeltID = config.getItem("heivaBelt", 3318).getInt();
        mooncloudID = config.getItem("mooncloud", 3319).getInt();
        wormChunksID = config.getItem("wormChunks", 3320).getInt();
        vhraakTeethID = config.getItem("vhraakTeeth", 3321).getInt();

        dreamflintID = config.getItem("dreamflint", 3322).getInt();
        moonclockID = config.getItem("moonclock", 3323).getInt();
        spinebackChunkID = config.getItem("spinebackChunk", 3324).getInt();

        spinebackCannonID = config.getItem("spinebackCannon", 3325).getInt();
        spinebackDiscID = config.getItem("spinebackDisc", 3326).getInt();
        spinebackHammerID = config.getItem("spinebackHammer", 3327).getInt();
        spinebackStaffID = config.getItem("spinebackStaff", 3328).getInt();

        everlightID = config.getItem("everlight", 3329).getInt();
        everbrightID = config.getItem("everbright", 3330).getInt();
        evernightID = config.getItem("evernight", 3331).getInt();
        eversightID = config.getItem("eversight", 3332).getInt();
        everfightID = config.getItem("everfight", 3333).getInt();
        everArrowID = config.getItem("everArrow", 3334).getInt();

        teakerStaffID = config.getItem("teakerStaff", 3335).getInt();
        amthirmisStaffID = config.getItem("AmthirmisStaff", 3336).getInt();
        darvenStaffID = config.getItem("darvenStaff", 3337).getInt();
        cermileStaffID = config.getItem("cermileStaff", 3338).getInt();
        pardimalStaffID = config.getItem("pardimalStaff", 3339).getInt();
        quadroticStaffID = config.getItem("quadroticStaff", 3340).getInt();
        karosStaffID = config.getItem("karosStaff", 3341).getInt();
        heliosisStaffID = config.getItem("heliosisStaff", 3342).getInt();
        arksianeStaffID = config.getItem("arksianeStaff", 3343).getInt();
        dreamPowderID = config.getItem("DreamPowder", 3344).getInt();
		barredDoorItemID = config.getItem("BarredDoorItem", 3484).getInt();

		
		dreamstoneID = config.getBlock("DreamStone", 2500).getInt();
    	vetheaPortalID = config.getBlock("vetheaPortal", 2502).getInt();
        dreamwoodID = config.getBlock("dreamwood", 2503).getInt();
        dreamwoodLeavesID = config.getBlock("dreamwoodLeaves", 2504).getInt();
        dreambricksID = config.getBlock("dreambricks", 2505).getInt();
        lunastoneID = config.getBlock("lunastone", 2506).getInt();
        lunabricksID = config.getBlock("lunabricks", 2507).getInt();
        metalCagingID = config.getBlock("metalCaging", 2508).getInt();
        dreamlampID = config.getBlock("dreamlamp", 2509).getInt();
        dreamlampOnID = config.getBlock("dreamlampOn", 2510).getInt();
        weedwoodVineID = config.getBlock("weedwoodVine", 2511).getInt();
        blossomingWeedwoodVineID = config.getBlock("blossomingWeedwoodVine", 2512).getInt();
        cryptWallID = config.getBlock("cryptWall", 2513).getInt();
        smoothGlassID = config.getBlock("smoothGlass", 2514).getInt();
        villageLampID = config.getBlock("villageLamp", 2515).getInt();
        infusionTableID = config.getBlock("infusionTable", 2516).getInt();
        cellLampID = config.getBlock("cellLamp", 2517).getInt();
        barredDoorID = config.getBlock("barredDoor", 2518).getInt();
        firecrystalID = config.getBlock("firecrystal", 2519).getInt();
        firelightID = config.getBlock("firelight", 2520).getInt();
        hyrewoodID = config.getBlock("hyrewood", 2521).getInt();
        mintwoodLeavesID = config.getBlock("mintwoodLeaves", 2523).getInt();
        firewallID = config.getBlock("firewall", 2524).getInt();
        karosHeatTileRedID = config.getBlock("karosHeatTileRed", 2525).getInt();
        karosHeatTileGreenID = config.getBlock("karosHeatTileGreen", 2526).getInt();
        karosCannonID = config.getBlock("karosCannon", 2527).getInt();
        helioticBeamID = config.getBlock("helioticBeam", 2528).getInt();
        cryptFloorID = config.getBlock("cryptFloor", 2529).getInt();
        firewoodID = config.getBlock("firewood", 2530).getInt();
        chamberWallID = config.getBlock("chamberWall", 2531).getInt();
        chamberWall1ID = config.getBlock("chamberWall1", 2532).getInt();
        chamberWall2ID = config.getBlock("chamberWall2", 2533).getInt();
        bacterialAcidID = config.getBlock("bacterialAcid", 2534).getInt();
        gemtopPurpleID = config.getBlock("gemtops", 2535).getInt();
        yellowDulahID = config.getBlock("yellowDulah", 2536).getInt();
        blockAcidID = config.getBlock("acidBlock", 2537).getInt();
        hallWallID = config.getBlock("hallWall", 2538).getInt();
        wreckAltarID = config.getBlock("wreckAltar", 2539).getInt();
        raglokAltarID = config.getBlock("raglokAltar", 2540).getInt();
        karosAltarID = config.getBlock("karosAltar", 2541).getInt();
        lunicAltarID = config.getBlock("lunicAltar", 2542).getInt();
        hiveWallID = config.getBlock("hiveWall", 2543).getInt();
        quadroticAltarID = config.getBlock("quadroticAltar", 2544).getInt();
        everstoneID = config.getBlock("everstone", 2545).getInt();
        lunicAcidID = config.getBlock("lunicAcid", 2546).getInt();
        firewoodLeavesID = config.getBlock("firewoodLeaves", 2547).getInt();
        hyrewoodLeavesID = config.getBlock("hyrewoodLeaves", 2548).getInt();
        gemtopGreenID = config.getBlock("gemtopsGreen", 2549).getInt();
        greenDulahID = config.getBlock("greenDulah", 2550).getInt();
        mintwoodID = config.getBlock("mintwood", 2551).getInt();
        lightFirewoodLeavesID = config.getBlock("lightFirerwoodLeaves", 2552).getInt();
        cracklespikeID = config.getBlock("cracklespike", 2553).getInt();
        ferniteID = config.getBlock("fernite", 2554).getInt();
        bulatobeID = config.getBlock("bulatobe", 2555).getInt();
        shineGrassID = config.getBlock("shineGrass", 2556).getInt();
        shimmerID = config.getBlock("shimmer", 2557).getInt();
        dreamglowID = config.getBlock("dreamglow", 2558).getInt();
        hyrewoodVineID = config.getBlock("hyrewoodVine", 2559).getInt();
        dreambricks2ID = config.getBlock("dreambricks2", 2560).getInt();
        whiteEverstoneID = config.getBlock("whiteEverstone", 2561).getInt();
        darkEverstoneID = config.getBlock("darkEverstone", 2562).getInt();
        karosBricksID = config.getBlock("karosBricks", 2563).getInt();
        karosBricks2ID = config.getBlock("karosBricks2", 2564).getInt();

        biphronSpawnerID = config.getBlock("briphronSpawner", 2565).getInt();
        gorgosionSpawnerID = config.getBlock("gorgosionSpawner", 2566).getInt();
        twinsSpawnerID = config.getBlock("twinsSpawner", 2567).getInt();
        duoSpawnerID = config.getBlock("duoSpawner", 2568).getInt();
        vermenousSpawnerID = config.getBlock("vermenousSpawner", 2569).getInt();
        dreamwreckerSpawnerID = config.getBlock("dreamwreckerSpawner", 2570).getInt();
        lorgaSpawnerID = config.getBlock("lorgaSpawner", 2571).getInt();
        hungerstone1ID = config.getBlock("hungerstone1", 2572).getInt();
        hungerstone2ID = config.getBlock("hungerstone2", 2573).getInt();
        purpleFireID = config.getBlock("PurpleFire", 2574).getInt();
		
		config.save();
	}
	
}
