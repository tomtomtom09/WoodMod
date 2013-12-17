package WoodMod;

import java.io.File;

import WoodMod.Configuration.ConfigurationHandler;
import WoodMod.core.proxy.CommonProxy;
import WoodMod.lib.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION_NUMBER)//, dependencies= Reference.DEPENDENCIES)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class WoodMod 
{
	@Instance(Reference.MOD_ID)
	public static WoodMod instance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		/**Initialize the configuration*/
		ConfigurationHandler.init(new File(event.getModConfigurationDirectory()
				.getAbsoluteFile()
				+ File.separator + Reference.MOD_ID + ".cfg"));
		
		/** Initialize mod items*/
		//ModItems.init();	
		
		/** Initialize mod items*/
		//ModItems.init();
	} 
	//test edit through github :)

	@EventHandler
	public void load(FMLInitializationEvent event)
	{
	}

}
