package com.heaven.blocks;

import com.heaven.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SkyStone {

	public static void mainRegistry()
	{
		initializeBlock();
		registerBlock();
	}
	public static Block sStone;
	
	public static void initializeBlock()
	{
		sStone = new sStone(Material.iron).setBlockName("sStone").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":sStone");
	}
	public static void registerBlock()
	{
		GameRegistry.registerBlock(sStone, sStone.getUnlocalizedName());
	}
}