package assets.heaven.dimension;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import assets.heavenmod.biome.BiomeGenHeaven;
import assets.heavenmod.biome.BiomeRegistry;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.Vec3;
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
	public boolean isSurfaceWorld()
	{
		return false;
	}
	
	
	@Override
	public IChunkProvider createChunkGenerator()
	{
		return new ChunkProviderHeaven(worldObj, worldObj.getSeed(), true);
	}
	
    @SideOnly(Side.CLIENT)
    public float getCloudHeight()
    {
        return -1.0F;
    }
    
    @SideOnly(Side.CLIENT)
    public Vec3 getFogColor(float p_76562_1_, float p_76562_2_)
    {
        return Vec3.createVectorHelper(0.10000000298023224D, 0.019999999329447746D, 0.029999999329447746D);
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