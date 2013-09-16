package net.divinerpg.helper;

import net.divinerpg.DivineRPG;
import net.divinerpg.mob.entity.*;
import net.divinerpg.mob.entity.item.EntityAmthirmisDisk;
import net.divinerpg.mob.entity.item.EntityArksianeDisk;
import net.divinerpg.mob.entity.item.EntityBlitzAugite;
import net.divinerpg.mob.entity.item.EntityBlitzAzurite;
import net.divinerpg.mob.entity.item.EntityBlitzDravite;
import net.divinerpg.mob.entity.item.EntityBlitzHalite;
import net.divinerpg.mob.entity.item.EntityBlitzMythril;
import net.divinerpg.mob.entity.item.EntityBlitzUvite;
import net.divinerpg.mob.entity.item.EntityBouncingProjectile;
import net.divinerpg.mob.entity.item.EntityCermileDisk;
import net.divinerpg.mob.entity.item.EntityCyclopsianStaff;
import net.divinerpg.mob.entity.item.EntityDarvenDisk;
import net.divinerpg.mob.entity.item.EntityDeathSeranade;
import net.divinerpg.mob.entity.item.EntityEvernightProjectile;
import net.divinerpg.mob.entity.item.EntityFirefly;
import net.divinerpg.mob.entity.item.EntityFyracryxFireball;
import net.divinerpg.mob.entity.item.EntityGrenade;
import net.divinerpg.mob.entity.item.EntityHeliosisDisk;
import net.divinerpg.mob.entity.item.EntityIce;
import net.divinerpg.mob.entity.item.EntityKarosCannonShot;
import net.divinerpg.mob.entity.item.EntityKarosDisk;
import net.divinerpg.mob.entity.item.EntityLamona;
import net.divinerpg.mob.entity.item.EntityLivingStatueArrow;
import net.divinerpg.mob.entity.item.EntityMandragoraProjectile;
import net.divinerpg.mob.entity.item.EntityMerikMissile;
import net.divinerpg.mob.entity.item.EntityPardimalDisk;
import net.divinerpg.mob.entity.item.EntityPhaserAugite;
import net.divinerpg.mob.entity.item.EntityPhaserAzurite;
import net.divinerpg.mob.entity.item.EntityPhaserDravite;
import net.divinerpg.mob.entity.item.EntityPhaserHalite;
import net.divinerpg.mob.entity.item.EntityPhaserMythril;
import net.divinerpg.mob.entity.item.EntityPhaserUvite;
import net.divinerpg.mob.entity.item.EntityQuadroticDisk;
import net.divinerpg.mob.entity.item.EntityReflector;
import net.divinerpg.mob.entity.item.EntitySparkler;
import net.divinerpg.mob.entity.item.EntitySpinebackCannonShot;
import net.divinerpg.mob.entity.item.EntitySpinebackDisc;
import net.divinerpg.mob.entity.item.EntityStarfall;
import net.divinerpg.mob.entity.item.EntityTeakerDisk;
import net.divinerpg.mob.entity.item.EntityVetheanArrow;
import net.divinerpg.mob.entity.item.EntityVetheanArrow2;
import net.divinerpg.mob.entity.item.EntityVetheanCannonShot;
import net.divinerpg.mob.entity.item.EntityVetheanWarArrow;
import net.divinerpg.mob.entity.item.EntityVetheanWrathArrow;
import net.divinerpg.mob.entity.item.EntityWreckExplosiveShot;
import net.divinerpg.mob.entity.item.EntityWreckStrengthShot;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;

public class MobRegistry {

    public static BiomeGenBase[] iceBiomes = new BiomeGenBase[]{BiomeGenBase.taiga, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.taigaHills};
    public static BiomeGenBase[] overworldBiomes = new BiomeGenBase[]{BiomeGenBase.plains, BiomeGenBase.extremeHills, BiomeGenBase.beach, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.icePlains, BiomeGenBase.iceMountains, BiomeGenBase.river};
    
