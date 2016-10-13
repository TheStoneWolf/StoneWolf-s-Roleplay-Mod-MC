package stonewolfsroleplay.block;

import net.minecraft.creativetab.CreativeTabs;
import stonewolfsroleplay.ObjectRegistering;

public class ModBlocks {
	
	public static KitchenCounter kitchenCounter = new KitchenCounter();
	
	public static void preInit() {
		
		ObjectRegistering.registerBlock(kitchenCounter, "kitchenCounter", CreativeTabs.DECORATIONS, 1.0f, 1.0f );
		
	}
}
