package mod.azure.dothack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.azure.dothack.util.LootHandler;
import mod.azure.dothack.util.registry.DotHackItems;
import mod.azure.dothack.util.registry.ModEntityTypes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import top.theillusivec4.curios.api.CuriosAPI;
import top.theillusivec4.curios.api.imc.CurioIMCMessage;

@Mod("dothack")
public class DotHackMod {

	public static DotHackMod instance;
	public static final String MODID = "dothack";
	public static final Logger LOGGER = LogManager.getLogger(MODID);

	public DotHackMod() {
		instance = this;
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		modEventBus.addListener(this::setup);
		modEventBus.addListener(this::enqueueIMC);
		MinecraftForge.EVENT_BUS.register(this);
		DotHackItems.ITEMS.register(modEventBus);
		ModEntityTypes.ENTITY_TYPES.register(modEventBus);
	}

	private void setup(final FMLCommonSetupEvent event) {
		MinecraftForge.EVENT_BUS.register(new LootHandler());
	}

	private void enqueueIMC(final InterModProcessEvent event) {
		if (ModList.get().isLoaded("curios")) {
			InterModComms.sendTo("curios", CuriosAPI.IMC.REGISTER_TYPE, () -> new CurioIMCMessage("bracelet"));
		}
	}
}