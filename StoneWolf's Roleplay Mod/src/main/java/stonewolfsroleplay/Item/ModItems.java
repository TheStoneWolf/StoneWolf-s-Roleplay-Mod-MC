package stonewolfsroleplay.Item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static BaseItem CookedEgg;
	
	public static void init() {
		GameRegistry.register(CookedEgg = (BaseItem) new BaseItem("itemCookedEgg", CreativeTabs.FOOD));
		
	}

}
