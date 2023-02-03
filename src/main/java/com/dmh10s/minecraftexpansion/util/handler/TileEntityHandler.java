package com.dmh10s.minecraftexpansion.util.handler;

import com.dmh10s.minecraftexpansion.blocks.coke_furnace.TileEntityCokeFurnace;
import com.dmh10s.minecraftexpansion.blocks.foundry.TileEntityFoundry;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityFoundry.class, "foundry");
		GameRegistry.registerTileEntity(TileEntityCokeFurnace.class, "coke_furnace");
	}
}
