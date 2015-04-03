package com.heaven.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class HeavenLightier {

	public static void mainRegistry()
	{
		initializeItem();
		registerItem();
	}
	public static Item heavenLightier;
	
	public static void initializeItem()
	{
		heavenLightier = new Item().setUnlocalizedName("heavenLighiter").setCreativeTab(CreativeTabs.tabMisc);
	}
	public static void registerItem()
	{
		GameRegistry.registerItem(heavenLightier, heavenLightier.getUnlocalizedName());
	}
}
