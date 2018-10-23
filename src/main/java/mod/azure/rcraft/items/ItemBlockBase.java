package mod.azure.rcraft.items;

import mod.azure.rcraft.IMultiType;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemBlockBase extends ItemBlock implements IMultiType {

	private final int maxTypes;

	public ItemBlockBase(Block block, int maxTypes) {
		super(block);
		this.maxTypes = maxTypes;
	}

	public int getMaxTypes() {
		return this.maxTypes;
	}

	public int getType(ItemStack stack) {
		return stack.getItemDamage() + 1;
	}

	@Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> variants) {
		for (int meta = 0; meta < this.getMaxTypes(); meta++) {
			variants.add(new ItemStack(this, 1, meta));
		}
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + this.getType(stack);
	}
}
