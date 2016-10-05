package stonewolfsroleplay.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import stonewolfsroleplay.Item.ModItems;

public class ClientProxy extends CommonProxy {
	
	@Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        
        ModelLoader.setCustomModelResourceLocation(ModItems.CookedEgg, 0, new ModelResourceLocation("stonewolfsroleplay:itemCookedEgg","inventory"));
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }
}
