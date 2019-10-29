package mod.azure.dothack.items.base;

import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.DotHackTabs;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;

public class ItemBaseSword extends ItemSword {

	public ItemBaseSword(String name, int damage) {
		super(EnumHelper.addToolMaterial(name, 1, 1561, 4F, damage, 4));
		this.setCreativeTab(DotHackMod.tab);
	}
}