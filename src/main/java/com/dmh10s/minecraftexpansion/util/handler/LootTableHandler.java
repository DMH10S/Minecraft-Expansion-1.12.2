package com.dmh10s.minecraftexpansion.util.handler;

import com.dmh10s.minecraftexpansion.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootTableHandler
{
	public static final ResourceLocation TURKEY = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "turkey"));
	public static final ResourceLocation BOAR = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "boar"));
	public static final ResourceLocation RUNNING_ZOMBIE = LootTableList.register(new ResourceLocation(Reference.MOD_ID, "running_zombie"));
}
