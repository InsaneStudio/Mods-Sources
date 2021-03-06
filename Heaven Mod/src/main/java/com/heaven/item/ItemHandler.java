package com.heaven.item;

import com.heaven.creativetabs.CreativeTabsHandler;
import com.heaven.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemHandler {

	public static void mainRegistry()
	{
		initializeItem();
		registerItem();
	}
	public static Item heavenLghtier;
	public static Item skyDust;
	
	public static void initializeItem()
	{
		heavenLghtier = new HeavenLighter().setCreativeTab(CreativeTabsHandler.heavenItems).setTextureName(RefStrings.MODID + ":heavenLighter");
		skyDust = new Item().setUnlocalizedName("skyDust").setCreativeTab(CreativeTabsHandler.heavenItems).setTextureName(RefStrings.MODID + ":skyDust");
	}
	public static void registerItem()
	{
		GameRegistry.registerItem(heavenLghtier, heavenLghtier.getUnlocalizedName());
		GameRegistry.registerItem(skyDust, skyDust.getUnlocalizedName());
	}
}
