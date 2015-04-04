package com.heaven.blocks;

import com.heaven.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockHandler {

	public static Block SkyStone;
	
	public static void mainRegistry()
	{
		initializeBlock();
		registerBlock();
	}
	
	public static void initializeBlock()
	{
		SkyStone = new SkyStone(Material.rock).setBlockName("SkyStone").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":SkyStone");
	}
	public static void registerBlock()
	{
		GameRegistry.registerBlock(SkyStone, SkyStone.getUnlocalizedName());
	}
}