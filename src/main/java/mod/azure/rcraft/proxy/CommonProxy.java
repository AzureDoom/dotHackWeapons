package mod.azure.rcraft.proxy;

import java.util.ArrayList;
import java.util.List;

import electroblob.wizardry.constants.Element;
import electroblob.wizardry.constants.Tier;

import mod.azure.rcraft.RcraftMod;
import mod.azure.rcraft.items.ItemBaseSword;
import mod.azure.rcraft.items.ItemMMOBow;
import mod.azure.rcraft.items.ItemBaseGun;
import mod.azure.rcraft.items.ItemBaseMagic;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class CommonProxy {


	public void preInit() {

	}

	public void init() {

	}

	public void postInit() {
	}

	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> e) {
			IForgeRegistry<Item> registry = e.getRegistry();

			for (Item item : itemList) {
				registry.register(item);
			}

			variantList = NonNullList.create();
			for (Item item : itemList) {
				item.getSubItems(RcraftMod.tab, variantList);
			}
		}
	}

	public static Item[] itemList;
	public static NonNullList<ItemStack> variantList;  
	static {
		if(Loader.isModLoaded("ebwizardry")) {
			List<Item> items = new ArrayList<Item>();
			items.add(new ItemBaseSword("bladebrandier", 3));
			for (int i = 2; i <= 19; i ++)
			{
				items.add(new ItemBaseSword("bladebrandier" + i, 3 * i));
			}
			items.add(new ItemBaseGun("dualgunner"));
			items.add(new ItemBaseGun("dualgunner1"));
			items.add(new ItemBaseGun("dualgunner2"));
			items.add(new ItemBaseSword("dualswords", 2));
			for (int i = 2; i <= 25; i ++)
			{
				items.add(new ItemBaseSword("dualswords" + i, 2 * i));
			}
			items.add(new ItemBaseSword("edgepunisher", 4));
			for (int i = 2; i <= 20; i ++)
			{
				items.add(new ItemBaseSword("edgepunisher" + i, 4 * i));
			}
			items.add(new ItemBaseSword("flickreaper", 4));
			for (int i = 2; i <= 9; i ++)
			{
				items.add(new ItemBaseSword("flickreaper" + i, 4 * i));
			}
			items.add(new ItemBaseSword("lordpartizan", 4));
			for (int i = 2; i <= 9; i ++)
			{
				items.add(new ItemBaseSword("lordpartizan" + i, 4 * i));
			}
			items.add(new ItemBaseGun("steamgunner"));      
			for (int i = 1; i <= 17; i ++)
			{
				items.add(new ItemBaseGun("steamgunner" + i));
			}       
			items.add(new ItemBaseSword("tribalgrappler", 3));
			for (int i = 2; i <= 11; i ++)
			{
				items.add(new ItemBaseSword("tribalgrappler" + i, 3 * i));
			} 
			items.add(new ItemBaseSword("blademaster", 3));
			for (int i = 2; i <= 41; i ++)
			{
				items.add(new ItemBaseSword("blademaster" + i, 3 * i));
			}
			items.add(new ItemBaseSword("heavyaxeman", 4));
			for (int i = 2; i <= 45; i ++)
			{
				items.add(new ItemBaseSword("heavyaxeman" + i, 4 * i));
			} 
			items.add(new ItemBaseSword("heavyblade", 4));
			for (int i = 2; i <= 38; i ++)
			{
				items.add(new ItemBaseSword("heavyblade" + i, 4 * i));
			} 
			items.add(new ItemBaseSword("longarm", 4));
			for (int i = 2; i <= 42; i ++)
			{
				items.add(new ItemBaseSword("longarm" + i, 4 * i));
			} 
			items.add(new ItemBaseSword("twinblade", 2));
			for (int i = 2; i <= 79; i ++)
			{
				items.add(new ItemBaseSword("twinblade" + i, 2 * i));
			} 
			items.add(new ItemBaseMagic("harvestcleric", Tier.BASIC, Element.EARTH));
			items.add(new ItemBaseMagic("harvestcleric1", Tier.BASIC, Element.LIGHTNING));
			items.add(new ItemBaseMagic("harvestcleric2", Tier.BASIC, Element.HEALING));
			items.add(new ItemBaseMagic("harvestcleric3", Tier.BASIC, Element.SORCERY));
			items.add(new ItemBaseMagic("harvestcleric4", Tier.APPRENTICE, Element.SORCERY));
			items.add(new ItemBaseMagic("harvestcleric5", Tier.APPRENTICE, Element.ICE));
			items.add(new ItemBaseMagic("harvestcleric6", Tier.APPRENTICE, Element.SORCERY));
			items.add(new ItemBaseMagic("harvestcleric7", Tier.ADVANCED, Element.FIRE));
			items.add(new ItemBaseMagic("harvestcleric8", Tier.MASTER, Element.FIRE));
			items.add(new ItemBaseMagic("macabredancer", Tier.BASIC, Element.SORCERY));
			items.add(new ItemBaseMagic("macabredancer1", Tier.APPRENTICE, Element.EARTH));
			items.add(new ItemBaseMagic("macabredancer2", Tier.APPRENTICE, Element.NECROMANCY));
			items.add(new ItemBaseMagic("macabredancer3", Tier.ADVANCED, Element.FIRE));
			items.add(new ItemBaseMagic("macabredancer4", Tier.MASTER, Element.FIRE));
			items.add(new ItemBaseMagic("shadowwarlock", Tier.BASIC, Element.MAGIC));
			items.add(new ItemBaseMagic("shadowwarlock1", Tier.BASIC, Element.SORCERY));
			items.add(new ItemBaseMagic("shadowwarlock2", Tier.BASIC, Element.EARTH));
			items.add(new ItemBaseMagic("shadowwarlock3", Tier.BASIC, Element.HEALING));
			items.add(new ItemBaseMagic("shadowwarlock4", Tier.APPRENTICE, Element.SORCERY));
			items.add(new ItemBaseMagic("shadowwarlock5", Tier.APPRENTICE, Element.NECROMANCY));
			items.add(new ItemBaseMagic("shadowwarlock6", Tier.APPRENTICE, Element.EARTH));
			items.add(new ItemBaseMagic("shadowwarlock7", Tier.APPRENTICE, Element.ICE));
			items.add(new ItemBaseMagic("shadowwarlock8", Tier.APPRENTICE, Element.SORCERY));
			items.add(new ItemBaseMagic("shadowwarlock9", Tier.APPRENTICE, Element.LIGHTNING));
			items.add(new ItemBaseMagic("shadowwarlock10", Tier.ADVANCED, Element.HEALING));
			items.add(new ItemBaseMagic("shadowwarlock11", Tier.MASTER, Element.EARTH));
			items.add(new ItemBaseMagic("shadowwarlock12", Tier.ADVANCED, Element.HEALING));
			items.add(new ItemBaseMagic("shadowwarlock13", Tier.MASTER, Element.EARTH));
			items.add(new ItemBaseMagic("wavemaster", Tier.BASIC, Element.MAGIC));
			items.add(new ItemBaseMagic("wavemaster1", Tier.BASIC, Element.EARTH));
			items.add(new ItemBaseMagic("wavemaster2", Tier.BASIC, Element.ICE));
			items.add(new ItemBaseMagic("wavemaster3", Tier.BASIC, Element.FIRE));
			items.add(new ItemBaseMagic("wavemaster4", Tier.BASIC, Element.EARTH));
			items.add(new ItemBaseMagic("wavemaster5", Tier.BASIC, Element.LIGHTNING));
			items.add(new ItemBaseMagic("wavemaster6", Tier.BASIC, Element.NECROMANCY));
			items.add(new ItemBaseMagic("wavemaster7", Tier.BASIC, Element.HEALING));
			items.add(new ItemBaseMagic("wavemaster8", Tier.BASIC, Element.SORCERY));
			items.add(new ItemBaseMagic("wavemaster9", Tier.APPRENTICE, Element.ICE));
			items.add(new ItemBaseMagic("wavemaster10", Tier.APPRENTICE, Element.FIRE));
			items.add(new ItemBaseMagic("wavemaster11", Tier.APPRENTICE, Element.LIGHTNING));
			items.add(new ItemBaseMagic("wavemaster12", Tier.APPRENTICE, Element.MAGIC));
			items.add(new ItemBaseMagic("wavemaster13", Tier.APPRENTICE, Element.SORCERY));
			items.add(new ItemBaseMagic("wavemaster14", Tier.APPRENTICE, Element.MAGIC));
			items.add(new ItemBaseMagic("wavemaster15", Tier.APPRENTICE, Element.MAGIC));
			items.add(new ItemBaseMagic("wavemaster16", Tier.APPRENTICE, Element.ICE));
			items.add(new ItemBaseMagic("wavemaster17", Tier.APPRENTICE, Element.FIRE));
			items.add(new ItemBaseMagic("wavemaster18", Tier.APPRENTICE, Element.SORCERY));
			items.add(new ItemBaseMagic("wavemaster19", Tier.APPRENTICE, Element.LIGHTNING));
			items.add(new ItemBaseMagic("wavemaster20", Tier.ADVANCED, Element.NECROMANCY));
			items.add(new ItemBaseMagic("wavemaster21", Tier.ADVANCED, Element.SORCERY));
			items.add(new ItemBaseMagic("wavemaster22", Tier.ADVANCED, Element.SORCERY));
			items.add(new ItemBaseMagic("wavemaster23", Tier.ADVANCED, Element.LIGHTNING));
			items.add(new ItemBaseMagic("wavemaster24", Tier.ADVANCED, Element.FIRE));
			items.add(new ItemBaseMagic("wavemaster25", Tier.ADVANCED, Element.EARTH));
			items.add(new ItemBaseMagic("wavemaster26", Tier.ADVANCED, Element.LIGHTNING));
			items.add(new ItemBaseMagic("wavemaster27", Tier.ADVANCED, Element.NECROMANCY));
			items.add(new ItemBaseMagic("wavemaster28", Tier.ADVANCED, Element.HEALING));
			items.add(new ItemBaseMagic("wavemaster29", Tier.ADVANCED, Element.EARTH));
			items.add(new ItemBaseMagic("wavemaster30", Tier.ADVANCED, Element.ICE));
			items.add(new ItemBaseMagic("wavemaster31", Tier.ADVANCED, Element.FIRE));
			items.add(new ItemBaseMagic("wavemaster32", Tier.ADVANCED, Element.HEALING));
			items.add(new ItemBaseMagic("wavemaster33", Tier.ADVANCED, Element.LIGHTNING));
			items.add(new ItemBaseMagic("wavemaster34", Tier.ADVANCED, Element.SORCERY));
			items.add(new ItemBaseMagic("wavemaster35", Tier.MASTER, Element.NECROMANCY));
			items.add(new ItemBaseMagic("wavemaster36", Tier.MASTER, Element.EARTH));
			items.add(new ItemBaseMagic("wavemaster37", Tier.MASTER, Element.LIGHTNING));
			items.add(new ItemBaseMagic("wavemaster38", Tier.MASTER, Element.FIRE));
			items.add(new ItemBaseMagic("wavemaster39", Tier.MASTER, Element.NECROMANCY));
			items.add(new ItemBaseMagic("wavemaster40", Tier.MASTER, Element.HEALING));
			items.add(new ItemBaseMagic("wavemaster41", Tier.MASTER, Element.LIGHTNING));
			items.add(new ItemBaseMagic("wavemaster42", Tier.MASTER, Element.SORCERY));
			items.add(new ItemBaseMagic("wavemaster43", Tier.MASTER, Element.SORCERY)); 
			itemList = items.toArray(new Item[items.size()]);
		} if(Loader.isModLoaded("mmorpg")) {
			List<Item> items = new ArrayList<Item>();
			items.add(new ItemBaseSword("bladebrandier", 3));
			for (int i = 2; i <= 19; i ++)
			{
				items.add(new ItemBaseSword("bladebrandier" + i, 3 * i));
			}
			items.add(new ItemMMOBow("dualgunner"));
			items.add(new ItemMMOBow("dualgunner1"));
			items.add(new ItemMMOBow("dualgunner2"));
			items.add(new ItemBaseSword("dualswords", 2));
			for (int i = 2; i <= 25; i ++)
			{
				items.add(new ItemBaseSword("dualswords" + i, 2 * i));
			}
			items.add(new ItemBaseSword("edgepunisher", 4));
			for (int i = 2; i <= 20; i ++)
			{
				items.add(new ItemBaseSword("edgepunisher" + i, 4 * i));
			}
			items.add(new ItemBaseSword("flickreaper", 4));
			for (int i = 2; i <= 9; i ++)
			{
				items.add(new ItemBaseSword("flickreaper" + i, 4 * i));
			}
			items.add(new ItemBaseSword("lordpartizan", 4));
			for (int i = 2; i <= 9; i ++)
			{
				items.add(new ItemBaseSword("lordpartizan" + i, 4 * i));
			}
			items.add(new ItemMMOBow("steamgunner"));      
			for (int i = 1; i <= 17; i ++)
			{
				items.add(new ItemMMOBow("steamgunner" + i));
			}       
			items.add(new ItemBaseSword("tribalgrappler", 3));
			for (int i = 2; i <= 11; i ++)
			{
				items.add(new ItemBaseSword("tribalgrappler" + i, 3 * i));
			} 
			items.add(new ItemBaseSword("blademaster", 3));
			for (int i = 2; i <= 41; i ++)
			{
				items.add(new ItemBaseSword("blademaster" + i, 3 * i));
			}
			items.add(new ItemBaseSword("heavyaxeman", 4));
			for (int i = 2; i <= 45; i ++)
			{
				items.add(new ItemBaseSword("heavyaxeman" + i, 4 * i));
			} 
			items.add(new ItemBaseSword("heavyblade", 4));
			for (int i = 2; i <= 38; i ++)
			{
				items.add(new ItemBaseSword("heavyblade" + i, 4 * i));
			} 
			items.add(new ItemBaseSword("longarm", 4));
			for (int i = 2; i <= 42; i ++)
			{
				items.add(new ItemBaseSword("longarm" + i, 4 * i));
			} 
			items.add(new ItemBaseSword("twinblade", 2));
			for (int i = 2; i <= 79; i ++)
			{
				items.add(new ItemBaseSword("twinblade" + i, 2 * i));
			} 
			items.add(new ItemBaseMagic("harvestcleric", Tier.BASIC, Element.EARTH));
			items.add(new ItemBaseMagic("harvestcleric1", Tier.BASIC, Element.LIGHTNING));
			items.add(new ItemBaseMagic("harvestcleric2", Tier.BASIC, Element.HEALING));
			items.add(new ItemBaseMagic("harvestcleric3", Tier.BASIC, Element.SORCERY));
			items.add(new ItemBaseMagic("harvestcleric4", Tier.APPRENTICE, Element.SORCERY));
			items.add(new ItemBaseMagic("harvestcleric5", Tier.APPRENTICE, Element.ICE));
			items.add(new ItemBaseMagic("harvestcleric6", Tier.APPRENTICE, Element.SORCERY));
			items.add(new ItemBaseMagic("harvestcleric7", Tier.ADVANCED, Element.FIRE));
			items.add(new ItemBaseMagic("harvestcleric8", Tier.MASTER, Element.FIRE));
			items.add(new ItemBaseMagic("macabredancer", Tier.BASIC, Element.SORCERY));
			items.add(new ItemBaseMagic("macabredancer1", Tier.APPRENTICE, Element.EARTH));
			items.add(new ItemBaseMagic("macabredancer2", Tier.APPRENTICE, Element.NECROMANCY));
			items.add(new ItemBaseMagic("macabredancer3", Tier.ADVANCED, Element.FIRE));
			items.add(new ItemBaseMagic("macabredancer4", Tier.MASTER, Element.FIRE));
			items.add(new ItemBaseMagic("shadowwarlock", Tier.BASIC, Element.MAGIC));
			items.add(new ItemBaseMagic("shadowwarlock1", Tier.BASIC, Element.SORCERY));
			items.add(new ItemBaseMagic("shadowwarlock2", Tier.BASIC, Element.EARTH));
			items.add(new ItemBaseMagic("shadowwarlock3", Tier.BASIC, Element.HEALING));
			items.add(new ItemBaseMagic("shadowwarlock4", Tier.APPRENTICE, Element.SORCERY));
			items.add(new ItemBaseMagic("shadowwarlock5", Tier.APPRENTICE, Element.NECROMANCY));
			items.add(new ItemBaseMagic("shadowwarlock6", Tier.APPRENTICE, Element.EARTH));
			items.add(new ItemBaseMagic("shadowwarlock7", Tier.APPRENTICE, Element.ICE));
			items.add(new ItemBaseMagic("shadowwarlock8", Tier.APPRENTICE, Element.SORCERY));
			items.add(new ItemBaseMagic("shadowwarlock9", Tier.APPRENTICE, Element.LIGHTNING));
			items.add(new ItemBaseMagic("shadowwarlock10", Tier.ADVANCED, Element.HEALING));
			items.add(new ItemBaseMagic("shadowwarlock11", Tier.MASTER, Element.EARTH));
			items.add(new ItemBaseMagic("shadowwarlock12", Tier.ADVANCED, Element.HEALING));
			items.add(new ItemBaseMagic("shadowwarlock13", Tier.MASTER, Element.EARTH));
			items.add(new ItemBaseMagic("wavemaster", Tier.BASIC, Element.MAGIC));
			items.add(new ItemBaseMagic("wavemaster1", Tier.BASIC, Element.EARTH));
			items.add(new ItemBaseMagic("wavemaster2", Tier.BASIC, Element.ICE));
			items.add(new ItemBaseMagic("wavemaster3", Tier.BASIC, Element.FIRE));
			items.add(new ItemBaseMagic("wavemaster4", Tier.BASIC, Element.EARTH));
			items.add(new ItemBaseMagic("wavemaster5", Tier.BASIC, Element.LIGHTNING));
			items.add(new ItemBaseMagic("wavemaster6", Tier.BASIC, Element.NECROMANCY));
			items.add(new ItemBaseMagic("wavemaster7", Tier.BASIC, Element.HEALING));
			items.add(new ItemBaseMagic("wavemaster8", Tier.BASIC, Element.SORCERY));
			items.add(new ItemBaseMagic("wavemaster9", Tier.APPRENTICE, Element.ICE));
			items.add(new ItemBaseMagic("wavemaster10", Tier.APPRENTICE, Element.FIRE));
			items.add(new ItemBaseMagic("wavemaster11", Tier.APPRENTICE, Element.LIGHTNING));
			items.add(new ItemBaseMagic("wavemaster12", Tier.APPRENTICE, Element.MAGIC));
			items.add(new ItemBaseMagic("wavemaster13", Tier.APPRENTICE, Element.SORCERY));
			items.add(new ItemBaseMagic("wavemaster14", Tier.APPRENTICE, Element.MAGIC));
			items.add(new ItemBaseMagic("wavemaster15", Tier.APPRENTICE, Element.MAGIC));
			items.add(new ItemBaseMagic("wavemaster16", Tier.APPRENTICE, Element.ICE));
			items.add(new ItemBaseMagic("wavemaster17", Tier.APPRENTICE, Element.FIRE));
			items.add(new ItemBaseMagic("wavemaster18", Tier.APPRENTICE, Element.SORCERY));
			items.add(new ItemBaseMagic("wavemaster19", Tier.APPRENTICE, Element.LIGHTNING));
			items.add(new ItemBaseMagic("wavemaster20", Tier.ADVANCED, Element.NECROMANCY));
			items.add(new ItemBaseMagic("wavemaster21", Tier.ADVANCED, Element.SORCERY));
			items.add(new ItemBaseMagic("wavemaster22", Tier.ADVANCED, Element.SORCERY));
			items.add(new ItemBaseMagic("wavemaster23", Tier.ADVANCED, Element.LIGHTNING));
			items.add(new ItemBaseMagic("wavemaster24", Tier.ADVANCED, Element.FIRE));
			items.add(new ItemBaseMagic("wavemaster25", Tier.ADVANCED, Element.EARTH));
			items.add(new ItemBaseMagic("wavemaster26", Tier.ADVANCED, Element.LIGHTNING));
			items.add(new ItemBaseMagic("wavemaster27", Tier.ADVANCED, Element.NECROMANCY));
			items.add(new ItemBaseMagic("wavemaster28", Tier.ADVANCED, Element.HEALING));
			items.add(new ItemBaseMagic("wavemaster29", Tier.ADVANCED, Element.EARTH));
			items.add(new ItemBaseMagic("wavemaster30", Tier.ADVANCED, Element.ICE));
			items.add(new ItemBaseMagic("wavemaster31", Tier.ADVANCED, Element.FIRE));
			items.add(new ItemBaseMagic("wavemaster32", Tier.ADVANCED, Element.HEALING));
			items.add(new ItemBaseMagic("wavemaster33", Tier.ADVANCED, Element.LIGHTNING));
			items.add(new ItemBaseMagic("wavemaster34", Tier.ADVANCED, Element.SORCERY));
			items.add(new ItemBaseMagic("wavemaster35", Tier.MASTER, Element.NECROMANCY));
			items.add(new ItemBaseMagic("wavemaster36", Tier.MASTER, Element.EARTH));
			items.add(new ItemBaseMagic("wavemaster37", Tier.MASTER, Element.LIGHTNING));
			items.add(new ItemBaseMagic("wavemaster38", Tier.MASTER, Element.FIRE));
			items.add(new ItemBaseMagic("wavemaster39", Tier.MASTER, Element.NECROMANCY));
			items.add(new ItemBaseMagic("wavemaster40", Tier.MASTER, Element.HEALING));
			items.add(new ItemBaseMagic("wavemaster41", Tier.MASTER, Element.LIGHTNING));
			items.add(new ItemBaseMagic("wavemaster42", Tier.MASTER, Element.SORCERY));
			items.add(new ItemBaseMagic("wavemaster43", Tier.MASTER, Element.SORCERY)); 
			itemList = items.toArray(new Item[items.size()]);
		} else {
			List<Item> items = new ArrayList<Item>();
			items.add(new ItemBaseSword("bladebrandier", 3));
			for (int i = 2; i <= 19; i ++)
			{
				items.add(new ItemBaseSword("bladebrandier" + i, 3 * i));
			}
			items.add(new ItemBaseGun("dualgunner"));
			items.add(new ItemBaseGun("dualgunner1"));
			items.add(new ItemBaseGun("dualgunner2"));
			items.add(new ItemBaseSword("dualswords", 2));
			for (int i = 2; i <= 25; i ++)
			{
				items.add(new ItemBaseSword("dualswords" + i, 2 * i));
			}
			items.add(new ItemBaseSword("edgepunisher", 4));
			for (int i = 2; i <= 20; i ++)
			{
				items.add(new ItemBaseSword("edgepunisher" + i, 4 * i));
			}
			items.add(new ItemBaseSword("flickreaper", 4));
			for (int i = 2; i <= 9; i ++)
			{
				items.add(new ItemBaseSword("flickreaper" + i, 4 * i));
			}
			items.add(new ItemBaseSword("lordpartizan", 4));
			for (int i = 2; i <= 9; i ++)
			{
				items.add(new ItemBaseSword("lordpartizan" + i, 4 * i));
			}
			items.add(new ItemBaseGun("steamgunner"));      
			for (int i = 1; i <= 17; i ++)
			{
				items.add(new ItemBaseGun("steamgunner" + i));
			}
			items.add(new ItemBaseSword("tribalgrappler", 3));
			for (int i = 2; i <= 4; i ++)
			{
				items.add(new ItemBaseSword("tribalgrappler" + i, 3 * i));
			} 
			items.add(new ItemBaseSword("blademaster", 3));
			for (int i = 2; i <= 41; i ++)
			{
				items.add(new ItemBaseSword("blademaster" + i, 3 * i));
			} 
			items.add(new ItemBaseSword("heavyaxeman", 4));
			for (int i = 2; i <= 45; i ++)
			{
				items.add(new ItemBaseSword("heavyaxeman" + i, 4 * i));
			} 
			items.add(new ItemBaseSword("heavyblade", 4));
			for (int i = 2; i <= 38; i ++)
			{
				items.add(new ItemBaseSword("heavyblade" + i, 4 * i));
			} 
			items.add(new ItemBaseSword("longarm", 4));
			for (int i = 2; i <= 42; i ++)
			{
				items.add(new ItemBaseSword("longarm" + i, 4 * i));
			} 
			items.add(new ItemBaseSword("twinblade", 2));
			for (int i = 2; i <= 79; i ++)
			{
				items.add(new ItemBaseSword("twinblade" + i, 2 * i));
			} 
			items.add(new ItemBaseGun("harvestcleric"));
			for (int i = 1; i <= 8; i ++)
			{
				items.add(new ItemBaseGun("harvestcleric" + i));
			}
			items.add(new ItemBaseGun("macabredancer"));
			for (int i = 1; i <= 4; i ++)
			{
				items.add(new ItemBaseGun("macabredancer" + i));
			}
			items.add(new ItemBaseGun("shadowwarlock"));
			for (int i = 1; i <= 13; i ++)
			{
				items.add(new ItemBaseGun("shadowwarlock" + i));
			}
			items.add(new ItemBaseGun("wavemaster"));
			for (int i = 1; i <= 43; i ++)
			{
				items.add(new ItemBaseGun("wavemaster" + i));
			}
			itemList = items.toArray(new Item[items.size()]);
		}
	}
}