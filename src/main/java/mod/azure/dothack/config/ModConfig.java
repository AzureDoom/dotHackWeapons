package mod.azure.dothack.config;

import mod.azure.dothack.DotHackMod;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = DotHackMod.MODID)
@Config.LangKey("rcraft.config.title")
public class ModConfig {

	@Config.Name("Default Mine and Slash Stats")
	@Config.Comment("Auto Compat with Mine and Slash")
	public static boolean USE_COMPATIBILITY_ITEMS = true;

	@Mod.EventBusSubscriber(modid = DotHackMod.MODID)
	private static class EventHandler {

		@SubscribeEvent
		public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(DotHackMod.MODID)) {
				ConfigManager.sync(DotHackMod.MODID, Config.Type.INSTANCE);
			}
		}
	}
}
