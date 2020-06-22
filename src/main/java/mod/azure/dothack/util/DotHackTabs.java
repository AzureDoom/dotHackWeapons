package mod.azure.dothack.util;

import mod.azure.dothack.util.registry.DotHackItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DotHackTabs {

	public static final ItemGroup SwordItemGroup = (new ItemGroup("sword") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.BLADEBRANDIER1.get());
		}

		public boolean hasSearchBar() {
			return true;
		}

	}).setBackgroundImageName("item_search.png");

	public static final ItemGroup MagicItemGroup = (new ItemGroup("magic") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.REDWAND.get());
		}

		public boolean hasSearchBar() {
			return true;
		}

	}).setBackgroundImageName("item_search.png");

	public static final ItemGroup GunsItemGroup = (new ItemGroup("guns") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.DUALGUNNER1.get());
		}

		public boolean hasSearchBar() {
			return true;
		}

	}).setBackgroundImageName("item_search.png");

	public static final ItemGroup AccessoriesItemGroup = (new ItemGroup("accessories") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.DATADRAIN.get());
		}
	});
}
