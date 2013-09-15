package net.divinerpg.helper.item;

import net.divinerpg.DivineRPG;
import net.divinerpg.helper.base.ItemDivineRPG;
import net.divinerpg.helper.base.ItemDivineRPGFood;
import net.divinerpg.helper.config.ItemConfigHelper;
import net.divinerpg.item.ItemAugiteArmor;
import net.divinerpg.item.ItemAzuriteArmor;
import net.divinerpg.item.ItemBlitz;
import net.divinerpg.item.ItemBowCore;
import net.divinerpg.item.ItemDivineArmor;
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
	
	public static ItemConfigHelper x;

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
    public static final Item haliteHelmet = new ItemHaliteArmor(x.HaliteHelmetID, haliteArmor, 0, HEAD).setUnlocalizedName("HaliteHelmet").setCreativeTab(DivineRPG.Twilight);
    public static final Item haliteBody = new ItemHaliteArmor(x.HaliteChestID, haliteArmor, 1, BODY).setUnlocalizedName("HaliteBody").setCreativeTab(DivineRPG.Twilight);
    public static final Item haliteLegs = new ItemHaliteArmor(x.HalitelegsID, haliteArmor, 2, LEGS).setUnlocalizedName("HaliteLegs").setCreativeTab(DivineRPG.Twilight);
    public static final Item haliteBoots = new ItemHaliteArmor(x.HaliteBootsID, haliteArmor, 3, BOOTS).setUnlocalizedName("HaliteBoots").setCreativeTab(DivineRPG.Twilight);
    public static final Item haliteBow = new ItemHaliteBow(x.HaliteBowID).setUnlocalizedName("HaliteBow").setCreativeTab(DivineRPG.Twilight);
    public static final Item halitePhaser = new ItemPhaser(x.HalitePhaserID, 0, 1, 2, Sound.Phaser, Sound.Phaser).registerTextures("HalitePhaser").setUnlocalizedName("HalitePhaser").setCreativeTab(DivineRPG.Twilight);
    public static final Item HaliteBlade = new ToolSword(x.HalitePhaserID, halite).registerItemTexture("HaliteBlade").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("HaliteBlade");
    public static final Item HaliteSlicer = new ItemSlicer(x.HaliteSlicerID).registerTextures("HaliteSlicer").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("HaliteSlicer");
    public static final Item HaliteBlitz = new ItemBlitz(x.HaliteBlitzID).registerTextures("HaliteBlitz").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("HaliteBlitz");

    //Mythril
    public static final Item mythrilFragment = new ItemDivineRPG(x.MythrilFragmentsID).registerTextures("MythrilFragments").setUnlocalizedName("Frag4").setCreativeTab(DivineRPG.Twilight);
    public static final Item mythrilSoul = new ItemDivineRPG(x.MythrilSoulID).registerTextures("MythrilSoul").setUnlocalizedName("Soul4").setCreativeTab(DivineRPG.Twilight);
    public static final Item mythrilChunk = new ItemDivineRPG(x.MythrilChunkID).registerTextures("MythrilChunk").setUnlocalizedName("Chunk5").setCreativeTab(DivineRPG.Twilight);
    public static final Item mythrilDust = new ItemDivineRPG(x.MythrilDustID).registerTextures("MythrilDust").setUnlocalizedName("Dust6").setCreativeTab(DivineRPG.Twilight);
    public static final Item mythrilGem = new ItemDivineRPG(x.MythrilGemID).registerTextures("MythrilGem").setUnlocalizedName("Gem7").setCreativeTab(DivineRPG.Twilight);
    public static final Item MythrilBlade = new ToolSword(x.MythrilBladeID, mythril).registerItemTexture("MythrilBlade").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("MythrilBlade");
    public static final Item MythrilPhaser = new ItemPhaser(x.MythrilPhaserID, 0, 1, 2, Sound.Phaser, Sound.Phaser).registerTextures("MythrilPhaser").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("MythrilPhaser");
    public static final Item MythrilBlitz = new ItemBlitz(x.MythrilBlitzID).registerTextures("MythrilBlitz").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("MythrilBlitz");
    public static final Item MythrilBow = new ItemBowCore(x.MythrilBowID).registerTextures("MythrilBow_0").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("MythrilBow");
    public static final Item MythrilHelmet = new ItemMythrilArmor(x.MythrilHelmetID, MythrilArmor, 0, HEAD).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("MythrilHelmet");
    public static final Item MythrilBoots = new ItemMythrilArmor(x.MythrilBootsID, MythrilArmor, 3, BOOTS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("MythrilBoots");
    public static final Item Mythrillegs = new ItemMythrilArmor(x.MythrillegsID, MythrilArmor, 2, LEGS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("MythrilLegs");
    public static final Item MythrilChest = new ItemMythrilArmor(x.MythrilChestID, MythrilArmor, 1, BODY).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("MythrilBody");
    public static final Item MythrilSlicer = new ItemSlicer(x.MythrilSlicerID).registerTextures("MythrilSlicer").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("MythrilSlicer");

    //Divine
    public static final Item divineHelmet = new ItemDivineArmor(x.divineHeadID, divineArmor, 0, HEAD).setUnlocalizedName("DivineHelmet").setCreativeTab(DivineRPG.Twilight);
    public static final Item divineBody = new ItemDivineArmor(x.divineBodyID, divineArmor, 1, BODY).setUnlocalizedName("DivineBody").setCreativeTab(DivineRPG.Twilight);
    public static final Item divineLegs = new ItemDivineArmor(x.divineLegsID, divineArmor, 2, LEGS).setUnlocalizedName("DivineLegs").setCreativeTab(DivineRPG.Twilight);
    public static final Item divineBoots = new ItemDivineArmor(x.divineBootsID, divineArmor, 3, BOOTS).setUnlocalizedName("DivineBoots").setCreativeTab(DivineRPG.Twilight);

    //Dravite
    public static final Item draviteFragment = new ItemDivineRPG(x.DraviteFragmentsID).registerTextures("DraviteFragments").setUnlocalizedName("Frag1").setCreativeTab(DivineRPG.Twilight);
    public static final Item draviteSoul = new ItemDivineRPG(x.DraviteSoulID).registerTextures("DraviteSoul").setUnlocalizedName("Soul1").setCreativeTab(DivineRPG.Twilight);
    public static final Item draviteChunk = new ItemDivineRPG(x.DraviteChunkID).registerTextures("DraviteChunk").setUnlocalizedName("Chunk1").setCreativeTab(DivineRPG.Twilight);
    public static final Item draviteDust = new ItemDivineRPG(x.DraviteDustID).registerTextures("DraviteDust").setUnlocalizedName("Dust1").setCreativeTab(DivineRPG.Twilight);
    public static final Item draviteGem = new ItemDivineRPG(x.DraviteGemID).registerTextures("DraviteGem").setUnlocalizedName("Gem1").setCreativeTab(DivineRPG.Twilight);
    public static final Item DraviteBlade = new ToolSword(x.DraviteBladeID, dravite).registerItemTexture("DraviteBlade").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("DraviteBlade");
    public static final Item DravitePhaser = new ItemPhaser(x.DravitePhaserID, 0, 1, 2, Sound.Phaser, Sound.Phaser).registerTextures("DravitePhaser").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("DravitePhaser");
    public static final Item DraviteBlitz = new ItemBlitz(x.DraviteBlitzID).registerTextures("DraviteBlitz").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("DraviteBlitz");
    public static final Item DraviteBow = new ItemBowCore(x.DraviteBowID).registerTextures("DraviteBow0").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("DraviteBow");
    public static final Item DraviteHelmet = new ItemDraviteArmor(x.DraviteHelmetID, draviteArmor, 0, HEAD).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("DraviteHelmet");
    public static final Item DraviteChest = new ItemDraviteArmor(x.DraviteChestID, draviteArmor, 1, BODY).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("DraviteChest");
    public static final Item Dravitelegs = new ItemDraviteArmor(x.DravitelegsID, draviteArmor, 2, LEGS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("Dravitelegs");
    public static final Item DraviteBoots = new ItemDraviteArmor(x.DraviteBootsID, draviteArmor, 3, BOOTS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("DraviteBoots");
    public static final Item DraviteSlicer = new ItemSlicer(x.DraviteSlicerID).registerTextures("DraviteSlicer").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("DraviteSlicer");
    public static final Item DraviteShards = new ItemDivineRPG(x.DraviteShardsID).registerTextures("DraviteFragments").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("DraviteFragments");

    //Azurite
    public static final Item azuriteFragment = new ItemDivineRPG(x.AzuriteFragmentsID).registerTextures("AzuriteFragments").setUnlocalizedName("Frag2").setCreativeTab(DivineRPG.Twilight);
    public static final Item azuriteSoul = new ItemDivineRPG(x.AzuriteSoulID).registerTextures("AzuriteSoul").setUnlocalizedName("Soul2").setCreativeTab(DivineRPG.Twilight);
    public static final Item azuriteChunk = new ItemDivineRPG(x.AzuriteChunkID).registerTextures("AzuriteChunk").setUnlocalizedName("Chunk3").setCreativeTab(DivineRPG.Twilight);
    public static final Item azuriteDust = new ItemDivineRPG(x.AzuriteDustID).registerTextures("AzuriteDust").setUnlocalizedName("Dust4").setCreativeTab(DivineRPG.Twilight);
    public static final Item azuriteGem = new ItemDivineRPG(x.AzuriteGemID).registerTextures("AzuriteGem").setUnlocalizedName("Gem5").setCreativeTab(DivineRPG.Twilight);
    public static final Item AzuriteBlade = new ItemDivineRPG(x.AzuriteBladeID).registerTextures("AzuriteBlade").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AzuriteBlade");
    public static final Item AzuritePhaser = new ItemPhaser(x.AzuritePhaserID, 0, 1, 2, Sound.Phaser, Sound.Phaser).registerTextures("AzuritePhaser").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AzuritePhaser");
    public static final Item AzuriteBlitz = new ItemBlitz(x.AzuriteBlitzID).registerTextures("AzuriteBlitz").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AzuriteBlitz");
    public static final Item AzuriteBow = new ItemBowCore(x.AzuriteBowID).registerTextures("AzuriteBow_0").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AzuriteBow");
    public static final Item AzuriteHelmet = new ItemAzuriteArmor(x.AzuriteHelmetID, AzuriteArmor, 0, HEAD).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AzuriteHelmet");
    public static final Item AzuriteBoots = new ItemAzuriteArmor(x.AzuriteBootsID, AzuriteArmor, 3, BOOTS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AzuriteBoots");
    public static final Item Azuritelegs = new ItemAzuriteArmor(x.AzuritelegsID, AzuriteArmor, 2, LEGS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("Azuritelegs");
    public static final Item AzuriteChest = new ItemAzuriteArmor(x.AzuriteChestID, AzuriteArmor, 1, BODY).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AzuriteBody");
    public static final Item AzuriteSlicer = new ItemSlicer(x.AzuriteSlicerID).registerTextures("AzuriteSlicer").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AzuriteSlicer");
    public static final Item AzuriteArrow = new ItemDivineRPG(x.AzuriteArrowID).registerTextures("AzuriteArrow").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AzuriteArrow");

    //Augite
    public static final Item augiteFragment = new ItemDivineRPG(x.AugiteFragmentsID).registerTextures("AugiteFragments").setUnlocalizedName("Frag5").setCreativeTab(DivineRPG.Twilight);
    public static final Item augiteSoul = new ItemDivineRPG(x.AugiteSoulID).registerTextures("AugiteSoul").setUnlocalizedName("Soul5").setCreativeTab(DivineRPG.Twilight);
    public static final Item augiteChunk = new ItemDivineRPG(x.AugiteChunkID).registerTextures("AugiteChunk").setUnlocalizedName("Chunk6").setCreativeTab(DivineRPG.Twilight);
    public static final Item augiteDust = new ItemDivineRPG(x.AugiteDustID).registerTextures("AugiteDust").setUnlocalizedName("Dust7").setCreativeTab(DivineRPG.Twilight);
    public static final Item augiteGem = new ItemDivineRPG(x.AugiteGemID).registerTextures("AugiteGem").setUnlocalizedName("Gem8").setCreativeTab(DivineRPG.Twilight);
    public static final Item AugiteBlade = new ItemDivineRPG(x.AugiteBladeID).registerTextures("AugiteBlade").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AugiteBlade");
    public static final Item AugitePhaser = new ItemPhaser(x.AugitePhaserID, 0, 1, 2, Sound.Phaser, Sound.Phaser).registerTextures("AugitePhaser").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AugitePhaser");
    public static final Item AugiteBlitz = new ItemBlitz(x.AugiteBlitzID).registerTextures("AugiteBlitz").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AugiteBlitz");
    public static final Item AugiteBow = new ItemBowCore(x.AugiteBowID).registerTextures("AugiteBow_0").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AugiteBow");
    public static final Item AugiteHelmet = new ItemAugiteArmor(x.AugiteHelmetID, AugiteArmor, 0, HEAD).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AugiteHelmet");
    public static final Item AugiteBoots = new ItemAugiteArmor(x.AugiteBootsID, AugiteArmor, 3, BOOTS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AugiteBoots");
    public static final Item Augitelegs = new ItemAugiteArmor(x.AugitelegsID, AugiteArmor, 2, LEGS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AugiteLegs");
    public static final Item AugiteChest = new ItemAugiteArmor(x.AugiteChestID, AugiteArmor, 1, BODY).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AugiteBody");
    public static final Item AugiteSlicer = new ItemSlicer(x.AugiteSlicerID).registerTextures("AugiteSlicer").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("AugiteSlicer");

    //Uvite
    public static final Item uviteFragment = new ItemDivineRPG(x.UviteFragmentsID).registerTextures("UviteFragments").setUnlocalizedName("Frag3").setCreativeTab(DivineRPG.Twilight);
    public static final Item uviteSoul = new ItemDivineRPG(x.UviteSoulID).registerTextures("UviteSoul").setUnlocalizedName("Soul3").setCreativeTab(DivineRPG.Twilight);
    public static final Item uviteChunk = new ItemDivineRPG(x.UviteChunkID).registerTextures("UviteChunk").setUnlocalizedName("Chunk4").setCreativeTab(DivineRPG.Twilight);
    public static final Item uviteDust = new ItemDivineRPG(x.UviteDustID).registerTextures("UviteDust").setUnlocalizedName("Dust5").setCreativeTab(DivineRPG.Twilight);
    public static final Item uviteGem = new ItemDivineRPG(x.UviteGemID).registerTextures("UviteGem").setUnlocalizedName("Gem6").setCreativeTab(DivineRPG.Twilight);
    public static final Item UviteBlade = new ItemDivineRPG(x.UviteBladeID).registerTextures("UviteBlade").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("UviteBlade");
    public static final Item UvitePhaser = new ItemPhaser(x.UvitePhaserID, 0, 1, 2, Sound.Phaser, Sound.Phaser).registerTextures("UvitePhaser").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("UvitePhaser");
    public static final Item UviteBlitz = new ItemBlitz(x.UviteBlitzID).registerTextures("UviteBlitz").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("UviteBlitz");
    public static final Item UviteBow = new ItemBowCore(x.UviteBowID).registerTextures("UviteBow0").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("UviteBow");
    public static final Item UviteHelmet = new ItemUviteArmor(x.UviteHelmetID, UviteArmor, 0, HEAD).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("UviteHelmet");
    public static final Item UviteBoots = new ItemUviteArmor(x.UviteBootsID, UviteArmor, 3, BOOTS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("UviteBoots");
    public static final Item Uvitelegs = new ItemUviteArmor(x.UvitelegsID, UviteArmor, 2, LEGS).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("UviteLegs");
    public static final Item UviteChest = new ItemUviteArmor(x.UviteChestID, UviteArmor, 1, BODY).setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("UviteBody");
    public static final Item UviteSlicer = new ItemSlicer(x.UviteSlicerID).registerTextures("UviteSlicer").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("UviteSlicer");

    public static final Item cookedEmpoweredMeat = new ItemDivineRPGFood(x.cookedEmpoweredMeatID, 10, 1.5F, true).registerTextures("EmpoweredMeatCooked").setUnlocalizedName("CookedEmpoweredMeat").setCreativeTab(DivineRPG.Twilight);
    public static final Item rawEmpoweredMeat = new ItemDivineRPGFood(x.empoweredMeatID, 4, 0.2F, true).registerTextures("EmpoweredMeatRaw").setUnlocalizedName("RawEmpoweredMeat").setCreativeTab(DivineRPG.Twilight);
    public static final Item TwilightBow = new TwilightBow(x.TwilightBowID).setUnlocalizedName("TwilightBow").setCreativeTab(DivineRPG.Twilight);
    public static final Item TwilightApple = new ItemDivineRPGFood(x.TwilightAppleID, 4, 0.6F, false).registerTextures("TwilightApple").setUnlocalizedName("TA").setCreativeTab(DivineRPG.Twilight);
    public static final Item FuryArrow = new ItemDivineRPG(x.FuryArrowID).registerTextures("FuryArrow").setCreativeTab(DivineRPG.Twilight).setUnlocalizedName("FuryArrow");
    public static final Item draviteSparkles = new ItemDivineRPG(x.draviteSparklesID).registerTextures("DraviteSparkles").setUnlocalizedName("DraviteS").setCreativeTab(DivineRPG.Twilight);

    public static void addNames()
    {
    	LanguageRegistry.addName(TwilightApple, "Twilight Apple");
    	LanguageRegistry.addName(DraviteShards, "Dravite Fragments");
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
