package mod.azure.rcraft.util;

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Axe;
import com.robertx22.database.gearitemslots.Bow;
import com.robertx22.database.gearitemslots.Hammer;
import com.robertx22.database.gearitemslots.Staff;
import com.robertx22.database.gearitemslots.Sword;

import mod.azure.rcraft.RcraftMod;

public class MMORPGHandler {

	private static final List<String> STAFF = ImmutableList.of(
			"harvestcleric", "macabredancer", "shadowwarlock", 
			"wavemaster"
			);

	private static final List<String> AXE = ImmutableList.of(
			"heavyaxeman"
			);

	private static final List<String> HAMMER = ImmutableList.of(
			"lordpartizan", "edgepunisher",
			"flickreaper", "longarm", "heavyblade"
			);

	private static final List<String> BOW = ImmutableList.of(
			"dualgunner", "steamgunner", "shadowwarlock"
			);

	private static final List<String> SWORD = ImmutableList.of(
			"blademaster", "twinblade", "tribalgrappler", 
			"dualswords", "bladebrandier"
			);

	public MMORPGHandler() {
		for (int i = 1; i <= 44; i ++)
		for (String s : STAFF ) {
			MineAndSlashAPI.addCompatibleItem(RcraftMod.modid + ":" + s + i, new ConfigItem().setType(new Staff()));
		}
		for (int i = 1; i <= 45; i ++)
		for (String s : AXE) {
			MineAndSlashAPI.addCompatibleItem(RcraftMod.modid + ":" + s + i, new ConfigItem().setType(new Axe()));
		}
		for (int i = 1; i <= 38; i ++)
		for (String s : HAMMER) {
			MineAndSlashAPI.addCompatibleItem(RcraftMod.modid + ":" + s + i, new ConfigItem().setType(new Hammer()));
		}
		for (int i = 1; i <= 18; i ++)
		for (String s : BOW) {
			MineAndSlashAPI.addCompatibleItem(RcraftMod.modid + ":" + s + i, new ConfigItem().setType(new Bow()));
		}
		for (int i = 1; i <= 79; i ++)
		for (String s : SWORD) {
			MineAndSlashAPI.addCompatibleItem(RcraftMod.modid + ":" + s + i, new ConfigItem().setType(new Sword()));
		}
	}
}