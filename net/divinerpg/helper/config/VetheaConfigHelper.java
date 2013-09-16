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
		
		teakerDiskID = config.getItem("TeakerDisk", 3194 - 256).getInt();
        amthirmisDiskID = config.getItem("amthirmisDisk", 3195 - 256).getInt();
        darvenDiskID = config.getItem("darvenDisk", 3196 - 256).getInt();
        cermileDiskID = config.getItem("cermileDisk", 3197 - 256).getInt();
        pardimalDiskID = config.getItem("pardimalDisk", 3198 - 256).getInt();
        quadroticDiskID = config.getItem("quadroticDisk", 3199 - 256).getInt();
        karosDiskID = config.getItem("karosDisk", 3200 - 256).getInt();
        heliosisDiskID = config.getItem("heliosisDisk", 3201 - 256).getInt();
        arksianeDiskID = config.getItem("arksianeDisk", 3202 - 256).getInt();
        
        teakerHammerID = config.getItem("teakerHammer", 3203 - 256).getInt();
        amthirmisHammerID = config.getItem("AmthirmisHammer", 3204 - 256).getInt();
        darvenHammerID = config.getItem("darvenHammer", 3205 - 256).getInt();
        cermileHammerID = config.getItem("cermileHammer", 3206 - 256).getInt();
        pardimalHammerID = config.getItem("pardimalHammer", 3207 - 256).getInt();
        quadroticHammerID = config.getItem("quadroticHammer", 3208 - 256).getInt();
        karosHammerID = config.getItem("karosHammer", 3209 - 256).getInt();
        heliosisHammerID = config.getItem("heliosisHammer", 3210 - 256).getInt();
        arksianeHammerID = config.getItem("arksianeHammer", 3211 - 256).getInt();
        
        teakerSwordID = config.getItem("teakerSword", 3212 - 256).getInt();
        amthirmisSwordID = config.getItem("AmthirmisSword", 3213 - 256).getInt();
        darvenSwordID = config.getItem("darvenSword", 3214 - 256).getInt();
        cermileSwordID = config.getItem("cermileSword", 3215 - 256).getInt();
        pardimalSwordID = config.getItem("pardimalSword", 3216 - 256).getInt();
        quadroticSwordID = config.getItem("quadroticSword", 3217 - 256).getInt();
        karosSwordID = config.getItem("karosSword", 3218 - 256).getInt();
        heliosisSwordID = config.getItem("heliosisSword", 3219 - 256).getInt();
        arksianeSwordID = config.getItem("arksianeSword", 3220 - 256).getInt();
        
        teakerClawID = config.getItem("teakerClaw", 3221 - 256).getInt();
        amthirmisClawID = config.getItem("AmthirmisClaw", 3222 - 256).getInt();
        darvenClawID = config.getItem("darvenClaw", 3223 - 256).getInt();
        cermileClawID = config.getItem("cermileClaw", 3224 - 256).getInt();
        pardimalClawID = config.getItem("pardimalClaw", 3225 - 256).getInt();
        quadroticClawID = config.getItem("quadroticClaw", 3226 - 256).getInt();
        karosClawID = config.getItem("karosClaw", 3227 - 256).getInt();
        heliosisClawID = config.getItem("heliosisClaw", 3228 - 256).getInt();
        arksianeClawID = config.getItem("arksianeClaw", 3229 - 256).getInt();
        
        teakerCannonID = config.getItem("teakerCannon", 3230 - 256).getInt();
        amthirmisCannonID = config.getItem("AmthirmisCannon", 3231 - 256).getInt();
        darvenCannonID = config.getItem("darvenCannon", 3232 - 256).getInt();
        cermileCannonID = config.getItem("cermileCannon", 3233 - 256).getInt();
        pardimalCannonID = config.getItem("pardimalCannon", 3234 - 256).getInt();
        quadroticCannonID = config.getItem("quadroticCannon", 3235 - 256).getInt();
        karosCannonItemID = config.getItem("karosCannon", 3236 - 256).getInt();
        heliosisCannonID = config.getItem("heliosisCannon", 3237 - 256).getInt();
        arksianeCannonID = config.getItem("arksianeCannon", 3238 - 256).getInt();
        
        acidfireID = config.getItem("acidfire", 3239 - 256).getInt();
        
        teakerBowID = config.getItem("teakerBow", 3240 - 256).getInt();
        amthirmisBowID = config.getItem("AmthirmisBow", 3241 - 256).getInt();
        darvenBowID = config.getItem("darvenBow", 3242 - 256).getInt();
        cermileBowID = config.getItem("cermileBow", 3243 - 256).getInt();
        pardimalBowID = config.getItem("pardimalBow", 3244 - 256).getInt();
        quadroticBowID = config.getItem("quadroticBow", 3245 - 256).getInt();
        karosBowID = config.getItem("karosBow", 3246 - 256).getInt();
        heliosisBowID = config.getItem("heliosisBow", 3247 - 256).getInt();
        arksianeBowID = config.getItem("arksianeBow", 3248 - 256).getInt();

        vetheanArrowID = config.getItem("vetheanArrow", 3249 - 256).getInt();
        vetheanArrow2ID = config.getItem("vetheanArrow2", 3250 - 256).getInt();
        vetheanWarArrowID = config.getItem("vetheanWarArrow", 3251 - 256).getInt();
        vetheanWrathArrowID = config.getItem("vetheanWrathArrow", 3252 - 256).getInt();

        vetheanHammerTemplateID = config.getItem("vetheanHammerTemplate", 3253 - 256).getInt();
        vetheanBackswordTemplateID = config.getItem("vetheanBackswordTemplate", 3254 - 256).getInt();
        vetheanBowTemplateID = config.getItem("vetheanBowTemplate", 3255 - 256).getInt();
        vetheanCannonTemplateID = config.getItem("vetheanCannonTemplate", 3256 - 256).getInt();
        vetheanClawTemplateID = config.getItem("vetheanClawTemplate", 3257 - 256).getInt();
        vetheanDiskTemplateID = config.getItem("vetheanDiskTemplate", 3258 - 256).getInt();
        vetheanStaffTemplateID = config.getItem("vetheanStaffTemplate", 3259 - 256).getInt();
        vetheanDegradedTemplateID = config.getItem("vetheanDegradedTemplate", 3260 - 256).getInt();
        vetheanFinishedTemplateID = config.getItem("vetheanFinishedTemplate", 3261 - 256).getInt();
        vetheanGlisteningTemplateID = config.getItem("vetheanGlisteningTemplate", 3262 - 256).getInt();
        vetheanDemonizedTemplateID = config.getItem("vetheanDemonizedTemplate", 3263 - 256).getInt();
        vetheanTormentedTemplateID = config.getItem("vetheanTormentedTemplate", 3264 - 256).getInt();

        honeysuckleID = config.getItem("honeysuckle", 3265 - 256).getInt();
        dreamCarrotID = config.getItem("dreamCarrot", 3266 - 256).getInt();
        dreamMelonID = config.getItem("dreamMelon", 3267 - 256).getInt();
        dreamPieID = config.getItem("dreamPie", 3268 - 256).getInt();
        dreamCakeID = config.getItem("dreamCake", 3269 - 256).getInt();
        
        teakerLumpID = config.getItem("teakerLump", 3270 - 256).getInt();
        amthirmisLumpID = config.getItem("AmthirmisLump", 3271 - 256).getInt();
        darvenLumpID = config.getItem("darvenLump", 3272 - 256).getInt();
        cermileLumpID = config.getItem("cermileLump", 3273 - 256).getInt();
        pardimalLumpID = config.getItem("pardimalLump", 3274 - 256).getInt();
        quadroticLumpID = config.getItem("quadroticLump", 3275 - 256).getInt();
        karosLumpID = config.getItem("karosLump", 2276 - 256).getInt();
        heliosisLumpID = config.getItem("heliosisLump", 3277 - 256).getInt();
        arksianeLumpID = config.getItem("arksianeLump", 3278 - 256).getInt();

        dreamSweetsID = config.getItem("dreamSweets", 3279 - 256).getInt();
        dreamSoursID = config.getItem("dreamSours", 3280 - 256).getInt();
        
        degradedHelmetMeleeID = config.getItem("degradedHelmetMelee", 3281 - 256).getInt();
        degradedHelmetRangedID = config.getItem("degradedHelmetRanged", 3282 - 256).getInt();
        degradedHelmetArcanaID = config.getItem("degradedHelmetArcana", 3283 - 256).getInt();
        degradedChestID = config.getItem("degradedChest", 3284 - 256).getInt();
        degradedLegsID = config.getItem("degradedLegs", 3285 - 256).getInt();
        degradedBootsID = config.getItem("degradedBoots", 3286 - 256).getInt();

        finishedHelmetMeleeID = config.getItem("finishedHelmetMelee", 3287 - 256).getInt();
        finishedHelmetRangedID = config.getItem("finishedHelmetRanged", 3288 - 256).getInt();
        finishedHelmetArcanaID = config.getItem("finishedHelmetArcana", 3289 - 256).getInt();
        finishedChestID = config.getItem("finishedChest", 3290 - 256).getInt();
        finishedLegsID = config.getItem("finishedLegs", 3291 - 256).getInt();
        finishedBootsID = config.getItem("finishedBoots", 3292 - 256).getInt();

        glisteningHelmetMeleeID = config.getItem("glisteningHelmetMelee", 3293 - 256).getInt();
        glisteningHelmetRangedID = config.getItem("glisteningHelmetRanged", 3294 - 256).getInt();
        glisteningHelmetArcanaID = config.getItem("glisteningHelmetArcana", 3295 - 256).getInt();
        glisteningChestID = config.getItem("glisteningChest", 3296 - 256).getInt();
        glisteningLegsID = config.getItem("glisteningLegs", 3294 - 256).getInt();
        glisteningBootsID = config.getItem("glisteningBoots", 3298 - 256).getInt();

        demonizedHelmetMeleeID = config.getItem("demonizedHelmetMelee", 3299 - 256).getInt();
        demonizedHelmetRangedID = config.getItem("demonizedHelmetRanged", 3300 - 256).getInt();
        demonizedHelmetArcanaID = config.getItem("demonizedHelmetArcana", 3301 - 256).getInt();
        demonizedChestID = config.getItem("demonizedChest", 3302 - 256).getInt();
        demonizedLegsID = config.getItem("demonizedLegs", 3303 - 256).getInt();
        demonizedBootsID = config.getItem("demonizedBoots", 3304 - 256).getInt();

        tormentedHelmetMeleeID = config.getItem("tormentedHelmetMelee", 3305 - 256).getInt();
        tormentedHelmetRangedID = config.getItem("tormentedHelmetRanged", 3306 - 256).getInt();
        tormentedHelmetArcanaID = config.getItem("tormentedHelmetArcana", 3307 - 256).getInt();
        tormentedChestID = config.getItem("tormentedChest", 3308 - 256).getInt();
        tormentedLegsID = config.getItem("tormentedLegs", 3309 - 256).getInt();
        tormentedBootsID = config.getItem("tormentedBoots", 3310 - 256).getInt();

        dirtyPearlsID = config.getItem("dirtyPearls", 3311 - 256).getInt();
        cleanPearlsID = config.getItem("cleanPearls", 3312 - 256).getInt();
        polishedPearlsID = config.getItem("polishedPearls", 3313 - 256).getInt();
        shinyPearlsID = config.getItem("shinyPearls", 3314 - 256).getInt();

        honeychunkID = config.getItem("honeychunk", 3315 - 256).getInt();
        rockChunksID = config.getItem("rockChunks", 3316 - 256).getInt();
        fyrossomID = config.getItem("fyrossom", 3317 - 256).getInt();
        heivaBeltID = config.getItem("heivaBelt", 3318 - 256).getInt();
        mooncloudID = config.getItem("mooncloud", 3319 - 256).getInt();
        wormChunksID = config.getItem("wormChunks", 3320 - 256).getInt();
        vhraakTeethID = config.getItem("vhraakTeeth", 3321 - 256).getInt();

        dreamflintID = config.getItem("dreamflint", 3322 - 256).getInt();
        moonclockID = config.getItem("moonclock", 3323 - 256).getInt();
        spinebackChunkID = config.getItem("spinebackChunk", 3324 - 256).getInt();

        spinebackCannonID = config.getItem("spinebackCannon", 3325 - 256).getInt();
        spinebackDiscID = config.getItem("spinebackDisc", 3326 - 256).getInt();
        spinebackHammerID = config.getItem("spinebackHammer", 3327 - 256).getInt();
        spinebackStaffID = config.getItem("spinebackStaff", 3328 - 256).getInt();

        everlightID = config.getItem("everlight", 3329 - 256).getInt();
        everbrightID = config.getItem("everbright", 3330 - 256).getInt();
        evernightID = config.getItem("evernight", 3331 - 256).getInt();
        eversightID = config.getItem("eversight", 3332 - 256).getInt();
        everfightID = config.getItem("everfight", 3333 - 256).getInt();
        everArrowID = config.getItem("everArrow", 3334 - 256).getInt();

        teakerStaffID = config.getItem("teakerStaff", 3335 - 256).getInt();
        amthirmisStaffID = config.getItem("AmthirmisStaff", 3336 - 256).getInt();
        darvenStaffID = config.getItem("darvenStaff", 3337 - 256).getInt();
        cermileStaffID = config.getItem("cermileStaff", 3338 - 256).getInt();
        pardimalStaffID = config.getItem("pardimalStaff", 3339 - 256).getInt();
        quadroticStaffID = config.getItem("quadroticStaff", 3340 - 256).getInt();
        karosStaffID = config.getItem("karosStaff", 3341 - 256).getInt();
        heliosisStaffID = config.getItem("heliosisStaff", 3342 - 256).getInt();
        arksianeStaffID = config.getItem("arksianeStaff", 3343 - 256).getInt();
        dreamPowderID = config.getItem("DreamPowder", 3344 - 256).getInt();
		barredDoorItemID = config.getItem("BarredDoorItem", 3484 - 256).getInt();

		
		dreamstoneID = config.getBlock("DreamStone", 2500 - 256).getInt();
    	vetheaPortalID = config.getBlock("vetheaPortal", 2502 - 256).getInt();
        dreamwoodID = config.getBlock("dreamwood", 2503 - 256).getInt();
        dreamwoodLeavesID = config.getBlock("dreamwoodLeaves", 2504 - 256).getInt();
        dreambricksID = config.getBlock("dreambricks", 2505 - 256).getInt();
        lunastoneID = config.getBlock("lunastone", 2506 - 256).getInt();
        lunabricksID = config.getBlock("lunabricks", 2507 - 256).getInt();
        metalCagingID = config.getBlock("metalCaging", 2508 - 256).getInt();
        dreamlampID = config.getBlock("dreamlamp", 2509 - 256).getInt();
        dreamlampOnID = config.getBlock("dreamlampOn", 2510 - 256).getInt();
        weedwoodVineID = config.getBlock("weedwoodVine", 2511 - 256).getInt();
        blossomingWeedwoodVineID = config.getBlock("blossomingWeedwoodVine", 2512 - 256).getInt();
        cryptWallID = config.getBlock("cryptWall", 2513 - 256).getInt();
        smoothGlassID = config.getBlock("smoothGlass", 2514 - 256).getInt();
        villageLampID = config.getBlock("villageLamp", 2515 - 256).getInt();
        infusionTableID = config.getBlock("infusionTable", 2516 - 256).getInt();
        cellLampID = config.getBlock("cellLamp", 2517 - 256).getInt();
        barredDoorID = config.getBlock("barredDoor", 2518 - 256).getInt();
        firecrystalID = config.getBlock("firecrystal", 2519 - 256).getInt();
        firelightID = config.getBlock("firelight", 2520 - 256).getInt();
        hyrewoodID = config.getBlock("hyrewood", 2521 - 256).getInt();
        mintwoodLeavesID = config.getBlock("mintwoodLeaves", 2523 - 256).getInt();
        firewallID = config.getBlock("firewall", 2524 - 256).getInt();
        karosHeatTileRedID = config.getBlock("karosHeatTileRed", 2525 - 256).getInt();
        karosHeatTileGreenID = config.getBlock("karosHeatTileGreen", 2526 - 256).getInt();
        karosCannonID = config.getBlock("karosCannon", 2527 - 256).getInt();
        helioticBeamID = config.getBlock("helioticBeam", 2528 - 256).getInt();
        cryptFloorID = config.getBlock("cryptFloor", 2529 - 256).getInt();
        firewoodID = config.getBlock("firewood", 2530 - 256).getInt();
        chamberWallID = config.getBlock("chamberWall", 2531 - 256).getInt();
        chamberWall1ID = config.getBlock("chamberWall1", 2532 - 256).getInt();
        chamberWall2ID = config.getBlock("chamberWall2", 2533 - 256).getInt();
        bacterialAcidID = config.getBlock("bacterialAcid", 2534 - 256).getInt();
        gemtopPurpleID = config.getBlock("gemtops", 2535 - 256).getInt();
        yellowDulahID = config.getBlock("yellowDulah", 2536 - 256).getInt();
        blockAcidID = config.getBlock("acidBlock", 2537 - 256).getInt();
        hallWallID = config.getBlock("hallWall", 2538 - 256).getInt();
        wreckAltarID = config.getBlock("wreckAltar", 2539 - 256).getInt();
        raglokAltarID = config.getBlock("raglokAltar", 2540 - 256).getInt();
        karosAltarID = config.getBlock("karosAltar", 2541 - 256).getInt();
        lunicAltarID = config.getBlock("lunicAltar", 2542 - 256).getInt();
        hiveWallID = config.getBlock("hiveWall", 2543 - 256).getInt();
        quadroticAltarID = config.getBlock("quadroticAltar", 2544 - 256).getInt();
        everstoneID = config.getBlock("everstone", 2545 - 256).getInt();
        lunicAcidID = config.getBlock("lunicAcid", 2546 - 256).getInt();
        firewoodLeavesID = config.getBlock("firewoodLeaves", 2547 - 256).getInt();
        hyrewoodLeavesID = config.getBlock("hyrewoodLeaves", 2548 - 256).getInt();
        gemtopGreenID = config.getBlock("gemtopsGreen", 2549 - 256).getInt();
        greenDulahID = config.getBlock("greenDulah", 2550 - 256).getInt();
        mintwoodID = config.getBlock("mintwood", 2551 - 256).getInt();
        lightFirewoodLeavesID = config.getBlock("lightFirerwoodLeaves", 2552 - 256).getInt();
        cracklespikeID = config.getBlock("cracklespike", 2553 - 256).getInt();
        ferniteID = config.getBlock("fernite", 2554 - 256).getInt();
        bulatobeID = config.getBlock("bulatobe", 2555 - 256).getInt();
        shineGrassID = config.getBlock("shineGrass", 2556 - 256).getInt();
        shimmerID = config.getBlock("shimmer", 2557 - 256).getInt();
        dreamglowID = config.getBlock("dreamglow", 2558 - 256).getInt();
        hyrewoodVineID = config.getBlock("hyrewoodVine", 2559 - 256).getInt();
        dreambricks2ID = config.getBlock("dreambricks2", 2560 - 256).getInt();
        whiteEverstoneID = config.getBlock("whiteEverstone", 2561 - 256).getInt();
        darkEverstoneID = config.getBlock("darkEverstone", 2562 - 256).getInt();
        karosBricksID = config.getBlock("karosBricks", 2563 - 256).getInt();
        karosBricks2ID = config.getBlock("karosBricks2", 2564 - 256).getInt();

        biphronSpawnerID = config.getBlock("briphronSpawner", 2565 - 256).getInt();
        gorgosionSpawnerID = config.getBlock("gorgosionSpawner", 2566 - 256).getInt();
        twinsSpawnerID = config.getBlock("twinsSpawner", 2567 - 256).getInt();
        duoSpawnerID = config.getBlock("duoSpawner", 2568 - 256).getInt();
        vermenousSpawnerID = config.getBlock("vermenousSpawner", 2569 - 256).getInt();
        dreamwreckerSpawnerID = config.getBlock("dreamwreckerSpawner", 2570 - 256).getInt();
        lorgaSpawnerID = config.getBlock("lorgaSpawner", 2571 - 256).getInt();
        hungerstone1ID = config.getBlock("hungerstone1", 2572 - 256).getInt();
        hungerstone2ID = config.getBlock("hungerstone2", 2573 - 256).getInt();
        purpleFireID = config.getBlock("PurpleFire", 2574 - 256).getInt();
		
		config.save();
	}
	
}
