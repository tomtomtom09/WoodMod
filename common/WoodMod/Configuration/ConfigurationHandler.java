package WoodMod.Configuration;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigurationHandler 
{
	public static Configuration config;

	
	
	public static void init(File configFile)
	{
		config = new Configuration(configFile);		
		try{
			config.load();
			
		//Block and item config code goes here.
			
		}
		finally {
            config.save();
        }
	}
	
	
	
	
}
