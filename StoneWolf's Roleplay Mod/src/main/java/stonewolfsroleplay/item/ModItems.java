package stonewolfsroleplay.item;

import net.minecraft.creativetab.CreativeTabs;
import stonewolfsroleplay.ObjectRegistering;

public class ModItems {
	
	public static FriedEgg friedEgg = new FriedEgg();
	
	public static void preInit() {
		
		//Calls to the method which register the item in question
		ObjectRegistering.registerPlainItem(friedEgg, "friedEgg", CreativeTabs.FOOD);
		
	}

}
