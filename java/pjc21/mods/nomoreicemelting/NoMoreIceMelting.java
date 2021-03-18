package pjc21.mods.nomoreicemelting;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import pjc21.mods.nomoreicemelting.proxy.CommonProxy;
import pjc21.mods.nomoreicemelting.util.Reference;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class NoMoreIceMelting {
	
	@Instance
	public static NoMoreIceMelting instance;
	
	public static Logger logger;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)	{
		logger = event.getModLog();
        proxy.preInit(event);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {proxy.init(event);}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {proxy.postInit(event);}
}
