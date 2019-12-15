package mod.azure.dothack.util;

import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.items.StaffItem;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

public class DotHackItems {

	public static Item bladebrandier;
	public static Item dualswords;
	public static Item edgepunisher;
	public static Item flickreaper;
	public static Item lordpartizan;
	public static Item tribalgrappler;
	public static Item blademaster;
	public static Item heavyaxeman;
	public static Item heavyblade;
	public static Item longarm;
	public static Item twinblade;
	public static Item harvestcleric;
	public static Item macabredancer;
	public static Item shadowwarlock;
	public static Item redwand;
	public static Item dualgunner;
	public static Item steamgunner;

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			for (int i = 1; i <= 19; i++)
				event.getRegistry()
						.register(bladebrandier = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.BladebrandierItemGroup))
										.setRegistryName(location("bladebrandier" + i)));
			for (int i = 1; i <= 25; i++)
				event.getRegistry()
						.register(dualswords = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.DualswordsItemGroup))
										.setRegistryName(location("dualswords" + i)));
			for (int i = 1; i <= 20; i++)
				event.getRegistry()
						.register(edgepunisher = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.EdgepunisherItemGroup))
										.setRegistryName(location("edgepunisher" + i)));
			for (int i = 1; i <= 9; i++)
				event.getRegistry().registerAll(
						flickreaper = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.FlickreaperItemGroup))
										.setRegistryName(location("flickreaper" + i)),
						lordpartizan = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.LordpartizanItemGroup))
										.setRegistryName(location("lordpartizan" + i)));
			for (int i = 1; i <= 11; i++)
				event.getRegistry()
						.register(tribalgrappler = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.TribalgrapplerItemGroup))
										.setRegistryName(location("tribalgrappler" + i)));
			for (int i = 1; i <= 75; i++)
				event.getRegistry()
						.register(blademaster = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.BlademasterItemGroup))
										.setRegistryName(location("blademaster" + i)));
			for (int i = 1; i <= 73; i++)
				event.getRegistry()
						.register(heavyaxeman = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.HeavyaxeItemGroup))
										.setRegistryName(location("heavyaxeman" + i)));
			for (int i = 1; i <= 54; i++)
				event.getRegistry()
						.register(heavyblade = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.HeavybladeItemGroup))
										.setRegistryName(location("heavyblade" + i)));
			for (int i = 1; i <= 41; i++)
				event.getRegistry()
						.register(heavyblade = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.HeavybladeItemGroup))
										.setRegistryName(location("heavybladev" + i)));
			for (int i = 1; i <= 71; i++)
				event.getRegistry()
						.register(longarm = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.LongarmItemGroup))
										.setRegistryName(location("longarm" + i)));
			for (int i = 1; i <= 81; i++)
				event.getRegistry()
						.register(twinblade = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.TwinbladeItemGroup))
										.setRegistryName(location("twinblade" + i)));
			for (int i = 1; i <= 4; i++)
				event.getRegistry()
						.register(dualgunner = new BowItem(new Item.Properties().group(DotHackTabs.DualgunnerItemGroup))
								.setRegistryName(location("dualgunner" + i)));
			for (int i = 1; i <= 18; i++)
				event.getRegistry().register(
						steamgunner = new BowItem(new Item.Properties().group(DotHackTabs.SteamgunnerItemGroup))
								.setRegistryName(location("steamgunner" + i)));

			if (ModList.get().isLoaded("mmorpg")) {
				for (int i = 1; i <= 10; i++)
					event.getRegistry()
							.register(harvestcleric = new StaffItem(new Item.Properties().maxDamage(10000), 0)
									.setRegistryName(location("harvestcleric" + i)));
				for (int i = 1; i <= 5; i++)
					event.getRegistry()
							.register(macabredancer = new StaffItem(new Item.Properties().maxDamage(10000), 0)
									.setRegistryName(location("macabredancer" + i)));
				for (int i = 1; i <= 14; i++)
					event.getRegistry()
							.register(shadowwarlock = new StaffItem(new Item.Properties().maxDamage(10000), 0)
									.setRegistryName(location("shadowwarlock" + i)));
				for (int i = 1; i <= 74; i++)
					event.getRegistry().register(redwand = new StaffItem(new Item.Properties().maxDamage(10000), 0)
							.setRegistryName(location("wavemaster" + i)));
				event.getRegistry().register(redwand = new StaffItem(new Item.Properties().maxDamage(10000), 0)
						.setRegistryName(location("redwand")));
			} else {
				for (int i = 1; i <= 10; i++)
					event.getRegistry().register(
							harvestcleric = new BowItem(new Item.Properties().group(DotHackTabs.HarvestclericItemGroup))
									.setRegistryName(location("harvestcleric" + i)));
				for (int i = 1; i <= 5; i++)
					event.getRegistry().register(
							macabredancer = new BowItem(new Item.Properties().group(DotHackTabs.MacabredancerItemGroup))
									.setRegistryName(location("macabredancer" + i)));
				for (int i = 1; i <= 14; i++)
					event.getRegistry().register(
							shadowwarlock = new BowItem(new Item.Properties().group(DotHackTabs.ShadowwarlockItemGroup))
									.setRegistryName(location("shadowwarlock" + i)));
				for (int i = 1; i <= 74; i++)
					event.getRegistry().register(
							redwand = new BowItem(new Item.Properties().group(DotHackTabs.WavemasterItemGroup))
									.setRegistryName(location("wavemaster" + i)));
				event.getRegistry()
						.register(redwand = new BowItem(new Item.Properties().group(DotHackTabs.WavemasterItemGroup))
								.setRegistryName(location("redwand")));
			}
		}

		public static ResourceLocation location(String name) {
			return new ResourceLocation(DotHackMod.MODID, name);
		}
	}
}