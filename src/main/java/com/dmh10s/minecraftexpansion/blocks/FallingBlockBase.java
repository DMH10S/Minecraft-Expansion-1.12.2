package com.dmh10s.minecraftexpansion.blocks;

import com.dmh10s.minecraftexpansion.Main;
import com.dmh10s.minecraftexpansion.init.ModBlocks;
import com.dmh10s.minecraftexpansion.init.ModItems;
import com.dmh10s.minecraftexpansion.util.IHasModel;

import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class FallingBlockBase extends BlockFalling implements IHasModel
{
	public FallingBlockBase(String name, Material material, SoundType sound, float hardness, float resistance, String tool, int level, float light)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(sound);
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel(tool, level);
		setLightLevel(light);
		setCreativeTab(ModItems.BLOCKS_TAB);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
