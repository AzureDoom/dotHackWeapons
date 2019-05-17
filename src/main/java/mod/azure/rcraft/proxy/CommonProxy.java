package mod.azure.rcraft.proxy;

import mod.azure.rcraft.RcraftMod;
import mod.azure.rcraft.config.StaffConfigItem;
import mod.azure.rcraft.config.MineandSlashItem;
import mod.azure.rcraft.items.ItemBase;
import mod.azure.rcraft.items.ItemBaseSword;
import mod.azure.rcraft.items.ItemBaseGun;
import mod.azure.rcraft.items.ItemMagic;
import mod.azure.rcraft.items.ItemBaseSword;
import mod.azure.rcraft.items.ItemBaseSword;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
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
		MinecraftForge.EVENT_BUS.register(new MineandSlashItem());
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

	
	public static Item[] itemList = new Item[] {
		    //new ItemBase("r2gate", 1),
			//new ItemBaseSword("bladebrandier", 19),
			//new ItemBaseSword("dualswords", 24),
			//new ItemBaseSword("dualswords3", 1),
			//new ItemBaseSword("edgepunisher", 19),
			//new ItemBaseSword("edgepunisher2", 1),
			//new ItemBaseSword("flickreaper", 9),
			//new ItemBaseSword("tribalgrappler", 8),
			//new ItemBaseSword("tribalgrappler2", 1),
			//new ItemBaseSword("tribalgrappler3", 1),
			//new ItemBaseSword("tribalgrappler4", 1),
			//new ItemBaseSword("blademaster", 41),
			//new ItemBaseSword("heavyaxeman", 45),
			//new ItemBaseSword("heavyblade", 38),
			//new ItemBaseSword("longarm", 42),
			//new ItemBaseSword("twinblade", 38),
			//new ItemBaseSword("twinblade61", 10),
			//new ItemBaseSword("twinblade71", 1),
			//new ItemBaseSword("twinblade81", 30),
			//new ItemBaseSword("lordpartizan", 9),
			//new ItemBaseGun("steamgunner", 1),
			//new ItemBaseGun("steamgunner1", 1),
		    //new ItemBaseGun("steamgunner2", 1),
		    //new ItemBaseGun("steamgunner3", 1),
		    //new ItemBaseGun("steamgunner4", 1),
		    //new ItemBaseGun("steamgunner5", 1),
		    //new ItemBaseGun("steamgunner6", 1),
		    //new ItemBaseGun("steamgunner7", 1),
		    //new ItemBaseGun("steamgunner8", 1),
		    //new ItemBaseGun("steamgunner9", 1),
		    //new ItemBaseGun("steamgunner10", 1),
		    //new ItemBaseGun("steamgunner11", 1),
		    //new ItemBaseGun("steamgunner12", 1),
		    //new ItemBaseGun("steamgunner13", 1),
		    //new ItemBaseGun("steamgunner14", 1),
		    //new ItemBaseGun("steamgunner15", 1),
		    //new ItemBaseGun("steamgunner16", 1),
		    //new ItemBaseGun("steamgunner17", 1),
		    //new ItemBaseGun("dualgunner", 1),
		    //new ItemBaseGun("dualgunner1", 1),
		    //new ItemBaseGun("dualgunner2", 1),
		    new ItemMagic("harvestcleric", 1),
		    //new ItemMagic("harvestcleric1", 1),
		    //new ItemMagic("harvestcleric2", 1),
		    //new ItemMagic("harvestcleric3", 1),
		    //new ItemMagic("harvestcleric4", 1),
		    //new ItemMagic("harvestcleric5", 1),
		    //new ItemMagic("harvestcleric6", 1),
		    //new ItemMagic("harvestcleric7", 1),
		    //new ItemMagic("harvestcleric8", 1),
		    //new ItemMagic("macabredancer", 1),
		    //new ItemMagic("macabredancer1", 1),
		    //new ItemMagic("macabredancer2", 1),
		    //new ItemMagic("macabredancer3", 1),
		    //new ItemMagic("macabredancer4", 1),
		    //new ItemMagic("shadowwarlock", 1),
		    //new ItemMagic("shadowwarlock1", 1),
		    //new ItemMagic("shadowwarlock2", 1),
		    //new ItemMagic("shadowwarlock3", 1),
		    //new ItemMagic("shadowwarlock4", 1),
		    //new ItemMagic("shadowwarlock5", 1),
		    //new ItemMagic("shadowwarlock6", 1),
		    //new ItemMagic("shadowwarlock7", 1),
		    //new ItemMagic("shadowwarlock8", 1),
		    //new ItemMagic("shadowwarlock9", 1),
		    //new ItemMagic("shadowwarlock10", 1),
		    //new ItemMagic("shadowwarlock11", 1),
		    //new ItemMagic("shadowwarlock12", 1),
		    //new ItemMagic("shadowwarlock13", 1),
		    //new ItemMagic("wavemaster", 1),
		    //new ItemMagic("wavemaster1", 1),
		    //new ItemMagic("wavemaster2", 1),
		    //new ItemMagic("wavemaster3", 1),
		    //new ItemMagic("wavemaster4", 1),
		    //new ItemMagic("wavemaster5", 1),
		    //new ItemMagic("wavemaster6", 1),
		    //new ItemMagic("wavemaster7", 1),
		    //new ItemMagic("wavemaster8", 1),
		    //new ItemMagic("wavemaster9", 1),
		    //new ItemMagic("wavemaster10", 1),
		    //new ItemMagic("wavemaster11", 1),
		    //new ItemMagic("wavemaster12", 1),
		    //new ItemMagic("wavemaster13", 1),
		    //new ItemMagic("wavemaster14", 1),
		    //new ItemMagic("wavemaster15", 1),
		    //new ItemMagic("wavemaster16", 1),
		    //new ItemMagic("wavemaster17", 1),
		    //new ItemMagic("wavemaster18", 1),
		    //new ItemMagic("wavemaster19", 1),
		    //new ItemMagic("wavemaster20", 1),
		    //new ItemMagic("wavemaster21", 1),
		    //new ItemMagic("wavemaster22", 1),
		    //new ItemMagic("wavemaster23", 1),
		    //new ItemMagic("wavemaster24", 1),
		    //new ItemMagic("wavemaster25", 1),
		    //new ItemMagic("wavemaster26", 1),
		    //new ItemMagic("wavemaster27", 1),
		    //new ItemMagic("wavemaster28", 1),
		    //new ItemMagic("wavemaster29", 1),
		    //new ItemMagic("wavemaster30", 1),
		    //new ItemMagic("wavemaster31", 1),
		    //new ItemMagic("wavemaster32", 1),
		    //new ItemMagic("wavemaster33", 1),
		    //new ItemMagic("wavemaster34", 1),
		    //new ItemMagic("wavemaster35", 1),
		    //new ItemMagic("wavemaster36", 1),
		    //new ItemMagic("wavemaster37", 1),
		    //new ItemMagic("wavemaster38", 1),
		    //new ItemMagic("wavemaster39", 1),
		    //new ItemMagic("wavemaster40", 1),
		    //new ItemMagic("wavemaster41", 1),
		    //new ItemMagic("wavemaster42", 1),
		    //new ItemMagic("wavemaster43", 1)
		    };
		    public static NonNullList<ItemStack> variantList;
}