package mod.azure.dothack;

import java.util.ArrayList;
import java.util.List;

import mod.azure.dothack.config.ModConfig;
import mod.azure.dothack.proxy.CommonProxy;
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
	public static final String VERSION = "2.1.0";
	public static final String DEPENDENCIES = "required-after:ebwizardry@4.2;required-after:mmorpg;required-after:baubles";

	@SidedProxy(clientSide = "mod.azure.dothack.proxy.ClientProxy", serverSide = "mod.azure.dothack.proxy.CommonProxy")
	public static CommonProxy proxy;

	public static CreativeTabs tab = new DotHackTabs(MODID);

	@Mod.Instance
	public static DotHackMod instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init();
		MinecraftForge.EVENT_BUS.register(new LootHandler());
		
		DotHackItems.populateWandMap();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit();
		if (ModConfig.USE_COMPATIBILITY_ITEMS) {
			if (Loader.isModLoaded("mmorpg")) {
				MinecraftForge.EVENT_BUS.register(new MineSlashHandler());
			}
		}
	}
}