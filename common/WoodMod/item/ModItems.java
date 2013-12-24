package WoodMod.item;


import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;

public class ModItems 
{
	/**
	(String name of material, Harvest lvl, durable, strength of tool against blocks, damage against mobs, enchantability)
	("WOOD", 0, 59, 2.0F, 0.0F, 15);
	("STONE", 1, 131, 4.0F, 1.0F, 5);
	("IRON", 2, 250, 6.0F, 2.0F, 14);
	("DIAMOND", 3, 1561, 8.0F, 3.0F, 10);
	("GOLD", 0, 32, 12.0F, 0.0F, 22);

	Oak -> durable but not so fast
	Spruce -> fast but not so durable
	Birch -> decent in both
	Jungle -> Very durable, very slow
	
	oak = normal base stats
	Spruce -> durable = 25% less, Speed = 25% faster
	Birch -> durable = 25% more, Speed = 25% faster
	Jungle -> durable = 50% more, Speed = 50% slower
	1.7 edition
	Acacia -> durable = 50% more, Speed = 25% slower  
	Dark Oak -> durable = 25% more, Speed = 15% slower 
	 */
	public static Item shovelIron;
	public static Item pickaxeIron;
	
	//public static EnumToolMaterial SpruceTool = EnumHelper.addToolMaterial("SPRUCE", 0, maxUses, efficiency, damage, 15);
	//public static EnumToolMaterial BirchTool = EnumHelper.addToolMaterial("BIRCH", 0, maxUses, efficiency, damage, 15);
	//public static EnumToolMaterial JungleTool = EnumHelper.addToolMaterial("JUNGLE", 0, maxUses, efficiency, damage, 15);
			
	/**register item that changes once used*/
 	public static void registerItemTool(int itemId, Item shovelItem, Item pickItem, EnumToolMaterial wood) //Item pickItem, Item axeItem, Item spadeItem, Item swordItem,
 	{
 		shovelItem = (new ItemSpade(0, wood).setUnlocalizedName("shovelIron").setTextureName("iron_shovel"));
 		pickItem = (new ItemPickaxe(1, wood)).setUnlocalizedName("pickaxeIron").setTextureName("iron_pickaxe");
 		
 		LanguageRegistry.addName(shovelItem, "test 1.42");
 		LanguageRegistry.addName(pickItem, "test 1.43");
 		//registerItemWithContainer(item, ItemIds.*, itemBase , *, *F, Strings*, "");			
 	}
			
	public static void init()
	{
		registerItemTool(27, shovelIron, pickaxeIron, EnumToolMaterial.EMERALD);
		
		//shovelIron = (new ItemSpade(0, EnumToolMaterial.IRON)).setUnlocalizedName("shovelIron").setTextureName("iron_shovel");
	    
	}
	
	/**
	(String name of material, Harvest lvl, durable, strength of tool against blocks, damage against mobs, enchantability)
	*/
}
