package stonewolfsroleplay.Item;

import net.minecraft.creativetab.CreativeTabs;
import stonewolfsroleplay.ObjectRegistering;

public class ModItems {
	
	public static BaseItem CookedEgg;
	
	public static void init() {
		
		ObjectRegistering.registerPlainItem(CookedEgg = new BaseItem(), "itemCookedEgg", CreativeTabs.FOOD);
		
	}

}
