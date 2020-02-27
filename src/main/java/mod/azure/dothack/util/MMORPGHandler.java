package mod.azure.dothack.util;

import java.util.ArrayList;
import java.util.List;

import com.robertx22.mine_and_slash.config.compatible_items.OldConfigItem;
import com.robertx22.mine_and_slash.data_generation.compatible_items.CompatibleItem;
import com.robertx22.mine_and_slash.data_generation.compatible_items.CompatibleItemProvider;
import com.robertx22.mine_and_slash.database.gearitemslots.curios.Necklace;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Axe;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Bow;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Hammer;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Staff;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Sword;
import com.robertx22.mine_and_slash.database.gearitemslots.weapons.Wand;
import com.robertx22.mine_and_slash.onevent.data_gen.providers.SlashDataProvider;

import mod.azure.dothack.config.Config;
import net.minecraft.data.DataGenerator;

public class MMORPGHandler {

	public static String ID = "compatible_items";

	public MMORPGHandler() {
	}

	@SuppressWarnings("rawtypes")
	public SlashDataProvider getDataPackCreator(DataGenerator gen) {
		return new CompatibleItemProvider(gen, getList(), ID);
	}

	public static List<CompatibleItem> getList() {
		List<CompatibleItem> items = new ArrayList<>();
		try {
			for (int type = 1; type <= 1; type++)
				switch (type) {
				case 1:
					for (int bownumber = 1; bownumber <= 4; bownumber++) {
						OldConfigItem bowconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0).setMaxRarity(5)
								.setMinRarity(0).setSalvagable(true).setType(Bow.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id1 = "dothack:dualgunner" + bownumber;

						CompatibleItem bow = bowconfig.convertToNewFormat();
						bow.guid = id1;
						bow.item_id = id1;

						items.add(bow);
					}
				case 2:
					for (int bownumber = 1; bownumber <= 18; bownumber++) {
						OldConfigItem bowconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0).setMaxRarity(5)
								.setMinRarity(0).setSalvagable(true).setType(Bow.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id2 = "dothack:steamgunner" + bownumber;

						CompatibleItem bow = bowconfig.convertToNewFormat();
						bow.guid = id2;
						bow.item_id = id2;

						items.add(bow);
					}
				case 3:
					for (int staffnumber = 1; staffnumber <= 10; staffnumber++) {
						OldConfigItem staffconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Staff.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id3 = "dothack:harvestcleric" + staffnumber;

						CompatibleItem staff = staffconfig.convertToNewFormat();
						staff.guid = id3;
						staff.item_id = id3;

						items.add(staff);
					}
				case 4:
					for (int staffnumber = 1; staffnumber <= 5; staffnumber++) {
						OldConfigItem staffconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Staff.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id4 = "dothack:macabredancer" + staffnumber;

						CompatibleItem staff = staffconfig.convertToNewFormat();
						staff.guid = id4;
						staff.item_id = id4;

						items.add(staff);
					}
				case 5:
					for (int axenumber = 1; axenumber <= 73; axenumber++) {
						OldConfigItem bowconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0).setMaxRarity(5)
								.setMinRarity(0).setSalvagable(true).setType(Axe.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id5 = "dothack:heavyaxeman" + axenumber;

						CompatibleItem axe = bowconfig.convertToNewFormat();
						axe.guid = id5;
						axe.item_id = id5;

						items.add(axe);
					}
				case 6:
					OldConfigItem necklaceconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
							.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Necklace.INSTANCE)
							.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

					String id6 = "dothack:datadrain";

					CompatibleItem necklaces = necklaceconfig.convertToNewFormat();
					necklaces.guid = id6;
					necklaces.item_id = id6;

					items.add(necklaces);
				case 7:
					OldConfigItem wandconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0).setMaxRarity(5)
							.setMinRarity(0).setSalvagable(true).setType(Wand.INSTANCE)
							.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

					String id7 = "dothack:hermitsstick";

					CompatibleItem wands = wandconfig.convertToNewFormat();
					wands.guid = id7;
					wands.item_id = id7;

					items.add(wands);
				case 8:
					for (int hammernumber = 1; hammernumber <= 71; hammernumber++) {
						OldConfigItem hammerconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Hammer.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id8 = "dothack:longarm" + hammernumber;

						CompatibleItem hammer = hammerconfig.convertToNewFormat();
						hammer.guid = id8;
						hammer.item_id = id8;

						items.add(hammer);
					}
				case 9:
					for (int hammernumber = 1; hammernumber <= 54; hammernumber++) {
						OldConfigItem hammerconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Hammer.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id9 = "dothack:heavyblade" + hammernumber;

						CompatibleItem hammer = hammerconfig.convertToNewFormat();
						hammer.guid = id9;
						hammer.item_id = id9;

						items.add(hammer);
					}
				case 10:
					for (int hammernumber = 1; hammernumber <= 41; hammernumber++) {
						OldConfigItem hammerconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Hammer.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id10 = "dothack:heavybladev" + hammernumber;

						CompatibleItem hammer = hammerconfig.convertToNewFormat();
						hammer.guid = id10;
						hammer.item_id = id10;

						items.add(hammer);
					}
				case 11:
					for (int hammernumber = 1; hammernumber <= 9; hammernumber++) {
						OldConfigItem hammerconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Hammer.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id11 = "dothack:lordpartizan" + hammernumber;

						CompatibleItem hammer = hammerconfig.convertToNewFormat();
						hammer.guid = id11;
						hammer.item_id = id11;

						items.add(hammer);
					}
				case 12:
					for (int hammernumber = 1; hammernumber <= 9; hammernumber++) {
						OldConfigItem hammerconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Hammer.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id12 = "dothack:flickreaper" + hammernumber;

						CompatibleItem hammer = hammerconfig.convertToNewFormat();
						hammer.guid = id12;
						hammer.item_id = id12;

						items.add(hammer);
					}
				case 13:
					for (int hammernumber = 1; hammernumber <= 20; hammernumber++) {
						OldConfigItem hammerconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Hammer.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id13 = "dothack:edgepunisher" + hammernumber;

						CompatibleItem hammer = hammerconfig.convertToNewFormat();
						hammer.guid = id13;
						hammer.item_id = id13;

						items.add(hammer);
					}
				case 14:
					for (int staffnumber = 1; staffnumber <= 14; staffnumber++) {
						OldConfigItem staffconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Staff.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id14 = "dothack:shadowwarlock" + staffnumber;

						CompatibleItem staff = staffconfig.convertToNewFormat();
						staff.guid = id14;
						staff.item_id = id14;

						items.add(staff);
					}
				case 15:
					for (int staffnumber = 1; staffnumber <= 74; staffnumber++) {
						OldConfigItem staffconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Staff.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id15 = "dothack:wavemaster" + staffnumber;

						CompatibleItem staff = staffconfig.convertToNewFormat();
						staff.guid = id15;
						staff.item_id = id15;

						items.add(staff);
					}
				case 16:
					OldConfigItem staffconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0).setMaxRarity(5)
							.setMinRarity(0).setSalvagable(true).setType(Staff.INSTANCE)
							.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

