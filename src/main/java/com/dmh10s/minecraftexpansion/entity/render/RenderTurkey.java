package com.dmh10s.minecraftexpansion.entity.render;

import com.dmh10s.minecraftexpansion.entity.EntityTurkey;
import com.dmh10s.minecraftexpansion.entity.model.ModelTurkey;
import com.dmh10s.minecraftexpansion.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTurkey extends RenderLiving<EntityTurkey>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/turkey.png");
	
	public RenderTurkey(RenderManager manager)
	{
		super(manager, new ModelTurkey(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityTurkey entity)
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityTurkey entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
