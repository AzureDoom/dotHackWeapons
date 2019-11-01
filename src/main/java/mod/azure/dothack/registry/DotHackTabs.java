package mod.azure.dothack.registry;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import mod.azure.dothack.DotHackMod;
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

public class DotHackTabs {

	private DotHackTabs() {
	}

	public static CreativeTabs taba = new CreativeTabListed("accessories");
	public static CreativeTabs tabw = new CreativeTabListed("wands");
	public static CreativeTabs tabtb = new CreativeTabListed("twinblade");
	public static CreativeTabs tabhb = new CreativeTabListed("heavyblade");
	public static CreativeTabs tabdg = new CreativeTabListed("dualgun");
	public static CreativeTabs tabbb = new CreativeTabListed("bladebrandier");
	public static CreativeTabs tabds = new CreativeTabListed("dualswords");
	public static CreativeTabs tabe = new CreativeTabListed("edgepunisher");
	public static CreativeTabs tabf = new CreativeTabListed("flickreaper");
	public static CreativeTabs tablp = new CreativeTabListed("lordpartizan");
	public static CreativeTabs tabt = new CreativeTabListed("tribalgrappler");
	public static CreativeTabs tabbm = new CreativeTabListed("blademaster");
	public static CreativeTabs tabha = new CreativeTabListed("heavyaxeman");
	public static CreativeTabs tabla = new CreativeTabListed("longarm");
	public static CreativeTabs tabsg = new CreativeTabListed("steamgunner");;

	public static class CreativeTabListed extends CreativeTabs {

		private ItemStack iconItem;

		public CreativeTabListed(String label) {
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