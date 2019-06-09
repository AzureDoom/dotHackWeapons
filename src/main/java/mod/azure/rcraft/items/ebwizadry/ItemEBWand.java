package mod.azure.rcraft.items.ebwizadry;

import electroblob.wizardry.constants.Element;
import electroblob.wizardry.constants.Tier;
import electroblob.wizardry.item.ItemWand;
import mod.azure.rcraft.RcraftMod;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemEBWand extends ItemWand   {

	public ItemEBWand(String name, Tier tier, Element element) {
		super(tier, element);
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(RcraftMod.modid, name));
		this.setCreativeTab(RcraftMod.tab);
		this.tier = tier;
		this.element = element;
		
	}
	
	public String getTranslationKey(ItemStack stack) {
		return this.getTranslationKey();
	}
}