					String id16 = "dothack:redwand";

					CompatibleItem staff = staffconfig.convertToNewFormat();
					staff.guid = id16;
					staff.item_id = id16;

					items.add(staff);
				case 17:
					for (int swordnumber = 1; swordnumber <= 81; swordnumber++) {
						OldConfigItem swordconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Sword.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id17 = "dothack:twinblade" + swordnumber;

						CompatibleItem sword = swordconfig.convertToNewFormat();
						sword.guid = id17;
						sword.item_id = id17;

						items.add(sword);
					}
				case 18:
					for (int swordnumber = 1; swordnumber <= 25; swordnumber++) {
						OldConfigItem swordconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Sword.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id18 = "dothack:dualswords" + swordnumber;

						CompatibleItem sword = swordconfig.convertToNewFormat();
						sword.guid = id18;
						sword.item_id = id18;

						items.add(sword);
					}
				case 19:
					for (int swordnumber = 1; swordnumber <= 75; swordnumber++) {
						OldConfigItem swordconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Sword.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id19 = "dothack:blademaster" + swordnumber;

						CompatibleItem sword = swordconfig.convertToNewFormat();
						sword.guid = id19;
						sword.item_id = id19;

						items.add(sword);
					}
				case 20:
					for (int swordnumber = 1; swordnumber <= 19; swordnumber++) {
						OldConfigItem swordconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Sword.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id20 = "dothack:bladebrandier" + swordnumber;

						CompatibleItem sword = swordconfig.convertToNewFormat();
						sword.guid = id20;
						sword.item_id = id20;

						items.add(sword);
					}
				case 21:
					for (int swordnumber = 1; swordnumber <= 11; swordnumber++) {
						OldConfigItem swordconfig = new OldConfigItem().setGenerationWeights(1000, 200, 0)
								.setMaxRarity(5).setMinRarity(0).setSalvagable(true).setType(Sword.INSTANCE)
								.setdropsAsLoot(Config.SERVER.USE_MINESLASHLOOTSYSTEM.get());

						String id21 = "dothack:tribalgrappler" + swordnumber;

						CompatibleItem sword = swordconfig.convertToNewFormat();
						sword.guid = id21;
						sword.item_id = id21;

						items.add(sword);
					}
				}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return items;
	}
}