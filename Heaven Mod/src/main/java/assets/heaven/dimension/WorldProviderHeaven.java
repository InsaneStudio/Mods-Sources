package assets.heaven.dimension;

import assets.heavenmod.biome.BiomeRegistry;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderHeaven extends WorldProvider {

	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeRegistry.biomeHeaven, 0.21F);
		this.dimensionId = dimensionRegistry.dimensionID;
	}
	
	public IChunkProvider createChunkGenaration()
	{
		return ChunkProviderHeaven(worldObj, worldObj.getSeed(), true);
	}
	
	@Override
	public String getDimensionName() {
		
		return "Heaven";
	}

}