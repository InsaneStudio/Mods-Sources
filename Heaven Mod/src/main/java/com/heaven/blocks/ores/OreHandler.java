package com.heaven.blocks.ores;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class OreHandler {
	
	public static void mainRegistry()
	{
		initializeOreGen();
	}
	
	public static void initializeOreGen()
	{
		registerOreGen(new SkyStoneGenerator(), 1);
	}
	
	public static void registerOreGen(IWorldGenerator SkyStoneGen, int weightedPropabilty)
	{
		GameRegistry.registerWorldGenerator(SkyStoneGen, weightedPropabilty);
	}
}
