package mod.azure.dothack;

import mod.azure.dothack.config.Config;
import mod.azure.dothack.util.MMORPGHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod("dothack")
public class DotHackMod {

	public static DotHackMod instance;
	public static final String MODID = "dothack";

	public DotHackMod() {
		{
			instance = this;
			ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.spec, "dothack-config.toml");
			Config.loadConfig(Config.spec, FMLPaths.CONFIGDIR.get().resolve("dothack-config.toml").toString());
			MinecraftForge.EVENT_BUS.register(this);
		}
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doCompatStuff);
	}

	private void doCompatStuff(final InterModProcessEvent event) {
		if (ModList.get().isLoaded("mmorpg") && Config.INSTANCE.USE_COMPATIBILITY_ON_ITEMS.get()) {
			MinecraftForge.EVENT_BUS.register(new MMORPGHandler());
		}
	}
}