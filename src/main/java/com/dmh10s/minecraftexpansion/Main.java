package com.dmh10s.minecraftexpansion;

import com.dmh10s.minecraftexpansion.init.ModItems;
import com.dmh10s.minecraftexpansion.init.ModRecipes;
import com.dmh10s.minecraftexpansion.proxy.CommonProxy;
import com.dmh10s.minecraftexpansion.util.Reference;
import com.dmh10s.minecraftexpansion.util.handler.RegistryHandler;
import com.dmh10s.minecraftexpansion.world.ModWorldGen;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistries();
		MinecraftForge.addGrassSeed(new ItemStack(Items.BEETROOT_SEEDS), 1);
		MinecraftForge.addGrassSeed(new ItemStack(Items.MELON_SEEDS), 1);
		MinecraftForge.addGrassSeed(new ItemStack(Items.PUMPKIN_SEEDS), 1);
		MinecraftForge.addGrassSeed(new ItemStack(ModItems.CABBAGE_SEED), 1);
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		ModRecipes.init();
		RegistryHandler.initRegistries();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}

}
