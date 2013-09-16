package net.divinerpg;

import net.divinerpg.arcana.gen.BiomeGenArcana;
import net.divinerpg.augite.gen.BiomeGenAugite;
import net.divinerpg.azurite.gen.BiomeGenAzurite;
import net.divinerpg.dravite.gen.BiomeGenDraviteHills;
import net.divinerpg.helper.handlers.DivineRPGPacketHandler;
import net.divinerpg.helper.proxy.CommonProxyDivineRPG;
import net.divinerpg.iceika.gen.BiomeGenIceikaMountians;
import net.divinerpg.lib.Reference;
import net.divinerpg.mythril.gen.BiomeGenMythil;
import net.divinerpg.render.gui.TabArcana;
import net.divinerpg.render.gui.TabIceika;
import net.divinerpg.render.gui.TabOverworld;
import net.divinerpg.render.gui.TabTwilight;
import net.divinerpg.render.gui.TabVethea;
import net.divinerpg.uvite.gen.BiomeGenUvite;
import net.divinerpg.vethea.all.BiomeGenArksiane;
import net.divinerpg.vethea.all.BiomeGenHeliosis;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
@NetworkMod(channels = { Reference.MOD_ID }, clientSideRequired = true, serverSideRequired = false, packetHandler = DivineRPGPacketHandler.class)
public class DivineRPG {


    @Instance(Reference.MOD_ID)
    public static DivineRPG instance;
    
    @SidedProxy(serverSide = Reference.MOD_COMMON_PROXY, clientSide = Reference.MOD_CLIENT_PROXY)
    public static CommonProxyDivineRPG proxy;

    public static final CreativeTabs Overworld = new TabOverworld("Overworld");
    public static final CreativeTabs Vethea = new TabVethea("Vethea");
    public static final CreativeTabs Arcana = new TabArcana("Arcana");
    public static final CreativeTabs Iceika = new TabIceika("Iceika");
    public static final CreativeTabs Twilight = new TabTwilight("Twilight");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {	  
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.init(event);
    }	
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {}
    
    @EventHandler
    public void serverStarting(FMLServerStartingEvent event){}
}
