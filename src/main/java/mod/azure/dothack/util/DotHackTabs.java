package mod.azure.dothack.util;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DotHackTabs {

	public static final ItemGroup BlademasterItemGroup = (new ItemGroup("blademaster") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.blademaster);
		}
	});

	public static final ItemGroup BladebrandierItemGroup = (new ItemGroup("bladebrandier") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.bladebrandier);
		}
	});

	public static final ItemGroup DualswordsItemGroup = (new ItemGroup("dualswords") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dualswords);
		}
	});

	public static final ItemGroup TwinbladeItemGroup = (new ItemGroup("twinblade") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.twinblade);
		}
	});

	public static final ItemGroup EdgepunisherItemGroup = (new ItemGroup("edgepunisher") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.edgepunisher);
		}
	});

	public static final ItemGroup FlickreaperItemGroup = (new ItemGroup("flickreaper") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.flickreaper);
		}
	});

	public static final ItemGroup LordpartizanItemGroup = (new ItemGroup("lordpartizan") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.lordpartizan);
		}
	});

	public static final ItemGroup TribalgrapplerItemGroup = (new ItemGroup("tribalgrappler") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.tribalgrappler);
		}
	});

	public static final ItemGroup HeavyaxeItemGroup = (new ItemGroup("heavyaxeman") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.heavyaxeman);
		}
	});

	public static final ItemGroup HeavybladeItemGroup = (new ItemGroup("heavyblade") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.heavyblade);
		}
	});

	public static final ItemGroup LongarmItemGroup = (new ItemGroup("longarm") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.longarm);
		}
	});

	public static final ItemGroup HarvestclericItemGroup = (new ItemGroup("harvestcleric") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.harvestcleric);
		}
	});

	public static final ItemGroup MacabredancerItemGroup = (new ItemGroup("macabredancer") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.macabredancer);
		}
	});

	public static final ItemGroup ShadowwarlockItemGroup = (new ItemGroup("shadowwarlock") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.shadowwarlock);
		}
	});

	public static final ItemGroup WavemasterItemGroup = (new ItemGroup("wavemaster") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.redwand);
		}
	});

	public static final ItemGroup DualgunnerItemGroup = (new ItemGroup("dualgunner") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dualgunner);
		}
	});

	public static final ItemGroup SteamgunnerItemGroup = (new ItemGroup("steamgunner") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.steamgunner);
		}
	});
}
