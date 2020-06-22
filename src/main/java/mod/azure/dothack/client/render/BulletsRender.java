package mod.azure.dothack.client.render;

import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.entity.projectiles.BulletEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class BulletsRender extends ArrowRenderer<BulletEntity> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(DotHackMod.MODID,
			"textures/entity/projectiles/bullet.png");

	public BulletsRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn);
	}

	@Override
	public ResourceLocation getEntityTexture(BulletEntity entity) {
		return TEXTURE;
	}

}