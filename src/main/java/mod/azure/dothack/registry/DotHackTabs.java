package mod.azure.dothack.registry;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import mod.azure.dothack.DotHackMod;
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

public class DotHackTabs {

	private DotHackTabs() {
	}

	public static CreativeTabs taba = new DotHackCreativeTab("accessories");
	public static CreativeTabs tabw = new DotHackCreativeTab("wands");
	public static CreativeTabs tabtb = new DotHackCreativeTab("twinblade");
	public static CreativeTabs tabhb = new DotHackCreativeTab("heavyblade");
	public static CreativeTabs tabdg = new DotHackCreativeTab("dualgun");
	public static CreativeTabs tabbb = new DotHackCreativeTab("bladebrandier");
	public static CreativeTabs tabds = new DotHackCreativeTab("dualswords");
	public static CreativeTabs tabe = new DotHackCreativeTab("edgepunisher");
	public static CreativeTabs tabf = new DotHackCreativeTab("flickreaper");
	public static CreativeTabs tablp = new DotHackCreativeTab("lordpartizan");
	public static CreativeTabs tabt = new DotHackCreativeTab("tribalgrappler");
	public static CreativeTabs tabbm = new DotHackCreativeTab("blademaster");
	public static CreativeTabs tabha = new DotHackCreativeTab("heavyaxeman");
	public static CreativeTabs tabla = new DotHackCreativeTab("longarm");
	public static CreativeTabs tabsg = new DotHackCreativeTab("steamgunner");

	public static class DotHackCreativeTab extends CreativeTabs {

		private ItemStack iconItem;

		public DotHackCreativeTab(String label) {
			super(label);
		}

		public ItemStack createIcon() {
			return iconItem;
		}

		public void setIconItem(ItemStack iconItem) {
			this.iconItem = iconItem;
		}

		@Override
		public boolean hasSearchBar() {
			return true;
		}
	}

}