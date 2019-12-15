package mod.azure.dothack.registry;

import electroblob.wizardry.constants.Element;
import electroblob.wizardry.constants.Tier;
import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.items.base.ItemBaseSword;
import mod.azure.dothack.items.baubles.BaublesHeadItem;
import mod.azure.dothack.items.ebwizadry.ItemEBWand1;
import mod.azure.dothack.items.ebwizadry.ItemEBWand10;
import mod.azure.dothack.items.ebwizadry.ItemEBWand11;
import mod.azure.dothack.items.ebwizadry.ItemEBWand12;
import mod.azure.dothack.items.ebwizadry.ItemEBWand13;
import mod.azure.dothack.items.ebwizadry.ItemEBWand14;
import mod.azure.dothack.items.ebwizadry.ItemEBWand15;
import mod.azure.dothack.items.ebwizadry.ItemEBWand16;
import mod.azure.dothack.items.ebwizadry.ItemEBWand17;
import mod.azure.dothack.items.ebwizadry.ItemEBWand18;
import mod.azure.dothack.items.ebwizadry.ItemEBWand19;
import mod.azure.dothack.items.ebwizadry.ItemEBWand2;
import mod.azure.dothack.items.ebwizadry.ItemEBWand20;
import mod.azure.dothack.items.ebwizadry.ItemEBWand21;
import mod.azure.dothack.items.ebwizadry.ItemEBWand22;
import mod.azure.dothack.items.ebwizadry.ItemEBWand23;
import mod.azure.dothack.items.ebwizadry.ItemEBWand24;
import mod.azure.dothack.items.ebwizadry.ItemEBWand25;
import mod.azure.dothack.items.ebwizadry.ItemEBWand3;
import mod.azure.dothack.items.ebwizadry.ItemEBWand4;
import mod.azure.dothack.items.ebwizadry.ItemEBWand5;
import mod.azure.dothack.items.ebwizadry.ItemEBWand6;
import mod.azure.dothack.items.ebwizadry.ItemEBWand7;
import mod.azure.dothack.items.ebwizadry.ItemEBWand8;
import mod.azure.dothack.items.ebwizadry.ItemEBWand9;
import mod.azure.dothack.items.mineandslash.ItemMSStaff;
import mod.azure.dothack.registry.DotHackTabs.DotHackCreativeTab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@EventBusSubscriber
public final class DotHackItems {

	public static void registerItem(IForgeRegistry<Item> registry, String name, Item item, boolean setTabIcon) {
		item.setRegistryName(DotHackMod.MODID, name);
		item.setTranslationKey(name);
		registry.register(item);

		if (setTabIcon && item.getCreativeTab() instanceof DotHackCreativeTab) {
			((DotHackCreativeTab) item.getCreativeTab()).setIconItem(new ItemStack(item));
		}
	}

	public static void registerItem(IForgeRegistry<Item> registry, String name, Item item) {
		registerItem(registry, name, item, false);
	}

