package assets.heaven.dimension;

import assets.heavenmod.biome.BiomeGenHeaven;
import assets.heavenmod.biome.BiomeRegistry;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderHeaven extends WorldProvider 
{
	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeRegistry.biomeHeaven, 0.1F);
		this.dimensionId = dimensionRegistry.dimensionID;
	}

	@Override
	public String getSaveFolder()
	{
		return "DIM-G&G";
	}

	@Override
	public String getWelcomeMessage()
	{
		return "Entering The Heaven";
	}

	@Override
	public String getDepartMessage()
	{
		return "Leaving The Heaven";
	}

	@Override
	public boolean canRespawnHere()
	{
		return true;
	}

	@Override
	public IChunkProvider createChunkGenerator()
	{
		return new ChunkProviderHeaven(worldObj, worldObj.getSeed(), true);
	}

	@Override
	public String getDimensionName()
	{
		return "Heaven";
	}

	/**
	* Gets the hard-coded portal location to use when entering this dimension.
	*/
	@Override
	public ChunkCoordinates getEntrancePortalLocation()
	{
		return null;
	}

	@Override
	public boolean canDoLightning(Chunk chunk)
	{
		return true;
	}

	@Override
	public boolean canDoRainSnowIce(Chunk chunk)
	{
		return true;
	}
}