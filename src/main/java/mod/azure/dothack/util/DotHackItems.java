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
            event.getRegistry()
                    .register(redwand = new ItemEBWand20(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("redwand1")).setTranslationKey("redwand1"));
            event.getRegistry().registerAll(
                    new ItemEBWand1(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster26")).setTranslationKey("wavemaster26"),
                    new ItemEBWand2(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster21")).setTranslationKey("wavemaster21"),
                    new ItemEBWand3(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster16")).setTranslationKey("wavemaster16"),
                    new ItemEBWand4(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster19")).setTranslationKey("wavemaster19"),
                    new ItemEBWand5(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster15")).setTranslationKey("wavemaster15"),
                    new ItemEBWand6(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster14")).setTranslationKey("wavemaster14"),
                    new ItemEBWand7(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster13")).setTranslationKey("wavemaster13"),
                    new ItemEBWand8(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster12")).setTranslationKey("wavemaster12"),
                    new ItemEBWand9(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster9")).setTranslationKey("wavemaster9"),
                    new ItemEBWand10(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster8")).setTranslationKey("wavemaster8"),
                    new ItemEBWand11(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster2")).setTranslationKey("wavemaster2"),
                    new ItemEBWand12(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock3")).setTranslationKey("shadowwarlock3"),
                    new ItemEBWand13(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock4")).setTranslationKey("shadowwarlock4"),
                    new ItemEBWand14(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock5")).setTranslationKey("shadowwarlock5"),
                    new ItemEBWand15(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock6")).setTranslationKey("shadowwarlock6"),
                    new ItemEBWand16(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer4")).setTranslationKey("macabredancer4"),
                    new ItemEBWand17(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer5")).setTranslationKey("macabredancer5"),
                    new ItemEBWand18(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock7")).setTranslationKey("shadowwarlock7"),
                    new ItemEBWand19(Tier.NOVICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric6")).setTranslationKey("harvestcleric6"),
                    new ItemEBWand1(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster26p")).setTranslationKey("wavemaster26p"),
                    new ItemEBWand2(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster21p")).setTranslationKey("wavemaster21p"),
                    new ItemEBWand3(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster16p")).setTranslationKey("wavemaster16p"),
                    new ItemEBWand4(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster19p")).setTranslationKey("wavemaster19p"),
                    new ItemEBWand5(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster15p")).setTranslationKey("wavemaster15p"),
                    new ItemEBWand6(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster14p")).setTranslationKey("wavemaster14p"),
                    new ItemEBWand7(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster13p")).setTranslationKey("wavemaster13p"),
                    new ItemEBWand8(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster12p")).setTranslationKey("wavemaster12p"),
                    new ItemEBWand9(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster9p")).setTranslationKey("wavemaster9p"),
                    new ItemEBWand10(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster8p")).setTranslationKey("wavemaster8p"),
                    new ItemEBWand11(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster2p")).setTranslationKey("wavemaster2p"),
                    new ItemEBWand12(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock3p")).setTranslationKey("shadowwarlock3p"),
                    new ItemEBWand13(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock4p")).setTranslationKey("shadowwarlock4p"),
                    new ItemEBWand14(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock5p")).setTranslationKey("shadowwarlock5p"),
                    new ItemEBWand15(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock6p")).setTranslationKey("shadowwarlock6p"),
                    new ItemEBWand16(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer4p")).setTranslationKey("macabredancer4p"),
                    new ItemEBWand17(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer5p")).setTranslationKey("macabredancer5p"),
                    new ItemEBWand18(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock7p")).setTranslationKey("shadowwarlock7p"),
                    new ItemEBWand19(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric6p")).setTranslationKey("harvestcleric6p"),
                    new ItemEBWand20(Tier.APPRENTICE, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("redwand1p")).setTranslationKey("redwand1p"),
                    new ItemEBWand1(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster26a")).setTranslationKey("wavemaster26a"),
                    new ItemEBWand2(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster21a")).setTranslationKey("wavemaster21a"),
                    new ItemEBWand3(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster16a")).setTranslationKey("wavemaster16a"),
                    new ItemEBWand4(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster19a")).setTranslationKey("wavemaster19a"),
                    new ItemEBWand5(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster15a")).setTranslationKey("wavemaster15a"),
                    new ItemEBWand6(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster14a")).setTranslationKey("wavemaster14a"),
                    new ItemEBWand7(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster13a")).setTranslationKey("wavemaster13a"),
                    new ItemEBWand8(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster12a")).setTranslationKey("wavemaster12a"),
                    new ItemEBWand9(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster9a")).setTranslationKey("wavemaster9a"),
                    new ItemEBWand10(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster8a")).setTranslationKey("wavemaster8a"),
                    new ItemEBWand11(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster2a")).setTranslationKey("wavemaster2a"),
                    new ItemEBWand12(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock3a")).setTranslationKey("shadowwarlock3a"),
                    new ItemEBWand13(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock4a")).setTranslationKey("shadowwarlock4a"),
                    new ItemEBWand14(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock5a")).setTranslationKey("shadowwarlock5a"),
                    new ItemEBWand15(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock6a")).setTranslationKey("shadowwarlock6a"),
                    new ItemEBWand16(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer4a")).setTranslationKey("macabredancer4a"),
                    new ItemEBWand17(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer5a")).setTranslationKey("macabredancer5a"),
                    new ItemEBWand18(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock7a")).setTranslationKey("shadowwarlock7a"),
                    new ItemEBWand19(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric6a")).setTranslationKey("harvestcleric6a"),
                    new ItemEBWand20(Tier.ADVANCED, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("redwand1a")).setTranslationKey("redwand1a"),
                    new ItemEBWand1(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster26m")).setTranslationKey("wavemaster26m"),
                    new ItemEBWand2(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster21m")).setTranslationKey("wavemaster21m"),
                    new ItemEBWand3(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster16m")).setTranslationKey("wavemaster16m"),
                    new ItemEBWand4(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster19m")).setTranslationKey("wavemaster19m"),
                    new ItemEBWand5(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster15m")).setTranslationKey("wavemaster15m"),
                    new ItemEBWand6(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster14m")).setTranslationKey("wavemaster14m"),
                    new ItemEBWand7(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster13m")).setTranslationKey("wavemaster13m"),
                    new ItemEBWand8(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster12m")).setTranslationKey("wavemaster12m"),
                    new ItemEBWand9(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster9m")).setTranslationKey("wavemaster9m"),
                    new ItemEBWand10(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster8m")).setTranslationKey("wavemaster8m"),
                    new ItemEBWand11(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster2m")).setTranslationKey("wavemaster2m"),
                    new ItemEBWand12(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock3m")).setTranslationKey("shadowwarlock3m"),
                    new ItemEBWand13(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock4m")).setTranslationKey("shadowwarlock4m"),
                    new ItemEBWand14(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock5m")).setTranslationKey("shadowwarlock5m"),
                    new ItemEBWand15(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock6m")).setTranslationKey("shadowwarlock6m"),
                    new ItemEBWand16(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer4m")).setTranslationKey("macabredancer4m"),
                    new ItemEBWand17(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer5m")).setTranslationKey("macabredancer5m"),
                    new ItemEBWand18(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock7m")).setTranslationKey("shadowwarlock7m"),
                    new ItemEBWand19(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric6m")).setTranslationKey("harvestcleric6m"),
                    new ItemEBWand20(Tier.MASTER, Element.SORCERY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("redwand1m")).setTranslationKey("redwand1m"),
                    new ItemEBWand1(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster42")).setTranslationKey("wavemaster42"),
                    new ItemEBWand2(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster38")).setTranslationKey("wavemaster38"),
                    new ItemEBWand3(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster74")).setTranslationKey("wavemaster74"),
                    new ItemEBWand4(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster43")).setTranslationKey("wavemaster43"),
                    new ItemEBWand5(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster57")).setTranslationKey("wavemaster57"),
                    new ItemEBWand6(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster61")).setTranslationKey("wavemaster61"),
                    new ItemEBWand7(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster62")).setTranslationKey("wavemaster62"),
                    new ItemEBWand8(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster69")).setTranslationKey("wavemaster69"),
                    new ItemEBWand9(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster71")).setTranslationKey("wavemaster71"),
                    new ItemEBWand10(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster24")).setTranslationKey("wavemaster24"),
                    new ItemEBWand11(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster1")).setTranslationKey("wavemaster1"),
                    new ItemEBWand12(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock2")).setTranslationKey("shadowwarlock2"),
                    new ItemEBWand13(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster36")).setTranslationKey("wavemaster36"),
                    new ItemEBWand14(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster37")).setTranslationKey("wavemaster37"),
                    new ItemEBWand15(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster50")).setTranslationKey("wavemaster50"),
                    new ItemEBWand16(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster52")).setTranslationKey("wavemaster52"),
                    new ItemEBWand17(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster65")).setTranslationKey("wavemaster65"),
                    new ItemEBWand18(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster29")).setTranslationKey("wavemaster29"),
                    new ItemEBWand19(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster22")).setTranslationKey("wavemaster22"),
                    new ItemEBWand20(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster35")).setTranslationKey("wavemaster35"),
                    new ItemEBWand21(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster23")).setTranslationKey("wavemaster23"),
                    new ItemEBWand22(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster44")).setTranslationKey("wavemaster44"),
                    new ItemEBWand23(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster41")).setTranslationKey("wavemaster41"),
                    new ItemEBWand24(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster51")).setTranslationKey("wavemaster51"),
                    new ItemEBWand25(Tier.NOVICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster31")).setTranslationKey("wavemaster31"),
                    new ItemEBWand1(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster42p")).setTranslationKey("wavemaster42p"),
                    new ItemEBWand2(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster38p")).setTranslationKey("wavemaster38p"),
                    new ItemEBWand3(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster74p")).setTranslationKey("wavemaster74p"),
                    new ItemEBWand4(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster43p")).setTranslationKey("wavemaster43p"),
                    new ItemEBWand5(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster57p")).setTranslationKey("wavemaster57p"),
                    new ItemEBWand6(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster61p")).setTranslationKey("wavemaster61p"),
                    new ItemEBWand7(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster62p")).setTranslationKey("wavemaster62p"),
                    new ItemEBWand8(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster69p")).setTranslationKey("wavemaster69p"),
                    new ItemEBWand9(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster71p")).setTranslationKey("wavemaster71p"),
                    new ItemEBWand10(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster24p")).setTranslationKey("wavemaster24p"),
                    new ItemEBWand11(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster1p")).setTranslationKey("wavemaster1p"),
                    new ItemEBWand12(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock2p")).setTranslationKey("shadowwarlock2p"),
                    new ItemEBWand13(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster36p")).setTranslationKey("wavemaster36p"),
                    new ItemEBWand14(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster37p")).setTranslationKey("wavemaster37p"),
                    new ItemEBWand15(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster50p")).setTranslationKey("wavemaster50p"),
                    new ItemEBWand16(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster52p")).setTranslationKey("wavemaster52p"),
                    new ItemEBWand17(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster65p")).setTranslationKey("wavemaster65p"),
                    new ItemEBWand18(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster29p")).setTranslationKey("wavemaster29p"),
                    new ItemEBWand19(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster22p")).setTranslationKey("wavemaster22p"),
                    new ItemEBWand20(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster35p")).setTranslationKey("wavemaster35p"),
                    new ItemEBWand21(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster23p")).setTranslationKey("wavemaster23p"),
                    new ItemEBWand22(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster44p")).setTranslationKey("wavemaster44p"),
                    new ItemEBWand23(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster41p")).setTranslationKey("wavemaster41p"),
                    new ItemEBWand24(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster51p")).setTranslationKey("wavemaster51p"),
                    new ItemEBWand25(Tier.APPRENTICE, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster31p")).setTranslationKey("wavemaster31p"),
                    new ItemEBWand1(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster42a")).setTranslationKey("wavemaster42a"),
                    new ItemEBWand2(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster38a")).setTranslationKey("wavemaster38a"),
                    new ItemEBWand3(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster74a")).setTranslationKey("wavemaster74a"),
                    new ItemEBWand4(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster43a")).setTranslationKey("wavemaster43a"),
                    new ItemEBWand5(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster57a")).setTranslationKey("wavemaster57a"),
                    new ItemEBWand6(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster61a")).setTranslationKey("wavemaster61a"),
                    new ItemEBWand7(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster62a")).setTranslationKey("wavemaster62a"),
                    new ItemEBWand8(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster69a")).setTranslationKey("wavemaster69a"),
                    new ItemEBWand9(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster71a")).setTranslationKey("wavemaster71a"),
                    new ItemEBWand10(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster24a")).setTranslationKey("wavemaster24a"),
                    new ItemEBWand11(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster1a")).setTranslationKey("wavemaster1a"),
                    new ItemEBWand12(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock2a")).setTranslationKey("shadowwarlock2a"),
                    new ItemEBWand13(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster36a")).setTranslationKey("wavemaster36a"),
                    new ItemEBWand14(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster37a")).setTranslationKey("wavemaster37a"),
                    new ItemEBWand15(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster50a")).setTranslationKey("wavemaster50a"),
                    new ItemEBWand16(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster52a")).setTranslationKey("wavemaster52a"),
                    new ItemEBWand17(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster65a")).setTranslationKey("wavemaster65a"),
                    new ItemEBWand18(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster29a")).setTranslationKey("wavemaster29a"),
                    new ItemEBWand19(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster22a")).setTranslationKey("wavemaster22a"),
                    new ItemEBWand20(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster35a")).setTranslationKey("wavemaster35a"),
                    new ItemEBWand21(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster23a")).setTranslationKey("wavemaster23a"),
                    new ItemEBWand22(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster44a")).setTranslationKey("wavemaster44a"),
                    new ItemEBWand23(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster41a")).setTranslationKey("wavemaster41a"),
                    new ItemEBWand24(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster51a")).setTranslationKey("wavemaster51a"),
                    new ItemEBWand25(Tier.ADVANCED, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster31a")).setTranslationKey("wavemaster31a"),
                    new ItemEBWand1(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster42m")).setTranslationKey("wavemaster42m"),
                    new ItemEBWand2(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster38m")).setTranslationKey("wavemaster38m"),
                    new ItemEBWand3(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster74m")).setTranslationKey("wavemaster74m"),
                    new ItemEBWand4(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster43m")).setTranslationKey("wavemaster43m"),
                    new ItemEBWand5(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster57m")).setTranslationKey("wavemaster57m"),
                    new ItemEBWand6(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster61m")).setTranslationKey("wavemaster61m"),
                    new ItemEBWand7(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster62m")).setTranslationKey("wavemaster62m"),
                    new ItemEBWand8(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster69m")).setTranslationKey("wavemaster69m"),
                    new ItemEBWand9(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster71m")).setTranslationKey("wavemaster71m"),
                    new ItemEBWand10(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster24m")).setTranslationKey("wavemaster24m"),
                    new ItemEBWand11(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster1m")).setTranslationKey("wavemaster1m"),
                    new ItemEBWand12(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock2m")).setTranslationKey("shadowwarlock2m"),
                    new ItemEBWand13(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster36m")).setTranslationKey("wavemaster36m"),
                    new ItemEBWand14(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster37m")).setTranslationKey("wavemaster37m"),
                    new ItemEBWand15(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster50m")).setTranslationKey("wavemaster50m"),
                    new ItemEBWand16(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster52m")).setTranslationKey("wavemaster52m"),
                    new ItemEBWand17(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster65m")).setTranslationKey("wavemaster65m"),
                    new ItemEBWand18(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster29m")).setTranslationKey("wavemaster29m"),
                    new ItemEBWand19(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster22m")).setTranslationKey("wavemaster22m"),
                    new ItemEBWand20(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster35m")).setTranslationKey("wavemaster35m"),
                    new ItemEBWand21(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster23m")).setTranslationKey("wavemaster23m"),
                    new ItemEBWand22(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster44m")).setTranslationKey("wavemaster44m"),
                    new ItemEBWand23(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster41m")).setTranslationKey("wavemaster41m"),
                    new ItemEBWand24(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster51m")).setTranslationKey("wavemaster51m"),
                    new ItemEBWand25(Tier.MASTER, Element.MAGIC).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster31m")).setTranslationKey("wavemaster31m"),
                    new ItemEBWand1(Tier.NOVICE, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster27")).setTranslationKey("wavemaster27"),
                    new ItemEBWand2(Tier.NOVICE, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster17")).setTranslationKey("wavemaster17"),
                    new ItemEBWand3(Tier.NOVICE, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster10")).setTranslationKey("wavemaster10"),
                    new ItemEBWand4(Tier.NOVICE, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster6")).setTranslationKey("wavemaster6"),
                    new ItemEBWand5(Tier.NOVICE, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster3")).setTranslationKey("wavemaster3"),
                    new ItemEBWand6(Tier.NOVICE, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster58")).setTranslationKey("wavemaster58"),
                    new ItemEBWand7(Tier.NOVICE, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster53")).setTranslationKey("wavemaster53"),
                    new ItemEBWand8(Tier.NOVICE, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster66")).setTranslationKey("wavemaster66"),
                    new ItemEBWand9(Tier.NOVICE, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric8")).setTranslationKey("harvestcleric8"),
                    new ItemEBWand1(Tier.APPRENTICE, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster27p")).setTranslationKey("wavemaster27p"),
                    new ItemEBWand2(Tier.APPRENTICE, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster17p")).setTranslationKey("wavemaster17p"),
                    new ItemEBWand3(Tier.APPRENTICE, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster10p")).setTranslationKey("wavemaster10p"),
                    new ItemEBWand4(Tier.APPRENTICE, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster6p")).setTranslationKey("wavemaster6p"),
                    new ItemEBWand5(Tier.APPRENTICE, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster3p")).setTranslationKey("wavemaster3p"),
                    new ItemEBWand6(Tier.APPRENTICE, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster58p")).setTranslationKey("wavemaster58p"),
                    new ItemEBWand7(Tier.APPRENTICE, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster53p")).setTranslationKey("wavemaster53p"),
                    new ItemEBWand8(Tier.APPRENTICE, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster66p")).setTranslationKey("wavemaster66p"),
                    new ItemEBWand9(Tier.APPRENTICE, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric8p")).setTranslationKey("harvestcleric8p"),
                    new ItemEBWand1(Tier.ADVANCED, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster27a")).setTranslationKey("wavemaster27a"),
                    new ItemEBWand2(Tier.ADVANCED, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster17a")).setTranslationKey("wavemaster17a"),
                    new ItemEBWand3(Tier.ADVANCED, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster10a")).setTranslationKey("wavemaster10a"),
                    new ItemEBWand4(Tier.ADVANCED, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster6a")).setTranslationKey("wavemaster6a"),
                    new ItemEBWand5(Tier.ADVANCED, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster3a")).setTranslationKey("wavemaster3a"),
                    new ItemEBWand6(Tier.ADVANCED, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster58a")).setTranslationKey("wavemaster58a"),
                    new ItemEBWand7(Tier.ADVANCED, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster53a")).setTranslationKey("wavemaster53a"),
                    new ItemEBWand8(Tier.ADVANCED, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster66a")).setTranslationKey("wavemaster66a"),
                    new ItemEBWand9(Tier.ADVANCED, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric8a")).setTranslationKey("harvestcleric8a"),
                    new ItemEBWand1(Tier.MASTER, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster27m")).setTranslationKey("wavemaster27m"),
                    new ItemEBWand2(Tier.MASTER, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster17m")).setTranslationKey("wavemaster17m"),
                    new ItemEBWand3(Tier.MASTER, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster10m")).setTranslationKey("wavemaster10m"),
                    new ItemEBWand4(Tier.MASTER, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster6m")).setTranslationKey("wavemaster6m"),
                    new ItemEBWand5(Tier.MASTER, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster3m")).setTranslationKey("wavemaster3m"),
                    new ItemEBWand6(Tier.MASTER, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster58m")).setTranslationKey("wavemaster58m"),
                    new ItemEBWand7(Tier.MASTER, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster53m")).setTranslationKey("wavemaster53m"),
                    new ItemEBWand8(Tier.MASTER, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster66m")).setTranslationKey("wavemaster66m"),
                    new ItemEBWand9(Tier.MASTER, Element.ICE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric8m")).setTranslationKey("harvestcleric8m"),
                    new ItemEBWand1(Tier.ADVANCED, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster60")).setTranslationKey("wavemaster60"),
                    new ItemEBWand2(Tier.ADVANCED, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster68")).setTranslationKey("wavemaster68"),
                    new ItemEBWand3(Tier.ADVANCED, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster28")).setTranslationKey("wavemaster28"),
                    new ItemEBWand4(Tier.ADVANCED, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster7")).setTranslationKey("wavemaster7"),
                    new ItemEBWand5(Tier.NOVICE, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster40")).setTranslationKey("wavemaster40"),
                    new ItemEBWand6(Tier.ADVANCED, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster54")).setTranslationKey("wavemaster54"),
                    new ItemEBWand7(Tier.MASTER, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster55")).setTranslationKey("wavemaster55"),
                    new ItemEBWand8(Tier.ADVANCED, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock1")).setTranslationKey("shadowwarlock1"),
                    new ItemEBWand9(Tier.ADVANCED, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock8")).setTranslationKey("shadowwarlock8"),
                    new ItemEBWand10(Tier.ADVANCED, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer1")).setTranslationKey("macabredancer1"),
                    new ItemEBWand1(Tier.APPRENTICE, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster60p")).setTranslationKey("wavemaster60p"),
                    new ItemEBWand2(Tier.APPRENTICE, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster68p")).setTranslationKey("wavemaster68p"),
                    new ItemEBWand3(Tier.APPRENTICE, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster28p")).setTranslationKey("wavemaster28p"),
                    new ItemEBWand4(Tier.APPRENTICE, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster7p")).setTranslationKey("wavemaster7p"),
                    new ItemEBWand5(Tier.APPRENTICE, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster40p")).setTranslationKey("wavemaster40p"),
                    new ItemEBWand6(Tier.APPRENTICE, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster54p")).setTranslationKey("wavemaster54p"),
                    new ItemEBWand7(Tier.APPRENTICE, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster55p")).setTranslationKey("wavemaster55p"),
                    new ItemEBWand8(Tier.APPRENTICE, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock1p")).setTranslationKey("shadowwarlock1p"),
                    new ItemEBWand9(Tier.APPRENTICE, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock8p")).setTranslationKey("shadowwarlock8p"),
                    new ItemEBWand10(Tier.APPRENTICE, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer1p")).setTranslationKey("macabredancer1p"),
                    new ItemEBWand1(Tier.ADVANCED, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster60a")).setTranslationKey("wavemaster60a"),
                    new ItemEBWand2(Tier.ADVANCED, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster68a")).setTranslationKey("wavemaster68a"),
                    new ItemEBWand3(Tier.ADVANCED, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster28a")).setTranslationKey("wavemaster28a"),
                    new ItemEBWand4(Tier.ADVANCED, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster7a")).setTranslationKey("wavemaster7a"),
                    new ItemEBWand5(Tier.ADVANCED, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster40a")).setTranslationKey("wavemaster40a"),
                    new ItemEBWand6(Tier.ADVANCED, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster54a")).setTranslationKey("wavemaster54a"),
                    new ItemEBWand7(Tier.ADVANCED, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster55a")).setTranslationKey("wavemaster55a"),
                    new ItemEBWand8(Tier.ADVANCED, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock1a")).setTranslationKey("shadowwarlock1a"),
                    new ItemEBWand9(Tier.ADVANCED, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock8a")).setTranslationKey("shadowwarlock8a"),
                    new ItemEBWand10(Tier.ADVANCED, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer1a")).setTranslationKey("macabredancer1a"),
                    new ItemEBWand1(Tier.MASTER, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster60m")).setTranslationKey("wavemaster60m"),
                    new ItemEBWand2(Tier.MASTER, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster68m")).setTranslationKey("wavemaster68m"),
                    new ItemEBWand3(Tier.MASTER, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster28m")).setTranslationKey("wavemaster28m"),
                    new ItemEBWand4(Tier.MASTER, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster7m")).setTranslationKey("wavemaster7m"),
                    new ItemEBWand5(Tier.MASTER, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster40m")).setTranslationKey("wavemaster40m"),
                    new ItemEBWand6(Tier.MASTER, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster54m")).setTranslationKey("wavemaster54m"),
                    new ItemEBWand7(Tier.MASTER, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster55m")).setTranslationKey("wavemaster55m"),
                    new ItemEBWand8(Tier.MASTER, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock1m")).setTranslationKey("shadowwarlock1m"),
                    new ItemEBWand9(Tier.MASTER, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock8m")).setTranslationKey("shadowwarlock8m"),
                    new ItemEBWand10(Tier.MASTER, Element.NECROMANCY).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer1m")).setTranslationKey("macabredancer1m"),
                    new ItemEBWand1(Tier.NOVICE, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster59")).setTranslationKey("wavemaster59"),
                    new ItemEBWand2(Tier.NOVICE, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster70")).setTranslationKey("wavemaster70"),
                    new ItemEBWand3(Tier.NOVICE, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster25")).setTranslationKey("wavemaster25"),
                    new ItemEBWand4(Tier.NOVICE, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster18")).setTranslationKey("wavemaster18"),
                    new ItemEBWand5(Tier.NOVICE, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster11")).setTranslationKey("wavemaster11"),
                    new ItemEBWand6(Tier.NOVICE, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster32")).setTranslationKey("wavemaster32"),
                    new ItemEBWand7(Tier.NOVICE, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster39")).setTranslationKey("wavemaster39"),
                    new ItemEBWand8(Tier.NOVICE, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster67")).setTranslationKey("wavemaster67"),
                    new ItemEBWand9(Tier.NOVICE, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric9")).setTranslationKey("harvestcleric9"),
                    new ItemEBWand1(Tier.APPRENTICE, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster59p")).setTranslationKey("wavemaster59p"),
                    new ItemEBWand2(Tier.APPRENTICE, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster70p")).setTranslationKey("wavemaster70p"),
                    new ItemEBWand3(Tier.APPRENTICE, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster25p")).setTranslationKey("wavemaster25p"),
                    new ItemEBWand4(Tier.APPRENTICE, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster18p")).setTranslationKey("wavemaster18p"),
                    new ItemEBWand5(Tier.APPRENTICE, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster11p")).setTranslationKey("wavemaster11p"),
                    new ItemEBWand6(Tier.APPRENTICE, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster32p")).setTranslationKey("wavemaster32p"),
                    new ItemEBWand7(Tier.APPRENTICE, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster39p")).setTranslationKey("wavemaster39p"),
                    new ItemEBWand8(Tier.APPRENTICE, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster67p")).setTranslationKey("wavemaster67p"),
                    new ItemEBWand9(Tier.APPRENTICE, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric9p")).setTranslationKey("harvestcleric9p"),
                    new ItemEBWand1(Tier.ADVANCED, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster59a")).setTranslationKey("wavemaster59a"),
                    new ItemEBWand2(Tier.ADVANCED, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster70a")).setTranslationKey("wavemaster70a"),
                    new ItemEBWand3(Tier.ADVANCED, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster25a")).setTranslationKey("wavemaster25a"),
                    new ItemEBWand4(Tier.ADVANCED, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster18a")).setTranslationKey("wavemaster18a"),
                    new ItemEBWand5(Tier.ADVANCED, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster11a")).setTranslationKey("wavemaster11a"),
                    new ItemEBWand6(Tier.ADVANCED, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster32a")).setTranslationKey("wavemaster32a"),
                    new ItemEBWand7(Tier.ADVANCED, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster39a")).setTranslationKey("wavemaster39a"),
                    new ItemEBWand8(Tier.ADVANCED, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster67a")).setTranslationKey("wavemaster67a"),
                    new ItemEBWand9(Tier.ADVANCED, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric9a")).setTranslationKey("harvestcleric9a"),
                    new ItemEBWand1(Tier.MASTER, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster59m")).setTranslationKey("wavemaster59m"),
                    new ItemEBWand2(Tier.MASTER, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster70m")).setTranslationKey("wavemaster70m"),
                    new ItemEBWand3(Tier.MASTER, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster25m")).setTranslationKey("wavemaster25m"),
                    new ItemEBWand4(Tier.MASTER, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster18m")).setTranslationKey("wavemaster18m"),
                    new ItemEBWand5(Tier.MASTER, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster11m")).setTranslationKey("wavemaster11m"),
                    new ItemEBWand6(Tier.MASTER, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster32m")).setTranslationKey("wavemaster32m"),
                    new ItemEBWand7(Tier.MASTER, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster39m")).setTranslationKey("wavemaster39m"),
                    new ItemEBWand8(Tier.MASTER, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster67m")).setTranslationKey("wavemaster67m"),
                    new ItemEBWand9(Tier.MASTER, Element.FIRE).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric9m")).setTranslationKey("harvestcleric9m"),
                    new ItemEBWand1(Tier.NOVICE, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster45")).setTranslationKey("wavemaster45"),
                    new ItemEBWand2(Tier.NOVICE, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster47")).setTranslationKey("wavemaster47"),
                    new ItemEBWand3(Tier.NOVICE, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric2")).setTranslationKey("harvestcleric2"),
                    new ItemEBWand4(Tier.NOVICE, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster56")).setTranslationKey("wavemaster56"),
                    new ItemEBWand5(Tier.NOVICE, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster46")).setTranslationKey("wavemaster46"),
                    new ItemEBWand6(Tier.NOVICE, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster48")).setTranslationKey("wavemaster48"),
                    new ItemEBWand7(Tier.NOVICE, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric5")).setTranslationKey("harvestcleric5"),
                    new ItemEBWand8(Tier.NOVICE, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer3")).setTranslationKey("macabredancer3"),
                    new ItemEBWand9(Tier.NOVICE, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric7")).setTranslationKey("harvestcleric7"),
                    new ItemEBWand1(Tier.APPRENTICE, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster45p")).setTranslationKey("wavemaster45p"),
                    new ItemEBWand2(Tier.APPRENTICE, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster47p")).setTranslationKey("wavemaster47p"),
                    new ItemEBWand3(Tier.APPRENTICE, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric2p")).setTranslationKey("harvestcleric2p"),
                    new ItemEBWand4(Tier.APPRENTICE, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster56p")).setTranslationKey("wavemaster56p"),
                    new ItemEBWand5(Tier.APPRENTICE, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster46p")).setTranslationKey("wavemaster46p"),
                    new ItemEBWand6(Tier.APPRENTICE, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster48p")).setTranslationKey("wavemaster48p"),
                    new ItemEBWand7(Tier.APPRENTICE, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric5p")).setTranslationKey("harvestcleric5p"),
                    new ItemEBWand8(Tier.APPRENTICE, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer3p")).setTranslationKey("macabredancer3p"),
                    new ItemEBWand9(Tier.APPRENTICE, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric7p")).setTranslationKey("harvestcleric7p"),
                    new ItemEBWand1(Tier.ADVANCED, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster45a")).setTranslationKey("wavemaster45a"),
                    new ItemEBWand2(Tier.ADVANCED, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster47a")).setTranslationKey("wavemaster47a"),
                    new ItemEBWand3(Tier.ADVANCED, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric2a")).setTranslationKey("harvestcleric2a"),
                    new ItemEBWand4(Tier.ADVANCED, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster56a")).setTranslationKey("wavemaster56a"),
                    new ItemEBWand5(Tier.ADVANCED, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster46a")).setTranslationKey("wavemaster46a"),
                    new ItemEBWand6(Tier.ADVANCED, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster48a")).setTranslationKey("wavemaster48a"),
                    new ItemEBWand7(Tier.ADVANCED, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric5a")).setTranslationKey("harvestcleric5a"),
                    new ItemEBWand8(Tier.ADVANCED, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer3a")).setTranslationKey("macabredancer3a"),
                    new ItemEBWand9(Tier.ADVANCED, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric7a")).setTranslationKey("harvestcleric7a"),
                    new ItemEBWand1(Tier.MASTER, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster45m")).setTranslationKey("wavemaster45m"),
                    new ItemEBWand2(Tier.MASTER, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster47m")).setTranslationKey("wavemaster47m"),
                    new ItemEBWand3(Tier.MASTER, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric2m")).setTranslationKey("harvestcleric2m"),
                    new ItemEBWand4(Tier.MASTER, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster56m")).setTranslationKey("wavemaster56m"),
                    new ItemEBWand5(Tier.MASTER, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster46m")).setTranslationKey("wavemaster46m"),
                    new ItemEBWand6(Tier.MASTER, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster48m")).setTranslationKey("wavemaster48m"),
                    new ItemEBWand7(Tier.MASTER, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric5m")).setTranslationKey("harvestcleric5m"),
                    new ItemEBWand8(Tier.MASTER, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer3m")).setTranslationKey("macabredancer3m"),
                    new ItemEBWand9(Tier.MASTER, Element.EARTH).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric7m")).setTranslationKey("harvestcleric7m"),
                    new ItemEBWand1(Tier.NOVICE, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster72")).setTranslationKey("wavemaster72"),
                    new ItemEBWand2(Tier.NOVICE, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster73")).setTranslationKey("wavemaster73"),
                    new ItemEBWand3(Tier.NOVICE, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric1")).setTranslationKey("harvestcleric1"),
                    new ItemEBWand4(Tier.NOVICE, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster20")).setTranslationKey("wavemaster20"),
                    new ItemEBWand5(Tier.NOVICE, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster34")).setTranslationKey("wavemaster34"),
                    new ItemEBWand6(Tier.NOVICE, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock10")).setTranslationKey("shadowwarlock10"),
                    new ItemEBWand1(Tier.APPRENTICE, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster72p")).setTranslationKey("wavemaster72p"),
                    new ItemEBWand2(Tier.APPRENTICE, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster73p")).setTranslationKey("wavemaster73p"),
                    new ItemEBWand3(Tier.APPRENTICE, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric1p")).setTranslationKey("harvestcleric1p"),
                    new ItemEBWand4(Tier.APPRENTICE, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster20p")).setTranslationKey("wavemaster20p"),
                    new ItemEBWand5(Tier.APPRENTICE, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster34p")).setTranslationKey("wavemaster34p"),
                    new ItemEBWand6(Tier.APPRENTICE, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock10p")).setTranslationKey("shadowwarlock10p"),
                    new ItemEBWand1(Tier.ADVANCED, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster72a")).setTranslationKey("wavemaster72a"),
                    new ItemEBWand2(Tier.ADVANCED, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster73a")).setTranslationKey("wavemaster73a"),
                    new ItemEBWand3(Tier.ADVANCED, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric1a")).setTranslationKey("harvestcleric1a"),
                    new ItemEBWand4(Tier.ADVANCED, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster20a")).setTranslationKey("wavemaster20a"),
                    new ItemEBWand5(Tier.ADVANCED, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster34a")).setTranslationKey("wavemaster34a"),
                    new ItemEBWand6(Tier.ADVANCED, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock10a")).setTranslationKey("shadowwarlock10a"),
                    new ItemEBWand1(Tier.ADVANCED, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster72m")).setTranslationKey("wavemaster72m"),
                    new ItemEBWand2(Tier.ADVANCED, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster73m")).setTranslationKey("wavemaster73m"),
                    new ItemEBWand3(Tier.ADVANCED, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric1m")).setTranslationKey("harvestcleric1m"),
                    new ItemEBWand4(Tier.ADVANCED, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster20m")).setTranslationKey("wavemaster20m"),
                    new ItemEBWand5(Tier.ADVANCED, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster34m")).setTranslationKey("wavemaster34m"),
                    new ItemEBWand6(Tier.MASTER, Element.LIGHTNING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock10m")).setTranslationKey("shadowwarlock10m"),
                    new ItemEBWand1(Tier.NOVICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster49")).setTranslationKey("wavemaster49"),
                    new ItemEBWand2(Tier.NOVICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster63")).setTranslationKey("wavemaster63"),
                    new ItemEBWand3(Tier.NOVICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster64")).setTranslationKey("wavemaster64"),
                    new ItemEBWand4(Tier.NOVICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster30")).setTranslationKey("wavemaster30"),
                    new ItemEBWand5(Tier.NOVICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster4")).setTranslationKey("wavemaster4"),
                    new ItemEBWand6(Tier.NOVICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer2")).setTranslationKey("macabredancer2"),
                    new ItemEBWand7(Tier.NOVICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster5")).setTranslationKey("wavemaster5"),
                    new ItemEBWand8(Tier.NOVICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric4")).setTranslationKey("harvestcleric4"),
                    new ItemEBWand9(Tier.NOVICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric3")).setTranslationKey("harvestcleric3"),
                    new ItemEBWand10(Tier.NOVICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster33")).setTranslationKey("wavemaster33"),
                    new ItemEBWand11(Tier.NOVICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock11")).setTranslationKey("shadowwarlock11"),
                    new ItemEBWand12(Tier.NOVICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock12")).setTranslationKey("shadowwarlock12"),
                    new ItemEBWand13(Tier.NOVICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock13")).setTranslationKey("shadowwarlock13"),
                    new ItemEBWand14(Tier.NOVICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock14")).setTranslationKey("shadowwarlock14"),
                    new ItemEBWand15(Tier.NOVICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock9")).setTranslationKey("shadowwarlock9"),
                    new ItemEBWand16(Tier.NOVICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric10")).setTranslationKey("harvestcleric10"),
                    new ItemEBWand1(Tier.APPRENTICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster49p")).setTranslationKey("wavemaster49p"),
                    new ItemEBWand2(Tier.APPRENTICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster63p")).setTranslationKey("wavemaster63p"),
                    new ItemEBWand3(Tier.APPRENTICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster64p")).setTranslationKey("wavemaster64p"),
                    new ItemEBWand4(Tier.APPRENTICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster30p")).setTranslationKey("wavemaster30p"),
                    new ItemEBWand5(Tier.APPRENTICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster4p")).setTranslationKey("wavemaster4p"),
                    new ItemEBWand6(Tier.APPRENTICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer2p")).setTranslationKey("macabredancer2p"),
                    new ItemEBWand7(Tier.APPRENTICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster5p")).setTranslationKey("wavemaster5p"),
                    new ItemEBWand8(Tier.APPRENTICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric4p")).setTranslationKey("harvestcleric4p"),
                    new ItemEBWand9(Tier.APPRENTICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric3p")).setTranslationKey("harvestcleric3p"),
                    new ItemEBWand10(Tier.APPRENTICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster33p")).setTranslationKey("wavemaster33p"),
                    new ItemEBWand11(Tier.APPRENTICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock11p")).setTranslationKey("shadowwarlock11p"),
                    new ItemEBWand12(Tier.APPRENTICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock12p")).setTranslationKey("shadowwarlock12p"),
                    new ItemEBWand13(Tier.APPRENTICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock13p")).setTranslationKey("shadowwarlock13p"),
                    new ItemEBWand14(Tier.APPRENTICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock14p")).setTranslationKey("shadowwarlock14p"),
                    new ItemEBWand15(Tier.APPRENTICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock9p")).setTranslationKey("shadowwarlock9p"),
                    new ItemEBWand16(Tier.APPRENTICE, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric10p")).setTranslationKey("harvestcleric10p"),
                    new ItemEBWand1(Tier.ADVANCED, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster49a")).setTranslationKey("wavemaster49a"),
                    new ItemEBWand2(Tier.ADVANCED, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster63a")).setTranslationKey("wavemaster63a"),
                    new ItemEBWand3(Tier.ADVANCED, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster64a")).setTranslationKey("wavemaster64a"),
                    new ItemEBWand4(Tier.ADVANCED, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster30a")).setTranslationKey("wavemaster30a"),
                    new ItemEBWand5(Tier.ADVANCED, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster4a")).setTranslationKey("wavemaster4a"),
                    new ItemEBWand6(Tier.ADVANCED, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer2a")).setTranslationKey("macabredancer2a"),
                    new ItemEBWand7(Tier.ADVANCED, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster5a")).setTranslationKey("wavemaster5a"),
                    new ItemEBWand8(Tier.ADVANCED, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric4a")).setTranslationKey("harvestcleric4a"),
                    new ItemEBWand9(Tier.ADVANCED, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric3a")).setTranslationKey("harvestcleric3a"),
                    new ItemEBWand10(Tier.ADVANCED, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster33a")).setTranslationKey("wavemaster33a"),
                    new ItemEBWand11(Tier.ADVANCED, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock11a")).setTranslationKey("shadowwarlock11a"),
                    new ItemEBWand12(Tier.ADVANCED, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock12a")).setTranslationKey("shadowwarlock12a"),
                    new ItemEBWand13(Tier.ADVANCED, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock13a")).setTranslationKey("shadowwarlock13a"),
                    new ItemEBWand14(Tier.ADVANCED, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock14a")).setTranslationKey("shadowwarlock14a"),
                    new ItemEBWand15(Tier.ADVANCED, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock9a")).setTranslationKey("shadowwarlock9a"),
                    new ItemEBWand16(Tier.ADVANCED, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric10a")).setTranslationKey("harvestcleric10a"),
                    new ItemEBWand1(Tier.MASTER, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster49m")).setTranslationKey("wavemaster49m"),
                    new ItemEBWand2(Tier.MASTER, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster63m")).setTranslationKey("wavemaster63m"),
                    new ItemEBWand3(Tier.MASTER, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster64m")).setTranslationKey("wavemaster64m"),
                    new ItemEBWand4(Tier.MASTER, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster30m")).setTranslationKey("wavemaster30m"),
                    new ItemEBWand5(Tier.MASTER, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster4m")).setTranslationKey("wavemaster4m"),
                    new ItemEBWand6(Tier.MASTER, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("macabredancer2m")).setTranslationKey("macabredancer2m"),
                    new ItemEBWand7(Tier.MASTER, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster5m")).setTranslationKey("wavemaster5m"),
                    new ItemEBWand8(Tier.MASTER, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric4m")).setTranslationKey("harvestcleric4m"),
                    new ItemEBWand9(Tier.MASTER, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric3m")).setTranslationKey("harvestcleric3m"),
                    new ItemEBWand10(Tier.MASTER, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("wavemaster33m")).setTranslationKey("wavemaster33m"),
                    new ItemEBWand11(Tier.MASTER, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock11m")).setTranslationKey("shadowwarlock11m"),
                    new ItemEBWand12(Tier.MASTER, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock12m")).setTranslationKey("shadowwarlock12m"),
                    new ItemEBWand13(Tier.MASTER, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock13m")).setTranslationKey("shadowwarlock13m"),
                    new ItemEBWand14(Tier.MASTER, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock14m")).setTranslationKey("shadowwarlock14m"),
                    new ItemEBWand15(Tier.MASTER, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("shadowwarlock9m")).setTranslationKey("shadowwarlock9m"),
                    new ItemEBWand16(Tier.MASTER, Element.HEALING).setCreativeTab(DotHackTabs.MAGIC)
                            .setRegistryName(location("harvestcleric10m")).setTranslationKey("harvestcleric10m"));
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
                event.getRegistry().register(
                        new ItemBow().setCreativeTab(DotHackTabs.MAGIC).setRegistryName(location("harvestcleric" + i)));
            for (int i = 1; i <= 5; i++)
                event.getRegistry().register(
                        new ItemBow().setCreativeTab(DotHackTabs.MAGIC).setRegistryName(location("macabredancer" + i)));
            for (int i = 1; i <= 14; i++)
                event.getRegistry().register(
                        new ItemBow().setCreativeTab(DotHackTabs.MAGIC).setRegistryName(location("shadowwarlock" + i)));
            for (int i = 1; i <= 74; i++)
                event.getRegistry().register(
                        new ItemBow().setCreativeTab(DotHackTabs.MAGIC).setRegistryName(location("wavemaster" + i)));
            event.getRegistry().register(
                    redwand = new ItemBow().setCreativeTab(DotHackTabs.MAGIC).setRegistryName(location("redwand1")));
            DotHackMod.LOGGER.info("Registered without EB or M&S");
        }

    }

    public static ResourceLocation location(String name) {
        return new ResourceLocation(DotHackMod.MODID, name);
    }

}