	@SubscribeEvent
	public static void register(RegistryEvent.Register<Item> event) {

		IForgeRegistry<Item> registry = event.getRegistry();

		for (int i = 1; i <= 19; i++)
			registerItem(registry, "bladebrandier" + i,
					new ItemBaseSword("bladebrandier" + i, (3 + i) / 3).setCreativeTab(DotHackTabs.tabbb), true);
		for (int i = 1; i <= 25; i++)
			registerItem(registry, "dualswords" + i,
					new ItemBaseSword("dualswords" + i, (2 + i) / 5).setCreativeTab(DotHackTabs.tabds), true);
		for (int i = 1; i <= 20; i++)
			registerItem(registry, "edgepunisher" + i,
					new ItemBaseSword("edgepunisher" + i, (5 + i) / 2).setCreativeTab(DotHackTabs.tabe), true);
		for (int i = 1; i <= 9; i++)
			registerItem(registry, "flickreaper" + i,
					new ItemBaseSword("flickreaper" + i, (20 + i) / 3).setCreativeTab(DotHackTabs.tabf), true);
		for (int i = 1; i <= 9; i++)
			registerItem(registry, "lordpartizan" + i,
					new ItemBaseSword("lordpartizan" + i, (16 + i) / 2).setCreativeTab(DotHackTabs.tablp), true);
		for (int i = 1; i <= 11; i++)
			registerItem(registry, "tribalgrappler" + i,
					new ItemBaseSword("tribalgrappler" + i, (20 + i) / 5).setCreativeTab(DotHackTabs.tabt), true);
		for (int i = 1; i <= 75; i++)
			registerItem(registry, "blademaster" + i,
					new ItemBaseSword("blademaster" + i, (3 + i) / 10).setCreativeTab(DotHackTabs.tabbm), true);
		for (int i = 1; i <= 73; i++)
			registerItem(registry, "heavyaxeman" + i,
					new ItemBaseSword("heavyaxeman" + i, (11 + i) / 7).setCreativeTab(DotHackTabs.tabha), true);
		for (int i = 1; i <= 54; i++)
			registerItem(registry, "heavyblade" + i,
					new ItemBaseSword("heavyblade" + i, (81 + i) / 15).setCreativeTab(DotHackTabs.tabhb), true);
		for (int i = 1; i <= 41; i++)
			registerItem(registry, "heavybladev" + i,
					new ItemBaseSword("heavybladev" + i, (94 + i) / 15).setCreativeTab(DotHackTabs.tabhb), true);
		for (int i = 1; i <= 71; i++)
			registerItem(registry, "longarm" + i,
					new ItemBaseSword("longarm" + i, (4 + i) / 9).setCreativeTab(DotHackTabs.tabla), true);
		for (int i = 1; i <= 81; i++)
			registerItem(registry, "twinblade" + i,
					new ItemBaseSword("twinblade" + i, (2 + i) / 15).setCreativeTab(DotHackTabs.tabtb), true);
		DotHackMod.LOGGER.info("Registered normal items");
		if (Loader.isModLoaded("baubles")) {
			registerItem(registry, "datadrain", new BaublesHeadItem().setCreativeTab(DotHackTabs.taba), true);
			DotHackMod.LOGGER.info("Registered with Baubles");
		} else {
			registerItem(registry, "datadrain", new Item().setCreativeTab(DotHackTabs.taba), true);
			DotHackMod.LOGGER.info("Registered without Baubles");
		}
		if (Loader.isModLoaded("ebwizardry")) {
			registerItem(registry, "wavemaster26", new ItemEBWand1(Tier.NOVICE, Element.SORCERY), true);
			registerItem(registry, "wavemaster21", new ItemEBWand2(Tier.NOVICE, Element.SORCERY));
			registerItem(registry, "wavemaster19", new ItemEBWand3(Tier.NOVICE, Element.SORCERY));
			registerItem(registry, "wavemaster16", new ItemEBWand4(Tier.NOVICE, Element.SORCERY));
			registerItem(registry, "wavemaster15", new ItemEBWand5(Tier.NOVICE, Element.SORCERY));
			registerItem(registry, "wavemaster14", new ItemEBWand6(Tier.NOVICE, Element.SORCERY));
			registerItem(registry, "wavemaster13", new ItemEBWand7(Tier.NOVICE, Element.SORCERY));
			registerItem(registry, "wavemaster12", new ItemEBWand8(Tier.NOVICE, Element.SORCERY));
			registerItem(registry, "wavemaster9", new ItemEBWand9(Tier.NOVICE, Element.SORCERY));
			registerItem(registry, "wavemaster8", new ItemEBWand10(Tier.NOVICE, Element.SORCERY));
			registerItem(registry, "wavemaster2", new ItemEBWand11(Tier.NOVICE, Element.SORCERY));
			registerItem(registry, "shadowwarlock3", new ItemEBWand12(Tier.NOVICE, Element.SORCERY), true);
			registerItem(registry, "shadowwarlock4", new ItemEBWand13(Tier.NOVICE, Element.SORCERY));
			registerItem(registry, "shadowwarlock5", new ItemEBWand14(Tier.NOVICE, Element.SORCERY));
			registerItem(registry, "shadowwarlock6", new ItemEBWand15(Tier.NOVICE, Element.SORCERY));
			registerItem(registry, "macabredancer4", new ItemEBWand16(Tier.NOVICE, Element.SORCERY), true);
			registerItem(registry, "macabredancer5", new ItemEBWand17(Tier.NOVICE, Element.SORCERY));
			registerItem(registry, "shadowwarlock7", new ItemEBWand18(Tier.NOVICE, Element.SORCERY));
			registerItem(registry, "harvestcleric6", new ItemEBWand19(Tier.NOVICE, Element.SORCERY), true);
			registerItem(registry, "redwand1", new ItemEBWand20(Tier.NOVICE, Element.SORCERY));
			registerItem(registry, "wavemaster26p", new ItemEBWand1(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "wavemaster21p", new ItemEBWand2(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "wavemaster19p", new ItemEBWand3(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "wavemaster16p", new ItemEBWand4(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "wavemaster15p", new ItemEBWand5(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "wavemaster14p", new ItemEBWand6(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "wavemaster13p", new ItemEBWand7(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "wavemaster12p", new ItemEBWand8(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "wavemaster9p", new ItemEBWand9(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "wavemaster8p", new ItemEBWand10(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "wavemaster2p", new ItemEBWand11(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "shadowwarlock3p", new ItemEBWand12(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "shadowwarlock4p", new ItemEBWand13(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "shadowwarlock5p", new ItemEBWand14(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "shadowwarlock6p", new ItemEBWand15(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "macabredancer4p", new ItemEBWand16(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "macabredancer5p", new ItemEBWand17(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "shadowwarlock7p", new ItemEBWand18(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "harvestcleric6p", new ItemEBWand19(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "redwand1p", new ItemEBWand20(Tier.APPRENTICE, Element.SORCERY));
			registerItem(registry, "wavemaster26a", new ItemEBWand1(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "wavemaster21a", new ItemEBWand2(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "wavemaster19a", new ItemEBWand3(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "wavemaster16a", new ItemEBWand4(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "wavemaster15a", new ItemEBWand5(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "wavemaster14a", new ItemEBWand6(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "wavemaster13a", new ItemEBWand7(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "wavemaster12a", new ItemEBWand8(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "wavemaster9a", new ItemEBWand9(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "wavemaster8a", new ItemEBWand10(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "wavemaster2a", new ItemEBWand11(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "shadowwarlock3a", new ItemEBWand12(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "shadowwarlock4a", new ItemEBWand13(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "shadowwarlock5a", new ItemEBWand14(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "shadowwarlock6a", new ItemEBWand15(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "macabredancer4a", new ItemEBWand16(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "macabredancer5a", new ItemEBWand17(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "shadowwarlock7a", new ItemEBWand18(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "harvestcleric6a", new ItemEBWand19(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "redwand1a", new ItemEBWand20(Tier.ADVANCED, Element.SORCERY));
			registerItem(registry, "wavemaster26m", new ItemEBWand1(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "wavemaster21m", new ItemEBWand2(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "wavemaster19m", new ItemEBWand3(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "wavemaster16m", new ItemEBWand4(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "wavemaster15m", new ItemEBWand5(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "wavemaster14m", new ItemEBWand6(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "wavemaster13m", new ItemEBWand7(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "wavemaster12m", new ItemEBWand8(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "wavemaster9m", new ItemEBWand9(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "wavemaster8m", new ItemEBWand10(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "wavemaster2m", new ItemEBWand11(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "shadowwarlock3m", new ItemEBWand12(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "shadowwarlock4m", new ItemEBWand13(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "shadowwarlock5m", new ItemEBWand14(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "shadowwarlock6m", new ItemEBWand15(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "macabredancer4m", new ItemEBWand16(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "macabredancer5m", new ItemEBWand17(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "shadowwarlock7m", new ItemEBWand18(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "harvestcleric6m", new ItemEBWand19(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "redwand1m", new ItemEBWand20(Tier.MASTER, Element.SORCERY));
			registerItem(registry, "wavemaster42", new ItemEBWand1(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster38", new ItemEBWand2(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster74", new ItemEBWand3(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster43", new ItemEBWand4(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster57", new ItemEBWand5(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster61", new ItemEBWand6(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster62", new ItemEBWand7(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster69", new ItemEBWand8(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster71", new ItemEBWand9(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster24", new ItemEBWand10(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster1", new ItemEBWand11(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "shadowwarlock2", new ItemEBWand12(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster36", new ItemEBWand13(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster37", new ItemEBWand14(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster50", new ItemEBWand15(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster52", new ItemEBWand16(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster65", new ItemEBWand17(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster29", new ItemEBWand18(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster22", new ItemEBWand19(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster35", new ItemEBWand20(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster23", new ItemEBWand21(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster44", new ItemEBWand22(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster41", new ItemEBWand23(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster51", new ItemEBWand24(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster31", new ItemEBWand25(Tier.NOVICE, Element.MAGIC));
			registerItem(registry, "wavemaster42p", new ItemEBWand1(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster38p", new ItemEBWand2(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster74p", new ItemEBWand3(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster43p", new ItemEBWand4(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster57p", new ItemEBWand5(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster61p", new ItemEBWand6(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster62p", new ItemEBWand7(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster69p", new ItemEBWand8(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster71p", new ItemEBWand9(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster24p", new ItemEBWand10(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster1p", new ItemEBWand11(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "shadowwarlock2p", new ItemEBWand12(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster36p", new ItemEBWand13(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster37p", new ItemEBWand14(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster50p", new ItemEBWand15(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster52p", new ItemEBWand16(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster65p", new ItemEBWand17(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster29p", new ItemEBWand18(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster22p", new ItemEBWand19(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster35p", new ItemEBWand20(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster23p", new ItemEBWand21(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster44p", new ItemEBWand22(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster41p", new ItemEBWand23(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster51p", new ItemEBWand24(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster31p", new ItemEBWand25(Tier.APPRENTICE, Element.MAGIC));
			registerItem(registry, "wavemaster42a", new ItemEBWand1(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster38a", new ItemEBWand2(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster74a", new ItemEBWand3(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster43a", new ItemEBWand4(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster57a", new ItemEBWand5(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster61a", new ItemEBWand6(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster62a", new ItemEBWand7(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster69a", new ItemEBWand8(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster71a", new ItemEBWand9(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster24a", new ItemEBWand10(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster1a", new ItemEBWand11(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "shadowwarlock2a", new ItemEBWand12(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster36a", new ItemEBWand13(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster37a", new ItemEBWand14(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster50a", new ItemEBWand15(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster52a", new ItemEBWand16(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster65a", new ItemEBWand17(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster29a", new ItemEBWand18(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster22a", new ItemEBWand19(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster35a", new ItemEBWand20(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster23a", new ItemEBWand21(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster44a", new ItemEBWand22(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster41a", new ItemEBWand23(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster51a", new ItemEBWand24(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster31a", new ItemEBWand25(Tier.ADVANCED, Element.MAGIC));
			registerItem(registry, "wavemaster42m", new ItemEBWand1(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster38m", new ItemEBWand2(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster74m", new ItemEBWand3(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster43m", new ItemEBWand4(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster57m", new ItemEBWand5(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster61m", new ItemEBWand6(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster62m", new ItemEBWand7(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster69m", new ItemEBWand8(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster71m", new ItemEBWand9(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster24m", new ItemEBWand10(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster1m", new ItemEBWand11(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "shadowwarlock2m", new ItemEBWand12(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster36m", new ItemEBWand13(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster37m", new ItemEBWand14(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster50m", new ItemEBWand15(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster52m", new ItemEBWand16(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster65m", new ItemEBWand17(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster29m", new ItemEBWand18(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster22m", new ItemEBWand19(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster35m", new ItemEBWand20(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster23m", new ItemEBWand21(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster44m", new ItemEBWand22(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster41m", new ItemEBWand23(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster51m", new ItemEBWand24(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster31m", new ItemEBWand25(Tier.MASTER, Element.MAGIC));
			registerItem(registry, "wavemaster27", new ItemEBWand1(Tier.NOVICE, Element.ICE));
			registerItem(registry, "wavemaster17", new ItemEBWand2(Tier.NOVICE, Element.ICE));
			registerItem(registry, "wavemaster10", new ItemEBWand3(Tier.NOVICE, Element.ICE));
			registerItem(registry, "wavemaster6", new ItemEBWand4(Tier.NOVICE, Element.ICE));
			registerItem(registry, "wavemaster3", new ItemEBWand5(Tier.NOVICE, Element.ICE));
			registerItem(registry, "wavemaster58", new ItemEBWand6(Tier.NOVICE, Element.ICE));
			registerItem(registry, "wavemaster53", new ItemEBWand7(Tier.NOVICE, Element.ICE));
			registerItem(registry, "wavemaster66", new ItemEBWand8(Tier.NOVICE, Element.ICE));
			registerItem(registry, "harvestcleric8", new ItemEBWand9(Tier.NOVICE, Element.ICE));
			registerItem(registry, "wavemaster27p", new ItemEBWand1(Tier.APPRENTICE, Element.ICE));
			registerItem(registry, "wavemaster17p", new ItemEBWand2(Tier.APPRENTICE, Element.ICE));
			registerItem(registry, "wavemaster10p", new ItemEBWand3(Tier.APPRENTICE, Element.ICE));
			registerItem(registry, "wavemaster6p", new ItemEBWand4(Tier.APPRENTICE, Element.ICE));
			registerItem(registry, "wavemaster3p", new ItemEBWand5(Tier.APPRENTICE, Element.ICE));
			registerItem(registry, "wavemaster58p", new ItemEBWand6(Tier.APPRENTICE, Element.ICE));
			registerItem(registry, "wavemaster53p", new ItemEBWand7(Tier.APPRENTICE, Element.ICE));
			registerItem(registry, "wavemaster66p", new ItemEBWand8(Tier.APPRENTICE, Element.ICE));
			registerItem(registry, "harvestcleric8p", new ItemEBWand9(Tier.APPRENTICE, Element.ICE));
			registerItem(registry, "wavemaster27a", new ItemEBWand1(Tier.ADVANCED, Element.ICE));
			registerItem(registry, "wavemaster17a", new ItemEBWand2(Tier.ADVANCED, Element.ICE));
			registerItem(registry, "wavemaster10a", new ItemEBWand3(Tier.ADVANCED, Element.ICE));
			registerItem(registry, "wavemaster6a", new ItemEBWand4(Tier.ADVANCED, Element.ICE));
			registerItem(registry, "wavemaster3a", new ItemEBWand5(Tier.ADVANCED, Element.ICE));
			registerItem(registry, "wavemaster58a", new ItemEBWand6(Tier.ADVANCED, Element.ICE));
			registerItem(registry, "wavemaster53a", new ItemEBWand7(Tier.ADVANCED, Element.ICE));
			registerItem(registry, "wavemaster66a", new ItemEBWand8(Tier.ADVANCED, Element.ICE));
			registerItem(registry, "harvestcleric8a", new ItemEBWand9(Tier.ADVANCED, Element.ICE));
			registerItem(registry, "wavemaster27m", new ItemEBWand1(Tier.MASTER, Element.ICE));
			registerItem(registry, "wavemaster17m", new ItemEBWand2(Tier.MASTER, Element.ICE));
			registerItem(registry, "wavemaster10m", new ItemEBWand3(Tier.MASTER, Element.ICE));
			registerItem(registry, "wavemaster6m", new ItemEBWand4(Tier.MASTER, Element.ICE));
			registerItem(registry, "wavemaster3m", new ItemEBWand5(Tier.MASTER, Element.ICE));
			registerItem(registry, "wavemaster58m", new ItemEBWand6(Tier.MASTER, Element.ICE));
			registerItem(registry, "wavemaster53m", new ItemEBWand7(Tier.MASTER, Element.ICE));
			registerItem(registry, "wavemaster66m", new ItemEBWand8(Tier.MASTER, Element.ICE));
			registerItem(registry, "harvestcleric8m", new ItemEBWand9(Tier.MASTER, Element.ICE));
			registerItem(registry, "wavemaster60", new ItemEBWand1(Tier.NOVICE, Element.NECROMANCY));
			registerItem(registry, "wavemaster68", new ItemEBWand2(Tier.NOVICE, Element.NECROMANCY));
			registerItem(registry, "wavemaster28", new ItemEBWand3(Tier.NOVICE, Element.NECROMANCY));
			registerItem(registry, "wavemaster7", new ItemEBWand4(Tier.NOVICE, Element.NECROMANCY));
			registerItem(registry, "wavemaster40", new ItemEBWand5(Tier.NOVICE, Element.NECROMANCY));
			registerItem(registry, "wavemaster54", new ItemEBWand6(Tier.NOVICE, Element.NECROMANCY));
			registerItem(registry, "wavemaster55", new ItemEBWand7(Tier.NOVICE, Element.NECROMANCY));
			registerItem(registry, "shadowwarlock1", new ItemEBWand8(Tier.NOVICE, Element.NECROMANCY));
			registerItem(registry, "shadowwarlock8", new ItemEBWand9(Tier.NOVICE, Element.NECROMANCY));
			registerItem(registry, "macabredancer1", new ItemEBWand10(Tier.NOVICE, Element.NECROMANCY));
			registerItem(registry, "wavemaster60p", new ItemEBWand1(Tier.APPRENTICE, Element.NECROMANCY));
			registerItem(registry, "wavemaster68p", new ItemEBWand2(Tier.APPRENTICE, Element.NECROMANCY));
			registerItem(registry, "wavemaster28p", new ItemEBWand3(Tier.APPRENTICE, Element.NECROMANCY));
			registerItem(registry, "wavemaster7p", new ItemEBWand4(Tier.APPRENTICE, Element.NECROMANCY));
			registerItem(registry, "wavemaster40p", new ItemEBWand5(Tier.APPRENTICE, Element.NECROMANCY));
			registerItem(registry, "wavemaster54p", new ItemEBWand6(Tier.APPRENTICE, Element.NECROMANCY));
			registerItem(registry, "wavemaster55p", new ItemEBWand7(Tier.APPRENTICE, Element.NECROMANCY));
			registerItem(registry, "shadowwarlock1p", new ItemEBWand8(Tier.APPRENTICE, Element.NECROMANCY));
			registerItem(registry, "shadowwarlock8p", new ItemEBWand9(Tier.APPRENTICE, Element.NECROMANCY));
			registerItem(registry, "macabredancer1p", new ItemEBWand10(Tier.APPRENTICE, Element.NECROMANCY));
			registerItem(registry, "wavemaster60a", new ItemEBWand1(Tier.ADVANCED, Element.NECROMANCY));
			registerItem(registry, "wavemaster68a", new ItemEBWand2(Tier.ADVANCED, Element.NECROMANCY));
			registerItem(registry, "wavemaster28a", new ItemEBWand3(Tier.ADVANCED, Element.NECROMANCY));
			registerItem(registry, "wavemaster7a", new ItemEBWand4(Tier.ADVANCED, Element.NECROMANCY));
			registerItem(registry, "wavemaster40a", new ItemEBWand5(Tier.ADVANCED, Element.NECROMANCY));
			registerItem(registry, "wavemaster54a", new ItemEBWand6(Tier.ADVANCED, Element.NECROMANCY));
			registerItem(registry, "wavemaster55a", new ItemEBWand7(Tier.ADVANCED, Element.NECROMANCY));
			registerItem(registry, "shadowwarlock1a", new ItemEBWand8(Tier.ADVANCED, Element.NECROMANCY));
			registerItem(registry, "shadowwarlock8a", new ItemEBWand9(Tier.ADVANCED, Element.NECROMANCY));
			registerItem(registry, "macabredancer1a", new ItemEBWand10(Tier.ADVANCED, Element.NECROMANCY));
			registerItem(registry, "wavemaster60m", new ItemEBWand1(Tier.MASTER, Element.NECROMANCY));
			registerItem(registry, "wavemaster68m", new ItemEBWand2(Tier.MASTER, Element.NECROMANCY));
			registerItem(registry, "wavemaster28m", new ItemEBWand3(Tier.MASTER, Element.NECROMANCY));
			registerItem(registry, "wavemaster7m", new ItemEBWand4(Tier.MASTER, Element.NECROMANCY));
			registerItem(registry, "wavemaster40m", new ItemEBWand5(Tier.MASTER, Element.NECROMANCY));
			registerItem(registry, "wavemaster54m", new ItemEBWand6(Tier.MASTER, Element.NECROMANCY));
			registerItem(registry, "wavemaster55m", new ItemEBWand7(Tier.MASTER, Element.NECROMANCY));
			registerItem(registry, "shadowwarlock1m", new ItemEBWand8(Tier.MASTER, Element.NECROMANCY));
			registerItem(registry, "shadowwarlock8m", new ItemEBWand9(Tier.MASTER, Element.NECROMANCY));
			registerItem(registry, "macabredancer1m", new ItemEBWand10(Tier.MASTER, Element.NECROMANCY));
			registerItem(registry, "wavemaster59", new ItemEBWand1(Tier.NOVICE, Element.FIRE));
			registerItem(registry, "wavemaster70", new ItemEBWand2(Tier.NOVICE, Element.FIRE));
			registerItem(registry, "wavemaster25", new ItemEBWand3(Tier.NOVICE, Element.FIRE));
			registerItem(registry, "wavemaster18", new ItemEBWand4(Tier.NOVICE, Element.FIRE));
			registerItem(registry, "wavemaster11", new ItemEBWand5(Tier.NOVICE, Element.FIRE));
			registerItem(registry, "wavemaster32", new ItemEBWand6(Tier.NOVICE, Element.FIRE));
			registerItem(registry, "wavemaster39", new ItemEBWand7(Tier.NOVICE, Element.FIRE));
			registerItem(registry, "wavemaster67", new ItemEBWand8(Tier.NOVICE, Element.FIRE));
			registerItem(registry, "harvestcleric9", new ItemEBWand9(Tier.NOVICE, Element.FIRE));
			registerItem(registry, "wavemaster59p", new ItemEBWand1(Tier.APPRENTICE, Element.FIRE));
			registerItem(registry, "wavemaster70p", new ItemEBWand2(Tier.APPRENTICE, Element.FIRE));
			registerItem(registry, "wavemaster25p", new ItemEBWand3(Tier.APPRENTICE, Element.FIRE));
			registerItem(registry, "wavemaster18p", new ItemEBWand4(Tier.APPRENTICE, Element.FIRE));
			registerItem(registry, "wavemaster11p", new ItemEBWand5(Tier.APPRENTICE, Element.FIRE));
			registerItem(registry, "wavemaster32p", new ItemEBWand6(Tier.APPRENTICE, Element.FIRE));
			registerItem(registry, "wavemaster39p", new ItemEBWand7(Tier.APPRENTICE, Element.FIRE));
			registerItem(registry, "wavemaster67p", new ItemEBWand8(Tier.APPRENTICE, Element.FIRE));
			registerItem(registry, "harvestcleric9p", new ItemEBWand9(Tier.APPRENTICE, Element.FIRE));
			registerItem(registry, "wavemaster59a", new ItemEBWand1(Tier.ADVANCED, Element.FIRE));
			registerItem(registry, "wavemaster70a", new ItemEBWand2(Tier.ADVANCED, Element.FIRE));
			registerItem(registry, "wavemaster25a", new ItemEBWand3(Tier.ADVANCED, Element.FIRE));
			registerItem(registry, "wavemaster18a", new ItemEBWand4(Tier.ADVANCED, Element.FIRE));
			registerItem(registry, "wavemaster11a", new ItemEBWand5(Tier.ADVANCED, Element.FIRE));
			registerItem(registry, "wavemaster32a", new ItemEBWand6(Tier.ADVANCED, Element.FIRE));
			registerItem(registry, "wavemaster39a", new ItemEBWand7(Tier.ADVANCED, Element.FIRE));
			registerItem(registry, "wavemaster67a", new ItemEBWand8(Tier.ADVANCED, Element.FIRE));
			registerItem(registry, "harvestcleric9a", new ItemEBWand9(Tier.ADVANCED, Element.FIRE));
			registerItem(registry, "wavemaster59m", new ItemEBWand1(Tier.MASTER, Element.FIRE));
			registerItem(registry, "wavemaster70m", new ItemEBWand2(Tier.MASTER, Element.FIRE));
			registerItem(registry, "wavemaster25m", new ItemEBWand3(Tier.MASTER, Element.FIRE));
			registerItem(registry, "wavemaster18m", new ItemEBWand4(Tier.MASTER, Element.FIRE));
			registerItem(registry, "wavemaster11m", new ItemEBWand5(Tier.MASTER, Element.FIRE));
			registerItem(registry, "wavemaster32m", new ItemEBWand6(Tier.MASTER, Element.FIRE));
			registerItem(registry, "wavemaster39m", new ItemEBWand7(Tier.MASTER, Element.FIRE));
			registerItem(registry, "wavemaster67m", new ItemEBWand8(Tier.MASTER, Element.FIRE));
			registerItem(registry, "harvestcleric9m", new ItemEBWand9(Tier.MASTER, Element.FIRE));
			registerItem(registry, "wavemaster45", new ItemEBWand1(Tier.NOVICE, Element.EARTH));
			registerItem(registry, "wavemaster47", new ItemEBWand2(Tier.NOVICE, Element.EARTH));
			registerItem(registry, "harvestcleric2", new ItemEBWand3(Tier.NOVICE, Element.EARTH));
			registerItem(registry, "wavemaster56", new ItemEBWand4(Tier.NOVICE, Element.EARTH));
			registerItem(registry, "wavemaster46", new ItemEBWand5(Tier.NOVICE, Element.EARTH));
			registerItem(registry, "wavemaster48", new ItemEBWand6(Tier.NOVICE, Element.EARTH));
			registerItem(registry, "harvestcleric5", new ItemEBWand7(Tier.NOVICE, Element.EARTH));
			registerItem(registry, "macabredancer3", new ItemEBWand8(Tier.NOVICE, Element.EARTH));
			registerItem(registry, "harvestcleric7", new ItemEBWand9(Tier.NOVICE, Element.EARTH));
			registerItem(registry, "wavemaster45p", new ItemEBWand1(Tier.APPRENTICE, Element.EARTH));
			registerItem(registry, "wavemaster47p", new ItemEBWand2(Tier.APPRENTICE, Element.EARTH));
			registerItem(registry, "harvestcleric2p", new ItemEBWand3(Tier.APPRENTICE, Element.EARTH));
			registerItem(registry, "wavemaster56p", new ItemEBWand4(Tier.APPRENTICE, Element.EARTH));
			registerItem(registry, "wavemaster46p", new ItemEBWand5(Tier.APPRENTICE, Element.EARTH));
			registerItem(registry, "wavemaster48p", new ItemEBWand6(Tier.APPRENTICE, Element.EARTH));
			registerItem(registry, "harvestcleric5p", new ItemEBWand7(Tier.APPRENTICE, Element.EARTH));
			registerItem(registry, "macabredancer3p", new ItemEBWand8(Tier.APPRENTICE, Element.EARTH));
			registerItem(registry, "harvestcleric7p", new ItemEBWand9(Tier.APPRENTICE, Element.EARTH));
			registerItem(registry, "wavemaster45a", new ItemEBWand1(Tier.ADVANCED, Element.EARTH));
			registerItem(registry, "wavemaster47a", new ItemEBWand2(Tier.ADVANCED, Element.EARTH));
			registerItem(registry, "harvestcleric2a", new ItemEBWand3(Tier.ADVANCED, Element.EARTH));
			registerItem(registry, "wavemaster56a", new ItemEBWand4(Tier.ADVANCED, Element.EARTH));
			registerItem(registry, "wavemaster46a", new ItemEBWand5(Tier.ADVANCED, Element.EARTH));
			registerItem(registry, "wavemaster48a", new ItemEBWand6(Tier.ADVANCED, Element.EARTH));
			registerItem(registry, "harvestcleric5a", new ItemEBWand7(Tier.ADVANCED, Element.EARTH));
			registerItem(registry, "macabredancer3a", new ItemEBWand8(Tier.ADVANCED, Element.EARTH));
			registerItem(registry, "harvestcleric7a", new ItemEBWand9(Tier.ADVANCED, Element.EARTH));
			registerItem(registry, "wavemaster45m", new ItemEBWand1(Tier.MASTER, Element.EARTH));
			registerItem(registry, "wavemaster47m", new ItemEBWand2(Tier.MASTER, Element.EARTH));
			registerItem(registry, "harvestcleric2m", new ItemEBWand3(Tier.MASTER, Element.EARTH));
			registerItem(registry, "wavemaster56m", new ItemEBWand4(Tier.MASTER, Element.EARTH));
			registerItem(registry, "wavemaster46m", new ItemEBWand5(Tier.MASTER, Element.EARTH));
			registerItem(registry, "wavemaster48m", new ItemEBWand6(Tier.MASTER, Element.EARTH));
			registerItem(registry, "harvestcleric5m", new ItemEBWand7(Tier.MASTER, Element.EARTH));
			registerItem(registry, "macabredancer3m", new ItemEBWand8(Tier.MASTER, Element.EARTH));
			registerItem(registry, "harvestcleric7m", new ItemEBWand9(Tier.MASTER, Element.EARTH));
			registerItem(registry, "wavemaster72", new ItemEBWand1(Tier.NOVICE, Element.LIGHTNING));
			registerItem(registry, "wavemaster73", new ItemEBWand2(Tier.NOVICE, Element.LIGHTNING));
			registerItem(registry, "harvestcleric1", new ItemEBWand3(Tier.NOVICE, Element.LIGHTNING));
			registerItem(registry, "wavemaster20", new ItemEBWand4(Tier.NOVICE, Element.LIGHTNING));
			registerItem(registry, "wavemaster34", new ItemEBWand5(Tier.NOVICE, Element.LIGHTNING));
			registerItem(registry, "shadowwarlock10", new ItemEBWand6(Tier.NOVICE, Element.LIGHTNING));
			registerItem(registry, "wavemaster72p", new ItemEBWand1(Tier.APPRENTICE, Element.LIGHTNING));
			registerItem(registry, "wavemaster73p", new ItemEBWand2(Tier.APPRENTICE, Element.LIGHTNING));
			registerItem(registry, "harvestcleric1p", new ItemEBWand3(Tier.APPRENTICE, Element.LIGHTNING));
			registerItem(registry, "wavemaster20p", new ItemEBWand4(Tier.APPRENTICE, Element.LIGHTNING));
			registerItem(registry, "wavemaster34p", new ItemEBWand5(Tier.APPRENTICE, Element.LIGHTNING));
			registerItem(registry, "shadowwarlock10p", new ItemEBWand6(Tier.APPRENTICE, Element.LIGHTNING));
			registerItem(registry, "wavemaster72a", new ItemEBWand1(Tier.ADVANCED, Element.LIGHTNING));
			registerItem(registry, "wavemaster73a", new ItemEBWand2(Tier.ADVANCED, Element.LIGHTNING));
			registerItem(registry, "harvestcleric1a", new ItemEBWand3(Tier.ADVANCED, Element.LIGHTNING));
			registerItem(registry, "wavemaster20a", new ItemEBWand4(Tier.ADVANCED, Element.LIGHTNING));
			registerItem(registry, "wavemaster34a", new ItemEBWand5(Tier.ADVANCED, Element.LIGHTNING));
			registerItem(registry, "shadowwarlock10a", new ItemEBWand6(Tier.ADVANCED, Element.LIGHTNING));
			registerItem(registry, "wavemaster72m", new ItemEBWand1(Tier.MASTER, Element.LIGHTNING));
			registerItem(registry, "wavemaster73m", new ItemEBWand2(Tier.MASTER, Element.LIGHTNING));
			registerItem(registry, "harvestcleric1m", new ItemEBWand3(Tier.MASTER, Element.LIGHTNING));
			registerItem(registry, "wavemaster20m", new ItemEBWand4(Tier.MASTER, Element.LIGHTNING));
			registerItem(registry, "wavemaster34m", new ItemEBWand5(Tier.MASTER, Element.LIGHTNING));
			registerItem(registry, "shadowwarlock10m", new ItemEBWand6(Tier.MASTER, Element.LIGHTNING));
			registerItem(registry, "wavemaster49", new ItemEBWand1(Tier.NOVICE, Element.HEALING));
			registerItem(registry, "wavemaster63", new ItemEBWand2(Tier.NOVICE, Element.HEALING));
			registerItem(registry, "wavemaster64", new ItemEBWand3(Tier.NOVICE, Element.HEALING));
			registerItem(registry, "wavemaster30", new ItemEBWand4(Tier.NOVICE, Element.HEALING));
			registerItem(registry, "wavemaster4", new ItemEBWand5(Tier.NOVICE, Element.HEALING));
			registerItem(registry, "macabredancer2", new ItemEBWand6(Tier.NOVICE, Element.HEALING));
			registerItem(registry, "wavemaster5", new ItemEBWand7(Tier.NOVICE, Element.HEALING));
			registerItem(registry, "harvestcleric4", new ItemEBWand8(Tier.NOVICE, Element.HEALING));
			registerItem(registry, "harvestcleric3", new ItemEBWand9(Tier.NOVICE, Element.HEALING));
			registerItem(registry, "wavemaster33", new ItemEBWand10(Tier.NOVICE, Element.HEALING));
			registerItem(registry, "shadowwarlock11", new ItemEBWand11(Tier.NOVICE, Element.HEALING));
			registerItem(registry, "shadowwarlock12", new ItemEBWand12(Tier.NOVICE, Element.HEALING));
			registerItem(registry, "shadowwarlock13", new ItemEBWand13(Tier.NOVICE, Element.HEALING));
			registerItem(registry, "shadowwarlock14", new ItemEBWand14(Tier.NOVICE, Element.HEALING));
			registerItem(registry, "shadowwarlock9", new ItemEBWand15(Tier.NOVICE, Element.HEALING));
			registerItem(registry, "harvestcleric10", new ItemEBWand16(Tier.NOVICE, Element.HEALING));
			registerItem(registry, "wavemaster49p", new ItemEBWand1(Tier.APPRENTICE, Element.HEALING));
			registerItem(registry, "wavemaster63p", new ItemEBWand2(Tier.APPRENTICE, Element.HEALING));
			registerItem(registry, "wavemaster64p", new ItemEBWand3(Tier.APPRENTICE, Element.HEALING));
			registerItem(registry, "wavemaster30p", new ItemEBWand4(Tier.APPRENTICE, Element.HEALING));
			registerItem(registry, "wavemaster4p", new ItemEBWand5(Tier.APPRENTICE, Element.HEALING));
			registerItem(registry, "macabredancer2p", new ItemEBWand6(Tier.APPRENTICE, Element.HEALING));
			registerItem(registry, "wavemaster5p", new ItemEBWand7(Tier.APPRENTICE, Element.HEALING));
			registerItem(registry, "harvestcleric4p", new ItemEBWand8(Tier.APPRENTICE, Element.HEALING));
			registerItem(registry, "harvestcleric3p", new ItemEBWand9(Tier.APPRENTICE, Element.HEALING));
			registerItem(registry, "wavemaster33p", new ItemEBWand10(Tier.APPRENTICE, Element.HEALING));
			registerItem(registry, "shadowwarlock11p", new ItemEBWand11(Tier.APPRENTICE, Element.HEALING));
			registerItem(registry, "shadowwarlock12p", new ItemEBWand12(Tier.APPRENTICE, Element.HEALING));
			registerItem(registry, "shadowwarlock13p", new ItemEBWand13(Tier.APPRENTICE, Element.HEALING));
			registerItem(registry, "shadowwarlock14p", new ItemEBWand14(Tier.APPRENTICE, Element.HEALING));
			registerItem(registry, "shadowwarlock9p", new ItemEBWand15(Tier.APPRENTICE, Element.HEALING));
			registerItem(registry, "harvestcleric10p", new ItemEBWand16(Tier.APPRENTICE, Element.HEALING));
			registerItem(registry, "wavemaster49a", new ItemEBWand1(Tier.ADVANCED, Element.HEALING));
			registerItem(registry, "wavemaster63a", new ItemEBWand2(Tier.ADVANCED, Element.HEALING));
			registerItem(registry, "wavemaster64a", new ItemEBWand3(Tier.ADVANCED, Element.HEALING));
			registerItem(registry, "wavemaster30a", new ItemEBWand4(Tier.ADVANCED, Element.HEALING));
			registerItem(registry, "wavemaster4a", new ItemEBWand5(Tier.ADVANCED, Element.HEALING));
			registerItem(registry, "macabredancer2a", new ItemEBWand6(Tier.ADVANCED, Element.HEALING));
			registerItem(registry, "wavemaster5a", new ItemEBWand7(Tier.ADVANCED, Element.HEALING));
			registerItem(registry, "harvestcleric4a", new ItemEBWand8(Tier.ADVANCED, Element.HEALING));
			registerItem(registry, "harvestcleric3a", new ItemEBWand9(Tier.ADVANCED, Element.HEALING));
			registerItem(registry, "wavemaster33a", new ItemEBWand10(Tier.ADVANCED, Element.HEALING));
			registerItem(registry, "shadowwarlock11a", new ItemEBWand11(Tier.ADVANCED, Element.HEALING));
			registerItem(registry, "shadowwarlock12a", new ItemEBWand12(Tier.ADVANCED, Element.HEALING));
			registerItem(registry, "shadowwarlock13a", new ItemEBWand13(Tier.ADVANCED, Element.HEALING));
			registerItem(registry, "shadowwarlock14a", new ItemEBWand14(Tier.ADVANCED, Element.HEALING));
			registerItem(registry, "shadowwarlock9a", new ItemEBWand15(Tier.ADVANCED, Element.HEALING));
			registerItem(registry, "harvestcleric10a", new ItemEBWand16(Tier.ADVANCED, Element.HEALING));
			registerItem(registry, "wavemaster49m", new ItemEBWand1(Tier.MASTER, Element.HEALING));
			registerItem(registry, "wavemaster63m", new ItemEBWand2(Tier.MASTER, Element.HEALING));
			registerItem(registry, "wavemaster64m", new ItemEBWand3(Tier.MASTER, Element.HEALING));
			registerItem(registry, "wavemaster30m", new ItemEBWand4(Tier.MASTER, Element.HEALING));
			registerItem(registry, "wavemaster4m", new ItemEBWand5(Tier.MASTER, Element.HEALING));
			registerItem(registry, "macabredancer2m", new ItemEBWand6(Tier.MASTER, Element.HEALING));
			registerItem(registry, "wavemaster5m", new ItemEBWand7(Tier.MASTER, Element.HEALING));
			registerItem(registry, "harvestcleric4m", new ItemEBWand8(Tier.MASTER, Element.HEALING));
			registerItem(registry, "harvestcleric3m", new ItemEBWand9(Tier.MASTER, Element.HEALING));
			registerItem(registry, "wavemaster33m", new ItemEBWand10(Tier.MASTER, Element.HEALING));
			registerItem(registry, "shadowwarlock11m", new ItemEBWand11(Tier.MASTER, Element.HEALING));
			registerItem(registry, "shadowwarlock12m", new ItemEBWand12(Tier.MASTER, Element.HEALING));
			registerItem(registry, "shadowwarlock13m", new ItemEBWand13(Tier.MASTER, Element.HEALING));
			registerItem(registry, "shadowwarlock14m", new ItemEBWand14(Tier.MASTER, Element.HEALING));
			registerItem(registry, "shadowwarlock9m", new ItemEBWand15(Tier.MASTER, Element.HEALING));
			registerItem(registry, "harvestcleric10m", new ItemEBWand16(Tier.MASTER, Element.HEALING));
			DotHackMod.LOGGER.info("Registered with EB");
		} else if (Loader.isModLoaded("mmorpg")) {
			registerItem(registry, "harvestcleric1", new ItemMSStaff().setCreativeTab(DotHackTabs.tabw), true);
			for (int i = 2; i <= 10; i++)
				registerItem(registry, "harvestcleric" + i, new ItemMSStaff().setCreativeTab(DotHackTabs.tabw));
			registerItem(registry, "macabredancer1", new ItemMSStaff().setCreativeTab(DotHackTabs.tabw), true);
			for (int i = 2; i <= 5; i++)
				registerItem(registry, "macabredancer" + i, new ItemMSStaff().setCreativeTab(DotHackTabs.tabw));
			registerItem(registry, "shadowwarlock1", new ItemMSStaff().setCreativeTab(DotHackTabs.tabw), true);
			for (int i = 2; i <= 14; i++)
				registerItem(registry, "shadowwarlock" + i, new ItemMSStaff().setCreativeTab(DotHackTabs.tabw));
			registerItem(registry, "wavemaster1", new ItemMSStaff().setCreativeTab(DotHackTabs.tabw), true);
			for (int i = 2; i <= 74; i++)
				registerItem(registry, "wavemaster" + i, new ItemMSStaff().setCreativeTab(DotHackTabs.tabw));
			registerItem(registry, "redwand1", new ItemMSStaff().setCreativeTab(DotHackTabs.tabw));
			DotHackMod.LOGGER.info("Registered with M&S");
		} else {
			registerItem(registry, "harvestcleric1", new ItemBow().setCreativeTab(DotHackTabs.tabw), true);
			for (int i = 2; i <= 9; i++)
				registerItem(registry, "harvestcleric" + i, new ItemBow().setCreativeTab(DotHackTabs.tabw));
			registerItem(registry, "macabredancer1", new ItemBow().setCreativeTab(DotHackTabs.tabw), true);
			for (int i = 2; i <= 5; i++)
				registerItem(registry, "macabredancer" + i, new ItemBow().setCreativeTab(DotHackTabs.tabw));
			registerItem(registry, "shadowwarlock1", new ItemBow().setCreativeTab(DotHackTabs.tabw), true);
			for (int i = 2; i <= 14; i++)
				registerItem(registry, "shadowwarlock" + i, new ItemBow().setCreativeTab(DotHackTabs.tabw));
			registerItem(registry, "wavemaster1", new ItemBow().setCreativeTab(DotHackTabs.tabw), true);
			for (int i = 2; i <= 74; i++)
				registerItem(registry, "wavemaster" + i, new ItemBow().setCreativeTab(DotHackTabs.tabw));
			registerItem(registry, "redwand1", new ItemBow().setCreativeTab(DotHackTabs.tabw));
			DotHackMod.LOGGER.info("Registered without EB or M&S");
		}
		if (Loader.isModLoaded("mmorpg")) {
			registerItem(registry, "dualgunner1", new ItemBow().setCreativeTab(DotHackTabs.tabdg), true);
			for (int i = 2; i <= 4; i++)
				registerItem(registry, "dualgunner" + i, new ItemBow().setCreativeTab(DotHackTabs.tabdg));
			registerItem(registry, "steamgunner1", new ItemBow().setCreativeTab(DotHackTabs.tabsg), true);
			for (int i = 2; i <= 18; i++)
				registerItem(registry, "steamgunner" + i, new ItemBow().setCreativeTab(DotHackTabs.tabsg));
			DotHackMod.LOGGER.info("Registered with M&S");
		} else {
			registerItem(registry, "dualgunner1", new ItemBow().setCreativeTab(DotHackTabs.tabdg), true);
			for (int i = 2; i <= 4; i++)
				registerItem(registry, "dualgunner" + i, new ItemBow().setCreativeTab(DotHackTabs.tabdg));
			registerItem(registry, "steamgunner1", new ItemBow().setCreativeTab(DotHackTabs.tabsg), true);
			for (int i = 2; i <= 18; i++)
				registerItem(registry, "steamgunner" + i, new ItemBow().setCreativeTab(DotHackTabs.tabsg));
			DotHackMod.LOGGER.info("Registered without M&S");
		}

	}

}
