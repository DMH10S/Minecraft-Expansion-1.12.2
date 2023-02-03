package com.dmh10s.minecraftexpansion.init;

import java.util.ArrayList;
import java.util.List;

import com.dmh10s.minecraftexpansion.blocks.BarbedWire;
import com.dmh10s.minecraftexpansion.blocks.BlockBase;
import com.dmh10s.minecraftexpansion.blocks.EnderOre;
import com.dmh10s.minecraftexpansion.blocks.ExperienceOre;
import com.dmh10s.minecraftexpansion.blocks.FallingBlockBase;
import com.dmh10s.minecraftexpansion.blocks.FlintGravel;
import com.dmh10s.minecraftexpansion.blocks.FossilizedStone;
import com.dmh10s.minecraftexpansion.blocks.NetherExperienceOre;
import com.dmh10s.minecraftexpansion.blocks.NetherGoldOre;
import com.dmh10s.minecraftexpansion.blocks.RhonditeOre;
import com.dmh10s.minecraftexpansion.blocks.RubyOre;
import com.dmh10s.minecraftexpansion.blocks.coke_furnace.BlockCokeFurnace;
import com.dmh10s.minecraftexpansion.blocks.crops.BlockCrop;
import com.dmh10s.minecraftexpansion.blocks.foundry.BlockFoundry;
import com.dmh10s.minecraftexpansion.blocks.slabs.BlockDoubleSlabBase;
import com.dmh10s.minecraftexpansion.blocks.slabs.BlockHalfSlabBase;
import com.dmh10s.minecraftexpansion.blocks.stairs.BlockStairBase;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

public class ModBlocks
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block ALUMINUM_BLOCK = new BlockBase("aluminum_block", Material.IRON, SoundType.METAL, 5.5F, 7.0F, "pickaxe", 1, 0);
	public static final Block BARBED_WIRE = new BarbedWire("barbed_wire", Material.IRON, SoundType.METAL, 5.5F, 7.0F, "pickaxe", 0, 0);
	public static final Block HARDENED_COBBLESTONE = new BlockBase("hardened_cobblestone", Material.ROCK, SoundType.STONE, 10.0F, 50.0F, "pickaxe", 1, 0);
	public static final Block HARDENED_QUARTZ = new BlockBase("hardened_quartz", Material.IRON, SoundType.METAL, 10.0F, 50.0F, "pickaxe", 1, 0);
	public static final Block HARDENED_STONE = new BlockBase("hardened_stone", Material.ROCK, SoundType.STONE, 10.0F, 50.0F, "pickaxe", 1, 0);
	public static final Block LEAD_BLOCK = new FallingBlockBase("lead_block", Material.IRON, SoundType.METAL, 5.5F, 7.0F, "pickaxe", 1, 0);
	public static final Block RHONDITE_BLOCK = new BlockBase("rhondite_block", Material.IRON, SoundType.METAL, 5.5F, 7.0F, "pickaxe", 1, 0);
	public static final Block RUBY_BLOCK = new BlockBase("ruby_block", Material.IRON, SoundType.METAL, 5.5F, 7.0F, "pickaxe", 1, 0);
	
	//Ores
	public static final Block ALUMINUM_ORE = new BlockBase("aluminum_ore", Material.ROCK, SoundType.STONE, 3.0F, 3.0F, "pickaxe", 1, 0);
	public static final Block ENDER_ORE = new EnderOre("ender_ore", Material.ROCK, SoundType.STONE, 3.0F, 3.0F, "pickaxe", 1, 0);
	public static final Block EXPERIENCE_ORE = new ExperienceOre("experience_ore", Material.ROCK, SoundType.STONE, 2.0F, 3.0F, "pickaxe", 0, 3.0F);
	public static final Block FLINT_GRAVEL = new FlintGravel("flint_gravel", Material.GROUND, SoundType.GROUND, 0.6F, 0.6F, "shovel", 0, 0);
	public static final Block FOSSILIZED_STONE = new FossilizedStone("fossilized_stone", Material.ROCK, SoundType.STONE, 3.0F, 3.0F, "pickaxe", 0, 0);
	public static final Block LEAD_ORE = new BlockBase("lead_ore", Material.ROCK, SoundType.STONE, 3.0F, 3.0F, "pickaxe", 1, 0);
	public static final Block NETHER_EXPERIENCE_ORE = new NetherExperienceOre("nether_experience_ore", Material.ROCK, SoundType.STONE, 1.5F, 3.0F, "pickaxe", 0, 0);
	public static final Block NETHER_GOLD_ORE = new NetherGoldOre("nether_gold_ore", Material.ROCK, SoundType.STONE, 3.0F, 3.0F, "pickaxe", 1, 0);
	public static final Block RHONDITE_ORE = new RhonditeOre("rhondite_ore", Material.ROCK, SoundType.STONE, 3.0F, 3.0F, "pickaxe", 2, 0);
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK, SoundType.STONE, 4.0F, 5.0F, "pickaxe", 3, 0);
	
	//Crops
	public static final Block CABBAGE_CROP = new BlockCrop("cabbage_crop", SoundType.PLANT, 0.0F);
	
	//Furnaces
	public static final Block COKE_FURNACE = new BlockCokeFurnace("coke_furnace", Material.ROCK, SoundType.STONE, 5.5F, 7.0F, "pickaxe", 0, 0);
	public static final Block FOUNDRY = new BlockFoundry("foundry", Material.ROCK, SoundType.STONE, 5.5F, 7.0F, "pickaxe", 0, 0);
	
	//Stairs
	public static final Block STONE_STAIRS = new BlockStairBase("stone_stairs", Blocks.STONE.getDefaultState(), SoundType.STONE, 3.0F, 3.0F, "pickaxe", 0, 0);
	public static final Block OBSIDIAN_STAIRS = new BlockStairBase("obsidian_stairs", Blocks.STONE.getDefaultState(), SoundType.STONE, 50.0F, 1200.0F, "pickaxe", 3, 0);
	
	//Slabs
	public static final BlockSlab OBSIDIAN_SLAB_DOUBLE = new BlockDoubleSlabBase("obsidian_slab_double", Material.ROCK, ModBlocks.OBSIDIAN_SLAB_HALF, SoundType.STONE, 50.0F, 1200.0F, "pickaxe", 3, 0);
	public static final BlockSlab OBSIDIAN_SLAB_HALF = new BlockHalfSlabBase("obsidian_slab_half", Material.ROCK, ModBlocks.OBSIDIAN_SLAB_HALF, ModBlocks.OBSIDIAN_SLAB_DOUBLE, SoundType.STONE, 50.0F, 1200.0F, "pickaxe", 3, 0);
	
}
