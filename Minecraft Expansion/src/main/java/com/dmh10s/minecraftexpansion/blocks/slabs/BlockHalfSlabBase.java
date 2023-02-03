package com.dmh10s.minecraftexpansion.blocks.slabs;

import com.dmh10s.minecraftexpansion.Main;
import com.dmh10s.minecraftexpansion.init.ModItems;
import com.dmh10s.minecraftexpansion.util.IHasModel;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;

public class BlockHalfSlabBase extends BlockSlabBase implements IHasModel
{
	public BlockHalfSlabBase(String name, Material material, BlockSlab half, BlockSlab doubleSlab, SoundType sound, float hardness, float resistance, String tool, int level, float light)
	{
		super(name, material, half);
		
		setSoundType(sound);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(tool, level);
		setLightLevel(light);
		setCreativeTab(ModItems.BLOCKS_TAB);
		ModItems.ITEMS.add(new ItemSlab(this, this, doubleSlab).setRegistryName(name));
	}
	
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	@Override
	public boolean isDouble() {
		// TODO Auto-generated method stub
		return false;
	}
}
