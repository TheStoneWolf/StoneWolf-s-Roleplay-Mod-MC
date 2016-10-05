package stonewolfsroleplay;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import stonewolfsroleplay.Item.ModItems;
import stonewolfsroleplay.proxy.CommonProxy;

@Mod(modid = StoneWolfsRoleplayMod.modId, name = StoneWolfsRoleplayMod.name, version = StoneWolfsRoleplayMod.version, acceptedMinecraftVersions = "[1.10.2]")
public class StoneWolfsRoleplayMod {
	
	public static final String modId = "stonewolfsroleplay";
	public static final String name = "StoneWolf's Roleplay Mod";
	public static final String version = "1.0.0";
	
	//Loads the, at the moment, unused proxies. From what I know they are a requirement even still so do not delete them!
	@SidedProxy(clientSide="stonewolfsroleplay.proxy.ClientProxy", serverSide="stonewolfsroleplay.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	@Mod.Instance(modId)
	public static StoneWolfsRoleplayMod instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		//Makes the items - both their textures and their behaviour
		ModItems.preInit();
		
	
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
	
	

}
