package mod.azure.dothack;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.azure.dothack.config.ModConfig;
import mod.azure.dothack.proxy.IProxy;
import mod.azure.dothack.registry.DotHackItems;
import mod.azure.dothack.util.LootHandler;
import mod.azure.dothack.util.MineSlashHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = DotHackMod.MODID, version = DotHackMod.VERSION, dependencies = DotHackMod.DEPENDENCIES)
public class DotHackMod {

	public static final String MODID = "rcraft";
	public static final String MODNAME = "dotHack Weapons";
	public static final String VERSION = "2.1.1";
	public static final String DEPENDENCIES = "required:forge@[14.23.5.2838,);required-after:ebwizardry@[4.2,);required-after:mmorpg;required-after:baubles";
	private static final Logger LOGGER = LogManager.getLogger();

	@SidedProxy(clientSide = "mod.azure.dothack.proxy.ClientProxy", serverSide = "mod.azure.dothack.proxy.ServerProxy")
	public static IProxy proxy;

	@Mod.Instance
	public static DotHackMod instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit();
		LOGGER.debug("Loading Data Drain...");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init();
		LOGGER.debug("Firing Data Drain...");
		if (Loader.isModLoaded("ebwizardry")) {
			DotHackItems.populateWandMap();
		}
		MinecraftForge.EVENT_BUS.register(new LootHandler());		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit();
		LOGGER.debug("No Data Bugs Found");		
		if (ModConfig.USE_COMPATIBILITY_ITEMS) {
			if (Loader.isModLoaded("mmorpg")) {
				MinecraftForge.EVENT_BUS.register(new MineSlashHandler());
			}
		}
	}
}