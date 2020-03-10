package mod.azure.dothack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.azure.dothack.config.Config;
import mod.azure.dothack.util.LootHandler;
import mod.azure.dothack.util.MMORPGHandler;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import top.theillusivec4.curios.api.CuriosAPI;
import top.theillusivec4.curios.api.imc.CurioIMCMessage;

@Mod("dothack")
public class DotHackMod {

	public static DotHackMod instance;
	public static final String MODID = "dothack";
	public static final Logger LOGGER = LogManager.getLogger(MODID);

	public DotHackMod() {
		instance = this;
		ModLoadingContext modLoadingContext = ModLoadingContext.get();
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::enqueueIMC);
		modLoadingContext.registerConfig(ModConfig.Type.SERVER, Config.SERVER_SPEC, "dothackweapons-config.toml");
		Config.loadConfig(Config.SERVER_SPEC,
				FMLPaths.CONFIGDIR.get().resolve("dothackweapons-config.toml").toString());
	}

	private void setup(final FMLCommonSetupEvent event) {
		if (Config.SERVER.USE_CHESTLOOTSYSTEM.get()) {
			MinecraftForge.EVENT_BUS.register(new LootHandler());
		}
	}

	private void enqueueIMC(final InterModProcessEvent event) {
		if (ModList.get().isLoaded("curios")) {
			InterModComms.sendTo("curios", CuriosAPI.IMC.REGISTER_TYPE, () -> new CurioIMCMessage("bracelet"));
		}
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class GatherDataSubscriber {
		@SubscribeEvent
		public static void gatherData(GatherDataEvent event) {
			DataGenerator gen = event.getGenerator();
			if (event.includeServer()) {
				gen.addProvider(new MMORPGHandler().getDataPackCreator(gen));
			}
		}
	}
}