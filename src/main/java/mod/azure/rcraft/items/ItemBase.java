package mod.azure.rcraft.items;

import mod.azure.rcraft.IMultiType;
import mod.azure.rcraft.RcraftMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;

public class ItemBase extends Item implements IMultiType {

	private final int maxTypes;

	public ItemBase(String name, int maxTypes) {
		super();
		this.maxTypes = maxTypes;
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(RcraftMod.modid, name));
		this.setCreativeTab(RcraftMod.tab);
		this.setHasSubtypes(true);
	}
	
	public int getMaxTypes() {
		return this.maxTypes;
	}

	public int getType(ItemStack stack) {
		return stack.getItemDamage() + 1;
	}
	
	@Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> variants) {
		if (this.isInCreativeTab(tab)) {
			for (int meta = 0; meta < this.getMaxTypes(); meta++) {
				variants.add(new ItemStack(this, 1, meta));
			}
		}
	}

	public String setTranslationKey(ItemStack stack) {
		return super.getTranslationKey() + this.getType(stack);
	}

}
