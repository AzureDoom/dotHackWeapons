package mod.azure.rcraft.items;

import electroblob.wizardry.constants.Element;
import electroblob.wizardry.constants.Tier;
import electroblob.wizardry.item.ItemWand;
import mod.azure.rcraft.IMultiType;
import mod.azure.rcraft.RcraftMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;

public class ItemMagic extends ItemWand implements IMultiType {
	
	private final int maxTypes;

	public ItemMagic(String name, int maxTypes, Tier tier, Element element) {
		super(tier, element);
		this.maxTypes = maxTypes;
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(RcraftMod.modid, name));
		this.setCreativeTab(RcraftMod.tab);
		this.tier = tier;
		this.element = element;
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
		return this.getTranslationKey();
	}

}
