package WoodMod.item;


import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;

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
	public static Item shovelWoodBirch;
	public static Item pickaxeWoodBirch;
	public static Item axeWoodBirch;
	public static Item swordWoodBirch;
	
	//public static EnumToolMaterial SpruceTool = EnumHelper.addToolMaterial("SPRUCE", 0, maxUses, efficiency, damage, 15);
	//public static EnumToolMaterial BirchTool = EnumHelper.addToolMaterial("BIRCH", 0, maxUses, efficiency, damage, 15);
	//public static EnumToolMaterial JungleTool = EnumHelper.addToolMaterial("JUNGLE", 0, maxUses, efficiency, damage, 15);
			
	/**register item that changes once used*/
 	public static void registerItemTool(int itemId, Item shovelItem, Item pickItem, Item axeItem, Item swordItem, EnumToolMaterial materialType, String shovelName, String pickName, String axeName, String swordName) //Item pickItem, Item axeItem, Item spadeItem, Item swordItem,
 	{
 		shovelItem = (new ItemSpade(itemId, materialType).setUnlocalizedName("shovelIron").setTextureName("iron_shovel"));
 		pickItem = (new ItemPickaxe(itemId + 1, materialType)).setUnlocalizedName("pickaxeIron").setTextureName("iron_pickaxe");
 		axeItem = (new ItemAxe(itemId + 2, materialType)).setUnlocalizedName("hatchetIron").setTextureName("iron_axe");
 		swordItem = (new ItemSword(itemId + 3, materialType)).setUnlocalizedName("swordIron").setTextureName("iron_sword");
 	    
 		LanguageRegistry.addName(shovelItem, shovelName);
 		LanguageRegistry.addName(pickItem, pickName);
 		LanguageRegistry.addName(axeItem, axeName);
 		LanguageRegistry.addName(swordItem, swordName);
 	}
			
	public static void init()
	{
		registerItemTool(0, shovelWoodBirch, pickaxeWoodBirch, axeWoodBirch, swordWoodBirch, EnumToolMaterial.EMERALD, "Birch Shovel", "Birch Pickaxe", "Birch Axe", "Birch Sword");
	}
}
