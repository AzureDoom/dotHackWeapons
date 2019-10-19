package mod.azure.rcraft.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.collect.ImmutableList;

import electroblob.wizardry.constants.Element;
import electroblob.wizardry.constants.Tier;
import electroblob.wizardry.item.ItemWand;
import mod.azure.rcraft.items.base.ItemBase;
import mod.azure.rcraft.items.base.ItemBaseGun;
import mod.azure.rcraft.items.base.ItemBaseSword;
import mod.azure.rcraft.items.baubles.BaublesHeadItem;
import mod.azure.rcraft.items.ebwizadry.ItemEBWand;
import mod.azure.rcraft.items.mineandslash.ItemMSBow;
import mod.azure.rcraft.items.mineandslash.ItemMSStaff;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class Register {

	private static final Logger LOGGER = LogManager.getLogger();

	private static final List<String> EARTH = ImmutableList.of("wavemaster45", "wavemaster47", "harvestcleric2",
			"wavemaster56", "wavemaster46", "wavemaster48", "harvestcleric5", "macabredancer3", "harvestcleric7");

	private static final List<String> LIGHTNING = ImmutableList.of("wavemaster72", "wavemaster73", "harvestcleric1",
			"wavemaster20", "wavemaster34", "shadowwarlock10");

	private static final List<String> HEALING = ImmutableList.of("wavemaster49", "wavemaster63", "wavemaster64",
			"wavemaster30", "wavemaster4", "macabredancer2", "wavemaster5", "harvestcleric4", "harvestcleric3",
			"wavemaster33", "shadowwarlock11", "shadowwarlock12", "shadowwarlock13", "shadowwarlock14",
			"shadowwarlock9", "harvestcleric10");

	private static final List<String> SORCERY = ImmutableList.of("wavemaster26", "wavemaster21", "wavemaster19",
			"wavemaster16", "wavemaster15", "wavemaster14", "wavemaster13", "wavemaster12", "wavemaster9",
			"wavemaster8", "wavemaster2", "shadowwarlock3", "shadowwarlock4", "shadowwarlock5", "shadowwarlock6",
			"macabredancer4", "macabredancer5", "shadowwarlock7", "harvestcleric6");

	private static final List<String> ICE = ImmutableList.of("wavemaster27", "wavemaster17", "wavemaster10",
			"wavemaster6", "wavemaster3", "wavemaster58", "wavemaster53", "wavemaster66", "harvestcleric8");

	private static final List<String> FIRE = ImmutableList.of("wavemaster59", "wavemaster70", "wavemaster25",
			"wavemaster18", "wavemaster11", "wavemaster32", "wavemaster39", "wavemaster67", "harvestcleric9");

	private static final List<String> NECROMANCY = ImmutableList.of("wavemaster60", "wavemaster68", "wavemaster28",
			"wavemaster7", "wavemaster40", "wavemaster54", "wavemaster55", "shadowwarlock1", "shadowwarlock8",
			"macabredancer1");

	private static final List<String> MAGIC = ImmutableList.of("wavemaster42", "wavemaster38", "wavemaster74",
			"wavemaster43", "wavemaster57", "wavemaster61", "wavemaster62", "wavemaster69", "wavemaster71",
			"wavemaster24", "wavemaster1", "shadowwarlock2", "wavemaster36", "wavemaster37", "wavemaster50",
			"wavemaster52", "wavemaster65", "wavemaster29", "wavemaster22", "wavemaster35", "wavemaster23",
			"wavemaster44", "wavemaster41", "wavemaster51", "wavemaster31");

	public static Item[] itemList;
	public static NonNullList<ItemStack> variantList;
	static {
		List<Item> items = new ArrayList<Item>();
		for (int i = 1; i <= 19; i++)
			items.add(new ItemBaseSword("bladebrandier" + i, (3 + i) / 3));
		for (int i = 1; i <= 25; i++)
			items.add(new ItemBaseSword("dualswords" + i, (2 + i) / 5));
		for (int i = 1; i <= 20; i++)
			items.add(new ItemBaseSword("edgepunisher" + i, (5 + i) / 2));
		for (int i = 1; i <= 9; i++)
			items.add(new ItemBaseSword("flickreaper" + i, (20 + i) / 3));
		for (int i = 1; i <= 9; i++)
			items.add(new ItemBaseSword("lordpartizan" + i, (16 + i) / 2));
		for (int i = 1; i <= 11; i++)
			items.add(new ItemBaseSword("tribalgrappler" + i, (20 + i) / 5));
		for (int i = 1; i <= 75; i++)
			items.add(new ItemBaseSword("blademaster" + i, (3 + i) / 10));
		for (int i = 1; i <= 73; i++)
			items.add(new ItemBaseSword("heavyaxeman" + i, (11 + i) / 7));
		for (int i = 1; i <= 54; i++)
			items.add(new ItemBaseSword("heavyblade" + i, (81 + i) / 15));
		for (int i = 1; i <= 41; i++)
			items.add(new ItemBaseSword("heavybladev" + i, (94 + i) / 15));
		for (int i = 1; i <= 71; i++)
			items.add(new ItemBaseSword("longarm" + i, (4 + i) / 9));
		for (int i = 1; i <= 81; i++)
			items.add(new ItemBaseSword("twinblade" + i, (2 + i) / 15));
		LOGGER.debug("Registered normal items");
		if (Loader.isModLoaded("baubles")) {
			items.add(new BaublesHeadItem("datadrain"));
			LOGGER.debug("Registered with Baubles");
		} else {
			items.add(new ItemBase("datadrain"));
			LOGGER.debug("Registered without Baubles");
		}
		if (Loader.isModLoaded("ebwizardry")) {
			for (String a : EARTH) {
				items.add(new ItemEBWand(a + "", Tier.NOVICE, Element.EARTH));
				;
				items.add(new ItemEBWand(a + "p", Tier.APPRENTICE, Element.EARTH));
				;
				items.add(new ItemEBWand(a + "a", Tier.ADVANCED, Element.EARTH));
				;
				items.add(new ItemEBWand(a + "m", Tier.MASTER, Element.EARTH));
				;
			}
			for (String b : LIGHTNING) {
				items.add(new ItemEBWand(b + "", Tier.NOVICE, Element.LIGHTNING));
				;
				items.add(new ItemEBWand(b + "p", Tier.APPRENTICE, Element.LIGHTNING));
				;
				items.add(new ItemEBWand(b + "a", Tier.ADVANCED, Element.LIGHTNING));
				;
				items.add(new ItemEBWand(b + "m", Tier.MASTER, Element.LIGHTNING));
				;
			}
			for (String c : HEALING) {
				items.add(new ItemEBWand(c + "", Tier.NOVICE, Element.HEALING));
				;
				items.add(new ItemEBWand(c + "p", Tier.APPRENTICE, Element.HEALING));
				;
				items.add(new ItemEBWand(c + "a", Tier.ADVANCED, Element.HEALING));
				;
				items.add(new ItemEBWand(c + "m", Tier.MASTER, Element.HEALING));
				;
			}
			for (String d : SORCERY) {
				items.add(new ItemEBWand(d + "", Tier.NOVICE, Element.SORCERY));
				;
				items.add(new ItemEBWand(d + "p", Tier.APPRENTICE, Element.SORCERY));
				;
				items.add(new ItemEBWand(d + "a", Tier.ADVANCED, Element.SORCERY));
				;
				items.add(new ItemEBWand(d + "m", Tier.MASTER, Element.SORCERY));
				;
			}
			for (String e : ICE) {
				items.add(new ItemEBWand(e + "", Tier.NOVICE, Element.ICE));
				;
				items.add(new ItemEBWand(e + "p", Tier.APPRENTICE, Element.ICE));
				;
				items.add(new ItemEBWand(e + "a", Tier.ADVANCED, Element.ICE));
				;
				items.add(new ItemEBWand(e + "m", Tier.MASTER, Element.ICE));
				;
			}
			for (String f : FIRE) {
				items.add(new ItemEBWand(f + "", Tier.NOVICE, Element.FIRE));
				;
				items.add(new ItemEBWand(f + "p", Tier.APPRENTICE, Element.FIRE));
				;
				items.add(new ItemEBWand(f + "a", Tier.ADVANCED, Element.FIRE));
				;
				items.add(new ItemEBWand(f + "m", Tier.MASTER, Element.FIRE));
				;
			}
			for (String h : NECROMANCY) {
				items.add(new ItemEBWand(h + "", Tier.NOVICE, Element.NECROMANCY));
				;
				items.add(new ItemEBWand(h + "p", Tier.APPRENTICE, Element.NECROMANCY));
				;
				items.add(new ItemEBWand(h + "a", Tier.ADVANCED, Element.NECROMANCY));
				;
				items.add(new ItemEBWand(h + "m", Tier.MASTER, Element.NECROMANCY));
				;
			}
			for (String i : MAGIC) {
				items.add(new ItemEBWand(i + "", Tier.NOVICE, Element.MAGIC));
				;
				items.add(new ItemEBWand(i + "p", Tier.APPRENTICE, Element.MAGIC));
				;
				items.add(new ItemEBWand(i + "a", Tier.ADVANCED, Element.MAGIC));
				;
				items.add(new ItemEBWand(i + "m", Tier.MASTER, Element.MAGIC));
				;
			}
			items.add(new ItemEBWand("redwand1", Tier.MASTER, Element.SORCERY));
			;
			LOGGER.debug("Registered with EB");
		} else if (Loader.isModLoaded("mmorpg")) {
			for (int ag = 1; ag <= 10; ag++)
				items.add(new ItemMSStaff("harvestcleric" + ag));
			for (int ah = 1; ah <= 5; ah++)
				items.add(new ItemMSStaff("macabredancer" + ah));
			for (int ai = 1; ai <= 14; ai++)
				items.add(new ItemMSStaff("shadowwarlock" + ai));
			for (int aj = 1; aj <= 74; aj++)
				items.add(new ItemMSStaff("wavemaster" + aj));
			items.add(new ItemMSStaff("redwand1"));
			LOGGER.debug("Registered with M&S");
		} else {
			for (int i = 1; i <= 9; i++)
				items.add(new ItemBaseGun("harvestcleric" + i));
			for (int i = 1; i <= 5; i++)
				items.add(new ItemBaseGun("macabredancer" + i));
			for (int i = 1; i <= 14; i++)
				items.add(new ItemBaseGun("shadowwarlock" + i));
			for (int i = 1; i <= 74; i++)
				items.add(new ItemBaseGun("wavemaster" + i));
			items.add(new ItemBaseGun("redwand1"));
			LOGGER.debug("Registered without EB or M&S");
		}
		if (Loader.isModLoaded("mmorpg")) {
			for (int ak = 1; ak <= 4; ak++)
				items.add(new ItemMSBow("dualgunner" + ak));
			for (int al = 1; al <= 18; al++)
				items.add(new ItemMSBow("steamgunner" + al));
			LOGGER.debug("Registered with M&S");
		} else {
			for (int i = 1; i <= 4; i++)
				items.add(new ItemBaseGun("dualgunner" + i));
			for (int i = 1; i <= 18; i++)
				items.add(new ItemBaseGun("steamgunner" + i));
			LOGGER.debug("Registered without M&S");
		}
		itemList = items.toArray(new Item[items.size()]);
	}
}