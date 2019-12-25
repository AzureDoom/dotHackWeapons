package mod.azure.dothack.util;

import java.util.Set;

import com.google.common.collect.Sets;

import mod.azure.dothack.DotHackMod;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTables;
import net.minecraft.world.storage.loot.TableLootEntry;
import net.minecraftforge.event.LootTableLoadEvent;

public class LootHandler {
	private static Set<ResourceLocation> tables = Sets.newHashSet(LootTables.CHESTS_SIMPLE_DUNGEON,
			LootTables.CHESTS_ABANDONED_MINESHAFT, LootTables.CHESTS_DESERT_PYRAMID, LootTables.CHESTS_JUNGLE_TEMPLE,
			LootTables.CHESTS_WOODLAND_MANSION);

	public static void onLootLoad(LootTableLoadEvent event) {
		if (tables.contains(event.getName())) {
			event.getTable()
					.addPool(LootPool.builder().addEntry(TableLootEntry
							.builder(new ResourceLocation(DotHackMod.MODID, "chests/inject")).weight(1).quality(0))
							.name("dothack_chest_injection").build());
		}
	}
}