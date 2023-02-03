package com.dmh10s.minecraftexpansion.blocks;

import java.util.Random;

import com.dmh10s.minecraftexpansion.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class EnderOre extends BlockBase {
	public EnderOre(String name, Material material, SoundType sound, float hardness, float resistance, String tool, int level, float light)
	{
		super(name, material, sound, hardness, resistance, tool, level, light);
		setCreativeTab(ModItems.BLOCKS_TAB);
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Items.ENDER_PEARL;
    }
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		return rand.nextInt(3) + 2;
	}
}
