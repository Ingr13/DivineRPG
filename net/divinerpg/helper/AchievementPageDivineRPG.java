package net.divinerpg.helper;

import net.divinerpg.helper.block.ArcanaBlockHelper;
import net.divinerpg.helper.block.IceikaBlockHelper;
import net.divinerpg.helper.block.OverworldBlockHelper;
import net.divinerpg.helper.block.TwilightBlockHelper;
import net.divinerpg.helper.item.ArcanaItemHelper;
import net.divinerpg.helper.item.OverworldItemHelper;
import net.divinerpg.helper.item.TwilightItemHelper;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;


public class AchievementPageDivineRPG 
{
    public static final Achievement divineInervention = (new Achievement(2002, "divineintervention", 0, 3, OverworldItemHelper.watchingEye, null)).registerAchievement();
    public static final Achievement	divinePlan = (new Achievement(2001, "divineplan", 1, 4, OverworldItemHelper.divineSword, divineInervention)).registerAchievement();
    public static final Achievement liesWithin = (new Achievement(2003, "lieswithin", 0, 5, ArcanaBlockHelper.arcanaPortalFrame, null)).registerAchievement();
    //public static final Achievement perfectlyCorrupted = (new Achievement(2006, "perfectlycorrupted", 5, 0, OverworldBlockHelper.superEnchantMentTable, null)).registerAchievement();
    public static final Achievement	totalDemonization = (new Achievement(2007, "totaldemonization", 3, 11, ArcanaBlockHelper.demonFurnace, liesWithin)).registerAchievement();
    public static final Achievement greatBirdFire = (new Achievement(2008, "evildisease", 3, 9, ArcanaItemHelper.dungeonToken, liesWithin)).registerAchievement();
    public static final Achievement dungeonMaster = (new Achievement(2009, "dungeonMaster", 3, 4, ArcanaItemHelper.dungeonToken, liesWithin)).registerAchievement();
    public static final Achievement eyeOfEvil = (new Achievement(2010, "eyeOfEvil", 0, 0, OverworldItemHelper.rupeeIngot, null)).registerAchievement();
    public static final Achievement tripleDanger = (new Achievement(2011, "tripleDanger", 2, 0, OverworldItemHelper.enderShard, null)).registerAchievement();
    public static final Achievement	possibilities = (new Achievement(2012, "possibilities", 2, 3, OverworldBlockHelper.divineRock, divineInervention)).registerAchievement();
    public static final Achievement friendOrFoe = (new Achievement(2004, "friendorfoe", 4, 3, TwilightItemHelper.draviteSoul, possibilities)).registerAchievement();
    public static final Achievement darkAnotherDay = (new Achievement(2026, "darkanotherday", 6, 3, TwilightBlockHelper.augiteBlock, possibilities)).registerAchievement();
    //public static final Achievement tenHeadsIsBetterThanOne = (new Achievement(2005, "Spawn Densos and Reyvor", 6, 2, TwilightItemHelper.spawnDensos, darkAnotherDay)).registerAchievement();
    public static final Achievement whenPigsFly = (new Achievement(2027, "whenpigsfly", 3, 2, OverworldItemHelper.angelicHelmet, divineInervention)).registerAchievement();
    public static final Achievement offKey = (new Achievement(2029, "offkey", 6, 0, OverworldItemHelper.soundOfMusic, null)).registerAchievement();
   // public static final Achievement skyHigh = (new Achievement(2028, "skyhigh", 3, 5, OverworldBlockHelper.elevantium, liesWithin)).registerAchievement();
   // public static final Achievement	allHellLoose = (new Achievement(2030, "allhellloose", 3, 10, OverworldItemHelper.stormSword, liesWithin)).registerAchievement();
    //public static final Achievement enrichment = (new Achievement(2013, "enrichment", 3, 7, ArcanaItemHelper.staffOfEnrichment, liesWithin)).registerAchievement();
    public static final Achievement hoterthanHell = (new Achievement(2014, "hotterthanHell", 3, 9, ArcanaBlockHelper.heatTrapsOn, liesWithin)).registerAchievement();
    //public static final Achievement	mealToRemember = (new Achievement(2015, "mealToRemember", 1, 0, OverworldItemHelper.dinner, null)).registerAchievement();
    //public static final Achievement yuk = (new Achievement(2016, "yuk", 3, 8, ArcanaItemHelper.weakArcanaPotion, liesWithin)).registerAchievement();
    //public static final Achievement littleCreature = (new Achievement(2017, "littlecreature", 3, 6, ArcanaItemHelper.seimerSpawner, liesWithin)).registerAchievement();
    public static final Achievement	halloweenSpirit = (new Achievement(2018, "halloweenspirit", 4, 0, OverworldItemHelper.scythe, null)).registerAchievement();
    //public static final Achievement oneLamp = (new Achievement(2019, "onelamp", 2, 4, TwilightBlockHelper.draviteLamp, possibilities)).registerAchievement();
    public static final Achievement feedingOnTheFish = (new Achievement(2020, "feedingonthefish", 3, 0, OverworldItemHelper.sharkFin, null)).registerAchievement();
    //public static final Achievement arrowToTheKnee = (new Achievement(2021, "arrototheknee", 6, 4, TwilightItemHelper.AzuriteArrow, darkAnotherDay)).registerAchievement();
    public static final Achievement frozenLand= (new Achievement(2022, "frozenland", 0, 1, IceikaBlockHelper.IceikaPortal, null)).registerAchievement();
    public static final Achievement frozenGoods = (new Achievement(2023, "frozengoods", 7, 1, IceikaBlockHelper.frostedChest, frozenLand)).registerAchievement();
    //public static final Achievement lilGift = (new Achievement(2024, "lilgift", 7, 0, IceikaBlockHelper.giftBox, frozenGoods)).registerAchievement();
    //public static final Achievement lilTinkerin = (new Achievement(2025, "liltinkerin", 7, 2, OverworldItemHelper.frozenMaul, frozenGoods)).registerAchievement();

    public static AchievementPage divinerpgpage= new AchievementPage("DivineRPG", divinePlan,
			divineInervention, liesWithin, friendOrFoe,
			/*tenHeadsIsBetterThanOne, perfectlyCorrupted,*/
			totalDemonization, greatBirdFire, dungeonMaster,
			eyeOfEvil, tripleDanger, possibilities, /*enrichment,*/ hoterthanHell, /*mealToRemember, yuk,
			littleCreature,*/ halloweenSpirit,
			/*oneLamp,*/ feedingOnTheFish, /*arrowToTheKnee,*/ frozenLand, frozenGoods, /*lilGift,
			lilTinkerin, 
			skyHigh,*/ whenPigsFly, offKey/*, allHellLoose*/, darkAnotherDay);
    
    public static void Init()
    {    
		AchievementPage.registerAchievementPage(divinerpgpage);
    } //TODO: THIS
}
