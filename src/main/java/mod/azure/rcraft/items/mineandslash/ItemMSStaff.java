package mod.azure.rcraft.items.mineandslash;

import com.robertx22.items.gearitems.weapons.ItemStaff;

import mod.azure.rcraft.RcraftMod;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class ItemMSStaff extends ItemStaff {

	public ItemMSStaff(String name) {
		super();
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(RcraftMod.modid, name));
		this.setCreativeTab(RcraftMod.tab);
	}

	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}
}