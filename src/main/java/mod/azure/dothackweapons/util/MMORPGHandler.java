package mod.azure.dothackweapons.util;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Axe;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Hammer;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Staff;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

import mod.azure.dothackweapons.DotHackMod;

public class MMORPGHandler {

	private static final List<String> STAFF = ImmutableList.of("harvestcleric", "macabredancer", "shadowwarlock",
			"wavemaster", "redwand");

	private static final List<String> AXE = ImmutableList.of("heavyaxeman");

	private static final List<String> HAMMER = ImmutableList.of("lordpartizan", "edgepunisher", "flickreaper",
			"longarm", "heavyblade", "heavybladev");

	private static final List<String> BOW = ImmutableList.of("dualgunner", "steamgunner", "shadowwarlock");

	private static final List<String> SWORD = ImmutableList.of("blademaster", "twinblade", "tribalgrappler",
			"dualswords", "bladebrandier");

	public MMORPGHandler() {
		for (int i = 1; i <= 74; i++)
			for (String s : STAFF) {
				MineAndSlashAPI.addCompatibleItem(DotHackMod.MODID + ":" + s + i,
						new ConfigItem().setType(Staff.INSTANCE));
				DotHackMod.LOGGER.info("Registered Staffs");
			}
		for (int i = 1; i <= 73; i++)
			for (String s : AXE) {
				MineAndSlashAPI.addCompatibleItem(DotHackMod.MODID + ":" + s + i,
						new ConfigItem().setType(Axe.INSTANCE));
				DotHackMod.LOGGER.info("Registered Axes");
			}
		for (int i = 1; i <= 71; i++)
			for (String s : HAMMER) {
				MineAndSlashAPI.addCompatibleItem(DotHackMod.MODID + ":" + s + i,
						new ConfigItem().setType(Hammer.INSTANCE));
				DotHackMod.LOGGER.info("Registered Hammers");
			}
		for (int i = 1; i <= 18; i++)
			for (String s : BOW) {
				MineAndSlashAPI.addCompatibleItem(DotHackMod.MODID + ":" + s + i,
						new ConfigItem().setType(Bow.INSTANCE));
				DotHackMod.LOGGER.info("Registered Bows");
			}
		for (int i = 1; i <= 81; i++)
			for (String s : SWORD) {
				MineAndSlashAPI.addCompatibleItem(DotHackMod.MODID + ":" + s + i,
						new ConfigItem().setType(Sword.INSTANCE));
				DotHackMod.LOGGER.info("Registered Swords");
			}
	}
}