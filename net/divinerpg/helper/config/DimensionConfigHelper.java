package net.divinerpg.helper.config;

import java.io.File;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class DimensionConfigHelper {
	
	public static boolean Dravite;

	public static void configInit(FMLPreInitializationEvent event){
		File file = new File(event.getModConfigurationDirectory(), "DivineRPGDimension.cfg");
		Configuration config = new Configuration(file);
		
		config.load();
		
		Dravite = config.get("Keep Loading", "Dravite", true).getBoolean(Dravite);
		
		config.save();
	}
	
}
