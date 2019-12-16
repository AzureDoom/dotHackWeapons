package mod.azure.dothack.registry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class DotHackTabs {

	public static final CreativeTabs SWORDS = (new CreativeTabs("swords") {
		@SideOnly(Side.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.blademaster);
		}

		public boolean hasSearchBar() {
			return true;
		}
	}).setBackgroundImageName("item_search.png");

	public static final CreativeTabs MAGIC = (new CreativeTabs("magic") {
		@SideOnly(Side.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.redwand);
		}

		public boolean hasSearchBar() {
			return true;
		}
	}).setBackgroundImageName("item_search.png");

	public static final CreativeTabs GUNS = (new CreativeTabs("guns") {
		@SideOnly(Side.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dualgunner);
		}

		public boolean hasSearchBar() {
			return true;
		}
	}).setBackgroundImageName("item_search.png");

	public static final CreativeTabs EXTRA = (new CreativeTabs("extra") {
		@SideOnly(Side.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.datadrain);
		}

		public boolean hasSearchBar() {
			return true;
		}
	}).setBackgroundImageName("item_search.png");

}