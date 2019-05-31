package mod.azure.rcraft.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.azure.rcraft.RcraftMod;
import mod.azure.rcraft.util.Register;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import static net.minecraftforge.fml.relauncher.Side.CLIENT;

@Mod.EventBusSubscriber(modid = RcraftMod.modid, value = CLIENT)
public class ClientProxy extends CommonProxy {
	
	private static final Logger LOGGER = LogManager.getLogger();
	
	@EventHandler
	public void preInit() {
		OBJLoader.INSTANCE.addDomain(RcraftMod.modid);
    }
	
	@EventHandler
	public void init() {
		
	}
	
	@EventHandler
	public void postInit() {
		
	}
	
	@SubscribeEvent
	public static void onRegisterModelsEvent(ModelRegistryEvent e) {
		ForgeRegistries.ITEMS.getValuesCollection().stream()
		.filter(item -> item.getRegistryName().getNamespace().equals(RcraftMod.modid))
		.forEach(item -> {
				ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		});
		LOGGER.debug("Registered models");
	}
}