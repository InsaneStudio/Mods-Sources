package com.heaven.blocks.ores;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.heaven.blocks.BlockHandler;

import cpw.mods.fml.common.IWorldGenerator;


public class SkyStoneGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId)
		{
		case -1:
			generateNether(world, random, chunkX*16, chunkZ*16);
			break;
		case 0: 
			generateSurface(world, random, chunkX*16, chunkZ*16);
			break;
		}
	}

	private void AddOre(Block block,Block blockspawn, Random random, World world, int chunkX , int chunkZ, int minYcoords, int maxYcoords, int minVien, int maxVien, int spawnChance)
	{
		for(int i = 0; i < spawnChance; i++)
		{		
			int xPos = chunkX + random.nextInt(16);
			int yPos = minYcoords + random.nextInt(maxYcoords - minYcoords);
			int zPos = chunkZ + random.nextInt(16);
			
			new WorldGenMinable(block, minVien + random.nextInt(maxVien - minVien), blockspawn).generate(world, random, xPos, yPos, zPos);
		}
	}
	
	private void generateNether(World world, Random random, int chunkX, int chunkZ) 
	{
		AddOre(BlockHandler.SkyStone, Blocks.netherrack, random, world, chunkX, chunkZ, 5, 256, 5, 7, 2);
	}

	private void generateSurface(World world, Random random, int chunkX, int chunkZ)
	{
		
	}
}
