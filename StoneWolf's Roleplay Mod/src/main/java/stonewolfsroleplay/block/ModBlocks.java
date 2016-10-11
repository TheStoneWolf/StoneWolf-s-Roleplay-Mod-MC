package stonewolfsroleplay.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import stonewolfsroleplay.ObjectRegistering;

public class ModBlocks {
	
	public static KitchenCounter kitchenCounter = new KitchenCounter(Material.WOOD);
	
	public static void preInit() {
		
		ObjectRegistering.registerBlock(kitchenCounter, "kitchenCounter", CreativeTabs.DECORATIONS);
		
	}
}
