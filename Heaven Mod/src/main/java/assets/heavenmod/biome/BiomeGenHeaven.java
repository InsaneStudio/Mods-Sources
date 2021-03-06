package assets.heavenmod.biome;

import com.heaven.blocks.BlockHandler;

import net.minecraft.entity.passive.EntityBat;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenHeaven extends BiomeGenBase {

	public BiomeGenHeaven(int id) {
		super(id);
		
		this.theBiomeDecorator.treesPerChunk = 2;
		this.theBiomeDecorator.grassPerChunk = 3;
		
		this.spawnableCreatureList.add(new SpawnListEntry(EntityBat.class, 5, 2, 10));
		
		this.topBlock = Blocks.grass;
		this.fillerBlock = BlockHandler.SkyStone;
	}
}