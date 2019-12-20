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
	public static Item redwand;
	public static Item dualgunner;
	public static Item datadrain;

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			for (int i = 1; i <= 8; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (3 + i) / 3, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup).maxDamage(10000))
										.setRegistryName(location("bladebrandier" + i)));
			event.getRegistry()
					.register(bladebrandier = new SwordItem(ItemTier.DIAMOND, 4, -2.4F,
							new Item.Properties().group(DotHackTabs.SwordItemGroup).maxDamage(10000))
									.setRegistryName(location("bladebrandier9")));
			for (int i = 10; i <= 19; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (3 + i) / 3, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup).maxDamage(10000))
										.setRegistryName(location("bladebrandier" + i)));
			for (int i = 1; i <= 8; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (2 + i) / 5, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup).maxDamage(10000))
										.setRegistryName(location("dualswords" + i)));
			for (int i = 10; i <= 25; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (2 + i) / 5, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup).maxDamage(10000))
										.setRegistryName(location("dualswords" + i)));
			for (int i = 1; i <= 20; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (5 + i) / 2, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup).maxDamage(10000))
										.setRegistryName(location("edgepunisher" + i)));
			for (int i = 1; i <= 9; i++)
				event.getRegistry().registerAll(
						new SwordItem(ItemTier.DIAMOND, (20 + i) / 3, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup).maxDamage(10000))
										.setRegistryName(location("flickreaper" + i)),
						new SwordItem(ItemTier.DIAMOND, (16 + i) / 2, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup).maxDamage(10000))
										.setRegistryName(location("lordpartizan" + i)));
			for (int i = 1; i <= 11; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (20 + i) / 5, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup).maxDamage(10000))
										.setRegistryName(location("tribalgrappler" + i)));
			for (int i = 1; i <= 75; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (3 + i) / 10, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup).maxDamage(10000))
										.setRegistryName(location("blademaster" + i)));
			for (int i = 1; i <= 73; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (11 + i) / 7, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup).maxDamage(10000))
										.setRegistryName(location("heavyaxeman" + i)));
			for (int i = 1; i <= 54; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (81 + i) / 15, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup).maxDamage(10000))
										.setRegistryName(location("heavyblade" + i)));
			for (int i = 1; i <= 41; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (94 + i) / 15, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup).maxDamage(10000))
										.setRegistryName(location("heavybladev" + i)));
			for (int i = 1; i <= 71; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (4 + i) / 9, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup).maxDamage(10000))
										.setRegistryName(location("longarm" + i)));
			for (int i = 1; i <= 81; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (2 + i) / 15, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup).maxDamage(10000))
										.setRegistryName(location("twinblade" + i)));
			for (int i = 1; i <= 4; i++)
				event.getRegistry()
						.register(dualgunner = new BowItem(
								new Item.Properties().group(DotHackTabs.GunsItemGroup).maxDamage(10000))
										.setRegistryName(location("dualgunner" + i)));
			for (int i = 1; i <= 18; i++)
				event.getRegistry()
						.register(new BowItem(new Item.Properties().group(DotHackTabs.GunsItemGroup).maxDamage(10000))
								.setRegistryName(location("steamgunner" + i)));

			if (ModList.get().isLoaded("mmorpg")) {
				for (int i = 1; i <= 10; i++)
					event.getRegistry().register(
							new StaffItem(new Item.Properties().maxDamage(10000).group(DotHackTabs.MagicItemGroup), 0)
									.setRegistryName(location("harvestcleric" + i)));
				for (int i = 1; i <= 5; i++)
					event.getRegistry().register(
							new StaffItem(new Item.Properties().maxDamage(10000).group(DotHackTabs.MagicItemGroup), 0)
									.setRegistryName(location("macabredancer" + i)));
				for (int i = 1; i <= 14; i++)
					event.getRegistry().register(
							new StaffItem(new Item.Properties().maxDamage(10000).group(DotHackTabs.MagicItemGroup), 0)
									.setRegistryName(location("shadowwarlock" + i)));
				for (int i = 1; i <= 74; i++)
					event.getRegistry().register(
							new StaffItem(new Item.Properties().maxDamage(10000).group(DotHackTabs.MagicItemGroup), 0)
									.setRegistryName(location("wavemaster" + i)));
				event.getRegistry()
						.register(redwand = new StaffItem(
								new Item.Properties().maxDamage(10000).group(DotHackTabs.MagicItemGroup), 0)
										.setRegistryName(location("redwand")));
			} else {
				for (int i = 1; i <= 10; i++)
					event.getRegistry().register(
							new BowItem(new Item.Properties().group(DotHackTabs.MagicItemGroup).maxDamage(10000))
									.setRegistryName(location("harvestcleric" + i)));
				for (int i = 1; i <= 5; i++)
					event.getRegistry().register(
							new BowItem(new Item.Properties().group(DotHackTabs.MagicItemGroup).maxDamage(10000))
									.setRegistryName(location("macabredancer" + i)));
				for (int i = 1; i <= 14; i++)
					event.getRegistry().register(
							new BowItem(new Item.Properties().group(DotHackTabs.MagicItemGroup).maxDamage(10000))
									.setRegistryName(location("shadowwarlock" + i)));
				for (int i = 1; i <= 74; i++)
					event.getRegistry().register(
							new BowItem(new Item.Properties().group(DotHackTabs.MagicItemGroup).maxDamage(10000))
									.setRegistryName(location("wavemaster" + i)));
				event.getRegistry().register(
						redwand = new BowItem(new Item.Properties().group(DotHackTabs.MagicItemGroup).maxDamage(10000))
								.setRegistryName(location("redwand")));
			}
			event.getRegistry().register(datadrain = new Item(
					new Item.Properties().group(DotHackTabs.AccessoriesItemGroup).maxStackSize(1).maxDamage(10000))
							.setRegistryName(location("datadrain")));
		}

		public static ResourceLocation location(String name) {
			return new ResourceLocation(DotHackMod.MODID, name);
		}
	}

}