package mod.azure.dothack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import mod.azure.dothack.items.ebwizadry.ItemEBWand;
import mod.azure.dothack.items.mineandslash.ItemMSStaff;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public final class DotHackTabs extends CreativeTabs {

	private ItemStack stack;

	public DotHackTabs(String label) {
		super(label);
	}

	public String getTranslatedTabLabel() {
		return "tab." + DotHackMod.MODID;
	}

	@Override
	public ItemStack getIcon() {
		return new ItemStack(DotHackItems.redwand1);
	}

	@Override
	public ItemStack createIcon() {
		return this.stack;
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}

}