package mod.azure.rcraft.items.mineandslash;

import com.robertx22.items.gearitems.weapons.ItemBow;

import mod.azure.rcraft.RcraftMod;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;

public class ItemMSBow extends ItemBow {

	public ItemMSBow(String name) {
		super();
		this.setTranslationKey(name);
		this.setRegistryName(new ResourceLocation(RcraftMod.modid, name));
		this.setCreativeTab(RcraftMod.tab);
	}

	public String getTranslationKey(ItemStack stack) {
		return super.getTranslationKey();
	}
}