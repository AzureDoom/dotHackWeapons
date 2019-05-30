package mod.azure.rcraft.util;

import java.util.List;

import com.google.common.collect.ImmutableList;

import mod.azure.rcraft.RcraftMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootEntryTable;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LootHandler {
	private static final List<String> TABLES = ImmutableList.of(
			"inject/abandoned_mineshaft", "inject/desert_pyramid",
			"inject/jungle_temple", "inject/simple_dungeon",
			"inject/stronghold_crossing", "inject/stronghold_corridor",
			"inject/stronghold_library", "underwater_ruin_big",
			"inject/underwater_ruin_small", "inject/village_blacksmith",
			"inject/main_loot"
			);

	public LootHandler() {
		for (String s : TABLES) {
			LootTableList.register(new ResourceLocation(RcraftMod.modid, s));
		}

	}

	@SubscribeEvent
	public void lootLoad(LootTableLoadEvent evt) {
		String prefix = "minecraft:chests/";
		String name = evt.getName().toString();

		if (name.startsWith(prefix)) {
			String file = name.substring(name.indexOf(prefix) + prefix.length());
			switch (file) {
			case "abandoned_mineshaft":
			case "desert_pyramid":
			case "jungle_temple":
			case "simple_dungeon":
			case "stronghold_crossing":
			case "stronghold_corridor":
			case "stronghold_library":
			case "underwater_ruin_big":
			case "underwater_ruin_small":
			case "village_blacksmith": 
			case "main_loot" :
			evt.getTable().addPool(getInjectPool(file)); break;
			default: break;
			}
		}
	}

	private LootPool getInjectPool(String entryName) {
		return new LootPool(new LootEntry[] { getInjectEntry(entryName, 1) }, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0, 1), "rcraft_inject_pool");
	}

	private LootEntryTable getInjectEntry(String name, int weight) {
		return new LootEntryTable(new ResourceLocation(RcraftMod.modid, "inject/" + name), weight, 0, new LootCondition[0], "rcraft_inject_entry");
	}

}