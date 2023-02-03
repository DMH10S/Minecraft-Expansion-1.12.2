package com.dmh10s.minecraftexpansion.entity.render;

import com.dmh10s.minecraftexpansion.entity.EntityBoar;
import com.dmh10s.minecraftexpansion.entity.model.ModelBoar;
import com.dmh10s.minecraftexpansion.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBoar extends RenderLiving<EntityBoar>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/boar.png");
	
	public RenderBoar(RenderManager manager)
	{
		super(manager, new ModelBoar(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityBoar entity)
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityBoar entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
