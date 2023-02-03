package com.dmh10s.minecraftexpansion.util.handler;

import com.dmh10s.minecraftexpansion.entity.EntityBoar;
import com.dmh10s.minecraftexpansion.entity.EntityRunningZombie;
import com.dmh10s.minecraftexpansion.entity.EntityTurkey;
import com.dmh10s.minecraftexpansion.entity.render.RenderBoar;
import com.dmh10s.minecraftexpansion.entity.render.RenderRunningZombie;
import com.dmh10s.minecraftexpansion.entity.render.RenderTurkey;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler
{
	public static void registerEntityRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityBoar.class, new IRenderFactory<EntityBoar>()
		{
			@Override
			public Render<? super EntityBoar> createRenderFor(RenderManager manager)
			{
				return new RenderBoar(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityTurkey.class, new IRenderFactory<EntityTurkey>()
		{
			@Override
			public Render<? super EntityTurkey> createRenderFor(RenderManager manager)
			{
				return new RenderTurkey(manager);
			}
		});
		
		RenderingRegistry.registerEntityRenderingHandler(EntityRunningZombie.class, new IRenderFactory<EntityRunningZombie>()
		{
			@Override
			public Render<? super EntityRunningZombie> createRenderFor(RenderManager manager)
			{
				return new RenderRunningZombie(manager);
			}
		});
	}
}