    public static void init()
    {
    	ModMobRegistry.registerEntity(EntityJungleDramcryx.class, "Jungle Dramcryx");
        ModMobRegistry.registerEntity(EntityDesertCrawler.class, "Desert Crawler");
        ModMobRegistry.registerEntity(EntityCyclops.class, "Cyclops");
        ModMobRegistry.registerEntity(EntityHellSpider.class, "Hell Spider");
        ModMobRegistry.registerEntity(EntityJungleBat.class, "Jungle Bat");
        ModMobRegistry.registerEntity(EntityJungleSpider.class, "Jungle Spider");
        ModMobRegistry.registerEntity(EntityScorcher.class, "Scorcher");
        ModMobRegistry.registerEntity(EntityWildFire.class, "Wild Fire");
        ModMobRegistry.registerEntity(EntityKingOfScorchers.class, "King of Scorchers");
        ModMobRegistry.registerEntity(EntityAngryBunny.class, "Angry Bunny");
        ModMobRegistry.registerEntity(EntitySerenityBunny.class, "Bunny");
        ModMobRegistry.registerEntity(EntityDensos.class, "Densos");
        ModMobRegistry.registerEntity(EntityKarot.class, "Kar-OT");
        ModMobRegistry.registerEntity(EntitySoulFiend.class, "Soul Feind");
        ModMobRegistry.registerEntity(EntityTwilightDemon.class, "Twilight Demon");
        ModMobRegistry.registerEntity(EntityVamacheron.class, "Vamacheron");
        ModMobRegistry.registerEntity(EntityAncient.class, "Ancient");
        ModMobRegistry.registerEntity(EntityHellBat.class, "Hell Bat");
        ModMobRegistry.registerEntity(EntityAyeracoYellow.class, "Ayeraco Yellow");
        ModMobRegistry.registerEntity(EntityAyeracoGreen.class, "Ayeraco Green");
        ModMobRegistry.registerEntity(EntityAyeracoBlue.class, "Ayeraco Blue");
        ModMobRegistry.registerEntity(EntityAyeracoRed.class, "Ayeraco Red");
        ModMobRegistry.registerEntity(EntityAyeracoPurple.class, "Ayeraco Purple");
        ModMobRegistry.registerEntity(EntityEnderWatcher.class, "Ender Watcher");
        ModMobRegistry.registerEntity(EntityNetherWatcher.class, "The Watcher");
        ModMobRegistry.registerEntity(EntityReyvor.class, "Reyvor");
        ModMobRegistry.registerEntity(EntityDraviteTomo.class, "Dravite Tomo");
        ModMobRegistry.registerEntity(EntityCadillion.class, "Cadillion");
        ModMobRegistry.registerEntity(EntityCori.class, "Dravite Cori");
        ModMobRegistry.registerEntity(EntityNesro.class, "Nesro");
        ModMobRegistry.registerEntity(EntityMadivel.class, "Madivel");
        ModMobRegistry.registerEntity(EntityAzuriteGolem.class, "Azurite Golem");
        ModMobRegistry.registerEntity(EntityAzuriteTomo.class, "Azurite Tomo");
        ModMobRegistry.registerEntity(EntityVerek.class, "Verek");
        ModMobRegistry.registerEntity(EntityMoonWolf.class, "Moon Wolf");
        ModMobRegistry.registerEntity(EntityAzuriteCadillion.class, "Azure Cadillion");
        ModMobRegistry.registerEntity(EntityEnergyCadillion.class, "Uvite Cadillion");
        ModMobRegistry.registerEntity(EntityEnergyTomo.class, "Uvite Tomo");
        ModMobRegistry.registerEntity(EntityEnergyGolem.class, "Uvite Golem");
        ModMobRegistry.registerEntity(EntityEchantedWarrior.class, "Uvite Warrior");
        ModMobRegistry.registerEntity(EntityEnergyArcher.class, "Uvite Archer");
        ModMobRegistry.registerEntity(EntityAugiteArcher.class, "Augite Archer");
        ModMobRegistry.registerEntity(EntityDenseCadillion.class, "Augite Cadillion");
        ModMobRegistry.registerEntity(EntityDenseDemon.class, "Demon of Darkness");
        ModMobRegistry.registerEntity(EntityBaslisk.class, "Baslisk");
        ModMobRegistry.registerEntity(EntitySoulStealer.class, "Soul Stealer");
        ModMobRegistry.registerEntity(EntityMythrilFiend.class, "Mythril Fiend");
        ModMobRegistry.registerEntity(EntityMythrilGolem.class, "Mythril Golem");
        ModMobRegistry.registerEntity(EntityMythrilArcher.class, "Mythril Archer");
        ModMobRegistry.registerEntity(EntitySamek.class, "Samek");
        ModMobRegistry.registerEntity(EntityCori2.class, "Cori");
        ModMobRegistry.registerEntity(EntityGlacide.class, "Glacide");
        ModMobRegistry.registerEntity(EntityRollum.class, "Rollum");
        ModMobRegistry.registerEntity(EntityAlicanto.class, "Alicanto");
        ModMobRegistry.registerEntity(EntityFractite.class, "Fractite");
        ModMobRegistry.registerEntity(EntityHastreus.class, "Hastreus");
        ModMobRegistry.registerEntity(EntityFrostArcher.class, "Frost Archer");
        ModMobRegistry.registerEntity(EntityVermenous.class, "Vermenous");
        ModMobRegistry.registerEntity(EntityEnt.class, "Ent");
        ModMobRegistry.registerEntity(EntityCymesoid.class, "Cymesoid");
        ModMobRegistry.registerEntity(EntityDreamwrecker.class, "Dream Wrecker");
        ModMobRegistry.registerEntity(EntityTocaxin.class, "Tocaxin");
        ModMobRegistry.registerEntity(EntityShadahier.class, "Shadahier");
        ModMobRegistry.registerEntity(EntityAcidHag.class, "Acid Hag");
        ModMobRegistry.registerEntity(EntityKazrotic.class, "Kazrotic");
        ModMobRegistry.registerEntity(EntityHelio.class, "Helio");
        ModMobRegistry.registerEntity(EntityGorgosion.class, "Gorgosion");
        ModMobRegistry.registerEntity(EntityHoverStinger.class, "Hoverstinger");
        ModMobRegistry.registerEntity(EntityZone.class, "Zone");
        ModMobRegistry.registerEntity(EntityZoragon.class, "Zoragon");
        ModMobRegistry.registerEntity(EntityDissiment.class, "Dissiment");
        ModMobRegistry.registerEntity(EntitySpinebackWorm.class, "Spinarus");
        ModMobRegistry.registerEntity(EntityVhraak.class, "Vhraak");
        ModMobRegistry.registerEntity(EntityGalroid.class, "Galroid");
        ModMobRegistry.registerEntity(EntityLadyLuna.class, "Lady Luna");
        ModMobRegistry.registerEntity(EntityBohemite.class, "Bohemite");
        ModMobRegistry.registerEntity(EntityWreck.class, "Wreck");
        ModMobRegistry.registerEntity(EntityBiphron.class, "Biphron");
        ModMobRegistry.registerEntity(EntityHiveQueen.class, "Hive Queen");
        ModMobRegistry.registerEntity(EntityHiveSoldier.class, "hivesoldier");
        ModMobRegistry.registerEntity(EntityLheiva.class, "lheiva");
        ModMobRegistry.registerEntity(EntitySpinebackWormBody.class, "Spinarus");
        ModMobRegistry.registerEntity(EntityMandragora.class, "mandragora");
        ModMobRegistry.registerEntity(EntityTwins.class, "Twins");
        ModMobRegistry.registerEntity(EntityKaros.class, "Karos");
        ModMobRegistry.registerEntity(EntityRaglok.class, "Raglok");
        ModMobRegistry.registerEntity(EntityQuadro.class, "Quadro");
        ModMobRegistry.registerEntity(EntityDuo.class, "Duo");
        ModMobRegistry.registerEntity(EntityEndiku.class, "Endiku");
        ModMobRegistry.registerEntity(EntityLorga.class, "Lorga");
        ModMobRegistry.registerEntity(EntityLorgaFlight.class, "Lorga Flight");
        ModMobRegistry.registerEntity(EntityMysteriousManLayer1.class, "Mysterious Man");
        ModMobRegistry.registerEntity(EntityMysteriousManLayer2.class, "Mysterious Man");
        ModMobRegistry.registerEntity(EntityMysteriousManLayer3.class, "Mysterious Man");
        ModMobRegistry.registerEntity(EntityHungerHungry.class, "Hunger Hungry");
        ModMobRegistry.registerEntity(EntityCryptKeeper.class, "Crypt Keeper");
        ModMobRegistry.registerEntity(EntityTempleGuardian.class, "Temple Guardian");
        ModMobRegistry.registerEntity(EntityEhu.class, "Ehu");
        ModMobRegistry.registerEntity(EntityStoneGolem.class, "Stone Golem");
        ModMobRegistry.registerEntity(EntityHusk.class, "Husk");
        ModMobRegistry.registerEntity(EntityVermsillion.class, "Vermsillion");
        ModMobRegistry.registerEntity(EntityRazorback.class, "Razorback");
        ModMobRegistry.registerEntity(EntityLivingStatue.class, "Living Statue");
        ModMobRegistry.registerEntity(EntityDeathcryx.class, "Deathcryx");
        ModMobRegistry.registerEntity(EntityDungeonPrisoner.class, "Dungeon Prisoner");
        ModMobRegistry.registerEntity(EntityDungeonDemon.class, "Dungeon Demon");
        ModMobRegistry.registerEntity(EntityRoamer.class, "Roamer");
        ModMobRegistry.registerEntity(EntityConstructor.class, "Constructor");
        ModMobRegistry.registerEntity(EntityDeathHound.class, "Death Hound");
        ModMobRegistry.registerEntity(EntityLeorna.class, "Leorna");
        ModMobRegistry.registerEntity(EntityCaptianMerik.class, "Captian Merik");
        ModMobRegistry.registerEntity(EntityDatticon.class, "Datticon");
        ModMobRegistry.registerEntity(EntityZelus.class, "Zelus");
        ModMobRegistry.registerEntity(EntityVatticus.class, "Lord Vatticus");
        ModMobRegistry.registerEntity(EntityFyracryx.class, "Fyracryx");
        ModMobRegistry.registerEntity(EntityParatiku.class, "Paratiku");
        ModMobRegistry.registerEntity(EntitySeimer.class, "Seimer");
        ModMobRegistry.registerEntity(EntityGolemOfRejuv.class, "Golem Of Rejuv");
        ModMobRegistry.registerEntity(EntityWraith.class, "Wraith");
        ModMobRegistry.registerEntity(EntityEnderTriplets.class, "Ender Triplets");

        ModMobRegistry.registerProjectile(EntityTeakerDisk.class, "Teaker Disk");
        ModMobRegistry.registerProjectile(EntityAmthirmisDisk.class, "Amthirmis Disk");
        ModMobRegistry.registerProjectile(EntityDarvenDisk.class, "Darven Disk");
        ModMobRegistry.registerProjectile(EntityCermileDisk.class, "Cermile Disk");
        ModMobRegistry.registerProjectile(EntityPardimalDisk.class, "Pardimal Disk");
        ModMobRegistry.registerProjectile(EntityQuadroticDisk.class, "Quadrotic Disk");
        ModMobRegistry.registerProjectile(EntityKarosDisk.class, "Karos Disk");
        ModMobRegistry.registerProjectile(EntityHeliosisDisk.class, "Heliosis Disk");
        ModMobRegistry.registerProjectile(EntityArksianeDisk.class, "Arksiane Disk");
        ModMobRegistry.registerProjectile(EntitySpinebackDisc.class, "Spineback Disk");
        ModMobRegistry.registerProjectile(EntityVetheanCannonShot.class, "Vethean Cannon Shot");
        ModMobRegistry.registerProjectile(EntityVetheanArrow.class, "Teaker Arrow");
        ModMobRegistry.registerProjectile(EntityVetheanArrow2.class, "Darven Arrow");
        ModMobRegistry.registerProjectile(EntityVetheanWarArrow.class, "Pardimal Arrow");
        ModMobRegistry.registerProjectile(EntityVetheanWrathArrow.class, "Karos Arrow");
        ModMobRegistry.registerProjectile(EntityKarosCannonShot.class, "Karos Cannon");
        ModMobRegistry.registerProjectile(EntitySpinebackCannonShot.class, "Spinback Cannon Shot");
        ModMobRegistry.registerProjectile(EntityEvernightProjectile.class, "Evernight Projectile");
        ModMobRegistry.registerProjectile(EntityBouncingProjectile.class, "Bouncing Projectile");
        ModMobRegistry.registerProjectile(EntityWreckExplosiveShot.class, "Wreck Explosive");
        ModMobRegistry.registerProjectile(EntityWreckStrengthShot.class, "Wreck Strength");
        ModMobRegistry.registerProjectile(EntityMandragoraProjectile.class, "Mandragora Projectile");

        ModMobRegistry.registerProjectile(EntityFirefly.class, "Firefly");
        ModMobRegistry.registerProjectile(EntityFyracryxFireball.class, "Fyracryx Fireball");
        ModMobRegistry.registerProjectile(EntityGrenade.class, "Grenade");
        ModMobRegistry.registerProjectile(EntityLamona.class, "Lamona");
        ModMobRegistry.registerProjectile(EntityLivingStatueArrow.class, "Living Statue Arrow");
        ModMobRegistry.registerProjectile(EntityMerikMissile.class, "Meric Missile");
        ModMobRegistry.registerProjectile(EntityReflector.class, "Reflector");
        ModMobRegistry.registerProjectile(EntitySparkler.class, "Sparkler");
        ModMobRegistry.registerProjectile(EntityStarfall.class, "Starlight");
        ModMobRegistry.registerProjectile(EntityPhaserHalite.class, "Halite Phaser");
        ModMobRegistry.registerProjectile(EntityPhaserAzurite.class, "Azurite Phaser");
        ModMobRegistry.registerProjectile(EntityPhaserMythril.class, "Mythril Phaser");
        ModMobRegistry.registerProjectile(EntityPhaserDravite.class, "Dravite Phaser");
        ModMobRegistry.registerProjectile(EntityPhaserAugite.class, "Augite Phaser");
        ModMobRegistry.registerProjectile(EntityPhaserUvite.class, "Uvite Phaser");
        ModMobRegistry.registerProjectile(EntityBlitzHalite.class, "Halite Blitz");
        ModMobRegistry.registerProjectile(EntityBlitzAzurite.class, "Azurite Blitz");
        ModMobRegistry.registerProjectile(EntityBlitzMythril.class, "Mythril Blitz");
        ModMobRegistry.registerProjectile(EntityBlitzDravite.class, "Dravite Blitz");
        ModMobRegistry.registerProjectile(EntityBlitzAugite.class, "Augite Blitz");
        ModMobRegistry.registerProjectile(EntityBlitzUvite.class, "Uvite Blitz");
        ModMobRegistry.registerProjectile(EntityDeathSeranade.class, "Death Serenade");
        ModMobRegistry.registerProjectile(EntityIce.class, "Ice");
        ModMobRegistry.registerProjectile(EntityCyclopsianStaff.class, "Cyclopsian Staff");

        
        Spawn();
    }

