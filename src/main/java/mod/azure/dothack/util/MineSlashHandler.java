package mod.azure.dothack.util;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.collect.ImmutableList;
import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Axe;
import com.robertx22.database.gearitemslots.Bow;
import com.robertx22.database.gearitemslots.Hammer;
import com.robertx22.database.gearitemslots.Necklace;
import com.robertx22.database.gearitemslots.Staff;
import com.robertx22.database.gearitemslots.Sword;

import mod.azure.dothack.DotHackMod;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

public class MineSlashHandler {

	private static final Logger LOGGER = LogManager.getLogger();

	private static String MODID = DotHackMod.MODID;

	private static final List<String> STAFF = ImmutableList.of("harvestcleric", "macabredancer", "shadowwarlock",
			"wavemaster", "redwand");

	private static final List<String> AXE = ImmutableList.of("heavyaxeman");

	private static final List<String> HAMMER = ImmutableList.of("lordpartizan", "edgepunisher", "flickreaper",
			"longarm", "heavyblade", "heavybladev");

	private static final List<String> BOW = ImmutableList.of("dualgunner", "steamgunner", "shadowwarlock");

	private static final List<String> SWORD = ImmutableList.of("blademaster", "twinblade", "tribalgrappler",
			"dualswords", "bladebrandier");

	public MineSlashHandler() {
		for (int i = 1; i <= 74; i++)
			if (Loader.isModLoaded("ebwizardry")) {
				for (String s : STAFF) {
					MineAndSlashAPI.addCompatibleItem(MODID + ":" + s + i,
							new ConfigItem().setType(new Staff()).setMaxLevel(37).setGenerationWeights(100, 0, 0));
					MineAndSlashAPI.addCompatibleItem(MODID + ":" + s + i + "p", new ConfigItem().setType(new Staff())
							.setMaxLevel(74).setMinLevel(38).setGenerationWeights(100, 100, 0));
					MineAndSlashAPI.addCompatibleItem(MODID + ":" + s + i + "a", new ConfigItem().setType(new Staff())
							.setMaxLevel(111).setMinLevel(75).setGenerationWeights(100, 100, 0));
					MineAndSlashAPI.addCompatibleItem(MODID + ":" + s + i + "m", new ConfigItem().setType(new Staff())
							.setMaxLevel(150).setMinLevel(112).setGenerationWeights(100, 100, 10));
					LOGGER.debug("Registered Staffs");
				}
			} else {
				for (String s : STAFF) {
					MineAndSlashAPI.addCompatibleItem(MODID + ":" + s + i, new ConfigItem().setType(new Staff()));
					LOGGER.debug("Registered Staffs");
				}
			}
		for (int i = 1; i <= 73; i++)
			for (String s : AXE) {
				MineAndSlashAPI.addCompatibleItem(MODID + ":" + s + i, new ConfigItem().setType(new Axe()));
				LOGGER.debug("Registered Axes");
			}
		for (int i = 1; i <= 71; i++)
			for (String s : HAMMER) {
				MineAndSlashAPI.addCompatibleItem(MODID + ":" + s + i,
						new ConfigItem().setType(new Hammer()));
				LOGGER.debug("Registered Hammers");
			}
		for (int i = 1; i <= 18; i++)
			for (String s : BOW) {
				MineAndSlashAPI.addCompatibleItem(MODID + ":" + s + i, new ConfigItem().setType(new Bow()));
				LOGGER.debug("Registered Bows");
			}
		for (int i = 1; i <= 81; i++)
			for (String s : SWORD) {
				MineAndSlashAPI.addCompatibleItem(MODID + ":" + s + i,
						new ConfigItem().setType(new Sword()));
				LOGGER.debug("Registered Swords");
			}
		MineAndSlashAPI.addCompatibleItem(DotHackMod.MODID + ":datadrain", new ConfigItem().setType(new Necklace()));
	}
}