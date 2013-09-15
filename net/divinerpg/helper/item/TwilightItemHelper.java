package net.divinerpg.helper.item;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.base.ItemDivineRPG;
import net.divinerpg.helper.base.ItemDivineRPGFood;
import net.divinerpg.item.ItemAugiteArmor;
import net.divinerpg.item.ItemAzuriteArmor;
import net.divinerpg.item.ItemBlitz;
import net.divinerpg.item.ItemBowCore;
import net.divinerpg.item.ItemDivineArmor;
import net.divinerpg.item.ItemDivineArmorBase;
import net.divinerpg.item.ItemDraviteArmor;
import net.divinerpg.item.ItemHaliteArmor;
import net.divinerpg.item.ItemHaliteBow;
import net.divinerpg.item.ItemMythrilArmor;
import net.divinerpg.item.ItemPhaser;
import net.divinerpg.item.ItemSlicer;
import net.divinerpg.item.ItemUviteArmor;
import net.divinerpg.item.TwilightBow;
import net.divinerpg.item.tool.ToolSword;
import net.divinerpg.lib.Sound;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class TwilightItemHelper {

    public static int HEAD = 0, BODY = 1, LEGS = 2, BOOTS = 3;

    public static EnumToolMaterial halite = EnumHelper.addToolMaterial("halite", 10, 2000, 0, 86, 22);
    public static EnumToolMaterial mythril = EnumHelper.addToolMaterial("mythril", 100, 2000, 48.0F, 68, 0);
    public static EnumToolMaterial dravite = EnumHelper.addToolMaterial("dravite", 100, 6000, 20.0F, 1, 0);

    //TODO: The armor strenghts
    static EnumArmorMaterial divineArmor = EnumHelper.addArmorMaterial("divine", 300, new int[] {5, 10, 6, 4}, 44);
    static EnumArmorMaterial haliteArmor = EnumHelper.addArmorMaterial("halite", 350, new int[] {7, 12, 8, 6}, 50);
    static EnumArmorMaterial draviteArmor = EnumHelper.addArmorMaterial("dravite", 200, new int[] {3,  4, 3, 2 }, 10);
    static EnumArmorMaterial MythrilArmor = EnumHelper.addArmorMaterial("mythril", 200, new int[] {3,  4, 3, 2 }, 10);
    static EnumArmorMaterial UviteArmor = EnumHelper.addArmorMaterial("uvite", 200, new int[] {3,  4, 3, 2 }, 10);
    static EnumArmorMaterial AzuriteArmor = EnumHelper.addArmorMaterial("azurite", 200, new int[] {3,  4, 3, 2 }, 10);
    static EnumArmorMaterial AugiteArmor = EnumHelper.addArmorMaterial("augite", 200, new int[] {3,  4, 3, 2 }, 10);

    public static Item AugiteAxe;
    public static Item AugitePickaxe;
    public static Item AugiteShovel;
    public static Item AzuriteAxe;
    public static Item AzuritePickaxe;
    public static Item AzuriteShovel;
    public static Item DraviteAxe;
    public static Item DravitePickaxe;
    public static Item DraviteShovel;
    public static Item fireThrower;
    public static Item MythrilAxe;
    public static Item MythrilPickaxe;
    public static Item MythrilShovel;
    public static Item spawnMamormeter;
    public static Item spawnReyvor;
    public static Item spawnZichile;
    public static Item UviteAxe;
    public static Item UvitePickaxe;
    public static Item UviteShovel;

    //Halite
    public static final Item haliteHelmet = new ItemHaliteArmor(1193, haliteArmor, 0, HEAD).setUnlocalizedName("HaliteHelmet").setCreativeTab(DivineRPG.Twilight);
    public static final Item haliteBody = new ItemHaliteArmor(1194, haliteArmor, 1, BODY).setUnlocalizedName("HaliteBody").setCreativeTab(DivineRPG.Twilight);
    public static final Item haliteLegs = new ItemHaliteArmor(1195, haliteArmor, 2, LEGS).setUnlocalizedName("HaliteLegs").setCreativeTab(DivineRPG.Twilight);
    public static final Item haliteBoots = new ItemHaliteArmor(1196, haliteArmor, 3, BOOTS).setUnlocalizedName("HaliteBoots").setCreativeTab(DivineRPG.Twilight);
    public static final Item haliteBow = new ItemHaliteBow(1197).setUnlocalizedName("HaliteBow").setCreativeTab(DivineRPG.Twilight);
    public static final Item halitePhaser = new ItemPhaser(1198, 0, 1, 2, Sound.Phaser, Sound.Phaser).registerTextures("HalitePhaser").setUnlocalizedName("HalitePhaser").setCreativeTab(DivineRPG.Twilight);
    public static final Item HaliteBlade = new ToolSword(1199, halite).registerItemTexture("HaliteBlade").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("HaliteBlade");
    public static final Item HaliteSlicer = new ItemSlicer(1200).registerTextures("HaliteSlicer").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("HaliteSlicer");
    public static final Item HaliteBlitz = new ItemBlitz(1201).registerTextures("HaliteBlitz").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("HaliteBlitz");

    //Mythril
    public static final Item mythrilFragment = new ItemDivineRPG(1202).registerTextures("MythrilFragments").setUnlocalizedName("Frag4").setCreativeTab(DivineRPG.Twilight);
    public static final Item mythrilSoul = new ItemDivineRPG(1203).registerTextures("MythrilSoul").setUnlocalizedName("Soul4").setCreativeTab(DivineRPG.Twilight);
    public static final Item mythrilChunk = new ItemDivineRPG(1204).registerTextures("MythrilChunk").setUnlocalizedName("Chunk5").setCreativeTab(DivineRPG.Twilight);
    public static final Item mythrilDust = new ItemDivineRPG(1205).registerTextures("MythrilDust").setUnlocalizedName("Dust6").setCreativeTab(DivineRPG.Twilight);
    public static final Item mythrilGem = new ItemDivineRPG(1206).registerTextures("MythrilGem").setUnlocalizedName("Gem7").setCreativeTab(DivineRPG.Twilight);
    public static final Item MythrilBlade = new ToolSword(1207, mythril).registerItemTexture("MythrilBlade").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("MythrilBlade");
    public static final Item MythrilPhaser = new ItemPhaser(1208, 0, 1, 2, Sound.Phaser, Sound.Phaser).registerTextures("MythrilPhaser").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("MythrilPhaser");
    public static final Item MythrilBlitz = new ItemBlitz(1209).registerTextures("MythrilBlitz").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("MythrilBlitz");
    public static final Item MythrilBow = new ItemBowCore(1210).registerTextures("MythrilBow_0").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("MythrilBow");
    public static final Item MythrilHelmet = new ItemMythrilArmor(1211, MythrilArmor, 0, HEAD).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("MythrilHelmet");
    public static final Item MythrilBoots = new ItemMythrilArmor(1212, MythrilArmor, 3, BOOTS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("MythrilBoots");
    public static final Item Mythrillegs = new ItemMythrilArmor(1213, MythrilArmor, 2, LEGS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("MythrilLegs");
    public static final Item MythrilChest = new ItemMythrilArmor(1214, MythrilArmor, 1, BODY).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("MythrilBody");
    public static final Item MythrilSlicer = new ItemSlicer(1215).registerTextures("MythrilSlicer").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("MythrilSlicer");

    //Divine
    public static final Item divineHelmet = new ItemDivineArmor(1216, divineArmor, 0, HEAD).setUnlocalizedName("DivineHelmet").setCreativeTab(DivineRPG.Twilight);
    public static final Item divineBody = new ItemDivineArmor(1217, divineArmor, 1, BODY).setUnlocalizedName("DivineBody").setCreativeTab(DivineRPG.Twilight);
    public static final Item divineLegs = new ItemDivineArmor(1218, divineArmor, 2, LEGS).setUnlocalizedName("DivineLegs").setCreativeTab(DivineRPG.Twilight);
    public static final Item divineBoots = new ItemDivineArmor(1219, divineArmor, 3, BOOTS).setUnlocalizedName("DivineBoots").setCreativeTab(DivineRPG.Twilight);

    //Dravite
    public static final Item draviteFragment = new ItemDivineRPG(1220).registerTextures("DraviteFragments").setUnlocalizedName("Frag1").setCreativeTab(DivineRPG.Twilight);
    public static final Item draviteSoul = new ItemDivineRPG(1221).registerTextures("DraviteSoul").setUnlocalizedName("Soul1").setCreativeTab(DivineRPG.Twilight);
    public static final Item draviteChunk = new ItemDivineRPG(1222).registerTextures("DraviteChunk").setUnlocalizedName("Chunk1").setCreativeTab(DivineRPG.Twilight);
    public static final Item draviteDust = new ItemDivineRPG(1223).registerTextures("DraviteDust").setUnlocalizedName("Dust1").setCreativeTab(DivineRPG.Twilight);
    public static final Item draviteGem = new ItemDivineRPG(1224).registerTextures("DraviteGem").setUnlocalizedName("Gem1").setCreativeTab(DivineRPG.Twilight);
    public static final Item DraviteBlade = new ToolSword(1225, dravite).registerItemTexture("DraviteBlade").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("DraviteBlade");
    public static final Item DravitePhaser = new ItemPhaser(1226, 0, 1, 2, Sound.Phaser, Sound.Phaser).registerTextures("DravitePhaser").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("DravitePhaser");
    public static final Item DraviteBlitz = new ItemBlitz(1227).registerTextures("DraviteBlitz").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("DraviteBlitz");
    public static final Item DraviteBow = new ItemBowCore(1228).registerTextures("DraviteBow0").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("DraviteBow");
    public static final Item DraviteHelmet = new ItemDraviteArmor(1229, draviteArmor, 0, HEAD).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("DraviteHelmet");
    public static final Item DraviteChest = new ItemDraviteArmor(1230, draviteArmor, 1, BODY).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("DraviteChest");
    public static final Item Dravitelegs = new ItemDraviteArmor(1231, draviteArmor, 2, LEGS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("Dravitelegs");
    public static final Item DraviteBoots = new ItemDraviteArmor(1232, draviteArmor, 3, BOOTS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("DraviteBoots");
    public static final Item DraviteSlicer = new ItemSlicer(1233).registerTextures("DraviteSlicer").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("DraviteSlicer");
    public static final Item DraviteShards = new ItemDivineRPG(1234).registerTextures("DraviteFragments").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("DraviteShards");

    //Azurite
    public static final Item azuriteFragment = new ItemDivineRPG(1235).registerTextures("AzuriteFragments").setUnlocalizedName("Frag2").setCreativeTab(DivineRPG.Twilight);
    public static final Item azuriteSoul = new ItemDivineRPG(1236).registerTextures("AzuriteSoul").setUnlocalizedName("Soul2").setCreativeTab(DivineRPG.Twilight);
    public static final Item azuriteChunk = new ItemDivineRPG(1237).registerTextures("AzuriteChunk").setUnlocalizedName("Chunk3").setCreativeTab(DivineRPG.Twilight);
    public static final Item azuriteDust = new ItemDivineRPG(1238).registerTextures("AzuriteDust").setUnlocalizedName("Dust4").setCreativeTab(DivineRPG.Twilight);
    public static final Item azuriteGem = new ItemDivineRPG(1239).registerTextures("AzuriteGem").setUnlocalizedName("Gem5").setCreativeTab(DivineRPG.Twilight);
    public static final Item AzuriteBlade = new ItemDivineRPG(1240).registerTextures("AzuriteBlade").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AzuriteBlade");
    public static final Item AzuritePhaser = new ItemPhaser(1241, 0, 1, 2, Sound.Phaser, Sound.Phaser).registerTextures("AzuritePhaser").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AzuritePhaser");
    public static final Item AzuriteBlitz = new ItemBlitz(1242).registerTextures("AzuriteBlitz").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AzuriteBlitz");
    public static final Item AzuriteBow = new ItemBowCore(1243).registerTextures("AzuriteBow_0").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AzuriteBow");
    public static final Item AzuriteHelmet = new ItemAzuriteArmor(1244, AzuriteArmor, 0, HEAD).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AzuriteHelmet");
    public static final Item AzuriteBoots = new ItemAzuriteArmor(1245, AzuriteArmor, 3, BOOTS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AzuriteBoots");
    public static final Item Azuritelegs = new ItemAzuriteArmor(1246, AzuriteArmor, 2, LEGS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("Azuritelegs");
    public static final Item AzuriteChest = new ItemAzuriteArmor(1247, AzuriteArmor, 1, BODY).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AzuriteBody");
    public static final Item AzuriteSlicer = new ItemSlicer(1248).registerTextures("AzuriteSlicer").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AzuriteSlicer");
    public static final Item AzuriteArrow = new ItemDivineRPG(1249).registerTextures("AzuriteArrow").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AzuriteArrow");

    //Augite
    public static final Item augiteFragment = new ItemDivineRPG(1250).registerTextures("AugiteFragments").setUnlocalizedName("Frag5").setCreativeTab(DivineRPG.Twilight);
    public static final Item augiteSoul = new ItemDivineRPG(1251).registerTextures("AugiteSoul").setUnlocalizedName("Soul5").setCreativeTab(DivineRPG.Twilight);
    public static final Item augiteChunk = new ItemDivineRPG(1252).registerTextures("AugiteChunk").setUnlocalizedName("Chunk6").setCreativeTab(DivineRPG.Twilight);
    public static final Item augiteDust = new ItemDivineRPG(1253).registerTextures("AugiteDust").setUnlocalizedName("Dust7").setCreativeTab(DivineRPG.Twilight);
    public static final Item augiteGem = new ItemDivineRPG(1254).registerTextures("AugiteGem").setUnlocalizedName("Gem8").setCreativeTab(DivineRPG.Twilight);
    public static final Item AugiteBlade = new ItemDivineRPG(1255).registerTextures("AugiteBlade").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AugiteBlade");
    public static final Item AugitePhaser = new ItemPhaser(1256, 0, 1, 2, Sound.Phaser, Sound.Phaser).registerTextures("AugitePhaser").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AugitePhaser");
    public static final Item AugiteBlitz = new ItemBlitz(1257).registerTextures("AugiteBlitz").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AugiteBlitz");
    public static final Item AugiteBow = new ItemBowCore(1258).registerTextures("AugiteBow_0").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AugiteBow");
    public static final Item AugiteHelmet = new ItemAugiteArmor(1259, AugiteArmor, 0, HEAD).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AugiteHelmet");
    public static final Item AugiteBoots = new ItemAugiteArmor(1260, AugiteArmor, 3, BOOTS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AugiteBoots");
    public static final Item Augitelegs = new ItemAugiteArmor(1261, AugiteArmor, 2, LEGS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AugiteLegs");
    public static final Item AugiteChest = new ItemAugiteArmor(1262, AugiteArmor, 1, BODY).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AugiteBody");
    public static final Item AugiteSlicer = new ItemSlicer(1263).registerTextures("AugiteSlicer").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AugiteSlicer");

    //Uvite
    public static final Item uviteFragment = new ItemDivineRPG(1264).registerTextures("UviteFragments").setUnlocalizedName("Frag3").setCreativeTab(DivineRPG.Twilight);
    public static final Item uviteSoul = new ItemDivineRPG(1265).registerTextures("UviteSoul").setUnlocalizedName("Soul3").setCreativeTab(DivineRPG.Twilight);
    public static final Item uviteChunk = new ItemDivineRPG(1266).registerTextures("UviteChunk").setUnlocalizedName("Chunk4").setCreativeTab(DivineRPG.Twilight);
    public static final Item uviteDust = new ItemDivineRPG(1267).registerTextures("UviteDust").setUnlocalizedName("Dust5").setCreativeTab(DivineRPG.Twilight);
    public static final Item uviteGem = new ItemDivineRPG(1268).registerTextures("UviteGem").setUnlocalizedName("Gem6").setCreativeTab(DivineRPG.Twilight);
    public static final Item UviteBlade = new ItemDivineRPG(1269).registerTextures("UviteBlade").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("UviteBlade");
    public static final Item UvitePhaser = new ItemPhaser(1270, 0, 1, 2, Sound.Phaser, Sound.Phaser).registerTextures("UvitePhaser").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("UvitePhaser");
    public static final Item UviteBlitz = new ItemBlitz(1271).registerTextures("UviteBlitz").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("UviteBlitz");
    public static final Item UviteBow = new ItemBowCore(1272).registerTextures("UviteBow0").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("UviteBow");
    public static final Item UviteHelmet = new ItemUviteArmor(1273, UviteArmor, 0, HEAD).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("UviteHelmet");
    public static final Item UviteBoots = new ItemUviteArmor(1274, UviteArmor, 3, BOOTS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("UviteBoots");
    public static final Item Uvitelegs = new ItemUviteArmor(1275, UviteArmor, 2, LEGS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("UviteLegs");
    public static final Item UviteChest = new ItemUviteArmor(1276, UviteArmor, 1, BODY).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("UviteBody");
    public static final Item UviteSlicer = new ItemSlicer(1277).registerTextures("UviteSlicer").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("UviteSlicer");

    public static final Item cookedEmpoweredMeat = new ItemDivineRPGFood(1278, 10, 1.5F, true).registerTextures("EmpoweredMeatCooked").setUnlocalizedName("CookedEmpoweredMeat").setCreativeTab(DivineRPG.Twilight);
    public static final Item rawEmpoweredMeat = new ItemDivineRPGFood(1279, 4, 0.2F, true).registerTextures("EmpoweredMeatRaw").setUnlocalizedName("RawEmpoweredMeat").setCreativeTab(DivineRPG.Twilight);
    public static final Item TwilightBow = new TwilightBow(1280).setUnlocalizedName("TwilightBow").setCreativeTab(DivineRPG.Twilight);
    public static final Item TwilightApple = new ItemDivineRPGFood(1281, 4, 0.6F, false).registerTextures("TwilightApple").setUnlocalizedName("TA").setCreativeTab(DivineRPG.Twilight);
    public static final Item FuryArrow = new ItemDivineRPG(1282).registerTextures("FuryArrow").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("FuryArrow");
    public static final Item draviteSparkles = new ItemDivineRPG(1283).registerTextures("DraviteSparkles").setUnlocalizedName("DraviteS").setCreativeTab(DivineRPG.Twilight);

    public static void addNames()
    {
    	LanguageRegistry.addName(TwilightApple, "Twilight Apple");
    	LanguageRegistry.addName(DraviteShards, "Dravite Shards");
        LanguageRegistry.addName(divineHelmet, "Divine Helmet");
        LanguageRegistry.addName(divineBody, "Divine Body");
        LanguageRegistry.addName(divineLegs, "Divine Legs");
        LanguageRegistry.addName(divineBoots, "Divine Boots");
        LanguageRegistry.addName(draviteGem, "Dravite Gem");
        LanguageRegistry.addName(draviteChunk, "Dravite Chunk");
        LanguageRegistry.addName(draviteFragment, "Dravite Fragments");
        LanguageRegistry.addName(draviteDust, "Dravite Dust");
        LanguageRegistry.addName(DraviteBlade, "Dravite Blade");
        LanguageRegistry.addName(DravitePhaser, "Dravite Phaser");
        LanguageRegistry.addName(DraviteBlitz, "Dravite Blitz");
        LanguageRegistry.addName(DraviteBow, "Dravite Bow");
        LanguageRegistry.addName(DraviteHelmet, "Dravite Helmet");
        LanguageRegistry.addName(DraviteBoots, "Dravite Boots");
        LanguageRegistry.addName(Dravitelegs, "Dravite Legs");
        LanguageRegistry.addName(DraviteChest, "Dravite Chestplate");
        LanguageRegistry.addName(DraviteSlicer, "Dravite Slicer");
        LanguageRegistry.addName(draviteSoul, "Dravite Soul");
        LanguageRegistry.addName(draviteSparkles, "Dravite Sparkles");

        LanguageRegistry.addName(azuriteGem, "Azurite Gem");
        LanguageRegistry.addName(azuriteChunk, "Azurite Chunk");
        LanguageRegistry.addName(azuriteFragment, "Azurite Fragments");
        LanguageRegistry.addName(azuriteDust, "Azurite Dust");
        LanguageRegistry.addName(AzuriteBlade, "Azurite Blade");
        LanguageRegistry.addName(AzuritePhaser, "Azurite Phaser");
        LanguageRegistry.addName(AzuriteBlitz, "Azurite Blitz");
        LanguageRegistry.addName(AzuriteBow, "Azurite Bow");
        LanguageRegistry.addName(AzuriteHelmet, "Azurite Helmet");
        LanguageRegistry.addName(AzuriteBoots, "Azurite Boots");
        LanguageRegistry.addName(Azuritelegs, "Azurite Legs");
        LanguageRegistry.addName(AzuriteChest, "Azurite Chestplate");
        LanguageRegistry.addName(AzuriteSlicer, "Azurite Slicer");
        LanguageRegistry.addName(azuriteSoul, "Azurite Soul");

        LanguageRegistry.addName(HaliteBlade, "Halite Blade");
        LanguageRegistry.addName(halitePhaser, "Halite Phaser");
        LanguageRegistry.addName(HaliteBlitz, "Halite Blitz");
        LanguageRegistry.addName(haliteBow, "Halite Bow");
        LanguageRegistry.addName(haliteHelmet, "Halite Helmet");
        LanguageRegistry.addName(haliteBoots, "Halite Boots");
        LanguageRegistry.addName(haliteLegs, "Halite Legs");
        LanguageRegistry.addName(haliteBody, "Halite Chestplate");
        LanguageRegistry.addName(HaliteSlicer, "Halite Slicer");
        
        LanguageRegistry.addName(uviteGem, "Uvite Gem");
        LanguageRegistry.addName(uviteChunk, "Uvite Chunk");
        LanguageRegistry.addName(uviteFragment, "Uvite Fragments");
        LanguageRegistry.addName(uviteDust, "Uvite Dust");
        LanguageRegistry.addName(UviteBlade, "Uvite Blade");
        LanguageRegistry.addName(UvitePhaser, "Uvite Phaser");
        LanguageRegistry.addName(UviteBlitz, "Uvite Blitz");
        LanguageRegistry.addName(UviteBow, "Uvite Bow");
        LanguageRegistry.addName(UviteHelmet, "Uvite Helmet");
        LanguageRegistry.addName(UviteBoots, "Uvite Boots");
        LanguageRegistry.addName(Uvitelegs, "Uvite Legs");
        LanguageRegistry.addName(UviteChest, "Uvite Chestplate");
        LanguageRegistry.addName(UviteSlicer, "Uvite Slicer");
        LanguageRegistry.addName(uviteSoul, "Uvite Soul");

        LanguageRegistry.addName(mythrilGem, "Mythril Gem");
        LanguageRegistry.addName(mythrilChunk, "Mythril Chunk");
        LanguageRegistry.addName(mythrilFragment, "Mythril Fragments");
        LanguageRegistry.addName(mythrilDust, "Mythril Dust");
        LanguageRegistry.addName(MythrilBlade, "Mythril Blade");
        LanguageRegistry.addName(MythrilPhaser, "Mythril Phaser");
        LanguageRegistry.addName(MythrilBlitz, "Mythril Blitz");
        LanguageRegistry.addName(MythrilBow, "Mythril Bow");
        LanguageRegistry.addName(MythrilHelmet, "Mythril Helmet");
        LanguageRegistry.addName(MythrilBoots, "Mythril Boots");
        LanguageRegistry.addName(Mythrillegs, "Mythril Legs");
        LanguageRegistry.addName(MythrilChest, "Mythril Chestplate");
        LanguageRegistry.addName(MythrilSlicer, "Mythril Slicer");
        LanguageRegistry.addName(mythrilSoul, "Mythril Soul");

        LanguageRegistry.addName(augiteGem, "Augite Gem");
        LanguageRegistry.addName(augiteChunk, "Augite Chunk");
        LanguageRegistry.addName(augiteFragment, "Augite Fragments");
        LanguageRegistry.addName(augiteDust, "Augite Dust");
        LanguageRegistry.addName(AugiteBlade, "Augite Blade");
        LanguageRegistry.addName(AugitePhaser, "Augite Phaser");
        LanguageRegistry.addName(AugiteBlitz, "Augite Blitz");
        LanguageRegistry.addName(AugiteBow, "Augite Bow");
        LanguageRegistry.addName(AugiteHelmet, "Augite Helmet");
        LanguageRegistry.addName(AugiteBoots, "Augite Boots");
        LanguageRegistry.addName(Augitelegs, "Augite Legs");
        LanguageRegistry.addName(AugiteChest, "Augite Chestplate");
        LanguageRegistry.addName(AugiteSlicer, "Augite Slicer");
        LanguageRegistry.addName(augiteSoul, "Augite Soul");

        LanguageRegistry.addName(FuryArrow, "Fury Arrow");
        LanguageRegistry.addName(AzuriteArrow, "Azurite Arrow");
        LanguageRegistry.addName(rawEmpoweredMeat, "Raw Empowered Meat");
        LanguageRegistry.addName(cookedEmpoweredMeat, "Cooked Empowered Meat");

    }
}
