package mod.azure.dothack.util;

import com.robertx22.mine_and_slash.api.MineAndSlashAPI;
import com.robertx22.mine_and_slash.config.compatible_items.ConfigItem;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Necklace;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Axe;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Hammer;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Staff;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Wand;

import mod.azure.dothack.config.Config;

public class MMORPGHandler {

	public MMORPGHandler() {
		for (int i = 1; i <= 10; i++)
			MineAndSlashAPI.addCompatibleItem("dothack:harvestcleric" + i, new ConfigItem().setType(Staff.INSTANCE)
					.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 5; i++)
			MineAndSlashAPI.addCompatibleItem("dothack:macabredancer" + i, new ConfigItem().setType(Staff.INSTANCE)
					.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 14; i++)
			MineAndSlashAPI.addCompatibleItem("dothack:shadowwarlock" + i, new ConfigItem().setType(Staff.INSTANCE)
					.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 74; i++)
			MineAndSlashAPI.addCompatibleItem("dothack:wavemaster" + i, new ConfigItem().setType(Staff.INSTANCE)
					.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		MineAndSlashAPI.addCompatibleItem("dothack:redwand", new ConfigItem().setType(Staff.INSTANCE)
				.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 73; i++)
			MineAndSlashAPI.addCompatibleItem("dothack:heavyaxeman" + i, new ConfigItem().setType(Axe.INSTANCE)
					.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 71; i++)
			MineAndSlashAPI.addCompatibleItem("dothack:longarm" + i, new ConfigItem().setType(Hammer.INSTANCE)
					.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 54; i++)
			MineAndSlashAPI.addCompatibleItem("dothack:heavyblade" + i, new ConfigItem().setType(Hammer.INSTANCE)
					.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 41; i++)
			MineAndSlashAPI.addCompatibleItem("dothack:heavybladev" + i, new ConfigItem().setType(Hammer.INSTANCE)
					.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 9; i++)
			MineAndSlashAPI.addCompatibleItem("dothack:lordpartizan" + i, new ConfigItem().setType(Hammer.INSTANCE)
					.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 9; i++)
			MineAndSlashAPI.addCompatibleItem("dothack:flickreaper" + i, new ConfigItem().setType(Hammer.INSTANCE)
					.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 20; i++)
			MineAndSlashAPI.addCompatibleItem("dothack:edgepunisher" + i, new ConfigItem().setType(Hammer.INSTANCE)
					.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 4; i++)
			MineAndSlashAPI.addCompatibleItem("dothack:dualgunner" + i, new ConfigItem().setType(Bow.INSTANCE)
					.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 18; i++)
			MineAndSlashAPI.addCompatibleItem("dothack:steamgunner" + i, new ConfigItem().setType(Bow.INSTANCE)
					.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 81; i++)
			MineAndSlashAPI.addCompatibleItem("dothack:twinblade" + i, new ConfigItem().setType(Sword.INSTANCE)
					.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 25; i++)
			MineAndSlashAPI.addCompatibleItem("dothack:dualswords" + i, new ConfigItem().setType(Sword.INSTANCE)
					.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 75; i++)
			MineAndSlashAPI.addCompatibleItem("dothack:blademaster" + i, new ConfigItem().setType(Sword.INSTANCE)
					.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 19; i++)
			MineAndSlashAPI.addCompatibleItem("dothack:bladebrandier" + i, new ConfigItem().setType(Sword.INSTANCE)
					.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		for (int i = 1; i <= 11; i++)
			MineAndSlashAPI.addCompatibleItem("dothack:tribalgrappler" + i, new ConfigItem().setType(Sword.INSTANCE)
					.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
		MineAndSlashAPI.addCompatibleItem("dothack:datadrain", new ConfigItem().setType(Necklace.INSTANCE)
				.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()).setAlwaysUnique());
		MineAndSlashAPI.addCompatibleItem("dothack:hermitsstick", new ConfigItem().setType(Wand.INSTANCE)
				.setSalvagable(true).setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get()));
	}
}