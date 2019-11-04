package mod.azure.dothack.registry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.collect.ImmutableList;

import javax.annotation.Nonnull;

import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.commons.lang3.tuple.Triple;

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
import mod.azure.dothack.items.ebwizadry.ItemEBWand24;
import mod.azure.dothack.items.ebwizadry.ItemEBWand23;
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
import net.minecraftforge.fml.common.Loader;

@ObjectHolder(DotHackMod.MODID)
@EventBusSubscriber
public final class DotHackItems {

	private static final Logger LOGGER = LogManager.getLogger();
	
	@Nonnull
	private static <T> T placeholder() {
		return null;
	}

	public static final Item datadrain = placeholder();
	public static final Item twinblade1 = placeholder();
	public static final Item heavyblade1 = placeholder();
	public static final Item bladebrandier1 = placeholder();
	public static final Item dualswords1 = placeholder();
	public static final Item edgepunisher1 = placeholder();
	public static final Item flickreaper1 = placeholder();
	public static final Item lordpartizan1 = placeholder();
	public static final Item tribalgrappler1 = placeholder();
	public static final Item blademaster1 = placeholder();
	public static final Item heavyaxeman1 = placeholder();
	public static final Item longarm1 = placeholder();

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

	public static Item get1Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return ONE_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get2Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return TWO_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get3Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return THREE_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get4Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return FOUR_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get5Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return FIVE_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get6Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return SIX_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get7Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return SEVEN_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get8Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return EIGHT_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get9Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return NINE_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get10Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return TEN_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get11Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return ELEVEN_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get12Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return TWELVE_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get13Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return THIRTEEN_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get14Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return FOURTEEN_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get15Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return FIFTEEN_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get16Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return SIXTEEN_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get17Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return SEVENTEEN_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get18Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return EIGHTTEEN_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get19Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return NINETEEN_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get20Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return TWENTY_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get21Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return TWENTYONE_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get22Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return TWENTYTWO_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get23Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return TWENTYTHREE_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get24Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return TWENTYFOUR_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	
	public static Item get25Wand(Tier tier, Element element) {
		if (tier == null)
			throw new NullPointerException("The given tier cannot be null.");
		if (element == null)
			element = Element.MAGIC;
		return TWENTYFIVE_WAND_MAP.get(ImmutablePair.of(tier, element));
	}
	private static final Map<Pair<Tier, Element>, Item> ONE_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> TWO_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> THREE_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> FOUR_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> FIVE_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> SIX_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> SEVEN_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> EIGHT_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> NINE_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> TEN_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> ELEVEN_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> TWELVE_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> THIRTEEN_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> FOURTEEN_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> FIFTEEN_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> SIXTEEN_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> SEVENTEEN_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> EIGHTTEEN_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> NINETEEN_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> TWENTY_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> TWENTYONE_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> TWENTYTWO_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> TWENTYTHREE_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> TWENTYFOUR_WAND_MAP = new HashMap<>();
	private static final Map<Pair<Tier, Element>, Item> TWENTYFIVE_WAND_MAP = new HashMap<>();

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
		LOGGER.debug("Registered normal items");
		if (Loader.isModLoaded("baubles")) {
			registerItem(registry, "datadrain", new BaublesHeadItem().setCreativeTab(DotHackTabs.taba), true);
			LOGGER.debug("Registered with Baubles");
		} else {
			registerItem(registry, "datadrain", new Item().setCreativeTab(DotHackTabs.taba), true);
			LOGGER.debug("Registered without Baubles");
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
			LOGGER.debug("Registered with EB");
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
			LOGGER.debug("Registered with M&S");
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
			LOGGER.debug("Registered without EB or M&S");
		}
		if (Loader.isModLoaded("mmorpg")) {
			registerItem(registry, "dualgunner1", new ItemBow().setCreativeTab(DotHackTabs.tabdg), true);
			for (int i = 2; i <= 4; i++)
				registerItem(registry, "dualgunner" + i, new ItemBow().setCreativeTab(DotHackTabs.tabdg));
			registerItem(registry, "steamgunner1", new ItemBow().setCreativeTab(DotHackTabs.tabsg), true);
			for (int i = 2; i <= 18; i++)
				registerItem(registry, "steamgunner" + i, new ItemBow().setCreativeTab(DotHackTabs.tabsg));
			LOGGER.debug("Registered with M&S");
		} else {
			registerItem(registry, "dualgunner1", new ItemBow().setCreativeTab(DotHackTabs.tabdg), true);
			for (int i = 2; i <= 4; i++)
				registerItem(registry, "dualgunner" + i, new ItemBow().setCreativeTab(DotHackTabs.tabdg));
			registerItem(registry, "steamgunner1", new ItemBow().setCreativeTab(DotHackTabs.tabsg), true);
			for (int i = 2; i <= 18; i++)
				registerItem(registry, "steamgunner" + i, new ItemBow().setCreativeTab(DotHackTabs.tabsg));
			LOGGER.debug("Registered without M&S");
		}

	}

	public static void populateWandMap() {

		ONE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster26);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster21);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster19);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster16);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster15);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster14);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster13);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster12);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster9);
		TEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster8);
		ELEVEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), wavemaster2);
		TWELVE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), shadowwarlock3);
		THIRTEEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), shadowwarlock4);
		FOURTEEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), shadowwarlock5);
		FIFTEEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), shadowwarlock6);
		SIXTEEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), macabredancer4);
		SEVENTEEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), macabredancer5);
		EIGHTTEEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), shadowwarlock7);
		NINETEEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), harvestcleric6);
		TWENTY_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.SORCERY), redwand1);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster26p);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster21p);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster19p);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster16p);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster15p);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster14p);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster13p);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster12p);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster9p);
		TEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster8p);
		ELEVEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), wavemaster2p);
		TWELVE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), shadowwarlock3p);
		THIRTEEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), shadowwarlock4p);
		FOURTEEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), shadowwarlock5p);
		FIFTEEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), shadowwarlock6p);
		SIXTEEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), macabredancer4p);
		SEVENTEEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), macabredancer5p);
		EIGHTTEEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), shadowwarlock7p);
		NINETEEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), harvestcleric6p);
		TWENTY_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.SORCERY), redwand1p);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster26a);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster21a);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster19a);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster16a);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster15a);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster14a);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster13a);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster12a);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster9a);
		TEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster8a);
		ELEVEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), wavemaster2a);
		TWELVE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), shadowwarlock3a);
		THIRTEEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), shadowwarlock4a);
		FOURTEEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), shadowwarlock5a);
		FIFTEEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), shadowwarlock6a);
		SIXTEEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), macabredancer4a);
		SEVENTEEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), macabredancer5a);
		EIGHTTEEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), shadowwarlock7a);
		NINETEEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), harvestcleric6a);
		TWENTY_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.SORCERY), redwand1a);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster26m);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster21m);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster19m);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster16m);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster15m);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster14m);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster13m);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster12m);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster9m);
		TEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster8m);
		ELEVEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), wavemaster2m);
		TWELVE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), shadowwarlock3m);
		THIRTEEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), shadowwarlock4m);
		FOURTEEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), shadowwarlock5m);
		FIFTEEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), shadowwarlock6m);
		SIXTEEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), macabredancer4m);
		SEVENTEEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), macabredancer5m);
		EIGHTTEEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), shadowwarlock7m);
		NINETEEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), harvestcleric6m);
		TWENTY_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.SORCERY), redwand1m);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster42);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster38);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster74);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster43);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster57);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster61);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster62);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster69);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster71);
		TEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster24);
		ELEVEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster1);
		TWELVE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), shadowwarlock2);
		THIRTEEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster36);
		FOURTEEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster37);
		FIFTEEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster50);
		SIXTEEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster52);
		SEVENTEEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster65);
		EIGHTTEEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster29);
		NINETEEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster22);
		TWENTY_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster35);
		TWENTYONE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster23);
		TWENTYTWO_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster44);
		TWENTYTHREE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster41);
		TWENTYFOUR_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster51);
		TWENTYFIVE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.MAGIC), wavemaster31);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster42p);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster38p);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster74p);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster43p);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster57p);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster61p);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster62p);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster69p);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster71p);
		TEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster24p);
		ELEVEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster1p);
		TWELVE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), shadowwarlock2p);
		THIRTEEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster36p);
		FOURTEEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster37p);
		FIFTEEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster50p);
		SIXTEEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster52p);
		SEVENTEEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster65p);
		EIGHTTEEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster29p);
		NINETEEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster22p);
		TWENTY_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster35p);
		TWENTYONE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster23p);
		TWENTYTWO_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster44p);
		TWENTYTHREE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster41p);
		TWENTYFOUR_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster51p);
		TWENTYFIVE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.MAGIC), wavemaster31p);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster42a);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster38a);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster74a);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster43a);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster57a);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster61a);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster62a);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster69a);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster71a);
		TEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster24a);
		ELEVEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster1a);
		TWELVE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), shadowwarlock2a);
		THIRTEEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster36a);
		FOURTEEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster37a);
		FIFTEEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster50a);
		SIXTEEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster52a);
		SEVENTEEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster65a);
		EIGHTTEEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster29a);
		NINETEEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster22a);
		TWENTY_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster35a);
		TWENTYONE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster23a);
		TWENTYTWO_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster44a);
		TWENTYTHREE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster41a);
		TWENTYFOUR_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster51a);
		TWENTYFIVE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.MAGIC), wavemaster31a);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster42m);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster38m);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster74m);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster43m);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster57m);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster61m);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster62m);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster69m);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster71m);
		TEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster24m);
		ELEVEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster1m);
		TWELVE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), shadowwarlock2m);
		THIRTEEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster36m);
		FOURTEEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster37m);
		FIFTEEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster50m);
		SIXTEEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster52m);
		SEVENTEEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster65m);
		EIGHTTEEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster29m);
		NINETEEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster22m);
		TWENTY_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster35m);
		TWENTYONE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster23m);
		TWENTYTWO_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster44m);
		TWENTYTHREE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster41m);
		TWENTYFOUR_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster51m);
		TWENTYFIVE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.MAGIC), wavemaster31m);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.ICE), wavemaster27);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.ICE), wavemaster17);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.ICE), wavemaster10);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.ICE), wavemaster6);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.ICE), wavemaster3);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.ICE), wavemaster58);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.ICE), wavemaster53);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.ICE), wavemaster66);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.ICE), harvestcleric8);		
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.ICE), wavemaster27p);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.ICE), wavemaster17p);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.ICE), wavemaster10p);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.ICE), wavemaster6p);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.ICE), wavemaster3p);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.ICE), wavemaster58p);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.ICE), wavemaster53p);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.ICE), wavemaster66p);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.ICE), harvestcleric8p);		
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.ICE), wavemaster27a);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.ICE), wavemaster17a);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.ICE), wavemaster10a);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.ICE), wavemaster6a);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.ICE), wavemaster3a);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.ICE), wavemaster58a);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.ICE), wavemaster53a);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.ICE), wavemaster66a);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.ICE), harvestcleric8a);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.ICE), wavemaster27m);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.ICE), wavemaster17m);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.ICE), wavemaster10m);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.ICE), wavemaster6m);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.ICE), wavemaster3m);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.ICE), wavemaster58m);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.ICE), wavemaster53m);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.ICE), wavemaster66m);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.ICE), harvestcleric8m);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), wavemaster60);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), wavemaster68);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), wavemaster28);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), wavemaster7);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), wavemaster40);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), wavemaster54);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), wavemaster55);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), shadowwarlock1);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), shadowwarlock8);
		TEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.NECROMANCY), macabredancer1);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), wavemaster60p);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), wavemaster68p);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), wavemaster28p);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), wavemaster7p);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), wavemaster40p);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), wavemaster54p);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), wavemaster55p);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), shadowwarlock1p);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), shadowwarlock8p);
		TEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.NECROMANCY), macabredancer1p);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), wavemaster60a);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), wavemaster68a);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), wavemaster28a);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), wavemaster7a);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), wavemaster40a);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), wavemaster54a);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), wavemaster55a);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), shadowwarlock1a);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), shadowwarlock8a);
		TEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.NECROMANCY), macabredancer1a);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), wavemaster60m);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), wavemaster68m);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), wavemaster28m);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), wavemaster7m);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), wavemaster40m);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), wavemaster54m);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), wavemaster55m);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), shadowwarlock1m);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), shadowwarlock8m);
		TEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.NECROMANCY), macabredancer1m);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.FIRE), wavemaster59);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.FIRE), wavemaster70);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.FIRE), wavemaster25);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.FIRE), wavemaster18);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.FIRE), wavemaster11);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.FIRE), wavemaster32);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.FIRE), wavemaster39);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.FIRE), wavemaster67);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.FIRE), harvestcleric9);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.FIRE), wavemaster59p);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.FIRE), wavemaster70p);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.FIRE), wavemaster25p);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.FIRE), wavemaster18p);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.FIRE), wavemaster11p);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.FIRE), wavemaster32p);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.FIRE), wavemaster39p);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.FIRE), wavemaster67p);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.FIRE), harvestcleric9p);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.FIRE), wavemaster59a);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.FIRE), wavemaster70a);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.FIRE), wavemaster25a);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.FIRE), wavemaster18a);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.FIRE), wavemaster11a);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.FIRE), wavemaster32a);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.FIRE), wavemaster39a);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.FIRE), wavemaster67a);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.FIRE), harvestcleric9a);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.FIRE), wavemaster59m);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.FIRE), wavemaster70m);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.FIRE), wavemaster25m);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.FIRE), wavemaster18m);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.FIRE), wavemaster11m);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.FIRE), wavemaster32m);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.FIRE), wavemaster39m);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.FIRE), wavemaster67m);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.FIRE), harvestcleric9m);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.EARTH), wavemaster45);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.EARTH), wavemaster47);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.EARTH), harvestcleric2);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.EARTH), wavemaster56);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.EARTH), wavemaster46);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.EARTH), wavemaster48);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.EARTH), harvestcleric5);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.EARTH), macabredancer3);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.EARTH), harvestcleric7);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.EARTH), wavemaster45p);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.EARTH), wavemaster47p);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.EARTH), harvestcleric2p);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.EARTH), wavemaster56p);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.EARTH), wavemaster46p);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.EARTH), wavemaster48p);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.EARTH), harvestcleric5p);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.EARTH), macabredancer3p);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.EARTH), harvestcleric7p);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.EARTH), wavemaster45a);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.EARTH), wavemaster47a);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.EARTH), harvestcleric2a);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.EARTH), wavemaster56a);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.EARTH), wavemaster46a);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.EARTH), wavemaster48a);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.EARTH), harvestcleric5a);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.EARTH), macabredancer3a);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.EARTH), harvestcleric7a);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.EARTH), wavemaster45m);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.EARTH), wavemaster47m);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.EARTH), harvestcleric2m);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.EARTH), wavemaster56m);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.EARTH), wavemaster46m);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.EARTH), wavemaster48m);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.EARTH), harvestcleric5m);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.EARTH), macabredancer3m);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.EARTH), harvestcleric7m);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.LIGHTNING), wavemaster72);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.LIGHTNING), wavemaster73);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.LIGHTNING), harvestcleric1);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.LIGHTNING), wavemaster20);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.LIGHTNING), wavemaster34);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.LIGHTNING), shadowwarlock10);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.LIGHTNING), wavemaster72p);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.LIGHTNING), wavemaster73p);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.LIGHTNING), harvestcleric1p);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.LIGHTNING), wavemaster20p);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.LIGHTNING), wavemaster34p);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.LIGHTNING), shadowwarlock10p);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.LIGHTNING), wavemaster72a);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.LIGHTNING), wavemaster73a);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.LIGHTNING), harvestcleric1a);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.LIGHTNING), wavemaster20a);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.LIGHTNING), wavemaster34a);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.LIGHTNING), shadowwarlock10a);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.LIGHTNING), wavemaster72m);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.LIGHTNING), wavemaster73m);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.LIGHTNING), harvestcleric1m);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.LIGHTNING), wavemaster20m);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.LIGHTNING), wavemaster34m);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.LIGHTNING), shadowwarlock10m);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), wavemaster49);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), wavemaster63);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), wavemaster64);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), wavemaster30);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), wavemaster4);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), macabredancer2);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), wavemaster5);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), harvestcleric4);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), harvestcleric3);
		TEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), wavemaster33);
		ELEVEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), shadowwarlock11);
		TWELVE_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), shadowwarlock12);
		THIRTEEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), shadowwarlock13);
		FOURTEEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), shadowwarlock14);
		FIFTEEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), shadowwarlock9);
		SIXTEEN_WAND_MAP.put(ImmutablePair.of(Tier.NOVICE, Element.HEALING), harvestcleric10);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), wavemaster49p);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), wavemaster63p);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), wavemaster64p);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), wavemaster30p);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), wavemaster4p);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), macabredancer2p);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), wavemaster5p);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), harvestcleric4p);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), harvestcleric3p);
		TEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), wavemaster33p);
		TEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), shadowwarlock11p);
		TWELVE_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), shadowwarlock12p);
		THIRTEEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), shadowwarlock13p);
		FOURTEEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), shadowwarlock14p);
		FIFTEEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), shadowwarlock9p);
		SIXTEEN_WAND_MAP.put(ImmutablePair.of(Tier.APPRENTICE, Element.HEALING), harvestcleric10p);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), wavemaster49a);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), wavemaster63a);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), wavemaster64a);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), wavemaster30a);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), wavemaster4a);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), macabredancer2a);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), wavemaster5a);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), harvestcleric4a);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), harvestcleric3a);
		TEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), wavemaster33a);
		TEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), shadowwarlock11a);
		TWELVE_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), shadowwarlock12a);
		THIRTEEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), shadowwarlock13a);
		FOURTEEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), shadowwarlock14a);
		FIFTEEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), shadowwarlock9a);
		SIXTEEN_WAND_MAP.put(ImmutablePair.of(Tier.ADVANCED, Element.HEALING), harvestcleric10a);
		ONE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), wavemaster49m);
		TWO_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), wavemaster63m);
		THREE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), wavemaster64m);
		FOUR_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), wavemaster30m);
		FIVE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), wavemaster4m);
		SIX_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), macabredancer2m);
		SEVEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), wavemaster5m);
		EIGHT_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), harvestcleric4m);
		NINE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), harvestcleric3m);
		TEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), wavemaster33m);
		TEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), shadowwarlock11m);
		TWELVE_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), shadowwarlock12m);
		THIRTEEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), shadowwarlock13m);
		FOURTEEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), shadowwarlock14m);
		FIFTEEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), shadowwarlock9m);
		SIXTEEN_WAND_MAP.put(ImmutablePair.of(Tier.MASTER, Element.HEALING), harvestcleric10m);

	}

}
