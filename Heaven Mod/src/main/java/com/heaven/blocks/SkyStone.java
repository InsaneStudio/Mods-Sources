package com.heaven.blocks;

import java.util.Random;

import com.heaven.item.ItemHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class SkyStone extends Block 
{

	public SkyStone(Material p_i45394_1_) {
		super(p_i45394_1_);
		setHarvestLevel("pickaxe", 1);
		setHardness(0.75F);
	}
	
	public int quantityDropped(Random rand)
	{
		return 1;
	}
	
	public Item getItemDropped(int i, Random rand, int j)
	{
		return ItemHandler.skyDust;
	}
}

