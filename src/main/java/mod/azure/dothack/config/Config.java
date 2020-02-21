package mod.azure.dothack.config;

import java.io.File;

import org.apache.commons.lang3.tuple.Pair;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import mod.azure.dothack.DotHackMod;
import net.minecraftforge.common.ForgeConfigSpec;

public class Config {

	public static final ServerConfig SERVER;
	public static final ForgeConfigSpec SERVER_SPEC;

	static {
		final Pair<ServerConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(ServerConfig::new);
		SERVER_SPEC = specPair.getRight();
		SERVER = specPair.getLeft();
	}

	public static class ServerConfig {
		public final ForgeConfigSpec.BooleanValue USE_COMPATIBILITY_ON_ITEMS;

		ServerConfig(ForgeConfigSpec.Builder builder) {
			builder.comment("Compatibility Settings").push("Mine and Slash Compatibility");
			USE_COMPATIBILITY_ON_ITEMS = builder.define("Enable", true);
			builder.pop();
		}
	}

	public static void loadConfig(ForgeConfigSpec config, String path) {
		DotHackMod.LOGGER.info("Loading config: " + path);
		final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave()
				.writingMode(WritingMode.REPLACE).build();
		DotHackMod.LOGGER.info("Built config: " + path);
		file.load();
		DotHackMod.LOGGER.info("Loaded config: " + path);
		config.setConfig(file);
	}
}