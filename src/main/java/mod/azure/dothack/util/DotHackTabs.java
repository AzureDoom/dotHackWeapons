package mod.azure.dothack.util;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DotHackTabs {

	public static final ItemGroup SwordItemGroup = (new ItemGroup("sword") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.bladebrandier);
		}

		public boolean hasSearchBar() {
			return true;
		}

	}).setBackgroundImageName("item_search.png");;

	public static final ItemGroup MagicItemGroup = (new ItemGroup("magic") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.harvestcleric);
		}

		public boolean hasSearchBar() {
			return true;
		}

	}).setBackgroundImageName("item_search.png");;

	public static final ItemGroup GunsItemGroup = (new ItemGroup("guns") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dualgunner);
		}

		public boolean hasSearchBar() {
			return true;
		}

	}).setBackgroundImageName("item_search.png");;

	public static final ItemGroup AccessoriesItemGroup = (new ItemGroup("accessories") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.datadrain);
		}
	});
}