    public static void Spawn(){

        //Desert
        EntityRegistry.addSpawn(EntityDesertCrawler.class, 3, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.desertHills});

        //End
        EntityRegistry.addSpawn(EntityEnderWatcher.class, 10, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.sky});
        EntityRegistry.addSpawn(EntityEnderTriplets.class, 6, 2, 2, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.sky});

        //Jungle
        EntityRegistry.addSpawn(EntityJungleDramcryx.class, 20, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});
        EntityRegistry.addSpawn(EntityJungleBat.class, 20, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});
        EntityRegistry.addSpawn(EntityJungleSpider.class, 10, 1, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.jungle, BiomeGenBase.jungleHills});


        //Nether
        EntityRegistry.addSpawn(EntityHellSpider.class, 50, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});
        EntityRegistry.addSpawn(EntityScorcher.class, 14, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});
        EntityRegistry.addSpawn(EntityWildFire.class, 50, 1, 1, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});
        EntityRegistry.addSpawn(EntityHellBat.class, 50, 1, 2, EnumCreatureType.monster, new BiomeGenBase[] {BiomeGenBase.hell});


        //Overworld(All the biomes)
        EntityRegistry.addSpawn(EntityCyclops.class, 1, 1, 1, EnumCreatureType.monster, overworldBiomes);


        //Dravite Hills
        EntityRegistry.addSpawn(EntityDraviteTomo.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.DraviteHills});
        EntityRegistry.addSpawn(EntityCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.DraviteHills});
        EntityRegistry.addSpawn(EntitySerenityBunny.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.DraviteHills});
        EntityRegistry.addSpawn(EntityCori.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.DraviteHills});
        EntityRegistry.addSpawn(EntityNesro.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.DraviteHills});
        EntityRegistry.addSpawn(EntityMadivel.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.DraviteHills});

        //Azurite
        EntityRegistry.addSpawn(EntityAzuriteCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.Azurite});
        EntityRegistry.addSpawn(EntityAzuriteTomo.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.Azurite});
        EntityRegistry.addSpawn(EntityAzuriteGolem.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.Azurite});
        EntityRegistry.addSpawn(EntityVerek.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.Azurite});
        EntityRegistry.addSpawn(EntityMoonWolf.class, 1, 4, 4, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.Azurite});

        //Uvite
        EntityRegistry.addSpawn(EntityEnergyCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.Uvite});
        EntityRegistry.addSpawn(EntityEnergyGolem.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.Uvite});
        EntityRegistry.addSpawn(EntityEnergyTomo.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.Uvite});
        EntityRegistry.addSpawn(EntityEchantedWarrior.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.Uvite});
        EntityRegistry.addSpawn(EntityEnergyArcher.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.Uvite});

        //Mythril
        EntityRegistry.addSpawn(EntityMythrilFiend.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.mythilBiome});
        EntityRegistry.addSpawn(EntityMythrilGolem.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.mythilBiome});
        EntityRegistry.addSpawn(EntityMythrilArcher.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.mythilBiome});
        EntityRegistry.addSpawn(EntitySamek.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.mythilBiome});
        EntityRegistry.addSpawn(EntityCori2.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.mythilBiome});

        //Augite
        EntityRegistry.addSpawn(EntityAngryBunny.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.AugiteBiome});
        EntityRegistry.addSpawn(EntityDenseDemon.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.AugiteBiome});
        EntityRegistry.addSpawn(EntityBaslisk.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.AugiteBiome});
        EntityRegistry.addSpawn(EntitySoulStealer.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.AugiteBiome});
        EntityRegistry.addSpawn(EntityDenseCadillion.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.AugiteBiome});
        EntityRegistry.addSpawn(EntityAugiteArcher.class, 1, 4, 4, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.AugiteBiome});

        //Iceika
        EntityRegistry.addSpawn(EntityGlacide.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.IceikaMountains});
        EntityRegistry.addSpawn(EntityRollum.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.IceikaMountains});
        EntityRegistry.addSpawn(EntityAlicanto.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.IceikaMountains});
        EntityRegistry.addSpawn(EntityFractite.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.IceikaMountains});
        EntityRegistry.addSpawn(EntityHastreus.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.IceikaMountains});
        EntityRegistry.addSpawn(EntityFrostArcher.class, 2, 1, 10, EnumCreatureType.monster, new BiomeGenBase[] {DimensionRegistry.IceikaMountains});

        //Arcana
        EntityRegistry.addSpawn(EntityLeorna.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arcanaBiome});
        EntityRegistry.addSpawn(EntityDatticon.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arcanaBiome});
        EntityRegistry.addSpawn(EntityZelus.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arcanaBiome});
        EntityRegistry.addSpawn(EntityVatticus.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arcanaBiome});
        EntityRegistry.addSpawn(EntityCaptianMerik.class, 1, 1, 1, EnumCreatureType.creature, new BiomeGenBase[] {DimensionRegistry.arcanaBiome});
    }

}
