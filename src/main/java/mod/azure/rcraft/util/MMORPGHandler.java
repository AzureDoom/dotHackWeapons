package mod.azure.rcraft.util;

import com.robertx22.api.MineAndSlashAPI;
import com.robertx22.config.non_mine_items.ConfigItem;
import com.robertx22.database.gearitemslots.Axe;
import com.robertx22.database.gearitemslots.Bow;
import com.robertx22.database.gearitemslots.Hammer;
import com.robertx22.database.gearitemslots.Staff;
import com.robertx22.database.gearitemslots.Sword;

import mod.azure.rcraft.items.ItemBaseGun;
import mod.azure.rcraft.items.ItemBaseSword;

public class MMORPGHandler {

	public MMORPGHandler() {
		MineAndSlashAPI.addCompatibleItem("rcraft:harvestcleric", new ConfigItem().setType(new Staff()));
		for (int i = 1; i <= 8; i ++)
		{
			MineAndSlashAPI.addCompatibleItem("rcraft:harvestcleric" + i, new ConfigItem().setType(new Staff()));
		}
		MineAndSlashAPI.addCompatibleItem("rcraft:macabredancer", new ConfigItem().setType(new Staff()));
		for (int i = 1; i <= 4; i ++)
		{
			MineAndSlashAPI.addCompatibleItem("rcraft:macabredancer" + i, new ConfigItem().setType(new Staff()));
		}
		MineAndSlashAPI.addCompatibleItem("rcraft:shadowwarlock", new ConfigItem().setType(new Staff()));
		for (int i = 1; i <= 13; i ++)
		{
			MineAndSlashAPI.addCompatibleItem("rcraft:shadowwarlock" + i, new ConfigItem().setType(new Staff()));
		}
		MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster", new ConfigItem().setType(new Staff()));
		for (int i = 1; i <= 43; i ++)
		{
			MineAndSlashAPI.addCompatibleItem("rcraft:wavemaster" + i, new ConfigItem().setType(new Staff()));
		}
		MineAndSlashAPI.addCompatibleItem("rcraft:heavyaxeman", new ConfigItem().setType(new Axe()));
		for (int i = 2; i <= 25; i ++)
		{
			MineAndSlashAPI.addCompatibleItem("rcraft:heavyaxeman" + i, new ConfigItem().setType(new Axe()));
		}
		MineAndSlashAPI.addCompatibleItem("rcraft:lordpartizan", new ConfigItem().setType(new Hammer()));
		for (int i = 2; i <= 9; i ++)
		{
			MineAndSlashAPI.addCompatibleItem("rcraft:lordpartizan" + i, new ConfigItem().setType(new Hammer()));
		}
		MineAndSlashAPI.addCompatibleItem("rcraft:edgepunisher", new ConfigItem().setType(new Hammer()));
		for (int i = 2; i <= 20; i ++)
		{
			MineAndSlashAPI.addCompatibleItem("rcraft:edgepunisher" + i, new ConfigItem().setType(new Hammer()));
		}
		MineAndSlashAPI.addCompatibleItem("rcraft:flickreaper", new ConfigItem().setType(new Hammer()));
		for (int i = 2; i <= 9; i ++)
		{
			MineAndSlashAPI.addCompatibleItem("rcraft:flickreaper" + i, new ConfigItem().setType(new Hammer()));
		}
		MineAndSlashAPI.addCompatibleItem("rcraft:bladebrandier", new ConfigItem().setType(new Sword()));
		for (int i = 2; i <= 19; i ++)
		{
			MineAndSlashAPI.addCompatibleItem("rcraft:bladebrandier" + i, new ConfigItem().setType(new Sword()));
		}
		MineAndSlashAPI.addCompatibleItem("rcraft:dualswords", new ConfigItem().setType(new Sword()));
		for (int i = 2; i <= 25; i ++)
		{
			MineAndSlashAPI.addCompatibleItem("rcraft:dualswords" + i, new ConfigItem().setType(new Sword()));
		}
		MineAndSlashAPI.addCompatibleItem("rcraft:tribalgrappler", new ConfigItem().setType(new Sword()));
		for (int i = 2; i <= 4; i ++)
		{
			MineAndSlashAPI.addCompatibleItem("rcraft:tribalgrappler" + i, new ConfigItem().setType(new Sword()));
		} 
		MineAndSlashAPI.addCompatibleItem("rcraft:twinblade", new ConfigItem().setType(new Sword()));
		for (int i = 2; i <= 79; i ++)
		{
			MineAndSlashAPI.addCompatibleItem("rcraft:twinblade" + i, new ConfigItem().setType(new Sword()));
		}
		MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner", new ConfigItem().setType(new Bow()));
		for (int i = 1; i <= 17; i ++)
		{
			MineAndSlashAPI.addCompatibleItem("rcraft:steamgunner" + i, new ConfigItem().setType(new Bow()));
		}
		MineAndSlashAPI.addCompatibleItem("rcraft:dualgunner", new ConfigItem().setType(new Bow()));
		MineAndSlashAPI.addCompatibleItem("rcraft:dualgunner1", new ConfigItem().setType(new Bow()));
		MineAndSlashAPI.addCompatibleItem("rcraft:dualgunner2", new ConfigItem().setType(new Bow()));
		MineAndSlashAPI.addCompatibleItem("rcraft:longarm", new ConfigItem().setType(new Hammer()));
		for (int i = 2; i <= 42; i ++)
		{
			MineAndSlashAPI.addCompatibleItem("rcraft:longarm" + i, new ConfigItem().setType(new Hammer()));
		} 
		MineAndSlashAPI.addCompatibleItem("rcraft:blademaster", new ConfigItem().setType(new Sword()));
		for (int i = 2; i <= 41; i ++)
		{
			MineAndSlashAPI.addCompatibleItem("rcraft:blademaster" + i, new ConfigItem().setType(new Sword()));
		} 
		MineAndSlashAPI.addCompatibleItem("rcraft:heavyblade", new ConfigItem().setType(new Hammer()));
		for (int i = 2; i <= 38; i ++)
		{
			MineAndSlashAPI.addCompatibleItem("rcraft:heavyblade" + i, new ConfigItem().setType(new Hammer()));
		} 
	}
}