package mod.azure.dothack.util.registry;

import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.SpawnListEntry;

public class ModEntitySpawn {

	public static void registerEntityWorldSpawns() {

//		registerEntityWorldSpawn(ModEntityTypes.IMP.get(), 12, 2, 7, Biomes.NETHER);
		
	}

	public static void EntitySpawnPlacementRegistry() {

//		EntitySpawnPlacementRegistry.register(ModEntityTypes.ARCHVILE.get(),
//				EntitySpawnPlacementRegistry.PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES,
//				ArchvileEntity::spawning);
		
	}

	public static void registerEntityWorldSpawn(EntityType<?> entity, int weight, int minGroup, int maxGroup,
			Biome... biomes) {
		for (Biome biome : biomes) {
			if (biome != null) {
				biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, weight, minGroup, maxGroup));
			}
		}
	}
}