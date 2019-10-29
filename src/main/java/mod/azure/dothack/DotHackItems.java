package mod.azure.dothack;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.collect.ImmutableList;

import javax.annotation.Nonnull;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import electroblob.wizardry.constants.Element;
import electroblob.wizardry.constants.Tier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;
import mod.azure.dothack.items.base.ItemBaseSword;
import mod.azure.dothack.items.baubles.BaublesHeadItem;
import mod.azure.dothack.items.ebwizadry.ItemEBWand;
import mod.azure.dothack.items.mineandslash.ItemMSStaff;
import net.minecraftforge.fml.common.Loader;

@ObjectHolder(DotHackMod.MODID)
@EventBusSubscriber
public final class DotHackItems {

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
			"macabredancer4", "macabredancer5", "shadowwarlock7", "harvestcleric6", "redwand1");

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

	public static Item getWand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return WAND_MAP.get(ImmutablePair.of(tier, element));
	}

	private static final Map<Pair<Tier, Element>, Item> WAND_MAP = new HashMap<>();

	@Nonnull
	private static <T> T placeholder() {
		return null;
	}

	public static void registerItem(IForgeRegistry<Item> registry, String name, Item item, boolean setTabIcon) {
		item.setRegistryName(DotHackMod.MODID, name);
		item.setTranslationKey(name);
		registry.register(item);
	}
	
	public static void registerItem(IForgeRegistry<Item> registry, String name, Item item){
		registerItem(registry, name, item, false);
	}

	@SubscribeEvent
	public static void register(RegistryEvent.Register<Item> event) {

		IForgeRegistry<Item> registry = event.getRegistry();

		for (int i = 1; i <= 19; i++)
			registerItem(registry, "bladebrandier" + i, new ItemBaseSword("bladebrandier" + i, (3 + i) / 3));
		for (int i = 1; i <= 25; i++)
			registerItem(registry, "dualswords" + i, new ItemBaseSword("dualswords" + i, (2 + i) / 5));
		for (int i = 1; i <= 20; i++)
			registerItem(registry, "edgepunisher" + i, new ItemBaseSword("edgepunisher" + i, (5 + i) / 2));
		for (int i = 1; i <= 9; i++)
			registerItem(registry, "flickreaper" + i, new ItemBaseSword("flickreaper" + i, (20 + i) / 3));
		for (int i = 1; i <= 9; i++)
			registerItem(registry, "lordpartizan" + i, new ItemBaseSword("lordpartizan" + i, (16 + i) / 2));
		for (int i = 1; i <= 11; i++)
			registerItem(registry, "tribalgrappler" + i, new ItemBaseSword("tribalgrappler" + i, (20 + i) / 5));
		for (int i = 1; i <= 75; i++)
			registerItem(registry, "blademaster" + i, new ItemBaseSword("blademaster" + i, (3 + i) / 10));
		for (int i = 1; i <= 73; i++)
			registerItem(registry, "heavyaxeman" + i, new ItemBaseSword("heavyaxeman" + i, (11 + i) / 7));
		for (int i = 1; i <= 54; i++)
			registerItem(registry, "heavyblade" + i, new ItemBaseSword("heavyblade" + i, (81 + i) / 15));
		for (int i = 1; i <= 41; i++)
			registerItem(registry, "heavybladev" + i, new ItemBaseSword("heavybladev" + i, (94 + i) / 15));
		for (int i = 1; i <= 71; i++)
			registerItem(registry, "longarm" + i, new ItemBaseSword("longarm" + i, (4 + i) / 9));
		for (int i = 1; i <= 81; i++)
			registerItem(registry, "twinblade" + i, new ItemBaseSword("twinblade" + i, (2 + i) / 15));
		LOGGER.debug("Registered normal items");
		if (Loader.isModLoaded("baubles")) {
			registerItem(registry, "datadrain", new BaublesHeadItem());
			LOGGER.debug("Registered with Baubles");
		} else {
			registerItem(registry, "datadrain", new Item());
			LOGGER.debug("Registered without Baubles");
		}
		if (Loader.isModLoaded("ebwizardry")) {
			for (String e : EARTH) {
				registerItem(registry, e + "", new ItemEBWand(Tier.NOVICE, Element.EARTH));
				registerItem(registry, e + "p", new ItemEBWand(Tier.APPRENTICE, Element.EARTH));
				registerItem(registry, e + "a", new ItemEBWand(Tier.ADVANCED, Element.EARTH));
				registerItem(registry, e + "m", new ItemEBWand(Tier.MASTER, Element.EARTH));
			}
			for (String l : LIGHTNING) {
				registerItem(registry, l + "", new ItemEBWand(Tier.NOVICE, Element.LIGHTNING));
				registerItem(registry, l + "p", new ItemEBWand(Tier.APPRENTICE, Element.LIGHTNING));
				registerItem(registry, l + "a", new ItemEBWand(Tier.ADVANCED, Element.LIGHTNING));
				registerItem(registry, l + "m", new ItemEBWand(Tier.MASTER, Element.LIGHTNING));
			}
			for (String h : HEALING) {
				registerItem(registry, h + "", new ItemEBWand(Tier.NOVICE, Element.HEALING));
				registerItem(registry, h + "p", new ItemEBWand(Tier.APPRENTICE, Element.HEALING));
				registerItem(registry, h + "a", new ItemEBWand(Tier.ADVANCED, Element.HEALING));
				registerItem(registry, h + "m", new ItemEBWand(Tier.MASTER, Element.HEALING));

			}
			for (String s : SORCERY) {
				registerItem(registry, s + "", new ItemEBWand(Tier.NOVICE, Element.SORCERY));
				registerItem(registry, s + "p", new ItemEBWand(Tier.APPRENTICE, Element.SORCERY));
				registerItem(registry, s + "a", new ItemEBWand(Tier.ADVANCED, Element.SORCERY));
				registerItem(registry, s + "m", new ItemEBWand(Tier.MASTER, Element.SORCERY));
			}
			for (String i : ICE) {
				registerItem(registry, i + "", new ItemEBWand(Tier.NOVICE, Element.ICE));
				registerItem(registry, i + "p", new ItemEBWand(Tier.APPRENTICE, Element.ICE));
				registerItem(registry, i + "a", new ItemEBWand(Tier.ADVANCED, Element.ICE));
				registerItem(registry, i + "m", new ItemEBWand(Tier.MASTER, Element.ICE));
			}
			for (String f : FIRE) {
				registerItem(registry, f + "", new ItemEBWand(Tier.NOVICE, Element.FIRE));
				registerItem(registry, f + "p", new ItemEBWand(Tier.APPRENTICE, Element.FIRE));
				registerItem(registry, f + "a", new ItemEBWand(Tier.ADVANCED, Element.FIRE));
				registerItem(registry, f + "m", new ItemEBWand(Tier.MASTER, Element.FIRE));
			}
			for (String n : NECROMANCY) {
				registerItem(registry, n + "", new ItemEBWand(Tier.NOVICE, Element.NECROMANCY));
				registerItem(registry, n + "p", new ItemEBWand(Tier.APPRENTICE, Element.NECROMANCY));
				registerItem(registry, n + "a", new ItemEBWand(Tier.ADVANCED, Element.NECROMANCY));
				registerItem(registry, n + "m", new ItemEBWand(Tier.MASTER, Element.NECROMANCY));
			}
			for (String m : MAGIC) {
				registerItem(registry, m + "", new ItemEBWand(Tier.NOVICE, Element.MAGIC));
				registerItem(registry, m + "p", new ItemEBWand(Tier.APPRENTICE, Element.MAGIC));
				registerItem(registry, m + "a", new ItemEBWand(Tier.ADVANCED, Element.MAGIC));
				registerItem(registry, m + "m", new ItemEBWand(Tier.MASTER, Element.MAGIC));
			}
			LOGGER.debug("Registered with EB");
		} else if (Loader.isModLoaded("mmorpg")) {
			for (int i = 1; i <= 10; i++)
				registerItem(registry, "harvestcleric" + i, new ItemMSStaff());
			for (int i = 1; i <= 5; i++)
				registerItem(registry, "macabredancer" + i, new ItemMSStaff());
			for (int i = 1; i <= 14; i++)
				registerItem(registry, "shadowwarlock" + i, new ItemMSStaff());
			for (int i = 1; i <= 74; i++)
				registerItem(registry, "wavemaster" + i, new ItemMSStaff());
			registerItem(registry, "redwand1", new ItemMSStaff());
			LOGGER.debug("Registered with M&S");
		} else {
			for (int i = 1; i <= 9; i++)
				registerItem(registry, "harvestcleric" + i, new ItemBow());
			for (int i = 1; i <= 5; i++)
				registerItem(registry, "macabredancer" + i, new ItemBow());
			for (int i = 1; i <= 14; i++)
				registerItem(registry, "shadowwarlock" + i, new ItemBow());
			for (int i = 1; i <= 74; i++)
				registerItem(registry, "wavemaster" + i, new ItemBow());
			registerItem(registry, "redwand1", new ItemBow());
			LOGGER.debug("Registered without EB or M&S");
		}
		if (Loader.isModLoaded("mmorpg")) {
			for (int i = 1; i <= 4; i++)
				registerItem(registry, "dualgunner" + i, new ItemBow());
			for (int i = 1; i <= 18; i++)
				registerItem(registry, "steamgunner" + i, new ItemBow());
			LOGGER.debug("Registered with M&S");
		} else {
			for (int i = 1; i <= 4; i++)
				registerItem(registry, "dualgunner" + i, new ItemBow());
			for (int i = 1; i <= 18; i++)
				registerItem(registry, "steamgunner" + i, new ItemBow());
			LOGGER.debug("Registered without M&S");
		}

	}

	public static final Item harvestcleric1 = placeholder();
	public static final Item harvestcleric2 = placeholder();
	public static final Item harvestcleric3 = placeholder();
	public static final Item harvestcleric4 = placeholder();
	public static final Item harvestcleric5 = placeholder();
	public static final Item harvestcleric6 = placeholder();
	public static final Item harvestcleric7 = placeholder();
	public static final Item harvestcleric8 = placeholder();
	public static final Item harvestcleric9 = placeholder();
	public static final Item harvestcleric10 = placeholder();

	public static final Item macabredancer1 = placeholder();
	public static final Item macabredancer2 = placeholder();
	public static final Item macabredancer3 = placeholder();
	public static final Item macabredancer4 = placeholder();
	public static final Item macabredancer5 = placeholder();

	public static final Item shadowwarlock1 = placeholder();
	public static final Item shadowwarlock2 = placeholder();
	public static final Item shadowwarlock3 = placeholder();
	public static final Item shadowwarlock4 = placeholder();
	public static final Item shadowwarlock5 = placeholder();
	public static final Item shadowwarlock6 = placeholder();
	public static final Item shadowwarlock7 = placeholder();
	public static final Item shadowwarlock8 = placeholder();
	public static final Item shadowwarlock9 = placeholder();
	public static final Item shadowwarlock10 = placeholder();
	public static final Item shadowwarlock11 = placeholder();
	public static final Item shadowwarlock12 = placeholder();
	public static final Item shadowwarlock13 = placeholder();
	public static final Item shadowwarlock14 = placeholder();

	public static final Item wavemaster1 = placeholder();
	public static final Item wavemaster2 = placeholder();
	public static final Item wavemaster3 = placeholder();
	public static final Item wavemaster4 = placeholder();
	public static final Item wavemaster5 = placeholder();
	public static final Item wavemaster6 = placeholder();
	public static final Item wavemaster7 = placeholder();
	public static final Item wavemaster8 = placeholder();
	public static final Item wavemaster9 = placeholder();
	public static final Item wavemaster10 = placeholder();
	public static final Item wavemaster11 = placeholder();
	public static final Item wavemaster12 = placeholder();
	public static final Item wavemaster13 = placeholder();
	public static final Item wavemaster14 = placeholder();
	public static final Item wavemaster15 = placeholder();
	public static final Item wavemaster16 = placeholder();
	public static final Item wavemaster17 = placeholder();
	public static final Item wavemaster18 = placeholder();
	public static final Item wavemaster19 = placeholder();
	public static final Item wavemaster20 = placeholder();
	public static final Item wavemaster21 = placeholder();
	public static final Item wavemaster22 = placeholder();
	public static final Item wavemaster23 = placeholder();
	public static final Item wavemaster24 = placeholder();
	public static final Item wavemaster25 = placeholder();
	public static final Item wavemaster26 = placeholder();
	public static final Item wavemaster27 = placeholder();
	public static final Item wavemaster28 = placeholder();
	public static final Item wavemaster29 = placeholder();
	public static final Item wavemaster30 = placeholder();
	public static final Item wavemaster31 = placeholder();
	public static final Item wavemaster32 = placeholder();
	public static final Item wavemaster33 = placeholder();
	public static final Item wavemaster34 = placeholder();
	public static final Item wavemaster35 = placeholder();
	public static final Item wavemaster36 = placeholder();
	public static final Item wavemaster37 = placeholder();
	public static final Item wavemaster38 = placeholder();
	public static final Item wavemaster39 = placeholder();
	public static final Item wavemaster40 = placeholder();
	public static final Item wavemaster41 = placeholder();
	public static final Item wavemaster42 = placeholder();
	public static final Item wavemaster43 = placeholder();
	public static final Item wavemaster44 = placeholder();
	public static final Item wavemaster45 = placeholder();
	public static final Item wavemaster46 = placeholder();
	public static final Item wavemaster47 = placeholder();
	public static final Item wavemaster48 = placeholder();
	public static final Item wavemaster49 = placeholder();
	public static final Item wavemaster50 = placeholder();
	public static final Item wavemaster51 = placeholder();
	public static final Item wavemaster52 = placeholder();
	public static final Item wavemaster53 = placeholder();
	public static final Item wavemaster54 = placeholder();
	public static final Item wavemaster55 = placeholder();
	public static final Item wavemaster56 = placeholder();
	public static final Item wavemaster57 = placeholder();
	public static final Item wavemaster58 = placeholder();
	public static final Item wavemaster59 = placeholder();
	public static final Item wavemaster60 = placeholder();
	public static final Item wavemaster61 = placeholder();
	public static final Item wavemaster62 = placeholder();
	public static final Item wavemaster63 = placeholder();
	public static final Item wavemaster64 = placeholder();
	public static final Item wavemaster65 = placeholder();
	public static final Item wavemaster66 = placeholder();
	public static final Item wavemaster67 = placeholder();
	public static final Item wavemaster68 = placeholder();
	public static final Item wavemaster69 = placeholder();
	public static final Item wavemaster70 = placeholder();
	public static final Item wavemaster71 = placeholder();
	public static final Item wavemaster72 = placeholder();
	public static final Item wavemaster73 = placeholder();
	public static final Item wavemaster74 = placeholder();

	public static final Item harvestcleric1p = placeholder();
	public static final Item harvestcleric2p = placeholder();
	public static final Item harvestcleric3p = placeholder();
	public static final Item harvestcleric4p = placeholder();
	public static final Item harvestcleric5p = placeholder();
	public static final Item harvestcleric6p = placeholder();
	public static final Item harvestcleric7p = placeholder();
	public static final Item harvestcleric8p = placeholder();
	public static final Item harvestcleric9p = placeholder();
	public static final Item harvestcleric10p = placeholder();

	public static final Item macabredancer1p = placeholder();
	public static final Item macabredancer2p = placeholder();
	public static final Item macabredancer3p = placeholder();
	public static final Item macabredancer4p = placeholder();
	public static final Item macabredancer5p = placeholder();

	public static final Item shadowwarlock1p = placeholder();
	public static final Item shadowwarlock2p = placeholder();
	public static final Item shadowwarlock3p = placeholder();
	public static final Item shadowwarlock4p = placeholder();
	public static final Item shadowwarlock5p = placeholder();
	public static final Item shadowwarlock6p = placeholder();
	public static final Item shadowwarlock7p = placeholder();
	public static final Item shadowwarlock8p = placeholder();
	public static final Item shadowwarlock9p = placeholder();
	public static final Item shadowwarlock10p = placeholder();
	public static final Item shadowwarlock11p = placeholder();
	public static final Item shadowwarlock12p = placeholder();
	public static final Item shadowwarlock13p = placeholder();
	public static final Item shadowwarlock14p = placeholder();

	public static final Item wavemaster1p = placeholder();
	public static final Item wavemaster2p = placeholder();
	public static final Item wavemaster3p = placeholder();
	public static final Item wavemaster4p = placeholder();
	public static final Item wavemaster5p = placeholder();
	public static final Item wavemaster6p = placeholder();
	public static final Item wavemaster7p = placeholder();
	public static final Item wavemaster8p = placeholder();
	public static final Item wavemaster9p = placeholder();
	public static final Item wavemaster10p = placeholder();
	public static final Item wavemaster11p = placeholder();
	public static final Item wavemaster12p = placeholder();
	public static final Item wavemaster13p = placeholder();
	public static final Item wavemaster14p = placeholder();
	public static final Item wavemaster15p = placeholder();
	public static final Item wavemaster16p = placeholder();
	public static final Item wavemaster17p = placeholder();
	public static final Item wavemaster18p = placeholder();
	public static final Item wavemaster19p = placeholder();
	public static final Item wavemaster20p = placeholder();
	public static final Item wavemaster21p = placeholder();
	public static final Item wavemaster22p = placeholder();
	public static final Item wavemaster23p = placeholder();
	public static final Item wavemaster24p = placeholder();
	public static final Item wavemaster25p = placeholder();
	public static final Item wavemaster26p = placeholder();
	public static final Item wavemaster27p = placeholder();
	public static final Item wavemaster28p = placeholder();
	public static final Item wavemaster29p = placeholder();
	public static final Item wavemaster30p = placeholder();
	public static final Item wavemaster31p = placeholder();
	public static final Item wavemaster32p = placeholder();
	public static final Item wavemaster33p = placeholder();
	public static final Item wavemaster34p = placeholder();
	public static final Item wavemaster35p = placeholder();
	public static final Item wavemaster36p = placeholder();
	public static final Item wavemaster37p = placeholder();
	public static final Item wavemaster38p = placeholder();
	public static final Item wavemaster39p = placeholder();
	public static final Item wavemaster40p = placeholder();
	public static final Item wavemaster41p = placeholder();
	public static final Item wavemaster42p = placeholder();
	public static final Item wavemaster43p = placeholder();
	public static final Item wavemaster44p = placeholder();
	public static final Item wavemaster45p = placeholder();
	public static final Item wavemaster46p = placeholder();
	public static final Item wavemaster47p = placeholder();
	public static final Item wavemaster48p = placeholder();
	public static final Item wavemaster49p = placeholder();
	public static final Item wavemaster50p = placeholder();
	public static final Item wavemaster51p = placeholder();
	public static final Item wavemaster52p = placeholder();
	public static final Item wavemaster53p = placeholder();
	public static final Item wavemaster54p = placeholder();
	public static final Item wavemaster55p = placeholder();
	public static final Item wavemaster56p = placeholder();
	public static final Item wavemaster57p = placeholder();
	public static final Item wavemaster58p = placeholder();
	public static final Item wavemaster59p = placeholder();
	public static final Item wavemaster60p = placeholder();
	public static final Item wavemaster61p = placeholder();
	public static final Item wavemaster62p = placeholder();
	public static final Item wavemaster63p = placeholder();
	public static final Item wavemaster64p = placeholder();
	public static final Item wavemaster65p = placeholder();
	public static final Item wavemaster66p = placeholder();
	public static final Item wavemaster67p = placeholder();
	public static final Item wavemaster68p = placeholder();
	public static final Item wavemaster69p = placeholder();
	public static final Item wavemaster70p = placeholder();
	public static final Item wavemaster71p = placeholder();
	public static final Item wavemaster72p = placeholder();
	public static final Item wavemaster73p = placeholder();
	public static final Item wavemaster74p = placeholder();

	public static final Item harvestcleric1a = placeholder();
	public static final Item harvestcleric2a = placeholder();
	public static final Item harvestcleric3a = placeholder();
	public static final Item harvestcleric4a = placeholder();
	public static final Item harvestcleric5a = placeholder();
	public static final Item harvestcleric6a = placeholder();
	public static final Item harvestcleric7a = placeholder();
	public static final Item harvestcleric8a = placeholder();
	public static final Item harvestcleric9a = placeholder();
	public static final Item harvestcleric10a = placeholder();

	public static final Item macabredancer1a = placeholder();
	public static final Item macabredancer2a = placeholder();
	public static final Item macabredancer3a = placeholder();
	public static final Item macabredancer4a = placeholder();
	public static final Item macabredancer5a = placeholder();

	public static final Item shadowwarlock1a = placeholder();
	public static final Item shadowwarlock2a = placeholder();
	public static final Item shadowwarlock3a = placeholder();
	public static final Item shadowwarlock4a = placeholder();
	public static final Item shadowwarlock5a = placeholder();
	public static final Item shadowwarlock6a = placeholder();
	public static final Item shadowwarlock7a = placeholder();
	public static final Item shadowwarlock8a = placeholder();
	public static final Item shadowwarlock9a = placeholder();
	public static final Item shadowwarlock10a = placeholder();
	public static final Item shadowwarlock11a = placeholder();
	public static final Item shadowwarlock12a = placeholder();
	public static final Item shadowwarlock13a = placeholder();
	public static final Item shadowwarlock14a = placeholder();

	public static final Item wavemaster1a = placeholder();
	public static final Item wavemaster2a = placeholder();
	public static final Item wavemaster3a = placeholder();
	public static final Item wavemaster4a = placeholder();
	public static final Item wavemaster5a = placeholder();
	public static final Item wavemaster6a = placeholder();
	public static final Item wavemaster7a = placeholder();
	public static final Item wavemaster8a = placeholder();
	public static final Item wavemaster9a = placeholder();
	public static final Item wavemaster10a = placeholder();
	public static final Item wavemaster11a = placeholder();
	public static final Item wavemaster12a = placeholder();
	public static final Item wavemaster13a = placeholder();
	public static final Item wavemaster14a = placeholder();
	public static final Item wavemaster15a = placeholder();
	public static final Item wavemaster16a = placeholder();
	public static final Item wavemaster17a = placeholder();
	public static final Item wavemaster18a = placeholder();
	public static final Item wavemaster19a = placeholder();
	public static final Item wavemaster20a = placeholder();
	public static final Item wavemaster21a = placeholder();
	public static final Item wavemaster22a = placeholder();
	public static final Item wavemaster23a = placeholder();
	public static final Item wavemaster24a = placeholder();
	public static final Item wavemaster25a = placeholder();
	public static final Item wavemaster26a = placeholder();
	public static final Item wavemaster27a = placeholder();
	public static final Item wavemaster28a = placeholder();
	public static final Item wavemaster29a = placeholder();
	public static final Item wavemaster30a = placeholder();
	public static final Item wavemaster31a = placeholder();
	public static final Item wavemaster32a = placeholder();
	public static final Item wavemaster33a = placeholder();
	public static final Item wavemaster34a = placeholder();
	public static final Item wavemaster35a = placeholder();
	public static final Item wavemaster36a = placeholder();
	public static final Item wavemaster37a = placeholder();
	public static final Item wavemaster38a = placeholder();
	public static final Item wavemaster39a = placeholder();
	public static final Item wavemaster40a = placeholder();
	public static final Item wavemaster41a = placeholder();
	public static final Item wavemaster42a = placeholder();
	public static final Item wavemaster43a = placeholder();
	public static final Item wavemaster44a = placeholder();
	public static final Item wavemaster45a = placeholder();
	public static final Item wavemaster46a = placeholder();
	public static final Item wavemaster47a = placeholder();
	public static final Item wavemaster48a = placeholder();
	public static final Item wavemaster49a = placeholder();
	public static final Item wavemaster50a = placeholder();
	public static final Item wavemaster51a = placeholder();
	public static final Item wavemaster52a = placeholder();
	public static final Item wavemaster53a = placeholder();
	public static final Item wavemaster54a = placeholder();
	public static final Item wavemaster55a = placeholder();
	public static final Item wavemaster56a = placeholder();
	public static final Item wavemaster57a = placeholder();
	public static final Item wavemaster58a = placeholder();
	public static final Item wavemaster59a = placeholder();
	public static final Item wavemaster60a = placeholder();
	public static final Item wavemaster61a = placeholder();
	public static final Item wavemaster62a = placeholder();
	public static final Item wavemaster63a = placeholder();
	public static final Item wavemaster64a = placeholder();
	public static final Item wavemaster65a = placeholder();
	public static final Item wavemaster66a = placeholder();
	public static final Item wavemaster67a = placeholder();
	public static final Item wavemaster68a = placeholder();
	public static final Item wavemaster69a = placeholder();
	public static final Item wavemaster70a = placeholder();
	public static final Item wavemaster71a = placeholder();
	public static final Item wavemaster72a = placeholder();
	public static final Item wavemaster73a = placeholder();
	public static final Item wavemaster74a = placeholder();

	public static final Item harvestcleric1m = placeholder();
	public static final Item harvestcleric2m = placeholder();
	public static final Item harvestcleric3m = placeholder();
	public static final Item harvestcleric4m = placeholder();
	public static final Item harvestcleric5m = placeholder();
	public static final Item harvestcleric6m = placeholder();
	public static final Item harvestcleric7m = placeholder();
	public static final Item harvestcleric8m = placeholder();
	public static final Item harvestcleric9m = placeholder();
	public static final Item harvestcleric10m = placeholder();

	public static final Item macabredancer1m = placeholder();
	public static final Item macabredancer2m = placeholder();
	public static final Item macabredancer3m = placeholder();
	public static final Item macabredancer4m = placeholder();
	public static final Item macabredancer5m = placeholder();

	public static final Item shadowwarlock1m = placeholder();
	public static final Item shadowwarlock2m = placeholder();
	public static final Item shadowwarlock3m = placeholder();
	public static final Item shadowwarlock4m = placeholder();
	public static final Item shadowwarlock5m = placeholder();
	public static final Item shadowwarlock6m = placeholder();
	public static final Item shadowwarlock7m = placeholder();
	public static final Item shadowwarlock8m = placeholder();
	public static final Item shadowwarlock9m = placeholder();
	public static final Item shadowwarlock10m = placeholder();
	public static final Item shadowwarlock11m = placeholder();
	public static final Item shadowwarlock12m = placeholder();
	public static final Item shadowwarlock13m = placeholder();
	public static final Item shadowwarlock14m = placeholder();

	public static final Item wavemaster1m = placeholder();
	public static final Item wavemaster2m = placeholder();
	public static final Item wavemaster3m = placeholder();
	public static final Item wavemaster4m = placeholder();
	public static final Item wavemaster5m = placeholder();
	public static final Item wavemaster6m = placeholder();
	public static final Item wavemaster7m = placeholder();
	public static final Item wavemaster8m = placeholder();
	public static final Item wavemaster9m = placeholder();
	public static final Item wavemaster10m = placeholder();
	public static final Item wavemaster11m = placeholder();
	public static final Item wavemaster12m = placeholder();
	public static final Item wavemaster13m = placeholder();
	public static final Item wavemaster14m = placeholder();
	public static final Item wavemaster15m = placeholder();
	public static final Item wavemaster16m = placeholder();
	public static final Item wavemaster17m = placeholder();
	public static final Item wavemaster18m = placeholder();
	public static final Item wavemaster19m = placeholder();
	public static final Item wavemaster20m = placeholder();
	public static final Item wavemaster21m = placeholder();
	public static final Item wavemaster22m = placeholder();
	public static final Item wavemaster23m = placeholder();
	public static final Item wavemaster24m = placeholder();
	public static final Item wavemaster25m = placeholder();
	public static final Item wavemaster26m = placeholder();
	public static final Item wavemaster27m = placeholder();
	public static final Item wavemaster28m = placeholder();
	public static final Item wavemaster29m = placeholder();
	public static final Item wavemaster30m = placeholder();
	public static final Item wavemaster31m = placeholder();
	public static final Item wavemaster32m = placeholder();
	public static final Item wavemaster33m = placeholder();
	public static final Item wavemaster34m = placeholder();
	public static final Item wavemaster35m = placeholder();
	public static final Item wavemaster36m = placeholder();
	public static final Item wavemaster37m = placeholder();
	public static final Item wavemaster38m = placeholder();
	public static final Item wavemaster39m = placeholder();
	public static final Item wavemaster40m = placeholder();
	public static final Item wavemaster41m = placeholder();
	public static final Item wavemaster42m = placeholder();
	public static final Item wavemaster43m = placeholder();
	public static final Item wavemaster44m = placeholder();
	public static final Item wavemaster45m = placeholder();
	public static final Item wavemaster46m = placeholder();
	public static final Item wavemaster47m = placeholder();
	public static final Item wavemaster48m = placeholder();
	public static final Item wavemaster49m = placeholder();
	public static final Item wavemaster50m = placeholder();
	public static final Item wavemaster51m = placeholder();
	public static final Item wavemaster52m = placeholder();
	public static final Item wavemaster53m = placeholder();
	public static final Item wavemaster54m = placeholder();
	public static final Item wavemaster55m = placeholder();
	public static final Item wavemaster56m = placeholder();
	public static final Item wavemaster57m = placeholder();
	public static final Item wavemaster58m = placeholder();
	public static final Item wavemaster59m = placeholder();
	public static final Item wavemaster60m = placeholder();
	public static final Item wavemaster61m = placeholder();
	public static final Item wavemaster62m = placeholder();
	public static final Item wavemaster63m = placeholder();
	public static final Item wavemaster64m = placeholder();
	public static final Item wavemaster65m = placeholder();
	public static final Item wavemaster66m = placeholder();
	public static final Item wavemaster67m = placeholder();
	public static final Item wavemaster68m = placeholder();
	public static final Item wavemaster69m = placeholder();
	public static final Item wavemaster70m = placeholder();
	public static final Item wavemaster71m = placeholder();
	public static final Item wavemaster72m = placeholder();
	public static final Item wavemaster73m = placeholder();
	public static final Item wavemaster74m = placeholder();

	public static final Item redwand1 = placeholder();
	public static final Item redwand1p = placeholder();
	public static final Item redwand1a = placeholder();
	public static final Item redwand1m = placeholder();

	public static void populateWandMap() {

		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster26); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster21); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster19);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster16); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster15); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster14); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster13); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster12); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster9);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster8); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster2); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), shadowwarlock3); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), shadowwarlock4); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), shadowwarlock5); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), shadowwarlock6);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), macabredancer4); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), macabredancer5); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), shadowwarlock7); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), harvestcleric6);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), redwand1);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster26p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster21p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster19p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster16p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster15p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster14p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster13p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster12p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster9p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster8p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster2p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), shadowwarlock3p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), shadowwarlock4p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), shadowwarlock5p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), shadowwarlock6p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), macabredancer4p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), macabredancer5p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), shadowwarlock7p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), harvestcleric6p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), redwand1p);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster26a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster21a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster19a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster16a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster15a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster14a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster13a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster12a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster9a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster8a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster2a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), shadowwarlock3a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), shadowwarlock4a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), shadowwarlock5a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), shadowwarlock6a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), macabredancer4a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), macabredancer5a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), shadowwarlock7a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), harvestcleric6a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), redwand1a);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster26m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster21m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster19m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster16m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster15m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster14m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster13m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster12m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster9m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster8m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster2m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), shadowwarlock3m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), shadowwarlock4m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), shadowwarlock5m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), shadowwarlock6m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), macabredancer4m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), macabredancer5m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), shadowwarlock7m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), harvestcleric6m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), redwand1m);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster42);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster38);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster74);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster43);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster57);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster61);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster62);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster69);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster71);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster24);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster1);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), shadowwarlock2);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster36);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster37);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster50);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster52);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster65);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster29);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster22);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster35);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster23);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster44);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster41);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster51);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster31);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster42p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster38p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster74p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster43p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster57p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster61p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster62p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster69p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster71p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster24p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster1p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), shadowwarlock2p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster36p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster37p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster50p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster52p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster65p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster29p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster22p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster35p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster23p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster44p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster41p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster51p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster31p);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster42a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster38a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster74a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster43a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster57a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster61a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster62a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster69a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster71a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster24a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster1a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), shadowwarlock2a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster36a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster37a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster50a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster52a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster65a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster29a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster22a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster35a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster23a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster44a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster41a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster51a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster31a);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster42m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster38m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster74m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster43m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster57m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster61m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster62m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster69m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster71m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster24m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster1m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), shadowwarlock2m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster36m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster37m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster50m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster52m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster65m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster29m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster22m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster35m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster23m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster44m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster41m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster51m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster31m);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.ICE), wavemaster72);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.ICE), wavemaster73);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.ICE), harvestcleric1);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.ICE), wavemaster20);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.ICE), wavemaster34);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.ICE), shadowwarlock10);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.ICE), wavemaster72p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.ICE), wavemaster73p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.ICE), harvestcleric1p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.ICE), wavemaster20p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.ICE), wavemaster34p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.ICE), shadowwarlock10p);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.ICE), wavemaster72a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.ICE), wavemaster73a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.ICE), harvestcleric1a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.ICE), wavemaster20a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.ICE), wavemaster34a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.ICE), shadowwarlock10a);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.ICE), wavemaster72m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.ICE), wavemaster73m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.ICE), harvestcleric1m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.ICE), wavemaster20m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.ICE), wavemaster34m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.ICE), shadowwarlock10m);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), wavemaster60); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), wavemaster68); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), wavemaster28);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), wavemaster7); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), wavemaster40); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), wavemaster54); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), wavemaster55); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), shadowwarlock1); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), shadowwarlock8);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), macabredancer1);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), wavemaster60p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), wavemaster68p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), wavemaster28p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), wavemaster7p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), wavemaster40p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), wavemaster54p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), wavemaster55p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), shadowwarlock1p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), shadowwarlock8p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), macabredancer1p);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), wavemaster60a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), wavemaster68a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), wavemaster28a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), wavemaster7a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), wavemaster40a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), wavemaster54a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), wavemaster55a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), shadowwarlock1a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), shadowwarlock8a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), macabredancer1a);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), wavemaster60m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), wavemaster68m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), wavemaster28m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), wavemaster7m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), wavemaster40m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), wavemaster54m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), wavemaster55m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), shadowwarlock1m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), shadowwarlock8m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), macabredancer1m);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.FIRE), wavemaster59); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.FIRE), wavemaster70); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.FIRE), wavemaster25);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.FIRE), wavemaster18); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.FIRE), wavemaster11); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.FIRE), wavemaster32); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.FIRE), wavemaster39); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.FIRE), wavemaster67); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.FIRE), harvestcleric9);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.FIRE), wavemaster59p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.FIRE), wavemaster70p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.FIRE), wavemaster25p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.FIRE), wavemaster18p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.FIRE), wavemaster11p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.FIRE), wavemaster32p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.FIRE), wavemaster39p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.FIRE), wavemaster67p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.FIRE), harvestcleric9p);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.FIRE), wavemaster59a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.FIRE), wavemaster70a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.FIRE), wavemaster25a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.FIRE), wavemaster18a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.FIRE), wavemaster11a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.FIRE), wavemaster32a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.FIRE), wavemaster39a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.FIRE), wavemaster67a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.FIRE), harvestcleric9a);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.FIRE), wavemaster59m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.FIRE), wavemaster70m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.FIRE), wavemaster25m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.FIRE), wavemaster18m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.FIRE), wavemaster11m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.FIRE), wavemaster32m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.FIRE), wavemaster39m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.FIRE), wavemaster67m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.FIRE), harvestcleric9m);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.EARTH), wavemaster45); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.EARTH), wavemaster47); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.EARTH), harvestcleric2);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.EARTH), wavemaster56); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.EARTH), wavemaster46); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.EARTH), wavemaster48); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.EARTH), harvestcleric5); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.EARTH), macabredancer3); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.EARTH), harvestcleric7);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.EARTH), wavemaster45p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.EARTH), wavemaster47p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.EARTH), harvestcleric2p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.EARTH), wavemaster56p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.EARTH), wavemaster46p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.EARTH), wavemaster48p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.EARTH), harvestcleric5p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.EARTH), macabredancer3p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.EARTH), harvestcleric7p);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.EARTH), wavemaster45a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.EARTH), wavemaster47a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.EARTH), harvestcleric2a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.EARTH), wavemaster56a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.EARTH), wavemaster46a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.EARTH), wavemaster48a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.EARTH), harvestcleric5a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.EARTH), macabredancer3a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.EARTH), harvestcleric7a);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.EARTH), wavemaster45m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.EARTH), wavemaster47m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.EARTH), harvestcleric2m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.EARTH), wavemaster56m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.EARTH), wavemaster46m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.EARTH), wavemaster48m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.EARTH), harvestcleric5m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.EARTH), macabredancer3m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.EARTH), harvestcleric7m);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.LIGHTNING), wavemaster72); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.LIGHTNING), wavemaster73); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.LIGHTNING), harvestcleric1);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.LIGHTNING), wavemaster20); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.LIGHTNING), wavemaster34); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.LIGHTNING), shadowwarlock10);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.LIGHTNING), wavemaster72p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.LIGHTNING), wavemaster73p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.LIGHTNING), harvestcleric1p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.LIGHTNING), wavemaster20p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.LIGHTNING), wavemaster34p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.LIGHTNING), shadowwarlock10p);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.LIGHTNING), wavemaster72a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.LIGHTNING), wavemaster73a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.LIGHTNING), harvestcleric1a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.LIGHTNING), wavemaster20a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.LIGHTNING), wavemaster34a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.LIGHTNING), shadowwarlock10a);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.LIGHTNING), wavemaster72m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.LIGHTNING), wavemaster73m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.LIGHTNING), harvestcleric1m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.LIGHTNING), wavemaster20m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.LIGHTNING), wavemaster34m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.LIGHTNING), shadowwarlock10m);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), wavemaster49); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), wavemaster63); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), wavemaster64);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), wavemaster30); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), wavemaster4); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), macabredancer2); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), wavemaster5); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), harvestcleric4); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), harvestcleric3);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), wavemaster33); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), shadowwarlock11); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), shadowwarlock12); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), shadowwarlock13); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), shadowwarlock14);
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), shadowwarlock9); 
		WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), harvestcleric10);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), wavemaster49p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), wavemaster63p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), wavemaster64p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), wavemaster30p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), wavemaster4p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), macabredancer2p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), wavemaster5p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), harvestcleric4p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), harvestcleric3p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), wavemaster33p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), shadowwarlock11p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), shadowwarlock12p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), shadowwarlock13p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), shadowwarlock14p);
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), shadowwarlock9p); 
		WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), harvestcleric10p);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), wavemaster49a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), wavemaster63a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), wavemaster64a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), wavemaster30a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), wavemaster4a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), macabredancer2a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), wavemaster5a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), harvestcleric4a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), harvestcleric3a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), wavemaster33a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), shadowwarlock11a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), shadowwarlock12a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), shadowwarlock13a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), shadowwarlock14a);
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), shadowwarlock9a); 
		WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), harvestcleric10a);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), wavemaster49m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), wavemaster63m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), wavemaster64m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), wavemaster30m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), wavemaster4m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), macabredancer2m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), wavemaster5m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), harvestcleric4m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), harvestcleric3m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), wavemaster33m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), shadowwarlock11m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), shadowwarlock12m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), shadowwarlock13m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), shadowwarlock14m);
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), shadowwarlock9m); 
		WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), harvestcleric10m);

	}

}
