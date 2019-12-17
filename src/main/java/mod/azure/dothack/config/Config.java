package mod.azure.dothack.config;

import java.io.File;

import org.apache.commons.lang3.tuple.Pair;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;

public class Config {

	public static final String NAME = "COMPATIBILITY";
	public static final ForgeConfigSpec spec;
	public static final Config INSTANCE;

	static {
		final Pair<Config, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(Config::new);
		spec = specPair.getRight();
		INSTANCE = specPair.getLeft();
	}

	public BooleanValue USE_COMPATIBILITY_ON_ITEMS;

	Config(ForgeConfigSpec.Builder builder) {
		builder.comment("Compatibility Settings").push(NAME);

		USE_COMPATIBILITY_ON_ITEMS = builder
				.comment("Turns on Auto Compatibility for Mine and Slash stats. Turn off to configure yourself")
				.translation("dothack.compatibility.use_compatibility_on_items")
				.define("USE_COMPATIBILITY_ON_ITEMS", true);

		builder.pop();
	}

	public static void loadConfig(ForgeConfigSpec config, String path) {
		final CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave()
				.writingMode(WritingMode.REPLACE).build();
		file.load();
		config.setConfig(file);
	}
}