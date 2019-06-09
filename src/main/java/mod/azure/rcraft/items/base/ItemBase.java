package mod.azure.rcraft.items.base;

import mod.azure.rcraft.RcraftMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemBase extends Item {

	public ItemBase(String name) {
		super();
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(RcraftMod.modid, name));
		this.setCreativeTab(RcraftMod.tab);
	}

	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}

}
