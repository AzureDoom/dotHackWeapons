package mod.azure.dothack.config;

import java.io.File;

import org.apache.commons.lang3.tuple.Pair;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;

import mod.azure.dothack.DotHackMod;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.BooleanValue;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class Config {

	public static final ServerConfig SERVER;
	public static final ForgeConfigSpec SERVER_SPEC;

	static {
		final Pair<ServerConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(ServerConfig::new);
		SERVER_SPEC = specPair.getRight();
		SERVER = specPair.getLeft();
	}

	public static class ServerConfig {
		public BooleanValue USE_COMPATIBILITY_ON_ITEMS;
		public BooleanValue USE_CHESTLOOTSYSTEM;
		public BooleanValue USE_MINESLASHLOOTSYSTEM;
		public ConfigValue<Integer> ACCESSORY_MAXDAMAGE;
		public ConfigValue<Integer> AXE_MAXDAMAGE;
		public ConfigValue<Integer> STAFF_MAXDAMAGE;
		public ConfigValue<Integer> SWORD_MAXDAMAGE;
		public ConfigValue<Integer> BOW_MAXDAMAGE;
		public ConfigValue<Integer> LANCE_MAXDAMAGE;
		public ConfigValue<Integer> BROAD_MAXDAMAGE;
		public ConfigValue<Integer> HANDWEAPON_MAXDAMAGE;
		public ConfigValue<Integer> SCYTHE_MAXDAMAGE;

		ServerConfig(ForgeConfigSpec.Builder builder) {
			builder.push("general");
			USE_COMPATIBILITY_ON_ITEMS = builder.comment("Mine and Slash Compatibility")
					.translation(DotHackMod.MODID + ".config.use_compatibility_on_items")
					.define("USE_COMPATIBILITY_ON_ITEMS", true);
			USE_CHESTLOOTSYSTEM = builder.comment("Add loot to Chest loot system")
					.translation(DotHackMod.MODID + ".config.use_chestlootsystem").define("USE_CHESTLOOTSYSTEM", true);
			USE_MINESLASHLOOTSYSTEM = builder.comment("Add loot to Mine and Slash Loot System")
					.translation(DotHackMod.MODID + ".config.use_mineslashlootsystem")
					.define("USE_MINESLASHLOOTSYSTEM", true);
			builder.pop();
			builder.push("gear");
			ACCESSORY_MAXDAMAGE = builder.comment("Accessory Max Damage")
					.translation(DotHackMod.MODID + ".config.accessory_maxdamage").define("ACCESSORY_MAXDAMAGE", 1000);
			AXE_MAXDAMAGE = builder.comment("Axe Max Damage").translation(DotHackMod.MODID + ".config.axe_maxdamage")
					.define("AXE_MAXDAMAGE", 1000);
			STAFF_MAXDAMAGE = builder.comment("Staff Max Damage")
					.translation(DotHackMod.MODID + ".config.staff_maxdamage").define("STAFF_MAXDAMAGE", 1000);
			SWORD_MAXDAMAGE = builder.comment("Sword Max Damage")
					.translation(DotHackMod.MODID + ".config.sword_maxdamage").define("SWORD_MAXDAMAGE", 1000);
			BOW_MAXDAMAGE = builder.comment("Bow Max Damage").translation(DotHackMod.MODID + ".config.bow_maxdamage")
					.define("BOW_MAXDAMAGE", 1000);
			LANCE_MAXDAMAGE = builder.comment("Lance Max Damage")
					.translation(DotHackMod.MODID + ".config.lance_maxdamage").define("LANCE_MAXDAMAGE", 1000);
			BROAD_MAXDAMAGE = builder.comment("Broad Max Damage")
					.translation(DotHackMod.MODID + ".config.broad_maxdamage").define("BROAD_MAXDAMAGE", 1000);
			HANDWEAPON_MAXDAMAGE = builder.comment("Hand Weapons Max Damage")
					.translation(DotHackMod.MODID + ".config.handweapon_maxdamage")
					.define("HANDWEAPON_MAXDAMAGE", 1000);
			SCYTHE_MAXDAMAGE = builder.comment("Scythe Max Damage")
					.translation(DotHackMod.MODID + ".config.scythe_maxdamage").define("SCYTHE_MAXDAMAGE", 1000);
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