package mod.azure.dothack.client.render;

import mod.azure.dothack.DotHackMod;
import mod.azure.dothack.entity.projectiles.ManaEntity;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;

public class ManaRender extends ArrowRenderer<ManaEntity> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(DotHackMod.MODID,
			"textures/entity/projectiles/magic.png");

	public ManaRender(EntityRendererManager renderManagerIn) {
		super(renderManagerIn);
	}

	@Override
	public ResourceLocation getEntityTexture(ManaEntity entity) {
		return TEXTURE;
	}

}