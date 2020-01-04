package mod.azure.dothack.util;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Necklace;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Axe;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Hammer;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Staff;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;

public class MMORPGHandler {

	private static final List<String> STAFF = ImmutableList.of("harvestcleric", "macabredancer", "shadowwarlock",
			"wavemaster");

	private static final List<String> HAMMER = ImmutableList.of("lordpartizan", "edgepunisher", "flickreaper",
			"longarm", "heavyblade", "heavybladev");

	private static final List<String> BOW = ImmutableList.of("dualgunner", "steamgunner");

	private static final List<String> SWORD = ImmutableList.of("blademaster", "twinblade", "tribalgrappler",
			"dualswords", "bladebrandier");

	public MMORPGHandler() {
		for (String s : STAFF) {
			for (int i = 1; i <= 74; i++)
				MineAndSlashAPI.addCompatibleItem("dothack:" + s + i,
						new ConfigItem().setType(Staff.INSTANCE).setSalvagable(true));
		}
		MineAndSlashAPI.addCompatibleItem("dothack:redwand",
				new ConfigItem().setType(Staff.INSTANCE).setSalvagable(true));
		for (int i = 1; i <= 73; i++)
			MineAndSlashAPI.addCompatibleItem("dothack:heavyaxeman" + i,
					new ConfigItem().setType(Axe.INSTANCE).setSalvagable(true));
		for (String h : HAMMER) {
			for (int i = 1; i <= 71; i++)
				MineAndSlashAPI.addCompatibleItem("dothack:" + h + i,
						new ConfigItem().setType(Hammer.INSTANCE).setSalvagable(true));
		}
		for (String b : BOW) {
			for (int i = 1; i <= 18; i++)
				MineAndSlashAPI.addCompatibleItem("dothack:" + b + i,
						new ConfigItem().setType(Bow.INSTANCE).setSalvagable(true));
		}
		for (String w : SWORD) {
			for (int i = 1; i <= 81; i++)
				MineAndSlashAPI.addCompatibleItem("dothack:" + w + i,
						new ConfigItem().setType(Sword.INSTANCE).setSalvagable(true));
		}
		MineAndSlashAPI.addCompatibleItem("dothack:datadrain",
				new ConfigItem().setType(Necklace.INSTANCE).setSalvagable(true).setAlwaysUnique());
	}
}