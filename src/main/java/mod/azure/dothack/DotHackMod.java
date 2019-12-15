package mod.azure.dothack;

import mod.azure.dothack.config.Config;
import mod.azure.dothack.items.StaffItem;
import mod.azure.dothack.util.DotHackItems;
import mod.azure.dothack.util.DotHackTabs;
import mod.azure.dothack.util.MMORPGHandler;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTier;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod("dothack")
public class DotHackMod {

	public static DotHackMod instance;
	public static final String MODID = "dothack";

	public DotHackMod() {
		{
			instance = this;
			ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.spec, "dothack-config.toml");
			Config.loadConfig(Config.spec, FMLPaths.CONFIGDIR.get().resolve("dothack-config.toml").toString());
			MinecraftForge.EVENT_BUS.register(this);
		}
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doCompatStuff);
	}

	private void doCompatStuff(final InterModProcessEvent event) {
		if (ModList.get().isLoaded("mmorpg") && Config.INSTANCE.USE_COMPATIBILITY_ON_ITEMS.get()) {
			MinecraftForge.EVENT_BUS.register(new MMORPGHandler());
		}
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			for (int i = 1; i <= 19; i++)
				event.getRegistry()
						.register(DotHackItems.bladebrandier = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.BladebrandierItemGroup))
										.setRegistryName(location("bladebrandier" + i)));
			for (int i = 1; i <= 25; i++)
				event.getRegistry()
						.register(DotHackItems.dualswords = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.DualswordsItemGroup))
										.setRegistryName(location("dualswords" + i)));
			for (int i = 1; i <= 20; i++)
				event.getRegistry()
						.register(DotHackItems.edgepunisher = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.EdgepunisherItemGroup))
										.setRegistryName(location("edgepunisher" + i)));
			for (int i = 1; i <= 9; i++)
				event.getRegistry().registerAll(
						DotHackItems.flickreaper = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.FlickreaperItemGroup))
										.setRegistryName(location("flickreaper" + i)),
						DotHackItems.lordpartizan = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.LordpartizanItemGroup))
										.setRegistryName(location("lordpartizan" + i)));
			for (int i = 1; i <= 11; i++)
				event.getRegistry()
						.register(DotHackItems.tribalgrappler = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.TribalgrapplerItemGroup))
										.setRegistryName(location("tribalgrappler" + i)));
			for (int i = 1; i <= 75; i++)
				event.getRegistry()
						.register(DotHackItems.blademaster = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.BlademasterItemGroup))
										.setRegistryName(location("blademaster" + i)));
			for (int i = 1; i <= 73; i++)
				event.getRegistry()
						.register(DotHackItems.heavyaxeman = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.HeavyaxeItemGroup))
										.setRegistryName(location("heavyaxeman" + i)));
			for (int i = 1; i <= 54; i++)
				event.getRegistry()
						.register(DotHackItems.heavyblade = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.HeavybladeItemGroup))
										.setRegistryName(location("heavyblade" + i)));
			for (int i = 1; i <= 41; i++)
				event.getRegistry()
						.register(DotHackItems.heavyblade = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.HeavybladeItemGroup))
										.setRegistryName(location("heavybladev" + i)));
			for (int i = 1; i <= 71; i++)
				event.getRegistry()
						.register(DotHackItems.longarm = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.LongarmItemGroup))
										.setRegistryName(location("longarm" + i)));
			for (int i = 1; i <= 81; i++)
				event.getRegistry()
						.register(DotHackItems.twinblade = new SwordItem(ItemTier.DIAMOND, 8, 6.0f,
								new Item.Properties().group(DotHackTabs.TwinbladeItemGroup))
										.setRegistryName(location("twinblade" + i)));
			for (int i = 1; i <= 4; i++)
				event.getRegistry()
						.register(DotHackItems.dualgunner = new BowItem(
								new Item.Properties().group(DotHackTabs.DualgunnerItemGroup))
										.setRegistryName(location("dualgunner" + i)));
			for (int i = 1; i <= 18; i++)
				event.getRegistry()
						.register(DotHackItems.steamgunner = new BowItem(
								new Item.Properties().group(DotHackTabs.SteamgunnerItemGroup))
										.setRegistryName(location("steamgunner" + i)));

			if (ModList.get().isLoaded("mmorpg")) {
				for (int i = 1; i <= 10; i++)
					event.getRegistry().register(
							DotHackItems.harvestcleric = new StaffItem(new Item.Properties().maxDamage(10000), 0)
									.setRegistryName(location("harvestcleric" + i)));
				for (int i = 1; i <= 5; i++)
					event.getRegistry().register(
							DotHackItems.macabredancer = new StaffItem(new Item.Properties().maxDamage(10000), 0)
									.setRegistryName(location("macabredancer" + i)));
				for (int i = 1; i <= 14; i++)
					event.getRegistry().register(
							DotHackItems.shadowwarlock = new StaffItem(new Item.Properties().maxDamage(10000), 0)
									.setRegistryName(location("shadowwarlock" + i)));
				for (int i = 1; i <= 74; i++)
					event.getRegistry()
							.register(DotHackItems.redwand = new StaffItem(new Item.Properties().maxDamage(10000), 0)
									.setRegistryName(location("wavemaster" + i)));
				event.getRegistry()
						.register(DotHackItems.redwand = new StaffItem(new Item.Properties().maxDamage(10000), 0)
								.setRegistryName(location("redwand")));
			} else {
				for (int i = 1; i <= 10; i++)
					event.getRegistry()
							.register(DotHackItems.harvestcleric = new BowItem(
									new Item.Properties().group(DotHackTabs.HarvestclericItemGroup))
											.setRegistryName(location("harvestcleric" + i)));
				for (int i = 1; i <= 5; i++)
					event.getRegistry()
							.register(DotHackItems.macabredancer = new BowItem(
									new Item.Properties().group(DotHackTabs.MacabredancerItemGroup))
											.setRegistryName(location("macabredancer" + i)));
				for (int i = 1; i <= 14; i++)
					event.getRegistry()
							.register(DotHackItems.shadowwarlock = new BowItem(
									new Item.Properties().group(DotHackTabs.ShadowwarlockItemGroup))
											.setRegistryName(location("shadowwarlock" + i)));
				for (int i = 1; i <= 74; i++)
					event.getRegistry()
							.register(DotHackItems.redwand = new BowItem(
									new Item.Properties().group(DotHackTabs.WavemasterItemGroup))
											.setRegistryName(location("wavemaster" + i)));
				event.getRegistry().register(
						DotHackItems.redwand = new BowItem(new Item.Properties().group(DotHackTabs.WavemasterItemGroup))
								.setRegistryName(location("redwand")));
			}
		}

		public static ResourceLocation location(String name) {
			return new ResourceLocation(DotHackMod.MODID, name);
		}
	}
}