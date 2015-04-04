package com.heaven.Main;

import com.heaven.blocks.BlockHandler;
import com.heaven.item.ItemHandler;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingMenager {

	public static void mainRegistry()
	{
		addCraftingRecipe();
		addSmeltingRecipe();
	}
	
	public static void addCraftingRecipe()
	{
		//Shaped
		GameRegistry.addRecipe(new ItemStack(BlockHandler.SkyStone), new Object[]{"XXX","XXX","XXX", 'X', ItemHandler.skyDust});;
		//Shapeless
		//TODO Heaven Lighter Recipe!
	}
	
	public static void addSmeltingRecipe()
	{
		//TODO Nothing
	}
}
