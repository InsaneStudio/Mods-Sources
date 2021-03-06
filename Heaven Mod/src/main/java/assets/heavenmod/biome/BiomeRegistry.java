package assets.heavenmod.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {

	public static void mainRegistry()
	{
		initializeBiome();
		registerBiome();
	}
	
	public static BiomeGenBase biomeHeaven;
	
	public static void initializeBiome()
	{
	
		biomeHeaven = new BiomeGenHeaven(137).setBiomeName("Heaven");
		
	}
	
	public static void registerBiome()
	{
	
		BiomeDictionary.registerBiomeType(biomeHeaven, Type.FOREST);
		BiomeManager.addSpawnBiome(biomeHeaven);
	}
}

