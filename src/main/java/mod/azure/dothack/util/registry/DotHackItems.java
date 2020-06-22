package mod.azure.dothack.util.registry;

import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.item.BulletAmmo;
import mod.azure.dothack.item.DothackSword;
import mod.azure.dothack.item.DualGunItem;
import mod.azure.dothack.item.MagicItem;
import mod.azure.dothack.item.ManaItem;
import mod.azure.dothack.item.SteamGunItem;
import mod.azure.dothack.util.DotHackTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class DotHackItems {

	@SuppressWarnings("deprecation")
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, DotHackMod.MODID);

	public static final RegistryObject<Item> BULLET = ITEMS.register("bullets",
			() -> new BulletAmmo(1.0F));
	
	public static final RegistryObject<Item> MANA = ITEMS.register("mana",
			() -> new ManaItem(1.0F));
	
	public static final RegistryObject<Item> BLADEBRANDIER1 = ITEMS.register("bladebrandier1",
			() -> new DothackSword(1));
	public static final RegistryObject<Item> BLADEBRANDIER2 = ITEMS.register("bladebrandier2",
			() -> new DothackSword((3+2)/3));
	public static final RegistryObject<Item> BLADEBRANDIER3 = ITEMS.register("bladebrandier3",
			() -> new DothackSword((3+3)/3));
	public static final RegistryObject<Item> BLADEBRANDIER4 = ITEMS.register("bladebrandier4",
			() -> new DothackSword((3+4)/3));
	public static final RegistryObject<Item> BLADEBRANDIER5 = ITEMS.register("bladebrandier5",
			() -> new DothackSword((3+5)/3));
	public static final RegistryObject<Item> BLADEBRANDIER6 = ITEMS.register("bladebrandier6",
			() -> new DothackSword((3+6)/3));
	public static final RegistryObject<Item> BLADEBRANDIER7 = ITEMS.register("bladebrandier7",
			() -> new DothackSword((3+7)/3));
	public static final RegistryObject<Item> BLADEBRANDIER8 = ITEMS.register("bladebrandier8",
			() -> new DothackSword((3+8)/3));
	public static final RegistryObject<Item> BLADEBRANDIER9 = ITEMS.register("bladebrandier9",
			() -> new DothackSword((3+9)/3));
	public static final RegistryObject<Item> BLADEBRANDIER10 = ITEMS.register("bladebrandier10",
			() -> new DothackSword((3+10)/3));
	public static final RegistryObject<Item> BLADEBRANDIER11 = ITEMS.register("bladebrandier11",
			() -> new DothackSword((3+11)/3));
	public static final RegistryObject<Item> BLADEBRANDIER12 = ITEMS.register("bladebrandier12",
			() -> new DothackSword((3+12)/3));
	public static final RegistryObject<Item> BLADEBRANDIER13 = ITEMS.register("bladebrandier13",
			() -> new DothackSword((3+13)/3));
	public static final RegistryObject<Item> BLADEBRANDIER14 = ITEMS.register("bladebrandier14",
			() -> new DothackSword((3+14)/3));
	public static final RegistryObject<Item> BLADEBRANDIER15 = ITEMS.register("bladebrandier15",
			() -> new DothackSword((3+15)/3));
	public static final RegistryObject<Item> BLADEBRANDIER16 = ITEMS.register("bladebrandier16",
			() -> new DothackSword((3+16)/3));
	public static final RegistryObject<Item> BLADEBRANDIER17 = ITEMS.register("bladebrandier17",
			() -> new DothackSword((3+17)/3));
	public static final RegistryObject<Item> BLADEBRANDIER18 = ITEMS.register("bladebrandier18",
			() -> new DothackSword((3+18)/3));
	public static final RegistryObject<Item> BLADEBRANDIER19 = ITEMS.register("bladebrandier19",
			() -> new DothackSword((3+19)/3));

	public static final RegistryObject<Item> DUALSWORDS1 = ITEMS.register("dualswords1",
			() -> new DothackSword((2+1)/5));
	public static final RegistryObject<Item> DUALSWORDS2 = ITEMS.register("dualswords2",
			() -> new DothackSword((2+2)/5));
	public static final RegistryObject<Item> DUALSWORDS3 = ITEMS.register("dualswords3",
			() -> new DothackSword((2+3)/5));
	public static final RegistryObject<Item> DUALSWORDS4 = ITEMS.register("dualswords4",
			() -> new DothackSword((2+4)/5));
	public static final RegistryObject<Item> DUALSWORDS5 = ITEMS.register("dualswords5",
			() -> new DothackSword((2+5)/5));
	public static final RegistryObject<Item> DUALSWORDS6 = ITEMS.register("dualswords6",
			() -> new DothackSword((2+6)/5));
	public static final RegistryObject<Item> DUALSWORDS7 = ITEMS.register("dualswords7",
			() -> new DothackSword((2+7)/5));
	public static final RegistryObject<Item> DUALSWORDS8 = ITEMS.register("dualswords8",
			() -> new DothackSword((2+8)/5));
	public static final RegistryObject<Item> DUALSWORDS9 = ITEMS.register("dualswords9",
			() -> new DothackSword((2+9)/5));
	public static final RegistryObject<Item> DUALSWORDS10 = ITEMS.register("dualswords10",
			() -> new DothackSword((2+10)/5));
	public static final RegistryObject<Item> DUALSWORDS11 = ITEMS.register("dualswords11",
			() -> new DothackSword((2+11)/5));
	public static final RegistryObject<Item> DUALSWORDS12 = ITEMS.register("dualswords12",
			() -> new DothackSword((2+12)/5));
	public static final RegistryObject<Item> DUALSWORDS13 = ITEMS.register("dualswords13",
			() -> new DothackSword((2+13)/5));
	public static final RegistryObject<Item> DUALSWORDS14 = ITEMS.register("dualswords14",
			() -> new DothackSword((2+14)/5));
	public static final RegistryObject<Item> DUALSWORDS15 = ITEMS.register("dualswords15",
			() -> new DothackSword((2+15)/5));
	public static final RegistryObject<Item> DUALSWORDS16 = ITEMS.register("dualswords16",
			() -> new DothackSword((2+16)/5));
	public static final RegistryObject<Item> DUALSWORDS17 = ITEMS.register("dualswords17",
			() -> new DothackSword((2+17)/5));
	public static final RegistryObject<Item> DUALSWORDS18 = ITEMS.register("dualswords18",
			() -> new DothackSword((2+18)/5));
	public static final RegistryObject<Item> DUALSWORDS19 = ITEMS.register("dualswords19",
			() -> new DothackSword((2+19)/5));
	public static final RegistryObject<Item> DUALSWORDS20 = ITEMS.register("dualswords20",
			() -> new DothackSword((2+20)/5));
	public static final RegistryObject<Item> DUALSWORDS21 = ITEMS.register("dualswords21",
			() -> new DothackSword((2+21)/5));
	public static final RegistryObject<Item> DUALSWORDS22 = ITEMS.register("dualswords22",
			() -> new DothackSword((2+22)/5));
	public static final RegistryObject<Item> DUALSWORDS23 = ITEMS.register("dualswords23",
			() -> new DothackSword((2+23)/5));
	public static final RegistryObject<Item> DUALSWORDS24 = ITEMS.register("dualswords24",
			() -> new DothackSword((2+24)/5));

	public static final RegistryObject<Item> EDGEPUNISHER1 = ITEMS.register("edgepunisher1",
			() -> new DothackSword((5+1)/2));
	public static final RegistryObject<Item> EDGEPUNISHER2 = ITEMS.register("edgepunisher2",
			() -> new DothackSword((5+2)/2));
	public static final RegistryObject<Item> EDGEPUNISHER3 = ITEMS.register("edgepunisher3",
			() -> new DothackSword((5+3)/2));
	public static final RegistryObject<Item> EDGEPUNISHER4 = ITEMS.register("edgepunisher4",
			() -> new DothackSword((5+4)/2));
	public static final RegistryObject<Item> EDGEPUNISHER5 = ITEMS.register("edgepunisher5",
			() -> new DothackSword((5+5)/2));
	public static final RegistryObject<Item> EDGEPUNISHER6 = ITEMS.register("edgepunisher6",
			() -> new DothackSword((5+6)/2));
	public static final RegistryObject<Item> EDGEPUNISHER7 = ITEMS.register("edgepunisher7",
			() -> new DothackSword((5+7)/2));
	public static final RegistryObject<Item> EDGEPUNISHER8 = ITEMS.register("edgepunisher8",
			() -> new DothackSword((5+8)/2));
	public static final RegistryObject<Item> EDGEPUNISHER9 = ITEMS.register("edgepunisher9",
			() -> new DothackSword((5+9)/2));
	public static final RegistryObject<Item> EDGEPUNISHER10 = ITEMS.register("edgepunisher10",
			() -> new DothackSword((5+10)/2));
	public static final RegistryObject<Item> EDGEPUNISHER11 = ITEMS.register("edgepunisher11",
			() -> new DothackSword((5+11)/2));
	public static final RegistryObject<Item> EDGEPUNISHER12 = ITEMS.register("edgepunisher12",
			() -> new DothackSword((5+12)/2));
	public static final RegistryObject<Item> EDGEPUNISHER13 = ITEMS.register("edgepunisher13",
			() -> new DothackSword((5+13)/2));
	public static final RegistryObject<Item> EDGEPUNISHER14 = ITEMS.register("edgepunisher14",
			() -> new DothackSword((5+14)/2));
	public static final RegistryObject<Item> EDGEPUNISHER15 = ITEMS.register("edgepunisher15",
			() -> new DothackSword((5+15)/2));
	public static final RegistryObject<Item> EDGEPUNISHER16 = ITEMS.register("edgepunisher16",
			() -> new DothackSword((5+16)/2));
	public static final RegistryObject<Item> EDGEPUNISHER17 = ITEMS.register("edgepunisher17",
			() -> new DothackSword((5+17)/2));
	public static final RegistryObject<Item> EDGEPUNISHER18 = ITEMS.register("edgepunisher18",
			() -> new DothackSword((5+18)/2));
	public static final RegistryObject<Item> EDGEPUNISHER19 = ITEMS.register("edgepunisher19",
			() -> new DothackSword((5+19)/2));
	public static final RegistryObject<Item> EDGEPUNISHER20 = ITEMS.register("edgepunisher20",
			() -> new DothackSword((5+20)/2));

	public static final RegistryObject<Item> LORDPARTIZAN1 = ITEMS.register("lordpartizan1",
			() -> new DothackSword((16+1)/2));
	public static final RegistryObject<Item> LORDPARTIZAN2 = ITEMS.register("lordpartizan2",
			() -> new DothackSword((16+2)/2));
	public static final RegistryObject<Item> LORDPARTIZAN3 = ITEMS.register("lordpartizan3",
			() -> new DothackSword((16+3)/2));
	public static final RegistryObject<Item> LORDPARTIZAN4 = ITEMS.register("lordpartizan4",
			() -> new DothackSword((16+4)/2));
	public static final RegistryObject<Item> LORDPARTIZAN5 = ITEMS.register("lordpartizan5",
			() -> new DothackSword((16+5)/2));
	public static final RegistryObject<Item> LORDPARTIZAN6 = ITEMS.register("lordpartizan6",
			() -> new DothackSword((16+6)/2));
	public static final RegistryObject<Item> LORDPARTIZAN7 = ITEMS.register("lordpartizan7",
			() -> new DothackSword((16+7)/2));
	public static final RegistryObject<Item> LORDPARTIZAN8 = ITEMS.register("lordpartizan8",
			() -> new DothackSword((16+8)/2));
	public static final RegistryObject<Item> LORDPARTIZAN9 = ITEMS.register("lordpartizan9",
			() -> new DothackSword((16+9)/2));

	public static final RegistryObject<Item> FLICKREAPER1 = ITEMS.register("flickreaper1",
			() -> new DothackSword((20+1)/3));
	public static final RegistryObject<Item> FLICKREAPER2 = ITEMS.register("flickreaper2",
			() -> new DothackSword((20+2)/3));
	public static final RegistryObject<Item> FLICKREAPER3 = ITEMS.register("flickreaper3",
			() -> new DothackSword((20+3)/3));
	public static final RegistryObject<Item> FLICKREAPER4 = ITEMS.register("flickreaper4",
			() -> new DothackSword((20+4)/3));
	public static final RegistryObject<Item> FLICKREAPER5 = ITEMS.register("flickreaper5",
			() -> new DothackSword((20+5)/3));
	public static final RegistryObject<Item> FLICKREAPER6 = ITEMS.register("flickreaper6",
			() -> new DothackSword((20+6)/3));
	public static final RegistryObject<Item> FLICKREAPER7 = ITEMS.register("flickreaper7",
			() -> new DothackSword((20+7)/3));
	public static final RegistryObject<Item> FLICKREAPER8 = ITEMS.register("flickreaper8",
			() -> new DothackSword((20+8)/3));
	public static final RegistryObject<Item> FLICKREAPER9 = ITEMS.register("flickreaper9",
			() -> new DothackSword((20+9)/3));

	public static final RegistryObject<Item> TRIBALGRAPPLER1 = ITEMS.register("tribalgrappler1",
			() -> new DothackSword((20+1)/5));
	public static final RegistryObject<Item> TRIBALGRAPPLER2 = ITEMS.register("tribalgrappler2",
			() -> new DothackSword((20+2)/5));
	public static final RegistryObject<Item> TRIBALGRAPPLER3 = ITEMS.register("tribalgrappler3",
			() -> new DothackSword((20+3)/5));
	public static final RegistryObject<Item> TRIBALGRAPPLER4 = ITEMS.register("tribalgrappler4",
			() -> new DothackSword((20+4)/5));
	public static final RegistryObject<Item> TRIBALGRAPPLER5 = ITEMS.register("tribalgrappler5",
			() -> new DothackSword((20+5)/5));
	public static final RegistryObject<Item> TRIBALGRAPPLER6 = ITEMS.register("tribalgrappler6",
			() -> new DothackSword((20+6)/5));
	public static final RegistryObject<Item> TRIBALGRAPPLER7 = ITEMS.register("tribalgrappler7",
			() -> new DothackSword((20+7)/5));
	public static final RegistryObject<Item> TRIBALGRAPPLER8 = ITEMS.register("tribalgrappler8",
			() -> new DothackSword((20+8)/5));
	public static final RegistryObject<Item> TRIBALGRAPPLER9 = ITEMS.register("tribalgrappler9",
			() -> new DothackSword((20+9)/5));
	public static final RegistryObject<Item> TRIBALGRAPPLER10 = ITEMS.register("tribalgrappler10",
			() -> new DothackSword((20+10)/5));
	public static final RegistryObject<Item> TRIBALGRAPPLER11 = ITEMS.register("tribalgrappler11",
			() -> new DothackSword((20+11)/5));

	public static final RegistryObject<Item> BLADEMASTER1 = ITEMS.register("blademaster1",
			() -> new DothackSword((3+1)/10));
	public static final RegistryObject<Item> BLADEMASTER2 = ITEMS.register("blademaster2",
			() -> new DothackSword((3+2)/10));
	public static final RegistryObject<Item> BLADEMASTER3 = ITEMS.register("blademaster3",
			() -> new DothackSword((3+3)/10));
	public static final RegistryObject<Item> BLADEMASTER4 = ITEMS.register("blademaster4",
			() -> new DothackSword((3+4)/10));
	public static final RegistryObject<Item> BLADEMASTER5 = ITEMS.register("blademaster5",
			() -> new DothackSword((3+5)/10));
	public static final RegistryObject<Item> BLADEMASTER6 = ITEMS.register("blademaster6",
			() -> new DothackSword((3+6)/10));
	public static final RegistryObject<Item> BLADEMASTER7 = ITEMS.register("blademaster7",
			() -> new DothackSword((3+7)/10));
	public static final RegistryObject<Item> BLADEMASTER8 = ITEMS.register("blademaster8",
			() -> new DothackSword((3+8)/10));
	public static final RegistryObject<Item> BLADEMASTER9 = ITEMS.register("blademaster9",
			() -> new DothackSword((3+9)/10));
	public static final RegistryObject<Item> BLADEMASTER10 = ITEMS.register("blademaster10",
			() -> new DothackSword((3+10)/10));
	public static final RegistryObject<Item> BLADEMASTER11 = ITEMS.register("blademaster11",
			() -> new DothackSword((3+11)/10));
	public static final RegistryObject<Item> BLADEMASTER12 = ITEMS.register("blademaster12",
			() -> new DothackSword((3+12)/10));
	public static final RegistryObject<Item> BLADEMASTER13 = ITEMS.register("blademaster13",
			() -> new DothackSword((3+13)/10));
	public static final RegistryObject<Item> BLADEMASTER14 = ITEMS.register("blademaster14",
			() -> new DothackSword((3+14)/10));
	public static final RegistryObject<Item> BLADEMASTER15 = ITEMS.register("blademaster15",
			() -> new DothackSword((3+15)/10));
	public static final RegistryObject<Item> BLADEMASTER16 = ITEMS.register("blademaster16",
			() -> new DothackSword((3+16)/10));
	public static final RegistryObject<Item> BLADEMASTER17 = ITEMS.register("blademaster17",
			() -> new DothackSword((3+17)/10));
	public static final RegistryObject<Item> BLADEMASTER18 = ITEMS.register("blademaster18",
			() -> new DothackSword((3+18)/10));
	public static final RegistryObject<Item> BLADEMASTER19 = ITEMS.register("blademaster19",
			() -> new DothackSword((3+19)/10));
	public static final RegistryObject<Item> BLADEMASTER20 = ITEMS.register("blademaster20",
			() -> new DothackSword((3+20)/10));
	public static final RegistryObject<Item> BLADEMASTER21 = ITEMS.register("blademaster21",
			() -> new DothackSword((3+21)/10));
	public static final RegistryObject<Item> BLADEMASTER22 = ITEMS.register("blademaster22",
			() -> new DothackSword((3+22)/10));
	public static final RegistryObject<Item> BLADEMASTER23 = ITEMS.register("blademaster23",
			() -> new DothackSword((3+23)/10));
	public static final RegistryObject<Item> BLADEMASTER24 = ITEMS.register("blademaster24",
			() -> new DothackSword((3+24)/10));
	public static final RegistryObject<Item> BLADEMASTER25 = ITEMS.register("blademaster25",
			() -> new DothackSword((3+25)/10));
	public static final RegistryObject<Item> BLADEMASTER26 = ITEMS.register("blademaster26",
			() -> new DothackSword((3+26)/10));
	public static final RegistryObject<Item> BLADEMASTER27 = ITEMS.register("blademaster27",
			() -> new DothackSword((3+27)/10));
	public static final RegistryObject<Item> BLADEMASTER28 = ITEMS.register("blademaster28",
			() -> new DothackSword((3+28)/10));
	public static final RegistryObject<Item> BLADEMASTER29 = ITEMS.register("blademaster29",
			() -> new DothackSword((3+29)/10));
	public static final RegistryObject<Item> BLADEMASTER30 = ITEMS.register("blademaster30",
			() -> new DothackSword((3+30)/10));
	public static final RegistryObject<Item> BLADEMASTER31 = ITEMS.register("blademaster31",
			() -> new DothackSword((3+31)/10));
	public static final RegistryObject<Item> BLADEMASTER32 = ITEMS.register("blademaster32",
			() -> new DothackSword((3+32)/10));
	public static final RegistryObject<Item> BLADEMASTER33 = ITEMS.register("blademaster33",
			() -> new DothackSword((3+33)/10));
	public static final RegistryObject<Item> BLADEMASTER34 = ITEMS.register("blademaster34",
			() -> new DothackSword((3+34)/10));
	public static final RegistryObject<Item> BLADEMASTER35 = ITEMS.register("blademaster35",
			() -> new DothackSword((3+35)/10));
	public static final RegistryObject<Item> BLADEMASTER36 = ITEMS.register("blademaster36",
			() -> new DothackSword((3+36)/10));
	public static final RegistryObject<Item> BLADEMASTER37 = ITEMS.register("blademaster37",
			() -> new DothackSword((3+37)/10));
	public static final RegistryObject<Item> BLADEMASTER38 = ITEMS.register("blademaster38",
			() -> new DothackSword((3+38)/10));
	public static final RegistryObject<Item> BLADEMASTER39 = ITEMS.register("blademaster39",
			() -> new DothackSword((3+39)/10));
	public static final RegistryObject<Item> BLADEMASTER40 = ITEMS.register("blademaster40",
			() -> new DothackSword((3+40)/10));
	public static final RegistryObject<Item> BLADEMASTER41 = ITEMS.register("blademaster41",
			() -> new DothackSword((3+41)/10));
	public static final RegistryObject<Item> BLADEMASTER42 = ITEMS.register("blademaster42",
			() -> new DothackSword((3+42)/10));
	public static final RegistryObject<Item> BLADEMASTER43 = ITEMS.register("blademaster43",
			() -> new DothackSword((3+43)/10));
	public static final RegistryObject<Item> BLADEMASTER44 = ITEMS.register("blademaster44",
			() -> new DothackSword((3+44)/10));
	public static final RegistryObject<Item> BLADEMASTER45 = ITEMS.register("blademaster45",
			() -> new DothackSword((3+45)/10));
	public static final RegistryObject<Item> BLADEMASTER46 = ITEMS.register("blademaster46",
			() -> new DothackSword((3+46)/10));
	public static final RegistryObject<Item> BLADEMASTER47 = ITEMS.register("blademaster47",
			() -> new DothackSword((3+47)/10));
	public static final RegistryObject<Item> BLADEMASTER48 = ITEMS.register("blademaster48",
			() -> new DothackSword((3+48)/10));
	public static final RegistryObject<Item> BLADEMASTER49 = ITEMS.register("blademaster49",
			() -> new DothackSword((3+49)/10));
	public static final RegistryObject<Item> BLADEMASTER50 = ITEMS.register("blademaster50",
			() -> new DothackSword((3+50)/10));
	public static final RegistryObject<Item> BLADEMASTER51 = ITEMS.register("blademaster51",
			() -> new DothackSword((3+51)/10));
	public static final RegistryObject<Item> BLADEMASTER52 = ITEMS.register("blademaster52",
			() -> new DothackSword((3+52)/10));
	public static final RegistryObject<Item> BLADEMASTER53 = ITEMS.register("blademaster53",
			() -> new DothackSword((3+53)/10));
	public static final RegistryObject<Item> BLADEMASTER54 = ITEMS.register("blademaster54",
			() -> new DothackSword((3+54)/10));
	public static final RegistryObject<Item> BLADEMASTER55 = ITEMS.register("blademaster55",
			() -> new DothackSword((3+55)/10));
	public static final RegistryObject<Item> BLADEMASTER56 = ITEMS.register("blademaster56",
			() -> new DothackSword((3+56)/10));
	public static final RegistryObject<Item> BLADEMASTER57 = ITEMS.register("blademaster57",
			() -> new DothackSword((3+57)/10));
	public static final RegistryObject<Item> BLADEMASTER58 = ITEMS.register("blademaster58",
			() -> new DothackSword((3+58)/10));
	public static final RegistryObject<Item> BLADEMASTER59 = ITEMS.register("blademaster59",
			() -> new DothackSword((3+59)/10));
	public static final RegistryObject<Item> BLADEMASTER60 = ITEMS.register("blademaster60",
			() -> new DothackSword((3+60)/10));
	public static final RegistryObject<Item> BLADEMASTER61 = ITEMS.register("blademaster61",
			() -> new DothackSword((3+61)/10));
	public static final RegistryObject<Item> BLADEMASTER62 = ITEMS.register("blademaster62",
			() -> new DothackSword((3+62)/10));
	public static final RegistryObject<Item> BLADEMASTER63 = ITEMS.register("blademaster63",
			() -> new DothackSword((3+63)/10));
	public static final RegistryObject<Item> BLADEMASTER64 = ITEMS.register("blademaster64",
			() -> new DothackSword((3+64)/10));
	public static final RegistryObject<Item> BLADEMASTER65 = ITEMS.register("blademaster65",
			() -> new DothackSword((3+65)/10));
	public static final RegistryObject<Item> BLADEMASTER66 = ITEMS.register("blademaster66",
			() -> new DothackSword((3+66)/10));
	public static final RegistryObject<Item> BLADEMASTER67 = ITEMS.register("blademaster67",
			() -> new DothackSword((3+67)/10));
	public static final RegistryObject<Item> BLADEMASTER68 = ITEMS.register("blademaster68",
			() -> new DothackSword((3+68)/10));
	public static final RegistryObject<Item> BLADEMASTER69 = ITEMS.register("blademaster69",
			() -> new DothackSword((3+69)/10));
	public static final RegistryObject<Item> BLADEMASTER70 = ITEMS.register("blademaster70",
			() -> new DothackSword((3+70)/10));
	public static final RegistryObject<Item> BLADEMASTER71 = ITEMS.register("blademaster71",
			() -> new DothackSword((3+71)/10));
	public static final RegistryObject<Item> BLADEMASTER72 = ITEMS.register("blademaster72",
			() -> new DothackSword((3+72)/10));
	public static final RegistryObject<Item> BLADEMASTER73 = ITEMS.register("blademaster73",
			() -> new DothackSword((3+73)/10));
	public static final RegistryObject<Item> BLADEMASTER74 = ITEMS.register("blademaster74",
			() -> new DothackSword((3+74)/10));
	public static final RegistryObject<Item> BLADEMASTER75 = ITEMS.register("blademaster75",
			() -> new DothackSword((3+75)/10));

	public static final RegistryObject<Item> HEAVYAXE1 = ITEMS.register("heavyaxeman1",
			() -> new DothackSword((11+1)/7));
	public static final RegistryObject<Item> HEAVYAXE2 = ITEMS.register("heavyaxeman2",
			() -> new DothackSword((11+2)/7));
	public static final RegistryObject<Item> HEAVYAXE3 = ITEMS.register("heavyaxeman3",
			() -> new DothackSword((11+3)/7));
	public static final RegistryObject<Item> HEAVYAXE4 = ITEMS.register("heavyaxeman4",
			() -> new DothackSword((11+4)/7));
	public static final RegistryObject<Item> HEAVYAXE5 = ITEMS.register("heavyaxeman5",
			() -> new DothackSword((11+5)/7));
	public static final RegistryObject<Item> HEAVYAXE6 = ITEMS.register("heavyaxeman6",
			() -> new DothackSword((11+6)/7));
	public static final RegistryObject<Item> HEAVYAXE7 = ITEMS.register("heavyaxeman7",
			() -> new DothackSword((11+7)/7));
	public static final RegistryObject<Item> HEAVYAXE8 = ITEMS.register("heavyaxeman8",
			() -> new DothackSword((11+8)/7));
	public static final RegistryObject<Item> HEAVYAXE9 = ITEMS.register("heavyaxeman9",
			() -> new DothackSword((11+9)/7));
	public static final RegistryObject<Item> HEAVYAXE10 = ITEMS.register("heavyaxeman10",
			() -> new DothackSword((11+10)/7));
	public static final RegistryObject<Item> HEAVYAXE11 = ITEMS.register("heavyaxeman11",
			() -> new DothackSword((11+11)/7));
	public static final RegistryObject<Item> HEAVYAXE12 = ITEMS.register("heavyaxeman12",
			() -> new DothackSword((11+12)/7));
	public static final RegistryObject<Item> HEAVYAXE13 = ITEMS.register("heavyaxeman13",
			() -> new DothackSword((11+13)/7));
	public static final RegistryObject<Item> HEAVYAXE14 = ITEMS.register("heavyaxeman14",
			() -> new DothackSword((11+14)/7));
	public static final RegistryObject<Item> HEAVYAXE15 = ITEMS.register("heavyaxeman15",
			() -> new DothackSword((11+15)/7));
	public static final RegistryObject<Item> HEAVYAXE16 = ITEMS.register("heavyaxeman16",
			() -> new DothackSword((11+16)/7));
	public static final RegistryObject<Item> HEAVYAXE17 = ITEMS.register("heavyaxeman17",
			() -> new DothackSword((11+17)/7));
	public static final RegistryObject<Item> HEAVYAXE18 = ITEMS.register("heavyaxeman18",
			() -> new DothackSword((11+18)/7));
	public static final RegistryObject<Item> HEAVYAXE19 = ITEMS.register("heavyaxeman19",
			() -> new DothackSword((11+19)/7));
	public static final RegistryObject<Item> HEAVYAXE20 = ITEMS.register("heavyaxeman20",
			() -> new DothackSword((11+20)/7));
	public static final RegistryObject<Item> HEAVYAXE21 = ITEMS.register("heavyaxeman21",
			() -> new DothackSword((11+21)/7));
	public static final RegistryObject<Item> HEAVYAXE22 = ITEMS.register("heavyaxeman22",
			() -> new DothackSword((11+22)/7));
	public static final RegistryObject<Item> HEAVYAXE23 = ITEMS.register("heavyaxeman23",
			() -> new DothackSword((11+23)/7));
	public static final RegistryObject<Item> HEAVYAXE24 = ITEMS.register("heavyaxeman24",
			() -> new DothackSword((11+24)/7));
	public static final RegistryObject<Item> HEAVYAXE25 = ITEMS.register("heavyaxeman25",
			() -> new DothackSword((11+25)/7));
	public static final RegistryObject<Item> HEAVYAXE26 = ITEMS.register("heavyaxeman26",
			() -> new DothackSword((11+26)/7));
	public static final RegistryObject<Item> HEAVYAXE27 = ITEMS.register("heavyaxeman27",
			() -> new DothackSword((11+27)/7));
	public static final RegistryObject<Item> HEAVYAXE28 = ITEMS.register("heavyaxeman28",
			() -> new DothackSword((11+28)/7));
	public static final RegistryObject<Item> HEAVYAXE29 = ITEMS.register("heavyaxeman29",
			() -> new DothackSword((11+29)/7));
	public static final RegistryObject<Item> HEAVYAXE30 = ITEMS.register("heavyaxeman30",
			() -> new DothackSword((11+30)/7));
	public static final RegistryObject<Item> HEAVYAXE31 = ITEMS.register("heavyaxeman31",
			() -> new DothackSword((11+31)/7));
	public static final RegistryObject<Item> HEAVYAXE32 = ITEMS.register("heavyaxeman32",
			() -> new DothackSword((11+32)/7));
	public static final RegistryObject<Item> HEAVYAXE33 = ITEMS.register("heavyaxeman33",
			() -> new DothackSword((11+33)/7));
	public static final RegistryObject<Item> HEAVYAXE34 = ITEMS.register("heavyaxeman34",
			() -> new DothackSword((11+34)/7));
	public static final RegistryObject<Item> HEAVYAXE35 = ITEMS.register("heavyaxeman35",
			() -> new DothackSword((11+35)/7));
	public static final RegistryObject<Item> HEAVYAXE36 = ITEMS.register("heavyaxeman36",
			() -> new DothackSword((11+36)/7));
	public static final RegistryObject<Item> HEAVYAXE37 = ITEMS.register("heavyaxeman37",
			() -> new DothackSword((11+37)/7));
	public static final RegistryObject<Item> HEAVYAXE38 = ITEMS.register("heavyaxeman38",
			() -> new DothackSword((11+38)/7));
	public static final RegistryObject<Item> HEAVYAXE39 = ITEMS.register("heavyaxeman39",
			() -> new DothackSword((11+39)/7));
	public static final RegistryObject<Item> HEAVYAXE40 = ITEMS.register("heavyaxeman40",
			() -> new DothackSword((11+40)/7));
	public static final RegistryObject<Item> HEAVYAXE41 = ITEMS.register("heavyaxeman41",
			() -> new DothackSword((11+41)/7));
	public static final RegistryObject<Item> HEAVYAXE42 = ITEMS.register("heavyaxeman42",
			() -> new DothackSword((11+42)/7));
	public static final RegistryObject<Item> HEAVYAXE43 = ITEMS.register("heavyaxeman43",
			() -> new DothackSword((11+43)/7));
	public static final RegistryObject<Item> HEAVYAXE44 = ITEMS.register("heavyaxeman44",
			() -> new DothackSword((11+44)/7));
	public static final RegistryObject<Item> HEAVYAXE45 = ITEMS.register("heavyaxeman45",
			() -> new DothackSword((11+45)/7));
	public static final RegistryObject<Item> HEAVYAXE46 = ITEMS.register("heavyaxeman46",
			() -> new DothackSword((11+46)/7));
	public static final RegistryObject<Item> HEAVYAXE47 = ITEMS.register("heavyaxeman47",
			() -> new DothackSword((11+47)/7));
	public static final RegistryObject<Item> HEAVYAXE48 = ITEMS.register("heavyaxeman48",
			() -> new DothackSword((11+48)/7));
	public static final RegistryObject<Item> HEAVYAXE49 = ITEMS.register("heavyaxeman49",
			() -> new DothackSword((11+49)/7));
	public static final RegistryObject<Item> HEAVYAXE50 = ITEMS.register("heavyaxeman50",
			() -> new DothackSword((11+50)/7));
	public static final RegistryObject<Item> HEAVYAXE51 = ITEMS.register("heavyaxeman51",
			() -> new DothackSword((11+51)/7));
	public static final RegistryObject<Item> HEAVYAXE52 = ITEMS.register("heavyaxeman52",
			() -> new DothackSword((11+52)/7));
	public static final RegistryObject<Item> HEAVYAXE53 = ITEMS.register("heavyaxeman53",
			() -> new DothackSword((11+53)/7));
	public static final RegistryObject<Item> HEAVYAXE54 = ITEMS.register("heavyaxeman54",
			() -> new DothackSword((11+54)/7));
	public static final RegistryObject<Item> HEAVYAXE55 = ITEMS.register("heavyaxeman55",
			() -> new DothackSword((11+55)/7));
	public static final RegistryObject<Item> HEAVYAXE56 = ITEMS.register("heavyaxeman56",
			() -> new DothackSword((11+56)/7));
	public static final RegistryObject<Item> HEAVYAXE57 = ITEMS.register("heavyaxeman57",
			() -> new DothackSword((11+57)/7));
	public static final RegistryObject<Item> HEAVYAXE58 = ITEMS.register("heavyaxeman58",
			() -> new DothackSword((11+58)/7));
	public static final RegistryObject<Item> HEAVYAXE59 = ITEMS.register("heavyaxeman59",
			() -> new DothackSword((11+59)/7));
	public static final RegistryObject<Item> HEAVYAXE60 = ITEMS.register("heavyaxeman60",
			() -> new DothackSword((11+60)/7));
	public static final RegistryObject<Item> HEAVYAXE61 = ITEMS.register("heavyaxeman61",
			() -> new DothackSword((11+61)/7));
	public static final RegistryObject<Item> HEAVYAXE62 = ITEMS.register("heavyaxeman62",
			() -> new DothackSword((11+62)/7));
	public static final RegistryObject<Item> HEAVYAXE63 = ITEMS.register("heavyaxeman63",
			() -> new DothackSword((11+63)/7));
	public static final RegistryObject<Item> HEAVYAXE64 = ITEMS.register("heavyaxeman64",
			() -> new DothackSword((11+64)/7));
	public static final RegistryObject<Item> HEAVYAXE65 = ITEMS.register("heavyaxeman65",
			() -> new DothackSword((11+65)/7));
	public static final RegistryObject<Item> HEAVYAXE66 = ITEMS.register("heavyaxeman66",
			() -> new DothackSword((11+66)/7));
	public static final RegistryObject<Item> HEAVYAXE67 = ITEMS.register("heavyaxeman67",
			() -> new DothackSword((11+67)/7));
	public static final RegistryObject<Item> HEAVYAXE68 = ITEMS.register("heavyaxeman68",
			() -> new DothackSword((11+68)/7));
	public static final RegistryObject<Item> HEAVYAXE69 = ITEMS.register("heavyaxeman69",
			() -> new DothackSword((11+69)/7));
	public static final RegistryObject<Item> HEAVYAXE70 = ITEMS.register("heavyaxeman70",
			() -> new DothackSword((11+70)/7));
	public static final RegistryObject<Item> HEAVYAXE71 = ITEMS.register("heavyaxeman71",
			() -> new DothackSword((11+71)/7));
	public static final RegistryObject<Item> HEAVYAXE72 = ITEMS.register("heavyaxeman72",
			() -> new DothackSword((11+72)/7));
	public static final RegistryObject<Item> HEAVYAXE73 = ITEMS.register("heavyaxeman73",
			() -> new DothackSword((11+73)/7));

	public static final RegistryObject<Item> HEAVYBLADE1 = ITEMS.register("heavyblade1",
			() -> new DothackSword((81+1)/15));
	public static final RegistryObject<Item> HEAVYBLADE2 = ITEMS.register("heavyblade2",
			() -> new DothackSword((81+2)/15));
	public static final RegistryObject<Item> HEAVYBLADE3 = ITEMS.register("heavyblade3",
			() -> new DothackSword((81+3)/15));
	public static final RegistryObject<Item> HEAVYBLADE4 = ITEMS.register("heavyblade4",
			() -> new DothackSword((81+4)/15));
	public static final RegistryObject<Item> HEAVYBLADE5 = ITEMS.register("heavyblade5",
			() -> new DothackSword((81+5)/15));
	public static final RegistryObject<Item> HEAVYBLADE6 = ITEMS.register("heavyblade6",
			() -> new DothackSword((81+6)/15));
	public static final RegistryObject<Item> HEAVYBLADE7 = ITEMS.register("heavyblade7",
			() -> new DothackSword((81+7)/15));
	public static final RegistryObject<Item> HEAVYBLADE8 = ITEMS.register("heavyblade8",
			() -> new DothackSword((81+8)/15));
	public static final RegistryObject<Item> HEAVYBLADE9 = ITEMS.register("heavyblade9",
			() -> new DothackSword((81+9)/15));
	public static final RegistryObject<Item> HEAVYBLADE10 = ITEMS.register("heavyblade10",
			() -> new DothackSword((81+10)/15));
	public static final RegistryObject<Item> HEAVYBLADE11 = ITEMS.register("heavyblade11",
			() -> new DothackSword((81+11)/15));
	public static final RegistryObject<Item> HEAVYBLADE12 = ITEMS.register("heavyblade12",
			() -> new DothackSword((81+12)/15));
	public static final RegistryObject<Item> HEAVYBLADE13 = ITEMS.register("heavyblade13",
			() -> new DothackSword((81+13)/15));
	public static final RegistryObject<Item> HEAVYBLADE14 = ITEMS.register("heavyblade14",
			() -> new DothackSword((81+14)/15));
	public static final RegistryObject<Item> HEAVYBLADE15 = ITEMS.register("heavyblade15",
			() -> new DothackSword((81+15)/15));
	public static final RegistryObject<Item> HEAVYBLADE16 = ITEMS.register("heavyblade16",
			() -> new DothackSword((81+16)/15));
	public static final RegistryObject<Item> HEAVYBLADE17 = ITEMS.register("heavyblade17",
			() -> new DothackSword((81+17)/15));
	public static final RegistryObject<Item> HEAVYBLADE18 = ITEMS.register("heavyblade18",
			() -> new DothackSword((81+18)/15));
	public static final RegistryObject<Item> HEAVYBLADE19 = ITEMS.register("heavyblade19",
			() -> new DothackSword((81+19)/15));
	public static final RegistryObject<Item> HEAVYBLADE20 = ITEMS.register("heavyblade20",
			() -> new DothackSword((81+20)/15));
	public static final RegistryObject<Item> HEAVYBLADE21 = ITEMS.register("heavyblade21",
			() -> new DothackSword((81+21)/15));
	public static final RegistryObject<Item> HEAVYBLADE22 = ITEMS.register("heavyblade22",
			() -> new DothackSword((81+22)/15));
	public static final RegistryObject<Item> HEAVYBLADE23 = ITEMS.register("heavyblade23",
			() -> new DothackSword((81+23)/15));
	public static final RegistryObject<Item> HEAVYBLADE24 = ITEMS.register("heavyblade24",
			() -> new DothackSword((81+24)/15));
	public static final RegistryObject<Item> HEAVYBLADE25 = ITEMS.register("heavyblade25",
			() -> new DothackSword((81+25)/15));
	public static final RegistryObject<Item> HEAVYBLADE26 = ITEMS.register("heavyblade26",
			() -> new DothackSword((81+26)/15));
	public static final RegistryObject<Item> HEAVYBLADE27 = ITEMS.register("heavyblade27",
			() -> new DothackSword((81+27)/15));
	public static final RegistryObject<Item> HEAVYBLADE28 = ITEMS.register("heavyblade28",
			() -> new DothackSword((81+28)/15));
	public static final RegistryObject<Item> HEAVYBLADE29 = ITEMS.register("heavyblade29",
			() -> new DothackSword((81+29)/15));
	public static final RegistryObject<Item> HEAVYBLADE30 = ITEMS.register("heavyblade30",
			() -> new DothackSword((81+30)/15));
	public static final RegistryObject<Item> HEAVYBLADE31 = ITEMS.register("heavyblade31",
			() -> new DothackSword((81+31)/15));
	public static final RegistryObject<Item> HEAVYBLADE32 = ITEMS.register("heavyblade32",
			() -> new DothackSword((81+32)/15));
	public static final RegistryObject<Item> HEAVYBLADE33 = ITEMS.register("heavyblade33",
			() -> new DothackSword((81+33)/15));
	public static final RegistryObject<Item> HEAVYBLADE34 = ITEMS.register("heavyblade34",
			() -> new DothackSword((81+34)/15));
	public static final RegistryObject<Item> HEAVYBLADE35 = ITEMS.register("heavyblade35",
			() -> new DothackSword((81+35)/15));
	public static final RegistryObject<Item> HEAVYBLADE36 = ITEMS.register("heavyblade36",
			() -> new DothackSword((81+36)/15));
	public static final RegistryObject<Item> HEAVYBLADE37 = ITEMS.register("heavyblade37",
			() -> new DothackSword((81+37)/15));
	public static final RegistryObject<Item> HEAVYBLADE38 = ITEMS.register("heavyblade38",
			() -> new DothackSword((81+38)/15));
	public static final RegistryObject<Item> HEAVYBLADE39 = ITEMS.register("heavyblade39",
			() -> new DothackSword((81+39)/15));
	public static final RegistryObject<Item> HEAVYBLADE40 = ITEMS.register("heavyblade40",
			() -> new DothackSword((81+40)/15));
	public static final RegistryObject<Item> HEAVYBLADE41 = ITEMS.register("heavyblade41",
			() -> new DothackSword((81+41)/15));
	public static final RegistryObject<Item> HEAVYBLADE42 = ITEMS.register("heavyblade42",
			() -> new DothackSword((81+42)/15));
	public static final RegistryObject<Item> HEAVYBLADE43 = ITEMS.register("heavyblade43",
			() -> new DothackSword((81+43)/15));
	public static final RegistryObject<Item> HEAVYBLADE44 = ITEMS.register("heavyblade44",
			() -> new DothackSword((81+44)/15));
	public static final RegistryObject<Item> HEAVYBLADE45 = ITEMS.register("heavyblade45",
			() -> new DothackSword((81+45)/15));
	public static final RegistryObject<Item> HEAVYBLADE46 = ITEMS.register("heavyblade46",
			() -> new DothackSword((81+46)/15));
	public static final RegistryObject<Item> HEAVYBLADE47 = ITEMS.register("heavyblade47",
			() -> new DothackSword((81+47)/15));
	public static final RegistryObject<Item> HEAVYBLADE48 = ITEMS.register("heavyblade48",
			() -> new DothackSword((81+48)/15));
	public static final RegistryObject<Item> HEAVYBLADE49 = ITEMS.register("heavyblade49",
			() -> new DothackSword((81+49)/15));
	public static final RegistryObject<Item> HEAVYBLADE50 = ITEMS.register("heavyblade50",
			() -> new DothackSword((81+50)/15));
	public static final RegistryObject<Item> HEAVYBLADE51 = ITEMS.register("heavyblade51",
			() -> new DothackSword((81+51)/15));
	public static final RegistryObject<Item> HEAVYBLADE52 = ITEMS.register("heavyblade52",
			() -> new DothackSword((81+52)/15));
	public static final RegistryObject<Item> HEAVYBLADE53 = ITEMS.register("heavyblade53",
			() -> new DothackSword((81+53)/15));
	public static final RegistryObject<Item> HEAVYBLADE54 = ITEMS.register("heavyblade54",
			() -> new DothackSword((81+54)/15));

	public static final RegistryObject<Item> HEAVYBLADEV1 = ITEMS.register("heavybladev1",
			() -> new DothackSword((94+1)/15));
	public static final RegistryObject<Item> HEAVYBLADEV2 = ITEMS.register("heavybladev2",
			() -> new DothackSword((94+2)/15));
	public static final RegistryObject<Item> HEAVYBLADEV3 = ITEMS.register("heavybladev3",
			() -> new DothackSword((94+3)/15));
	public static final RegistryObject<Item> HEAVYBLADEV4 = ITEMS.register("heavybladev4",
			() -> new DothackSword((94+4)/15));
	public static final RegistryObject<Item> HEAVYBLADEV5 = ITEMS.register("heavybladev5",
			() -> new DothackSword((94+5)/15));
	public static final RegistryObject<Item> HEAVYBLADEV6 = ITEMS.register("heavybladev6",
			() -> new DothackSword((94+6)/15));
	public static final RegistryObject<Item> HEAVYBLADEV7 = ITEMS.register("heavybladev7",
			() -> new DothackSword((94+7)/15));
	public static final RegistryObject<Item> HEAVYBLADEV8 = ITEMS.register("heavybladev8",
			() -> new DothackSword((94+8)/15));
	public static final RegistryObject<Item> HEAVYBLADEV9 = ITEMS.register("heavybladev9",
			() -> new DothackSword((94+9)/15));
	public static final RegistryObject<Item> HEAVYBLADEV10 = ITEMS.register("heavybladev10",
			() -> new DothackSword((94+10)/15));
	public static final RegistryObject<Item> HEAVYBLADEV11 = ITEMS.register("heavybladev11",
			() -> new DothackSword((94+11)/15));
	public static final RegistryObject<Item> HEAVYBLADEV12 = ITEMS.register("heavybladev12",
			() -> new DothackSword((94+12)/15));
	public static final RegistryObject<Item> HEAVYBLADEV13 = ITEMS.register("heavybladev13",
			() -> new DothackSword((94+13)/15));
	public static final RegistryObject<Item> HEAVYBLADEV14 = ITEMS.register("heavybladev14",
			() -> new DothackSword((94+14)/15));
	public static final RegistryObject<Item> HEAVYBLADEV15 = ITEMS.register("heavybladev15",
			() -> new DothackSword((94+15)/15));
	public static final RegistryObject<Item> HEAVYBLADEV16 = ITEMS.register("heavybladev16",
			() -> new DothackSword((94+16)/15));
	public static final RegistryObject<Item> HEAVYBLADEV17 = ITEMS.register("heavybladev17",
			() -> new DothackSword((94+17)/15));
	public static final RegistryObject<Item> HEAVYBLADEV18 = ITEMS.register("heavybladev18",
			() -> new DothackSword((94+18)/15));
	public static final RegistryObject<Item> HEAVYBLADEV19 = ITEMS.register("heavybladev19",
			() -> new DothackSword((94+19)/15));
	public static final RegistryObject<Item> HEAVYBLADEV20 = ITEMS.register("heavybladev20",
			() -> new DothackSword((94+20)/15));
	public static final RegistryObject<Item> HEAVYBLADEV21 = ITEMS.register("heavybladev21",
			() -> new DothackSword((94+21)/15));
	public static final RegistryObject<Item> HEAVYBLADEV22 = ITEMS.register("heavybladev22",
			() -> new DothackSword((94+22)/15));
	public static final RegistryObject<Item> HEAVYBLADEV23 = ITEMS.register("heavybladev23",
			() -> new DothackSword((94+23)/15));
	public static final RegistryObject<Item> HEAVYBLADEV24 = ITEMS.register("heavybladev24",
			() -> new DothackSword((94+24)/15));
	public static final RegistryObject<Item> HEAVYBLADEV25 = ITEMS.register("heavybladev25",
			() -> new DothackSword((94+25)/15));
	public static final RegistryObject<Item> HEAVYBLADEV26 = ITEMS.register("heavybladev26",
			() -> new DothackSword((94+26)/15));
	public static final RegistryObject<Item> HEAVYBLADEV27 = ITEMS.register("heavybladev27",
			() -> new DothackSword((94+27)/15));
	public static final RegistryObject<Item> HEAVYBLADEV28 = ITEMS.register("heavybladev28",
			() -> new DothackSword((94+28)/15));
	public static final RegistryObject<Item> HEAVYBLADEV29 = ITEMS.register("heavybladev29",
			() -> new DothackSword((94+29)/15));
	public static final RegistryObject<Item> HEAVYBLADEV30 = ITEMS.register("heavybladev30",
			() -> new DothackSword((94+30)/15));
	public static final RegistryObject<Item> HEAVYBLADEV31 = ITEMS.register("heavybladev31",
			() -> new DothackSword((94+31)/15));
	public static final RegistryObject<Item> HEAVYBLADEV32 = ITEMS.register("heavybladev32",
			() -> new DothackSword((94+32)/15));
	public static final RegistryObject<Item> HEAVYBLADEV33 = ITEMS.register("heavybladev33",
			() -> new DothackSword((94+33)/15));
	public static final RegistryObject<Item> HEAVYBLADEV34 = ITEMS.register("heavybladev34",
			() -> new DothackSword((94+34)/15));
	public static final RegistryObject<Item> HEAVYBLADEV35 = ITEMS.register("heavybladev35",
			() -> new DothackSword((94+35)/15));
	public static final RegistryObject<Item> HEAVYBLADEV36 = ITEMS.register("heavybladev36",
			() -> new DothackSword((94+36)/15));
	public static final RegistryObject<Item> HEAVYBLADEV37 = ITEMS.register("heavybladev37",
			() -> new DothackSword((94+37)/15));
	public static final RegistryObject<Item> HEAVYBLADEV38 = ITEMS.register("heavybladev38",
			() -> new DothackSword((94+38)/15));
	public static final RegistryObject<Item> HEAVYBLADEV39 = ITEMS.register("heavybladev39",
			() -> new DothackSword((94+39)/15));
	public static final RegistryObject<Item> HEAVYBLADEV40 = ITEMS.register("heavybladev40",
			() -> new DothackSword((94+40)/15));
	public static final RegistryObject<Item> HEAVYBLADEV41 = ITEMS.register("heavybladev41",
			() -> new DothackSword((94+41)/15));

	public static final RegistryObject<Item> LONGARM1 = ITEMS.register("longarm1", () -> new DothackSword((4+1)/9));
	public static final RegistryObject<Item> LONGARM2 = ITEMS.register("longarm2", () -> new DothackSword((4+2)/9));
	public static final RegistryObject<Item> LONGARM3 = ITEMS.register("longarm3", () -> new DothackSword((4+3)/9));
	public static final RegistryObject<Item> LONGARM4 = ITEMS.register("longarm4", () -> new DothackSword((4+4)/9));
	public static final RegistryObject<Item> LONGARM5 = ITEMS.register("longarm5", () -> new DothackSword((4+5)/9));
	public static final RegistryObject<Item> LONGARM6 = ITEMS.register("longarm6", () -> new DothackSword((4+6)/9));
	public static final RegistryObject<Item> LONGARM7 = ITEMS.register("longarm7", () -> new DothackSword((4+7)/9));
	public static final RegistryObject<Item> LONGARM8 = ITEMS.register("longarm8", () -> new DothackSword((4+8)/9));
	public static final RegistryObject<Item> LONGARM9 = ITEMS.register("longarm9", () -> new DothackSword((4+9)/9));
	public static final RegistryObject<Item> LONGARM10 = ITEMS.register("longarm10",
			() -> new DothackSword((4+10)/9));
	public static final RegistryObject<Item> LONGARM11 = ITEMS.register("longarm11",
			() -> new DothackSword((4+11)/9));
	public static final RegistryObject<Item> LONGARM12 = ITEMS.register("longarm12",
			() -> new DothackSword((4+12)/9));
	public static final RegistryObject<Item> LONGARM13 = ITEMS.register("longarm13",
			() -> new DothackSword((4+13)/9));
	public static final RegistryObject<Item> LONGARM14 = ITEMS.register("longarm14",
			() -> new DothackSword((4+14)/9));
	public static final RegistryObject<Item> LONGARM15 = ITEMS.register("longarm15",
			() -> new DothackSword((4+15)/9));
	public static final RegistryObject<Item> LONGARM16 = ITEMS.register("longarm16",
			() -> new DothackSword((4+16)/9));
	public static final RegistryObject<Item> LONGARM17 = ITEMS.register("longarm17",
			() -> new DothackSword((4+17)/9));
	public static final RegistryObject<Item> LONGARM18 = ITEMS.register("longarm18",
			() -> new DothackSword((4+18)/9));
	public static final RegistryObject<Item> LONGARM19 = ITEMS.register("longarm19",
			() -> new DothackSword((4+19)/9));
	public static final RegistryObject<Item> LONGARM20 = ITEMS.register("longarm20",
			() -> new DothackSword((4+20)/9));
	public static final RegistryObject<Item> LONGARM21 = ITEMS.register("longarm21",
			() -> new DothackSword((4+21)/9));
	public static final RegistryObject<Item> LONGARM22 = ITEMS.register("longarm22",
			() -> new DothackSword((4+22)/9));
	public static final RegistryObject<Item> LONGARM23 = ITEMS.register("longarm23",
			() -> new DothackSword((4+23)/9));
	public static final RegistryObject<Item> LONGARM24 = ITEMS.register("longarm24",
			() -> new DothackSword((4+24)/9));
	public static final RegistryObject<Item> LONGARM25 = ITEMS.register("longarm25",
			() -> new DothackSword((4+25)/9));
	public static final RegistryObject<Item> LONGARM26 = ITEMS.register("longarm26",
			() -> new DothackSword((4+26)/9));
	public static final RegistryObject<Item> LONGARM27 = ITEMS.register("longarm27",
			() -> new DothackSword((4+27)/9));
	public static final RegistryObject<Item> LONGARM28 = ITEMS.register("longarm28",
			() -> new DothackSword((4+28)/9));
	public static final RegistryObject<Item> LONGARM29 = ITEMS.register("longarm29",
			() -> new DothackSword((4+29)/9));
	public static final RegistryObject<Item> LONGARM30 = ITEMS.register("longarm30",
			() -> new DothackSword((4+30)/9));
	public static final RegistryObject<Item> LONGARM31 = ITEMS.register("longarm31",
			() -> new DothackSword((4+31)/9));
	public static final RegistryObject<Item> LONGARM32 = ITEMS.register("longarm32",
			() -> new DothackSword((4+32)/9));
	public static final RegistryObject<Item> LONGARM33 = ITEMS.register("longarm33",
			() -> new DothackSword((4+33)/9));
	public static final RegistryObject<Item> LONGARM34 = ITEMS.register("longarm34",
			() -> new DothackSword((4+34)/9));
	public static final RegistryObject<Item> LONGARM35 = ITEMS.register("longarm35",
			() -> new DothackSword((4+35)/9));
	public static final RegistryObject<Item> LONGARM36 = ITEMS.register("longarm36",
			() -> new DothackSword((4+36)/9));
	public static final RegistryObject<Item> LONGARM37 = ITEMS.register("longarm37",
			() -> new DothackSword((4+37)/9));
	public static final RegistryObject<Item> LONGARM38 = ITEMS.register("longarm38",
			() -> new DothackSword((4+38)/9));
	public static final RegistryObject<Item> LONGARM39 = ITEMS.register("longarm39",
			() -> new DothackSword((4+39)/9));
	public static final RegistryObject<Item> LONGARM40 = ITEMS.register("longarm40",
			() -> new DothackSword((4+40)/9));
	public static final RegistryObject<Item> LONGARM41 = ITEMS.register("longarm41",
			() -> new DothackSword((4+41)/9));
	public static final RegistryObject<Item> LONGARM42 = ITEMS.register("longarm42",
			() -> new DothackSword((4+42)/9));
	public static final RegistryObject<Item> LONGARM43 = ITEMS.register("longarm43",
			() -> new DothackSword((4+43)/9));
	public static final RegistryObject<Item> LONGARM44 = ITEMS.register("longarm44",
			() -> new DothackSword((4+44)/9));
	public static final RegistryObject<Item> LONGARM45 = ITEMS.register("longarm45",
			() -> new DothackSword((4+45)/9));
	public static final RegistryObject<Item> LONGARM46 = ITEMS.register("longarm46",
			() -> new DothackSword((4+46)/9));
	public static final RegistryObject<Item> LONGARM47 = ITEMS.register("longarm47",
			() -> new DothackSword((4+47)/9));
	public static final RegistryObject<Item> LONGARM48 = ITEMS.register("longarm48",
			() -> new DothackSword((4+48)/9));
	public static final RegistryObject<Item> LONGARM49 = ITEMS.register("longarm49",
			() -> new DothackSword((4+49)/9));
	public static final RegistryObject<Item> LONGARM50 = ITEMS.register("longarm50",
			() -> new DothackSword((4+50)/9));
	public static final RegistryObject<Item> LONGARM51 = ITEMS.register("longarm51",
			() -> new DothackSword((4+51)/9));
	public static final RegistryObject<Item> LONGARM52 = ITEMS.register("longarm52",
			() -> new DothackSword((4+52)/9));
	public static final RegistryObject<Item> LONGARM53 = ITEMS.register("longarm53",
			() -> new DothackSword((4+53)/9));
	public static final RegistryObject<Item> LONGARM54 = ITEMS.register("longarm54",
			() -> new DothackSword((4+54)/9));
	public static final RegistryObject<Item> LONGARM55 = ITEMS.register("longarm55",
			() -> new DothackSword((4+55)/9));
	public static final RegistryObject<Item> LONGARM56 = ITEMS.register("longarm56",
			() -> new DothackSword((4+56)/9));
	public static final RegistryObject<Item> LONGARM57 = ITEMS.register("longarm57",
			() -> new DothackSword((4+57)/9));
	public static final RegistryObject<Item> LONGARM58 = ITEMS.register("longarm58",
			() -> new DothackSword((4+58)/9));
	public static final RegistryObject<Item> LONGARM59 = ITEMS.register("longarm59",
			() -> new DothackSword((4+59)/9));
	public static final RegistryObject<Item> LONGARM60 = ITEMS.register("longarm60",
			() -> new DothackSword((4+60)/9));
	public static final RegistryObject<Item> LONGARM61 = ITEMS.register("longarm61",
			() -> new DothackSword((4+61)/9));
	public static final RegistryObject<Item> LONGARM62 = ITEMS.register("longarm62",
			() -> new DothackSword((4+62)/9));
	public static final RegistryObject<Item> LONGARM63 = ITEMS.register("longarm63",
			() -> new DothackSword((4+63)/9));
	public static final RegistryObject<Item> LONGARM64 = ITEMS.register("longarm64",
			() -> new DothackSword((4+64)/9));
	public static final RegistryObject<Item> LONGARM65 = ITEMS.register("longarm65",
			() -> new DothackSword((4+65)/9));
	public static final RegistryObject<Item> LONGARM66 = ITEMS.register("longarm66",
			() -> new DothackSword((4+66)/9));
	public static final RegistryObject<Item> LONGARM67 = ITEMS.register("longarm67",
			() -> new DothackSword((4+67)/9));
	public static final RegistryObject<Item> LONGARM68 = ITEMS.register("longarm68",
			() -> new DothackSword((4+68)/9));
	public static final RegistryObject<Item> LONGARM69 = ITEMS.register("longarm69",
			() -> new DothackSword((4+69)/9));
	public static final RegistryObject<Item> LONGARM70 = ITEMS.register("longarm70",
			() -> new DothackSword((4+70)/9));
	public static final RegistryObject<Item> LONGARM71 = ITEMS.register("longarm71",
			() -> new DothackSword((4+71)/9));

	public static final RegistryObject<Item> TWINBLADE1 = ITEMS.register("twinblade1",
			() -> new DothackSword((2+1)/15));
	public static final RegistryObject<Item> TWINBLADE2 = ITEMS.register("twinblade2",
			() -> new DothackSword((2+2)/15));
	public static final RegistryObject<Item> TWINBLADE3 = ITEMS.register("twinblade3",
			() -> new DothackSword((2+3)/15));
	public static final RegistryObject<Item> TWINBLADE4 = ITEMS.register("twinblade4",
			() -> new DothackSword((2+4)/15));
	public static final RegistryObject<Item> TWINBLADE5 = ITEMS.register("twinblade5",
			() -> new DothackSword((2+5)/15));
	public static final RegistryObject<Item> TWINBLADE6 = ITEMS.register("twinblade6",
			() -> new DothackSword((2+6)/15));
	public static final RegistryObject<Item> TWINBLADE7 = ITEMS.register("twinblade7",
			() -> new DothackSword((2+7)/15));
	public static final RegistryObject<Item> TWINBLADE8 = ITEMS.register("twinblade8",
			() -> new DothackSword((2+8)/15));
	public static final RegistryObject<Item> TWINBLADE9 = ITEMS.register("twinblade9",
			() -> new DothackSword((2+9)/15));
	public static final RegistryObject<Item> TWINBLADE10 = ITEMS.register("twinblade10",
			() -> new DothackSword((2+10)/15));
	public static final RegistryObject<Item> TWINBLADE11 = ITEMS.register("twinblade11",
			() -> new DothackSword((2+11)/15));
	public static final RegistryObject<Item> TWINBLADE12 = ITEMS.register("twinblade12",
			() -> new DothackSword((2+12)/15));
	public static final RegistryObject<Item> TWINBLADE13 = ITEMS.register("twinblade13",
			() -> new DothackSword((2+13)/15));
	public static final RegistryObject<Item> TWINBLADE14 = ITEMS.register("twinblade14",
			() -> new DothackSword((2+14)/15));
	public static final RegistryObject<Item> TWINBLADE15 = ITEMS.register("twinblade15",
			() -> new DothackSword((2+15)/15));
	public static final RegistryObject<Item> TWINBLADE16 = ITEMS.register("twinblade16",
			() -> new DothackSword((2+16)/15));
	public static final RegistryObject<Item> TWINBLADE17 = ITEMS.register("twinblade17",
			() -> new DothackSword((2+17)/15));
	public static final RegistryObject<Item> TWINBLADE18 = ITEMS.register("twinblade18",
			() -> new DothackSword((2+18)/15));
	public static final RegistryObject<Item> TWINBLADE19 = ITEMS.register("twinblade19",
			() -> new DothackSword((2+19)/15));
	public static final RegistryObject<Item> TWINBLADE20 = ITEMS.register("twinblade20",
			() -> new DothackSword((2+20)/15));
	public static final RegistryObject<Item> TWINBLADE21 = ITEMS.register("twinblade21",
			() -> new DothackSword((2+21)/15));
	public static final RegistryObject<Item> TWINBLADE22 = ITEMS.register("twinblade22",
			() -> new DothackSword((2+22)/15));
	public static final RegistryObject<Item> TWINBLADE23 = ITEMS.register("twinblade23",
			() -> new DothackSword((2+23)/15));
	public static final RegistryObject<Item> TWINBLADE24 = ITEMS.register("twinblade24",
			() -> new DothackSword((2+24)/15));
	public static final RegistryObject<Item> TWINBLADE25 = ITEMS.register("twinblade25",
			() -> new DothackSword((2+25)/15));
	public static final RegistryObject<Item> TWINBLADE26 = ITEMS.register("twinblade26",
			() -> new DothackSword((2+26)/15));
	public static final RegistryObject<Item> TWINBLADE27 = ITEMS.register("twinblade27",
			() -> new DothackSword((2+27)/15));
	public static final RegistryObject<Item> TWINBLADE28 = ITEMS.register("twinblade28",
			() -> new DothackSword((2+28)/15));
	public static final RegistryObject<Item> TWINBLADE29 = ITEMS.register("twinblade29",
			() -> new DothackSword((2+29)/15));
	public static final RegistryObject<Item> TWINBLADE30 = ITEMS.register("twinblade30",
			() -> new DothackSword((2+30)/15));
	public static final RegistryObject<Item> TWINBLADE31 = ITEMS.register("twinblade31",
			() -> new DothackSword((2+31)/15));
	public static final RegistryObject<Item> TWINBLADE32 = ITEMS.register("twinblade32",
			() -> new DothackSword((2+32)/15));
	public static final RegistryObject<Item> TWINBLADE33 = ITEMS.register("twinblade33",
			() -> new DothackSword((2+33)/15));
	public static final RegistryObject<Item> TWINBLADE34 = ITEMS.register("twinblade34",
			() -> new DothackSword((2+34)/15));
	public static final RegistryObject<Item> TWINBLADE35 = ITEMS.register("twinblade35",
			() -> new DothackSword((2+35)/15));
	public static final RegistryObject<Item> TWINBLADE36 = ITEMS.register("twinblade36",
			() -> new DothackSword((2+36)/15));
	public static final RegistryObject<Item> TWINBLADE37 = ITEMS.register("twinblade37",
			() -> new DothackSword((2+37)/15));
	public static final RegistryObject<Item> TWINBLADE38 = ITEMS.register("twinblade38",
			() -> new DothackSword((2+38)/15));
	public static final RegistryObject<Item> TWINBLADE39 = ITEMS.register("twinblade39",
			() -> new DothackSword((2+39)/15));
	public static final RegistryObject<Item> TWINBLADE40 = ITEMS.register("twinblade40",
			() -> new DothackSword((2+40)/15));
	public static final RegistryObject<Item> TWINBLADE41 = ITEMS.register("twinblade41",
			() -> new DothackSword((2+41)/15));
	public static final RegistryObject<Item> TWINBLADE42 = ITEMS.register("twinblade42",
			() -> new DothackSword((2+42)/15));
	public static final RegistryObject<Item> TWINBLADE43 = ITEMS.register("twinblade43",
			() -> new DothackSword((2+43)/15));
	public static final RegistryObject<Item> TWINBLADE44 = ITEMS.register("twinblade44",
			() -> new DothackSword((2+44)/15));
	public static final RegistryObject<Item> TWINBLADE45 = ITEMS.register("twinblade45",
			() -> new DothackSword((2+45)/15));
	public static final RegistryObject<Item> TWINBLADE46 = ITEMS.register("twinblade46",
			() -> new DothackSword((2+46)/15));
	public static final RegistryObject<Item> TWINBLADE47 = ITEMS.register("twinblade47",
			() -> new DothackSword((2+47)/15));
	public static final RegistryObject<Item> TWINBLADE48 = ITEMS.register("twinblade48",
			() -> new DothackSword((2+48)/15));
	public static final RegistryObject<Item> TWINBLADE49 = ITEMS.register("twinblade49",
			() -> new DothackSword((2+49)/15));
	public static final RegistryObject<Item> TWINBLADE50 = ITEMS.register("twinblade50",
			() -> new DothackSword((2+50)/15));
	public static final RegistryObject<Item> TWINBLADE51 = ITEMS.register("twinblade51",
			() -> new DothackSword((2+51)/15));
	public static final RegistryObject<Item> TWINBLADE52 = ITEMS.register("twinblade52",
			() -> new DothackSword((2+52)/15));
	public static final RegistryObject<Item> TWINBLADE53 = ITEMS.register("twinblade53",
			() -> new DothackSword((2+53)/15));
	public static final RegistryObject<Item> TWINBLADE54 = ITEMS.register("twinblade54",
			() -> new DothackSword((2+54)/15));
	public static final RegistryObject<Item> TWINBLADE55 = ITEMS.register("twinblade55",
			() -> new DothackSword((2+55)/15));
	public static final RegistryObject<Item> TWINBLADE56 = ITEMS.register("twinblade56",
			() -> new DothackSword((2+56)/15));
	public static final RegistryObject<Item> TWINBLADE57 = ITEMS.register("twinblade57",
			() -> new DothackSword((2+57)/15));
	public static final RegistryObject<Item> TWINBLADE58 = ITEMS.register("twinblade58",
			() -> new DothackSword((2+58)/15));
	public static final RegistryObject<Item> TWINBLADE59 = ITEMS.register("twinblade59",
			() -> new DothackSword((2+59)/15));
	public static final RegistryObject<Item> TWINBLADE60 = ITEMS.register("twinblade60",
			() -> new DothackSword((2+60)/15));
	public static final RegistryObject<Item> TWINBLADE61 = ITEMS.register("twinblade61",
			() -> new DothackSword((2+61)/15));
	public static final RegistryObject<Item> TWINBLADE62 = ITEMS.register("twinblade62",
			() -> new DothackSword((2+62)/15));
	public static final RegistryObject<Item> TWINBLADE63 = ITEMS.register("twinblade63",
			() -> new DothackSword((2+63)/15));
	public static final RegistryObject<Item> TWINBLADE64 = ITEMS.register("twinblade64",
			() -> new DothackSword((2+64)/15));
	public static final RegistryObject<Item> TWINBLADE65 = ITEMS.register("twinblade65",
			() -> new DothackSword((2+65)/15));
	public static final RegistryObject<Item> TWINBLADE66 = ITEMS.register("twinblade66",
			() -> new DothackSword((2+66)/15));
	public static final RegistryObject<Item> TWINBLADE67 = ITEMS.register("twinblade67",
			() -> new DothackSword((2+67)/15));
	public static final RegistryObject<Item> TWINBLADE68 = ITEMS.register("twinblade68",
			() -> new DothackSword((2+68)/15));
	public static final RegistryObject<Item> TWINBLADE69 = ITEMS.register("twinblade69",
			() -> new DothackSword((2+69)/15));
	public static final RegistryObject<Item> TWINBLADE70 = ITEMS.register("twinblade70",
			() -> new DothackSword((2+70)/15));
	public static final RegistryObject<Item> TWINBLADE71 = ITEMS.register("twinblade71",
			() -> new DothackSword((2+71)/15));
	public static final RegistryObject<Item> TWINBLADE72 = ITEMS.register("twinblade72",
			() -> new DothackSword((2+72)/15));
	public static final RegistryObject<Item> TWINBLADE73 = ITEMS.register("twinblade73",
			() -> new DothackSword((2+73)/15));
	public static final RegistryObject<Item> TWINBLADE74 = ITEMS.register("twinblade74",
			() -> new DothackSword((2+74)/15));
	public static final RegistryObject<Item> TWINBLADE75 = ITEMS.register("twinblade75",
			() -> new DothackSword((2+75)/15));
	public static final RegistryObject<Item> TWINBLADE76 = ITEMS.register("twinblade76",
			() -> new DothackSword((2+76)/15));
	public static final RegistryObject<Item> TWINBLADE77 = ITEMS.register("twinblade77",
			() -> new DothackSword((2+77)/15));
	public static final RegistryObject<Item> TWINBLADE78 = ITEMS.register("twinblade78",
			() -> new DothackSword((2+78)/15));
	public static final RegistryObject<Item> TWINBLADE79 = ITEMS.register("twinblade79",
			() -> new DothackSword((2+79)/15));
	public static final RegistryObject<Item> TWINBLADE80 = ITEMS.register("twinblade80",
			() -> new DothackSword((2+80)/15));
	public static final RegistryObject<Item> TWINBLADE81 = ITEMS.register("twinblade81",
			() -> new DothackSword((2+81)/15));

	public static final RegistryObject<Item> DATADRAIN = ITEMS.register("datadrain",
			() -> new Item(
					new Item.Properties().group(DotHackTabs.AccessoriesItemGroup).maxStackSize(1).maxDamage(1000)));

	public static final RegistryObject<Item> HERMITSSTICK = ITEMS.register("hermitsstick", () -> new MagicItem());
	public static final RegistryObject<Item> REDWAND = ITEMS.register("redwand", () -> new MagicItem());

	public static final RegistryObject<Item> WAVEMASTER1 = ITEMS.register("wavemaster1", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER2 = ITEMS.register("wavemaster2", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER3 = ITEMS.register("wavemaster3", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER4 = ITEMS.register("wavemaster4", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER5 = ITEMS.register("wavemaster5", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER6 = ITEMS.register("wavemaster6", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER7 = ITEMS.register("wavemaster7", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER8 = ITEMS.register("wavemaster8", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER9 = ITEMS.register("wavemaster9", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER10 = ITEMS.register("wavemaster10", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER11 = ITEMS.register("wavemaster11", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER12 = ITEMS.register("wavemaster12", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER13 = ITEMS.register("wavemaster13", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER14 = ITEMS.register("wavemaster14", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER15 = ITEMS.register("wavemaster15", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER16 = ITEMS.register("wavemaster16", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER17 = ITEMS.register("wavemaster17", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER18 = ITEMS.register("wavemaster18", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER19 = ITEMS.register("wavemaster19", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER20 = ITEMS.register("wavemaster20", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER21 = ITEMS.register("wavemaster21", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER22 = ITEMS.register("wavemaster22", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER23 = ITEMS.register("wavemaster23", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER24 = ITEMS.register("wavemaster24", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER25 = ITEMS.register("wavemaster25", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER26 = ITEMS.register("wavemaster26", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER27 = ITEMS.register("wavemaster27", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER28 = ITEMS.register("wavemaster28", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER29 = ITEMS.register("wavemaster29", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER30 = ITEMS.register("wavemaster30", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER31 = ITEMS.register("wavemaster31", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER32 = ITEMS.register("wavemaster32", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER33 = ITEMS.register("wavemaster33", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER34 = ITEMS.register("wavemaster34", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER35 = ITEMS.register("wavemaster35", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER36 = ITEMS.register("wavemaster36", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER37 = ITEMS.register("wavemaster37", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER38 = ITEMS.register("wavemaster38", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER39 = ITEMS.register("wavemaster39", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER40 = ITEMS.register("wavemaster40", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER41 = ITEMS.register("wavemaster41", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER42 = ITEMS.register("wavemaster42", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER43 = ITEMS.register("wavemaster43", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER44 = ITEMS.register("wavemaster44", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER45 = ITEMS.register("wavemaster45", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER46 = ITEMS.register("wavemaster46", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER47 = ITEMS.register("wavemaster47", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER48 = ITEMS.register("wavemaster48", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER49 = ITEMS.register("wavemaster49", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER50 = ITEMS.register("wavemaster50", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER51 = ITEMS.register("wavemaster51", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER52 = ITEMS.register("wavemaster52", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER53 = ITEMS.register("wavemaster53", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER54 = ITEMS.register("wavemaster54", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER55 = ITEMS.register("wavemaster55", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER56 = ITEMS.register("wavemaster56", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER57 = ITEMS.register("wavemaster57", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER58 = ITEMS.register("wavemaster58", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER59 = ITEMS.register("wavemaster59", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER60 = ITEMS.register("wavemaster60", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER61 = ITEMS.register("wavemaster61", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER62 = ITEMS.register("wavemaster62", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER63 = ITEMS.register("wavemaster63", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER64 = ITEMS.register("wavemaster64", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER65 = ITEMS.register("wavemaster65", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER66 = ITEMS.register("wavemaster66", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER67 = ITEMS.register("wavemaster67", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER68 = ITEMS.register("wavemaster68", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER69 = ITEMS.register("wavemaster69", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER70 = ITEMS.register("wavemaster70", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER71 = ITEMS.register("wavemaster71", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER72 = ITEMS.register("wavemaster72", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER73 = ITEMS.register("wavemaster73", () -> new MagicItem());
	public static final RegistryObject<Item> WAVEMASTER74 = ITEMS.register("wavemaster74", () -> new MagicItem());

	public static final RegistryObject<Item> SHADOWWARLOCK1 = ITEMS.register("shadowwarlock1", () -> new MagicItem());
	public static final RegistryObject<Item> SHADOWWARLOCK2 = ITEMS.register("shadowwarlock2", () -> new MagicItem());
	public static final RegistryObject<Item> SHADOWWARLOCK3 = ITEMS.register("shadowwarlock3", () -> new MagicItem());
	public static final RegistryObject<Item> SHADOWWARLOCK4 = ITEMS.register("shadowwarlock4", () -> new MagicItem());
	public static final RegistryObject<Item> SHADOWWARLOCK5 = ITEMS.register("shadowwarlock5", () -> new MagicItem());
	public static final RegistryObject<Item> SHADOWWARLOCK6 = ITEMS.register("shadowwarlock6", () -> new MagicItem());
	public static final RegistryObject<Item> SHADOWWARLOCK7 = ITEMS.register("shadowwarlock7", () -> new MagicItem());
	public static final RegistryObject<Item> SHADOWWARLOCK8 = ITEMS.register("shadowwarlock8", () -> new MagicItem());
	public static final RegistryObject<Item> SHADOWWARLOCK9 = ITEMS.register("shadowwarlock9", () -> new MagicItem());
	public static final RegistryObject<Item> SHADOWWARLOCK10 = ITEMS.register("shadowwarlock10", () -> new MagicItem());
	public static final RegistryObject<Item> SHADOWWARLOCK11 = ITEMS.register("shadowwarlock11", () -> new MagicItem());
	public static final RegistryObject<Item> SHADOWWARLOCK12 = ITEMS.register("shadowwarlock12", () -> new MagicItem());
	public static final RegistryObject<Item> SHADOWWARLOCK13 = ITEMS.register("shadowwarlock13", () -> new MagicItem());
	public static final RegistryObject<Item> SHADOWWARLOCK14 = ITEMS.register("shadowwarlock14", () -> new MagicItem());

	public static final RegistryObject<Item> HARVESTCLERIC1 = ITEMS.register("harvestcleric1", () -> new MagicItem());
	public static final RegistryObject<Item> HARVESTCLERIC2 = ITEMS.register("harvestcleric2", () -> new MagicItem());
	public static final RegistryObject<Item> HARVESTCLERIC3 = ITEMS.register("harvestcleric3", () -> new MagicItem());
	public static final RegistryObject<Item> HARVESTCLERIC4 = ITEMS.register("harvestcleric4", () -> new MagicItem());
	public static final RegistryObject<Item> HARVESTCLERIC5 = ITEMS.register("harvestcleric5", () -> new MagicItem());
	public static final RegistryObject<Item> HARVESTCLERIC6 = ITEMS.register("harvestcleric6", () -> new MagicItem());
	public static final RegistryObject<Item> HARVESTCLERIC7 = ITEMS.register("harvestcleric7", () -> new MagicItem());
	public static final RegistryObject<Item> HARVESTCLERIC8 = ITEMS.register("harvestcleric8", () -> new MagicItem());
	public static final RegistryObject<Item> HARVESTCLERIC9 = ITEMS.register("harvestcleric9", () -> new MagicItem());
	public static final RegistryObject<Item> HARVESTCLERIC10 = ITEMS.register("harvestcleric10", () -> new MagicItem());

	public static final RegistryObject<Item> MACABREDANCER1 = ITEMS.register("macabredancer1", () -> new MagicItem());
	public static final RegistryObject<Item> MACABREDANCER2 = ITEMS.register("macabredancer2", () -> new MagicItem());
	public static final RegistryObject<Item> MACABREDANCER3 = ITEMS.register("macabredancer3", () -> new MagicItem());
	public static final RegistryObject<Item> MACABREDANCER4 = ITEMS.register("macabredancer4", () -> new MagicItem());
	public static final RegistryObject<Item> MACABREDANCER5 = ITEMS.register("macabredancer5", () -> new MagicItem());

	public static final RegistryObject<Item> DUALGUNNER1 = ITEMS.register("dualgunner1", () -> new DualGunItem());
	public static final RegistryObject<Item> DUALGUNNER2 = ITEMS.register("dualgunner2", () -> new DualGunItem());
	public static final RegistryObject<Item> DUALGUNNER3 = ITEMS.register("dualgunner3", () -> new DualGunItem());
	public static final RegistryObject<Item> DUALGUNNER4 = ITEMS.register("dualgunner4", () -> new DualGunItem());

	public static final RegistryObject<Item> STEAMGUNNER1 = ITEMS.register("steamgunner1", () -> new SteamGunItem());
	public static final RegistryObject<Item> STEAMGUNNER2 = ITEMS.register("steamgunner2", () -> new SteamGunItem());
	public static final RegistryObject<Item> STEAMGUNNER3 = ITEMS.register("steamgunner3", () -> new SteamGunItem());
	public static final RegistryObject<Item> STEAMGUNNER4 = ITEMS.register("steamgunner4", () -> new SteamGunItem());
	public static final RegistryObject<Item> STEAMGUNNER5 = ITEMS.register("steamgunner5", () -> new SteamGunItem());
	public static final RegistryObject<Item> STEAMGUNNER6 = ITEMS.register("steamgunner6", () -> new SteamGunItem());
	public static final RegistryObject<Item> STEAMGUNNER7 = ITEMS.register("steamgunner7", () -> new SteamGunItem());
	public static final RegistryObject<Item> STEAMGUNNER8 = ITEMS.register("steamgunner8", () -> new SteamGunItem());
	public static final RegistryObject<Item> STEAMGUNNER9 = ITEMS.register("steamgunner9", () -> new SteamGunItem());
	public static final RegistryObject<Item> STEAMGUNNER10 = ITEMS.register("steamgunner10", () -> new SteamGunItem());
	public static final RegistryObject<Item> STEAMGUNNER11 = ITEMS.register("steamgunner11", () -> new SteamGunItem());
	public static final RegistryObject<Item> STEAMGUNNER12 = ITEMS.register("steamgunner12", () -> new SteamGunItem());
	public static final RegistryObject<Item> STEAMGUNNER13 = ITEMS.register("steamgunner13", () -> new SteamGunItem());
	public static final RegistryObject<Item> STEAMGUNNER14 = ITEMS.register("steamgunner14", () -> new SteamGunItem());
	public static final RegistryObject<Item> STEAMGUNNER15 = ITEMS.register("steamgunner15", () -> new SteamGunItem());
	public static final RegistryObject<Item> STEAMGUNNER16 = ITEMS.register("steamgunner16", () -> new SteamGunItem());
	public static final RegistryObject<Item> STEAMGUNNER17 = ITEMS.register("steamgunner17", () -> new SteamGunItem());
	public static final RegistryObject<Item> STEAMGUNNER18 = ITEMS.register("steamgunner18", () -> new SteamGunItem());
}