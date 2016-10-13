package stonewolfsroleplay.tileentity;

import net.minecraftforge.fml.common.registry.GameRegistry;

public final class TileEntities {
	
	public static void init() {
		GameRegistry.registerTileEntity(StandardGUIsTileEntity.class, "stonewolfsroleplay_tile_entity");
	}
}
