package mod.azure.rcraft.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.collect.ImmutableList;

import electroblob.wizardry.constants.Element;
import electroblob.wizardry.constants.Tier;
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
import net.minecraftforge.fml.common.Loader;

public class Register {

	private static final Logger LOGGER = LogManager.getLogger();

	private static final List<String> NOVICE_EARTH = ImmutableList.of("wavemaster45", "wavemaster47", "harvestcleric2");

	private static final List<String> NOVICE_LIGHTNING = ImmutableList.of("wavemaster72", "wavemaster73",
			"harvestcleric1");

	private static final List<String> NOVICE_HEALING = ImmutableList.of("wavemaster49", "wavemaster63", "wavemaster64",
			"wavemaster30", "wavemaster4", "macabredancer2", "wavemaster5");

	private static final List<String> NOVICE_SORCERY = ImmutableList.of("wavemaster26", "wavemaster21", "wavemaster19",
			"wavemaster16", "wavemaster15", "wavemaster14", "wavemaster13", "wavemaster12", "wavemaster9",
			"wavemaster8", "wavemaster2", "shadowwarlock3");

	private static final List<String> NOVICE_ICE = ImmutableList.of("wavemaster27", "wavemaster17", "wavemaster10",
			"wavemaster6", "wavemaster3");

	private static final List<String> NOVICE_FIRE = ImmutableList.of("wavemaster59", "wavemaster70", "wavemaster25",
			"wavemaster18", "wavemaster11");

	private static final List<String> NOVICE_NECROMANCY = ImmutableList.of("wavemaster60", "wavemaster68",
			"wavemaster28", "wavemaster7");

	private static final List<String> NOVICE_MAGIC = ImmutableList.of("wavemaster42", "wavemaster38", "wavemaster74",
			"wavemaster43", "wavemaster57", "wavemaster61", "wavemaster62", "wavemaster69", "wavemaster71",
			"wavemaster24", "wavemaster1", "shadowwarlock2");

	private static final List<String> APPRENTICE_EARTH = ImmutableList.of("wavemaster46", "wavemaster48");

	private static final List<String> APPRENTICE_LIGHTNING = ImmutableList.of("wavemaster20");

	private static final List<String> APPRENTICE_HEALING = ImmutableList.of("harvestcleric4", "harvestcleric3");

	private static final List<String> APPRENTICE_SORCERY = ImmutableList.of("shadowwarlock4", "shadowwarlock5");

	private static final List<String> APPRENTICE_ICE = ImmutableList.of("wavemaster58");

	private static final List<String> APPRENTICE_FIRE = ImmutableList.of("wavemaster32");

	private static final List<String> APPRENTICE_NECROMANCY = ImmutableList.of("wavemaster40", "wavemaster54");

	private static final List<String> APPRENTICE_MAGIC = ImmutableList.of("wavemaster36", "wavemaster37",
			"wavemaster50", "wavemaster52", "wavemaster65", "wavemaster29", "wavemaster22");

	private static final List<String> ADVANCED_EARTH = ImmutableList.of("harvestcleric5", "macabredancer3");

	private static final List<String> ADVANCED_LIGHTNING = ImmutableList.of("wavemaster34");

	private static final List<String> ADVANCED_HEALING = ImmutableList.of("wavemaster33", "shadowwarlock11",
			"shadowwarlock12", "shadowwarlock13", "shadowwarlock14");

	private static final List<String> ADVANCED_SORCERY = ImmutableList.of("shadowwarlock6", "macabredancer4",
			"macabredancer5");

	private static final List<String> ADVANCED_ICE = ImmutableList.of("wavemaster53", "wavemaster66");

	private static final List<String> ADVANCED_FIRE = ImmutableList.of("wavemaster39", "wavemaster67");

	private static final List<String> ADVANCED_NECROMANCY = ImmutableList.of("wavemaster55", "shadowwarlock1");

	private static final List<String> ADVANCED_MAGIC = ImmutableList.of("wavemaster35", "wavemaster23");

	private static final List<String> MASTER_EARTH = ImmutableList.of("harvestcleric7");

	private static final List<String> MASTER_LIGHTNING = ImmutableList.of("shadowwarlock10");

	private static final List<String> MASTER_HEALING = ImmutableList.of("shadowwarlock9", "harvestcleric10");

	private static final List<String> MASTER_SORCERY = ImmutableList.of("shadowwarlock7", "harvestcleric6", "redwand1");

	private static final List<String> MASTER_ICE = ImmutableList.of("harvestcleric8");

	private static final List<String> MASTER_FIRE = ImmutableList.of("harvestcleric9");

	private static final List<String> MASTER_NECROMANCY = ImmutableList.of("shadowwarlock8", "macabredancer1");

