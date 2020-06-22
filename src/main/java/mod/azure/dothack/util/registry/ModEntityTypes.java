package mod.azure.dothack.util.registry;

import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.entity.projectiles.BulletEntity;
import mod.azure.dothack.entity.projectiles.ManaEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

	@SuppressWarnings("deprecation")
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES,
			DotHackMod.MODID);

	public static final RegistryObject<EntityType<BulletEntity>> BULLETS = ENTITY_TYPES.register("bullets",
			() -> EntityType.Builder.<BulletEntity>create(BulletEntity::new, EntityClassification.MISC).size(0.5F, 0.5F)
					.build(new ResourceLocation(DotHackMod.MODID, "bullets").toString()));
	
	public static final RegistryObject<EntityType<ManaEntity>> MANA = ENTITY_TYPES.register("mana",
			() -> EntityType.Builder.<ManaEntity>create(ManaEntity::new, EntityClassification.MISC).size(1.0F, 1.0F)
					.build(new ResourceLocation(DotHackMod.MODID, "mana").toString()));

}