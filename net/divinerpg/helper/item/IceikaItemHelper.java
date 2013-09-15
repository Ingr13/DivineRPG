package net.divinerpg.helper.item;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.base.ItemDivineRPG;
import net.divinerpg.helper.base.ItemDivineRPGFood;
import net.divinerpg.helper.config.ItemConfigHelper;
import net.divinerpg.item.ItemEggNog;
import net.divinerpg.item.ItemEnderice;
import net.divinerpg.item.ItemFractiteCannon;
import net.divinerpg.item.ItemFrostClawCannon;
import net.divinerpg.item.ItemFrostkingSword;
import net.divinerpg.item.ItemFrozenMaul;
import net.divinerpg.item.ItemGlacierSword;
import net.divinerpg.item.ItemIceBow;
import net.divinerpg.item.ItemIceicleBane;
import net.divinerpg.item.ItemIceineSword;
import net.divinerpg.item.ItemMassivence;
import net.divinerpg.item.ItemSantaArmor;
import net.divinerpg.item.ItemSerenadeOfIce;
import net.divinerpg.item.ItemSnowSlash;
import net.divinerpg.item.ItemSnowStormBow;
import net.divinerpg.item.ItemSnowflakeShuriken;
import net.divinerpg.item.ItemSoundOfCarols;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class IceikaItemHelper {

	public static ItemConfigHelper x;

	public static int HEAD = 0;
	public static int BODY = 1;
	public static int LEGS = 2;
	public static int BOOTS = 3;

	static EnumArmorMaterial santa = EnumHelper.addArmorMaterial("santa", 200, new int[] {1, 1, 1, 1}, 22);

	public static final Item snowFlake = new ItemDivineRPG(x.SnowflakeID).registerTextures("SnowFlake").setUnlocalizedName("SF");
	public static final Item icicleBow = new ItemIceBow(x.IcicleBowID).setUnlocalizedName("IcicleBow").setCreativeTab(DivineRPG.Iceika);
	public static final Item icicleBane = new ItemIceicleBane(x.IcicleBaneID).registerTextures("IcicleBane").setUnlocalizedName("icicleBane").setCreativeTab(DivineRPG.Iceika);
	public static final Item soundOfCarols = new ItemSoundOfCarols(x.SoundOfCarolsID).registerTextures("SoundOfCarols").setUnlocalizedName("soundofCarols").setCreativeTab(DivineRPG.Iceika);
	public static final Item icineSword = new ItemIceineSword(x.IcineSwordID).registerTextures("IcineSword").setUnlocalizedName("icineSword").setCreativeTab(DivineRPG.Iceika);
	public static final Item enderice = new ItemEnderice(x.EndericeID).registerTextures("Enderice").setUnlocalizedName("enderice").setCreativeTab(DivineRPG.Iceika);
	public static final Item snowSlash = new ItemSnowSlash(x.SnowslashID).registerTextures("Snowslash").setUnlocalizedName("snowSlash").setCreativeTab(DivineRPG.Iceika);
	public static final Item serenadeOfIce = new ItemSerenadeOfIce(x.SerenadeOfIceID).registerTextures("SerenadeOfIce").setUnlocalizedName("serenadeofIce").setCreativeTab(DivineRPG.Iceika);
	public static final Item glacierSword = new ItemGlacierSword(x.GlacierSwordID).registerTextures("GlacierSword").setUnlocalizedName("glacierSword").setCreativeTab(DivineRPG.Iceika);
	public static final Item frostKingSword = new ItemFrostkingSword(x.FrostkingSwordID).registerTextures("FrostkingSword").setUnlocalizedName("frostKingSword").setCreativeTab(DivineRPG.Iceika);
	public static final Item frozenMaul = new ItemFrozenMaul(x.FrozenMaulID).registerTextures("FrozenMaul").setUnlocalizedName("frozenMaul").setCreativeTab(DivineRPG.Iceika);

	public static final Item frostClawCannon = new ItemFrostClawCannon(x.FrostclawCannonID).registerTextures("FrostclawCannon").setUnlocalizedName("frostClawCannon").setCreativeTab(DivineRPG.Iceika);
	public static final Item fractiteCannon = new ItemFractiteCannon(x.fractiteCannonID).registerTextures("FractiteCannon").setUnlocalizedName("fractiteCannon").setCreativeTab(DivineRPG.Iceika);
	public static final Item snowFlakeShuriken = new ItemSnowflakeShuriken(x.SnowflakeShurikenID).registerTextures("SnowFlakeShuriken").setUnlocalizedName("snowFlakeShuriken").setCreativeTab(DivineRPG.Iceika);
	public static final Item snowStormBow = new ItemSnowStormBow(x.SnowstormBowID).setUnlocalizedName("SnowstormBow").setCreativeTab(DivineRPG.Iceika);
	public static final Item pepperMints = new ItemDivineRPGFood(x.PeppermintsID, 1, 0.3F, false).registerTextures("Peppermints").setUnlocalizedName("pepperMints");
	public static final Item eggNog = new ItemEggNog(x.EggNogID).registerTextures("EggNog").setUnlocalizedName("eggNog").setCreativeTab(DivineRPG.Iceika);
	public static final Item chocolateLog = new ItemDivineRPGFood(x.ChocolateLogID, 4, 1.0F, false).registerTextures("ChocolateLog").setUnlocalizedName("chocolateLog");
	public static final Item snowCones = new ItemDivineRPGFood(x.SnowconesID, 2, 0.3F, false).registerTextures("SnowCones").setUnlocalizedName("snowCones");
	public static final Item fruitCake = new ItemDivineRPGFood(x.FruitCakeID, 16, 2.0F, false).registerTextures("FruitCake").setUnlocalizedName("fruitCake");

	public static final Item santaHead = new ItemSantaArmor(x.SantaHeadID, santa, 0, 0).setUnlocalizedName("SantaHelmet");
	public static final Item santaBody = new ItemSantaArmor(x.SantaBodyID, santa, 1, 1).setUnlocalizedName("SantaBody");
	public static final Item santaLegs = new ItemSantaArmor(x.SantaLegsID, santa,2, 2).setUnlocalizedName("SantaLegs");
	public static final Item santaBoots = new ItemSantaArmor(x.SantaBootsID, santa, 3, 3).setUnlocalizedName("SantaBoots");

	public static final Item frossivence = new ItemMassivence(x.FrossivenceID, EnumToolMaterial.WOOD).registerTextures("Frossivence").setUnlocalizedName("frossivence").setCreativeTab(DivineRPG.Iceika);

	public static void addNames()
	{
		LanguageRegistry.addName(snowFlake, "Snowflake");
		LanguageRegistry.addName(icicleBane, "Icicle Bane");
		LanguageRegistry.addName(soundOfCarols, "Sound of Carols");
		LanguageRegistry.addName(icineSword, "Icine Sword");
		LanguageRegistry.addName(frossivence, "Frossivence");
		LanguageRegistry.addName(enderice, "Enderice");
		LanguageRegistry.addName(snowSlash, "Snowslash");
		LanguageRegistry.addName(serenadeOfIce, "Serenade of Ice");
		LanguageRegistry.addName(glacierSword, "Glacier Sword");
		LanguageRegistry.addName(frostKingSword, "Frostking Sword");
		LanguageRegistry.addName(frozenMaul, "Frozen Maul");
		LanguageRegistry.addName(frostClawCannon, "Frostclaw Cannon");
		LanguageRegistry.addName(fractiteCannon, "Fractite Cannon");
		LanguageRegistry.addName(snowFlakeShuriken, "Snowflake Shuriken");
		LanguageRegistry.addName(icicleBow, "Icicle Bow");
		LanguageRegistry.addName(snowStormBow, "Snowstorm Bow");
		LanguageRegistry.addName(pepperMints, "Peppermints");
		LanguageRegistry.addName(eggNog, "Egg Nog");
		LanguageRegistry.addName(chocolateLog, "Chocolate Log");
		LanguageRegistry.addName(snowCones, "Snow Cones");
		LanguageRegistry.addName(fruitCake, "Fruit Cake");
		LanguageRegistry.addName(santaHead, "Santa Head");        
		LanguageRegistry.addName(santaBody, "Santa Body");
		LanguageRegistry.addName(santaLegs, "Santa Legs");
		LanguageRegistry.addName(santaBoots, "Santa Boots");

	}
}
