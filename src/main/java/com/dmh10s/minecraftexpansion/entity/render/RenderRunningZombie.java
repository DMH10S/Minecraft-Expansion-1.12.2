package com.dmh10s.minecraftexpansion.entity.render;

import com.dmh10s.minecraftexpansion.entity.EntityRunningZombie;
import com.dmh10s.minecraftexpansion.entity.EntityTurkey;
import com.dmh10s.minecraftexpansion.entity.model.ModelRunningZombie;
import com.dmh10s.minecraftexpansion.entity.model.ModelTurkey;
import com.dmh10s.minecraftexpansion.util.Reference;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;

public class RenderRunningZombie extends RenderLiving<EntityRunningZombie>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/running_zombie.png");
	
	public RenderRunningZombie(RenderManager manager)
	{
		super(manager, new ModelRunningZombie(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityRunningZombie entity)
	{
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityRunningZombie entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
