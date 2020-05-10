package mod.azure.dothack.util;

import baubles.api.BaubleType;
import electroblob.wizardry.constants.Element;
import electroblob.wizardry.constants.Tier;
import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.items.BaublesItem;
import mod.azure.dothack.items.ItemMSStaff;
import mod.azure.dothack.items.base.ItemBaseSword;
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
import net.minecraft.item.Item;
import net.minecraft.item.ItemBow;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public final class DotHackItems {

    public static Item redwand;
    public static Item bladebrandier;
    public static Item dualgunner;
    public static Item datadrain;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        for (int i = 1; i <= 19; i++)
            event.getRegistry().register(bladebrandier = new ItemBaseSword("bladebrandier" + i, (3 + i) / 3));
        for (int i = 1; i <= 25; i++)
            event.getRegistry().register(new ItemBaseSword("dualswords" + i, (2 + i) / 5));
        for (int i = 1; i <= 20; i++)
            event.getRegistry().register(new ItemBaseSword("edgepunisher" + i, (3 + i) / 3));
        for (int i = 1; i <= 9; i++)
            event.getRegistry().registerAll(new ItemBaseSword("flickreaper" + i, (20 + i) / 3),
                    new ItemBaseSword("lordpartizan" + i, (16 + i) / 2));
        for (int i = 1; i <= 11; i++)
            event.getRegistry().register(new ItemBaseSword("tribalgrappler" + i, (20 + i) / 5));
        for (int i = 1; i <= 75; i++)
            event.getRegistry().register(new ItemBaseSword("blademaster" + i, (3 + i) / 10));
        for (int i = 1; i <= 73; i++)
            event.getRegistry().register(new ItemBaseSword("heavyaxeman" + i, (11 + i) / 7));
        for (int i = 1; i <= 54; i++)
            event.getRegistry().register(new ItemBaseSword("heavyblade" + i, (81 + i) / 15));
        for (int i = 1; i <= 41; i++)
            event.getRegistry().register(new ItemBaseSword("heavybladev" + i, (94 + i) / 15));
        for (int i = 1; i <= 71; i++)
            event.getRegistry().register(new ItemBaseSword("longarm" + i, (4 + i) / 9));
        for (int i = 1; i <= 81; i++)
            event.getRegistry().register(new ItemBaseSword("twinblade" + i, (2 + i) / 15));
        for (int i = 1; i <= 4; i++)
            event.getRegistry().register(dualgunner = new ItemBow().setCreativeTab(DotHackTabs.GUNS)
                    .setRegistryName(location("dualgunner" + i)).setTranslationKey("dualgunner" + i));
        for (int i = 1; i <= 18; i++)
            event.getRegistry().register(new ItemBow().setCreativeTab(DotHackTabs.GUNS)
                    .setRegistryName(location("steamgunner" + i)).setTranslationKey("steamgunner" + i));
        DotHackMod.LOGGER.info("Registered normal items");
        if (Loader.isModLoaded("baubles")) {
            event.getRegistry().register(datadrain = new BaublesItem("datadrain", BaubleType.HEAD));
            DotHackMod.LOGGER.info("Registered with Baubles");
        } else {
            event.getRegistry().register(datadrain = new Item().setCreativeTab(DotHackTabs.EXTRA)
                    .setRegistryName(location("datadrain")).setTranslationKey("datadrain"));
            DotHackMod.LOGGER.info("Registered without Baubles");
        }
        if (Loader.isModLoaded("ebwizardry")) {
            event.getRegistry().register(redwand = new ItemEBWand20(Tier.NOVICE, Element.SORCERY, "redwand1")
                    .setCreativeTab(DotHackTabs.MAGIC));
            event.getRegistry().registerAll(
                    new ItemEBWand1(Tier.NOVICE, Element.SORCERY, "wavemaster26").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.NOVICE, Element.SORCERY, "wavemaster21").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.NOVICE, Element.SORCERY, "wavemaster16").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.NOVICE, Element.SORCERY, "wavemaster19").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.NOVICE, Element.SORCERY, "wavemaster15").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.NOVICE, Element.SORCERY, "wavemaster14").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.NOVICE, Element.SORCERY, "wavemaster13").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.NOVICE, Element.SORCERY, "wavemaster12").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.NOVICE, Element.SORCERY, "wavemaster9").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand10(Tier.NOVICE, Element.SORCERY, "wavemaster8").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand11(Tier.NOVICE, Element.SORCERY, "wavemaster2").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand12(Tier.NOVICE, Element.SORCERY, "shadowwarlock3").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand13(Tier.NOVICE, Element.SORCERY, "shadowwarlock4").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand14(Tier.NOVICE, Element.SORCERY, "shadowwarlock5").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand15(Tier.NOVICE, Element.SORCERY, "shadowwarlock6").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand16(Tier.NOVICE, Element.SORCERY, "macabredancer4").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand17(Tier.NOVICE, Element.SORCERY, "macabredancer5").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand18(Tier.NOVICE, Element.SORCERY, "shadowwarlock7").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand19(Tier.NOVICE, Element.SORCERY, "harvestcleric6").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.APPRENTICE, Element.SORCERY, "wavemaster26p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.APPRENTICE, Element.SORCERY, "wavemaster21p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.APPRENTICE, Element.SORCERY, "wavemaster16p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.APPRENTICE, Element.SORCERY, "wavemaster19p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.APPRENTICE, Element.SORCERY, "wavemaster15p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.APPRENTICE, Element.SORCERY, "wavemaster14p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.APPRENTICE, Element.SORCERY, "wavemaster13p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.APPRENTICE, Element.SORCERY, "wavemaster12p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.APPRENTICE, Element.SORCERY, "wavemaster9p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand10(Tier.APPRENTICE, Element.SORCERY, "wavemaster8p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand11(Tier.APPRENTICE, Element.SORCERY, "wavemaster2p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand12(Tier.APPRENTICE, Element.SORCERY, "shadowwarlock3p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand13(Tier.APPRENTICE, Element.SORCERY, "shadowwarlock4p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand14(Tier.APPRENTICE, Element.SORCERY, "shadowwarlock5p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand15(Tier.APPRENTICE, Element.SORCERY, "shadowwarlock6p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand16(Tier.APPRENTICE, Element.SORCERY, "macabredancer4p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand17(Tier.APPRENTICE, Element.SORCERY, "macabredancer5p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand18(Tier.APPRENTICE, Element.SORCERY, "shadowwarlock7p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand19(Tier.APPRENTICE, Element.SORCERY, "harvestcleric6p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand20(Tier.APPRENTICE, Element.SORCERY, "redwand1p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.ADVANCED, Element.SORCERY, "wavemaster26a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.ADVANCED, Element.SORCERY, "wavemaster21a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.ADVANCED, Element.SORCERY, "wavemaster16a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.ADVANCED, Element.SORCERY, "wavemaster19a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.ADVANCED, Element.SORCERY, "wavemaster15a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.ADVANCED, Element.SORCERY, "wavemaster14a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.ADVANCED, Element.SORCERY, "wavemaster13a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.ADVANCED, Element.SORCERY, "wavemaster12a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.ADVANCED, Element.SORCERY, "wavemaster9a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand10(Tier.ADVANCED, Element.SORCERY, "wavemaster8a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand11(Tier.ADVANCED, Element.SORCERY, "wavemaster2a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand12(Tier.ADVANCED, Element.SORCERY, "shadowwarlock3a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand13(Tier.ADVANCED, Element.SORCERY, "shadowwarlock4a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand14(Tier.ADVANCED, Element.SORCERY, "shadowwarlock5a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand15(Tier.ADVANCED, Element.SORCERY, "shadowwarlock6a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand16(Tier.ADVANCED, Element.SORCERY, "macabredancer4a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand17(Tier.ADVANCED, Element.SORCERY, "macabredancer5a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand18(Tier.ADVANCED, Element.SORCERY, "shadowwarlock7a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand19(Tier.ADVANCED, Element.SORCERY, "harvestcleric6a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand20(Tier.ADVANCED, Element.SORCERY, "redwand1a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.MASTER, Element.SORCERY, "wavemaster26m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.MASTER, Element.SORCERY, "wavemaster21m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.MASTER, Element.SORCERY, "wavemaster16m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.MASTER, Element.SORCERY, "wavemaster19m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.MASTER, Element.SORCERY, "wavemaster15m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.MASTER, Element.SORCERY, "wavemaster14m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.MASTER, Element.SORCERY, "wavemaster13m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.MASTER, Element.SORCERY, "wavemaster12m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.MASTER, Element.SORCERY, "wavemaster9m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand10(Tier.MASTER, Element.SORCERY, "wavemaster8m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand11(Tier.MASTER, Element.SORCERY, "wavemaster2m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand12(Tier.MASTER, Element.SORCERY, "shadowwarlock3m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand13(Tier.MASTER, Element.SORCERY, "shadowwarlock4m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand14(Tier.MASTER, Element.SORCERY, "shadowwarlock5m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand15(Tier.MASTER, Element.SORCERY, "shadowwarlock6m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand16(Tier.MASTER, Element.SORCERY, "macabredancer4m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand17(Tier.MASTER, Element.SORCERY, "macabredancer5m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand18(Tier.MASTER, Element.SORCERY, "shadowwarlock7m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand19(Tier.MASTER, Element.SORCERY, "harvestcleric6m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand20(Tier.MASTER, Element.SORCERY, "redwand1m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.NOVICE, Element.MAGIC, "wavemaster42").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.NOVICE, Element.MAGIC, "wavemaster38").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.NOVICE, Element.MAGIC, "wavemaster74").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.NOVICE, Element.MAGIC, "wavemaster43").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.NOVICE, Element.MAGIC, "wavemaster57").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.NOVICE, Element.MAGIC, "wavemaster61").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.NOVICE, Element.MAGIC, "wavemaster62").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.NOVICE, Element.MAGIC, "wavemaster69").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.NOVICE, Element.MAGIC, "wavemaster71").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand10(Tier.NOVICE, Element.MAGIC, "wavemaster24").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand11(Tier.NOVICE, Element.MAGIC, "wavemaster1").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand12(Tier.NOVICE, Element.MAGIC, "shadowwarlock2").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand13(Tier.NOVICE, Element.MAGIC, "wavemaster36").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand14(Tier.NOVICE, Element.MAGIC, "wavemaster37").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand15(Tier.NOVICE, Element.MAGIC, "wavemaster50").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand16(Tier.NOVICE, Element.MAGIC, "wavemaster52").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand17(Tier.NOVICE, Element.MAGIC, "wavemaster65").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand18(Tier.NOVICE, Element.MAGIC, "wavemaster29").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand19(Tier.NOVICE, Element.MAGIC, "wavemaster22").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand20(Tier.NOVICE, Element.MAGIC, "wavemaster35").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand21(Tier.NOVICE, Element.MAGIC, "wavemaster23").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand22(Tier.NOVICE, Element.MAGIC, "wavemaster44").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand23(Tier.NOVICE, Element.MAGIC, "wavemaster41").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand24(Tier.NOVICE, Element.MAGIC, "wavemaster51").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand25(Tier.NOVICE, Element.MAGIC, "wavemaster31").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.APPRENTICE, Element.MAGIC, "wavemaster42p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.APPRENTICE, Element.MAGIC, "wavemaster38p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.APPRENTICE, Element.MAGIC, "wavemaster74p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.APPRENTICE, Element.MAGIC, "wavemaster43p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.APPRENTICE, Element.MAGIC, "wavemaster57p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.APPRENTICE, Element.MAGIC, "wavemaster61p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.APPRENTICE, Element.MAGIC, "wavemaster62p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.APPRENTICE, Element.MAGIC, "wavemaster69p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.APPRENTICE, Element.MAGIC, "wavemaster71p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand10(Tier.APPRENTICE, Element.MAGIC, "wavemaster24p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand11(Tier.APPRENTICE, Element.MAGIC, "wavemaster1p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand12(Tier.APPRENTICE, Element.MAGIC, "shadowwarlock2p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand13(Tier.APPRENTICE, Element.MAGIC, "wavemaster36p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand14(Tier.APPRENTICE, Element.MAGIC, "wavemaster37p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand15(Tier.APPRENTICE, Element.MAGIC, "wavemaster50p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand16(Tier.APPRENTICE, Element.MAGIC, "wavemaster52p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand17(Tier.APPRENTICE, Element.MAGIC, "wavemaster65p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand18(Tier.APPRENTICE, Element.MAGIC, "wavemaster29p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand19(Tier.APPRENTICE, Element.MAGIC, "wavemaster22p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand20(Tier.APPRENTICE, Element.MAGIC, "wavemaster35p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand21(Tier.APPRENTICE, Element.MAGIC, "wavemaster23p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand22(Tier.APPRENTICE, Element.MAGIC, "wavemaster44p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand23(Tier.APPRENTICE, Element.MAGIC, "wavemaster41p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand24(Tier.APPRENTICE, Element.MAGIC, "wavemaster51p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand25(Tier.APPRENTICE, Element.MAGIC, "wavemaster31p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.ADVANCED, Element.MAGIC, "wavemaster42a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.ADVANCED, Element.MAGIC, "wavemaster38a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.ADVANCED, Element.MAGIC, "wavemaster74a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.ADVANCED, Element.MAGIC, "wavemaster43a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.ADVANCED, Element.MAGIC, "wavemaster57a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.ADVANCED, Element.MAGIC, "wavemaster61a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.ADVANCED, Element.MAGIC, "wavemaster62a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.ADVANCED, Element.MAGIC, "wavemaster69a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.ADVANCED, Element.MAGIC, "wavemaster71a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand10(Tier.ADVANCED, Element.MAGIC, "wavemaster24a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand11(Tier.ADVANCED, Element.MAGIC, "wavemaster1a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand12(Tier.ADVANCED, Element.MAGIC, "shadowwarlock2a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand13(Tier.ADVANCED, Element.MAGIC, "wavemaster36a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand14(Tier.ADVANCED, Element.MAGIC, "wavemaster37a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand15(Tier.ADVANCED, Element.MAGIC, "wavemaster50a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand16(Tier.ADVANCED, Element.MAGIC, "wavemaster52a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand17(Tier.ADVANCED, Element.MAGIC, "wavemaster65a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand18(Tier.ADVANCED, Element.MAGIC, "wavemaster29a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand19(Tier.ADVANCED, Element.MAGIC, "wavemaster22a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand20(Tier.ADVANCED, Element.MAGIC, "wavemaster35a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand21(Tier.ADVANCED, Element.MAGIC, "wavemaster23a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand22(Tier.ADVANCED, Element.MAGIC, "wavemaster44a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand23(Tier.ADVANCED, Element.MAGIC, "wavemaster41a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand24(Tier.ADVANCED, Element.MAGIC, "wavemaster51a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand25(Tier.ADVANCED, Element.MAGIC, "wavemaster31a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.MASTER, Element.MAGIC, "wavemaster42m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.MASTER, Element.MAGIC, "wavemaster38m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.MASTER, Element.MAGIC, "wavemaster74m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.MASTER, Element.MAGIC, "wavemaster43m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.MASTER, Element.MAGIC, "wavemaster57m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.MASTER, Element.MAGIC, "wavemaster61m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.MASTER, Element.MAGIC, "wavemaster62m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.MASTER, Element.MAGIC, "wavemaster69m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.MASTER, Element.MAGIC, "wavemaster71m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand10(Tier.MASTER, Element.MAGIC, "wavemaster24m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand11(Tier.MASTER, Element.MAGIC, "wavemaster1m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand12(Tier.MASTER, Element.MAGIC, "shadowwarlock2m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand13(Tier.MASTER, Element.MAGIC, "wavemaster36m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand14(Tier.MASTER, Element.MAGIC, "wavemaster37m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand15(Tier.MASTER, Element.MAGIC, "wavemaster50m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand16(Tier.MASTER, Element.MAGIC, "wavemaster52m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand17(Tier.MASTER, Element.MAGIC, "wavemaster65m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand18(Tier.MASTER, Element.MAGIC, "wavemaster29m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand19(Tier.MASTER, Element.MAGIC, "wavemaster22m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand20(Tier.MASTER, Element.MAGIC, "wavemaster35m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand21(Tier.MASTER, Element.MAGIC, "wavemaster23m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand22(Tier.MASTER, Element.MAGIC, "wavemaster44m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand23(Tier.MASTER, Element.MAGIC, "wavemaster41m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand24(Tier.MASTER, Element.MAGIC, "wavemaster51m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand25(Tier.MASTER, Element.MAGIC, "wavemaster31m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.NOVICE, Element.ICE, "wavemaster27").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.NOVICE, Element.ICE, "wavemaster17").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.NOVICE, Element.ICE, "wavemaster10").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.NOVICE, Element.ICE, "wavemaster6").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.NOVICE, Element.ICE, "wavemaster3").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.NOVICE, Element.ICE, "wavemaster58").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.NOVICE, Element.ICE, "wavemaster53").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.NOVICE, Element.ICE, "wavemaster66").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.NOVICE, Element.ICE, "harvestcleric8").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.APPRENTICE, Element.ICE, "wavemaster27p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.APPRENTICE, Element.ICE, "wavemaster17p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.APPRENTICE, Element.ICE, "wavemaster10p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.APPRENTICE, Element.ICE, "wavemaster6p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.APPRENTICE, Element.ICE, "wavemaster3p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.APPRENTICE, Element.ICE, "wavemaster58p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.APPRENTICE, Element.ICE, "wavemaster53p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.APPRENTICE, Element.ICE, "wavemaster66p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.APPRENTICE, Element.ICE, "harvestcleric8p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.ADVANCED, Element.ICE, "wavemaster27a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.ADVANCED, Element.ICE, "wavemaster17a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.ADVANCED, Element.ICE, "wavemaster10a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.ADVANCED, Element.ICE, "wavemaster6a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.ADVANCED, Element.ICE, "wavemaster3a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.ADVANCED, Element.ICE, "wavemaster58a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.ADVANCED, Element.ICE, "wavemaster53a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.ADVANCED, Element.ICE, "wavemaster66a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.ADVANCED, Element.ICE, "harvestcleric8a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.MASTER, Element.ICE, "wavemaster27m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.MASTER, Element.ICE, "wavemaster17m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.MASTER, Element.ICE, "wavemaster10m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.MASTER, Element.ICE, "wavemaster6m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.MASTER, Element.ICE, "wavemaster3m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.MASTER, Element.ICE, "wavemaster58m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.MASTER, Element.ICE, "wavemaster53m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.MASTER, Element.ICE, "wavemaster66m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.MASTER, Element.ICE, "harvestcleric8m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.ADVANCED, Element.NECROMANCY, "wavemaster60")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.ADVANCED, Element.NECROMANCY, "wavemaster68")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.ADVANCED, Element.NECROMANCY, "wavemaster28")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.ADVANCED, Element.NECROMANCY, "wavemaster7").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.NOVICE, Element.NECROMANCY, "wavemaster40").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.ADVANCED, Element.NECROMANCY, "wavemaster54")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.MASTER, Element.NECROMANCY, "wavemaster55").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.ADVANCED, Element.NECROMANCY, "shadowwarlock1")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.ADVANCED, Element.NECROMANCY, "shadowwarlock8")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand10(Tier.ADVANCED, Element.NECROMANCY, "macabredancer1")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.APPRENTICE, Element.NECROMANCY, "wavemaster60p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.APPRENTICE, Element.NECROMANCY, "wavemaster68p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.APPRENTICE, Element.NECROMANCY, "wavemaster28p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.APPRENTICE, Element.NECROMANCY, "wavemaster7p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.APPRENTICE, Element.NECROMANCY, "wavemaster40p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.APPRENTICE, Element.NECROMANCY, "wavemaster54p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.APPRENTICE, Element.NECROMANCY, "wavemaster55p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.APPRENTICE, Element.NECROMANCY, "shadowwarlock1p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.APPRENTICE, Element.NECROMANCY, "shadowwarlock8p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand10(Tier.APPRENTICE, Element.NECROMANCY, "macabredancer1p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.ADVANCED, Element.NECROMANCY, "wavemaster60a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.ADVANCED, Element.NECROMANCY, "wavemaster68a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.ADVANCED, Element.NECROMANCY, "wavemaster28a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.ADVANCED, Element.NECROMANCY, "wavemaster7a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.ADVANCED, Element.NECROMANCY, "wavemaster40a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.ADVANCED, Element.NECROMANCY, "wavemaster54a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.ADVANCED, Element.NECROMANCY, "wavemaster55a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.ADVANCED, Element.NECROMANCY, "shadowwarlock1a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.ADVANCED, Element.NECROMANCY, "shadowwarlock8a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand10(Tier.ADVANCED, Element.NECROMANCY, "macabredancer1a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.MASTER, Element.NECROMANCY, "wavemaster60m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.MASTER, Element.NECROMANCY, "wavemaster68m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.MASTER, Element.NECROMANCY, "wavemaster28m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.MASTER, Element.NECROMANCY, "wavemaster7m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.MASTER, Element.NECROMANCY, "wavemaster40m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.MASTER, Element.NECROMANCY, "wavemaster54m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.MASTER, Element.NECROMANCY, "wavemaster55m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.MASTER, Element.NECROMANCY, "shadowwarlock1m")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.MASTER, Element.NECROMANCY, "shadowwarlock8m")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand10(Tier.MASTER, Element.NECROMANCY, "macabredancer1m")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.NOVICE, Element.FIRE, "wavemaster59").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.NOVICE, Element.FIRE, "wavemaster70").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.NOVICE, Element.FIRE, "wavemaster25").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.NOVICE, Element.FIRE, "wavemaster18").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.NOVICE, Element.FIRE, "wavemaster11").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.NOVICE, Element.FIRE, "wavemaster32").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.NOVICE, Element.FIRE, "wavemaster39").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.NOVICE, Element.FIRE, "wavemaster67").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.NOVICE, Element.FIRE, "harvestcleric9").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.APPRENTICE, Element.FIRE, "wavemaster59p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.APPRENTICE, Element.FIRE, "wavemaster70p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.APPRENTICE, Element.FIRE, "wavemaster25p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.APPRENTICE, Element.FIRE, "wavemaster18p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.APPRENTICE, Element.FIRE, "wavemaster11p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.APPRENTICE, Element.FIRE, "wavemaster32p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.APPRENTICE, Element.FIRE, "wavemaster39p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.APPRENTICE, Element.FIRE, "wavemaster67p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.APPRENTICE, Element.FIRE, "harvestcleric9p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.ADVANCED, Element.FIRE, "wavemaster59a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.ADVANCED, Element.FIRE, "wavemaster70a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.ADVANCED, Element.FIRE, "wavemaster25a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.ADVANCED, Element.FIRE, "wavemaster18a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.ADVANCED, Element.FIRE, "wavemaster11a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.ADVANCED, Element.FIRE, "wavemaster32a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.ADVANCED, Element.FIRE, "wavemaster39a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.ADVANCED, Element.FIRE, "wavemaster67a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.ADVANCED, Element.FIRE, "harvestcleric9a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.MASTER, Element.FIRE, "wavemaster59m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.MASTER, Element.FIRE, "wavemaster70m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.MASTER, Element.FIRE, "wavemaster25m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.MASTER, Element.FIRE, "wavemaster18m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.MASTER, Element.FIRE, "wavemaster11m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.MASTER, Element.FIRE, "wavemaster32m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.MASTER, Element.FIRE, "wavemaster39m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.MASTER, Element.FIRE, "wavemaster67m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.MASTER, Element.FIRE, "harvestcleric9m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.NOVICE, Element.EARTH, "wavemaster45").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.NOVICE, Element.EARTH, "wavemaster47").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.NOVICE, Element.EARTH, "harvestcleric2").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.NOVICE, Element.EARTH, "wavemaster56").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.NOVICE, Element.EARTH, "wavemaster46").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.NOVICE, Element.EARTH, "wavemaster48").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.NOVICE, Element.EARTH, "harvestcleric5").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.NOVICE, Element.EARTH, "macabredancer3").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.NOVICE, Element.EARTH, "harvestcleric7").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.APPRENTICE, Element.EARTH, "wavemaster45p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.APPRENTICE, Element.EARTH, "wavemaster47p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.APPRENTICE, Element.EARTH, "harvestcleric2p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.APPRENTICE, Element.EARTH, "wavemaster56p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.APPRENTICE, Element.EARTH, "wavemaster46p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.APPRENTICE, Element.EARTH, "wavemaster48p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.APPRENTICE, Element.EARTH, "harvestcleric5p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.APPRENTICE, Element.EARTH, "macabredancer3p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.APPRENTICE, Element.EARTH, "harvestcleric7p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.ADVANCED, Element.EARTH, "wavemaster45a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.ADVANCED, Element.EARTH, "wavemaster47a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.ADVANCED, Element.EARTH, "harvestcleric2a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.ADVANCED, Element.EARTH, "wavemaster56a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.ADVANCED, Element.EARTH, "wavemaster46a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.ADVANCED, Element.EARTH, "wavemaster48a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.ADVANCED, Element.EARTH, "harvestcleric5a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.ADVANCED, Element.EARTH, "macabredancer3a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.ADVANCED, Element.EARTH, "harvestcleric7a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.MASTER, Element.EARTH, "wavemaster45m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.MASTER, Element.EARTH, "wavemaster47m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.MASTER, Element.EARTH, "harvestcleric2m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.MASTER, Element.EARTH, "wavemaster56m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.MASTER, Element.EARTH, "wavemaster46m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.MASTER, Element.EARTH, "wavemaster48m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.MASTER, Element.EARTH, "harvestcleric5m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.MASTER, Element.EARTH, "macabredancer3m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.MASTER, Element.EARTH, "harvestcleric7m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.NOVICE, Element.LIGHTNING, "wavemaster72").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.NOVICE, Element.LIGHTNING, "wavemaster73").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.NOVICE, Element.LIGHTNING, "harvestcleric1").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.NOVICE, Element.LIGHTNING, "wavemaster20").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.NOVICE, Element.LIGHTNING, "wavemaster34").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.NOVICE, Element.LIGHTNING, "shadowwarlock10")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.APPRENTICE, Element.LIGHTNING, "wavemaster72p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.APPRENTICE, Element.LIGHTNING, "wavemaster73p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.APPRENTICE, Element.LIGHTNING, "harvestcleric1p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.APPRENTICE, Element.LIGHTNING, "wavemaster20p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.APPRENTICE, Element.LIGHTNING, "wavemaster34p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.APPRENTICE, Element.LIGHTNING, "shadowwarlock10p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.ADVANCED, Element.LIGHTNING, "wavemaster72a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.ADVANCED, Element.LIGHTNING, "wavemaster73a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.ADVANCED, Element.LIGHTNING, "harvestcleric1a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.ADVANCED, Element.LIGHTNING, "wavemaster20a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.ADVANCED, Element.LIGHTNING, "wavemaster34a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.ADVANCED, Element.LIGHTNING, "shadowwarlock10a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.ADVANCED, Element.LIGHTNING, "wavemaster72m")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.ADVANCED, Element.LIGHTNING, "wavemaster73m")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.ADVANCED, Element.LIGHTNING, "harvestcleric1m")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.ADVANCED, Element.LIGHTNING, "wavemaster20m")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.ADVANCED, Element.LIGHTNING, "wavemaster34m")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.MASTER, Element.LIGHTNING, "shadowwarlock10m")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.NOVICE, Element.HEALING, "wavemaster49").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.NOVICE, Element.HEALING, "wavemaster63").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.NOVICE, Element.HEALING, "wavemaster64").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.NOVICE, Element.HEALING, "wavemaster30").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.NOVICE, Element.HEALING, "wavemaster4").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.NOVICE, Element.HEALING, "macabredancer2").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.NOVICE, Element.HEALING, "wavemaster5").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.NOVICE, Element.HEALING, "harvestcleric4").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.NOVICE, Element.HEALING, "harvestcleric3").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand10(Tier.NOVICE, Element.HEALING, "wavemaster33").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand11(Tier.NOVICE, Element.HEALING, "shadowwarlock11").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand12(Tier.NOVICE, Element.HEALING, "shadowwarlock12").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand13(Tier.NOVICE, Element.HEALING, "shadowwarlock13").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand14(Tier.NOVICE, Element.HEALING, "shadowwarlock14").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand15(Tier.NOVICE, Element.HEALING, "shadowwarlock9").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand16(Tier.NOVICE, Element.HEALING, "harvestcleric10").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.APPRENTICE, Element.HEALING, "wavemaster49p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.APPRENTICE, Element.HEALING, "wavemaster63p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.APPRENTICE, Element.HEALING, "wavemaster64p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.APPRENTICE, Element.HEALING, "wavemaster30p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.APPRENTICE, Element.HEALING, "wavemaster4p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.APPRENTICE, Element.HEALING, "macabredancer2p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.APPRENTICE, Element.HEALING, "wavemaster5p").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.APPRENTICE, Element.HEALING, "harvestcleric4p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.APPRENTICE, Element.HEALING, "harvestcleric3p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand10(Tier.APPRENTICE, Element.HEALING, "wavemaster33p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand11(Tier.APPRENTICE, Element.HEALING, "shadowwarlock11p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand12(Tier.APPRENTICE, Element.HEALING, "shadowwarlock12p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand13(Tier.APPRENTICE, Element.HEALING, "shadowwarlock13p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand14(Tier.APPRENTICE, Element.HEALING, "shadowwarlock14p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand15(Tier.APPRENTICE, Element.HEALING, "shadowwarlock9p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand16(Tier.APPRENTICE, Element.HEALING, "harvestcleric10p")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.ADVANCED, Element.HEALING, "wavemaster49a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.ADVANCED, Element.HEALING, "wavemaster63a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.ADVANCED, Element.HEALING, "wavemaster64a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.ADVANCED, Element.HEALING, "wavemaster30a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.ADVANCED, Element.HEALING, "wavemaster4a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.ADVANCED, Element.HEALING, "macabredancer2a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.ADVANCED, Element.HEALING, "wavemaster5a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.ADVANCED, Element.HEALING, "harvestcleric4a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.ADVANCED, Element.HEALING, "harvestcleric3a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand10(Tier.ADVANCED, Element.HEALING, "wavemaster33a").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand11(Tier.ADVANCED, Element.HEALING, "shadowwarlock11a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand12(Tier.ADVANCED, Element.HEALING, "shadowwarlock12a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand13(Tier.ADVANCED, Element.HEALING, "shadowwarlock13a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand14(Tier.ADVANCED, Element.HEALING, "shadowwarlock14a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand15(Tier.ADVANCED, Element.HEALING, "shadowwarlock9a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand16(Tier.ADVANCED, Element.HEALING, "harvestcleric10a")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand1(Tier.MASTER, Element.HEALING, "wavemaster49m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand2(Tier.MASTER, Element.HEALING, "wavemaster63m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand3(Tier.MASTER, Element.HEALING, "wavemaster64m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand4(Tier.MASTER, Element.HEALING, "wavemaster30m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand5(Tier.MASTER, Element.HEALING, "wavemaster4m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand6(Tier.MASTER, Element.HEALING, "macabredancer2m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand7(Tier.MASTER, Element.HEALING, "wavemaster5m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand8(Tier.MASTER, Element.HEALING, "harvestcleric4m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand9(Tier.MASTER, Element.HEALING, "harvestcleric3m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand10(Tier.MASTER, Element.HEALING, "wavemaster33m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand11(Tier.MASTER, Element.HEALING, "shadowwarlock11m")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand12(Tier.MASTER, Element.HEALING, "shadowwarlock12m")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand13(Tier.MASTER, Element.HEALING, "shadowwarlock13m")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand14(Tier.MASTER, Element.HEALING, "shadowwarlock14m")
                            .setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand15(Tier.MASTER, Element.HEALING, "shadowwarlock9m").setCreativeTab(DotHackTabs.MAGIC),
                    new ItemEBWand16(Tier.MASTER, Element.HEALING, "harvestcleric10m")
                            .setCreativeTab(DotHackTabs.MAGIC));
            DotHackMod.LOGGER.info("Registered with EB");
        } else if (Loader.isModLoaded("mmorpg")) {
            for (int i = 1; i <= 10; i++)
                event.getRegistry().register(new ItemMSStaff().setCreativeTab(DotHackTabs.MAGIC)
                        .setRegistryName(location("harvestcleric" + i)));
            for (int i = 1; i <= 5; i++)
                event.getRegistry().register(new ItemMSStaff().setCreativeTab(DotHackTabs.MAGIC)
                        .setRegistryName(location("macabredancer" + i)));
            for (int i = 1; i <= 14; i++)
                event.getRegistry().register(new ItemMSStaff().setCreativeTab(DotHackTabs.MAGIC)
                        .setRegistryName(location("shadowwarlock" + i)));
            for (int i = 1; i <= 74; i++)
                event.getRegistry().register(new ItemMSStaff().setCreativeTab(DotHackTabs.MAGIC)
                        .setRegistryName(location("wavemaster" + i)));
            event.getRegistry().register(redwand = new ItemMSStaff().setCreativeTab(DotHackTabs.MAGIC)
                    .setRegistryName(location("redwand1")));
            DotHackMod.LOGGER.info("Registered with M&S");
        } else {
            for (int i = 1; i <= 10; i++)
                event.getRegistry().register(new ItemBow().setCreativeTab(DotHackTabs.MAGIC)
                        .setRegistryName(location("harvestcleric" + i)).setTranslationKey("harvestcleric" + i));
            for (int i = 1; i <= 5; i++)
                event.getRegistry().register(new ItemBow().setCreativeTab(DotHackTabs.MAGIC)
                        .setRegistryName(location("macabredancer" + i)).setTranslationKey("macabredancer" + i));
            for (int i = 1; i <= 14; i++)
                event.getRegistry().register(new ItemBow().setCreativeTab(DotHackTabs.MAGIC)
                        .setRegistryName(location("shadowwarlock" + i)).setTranslationKey("shadowwarlock" + i));
            for (int i = 1; i <= 74; i++)
                event.getRegistry().register(new ItemBow().setCreativeTab(DotHackTabs.MAGIC)
                        .setRegistryName(location("wavemaster" + i)).setTranslationKey("wavemaster" + i));
            event.getRegistry().register(redwand = new ItemBow().setCreativeTab(DotHackTabs.MAGIC)
                    .setRegistryName(location("redwand1")).setTranslationKey("redwand1"));
            DotHackMod.LOGGER.info("Registered without EB or M&S");
        }

    }

    public static ResourceLocation location(String name) {
        return new ResourceLocation(DotHackMod.MODID, name);
    }

}
