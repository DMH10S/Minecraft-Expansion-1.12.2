package com.dmh10s.minecraftexpansion.util.handler;

import com.dmh10s.minecraftexpansion.blocks.coke_furnace.ContainerCokeFurnace;
import com.dmh10s.minecraftexpansion.blocks.coke_furnace.GuiCokeFurnace;
import com.dmh10s.minecraftexpansion.blocks.coke_furnace.TileEntityCokeFurnace;
import com.dmh10s.minecraftexpansion.blocks.foundry.ContainerFoundry;
import com.dmh10s.minecraftexpansion.blocks.foundry.GuiFoundry;
import com.dmh10s.minecraftexpansion.blocks.foundry.TileEntityFoundry;
import com.dmh10s.minecraftexpansion.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_FOUNDRY) {return new ContainerFoundry(player.inventory, (TileEntityFoundry)world.getTileEntity(new BlockPos(x,y,z)));}
		if(ID == Reference.GUI_COKE_FURNACE) {return new ContainerCokeFurnace(player.inventory, (TileEntityCokeFurnace)world.getTileEntity(new BlockPos(x,y,z)));}
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_FOUNDRY) {return new GuiFoundry(player.inventory, (TileEntityFoundry)world.getTileEntity(new BlockPos(x,y,z)));}
		if(ID == Reference.GUI_COKE_FURNACE) {return new GuiCokeFurnace(player.inventory, (TileEntityCokeFurnace)world.getTileEntity(new BlockPos(x,y,z)));}
		return null;
	}
}
