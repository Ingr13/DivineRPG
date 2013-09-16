package net.divinerpg.helper.proxy;

import java.io.File;

import net.divinerpg.*;
import net.divinerpg.arcana.*;
import net.divinerpg.helper.*;
import net.divinerpg.helper.config.*;
import net.divinerpg.helper.handlers.*;
import net.minecraftforge.common.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.registry.*;
import cpw.mods.fml.relauncher.*;

public class CommonProxyDivineRPG {
	
    public void registerRenderInformation()
    {        
    }

    public void preInit(FMLPreInitializationEvent event)
    {         
		BlockConfigHelper.initConfig(event);
		ItemConfigHelper.initConfig(event);
		VetheaConfigHelper.initConfig(event);
		
        NetworkRegistry.instance().registerGuiHandler(DivineRPG.instance, new GuiHandler());
        NameHelper.addNames();
        harvestLevelHelper.init();
        tickRegistry();
        RecipeHelper.init();
        WorldGenHelper.init();
        CreativeTabName.init();    	
        eventBus();
        MobRegistry.init();
    	MobRendering.init();
        DimensionRegistry.init();
        GameRegistry.registerPlayerTracker(new ArcanaHelper());
    }

    public void init(FMLInitializationEvent event)
    {        
        CreativeTabName.init();  
        AchievementPageDivineRPG.Init();
    }
    
    public void tickRegistry(){
        TickRegistry.registerTickHandler(new ClientTickHandler(), Side.CLIENT); 
        TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);
    }
    
    public void eventBus(){
    	MinecraftForge.EVENT_BUS.register(new SoundHandler());
        MinecraftForge.EVENT_BUS.register(new ExplosiveArrowHitHandler());
        MinecraftForge.EVENT_BUS.register(new ArmorEffectHandler());
    }
}
