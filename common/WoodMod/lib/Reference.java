package WoodMod.lib;

public class Reference 
{
	/** General Mod related constants */
	public static final String MOD_ID = "WoodMod";
	public static final String MOD_NAME = "WoodMod";
	public static final String VERSION_NUMBER = "@VERSION@"; //TODO add version coding
	public static final String DEPENDENCIES = "reguired-after:Forge";
	public static final int SHIFTED_ID_RANGE_CORRECTION = 256;
	
	public static final String SERVER_PROXY_CLASS = "WoodMod.core.proxy.CommonProxy";
    public static final String CLIENT_PROXY_CLASS = "WoodMod.core.proxy.ClientProxy";
}
