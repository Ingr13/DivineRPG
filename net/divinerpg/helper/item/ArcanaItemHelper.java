package net.divinerpg.helper.item;

import net.divinerpg.DivineRPG;
import net.divinerpg.arcana.item.ItemOreDoor1;
import net.divinerpg.arcana.item.ItemOreDoor2;
import net.divinerpg.arcana.item.ItemOreDoor3;
import net.divinerpg.arcana.item.ItemOreDoor4;
import net.divinerpg.helper.base.ItemDivineRPG;
import net.divinerpg.helper.base.ItemDivineRPGFood;
import net.divinerpg.helper.config.ItemConfigHelper;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ArcanaItemHelper {
	
	public static ItemConfigHelper x;

	//public static final Item weakArcanaPotion = new ItemArcanaPotion(4407, 0).registerTextures("WeakArcanaPotion").setUnlocalizedName("WeakArcana");
	//public static final Item strongArcanaPotion = new ItemArcanaPotion(4408, 0).registerTextures("StrongArcanaPotion").setUnlocalizedName("StrongArcana");
	public static final Item fireStockItem = new ItemDivineRPG(x.fireStockItemID).registerTextures("FireStock").setUnlocalizedName("fireStockItem").setCreativeTab(DivineRPG.Arcana);
	// public static final Item fireStockSeeds = new ItemDivineRPGSeeds(4410, OverworldBlockHelper.fireStock.blockID, OverworldBlockHelper.arcaniteGrass.blockID).registerTextures("FireStockSeeds").setUnlocalizedName("fireStockSeeds").setCreativeTab(DivineRPG.DivineFood);
	//public static final Item pinFlyItem = new ItemPinFly(4411, 2, 0.3F, false).registerTextures("PinFly").setUnlocalizedName("pinflyItem").setCreativeTab(DivineRPG.DivineFood);
	// public static final Item pinFlySeeds = new ItemDivineRPGSeeds(4412, OverworldBlockHelper.pinFly.blockID, OverworldBlockHelper.arcaniteGrass.blockID).registerTextures("PinFlySeeds").setUnlocalizedName("pinFlySeeds").setCreativeTab(DivineRPG.DivineFood);
	public static final Item hitchakItem = new ItemDivineRPGFood(x.hitchakItemID, 2, 3.0F, false).registerTextures("Hitchak").setUnlocalizedName("hitchakItem").setCreativeTab(DivineRPG.Arcana);
	//public static final Item hitchakSeeds = new ItemDivineRPGSeeds(4414, OverworldBlockHelper.hitchak.blockID, OverworldBlockHelper.arcaniteGrass.blockID).registerTextures("HitchakSeeds").setUnlocalizedName("hitchakSeeds").setCreativeTab(DivineRPG.DivineFood);
	//public static final Item eucalyptusRootSeeds = new ItemDivineRPGSeeds(4415, OverworldBlockHelper.eucalyptusRoot.blockID, OverworldBlockHelper.arcaniteGrass.blockID).registerTextures("EucalyptusRootSeeds").setUnlocalizedName("eucalyptusRootSeeds").setCreativeTab(DivineRPG.DivineFood);
	public static final Item veiloItem = new ItemDivineRPG(x.veiloItemID).registerTextures("Veilo").setUnlocalizedName("veiloItem").setCreativeTab(DivineRPG.Arcana);
	//public static final Item veiloSeeds = new ItemDivineRPGSeeds(4417, OverworldBlockHelper.veilo.blockID, OverworldBlockHelper.arcaniteGrass.blockID).registerTextures("VeiloSeeds").setUnlocalizedName("veiloSeeds").setCreativeTab(DivineRPG.DivineFood);
	//public static final Item lamonaItem = new ItemLamona(4418).registerTextures("Lamona").setUnlocalizedName("lamonaItem").setCreativeTab(DivineRPG.DivineFood);
	//public static final Item lamonaSeeds = new ItemDivineRPGSeeds(4419, OverworldBlockHelper.lamona.blockID, OverworldBlockHelper.arcaniteGrass.blockID).registerTextures("LamonaSeeds").setUnlocalizedName("lamonaSeeds").setCreativeTab(DivineRPG.DivineFood);
	//public static final Item aquamarineItem = new ItemAquaMarine(4420).registerTextures("Aquamarine").setUnlocalizedName("aquamarineItem").setCreativeTab(DivineRPG.DivineFood);
	//public static final Item aquamarineSeeds = new ItemDivineRPGSeeds(4421, OverworldBlockHelper.aquamarine.blockID, OverworldBlockHelper.arcaniteGrass.blockID).registerTextures("AquamarineSeeds").setUnlocalizedName("aquamarineSeeds").setCreativeTab(DivineRPG.DivineFood);
	public static final Item marsineItem = new ItemDivineRPG(x.marsineItemID).registerTextures("Marasine").setUnlocalizedName("marsineItem").setCreativeTab(DivineRPG.Arcana);
	/*public static final Item marsineSeeds = new ItemDivineRPGSeeds(4423, OverworldBlockHelper.marsine.blockID, OverworldBlockHelper.arcaniteGrass.blockID).registerTextures("MarasineSeeds").setUnlocalizedName("marsineSeeds").setCreativeTab(DivineRPG.DivineFood);
	    //public static final Item reflector = new ItemReflector(4424).registerTextures("ArcaniumReflector").setCreativeTab(DivineRPG.DivineSword).setUnlocalizedName("reflector");

	    //public static final Item fyracryxSpawner = new ItemFyracryxSpawner(4425).registerTextures("Spawner_1").setUnlocalizedName("fyracryxSpawner").setCreativeTab(DivineRPG.DivineItem);
	    //public static final Item paratikuSpawner = new ItemParatikuSpawner(4426).registerTextures("Spawner_2").setUnlocalizedName("paratikuSpawner").setCreativeTab(DivineRPG.DivineItem);
	    //public static final Item seimerSpawner = new ItemSeimerSpawner(4427).registerTextures("Spawner_3").setUnlocalizedName("seimerSpawner").setCreativeTab(DivineRPG.DivineItem);
	    //public static final Item golemOfRejuvSpawner = new ItemGolemOfRejuvSpawner(4428).registerTextures("Spawner_4").setUnlocalizedName("golemOfRejuvSpawner").setCreativeTab(DivineRPG.DivineItem);

	    //public static final Item stormSword = new ItemStormSword(4429, arcanaSword).registerTextures("StormSword").setCreativeTab(DivineRPG.DivineSword).setUnlocalizedName("stormSword");
	    public static final Item shadowSword = new ItemShadowSword(4430, arcanaSword).registerTextures("ShadowSaber").setCreativeTab(DivineRPG.DivineSword).setUnlocalizedName("shadowSword");
	    public static final Item arcaniumSaber = new ItemArcaniumSaber(4431, arcanaSword).registerTextures("ArcaniumSaber").setCreativeTab(DivineRPG.DivineSword).setUnlocalizedName("arcaniumSaber");
	    public static final Item liviciaSword = new ItemLiviciaSword(4432, arcanaSword).registerTextures("LiviciaSword").setCreativeTab(DivineRPG.DivineSword).setUnlocalizedName("liviciaSword");

	    public static final Item staffOfStarlight = new ItemStarfall(4433).registerTextures("StaffOfStarLight").setCreativeTab(DivineRPG.DivineRanged).setUnlocalizedName("staffOfStarlight");
	    public static final Item wraithbane = new ItemWraithbane(4434).registerTextures("WraithBane").setCreativeTab(DivineRPG.DivineSword).setUnlocalizedName("wraithbane");
	    public static final Item captiansSparkler = new ItemCaptiansSparkeler(4433).registerTextures("CaptainsSparkler").setCreativeTab(DivineRPG.DivineRanged).setUnlocalizedName("captiansSparkler");
	    public static final Item enderScepter = new ItemEnderScepter(4434).registerTextures("EnderScepter").setUnlocalizedName("enderScepter").setCreativeTab(DivineRPG.DivineSword);
	    public static final Item grenadeLauncher = new ItemGrenadeLauncher(4435, 3).registerTextures("GrenadeLauncher").setCreativeTab(DivineRPG.DivineRanged).setUnlocalizedName("grenadeLauncher");
	    public static final Item grenade = new ItemGrenade(4436, 3).registerTextures("Grenade").setCreativeTab(DivineRPG.DivineRanged).setUnlocalizedName("grenade");
	    public static final Item meriksMissile = new ItemMeriksMissile(4437, 0, 0, true).setCreativeTab(DivineRPG.DivineRanged).setUnlocalizedName("meriksMissile");
	    public static final Item firefly = new ItemFirefly(4438).registerTextures("FireFly").setUnlocalizedName("firefly").setCreativeTab(DivineRPG.DivineRanged);
	    public static final Item starfall = new ItemStarfall(4439).registerTextures("Starlight").setUnlocalizedName("starfall").setCreativeTab(DivineRPG.DivineRanged);
	    public static final Item arcaniumBucket = new ItemTarBucket(4440, 0).registerTextures("ArcaniumBucket").setUnlocalizedName("arcaniumBucket").setCreativeTab(DivineRPG.tabItems);
	    public static final Item staffOfEnrichment = new ItemStaffOfEnrichment(4441).registerTextures("StaffOfEnrichment").setUnlocalizedName("staffOfEnrichment").setCreativeTab(DivineRPG.tabTool);
	    public static final Item orbOfLight = new ItemOrbOfLight(4442).registerTextures("OrbOfLight");
	    public static final Item wizardBook = new ItemWizardBook(4443).registerTextures("WizardBook").setUnlocalizedName("WizardBook");

	    public static final Item kormaHead = new ItemArmorKorma(4444, korma, 0, HEAD).setUnlocalizedName("KormaHelmet").setCreativeTab(DivineRPG.DivineArmor);
	    public static final Item kormaBody = new ItemArmorKorma(4445, korma, 1, BODY).setUnlocalizedName("KormaBody").setCreativeTab(DivineRPG.DivineArmor);
	    public static final Item kormaLegs = new ItemArmorKorma(4446, korma, 2, LEGS).setUnlocalizedName("KormaLegs").setCreativeTab(DivineRPG.DivineArmor);
	    public static final Item kormaBoots = new ItemArmorKorma(4447, korma, 3, BOOTS).setUnlocalizedName("KormaBoots").setCreativeTab(DivineRPG.DivineArmor);

	    public static final Item vemosHead = new ItemArmorVemos(4448, korma, 0, HEAD).setUnlocalizedName("VemosHelmet").setCreativeTab(DivineRPG.DivineArmor);
	    public static final Item vemosBody = new ItemArmorVemos(4449, korma, 1, BODY).setUnlocalizedName("VemosBody").setCreativeTab(DivineRPG.DivineArmor);
	    public static final Item vemosLegs = new ItemArmorVemos(4450, korma, 2, LEGS).setUnlocalizedName("VemosLegs").setCreativeTab(DivineRPG.DivineArmor);
	    public static final Item vemosBoots = new ItemArmorVemos(4451, korma, 3, BOOTS).setUnlocalizedName("VemosBoots").setCreativeTab(DivineRPG.DivineArmor);
	 */

	public static final Item key = new ItemDivineRPG(x.key1ID).registerTextures("Key").setUnlocalizedName("Key").setCreativeTab(DivineRPG.Arcana);
	public static final Item key1 = new ItemDivineRPG(x.key2ID).registerTextures("Key1").setUnlocalizedName("Key").setCreativeTab(DivineRPG.Arcana);
	public static final Item key2 = new ItemDivineRPG(x.key3ID).registerTextures("Key2").setUnlocalizedName("Key").setCreativeTab(DivineRPG.Arcana);
	public static final Item key3 = new ItemDivineRPG(x.key4ID).registerTextures("Key3").setUnlocalizedName("Key").setCreativeTab(DivineRPG.Arcana);

	public static final Item OreDoor1 = new ItemOreDoor1(x.oreDoorItem1ID, Material.wood).registerTextures("OreDoor1").setUnlocalizedName("OreDoor1").setCreativeTab(DivineRPG.Arcana);
	public static final Item OreDoor2 = new ItemOreDoor2(x.oreDoor2ItemID, Material.wood).registerTextures("OreDoor2").setUnlocalizedName("OreDoor2").setCreativeTab(DivineRPG.Arcana);
	public static final Item OreDoor3 = new ItemOreDoor3(x.oreDoor3ItemID, Material.wood).registerTextures("OreDoor3").setUnlocalizedName("OreDoor3").setCreativeTab(DivineRPG.Arcana);
	public static final Item OreDoor4 = new ItemOreDoor4(x.oreDoor4ItemID, Material.wood).registerTextures("OreDoor4").setUnlocalizedName("OreDoor4").setCreativeTab(DivineRPG.Arcana);

	public static final Item arcanium = new ItemDivineRPG(x.arcaniumID).registerTextures("Arcanium").setUnlocalizedName("acanium").setCreativeTab(DivineRPG.Arcana);
	public static final Item collectorFragments = new ItemDivineRPG(x.collectorFragmentsID).registerTextures("CollectorFragment").setUnlocalizedName("collectorFragments").setCreativeTab(DivineRPG.Arcana);
	public static final Item collector = new ItemDivineRPG(x.collectorID).registerTextures("CollectorCharged").setUnlocalizedName("CollectorCharged").setCreativeTab(DivineRPG.Arcana);
	public static final Item dungeonToken = new ItemDivineRPG(x.dungeonTokenID).registerTextures("DungeonTokens").setUnlocalizedName("dungeonToken").setCreativeTab(DivineRPG.Arcana);

	public static void addNames()
	{
		LanguageRegistry.addName(OreDoor1, "Locked Door");
		LanguageRegistry.addName(OreDoor2, "Locked Door");
		LanguageRegistry.addName(OreDoor3, "Locked Door");
		LanguageRegistry.addName(OreDoor4, "Locked Door");
		//LanguageRegistry.addName(wizardBook, "Wizard's Book");
		LanguageRegistry.addName(key, "Key");
		LanguageRegistry.addName(key1, "Key");
		LanguageRegistry.addName(key2, "Key");
		LanguageRegistry.addName(key3, "Key");

		LanguageRegistry.addName(fireStockItem, "Firestock");
		////LanguageRegistry.addName(fireStockSeeds, "Firestock Seeds");
		//LanguageRegistry.addName(pinFlyItem, "Pinfly");
		//LanguageRegistry.addName(pinFlySeeds, "Pinfly Seeds");
		LanguageRegistry.addName(hitchakItem, "Hitchak");
		//LanguageRegistry.addName(hitchakSeeds, "Hitchak Seeds");
		//LanguageRegistry.addName(eucalyptusRootSeeds, "Eucalyptus Root Seeds");
		LanguageRegistry.addName(veiloItem, "Veilo");
		//LanguageRegistry.addName(veiloSeeds, "Veilo Seeds");
		//LanguageRegistry.addName(lamonaItem, "Lamona");
		//LanguageRegistry.addName(lamonaSeeds, "Lamona Seeds");
		//LanguageRegistry.addName(aquamarineItem, "Aquamarine");
		//LanguageRegistry.addName(aquamarineSeeds, "Aquamarine Seeds");
		LanguageRegistry.addName(marsineItem, "Marasine");
		//LanguageRegistry.addName(marsineSeeds, "Marasine Seeds");

		//LanguageRegistry.addName(fyracryxSpawner, "Fyracryx Egg");
		//LanguageRegistry.addName(paratikuSpawner, "Paratiku Egg");
		//LanguageRegistry.addName(seimerSpawner, "Seimer Egg");
		//LanguageRegistry.addName(golemOfRejuvSpawner, "Golem of Rejuvination Egg");

		/*LanguageRegistry.addName(reflector, "Arcanium Reflector");
		LanguageRegistry.addName(stormSword, "Storm Sword");
		LanguageRegistry.addName(shadowSword, "Shadow Sword");
		LanguageRegistry.addName(arcaniumSaber, "Arcanium Saber");
		LanguageRegistry.addName(liviciaSword, "Livicia Sword");
		LanguageRegistry.addName(staffOfStarlight, "Staff of Starlight");
		LanguageRegistry.addName(wraithbane, "Wraithbane");
		LanguageRegistry.addName(captiansSparkler, "Captain's Sparkler");
		LanguageRegistry.addName(firefly, "Firefly");
		LanguageRegistry.addName(starfall, "Starlight");
		LanguageRegistry.addName(grenade, "Grenade");
		LanguageRegistry.addName(grenadeLauncher, "Grenade Launcher");
		LanguageRegistry.addName(meriksMissile, "Merik's Missile");
		LanguageRegistry.addName(enderScepter, "Ender Scepter");
		LanguageRegistry.addName(orbOfLight, "Orb of Light");
		 */
		LanguageRegistry.addName(dungeonToken, "Dungeon Token");
		LanguageRegistry.addName(arcanium, "Arcanium");
		//LanguageRegistry.addName(weakArcanaPotion, "Weak Arcana Potion");
		//LanguageRegistry.addName(strongArcanaPotion, "Strong Arcana Potion");
		//LanguageRegistry.addName(arcaniumBucket, "Arcanium Bucket");

		LanguageRegistry.addName(collector, "Charge Collector");
		LanguageRegistry.addName(collectorFragments, "Collector Fragment");

		/*
		LanguageRegistry.addName(staffOfEnrichment, "Staff of Enrichment");

		LanguageRegistry.addName(kormaHead, "Korma Helmet");
		LanguageRegistry.addName(kormaBody, "Korma Chestplate");
		LanguageRegistry.addName(kormaLegs, "Korma Leggings");
		LanguageRegistry.addName(kormaBoots, "Korma Boots");

		LanguageRegistry.addName(vemosHead, "Vemos Helmet");
		LanguageRegistry.addName(vemosBody, "Vemos Chestplate");
		LanguageRegistry.addName(vemosLegs, "Vemos Leggings");
		LanguageRegistry.addName(vemosBoots, "Vemos Boots");
		 */


	}
}
