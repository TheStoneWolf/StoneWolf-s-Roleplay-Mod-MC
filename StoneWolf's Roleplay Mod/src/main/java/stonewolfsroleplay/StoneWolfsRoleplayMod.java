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
	
	@SidedProxy(clientSide="stonewolfsroleplay.proxy.ClientProxy", serverSide="stonewolfsroleplay.proxy.ServerProxy")
	public static CommonProxy proxy;
	
	@Mod.Instance(modId)
	public static StoneWolfsRoleplayMod instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		ModItems.init();
	
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
	
	

}
