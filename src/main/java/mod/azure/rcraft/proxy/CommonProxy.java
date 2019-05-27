package mod.azure.rcraft.proxy;

import java.util.ArrayList;
import java.util.List;

import electroblob.wizardry.constants.Element;
import electroblob.wizardry.constants.Tier;

import mod.azure.rcraft.RcraftMod;
import mod.azure.rcraft.items.ItemBaseGun;
import mod.azure.rcraft.items.ItemBaseMagic;
import mod.azure.rcraft.items.ItemBaseSword;
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
    	public static void registerItems(RegistryEvent.Register<Item> event) {
    		IForgeRegistry<Item> registry = event.getRegistry();
    		
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
	        items.add(new ItemBaseGun("steamgunner1", 1));
	        items.add(new ItemBaseGun("steamgunner2", 1));
	        items.add(new ItemBaseGun("steamgunner3", 1));
	        items.add(new ItemBaseGun("steamgunner4", 1));
	        items.add(new ItemBaseGun("steamgunner5", 1));
	        items.add(new ItemBaseGun("steamgunner6", 1));
	        items.add(new ItemBaseGun("steamgunner7", 1));
	        items.add(new ItemBaseGun("steamgunner8", 1));
	        items.add(new ItemBaseGun("steamgunner9", 1));
	        items.add(new ItemBaseGun("steamgunner10", 1));
	        items.add(new ItemBaseGun("steamgunner11", 1));
	        items.add(new ItemBaseGun("steamgunner12", 1));
	        items.add(new ItemBaseGun("steamgunner13", 1));
	        items.add(new ItemBaseGun("steamgunner14", 1));
	        items.add(new ItemBaseGun("steamgunner15", 1));
	        items.add(new ItemBaseGun("steamgunner16", 1));
	        items.add(new ItemBaseGun("steamgunner17", 1));     
	        items.add(new ItemBaseSword("tribalgrappler", 8));
	        items.add(new ItemBaseSword("tribalgrappler2", 1));
	        items.add(new ItemBaseSword("tribalgrappler3", 1));
	        items.add(new ItemBaseSword("tribalgrappler4", 1)); 
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
	        items.add(new ItemBaseGun("steamgunner1", 1));
	        items.add(new ItemBaseGun("steamgunner2", 1));
	        items.add(new ItemBaseGun("steamgunner3", 1));
	        items.add(new ItemBaseGun("steamgunner4", 1));
	        items.add(new ItemBaseGun("steamgunner5", 1));
	        items.add(new ItemBaseGun("steamgunner6", 1));
	        items.add(new ItemBaseGun("steamgunner7", 1));
	        items.add(new ItemBaseGun("steamgunner8", 1));
	        items.add(new ItemBaseGun("steamgunner9", 1));
	        items.add(new ItemBaseGun("steamgunner10", 1));
	        items.add(new ItemBaseGun("steamgunner11", 1));
	        items.add(new ItemBaseGun("steamgunner12", 1));
	        items.add(new ItemBaseGun("steamgunner13", 1));
	        items.add(new ItemBaseGun("steamgunner14", 1));
	        items.add(new ItemBaseGun("steamgunner15", 1));
	        items.add(new ItemBaseGun("steamgunner16", 1));
	        items.add(new ItemBaseGun("steamgunner17", 1));     
	        items.add(new ItemBaseSword("tribalgrappler", 8));
	        items.add(new ItemBaseSword("tribalgrappler2", 1));
	        items.add(new ItemBaseSword("tribalgrappler3", 1));
	        items.add(new ItemBaseSword("tribalgrappler4", 1)); 
	        items.add(new ItemBaseSword("blademaster", 41));
	        items.add(new ItemBaseSword("heavyaxeman", 45));
	        items.add(new ItemBaseSword("heavyblade", 38));
	        items.add(new ItemBaseSword("longarm", 42));
	        items.add(new ItemBaseSword("twinblade", 38));
	        items.add(new ItemBaseSword("twinblade61", 10));
	        items.add(new ItemBaseSword("twinblade71", 1));
	        items.add(new ItemBaseSword("twinblade81", 30));
			items.add(new ItemBaseGun("harvestcleric", 1));
		    items.add(new ItemBaseGun("harvestcleric1", 1));
		    items.add(new ItemBaseGun("harvestcleric2", 1));
		    items.add(new ItemBaseGun("harvestcleric3", 1));
		    items.add(new ItemBaseGun("harvestcleric4", 1));
		    items.add(new ItemBaseGun("harvestcleric5", 1));
		    items.add(new ItemBaseGun("harvestcleric6", 1));
		    items.add(new ItemBaseGun("harvestcleric7", 1));
		    items.add(new ItemBaseGun("harvestcleric8", 1));
		    items.add(new ItemBaseGun("macabredancer", 1));
		    items.add(new ItemBaseGun("macabredancer1", 1));
		    items.add(new ItemBaseGun("macabredancer2", 1));
		    items.add(new ItemBaseGun("macabredancer3", 1));
		    items.add(new ItemBaseGun("macabredancer4", 1));
		    items.add(new ItemBaseGun("shadowwarlock", 1));
		    items.add(new ItemBaseGun("shadowwarlock1", 1));
		    items.add(new ItemBaseGun("shadowwarlock2", 1));
		    items.add(new ItemBaseGun("shadowwarlock3", 1));
		    items.add(new ItemBaseGun("shadowwarlock4", 1));
		    items.add(new ItemBaseGun("shadowwarlock5", 1));
		    items.add(new ItemBaseGun("shadowwarlock6", 1));
		    items.add(new ItemBaseGun("shadowwarlock7", 1));
		    items.add(new ItemBaseGun("shadowwarlock8", 1));
		    items.add(new ItemBaseGun("shadowwarlock9", 1));
		    items.add(new ItemBaseGun("shadowwarlock10", 1));
		    items.add(new ItemBaseGun("shadowwarlock11", 1));
		    items.add(new ItemBaseGun("shadowwarlock12", 1));
		    items.add(new ItemBaseGun("shadowwarlock13", 1));
		    items.add(new ItemBaseGun("wavemaster", 1));
		    items.add(new ItemBaseGun("wavemaster1", 1));
		    items.add(new ItemBaseGun("wavemaster2", 1));
		    items.add(new ItemBaseGun("wavemaster3", 1));
		    items.add(new ItemBaseGun("wavemaster4", 1));
		    items.add(new ItemBaseGun("wavemaster5", 1));
		    items.add(new ItemBaseGun("wavemaster6", 1));
		    items.add(new ItemBaseGun("wavemaster7", 1));
		    items.add(new ItemBaseGun("wavemaster8", 1));
		    items.add(new ItemBaseGun("wavemaster9", 1));
		    items.add(new ItemBaseGun("wavemaster10", 1));
		    items.add(new ItemBaseGun("wavemaster11", 1));
		    items.add(new ItemBaseGun("wavemaster12", 1));
		    items.add(new ItemBaseGun("wavemaster13", 1));
		    items.add(new ItemBaseGun("wavemaster14", 1));
		    items.add(new ItemBaseGun("wavemaster15", 1));
		    items.add(new ItemBaseGun("wavemaster16", 1));
		    items.add(new ItemBaseGun("wavemaster17", 1));
		    items.add(new ItemBaseGun("wavemaster18", 1));
		    items.add(new ItemBaseGun("wavemaster19", 1));
		    items.add(new ItemBaseGun("wavemaster20", 1));
		    items.add(new ItemBaseGun("wavemaster21", 1));
		    items.add(new ItemBaseGun("wavemaster22", 1));
		    items.add(new ItemBaseGun("wavemaster23", 1));
		    items.add(new ItemBaseGun("wavemaster24", 1));
		    items.add(new ItemBaseGun("wavemaster25", 1));
		    items.add(new ItemBaseGun("wavemaster26", 1));
		    items.add(new ItemBaseGun("wavemaster27", 1));
		    items.add(new ItemBaseGun("wavemaster28", 1));
		    items.add(new ItemBaseGun("wavemaster29", 1));
		    items.add(new ItemBaseGun("wavemaster30", 1));
		    items.add(new ItemBaseGun("wavemaster31", 1));
		    items.add(new ItemBaseGun("wavemaster32", 1));
		    items.add(new ItemBaseGun("wavemaster33", 1));
		    items.add(new ItemBaseGun("wavemaster34", 1));
		    items.add(new ItemBaseGun("wavemaster35", 1));
		    items.add(new ItemBaseGun("wavemaster36", 1));
		    items.add(new ItemBaseGun("wavemaster37", 1));
		    items.add(new ItemBaseGun("wavemaster38", 1));
		    items.add(new ItemBaseGun("wavemaster39", 1));
		    items.add(new ItemBaseGun("wavemaster40", 1));
		    items.add(new ItemBaseGun("wavemaster41", 1));
		    items.add(new ItemBaseGun("wavemaster42", 1));
		    items.add(new ItemBaseGun("wavemaster43", 1)); 
	        itemList = items.toArray(new Item[items.size()]);
    	}
	}
	
}