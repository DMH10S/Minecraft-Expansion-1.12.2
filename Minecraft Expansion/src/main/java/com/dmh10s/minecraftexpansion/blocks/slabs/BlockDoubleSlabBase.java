package com.dmh10s.minecraftexpansion.blocks.slabs;

import com.dmh10s.minecraftexpansion.init.ModItems;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemSlab;

public class BlockDoubleSlabBase extends BlockSlabBase {
	public BlockDoubleSlabBase(String name, Material material, BlockSlab half, SoundType sound, float hardness, float resistance, String tool, int level, float light) {
		super(name, material, half);
		
		setSoundType(sound);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(tool, level);
		setLightLevel(light);
	}
	
	@Override
	public boolean isDouble() {
		// TODO Auto-generated method stub
		return true;
	}
}
