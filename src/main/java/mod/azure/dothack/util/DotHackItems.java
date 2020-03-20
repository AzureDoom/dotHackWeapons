package mod.azure.dothack.util;

import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.config.Config;
import net.minecraft.item.BowItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
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
			event.getRegistry()
					.registerAll(new Item(new Item.Properties().group(ItemGroup.FOOD)
							.food(new Food.Builder().setAlwaysEdible().saturation(1.2F).hunger(6).build()))
									.setRegistryName(location("ohnomelon")));
			for (int i = 1; i <= 19; i++)
				event.getRegistry()
						.register(bladebrandier = new SwordItem(ItemTier.DIAMOND, (3 + i) / 3, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup)
										.maxDamage(Config.SERVER.SWORD_MAXDAMAGE.get()))
												.setRegistryName(location("bladebrandier" + i)));
			for (int i = 1; i <= 24; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (2 + i) / 5, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup)
										.maxDamage(Config.SERVER.SWORD_MAXDAMAGE.get()))
												.setRegistryName(location("dualswords" + i)));
			for (int i = 1; i <= 20; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (5 + i) / 2, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup)
										.maxDamage(Config.SERVER.BROAD_MAXDAMAGE.get()))
												.setRegistryName(location("edgepunisher" + i)));
			for (int i = 1; i <= 9; i++)
				event.getRegistry().registerAll(
						new SwordItem(ItemTier.DIAMOND, (20 + i) / 3, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup)
										.maxDamage(Config.SERVER.SCYTHE_MAXDAMAGE.get()))
												.setRegistryName(location("flickreaper" + i)),
						new SwordItem(ItemTier.DIAMOND, (16 + i) / 2, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup)
										.maxDamage(Config.SERVER.LANCE_MAXDAMAGE.get()))
												.setRegistryName(location("lordpartizan" + i)));
			for (int i = 1; i <= 11; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (20 + i) / 5, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup)
										.maxDamage(Config.SERVER.HANDWEAPON_MAXDAMAGE.get()))
												.setRegistryName(location("tribalgrappler" + i)));
			for (int i = 1; i <= 75; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (3 + i) / 10, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup)
										.maxDamage(Config.SERVER.SWORD_MAXDAMAGE.get()))
												.setRegistryName(location("blademaster" + i)));
			for (int i = 1; i <= 73; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (11 + i) / 7, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup)
										.maxDamage(Config.SERVER.AXE_MAXDAMAGE.get()))
												.setRegistryName(location("heavyaxeman" + i)));
			for (int i = 1; i <= 54; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (81 + i) / 15, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup)
										.maxDamage(Config.SERVER.BROAD_MAXDAMAGE.get()))
												.setRegistryName(location("heavyblade" + i)));
			for (int i = 1; i <= 41; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (94 + i) / 15, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup)
										.maxDamage(Config.SERVER.BROAD_MAXDAMAGE.get()))
												.setRegistryName(location("heavybladev" + i)));
			for (int i = 1; i <= 71; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (4 + i) / 9, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup)
										.maxDamage(Config.SERVER.LANCE_MAXDAMAGE.get()))
												.setRegistryName(location("longarm" + i)));
			for (int i = 1; i <= 81; i++)
				event.getRegistry()
						.register(new SwordItem(ItemTier.DIAMOND, (2 + i) / 15, -2.4F,
								new Item.Properties().group(DotHackTabs.SwordItemGroup)
										.maxDamage(Config.SERVER.SWORD_MAXDAMAGE.get()))
												.setRegistryName(location("twinblade" + i)));
			for (int i = 1; i <= 4; i++)
				event.getRegistry()
						.register(dualgunner = new BowItem(new Item.Properties().group(DotHackTabs.GunsItemGroup)
								.maxDamage(Config.SERVER.BOW_MAXDAMAGE.get()))
										.setRegistryName(location("dualgunner" + i)));
			for (int i = 1; i <= 18; i++)
				event.getRegistry()
						.register(new BowItem(new Item.Properties().group(DotHackTabs.GunsItemGroup)
								.maxDamage(Config.SERVER.BOW_MAXDAMAGE.get()))
										.setRegistryName(location("steamgunner" + i)));
			event.getRegistry()
					.register(datadrain = new Item(new Item.Properties().group(DotHackTabs.AccessoriesItemGroup)
							.maxStackSize(1).maxDamage(Config.SERVER.ACCESSORY_MAXDAMAGE.get()))
									.setRegistryName(location("datadrain")));

			if (ModList.get().isLoaded("mmorpg")) {
				for (int i = 1; i <= 10; i++)
					event.getRegistry()
							.register(new Item(new Item.Properties().maxDamage(Config.SERVER.STAFF_MAXDAMAGE.get())
									.group(DotHackTabs.MagicItemGroup)).setRegistryName(location("harvestcleric" + i)));
				for (int i = 1; i <= 5; i++)
					event.getRegistry()
							.register(new Item(new Item.Properties().maxDamage(Config.SERVER.STAFF_MAXDAMAGE.get())
									.group(DotHackTabs.MagicItemGroup)).setRegistryName(location("macabredancer" + i)));
				for (int i = 1; i <= 14; i++)
					event.getRegistry()
							.register(new Item(new Item.Properties().maxDamage(Config.SERVER.STAFF_MAXDAMAGE.get())
									.group(DotHackTabs.MagicItemGroup)).setRegistryName(location("shadowwarlock" + i)));
				for (int i = 1; i <= 74; i++)
					event.getRegistry()
							.register(new Item(new Item.Properties().maxDamage(Config.SERVER.STAFF_MAXDAMAGE.get())
									.group(DotHackTabs.MagicItemGroup)).setRegistryName(location("wavemaster" + i)));
				event.getRegistry().register(
						redwand = new Item(new Item.Properties().maxDamage(Config.SERVER.STAFF_MAXDAMAGE.get())
								.group(DotHackTabs.MagicItemGroup)).setRegistryName(location("redwand")));
				event.getRegistry()
						.register(new Item(new Item.Properties().group(DotHackTabs.MagicItemGroup)
								.maxDamage(Config.SERVER.STAFF_MAXDAMAGE.get()))
										.setRegistryName(location("hermitsstick")));
			} else {
				for (int i = 1; i <= 10; i++)
					event.getRegistry()
							.register(new BowItem(new Item.Properties().group(DotHackTabs.MagicItemGroup)
									.maxDamage(Config.SERVER.BOW_MAXDAMAGE.get()))
											.setRegistryName(location("harvestcleric" + i)));
				for (int i = 1; i <= 5; i++)
					event.getRegistry()
							.register(new BowItem(new Item.Properties().group(DotHackTabs.MagicItemGroup)
									.maxDamage(Config.SERVER.BOW_MAXDAMAGE.get()))
											.setRegistryName(location("macabredancer" + i)));
				for (int i = 1; i <= 14; i++)
					event.getRegistry()
							.register(new BowItem(new Item.Properties().group(DotHackTabs.MagicItemGroup)
									.maxDamage(Config.SERVER.BOW_MAXDAMAGE.get()))
											.setRegistryName(location("shadowwarlock" + i)));
				for (int i = 1; i <= 74; i++)
					event.getRegistry()
							.register(new BowItem(new Item.Properties().group(DotHackTabs.MagicItemGroup)
									.maxDamage(Config.SERVER.BOW_MAXDAMAGE.get()))
											.setRegistryName(location("wavemaster" + i)));
				event.getRegistry()
						.register(redwand = new BowItem(new Item.Properties().group(DotHackTabs.MagicItemGroup)
								.maxDamage(Config.SERVER.BOW_MAXDAMAGE.get())).setRegistryName(location("redwand")));
				event.getRegistry()
						.register(new BowItem(new Item.Properties().group(DotHackTabs.MagicItemGroup)
								.maxDamage(Config.SERVER.BOW_MAXDAMAGE.get()))
										.setRegistryName(location("hermitsstick")));
			}
		}

		public static ResourceLocation location(String name) {
			return new ResourceLocation(DotHackMod.MODID, name);
		}
	}

}