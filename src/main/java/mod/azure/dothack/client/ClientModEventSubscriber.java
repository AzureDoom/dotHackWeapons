package mod.azure.dothack.client;

import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.client.render.BulletsRender;
import mod.azure.dothack.client.render.ManaRender;
import mod.azure.dothack.util.registry.ModEntityTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@EventBusSubscriber(modid = DotHackMod.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber {

	@SubscribeEvent
	public static void onClientSetup(final FMLClientSetupEvent event) {
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BULLETS.get(), BulletsRender::new);
		RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MANA.get(), ManaRender::new);
	}
}