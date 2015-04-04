package assets.heaven.dimension;

import net.minecraftforge.common.DimensionManager;

public class dimensionRegistry {

	public static final int dimensionID = 8;
	
	public static void mainRegistry()
	{
		registerDimension();
	}
	
	public static void registerDimension()
	{
		DimensionManager.registerProviderType(dimensionID, WorldProviderHeaven.class, false);
		DimensionManager.registerDimension(dimensionID, dimensionID);
	}
}