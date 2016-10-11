package stonewolfsroleplay.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class KitchenCounter extends Block {

	public KitchenCounter(Material materialIn) {
		super(Material.WOOD);
		// TODO Auto-generated constructor stub
	}

	/*@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		if (worldIn.isRemote) {
			return true;
		} else {
			playerIn.displayGui(new KitchenCounter.InterfaceCraftingTable(worldIn, pos));
			playerIn.addStat(StatList.CRAFTING_TABLE_INTERACTION);
			return true;
		}
	}

	public static class InterfaceCraftingTable implements IInteractionObject {
		private final World world;
		private final BlockPos position;

		public InterfaceCraftingTable(World worldIn, BlockPos pos) {
			this.world = worldIn;
			this.position = pos;
		}

		
		 * Get the name of this object. For players this returns their username
		 
		public String getName() {
			return null;
		}

		
		 * Returns true if this thing is named
		 
		public boolean hasCustomName() {
			return false;
		}

		
		 * Get the formatted ChatComponent that will be used for the sender's
		 * username in chat
		 
		public ITextComponent getDisplayName() {
			return new TextComponentTranslation(ModBlocks.kitchenCounter.getUnlocalizedName() + ".name", new Object[0]);
		}
		
		
		public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
			return new ContainerWorkbench(playerInventory, this.world, this.position);
		}

		@Override
		public String getGuiID() {
			// TODO Auto-generated method stub
			return null;
		}*/

}
