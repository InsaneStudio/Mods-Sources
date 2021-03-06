package assets.heavenmod.biome;

import net.minecraft.world.WorldType;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerBiomeEdge;
import net.minecraft.world.gen.layer.GenLayerZoom;

public class WorldTypeHeaven extends WorldType{

	public WorldTypeHeaven(int par1, String name) {
		super(name);
	}
	public GenLayer getBiomeLayer(long worldSeed, GenLayer parentLayer)
	{
	GenLayer ret = new HeavenGenLayerBiome(200L, parentLayer, this);
	ret = GenLayerZoom.magnify(100L, ret, 2);
	ret = new GenLayerBiomeEdge(1000L, ret);
	return ret;
	}
}
	