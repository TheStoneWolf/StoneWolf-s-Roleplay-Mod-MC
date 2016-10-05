package stonewolfsroleplay.Item;

import net.minecraft.creativetab.CreativeTabs;
import stonewolfsroleplay.ObjectRegistering;

public class ModItems {
	
	public static BaseItem friedEgg = new BaseItem();
	
	public static void preInit() {
		
		//Calls to the method which register the item in question
		ObjectRegistering.registerPlainItem(friedEgg, "friedEgg", CreativeTabs.FOOD);
		
	}

}
