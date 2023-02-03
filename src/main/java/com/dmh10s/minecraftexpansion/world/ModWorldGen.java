package com.dmh10s.minecraftexpansion.world;

import java.util.Random;

import com.dmh10s.minecraftexpansion.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkgenerator, IChunkProvider chunkprovider)
	{
		if (world.provider.getDimension() == 0)
		{
			generateOverworld(random, chunkX, chunkZ, world, chunkgenerator, chunkprovider);
		}
		if (world.provider.getDimension() == 1)
		{
			generateEnd(random, chunkX, chunkZ, world, chunkgenerator, chunkprovider);
		}
	}
	
	private void generateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkgenerator, IChunkProvider chunkprovider)
	{
		generateOverworldOre(ModBlocks.LEAD_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 5, 40, random.nextInt(9) + 1, 13);
		generateOverworldOre(ModBlocks.ALUMINUM_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 5, 45, random.nextInt(9) + 1, 15);
		generateOverworldOre(ModBlocks.FLINT_GRAVEL.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 5, 55, random.nextInt(9) + 1, 3);
		generateOverworldOre(ModBlocks.EXPERIENCE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 5, 55, random.nextInt(6) + 2, 25);
		generateOverworldOre(ModBlocks.FOSSILIZED_STONE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 5, 40, random.nextInt(21) + 4, 3);
		generateOverworldOre(ModBlocks.RHONDITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 5, 25, random.nextInt(7) + 1, 5);
		generateOverworldOre(ModBlocks.RUBY_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 5, 15, random.nextInt(7) + 1, 2);
	}
	
	private void generateNether(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkgenerator, IChunkProvider chunkprovider)
	{
		generateNetherOre(ModBlocks.NETHER_EXPERIENCE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 5, 128, random.nextInt(7) + 1, 35);
		generateNetherOre(ModBlocks.NETHER_GOLD_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 5, 128, random.nextInt(7) + 1, 20);
	}
	
	private void generateEnd(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkgenerator, IChunkProvider chunkprovider)
	{
		generateEndOre(ModBlocks.ENDER_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 5, 64, random.nextInt(5) + 1, 15);
	}
	
	private void generateOverworldOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances)
	{
		int deltaY = maxY - minY;
		
		for (int i=0; i < chances; i++)
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
	
	private void generateNetherOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances)
	{
		int deltaY = maxY - minY;
		
		for (int i=0; i < chances; i++)
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(Blocks.NETHERRACK));
			generator.generate(world, random, pos);
		}
	}
	
	private void generateEndOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances)
	{
		int deltaY = maxY - minY;
		
		for (int i=0; i < chances; i++)
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size, BlockMatcher.forBlock(Blocks.END_STONE));
			generator.generate(world, random, pos);
		}
	}
}
