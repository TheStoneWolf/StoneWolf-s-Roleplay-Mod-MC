package stonewolfsroleplay;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ObjectRegistering {
	
	
	public static void registerPlainItem(Item item, String unlocalizedName, CreativeTabs tab) {
		
		//Sets the different variables for a standard item
		item.setRegistryName(unlocalizedName);
		item.setUnlocalizedName(unlocalizedName);
		GameRegistry.register(item);
		item.setCreativeTab(tab);
		
		//Loads the textures of the item
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation("stonewolfsroleplay:" + unlocalizedName, "inventory"));
	}
}
