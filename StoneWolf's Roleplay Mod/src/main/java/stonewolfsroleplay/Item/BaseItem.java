package stonewolfsroleplay.Item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BaseItem extends Item {
	
	public BaseItem(String unlocalizedName, CreativeTabs tab) {
		super();
		this.setRegistryName(unlocalizedName);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(tab);
	}
}
