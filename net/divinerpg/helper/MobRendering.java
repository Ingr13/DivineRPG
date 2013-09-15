package net.divinerpg.helper;


import net.divinerpg.helper.block.ArcanaBlockHelper;
import net.divinerpg.helper.item.TwilightItemHelper;
import net.divinerpg.helper.item.VetheaItemHelper;
import net.divinerpg.lib.EntityResourceLocs;
import net.divinerpg.mob.entity.*;
import net.divinerpg.mob.entity.item.*;
import net.divinerpg.overworld.block.tileentity.*;
import net.divinerpg.render.entity.*;
import net.divinerpg.render.entity.model.*;
import net.divinerpg.render.item.*;
import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.*;

public class MobRendering {

    public static void init()
    {
        RenderingRegistry.registerEntityRenderingHandler(EntityCyclops.class, new RenderCyclops(new ModelBiped(), 0, 2.0F, EntityResourceLocs.CYCLOPS));
        RenderingRegistry.registerEntityRenderingHandler(EntityFrostArcher.class, new RenderFrostArcher(new ModelBiped(), 0.0F, EntityResourceLocs.FROZEN_ARCHER));
        RenderingRegistry.registerEntityRenderingHandler(EntityDesertCrawler.class, new RenderDesertCrawler(new ModelCrawler(), 1.0F, EntityResourceLocs.DESERT_CRAWLER));
        RenderingRegistry.registerEntityRenderingHandler(EntityJungleBat.class, new RenderJungleBat(new ModelJungleBat(), 1.0F, EntityResourceLocs.JUNGLE_BAT));
        RenderingRegistry.registerEntityRenderingHandler(EntityJungleDramcryx.class, new RenderJungleDramcryx(new ModelDramcryx(), 1.0F, EntityResourceLocs.DRAMCRYX));
        RenderingRegistry.registerEntityRenderingHandler(EntityHellSpider.class, new RenderHellSpider(new ModelHellSpider(), 1.0F, EntityResourceLocs.HELL_SPIDER));
        RenderingRegistry.registerEntityRenderingHandler(EntityJungleSpider.class, new RenderJungleSpider(new ModelJungleSpider(), 1.0F, EntityResourceLocs.JUNGLE_SPIDER));
        RenderingRegistry.registerEntityRenderingHandler(EntityScorcher.class, new RenderScorcher(new ModelScorcher(), 1.0F, 2, EntityResourceLocs.SCORCHER));
        RenderingRegistry.registerEntityRenderingHandler(EntityWildFire.class, new RenderWildFire(new ModelWildFire(), 1.0F, 10, EntityResourceLocs.WILDFIRE));
        RenderingRegistry.registerEntityRenderingHandler(EntityKingOfScorchers.class, new RenderMamormeter(new ModelMamormeter(), 1.0F, 2, EntityResourceLocs.KING_OF_SCHORCHERS));
        RenderingRegistry.registerEntityRenderingHandler(EntityAngryBunny.class, new RenderAngryBunny(new ModelAngryBunny(), 0.4F, 2.0F, EntityResourceLocs.ANGRY_BUNNY));
        RenderingRegistry.registerEntityRenderingHandler(EntityDensos.class, new RenderDensos(new ModelDensos(), 1.0F, 2, EntityResourceLocs.DENSOS));
        RenderingRegistry.registerEntityRenderingHandler(EntityKarot.class, new RenderKarot(new ModelKarot(), 1.0F, 5, EntityResourceLocs.KAROT));
        RenderingRegistry.registerEntityRenderingHandler(EntityReyvor.class, new RenderReyvor(new ModelDensos(), 1.0F, 2, EntityResourceLocs.REYVOR));
        RenderingRegistry.registerEntityRenderingHandler(EntitySerenityBunny.class, new RenderSerenityBunny(new ModelBunny(), 0.5F, 1.0F, EntityResourceLocs.BUNNY));
        RenderingRegistry.registerEntityRenderingHandler(EntitySoulFiend.class, new RenderSoulFiend(new ModelSoulFiend(), 1.0F, 1, EntityResourceLocs.SOUL_FIEND));
        RenderingRegistry.registerEntityRenderingHandler(EntityTwilightDemon.class, new RenderTwilightDemon(new ModelTwilightDemon(), 1.0F, 2, EntityResourceLocs.TWILIGHT_DEMON));
        RenderingRegistry.registerEntityRenderingHandler(EntityVamacheron.class, new RenderVamacheron(new ModelVamacheron(), 0.2F, 4.0F, EntityResourceLocs.VAMACHERON));
        RenderingRegistry.registerEntityRenderingHandler(EntityAncient.class, new RenderAncient(new ModelAncientEntity(), 1.0F, 2, EntityResourceLocs.ANCIENT_ENTITY));
        RenderingRegistry.registerEntityRenderingHandler(EntityHellBat.class, new RenderHellBat(new ModelHellBat(), 1.0F, EntityResourceLocs.HELL_BAT));
        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoYellow.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F, EntityResourceLocs.AYERACO_YELLOW));
        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoGreen.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F, EntityResourceLocs.AYERACO_GREEN));
        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoBlue.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F, EntityResourceLocs.AYERACO_BLUE));
        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoRed.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F, EntityResourceLocs.AYERACO_RED));
        RenderingRegistry.registerEntityRenderingHandler(EntityAyeracoPurple.class, new RenderAyeraco(new ModelAyeraco(), 0.0F, 3.0F, EntityResourceLocs.AYERACO_PURPLE));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderWatcher.class, new RenderEnderWatcher(new ModelWatcher(), 0.0F, EntityResourceLocs.ENDER_WATCHER));
        RenderingRegistry.registerEntityRenderingHandler(EntityNetherWatcher.class, new RenderNetherWatcher(new ModelWatcher(), 0.0F, 5.0F, EntityResourceLocs.WATCHER));
        RenderingRegistry.registerEntityRenderingHandler(EntityDraviteTomo.class, new RenderDraviteTomo(new ModelTomo(), 0.0F, EntityResourceLocs.DRAVITE_TOMO));
        RenderingRegistry.registerEntityRenderingHandler(EntityCadillion.class, new RenderCadillion(new ModelCadillion(), 0.0F, EntityResourceLocs.CADILLION));
        RenderingRegistry.registerEntityRenderingHandler(EntityCori.class, new RenderCori(new ModelCori(), 0.0F, EntityResourceLocs.WEAK_CORI));
        RenderingRegistry.registerEntityRenderingHandler(EntityNesro.class, new RenderNesro(new ModelNesro(), 0.0F, EntityResourceLocs.NESRO));
        RenderingRegistry.registerEntityRenderingHandler(EntityMadivel.class, new RenderMadivel(new ModelMadivel(), 0.0F, EntityResourceLocs.MADIVEL));
        RenderingRegistry.registerEntityRenderingHandler(EntityAzuriteCadillion.class, new RenderAzuriteCadillion(new ModelCadillion(), 0.0F, EntityResourceLocs.CADILLION));
        RenderingRegistry.registerEntityRenderingHandler(EntityAzuriteGolem.class, new RenderAzuriteGolem(new ModelTwilightGolem(), 0.0F, EntityResourceLocs.AZURITE_GOLEM));
        RenderingRegistry.registerEntityRenderingHandler(EntityAzuriteTomo.class, new RenderAzuriteTomo(new ModelTomo(), 0.0F, EntityResourceLocs.AZURITE_TOMO));
        RenderingRegistry.registerEntityRenderingHandler(EntityVerek.class, new RenderVerek(new ModelSamek(), 0.0F, EntityResourceLocs.VAREK));
        RenderingRegistry.registerEntityRenderingHandler(EntityMoonWolf.class, new RenderMoonWolf(new ModelMoonWolf(), 0.0F, EntityResourceLocs.TWILIGHT_WOLF));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyCadillion.class, new RenderEneregyCadillion(new ModelCadillion(), 0.0F, EntityResourceLocs.ENERGY_CADILLION));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyTomo.class, new RenderEneregyTomo(new ModelTomo(), 0.0F, EntityResourceLocs.ENERGY_TOMO));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyGolem.class, new RenderEneregyGolem(new ModelTwilightGolem(), 0.0F, EntityResourceLocs.ENERGY_GOLEM));
        RenderingRegistry.registerEntityRenderingHandler(EntityEchantedWarrior.class, new RenderEnchantedWarrior(new ModelEnchantedWarrior(), 0.0F, EntityResourceLocs.ENCHANTED_WARRIOR));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnergyArcher.class, new RenderEnchantedArcher(new ModelEnchantedArcher(), 0.0F, EntityResourceLocs.UVITE_ARCHER));
        RenderingRegistry.registerEntityRenderingHandler(EntityAugiteArcher.class, new RenderAugiteArcher(new ModelEnchantedArcher(), 0.0F, EntityResourceLocs.TWILIGHT_ARCHER));
        RenderingRegistry.registerEntityRenderingHandler(EntityMythrilArcher.class, new RenderMythrilArcher(new ModelEnchantedArcher(), 0.0F, EntityResourceLocs.MYTHRIL_ARCHER));
        RenderingRegistry.registerEntityRenderingHandler(EntitySamek.class, new RenderSamek(new ModelSamek(), 0.0F, EntityResourceLocs.SAMEK));
        RenderingRegistry.registerEntityRenderingHandler(EntityMythrilGolem.class, new RenderMythrilGolem(new ModelTwilightGolem(), 0.0F, EntityResourceLocs.MYTHRIL_GOLEM));
        RenderingRegistry.registerEntityRenderingHandler(EntityCori2.class, new RenderCori2(new ModelCori(), 0.0F, EntityResourceLocs.ADVANCED_CORI));
        RenderingRegistry.registerEntityRenderingHandler(EntityMythrilFiend.class, new RenderMythrilFiend(new ModelMytrilFiend(), 0.0F, EntityResourceLocs.MYTHRIL_FIEND));
        RenderingRegistry.registerEntityRenderingHandler(EntityDenseCadillion.class, new RenderLivingCreature(new ModelCadillion(), 0.0F, EntityResourceLocs.DENSE_CADILLION));
        RenderingRegistry.registerEntityRenderingHandler(EntityDenseDemon.class, new RenderLivingCreature(new ModelDenseDemon(), 0.0F, EntityResourceLocs.DENSE_DEMON));
        RenderingRegistry.registerEntityRenderingHandler(EntityBaslisk.class, new RenderLivingCreature(new ModelBasalisk(), 0.0F, EntityResourceLocs.BASALISK));
        RenderingRegistry.registerEntityRenderingHandler(EntitySoulStealer.class, new RenderLivingCreature(new ModelSoulStealer(), 0.0F, EntityResourceLocs.SOUL_STEALER));
        RenderingRegistry.registerEntityRenderingHandler(EntityGlacide.class, new RenderGlacide(new ModelGlacide(), 0.0F, 1.0F, EntityResourceLocs.GLACON));
        RenderingRegistry.registerEntityRenderingHandler(EntityRollum.class, new RenderLivingCreature(new ModelRollum(), 0.0F, EntityResourceLocs.ROLLUM));
        RenderingRegistry.registerEntityRenderingHandler(EntityAlicanto.class, new RenderLivingCreature(new ModelAlicanto(), 0.0F, EntityResourceLocs.ALICANTO));
        RenderingRegistry.registerEntityRenderingHandler(EntityFractite.class, new RenderFractite(new ModelFractite(), 2.0F, 2.0F, EntityResourceLocs.FRACTITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityHastreus.class, new RenderLivingCreature(new ModelHastreus(), 0.0F, EntityResourceLocs.HASTERUS));
        RenderingRegistry.registerEntityRenderingHandler(EntityWorkshopTickerer.class, new RenderLivingCreature(new ModelWorkshop(), 0.0F, EntityResourceLocs.WORKSHOP_TINKER));
        RenderingRegistry.registerEntityRenderingHandler(EntityWorkshopMerchant.class, new RenderLivingCreature(new ModelWorkshop(), 0.0F, EntityResourceLocs.WORKSHOP_MERCHANT));	
        RenderingRegistry.registerEntityRenderingHandler(EntityVermenous.class, new RenderLivingCreature(new Vermenous(), 0.0F, EntityResourceLocs.VERMENOUS));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnt.class, new RenderLivingCreature(new Ent(), 0.0F, EntityResourceLocs.ENT));
        RenderingRegistry.registerEntityRenderingHandler(EntityCymesoid.class, new RenderLivingCreature(new Cymesoid(), 0.0F, EntityResourceLocs.CYMESOID));
        RenderingRegistry.registerEntityRenderingHandler(EntityDreamwrecker.class, new RenderLivingCreature(new Dreamwrecker(), 0.0F, EntityResourceLocs.DREAMWRECKER));
        RenderingRegistry.registerEntityRenderingHandler(EntityTocaxin.class, new RenderLivingCreature(new Tocaxin(), 0.0F, EntityResourceLocs.TOCAXIN));
        RenderingRegistry.registerEntityRenderingHandler(EntityShadahier.class, new RenderLivingCreature(new Shadahier(), 0.0F, EntityResourceLocs.SHADAHIER));
        RenderingRegistry.registerEntityRenderingHandler(EntityAcidHag.class, new RenderLivingCreature(new AcidHag(), 0.0F, EntityResourceLocs.ACID_HAG));
        RenderingRegistry.registerEntityRenderingHandler(EntityKazrotic.class, new RenderLivingCreature(new Kazrotic(), 0.0F, EntityResourceLocs.KAZROTIC));
        RenderingRegistry.registerEntityRenderingHandler(EntityHelio.class, new RenderLivingCreature(new Helio(), 0.0F, EntityResourceLocs.HELIO));
        RenderingRegistry.registerEntityRenderingHandler(EntityGorgosion.class, new RenderLivingCreature(new Gorgosion(), 0.0F, EntityResourceLocs.GORGOSION));
        RenderingRegistry.registerEntityRenderingHandler(EntityHoverStinger.class, new RenderHoverStinger(new HoverStinger(), 0.0F, EntityResourceLocs.HOVER_STINGER));
        RenderingRegistry.registerEntityRenderingHandler(EntityZone.class, new RenderZone(new Zone(), 0.0F, EntityResourceLocs.ZONE));
        RenderingRegistry.registerEntityRenderingHandler(EntityZoragon.class, new RenderLivingCreature(new Zoragon(), 0.0F, EntityResourceLocs.ZORAGON));
        RenderingRegistry.registerEntityRenderingHandler(EntityDissiment.class, new RenderLivingCreature(new Dissiment(), 0.0F, EntityResourceLocs.DISSIMENT));
        RenderingRegistry.registerEntityRenderingHandler(EntitySpinebackWorm.class, new RenderSpinebackWorm(new SpinebackBody(), 0.0F, EntityResourceLocs.ALICANTO));
        RenderingRegistry.registerEntityRenderingHandler(EntitySpinebackWormBody.class, new RenderSpinebackWormBody(new SpinebackHead(), 0.0F, EntityResourceLocs.VAMACHERON));
        RenderingRegistry.registerEntityRenderingHandler(EntityVhraak.class, new RenderLivingCreature(new Vhraak(), 0.0F, EntityResourceLocs.VHRAAK));
        RenderingRegistry.registerEntityRenderingHandler(EntityGalroid.class, new RenderGalroid(new Galroid(), 0.0F, EntityResourceLocs.GALROID));
        RenderingRegistry.registerEntityRenderingHandler(EntityLadyLuna.class, new RenderLivingCreature(new LadyLuna(), 0.0F, EntityResourceLocs.LADY_LUNA_MELEE));
        RenderingRegistry.registerEntityRenderingHandler(EntityBohemite.class, new RenderLivingCreature(new Boheimite(), 0.0F, EntityResourceLocs.BOHEMITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityWreck.class, new RenderWreck(new WreckForm1(), 0.0F, EntityResourceLocs.WRECK));
        RenderingRegistry.registerEntityRenderingHandler(EntityBiphron.class, new RenderBiphron(new Biphron(), 0.0F, EntityResourceLocs.BIPHRON));
        RenderingRegistry.registerEntityRenderingHandler(EntityHiveQueen.class, new RenderHiveQueen(new HiveQueen(), 0.0F, EntityResourceLocs.HIVE_QUEEN));
        RenderingRegistry.registerEntityRenderingHandler(EntityHiveSoldier.class, new RenderLivingCreature(new HiveSoldier(), 0.0F, EntityResourceLocs.HIVE_SOLDIER));
        RenderingRegistry.registerEntityRenderingHandler(EntityLheiva.class, new RenderLivingCreature(new Lheiva(), 0.0F, EntityResourceLocs.LHEIVA));
        RenderingRegistry.registerEntityRenderingHandler(EntityTwins.class, new RenderLivingCreature(new Twins(), 0.0F, EntityResourceLocs.TWINS));
        RenderingRegistry.registerEntityRenderingHandler(EntityQuadro.class, new RenderLivingCreature(new Quadro(), 0.0F, EntityResourceLocs.QUADRO));
        RenderingRegistry.registerEntityRenderingHandler(EntityEndiku.class, new RenderLivingCreature(new Endiku(), 0.0F, EntityResourceLocs.ENDIKU));
        RenderingRegistry.registerEntityRenderingHandler(EntityTempleGuardian.class, new RenderLivingCreature(new ModelBiped(), 0.0F, EntityResourceLocs.TEMPLE_GUARDIAN));
        RenderingRegistry.registerEntityRenderingHandler(EntityMysteriousManLayer1.class, new RenderLivingCreature(new MysteriousMan(), 0.0F, EntityResourceLocs.MYSTERIOUS_MAN_LAYER_1));
        RenderingRegistry.registerEntityRenderingHandler(EntityMysteriousManLayer2.class, new RenderLivingCreature(new MysteriousMan(), 0.0F, EntityResourceLocs.MYSTERIOUS_MAN_LAYER_2));
        RenderingRegistry.registerEntityRenderingHandler(EntityMysteriousManLayer3.class, new RenderLivingCreature(new MysteriousMan(), 0.0F, EntityResourceLocs.MYSTERIOUS_MAN_LAYER_3));
        RenderingRegistry.registerEntityRenderingHandler(EntityCryptKeeper.class, new RenderLivingCreature(new CryptKeeper(), 0.0F, EntityResourceLocs.CRYPT_KEEPER));
        RenderingRegistry.registerEntityRenderingHandler(EntityDuo.class, new RenderLivingCreature(new Duo(), 0.0F, EntityResourceLocs.DUO));
        RenderingRegistry.registerEntityRenderingHandler(EntityEhu.class, new RenderLivingCreature(new Ehu(), 0.0F, EntityResourceLocs.EHU));
        RenderingRegistry.registerEntityRenderingHandler(EntityHusk.class, new RenderLivingCreature(new Husk(), 0.0F, EntityResourceLocs.HUSK));
        RenderingRegistry.registerEntityRenderingHandler(EntityVermsillion.class, new RenderLivingCreature(new Versmillion(), 0.0F, EntityResourceLocs.VERMSILLION));
        RenderingRegistry.registerEntityRenderingHandler(EntityStoneGolem.class, new RenderLivingCreature(new StoneGolem(), 0.0F, EntityResourceLocs.STONE_GOLEM));
        RenderingRegistry.registerEntityRenderingHandler(EntityGalroid.class, new RenderLivingCreature(new Galroid(), 0.0F, EntityResourceLocs.GALROID));
        RenderingRegistry.registerEntityRenderingHandler(EntityHerbomancer.class, new RenderLivingCreature(new Herbomancer(), 0.0F, EntityResourceLocs.HERBOMANCER));
        RenderingRegistry.registerEntityRenderingHandler(EntityKaros.class, new RenderLivingCreature(new Karos(), 0.0F, EntityResourceLocs.KAROS));
        RenderingRegistry.registerEntityRenderingHandler(EntityLheiva.class, new RenderLivingCreature(new Lheiva(), 0.0F, EntityResourceLocs.LHEIVA));
        RenderingRegistry.registerEntityRenderingHandler(EntityLorga.class, new RenderLivingCreature(new Lorga(), 0.0F, EntityResourceLocs.LORGA));
        RenderingRegistry.registerEntityRenderingHandler(EntityLorgaFlight.class, new RenderLivingCreature(new Lorgaflight(), 0.0F, EntityResourceLocs.LORGA_FLIGHT));
        RenderingRegistry.registerEntityRenderingHandler(EntityMandragora.class, new RenderLivingCreature(new Mandragora(), 0.0F, EntityResourceLocs.MANDRAGORA));
        RenderingRegistry.registerEntityRenderingHandler(EntityRaglok.class, new RenderLivingCreature(new RaglokGogdure(), 0.0F, EntityResourceLocs.RAGLOK));
        RenderingRegistry.registerEntityRenderingHandler(EntityTocaxin.class, new RenderLivingCreature(new Tocaxin(), 0.0F, EntityResourceLocs.TOCAXIN));
        RenderingRegistry.registerEntityRenderingHandler(EntityHungerHungry.class, new RenderLivingCreature(new ModelHungerHungry(), 0.0F, EntityResourceLocs.HUNGER_HUNGRY));
        RenderingRegistry.registerEntityRenderingHandler(EntityCoriShot.class, new RenderTeakerDisc(TwilightItemHelper.draviteChunk));
        RenderingRegistry.registerEntityRenderingHandler(EntityKazroticShot.class, new RenderBasicProjectile(EntityResourceLocs.KAZROTIC_SHOT));
        RenderingRegistry.registerEntityRenderingHandler(EntityZoragonBomb.class, new RenderBasicProjectile(EntityResourceLocs.ZORAGON_BOMB));
        RenderingRegistry.registerEntityRenderingHandler(EntityDissimentShot.class, new RenderBasicProjectile(EntityResourceLocs.DISSIMENT_SHOT));
        RenderingRegistry.registerEntityRenderingHandler(EntityTeakerDisk.class, new RenderTeakerDisc(VetheaItemHelper.teakerDisk));
        RenderingRegistry.registerEntityRenderingHandler(EntityAmthirmisDisk.class, new RenderTeakerDisc(VetheaItemHelper.amthrimisDisk));
        RenderingRegistry.registerEntityRenderingHandler(EntityDarvenDisk.class, new RenderTeakerDisc(VetheaItemHelper.darvenDisk));
        RenderingRegistry.registerEntityRenderingHandler(EntityCermileDisk.class, new RenderTeakerDisc(VetheaItemHelper.cermileDisk));
        RenderingRegistry.registerEntityRenderingHandler(EntityPardimalDisk.class, new RenderTeakerDisc(VetheaItemHelper.pardimalDisk));
        RenderingRegistry.registerEntityRenderingHandler(EntityQuadroticDisk.class, new RenderTeakerDisc(VetheaItemHelper.quadroticDisk));
        RenderingRegistry.registerEntityRenderingHandler(EntityKarosDisk.class, new RenderTeakerDisc(VetheaItemHelper.karosDisk));
        RenderingRegistry.registerEntityRenderingHandler(EntityHeliosisDisk.class, new RenderTeakerDisc(VetheaItemHelper.heliosisDisk));
        RenderingRegistry.registerEntityRenderingHandler(EntityArksianeDisk.class, new RenderTeakerDisc(VetheaItemHelper.arksianeDisk));
        RenderingRegistry.registerEntityRenderingHandler(EntitySpinebackDisc.class, new RenderTeakerDisc(VetheaItemHelper.spinebackDisk));
        RenderingRegistry.registerEntityRenderingHandler(EntityVetheanArrow.class, new RenderTeakerArrow());
        RenderingRegistry.registerEntityRenderingHandler(EntityVetheanArrow2.class, new RenderDarvenArrow());
        RenderingRegistry.registerEntityRenderingHandler(EntityVetheanWarArrow.class, new RenderPardimalArrow());
        RenderingRegistry.registerEntityRenderingHandler(EntityVetheanWrathArrow.class, new RenderKarosArrow());
        RenderingRegistry.registerEntityRenderingHandler(EntityKarosCannonShot.class, new RenderKarosArrow());
        RenderingRegistry.registerEntityRenderingHandler(EntityVetheanCannonShot.class, new RenderBasicProjectile(EntityResourceLocs.VETHEAN_CANNON_SHOT));
        RenderingRegistry.registerEntityRenderingHandler(EntityEvernightProjectile.class, new RenderBasicProjectile(EntityResourceLocs.EVERNIGHT));
        RenderingRegistry.registerEntityRenderingHandler(EntityEversightProjectile.class, new RenderBasicProjectile(EntityResourceLocs.EVERSIGHT));
        RenderingRegistry.registerEntityRenderingHandler(EntityBouncingProjectile.class, new RenderBasicProjectile(EntityResourceLocs.BOUNCING_PROJECTILE));
        RenderingRegistry.registerEntityRenderingHandler(EntityWreckStrengthShot.class, new RenderBasicProjectile(EntityResourceLocs.EXPLOSIVE_SHOT));
        RenderingRegistry.registerEntityRenderingHandler(EntityWreckExplosiveShot.class, new RenderBasicProjectile(EntityResourceLocs.EXPLOSIVE_SHOT));
        RenderingRegistry.registerEntityRenderingHandler(EntityRaglokBomb.class, new RenderBasicProjectile(EntityResourceLocs.RAGLOK_BOMB));
        RenderingRegistry.registerEntityRenderingHandler(EntityMandragoraProjectile.class, new RenderBasicProjectile(EntityResourceLocs.MANDRAGORA_1));
        RenderingRegistry.registerEntityRenderingHandler(EntitySparkler.class, new RenderBasicProjectile(EntityResourceLocs.SPARKLER));
        RenderingRegistry.registerEntityRenderingHandler(EntityReflector.class, new RenderBasicProjectile(EntityResourceLocs.REFLECTOR));
        RenderingRegistry.registerEntityRenderingHandler(EntityMerikMissile.class, new RenderBasicProjectile(EntityResourceLocs.MERIK_MISSLE));
        RenderingRegistry.registerEntityRenderingHandler(EntityFirefly.class, new RenderBasicProjectile(EntityResourceLocs.FIREFLY));
        //RenderingRegistry.registerEntityRenderingHandler(EntityStarfall.class, new RenderStarfall());
        //RenderingRegistry.registerEntityRenderingHandler(EntityLamona.class, new RenderIconProjectile(ArcanaItemHelper.lamonaItem.getIconFromDamage(0), "/Xolovon3.png"));
        //RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderIconProjectile(ArcanaItemHelper.grenade.getIconFromDamage(0), "/Xolovon3.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityRoamer.class, new RenderRoamer(new ModelRoamer(), 0.0F, EntityResourceLocs.ROAMER));
        RenderingRegistry.registerEntityRenderingHandler(EntityDeathcryx.class, new RenderDeathcryx(new ModelDeathcryx(), 0.0F, EntityResourceLocs.DEATHCRYX));
        RenderingRegistry.registerEntityRenderingHandler(EntityDeathHound.class, new RenderDeathHound(new ModelDeathHound(), 0.0F, EntityResourceLocs.DEATH_HOUND));
        RenderingRegistry.registerEntityRenderingHandler(EntityLeorna.class, new RenderLeorna(new ModelLeorna(), 0.0F, EntityResourceLocs.LEORNA));
        RenderingRegistry.registerEntityRenderingHandler(EntityRazorback.class, new RenderRazorback(new ModelRazorback(), 0.0F, EntityResourceLocs.RAZORBACK));
        RenderingRegistry.registerEntityRenderingHandler(EntityConstructor.class, new RenderConstructor(new ModelDramix(), 0.0F, EntityResourceLocs.CONSTRUCTOR));
        RenderingRegistry.registerEntityRenderingHandler(EntityDungeonPrisoner.class, new RenderDungeonPrisoner(new ModelDungeonPrisoner(), 0.0F, EntityResourceLocs.DUNGEON_PRISONER));
        RenderingRegistry.registerEntityRenderingHandler(EntityDungeonDemon.class, new RenderDungeonDemon(new ModelDungeonDemon(), 0.0F, EntityResourceLocs.DUNGEON_DEMON));
        RenderingRegistry.registerEntityRenderingHandler(EntityCaptianMerik.class, new RenderMerik(new ModelSamek(), 0.0F, EntityResourceLocs.CAPTAIN_MERIK));
        RenderingRegistry.registerEntityRenderingHandler(EntityDatticon.class, new RenderDatticon(new ModelSamek(), 0.0F, EntityResourceLocs.DATTICON));
        RenderingRegistry.registerEntityRenderingHandler(EntityFyracryx.class, new RenderFyracryx(new ModelDeathcryx(), 0.0F, EntityResourceLocs.FYRACRYX));
        RenderingRegistry.registerEntityRenderingHandler(EntityParatiku.class, new RenderParatiku(new ModelParatiku(), 0.0F, EntityResourceLocs.PARATIKU));
        RenderingRegistry.registerEntityRenderingHandler(EntityGolemOfRejuv.class, new RenderGolemOfRejuv(new ModelTwilightGolem(), 0.0F, EntityResourceLocs.HEALING_GOLEM));
        RenderingRegistry.registerEntityRenderingHandler(EntitySeimer.class, new RenderSeimer(new ModelSeimer(), 0.0F, EntityResourceLocs.SEIMER));
        RenderingRegistry.registerEntityRenderingHandler(EntityWraith.class, new RenderWraith(new ModelWraith(), 0.0F, EntityResourceLocs.WRAITH));
        RenderingRegistry.registerEntityRenderingHandler(EntityDramix.class, new RenderDramix(new ModelDramix(), 1.0F, EntityResourceLocs.DRAMIX));
        RenderingRegistry.registerEntityRenderingHandler(EntityParasecta.class, new RenderParasecta(new ModelParasecta(), 1.0F, 1.0F, EntityResourceLocs.PARASECTA));
        RenderingRegistry.registerEntityRenderingHandler(EntityLivingStatue.class, new RenderBipedCreature(new ModelBiped(), 0.0F, EntityResourceLocs.LIVING_STATUE_SLEEP));
        RenderingRegistry.registerEntityRenderingHandler(EntityVatticus.class, new RenderVatticus(new ModelBiped(), 0.0F, EntityResourceLocs.LORD_VATTICUS));
        RenderingRegistry.registerEntityRenderingHandler(EntityZelus.class, new RenderZelus(new ModelBiped(), 0.0F, EntityResourceLocs.ZELUS));
        RenderingRegistry.registerEntityRenderingHandler(EntityFireArrow.class, new RenderFireArrow());
        RenderingRegistry.registerEntityRenderingHandler(EntityEnderTriplets.class, new RenderEnderTriplets(new ModelEnderTriplets(), 1.0F, EntityResourceLocs.ENDER_TRIPLETS));

        
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityParasectaAltar.class, new RenderPheonixAltar());
        MinecraftForgeClient.registerItemRenderer(ArcanaBlockHelper.parasectaAltar.blockID, new ItemParasectaAltarRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityExtractor.class, new RenderExtractor());
        MinecraftForgeClient.registerItemRenderer(ArcanaBlockHelper.extractor.blockID, new ItemExtractorRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDramixAltar.class, new RenderDramixAltar());
        MinecraftForgeClient.registerItemRenderer(ArcanaBlockHelper.dramixAltar.blockID, new ItemDramixAltarRenderer());

        //Blitz' and Phasers and Slicers.
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerDravite.class, new RenderTeakerDisc(TwilightItemHelper.DraviteSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerAzurite.class, new RenderTeakerDisc(TwilightItemHelper.AzuriteSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerUvite.class, new RenderTeakerDisc(TwilightItemHelper.UviteSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerMythril.class, new RenderTeakerDisc(TwilightItemHelper.MythrilSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerAugite.class, new RenderTeakerDisc(TwilightItemHelper.AugiteSlicer));
        RenderingRegistry.registerEntityRenderingHandler(EntitySlicerHalite.class, new RenderTeakerDisc(TwilightItemHelper.HaliteSlicer));
        //RenderingRegistry.registerEntityRenderingHandler(EntityBlitzFury.class, new RenderSlicer(124));
        RenderingRegistry.registerEntityRenderingHandler(EntityBlitzDravite.class, new RenderBasicProjectile(EntityResourceLocs.BLITZ_DRAVITE));
		RenderingRegistry.registerEntityRenderingHandler(EntityBlitzAzurite.class, new RenderBasicProjectile(EntityResourceLocs.BLITZ_AZURITE));
		RenderingRegistry.registerEntityRenderingHandler(EntityBlitzUvite.class, new RenderBasicProjectile(EntityResourceLocs.BLITZ_UVITE));
		RenderingRegistry.registerEntityRenderingHandler(EntityBlitzMythril.class, new RenderBasicProjectile(EntityResourceLocs.BLITZ_MYTHRIL));
		RenderingRegistry.registerEntityRenderingHandler(EntityBlitzAugite.class, new RenderBasicProjectile(EntityResourceLocs.BLITZ_AUGITE));
		RenderingRegistry.registerEntityRenderingHandler(EntityBlitzHalite.class, new RenderBasicProjectile(EntityResourceLocs.BLITZ_HALITE));
		RenderingRegistry.registerEntityRenderingHandler(EntityPhaserDravite.class, new RenderBasicProjectile(EntityResourceLocs.PHASER_DRAVITE));
		RenderingRegistry.registerEntityRenderingHandler(EntityPhaserAugite.class, new RenderBasicProjectile(EntityResourceLocs.PHASER_AUGITE));
		RenderingRegistry.registerEntityRenderingHandler(EntityPhaserUvite.class, new RenderBasicProjectile(EntityResourceLocs.PHASER_UVITE));
		RenderingRegistry.registerEntityRenderingHandler(EntityPhaserMythril.class, new RenderBasicProjectile(EntityResourceLocs.PHASER_MYTHRIL));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserAzurite.class, new RenderBasicProjectile(EntityResourceLocs.PHASER_AZURITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityPhaserHalite.class, new RenderBasicProjectile(EntityResourceLocs.PHASER_HALITE));
        RenderingRegistry.registerEntityRenderingHandler(EntityMamormeterShot.class, new RenderBasicProjectile(EntityResourceLocs.KOS_PROJECTILE));
        RenderingRegistry.registerEntityRenderingHandler(EntityDeathSeranade.class, new RenderBasicProjectile(EntityResourceLocs.DEATH_SERENADE));
        RenderingRegistry.registerEntityRenderingHandler(EntityIce.class, new RenderBasicProjectile(EntityResourceLocs.ICE_SERENADE));
    
    }
}
