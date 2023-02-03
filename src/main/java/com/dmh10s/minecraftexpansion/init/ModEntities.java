package com.dmh10s.minecraftexpansion.init;

import com.dmh10s.minecraftexpansion.Main;
import com.dmh10s.minecraftexpansion.entity.EntityBoar;
import com.dmh10s.minecraftexpansion.entity.EntityRunningZombie;
import com.dmh10s.minecraftexpansion.entity.EntityTurkey;
import com.dmh10s.minecraftexpansion.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityEvoker;
import net.minecraft.entity.monster.EntityVindicator;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities
{
	public static void registerEntities()
	{
		registerEntity("boar", EntityBoar.class, Reference.ENTITY_BOAR, 20, 9138256, 13487565);
		registerEntity("turkey", EntityTurkey.class, Reference.ENTITY_TURKEY, 25, 16516100, 12359712);
		registerEntity("running_zombie", EntityRunningZombie.class, Reference.ENTITY_RUNNING_ZOMBIE, 30, 4396849, 4219695);
		
		EntityRegistry.addSpawn(EntityTurkey.class, 20, 3, 7, EnumCreatureType.CREATURE, Biomes.FOREST, Biomes.FOREST_HILLS, Biomes.PLAINS, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.ROOFED_FOREST, Biomes.REDWOOD_TAIGA, Biomes.REDWOOD_TAIGA_HILLS, Biomes.TAIGA, Biomes.TAIGA_HILLS, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU);
		EntityRegistry.addSpawn(EntityBoar.class, 15, 2, 5, EnumCreatureType.CREATURE, Biomes.FOREST, Biomes.FOREST_HILLS, Biomes.PLAINS, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.ROOFED_FOREST, Biomes.REDWOOD_TAIGA, Biomes.REDWOOD_TAIGA_HILLS, Biomes.TAIGA, Biomes.TAIGA_HILLS, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU);
		EntityRegistry.addSpawn(EntityEvoker.class, 1, 1, 1, EnumCreatureType.MONSTER, Biomes.FOREST, Biomes.FOREST_HILLS, Biomes.PLAINS, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.ROOFED_FOREST, Biomes.REDWOOD_TAIGA, Biomes.REDWOOD_TAIGA_HILLS, Biomes.TAIGA, Biomes.TAIGA_HILLS, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU);
		EntityRegistry.addSpawn(EntityVindicator.class, 2, 1, 1, EnumCreatureType.MONSTER, Biomes.FOREST, Biomes.FOREST_HILLS, Biomes.PLAINS, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.ROOFED_FOREST, Biomes.REDWOOD_TAIGA, Biomes.REDWOOD_TAIGA_HILLS, Biomes.TAIGA, Biomes.TAIGA_HILLS, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU);
		EntityRegistry.addSpawn(EntityRunningZombie.class, 5, 1, 1, EnumCreatureType.MONSTER, Biomes.FOREST, Biomes.FOREST_HILLS, Biomes.PLAINS, Biomes.BIRCH_FOREST, Biomes.BIRCH_FOREST_HILLS, Biomes.ROOFED_FOREST, Biomes.REDWOOD_TAIGA, Biomes.REDWOOD_TAIGA_HILLS, Biomes.TAIGA, Biomes.TAIGA_HILLS, Biomes.SAVANNA, Biomes.SAVANNA_PLATEAU);
	}
	
	public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