	private static final List<String> MASTER_MAGIC = ImmutableList.of("wavemaster44", "wavemaster41", "wavemaster51",
			"wavemaster31");

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
			for (String a : NOVICE_EARTH) {
				items.add(new ItemEBWand(a, Tier.NOVICE, Element.EARTH));
			}
			;
			for (String b : NOVICE_LIGHTNING) {
				items.add(new ItemEBWand(b, Tier.NOVICE, Element.LIGHTNING));
			}
			;
			for (String c : NOVICE_HEALING) {
				items.add(new ItemEBWand(c, Tier.NOVICE, Element.HEALING));
			}
			;
			for (String d : NOVICE_SORCERY) {
				items.add(new ItemEBWand(d, Tier.NOVICE, Element.SORCERY));
			}
			;
			for (String e : NOVICE_ICE) {
				items.add(new ItemEBWand(e, Tier.NOVICE, Element.ICE));
			}
			;
			for (String f : NOVICE_FIRE) {
				items.add(new ItemEBWand(f, Tier.NOVICE, Element.FIRE));
			}
			;
			for (String g : NOVICE_NECROMANCY) {
				items.add(new ItemEBWand(g, Tier.NOVICE, Element.NECROMANCY));
			}
			;
			for (String h : NOVICE_MAGIC) {
				items.add(new ItemEBWand(h, Tier.NOVICE, Element.MAGIC));
			}
			;
			for (String i : APPRENTICE_EARTH) {
				items.add(new ItemEBWand(i, Tier.APPRENTICE, Element.EARTH));
			}
			;
			for (String j : APPRENTICE_LIGHTNING) {
				items.add(new ItemEBWand(j, Tier.APPRENTICE, Element.LIGHTNING));
			}
			;
			for (String k : APPRENTICE_HEALING) {
				items.add(new ItemEBWand(k, Tier.APPRENTICE, Element.HEALING));
			}
			;
			for (String l : APPRENTICE_SORCERY) {
				items.add(new ItemEBWand(l, Tier.APPRENTICE, Element.SORCERY));
			}
			;
			for (String m : APPRENTICE_ICE) {
				items.add(new ItemEBWand(m, Tier.APPRENTICE, Element.ICE));
			}
			;
			for (String n : APPRENTICE_FIRE) {
				items.add(new ItemEBWand(n, Tier.APPRENTICE, Element.FIRE));
			}
			;
			for (String o : APPRENTICE_NECROMANCY) {
				items.add(new ItemEBWand(o, Tier.APPRENTICE, Element.NECROMANCY));
			}
			;
			for (String q : APPRENTICE_MAGIC) {
				items.add(new ItemEBWand(q, Tier.APPRENTICE, Element.MAGIC));
			}
			;
			for (String p : ADVANCED_EARTH) {
				items.add(new ItemEBWand(p, Tier.ADVANCED, Element.EARTH));
			}
			;
			for (String r : ADVANCED_LIGHTNING) {
				items.add(new ItemEBWand(r, Tier.ADVANCED, Element.LIGHTNING));
			}
			;
			for (String s : ADVANCED_HEALING) {
				items.add(new ItemEBWand(s, Tier.ADVANCED, Element.HEALING));
			}
			;
			for (String t : ADVANCED_SORCERY) {
				items.add(new ItemEBWand(t, Tier.ADVANCED, Element.SORCERY));
			}
			;
			for (String u : ADVANCED_ICE) {
				items.add(new ItemEBWand(u, Tier.ADVANCED, Element.ICE));
			}
			;
			for (String v : ADVANCED_FIRE) {
				items.add(new ItemEBWand(v, Tier.ADVANCED, Element.FIRE));
			}
			;
			for (String w : ADVANCED_NECROMANCY) {
				items.add(new ItemEBWand(w, Tier.ADVANCED, Element.NECROMANCY));
			}
			;
			for (String x : ADVANCED_MAGIC) {
				items.add(new ItemEBWand(x, Tier.ADVANCED, Element.MAGIC));
			}
			;
			for (String y : MASTER_EARTH) {
				items.add(new ItemEBWand(y, Tier.MASTER, Element.EARTH));
			}
			;
			for (String z : MASTER_LIGHTNING) {
				items.add(new ItemEBWand(z, Tier.MASTER, Element.LIGHTNING));
			}
			;
			for (String aa : MASTER_HEALING) {
				items.add(new ItemEBWand(aa, Tier.MASTER, Element.HEALING));
			}
			;
			for (String ab : MASTER_SORCERY) {
				items.add(new ItemEBWand(ab, Tier.MASTER, Element.SORCERY));
			}
			;
			for (String ac : MASTER_ICE) {
				items.add(new ItemEBWand(ac, Tier.MASTER, Element.ICE));
			}
			;
			for (String ad : MASTER_FIRE) {
				items.add(new ItemEBWand(ad, Tier.MASTER, Element.FIRE));
			}
			;
			for (String ae : MASTER_NECROMANCY) {
				items.add(new ItemEBWand(ae, Tier.MASTER, Element.NECROMANCY));
			}
			;
			for (String af : MASTER_MAGIC) {
				items.add(new ItemEBWand(af, Tier.MASTER, Element.MAGIC));
			}
			;
			LOGGER.debug("Registered with EB");
		} else if (Loader.isModLoaded("mmorpg")) {
			for (int i = 1; i <= 10; i++)
				items.add(new ItemMSStaff("harvestcleric" + i));
			for (int i = 1; i <= 5; i++)
				items.add(new ItemMSStaff("macabredancer" + i));
			for (int i = 1; i <= 14; i++)
				items.add(new ItemMSStaff("shadowwarlock" + i));
			for (int i = 1; i <= 74; i++)
				items.add(new ItemMSStaff("wavemaster" + i));
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
			for (int i = 1; i <= 4; i++)
				items.add(new ItemMSBow("dualgunner" + i));
			for (int i = 1; i <= 18; i++)
				items.add(new ItemMSBow("steamgunner" + i));
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