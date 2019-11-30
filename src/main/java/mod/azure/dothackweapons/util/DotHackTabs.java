package mod.azure.dothackweapons.util;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DotHackTabs {

	public static final ItemGroup BlademasterItemGroup = (new ItemGroup("blademaster") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dothack_blademaster1);
		}
	});

	public static final ItemGroup BladebrandierItemGroup = (new ItemGroup("bladebrandier") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dothack_bladebrandier1);
		}
	});

	public static final ItemGroup DualswordsItemGroup = (new ItemGroup("dualswords") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dothack_dualswords1);
		}
	});

	public static final ItemGroup TwinbladeItemGroup = (new ItemGroup("twinblade") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dothack_twinblade1);
		}
	});

	public static final ItemGroup EdgepunisherItemGroup = (new ItemGroup("edgepunisher") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dothack_edgepunisher1);
		}
	});

	public static final ItemGroup FlickreaperItemGroup = (new ItemGroup("flickreaper") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dothack_flickreaper1);
		}
	});

	public static final ItemGroup LordpartizanItemGroup = (new ItemGroup("lordpartizan") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dothack_lordpartizan1);
		}
	});

	public static final ItemGroup TribalgrapplerItemGroup = (new ItemGroup("tribalgrappler") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dothack_tribalgrappler1);
		}
	});

	public static final ItemGroup HeavyaxeItemGroup = (new ItemGroup("heavyaxeman") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dothack_heavyaxeman1);
		}
	});

	public static final ItemGroup HeavybladeItemGroup = (new ItemGroup("heavyblade") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dothack_heavyblade1);
		}
	});

	public static final ItemGroup LongarmItemGroup = (new ItemGroup("longarm") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dothack_longarm1);
		}
	});

	public static final ItemGroup HarvestclericItemGroup = (new ItemGroup("harvestcleric") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dothack_harvestcleric1);
		}
	});

	public static final ItemGroup MacabredancerItemGroup = (new ItemGroup("macabredancer") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dothack_macabredancer1);
		}
	});

	public static final ItemGroup ShadowwarlockItemGroup = (new ItemGroup("shadowwarlock") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dothack_shadowwarlock1);
		}
	});

	public static final ItemGroup WavemasterItemGroup = (new ItemGroup("wavemaster") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dothack_redwand);
		}
	});

	public static final ItemGroup DualgunnerItemGroup = (new ItemGroup("dualgunner") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dothack_dualgunner1);
		}
	});

	public static final ItemGroup SteamgunnerItemGroup = (new ItemGroup("steamgunner") {
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon() {
			return new ItemStack(DotHackItems.dothack_steamgunner1);
		}
	});
}
