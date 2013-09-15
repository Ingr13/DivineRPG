package net.divinerpg.helper;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class CreativeTabName {

    public static void init(){

        LanguageRegistry.instance().addStringLocalization("itemGroup.Overworld", "DivineRPG: Overworld");
        LanguageRegistry.instance().addStringLocalization("itemGroup.Vethea", "DivineRPG: Vethea");
        LanguageRegistry.instance().addStringLocalization("itemGroup.Arcana", "DivineRPG: Arcana");
        LanguageRegistry.instance().addStringLocalization("itemGroup.Iceika", "DivineRPG: Iceika");
        LanguageRegistry.instance().addStringLocalization("itemGroup.Twilight", "DivineRPG: Twilight");

    }

}
