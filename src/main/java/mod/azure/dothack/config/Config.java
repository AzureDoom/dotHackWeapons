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
		public final BooleanValue USE_COMPATIBILITY_ON_ITEMS;
		public final BooleanValue USE_CHESTLOOTSYSTEM;
		public final BooleanValue USE_MINESLASHLOOTSYSTEM;
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
			builder.comment("Mine and Slash Compatibility").push("Mine and Slash Compatibility")
					.translation("dothack.config.use_compatibility_on_items");
			USE_COMPATIBILITY_ON_ITEMS = builder.define("Enable", true);
			builder.comment("Chest Loot Setting").push("Chest Loot Setting")
					.translation("dothack.config.use_chestlootsystem");
			USE_CHESTLOOTSYSTEM = builder.define("Enable", true);
			builder.comment("Mine and Slash Loot Setting").push("Mine and Slash Loot Setting")
					.translation("dothack.config.use_mineslashlootsystem");
			USE_MINESLASHLOOTSYSTEM = builder.define("Enable", true);
			builder.comment("Sets the max duriabily of Accessories").push("Sets the max duriabily of Accessories.")
					.translation("dothack.config.accessory_maxdamage");
			ACCESSORY_MAXDAMAGE = builder.define("ACCESSORY_MAXDAMAGE", 1000);
			builder.comment("Sets the max duriabily of Axes.").push("Sets the max duriabily of Axes.")
					.translation("dothack.config.axe_maxdamage");
			AXE_MAXDAMAGE = builder.define("AXE_MAXDAMAGE", 1000);
			builder.comment("Sets the max duriabily of Staffs.").push("Sets the max duriabily of Staffs.")
					.translation("dothack.config.staff_maxdamage");
			STAFF_MAXDAMAGE = builder.define("STAFF_MAXDAMAGE", 1000);
			builder.comment("Sets the max duriabily of Swords.").push("Sets the max duriabily of Swords.")
					.translation("dothack.config.sword_maxdamage");
			SWORD_MAXDAMAGE = builder.define("SWORD_MAXDAMAGE", 1000);
			builder.comment("Sets the max duriabily of Bows.").push("Sets the max duriabily of Bows.")
					.translation("dothack.config.bow_maxdamage");
			BOW_MAXDAMAGE = builder.define("BOW_MAXDAMAGE", 1000);
			builder.comment("Sets the max duriabily of Lances.").push("Sets the max duriabily of Lances.")
					.translation("dothack.config.lance_maxdamage");
			LANCE_MAXDAMAGE = builder.define("LANCE_MAXDAMAGE", 1000);
			builder.comment("Sets the max duriabily of Staffs.").push("Sets the max duriabily of Broad Swords.")
					.translation("dothack.config.broad_maxdamage");
			BROAD_MAXDAMAGE = builder.define("BROAD_MAXDAMAGE", 1000);
			builder.comment("Sets the max duriabily of Hand Weapons.").push("Sets the max duriabily of Hand Weapons.")
					.translation("dothack.config.handweapon_maxdamage");
			HANDWEAPON_MAXDAMAGE = builder.define("HANDWEAPON_MAXDAMAGE", 1000);
			builder.comment("Sets the max duriabily of Scythe Weapons.")
					.push("Sets the max duriabily of Scythe Weapons.").translation("dothack.config.scythe_maxdamage");
			SCYTHE_MAXDAMAGE = builder.define("SCYTHE_MAXDAMAGE", 1000);
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