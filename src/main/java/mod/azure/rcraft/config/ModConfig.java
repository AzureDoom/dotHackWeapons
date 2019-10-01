package mod.azure.rcraft.config;

import mod.azure.rcraft.RcraftMod;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = RcraftMod.modid)
@Config.LangKey("rcraft.config.title")
public class ModConfig {

	@Config.Name("Default Mine and Slash Stats")
	@Config.Comment("Auto Compat with Mine and Slash")
	public static boolean USE_COMPATIBILITY_ITEMS = true;
	
	@Mod.EventBusSubscriber(modid = RcraftMod.modid)
	private static class EventHandler {

		@SubscribeEvent
		public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(RcraftMod.modid)) {
				ConfigManager.sync(RcraftMod.modid, Config.Type.INSTANCE);
			}
		}
	}
}
