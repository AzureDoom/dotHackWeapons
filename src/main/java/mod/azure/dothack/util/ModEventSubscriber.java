package mod.azure.dothack.util;

import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.item.BulletAmmo;
import mod.azure.dothack.item.ManaItem;
import mod.azure.dothack.util.registry.DotHackItems;
import mod.azure.dothack.util.registry.ModEntitySpawn;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber(modid = DotHackMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ModEventSubscriber {

	@SubscribeEvent
	public static void onRegisterItems(RegistryEvent.Register<Item> event) {
		@SuppressWarnings("unused")
		final IForgeRegistry<Item> registry = event.getRegistry();
		((BulletAmmo) (DotHackItems.BULLET.get())).setItemReference(DotHackItems.BULLET);
		((ManaItem) (DotHackItems.MANA.get())).setItemReference(DotHackItems.MANA);
	}

	@SubscribeEvent
	public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(
//				ModEntityTypes.IMP.get()
				);
		 ModEntitySpawn.registerEntityWorldSpawns();
		 ModEntitySpawn.EntitySpawnPlacementRegistry();
	}

	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
		return setup(entry, new ResourceLocation(DotHackMod.MODID, name));
	}

	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
		entry.setRegistryName(registryName);
		return entry;
	}

}