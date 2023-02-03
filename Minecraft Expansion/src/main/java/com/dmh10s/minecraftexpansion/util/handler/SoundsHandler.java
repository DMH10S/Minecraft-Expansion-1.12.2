package com.dmh10s.minecraftexpansion.util.handler;

import com.dmh10s.minecraftexpansion.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler
{
	public static SoundEvent ENTITY_TURKEY_AMBIENT, ENTITY_TURKEY_HURT, ENTITY_TURKEY_DEATH, ENTITY_BOAR_AMBIENT, ENTITY_BOAR_HURT, ENTITY_BOAR_DEATH, ENTITY_RUNNING_ZOMBIE_AMBIENT, ENTITY_RUNNING_ZOMBIE_DEATH, ENTITY_RUNNING_ZOMBIE_HURT;
	
	public static void registerSounds()
	{
		ENTITY_TURKEY_AMBIENT = registerSound("entity.turkey.ambient");
		ENTITY_TURKEY_HURT = registerSound("entity.turkey.hurt");
		ENTITY_TURKEY_DEATH = registerSound("entity.turkey.death");
		ENTITY_BOAR_AMBIENT = registerSound("entity.boar.ambient");
		ENTITY_BOAR_HURT = registerSound("entity.boar.hurt");
		ENTITY_BOAR_DEATH = registerSound("entity.boar.death");
		ENTITY_RUNNING_ZOMBIE_AMBIENT = registerSound("entity.running_zombie.ambient");
		ENTITY_RUNNING_ZOMBIE_HURT = registerSound("entity.running_zombie.hurt");
		ENTITY_RUNNING_ZOMBIE_DEATH = registerSound("entity.running_zombie.death");
	}
	
	private static SoundEvent registerSound(String name)
	{
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
