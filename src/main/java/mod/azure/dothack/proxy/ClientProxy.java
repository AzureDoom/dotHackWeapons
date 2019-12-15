package mod.azure.dothack.proxy;

import static net.minecraftforge.fml.relauncher.Side.CLIENT;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.azure.dothack.DotHackMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

@Mod.EventBusSubscriber(modid = DotHackMod.MODID, value = CLIENT)
public class ClientProxy extends IProxy {

	@EventHandler
	public void preInit() {
		OBJLoader.INSTANCE.addDomain(DotHackMod.MODID);
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
				.filter(item -> item.getRegistryName().getNamespace().equals(DotHackMod.MODID)).forEach(item -> {
					ModelLoader.setCustomModelResourceLocation(item, 0,
							new ModelResourceLocation(item.getRegistryName(), "inventory"));
				});
		DotHackMod.LOGGER.debug("Registered models");
	}
}