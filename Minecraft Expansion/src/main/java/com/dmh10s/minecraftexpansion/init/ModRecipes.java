package com.dmh10s.minecraftexpansion.init;

import java.util.Random;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init()
	{
		Random rand = new Random();
		GameRegistry.addSmelting(Items.COAL, new ItemStack(ModItems.COKE, 1), 0);
		GameRegistry.addSmelting(ModBlocks.LEAD_ORE, new ItemStack(ModItems.LEAD_INGOT, 1), 1.0F);
		GameRegistry.addSmelting(ModItems.RAW_BOAR_MEAT, new ItemStack(ModItems.COOKED_BOAR_MEAT, 1), 1.0f);
		GameRegistry.addSmelting(ModItems.RAW_TURKEY_BREAST, new ItemStack(ModItems.COOKED_TURKEY_BREAST, 1), 0.35f);
		GameRegistry.addSmelting(ModItems.RAW_TURKEY_DRUMSTICK, new ItemStack(ModItems.COOKED_TURKEY_DRUMSTICK, 1), 0.35f);
		GameRegistry.addSmelting(ModBlocks.ALUMINUM_ORE, new ItemStack(ModItems.ALUMINUM_INGOT, 1), 0.7f);
		GameRegistry.addSmelting(ModBlocks.ENDER_ORE, new ItemStack(Items.ENDER_PEARL, 1), 0.2F);
		GameRegistry.addSmelting(ModBlocks.FOSSILIZED_STONE, new ItemStack(Items.BONE, 1), 0.1F);
		GameRegistry.addSmelting(ModBlocks.NETHER_GOLD_ORE, new ItemStack(Items.GOLD_INGOT, 1), 1.0F);
		GameRegistry.addSmelting(ModBlocks.RHONDITE_ORE, new ItemStack(ModItems.RHONDITE, 1), 0.7F);
		GameRegistry.addSmelting(ModBlocks.RUBY_ORE, new ItemStack(ModItems.RUBY, 1), 1.0F);
	}
}
