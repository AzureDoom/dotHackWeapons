package mod.azure.rcraft.proxy;

import java.util.ArrayList;
import java.util.List;

import electroblob.wizardry.constants.Element;
import electroblob.wizardry.constants.Tier;

import mod.azure.rcraft.RcraftMod;
import mod.azure.rcraft.items.ItemBaseSword;
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
            items.add(new ItemBaseSword("bladebrandier", 19));
            items.add(new ItemBaseGun("dualgunner", 1));
            items.add(new ItemBaseGun("dualgunner1", 1));
            items.add(new ItemBaseGun("dualgunner2", 1));
            items.add(new ItemBaseSword("dualswords", 24));
            items.add(new ItemBaseSword("dualswords3", 1));
            items.add(new ItemBaseSword("edgepunisher", 19));
            items.add(new ItemBaseSword("edgepunisher2", 1));
            items.add(new ItemBaseSword("flickreaper", 9));
            items.add(new ItemBaseSword("lordpartizan", 9));    
            items.add(new ItemBaseGun("steamgunner", 1));      
            for (int i = 1; i <= 17; i ++)
            {
                items.add(new ItemBaseGun("steamgunner" + i, 1));
            }       
            items.add(new ItemBaseSword("tribalgrappler", 8));
            for (int i = 2; i <= 4; i ++)
            {
                items.add(new ItemBaseSword("tribalgrappler" + i, 1));
            } 
            items.add(new ItemBaseSword("blademaster", 41));
            items.add(new ItemBaseSword("heavyaxeman", 45));
            items.add(new ItemBaseSword("heavyblade", 38));
            items.add(new ItemBaseSword("longarm", 42));
            items.add(new ItemBaseSword("twinblade", 38));
            items.add(new ItemBaseSword("twinblade61", 10));
            items.add(new ItemBaseSword("twinblade71", 1));
            items.add(new ItemBaseSword("twinblade81", 30));
    		items.add(new ItemBaseMagic("harvestcleric", 1, Tier.BASIC, Element.EARTH));
    	    items.add(new ItemBaseMagic("harvestcleric1", 1, Tier.BASIC, Element.LIGHTNING));
    	    items.add(new ItemBaseMagic("harvestcleric2", 1, Tier.BASIC, Element.HEALING));
    	    items.add(new ItemBaseMagic("harvestcleric3", 1, Tier.BASIC, Element.SORCERY));
    	    items.add(new ItemBaseMagic("harvestcleric4", 1, Tier.APPRENTICE, Element.SORCERY));
    	    items.add(new ItemBaseMagic("harvestcleric5", 1, Tier.APPRENTICE, Element.ICE));
    	    items.add(new ItemBaseMagic("harvestcleric6", 1, Tier.APPRENTICE, Element.SORCERY));
    	    items.add(new ItemBaseMagic("harvestcleric7", 1, Tier.ADVANCED, Element.FIRE));
    	    items.add(new ItemBaseMagic("harvestcleric8", 1, Tier.MASTER, Element.FIRE));
    	    items.add(new ItemBaseMagic("macabredancer", 1, Tier.BASIC, Element.SORCERY));
    	    items.add(new ItemBaseMagic("macabredancer1", 1, Tier.APPRENTICE, Element.EARTH));
    	    items.add(new ItemBaseMagic("macabredancer2", 1, Tier.APPRENTICE, Element.NECROMANCY));
    	    items.add(new ItemBaseMagic("macabredancer3", 1, Tier.ADVANCED, Element.FIRE));
    	    items.add(new ItemBaseMagic("macabredancer4", 1, Tier.MASTER, Element.FIRE));
    	    items.add(new ItemBaseMagic("shadowwarlock", 1, Tier.BASIC, Element.MAGIC));
    	    items.add(new ItemBaseMagic("shadowwarlock1", 1, Tier.BASIC, Element.SORCERY));
    	    items.add(new ItemBaseMagic("shadowwarlock2", 1, Tier.BASIC, Element.EARTH));
    	    items.add(new ItemBaseMagic("shadowwarlock3", 1, Tier.BASIC, Element.HEALING));
    	    items.add(new ItemBaseMagic("shadowwarlock4", 1, Tier.APPRENTICE, Element.SORCERY));
    	    items.add(new ItemBaseMagic("shadowwarlock5", 1, Tier.APPRENTICE, Element.NECROMANCY));
    	    items.add(new ItemBaseMagic("shadowwarlock6", 1, Tier.APPRENTICE, Element.EARTH));
    	    items.add(new ItemBaseMagic("shadowwarlock7", 1, Tier.APPRENTICE, Element.ICE));
    	    items.add(new ItemBaseMagic("shadowwarlock8", 1, Tier.APPRENTICE, Element.SORCERY));
    	    items.add(new ItemBaseMagic("shadowwarlock9", 1, Tier.APPRENTICE, Element.LIGHTNING));
    	    items.add(new ItemBaseMagic("shadowwarlock10", 1, Tier.ADVANCED, Element.HEALING));
    	    items.add(new ItemBaseMagic("shadowwarlock11", 1, Tier.MASTER, Element.EARTH));
    	    items.add(new ItemBaseMagic("shadowwarlock12", 1, Tier.ADVANCED, Element.HEALING));
    	    items.add(new ItemBaseMagic("shadowwarlock13", 1, Tier.MASTER, Element.EARTH));
    	    items.add(new ItemBaseMagic("wavemaster", 1, Tier.BASIC, Element.MAGIC));
    	    items.add(new ItemBaseMagic("wavemaster1", 1, Tier.BASIC, Element.EARTH));
    	    items.add(new ItemBaseMagic("wavemaster2", 1, Tier.BASIC, Element.ICE));
    	    items.add(new ItemBaseMagic("wavemaster3", 1, Tier.BASIC, Element.FIRE));
    	    items.add(new ItemBaseMagic("wavemaster4", 1, Tier.BASIC, Element.EARTH));
    	    items.add(new ItemBaseMagic("wavemaster5", 1, Tier.BASIC, Element.LIGHTNING));
    	    items.add(new ItemBaseMagic("wavemaster6", 1, Tier.BASIC, Element.NECROMANCY));
    	    items.add(new ItemBaseMagic("wavemaster7", 1, Tier.BASIC, Element.HEALING));
    	    items.add(new ItemBaseMagic("wavemaster8", 1, Tier.BASIC, Element.SORCERY));
    	    items.add(new ItemBaseMagic("wavemaster9", 1, Tier.APPRENTICE, Element.ICE));
    	    items.add(new ItemBaseMagic("wavemaster10", 1, Tier.APPRENTICE, Element.FIRE));
    	    items.add(new ItemBaseMagic("wavemaster11", 1, Tier.APPRENTICE, Element.LIGHTNING));
    	    items.add(new ItemBaseMagic("wavemaster12", 1, Tier.APPRENTICE, Element.MAGIC));
    	    items.add(new ItemBaseMagic("wavemaster13", 1, Tier.APPRENTICE, Element.SORCERY));
    	    items.add(new ItemBaseMagic("wavemaster14", 1, Tier.APPRENTICE, Element.MAGIC));
    	    items.add(new ItemBaseMagic("wavemaster15", 1, Tier.APPRENTICE, Element.MAGIC));
    	    items.add(new ItemBaseMagic("wavemaster16", 1, Tier.APPRENTICE, Element.ICE));
    	    items.add(new ItemBaseMagic("wavemaster17", 1, Tier.APPRENTICE, Element.FIRE));
    	    items.add(new ItemBaseMagic("wavemaster18", 1, Tier.APPRENTICE, Element.SORCERY));
    	    items.add(new ItemBaseMagic("wavemaster19", 1, Tier.APPRENTICE, Element.LIGHTNING));
    	    items.add(new ItemBaseMagic("wavemaster20", 1, Tier.ADVANCED, Element.NECROMANCY));
    	    items.add(new ItemBaseMagic("wavemaster21", 1, Tier.ADVANCED, Element.SORCERY));
    	    items.add(new ItemBaseMagic("wavemaster22", 1, Tier.ADVANCED, Element.SORCERY));
    	    items.add(new ItemBaseMagic("wavemaster23", 1, Tier.ADVANCED, Element.LIGHTNING));
    	    items.add(new ItemBaseMagic("wavemaster24", 1, Tier.ADVANCED, Element.FIRE));
    	    items.add(new ItemBaseMagic("wavemaster25", 1, Tier.ADVANCED, Element.EARTH));
    	    items.add(new ItemBaseMagic("wavemaster26", 1, Tier.ADVANCED, Element.LIGHTNING));
    	    items.add(new ItemBaseMagic("wavemaster27", 1, Tier.ADVANCED, Element.NECROMANCY));
    	    items.add(new ItemBaseMagic("wavemaster28", 1, Tier.ADVANCED, Element.HEALING));
    	    items.add(new ItemBaseMagic("wavemaster29", 1, Tier.ADVANCED, Element.EARTH));
    	    items.add(new ItemBaseMagic("wavemaster30", 1, Tier.ADVANCED, Element.ICE));
    	    items.add(new ItemBaseMagic("wavemaster31", 1, Tier.ADVANCED, Element.FIRE));
    	    items.add(new ItemBaseMagic("wavemaster32", 1, Tier.ADVANCED, Element.HEALING));
    	    items.add(new ItemBaseMagic("wavemaster33", 1, Tier.ADVANCED, Element.LIGHTNING));
    	    items.add(new ItemBaseMagic("wavemaster34", 1, Tier.ADVANCED, Element.SORCERY));
    	    items.add(new ItemBaseMagic("wavemaster35", 1, Tier.MASTER, Element.NECROMANCY));
    	    items.add(new ItemBaseMagic("wavemaster36", 1, Tier.MASTER, Element.EARTH));
    	    items.add(new ItemBaseMagic("wavemaster37", 1, Tier.MASTER, Element.LIGHTNING));
    	    items.add(new ItemBaseMagic("wavemaster38", 1, Tier.MASTER, Element.FIRE));
    	    items.add(new ItemBaseMagic("wavemaster39", 1, Tier.MASTER, Element.NECROMANCY));
    	    items.add(new ItemBaseMagic("wavemaster40", 1, Tier.MASTER, Element.HEALING));
    	    items.add(new ItemBaseMagic("wavemaster41", 1, Tier.MASTER, Element.LIGHTNING));
    	    items.add(new ItemBaseMagic("wavemaster42", 1, Tier.MASTER, Element.SORCERY));
    	    items.add(new ItemBaseMagic("wavemaster43", 1, Tier.MASTER, Element.SORCERY)); 
            itemList = items.toArray(new Item[items.size()]);
    	} else {
    		List<Item> items = new ArrayList<Item>();
	        items.add(new ItemBaseSword("bladebrandier", 19));
	        items.add(new ItemBaseGun("dualgunner", 1));
	        items.add(new ItemBaseGun("dualgunner1", 1));
	        items.add(new ItemBaseGun("dualgunner2", 1));
	        items.add(new ItemBaseSword("dualswords", 24));
	        items.add(new ItemBaseSword("dualswords3", 1));
	        items.add(new ItemBaseSword("edgepunisher", 19));
	        items.add(new ItemBaseSword("edgepunisher2", 1));
	        items.add(new ItemBaseSword("flickreaper", 9));
	        items.add(new ItemBaseSword("lordpartizan", 9));    
	        items.add(new ItemBaseGun("steamgunner", 1));      
            for (int i = 1; i <= 17; i ++)
            {
                items.add(new ItemBaseGun("steamgunner" + i, 1));
            }       
            items.add(new ItemBaseSword("tribalgrappler", 8));
            for (int i = 2; i <= 4; i ++)
            {
                items.add(new ItemBaseSword("tribalgrappler" + i, 1));
            }
	        items.add(new ItemBaseSword("blademaster", 41));
	        items.add(new ItemBaseSword("heavyaxeman", 45));
	        items.add(new ItemBaseSword("heavyblade", 38));
	        items.add(new ItemBaseSword("longarm", 42));
	        items.add(new ItemBaseSword("twinblade", 38));
	        items.add(new ItemBaseSword("twinblade61", 10));
	        items.add(new ItemBaseSword("twinblade71", 1));
	        items.add(new ItemBaseSword("twinblade81", 30));
			items.add(new ItemBaseGun("harvestcleric", 1));
			for (int i = 1; i <= 8; i ++)
            {
                items.add(new ItemBaseSword("harvestcleric" + i, 1));
            }
		    items.add(new ItemBaseGun("macabredancer", 1));
		    for (int i = 1; i <= 4; i ++)
            {
                items.add(new ItemBaseSword("macabredancer" + i, 1));
            }
		    items.add(new ItemBaseGun("shadowwarlock", 1));
		    for (int i = 1; i <= 13; i ++)
            {
                items.add(new ItemBaseSword("shadowwarlock" + i, 1));
            }
		    items.add(new ItemBaseGun("wavemaster", 1));
		    for (int i = 1; i <= 43; i ++)
            {
                items.add(new ItemBaseSword("wavemaster" + i, 1));
            }
	        itemList = items.toArray(new Item[items.size()]);
    	}
	}
	
}