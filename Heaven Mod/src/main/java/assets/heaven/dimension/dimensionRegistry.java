package assets.heaven.dimension;

import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraftforge.common.DimensionManager;

public class dimensionRegistry {

	public static final int dimensionID = DimensionManager.getNextFreeDimId();
	
	public static void mainRegistry()
	{
		registerDimension();
	}
	
	public static void registerDimension()
	{
		DimensionManager.registerProviderType(dimensionID, WorldProviderHeaven.class, false);
		DimensionManager.registerDimension(dimensionID, dimensionID);
		
		MapGenStructureIO.registerStructure(StructureMineshaftStartHeaven.class, "Mineshaft Heaven");
		StructureMineshaftPiecesHeaven.registerStructurePieces();
	}
}