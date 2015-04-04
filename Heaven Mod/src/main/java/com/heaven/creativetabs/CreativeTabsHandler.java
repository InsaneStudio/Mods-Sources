package com.heaven.creativetabs;

import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabsHandler {

	public static CreativeTabs heavenBlocks;
	public static CreativeTabs heavenItems;
	
	public static void mainRegistry()
	{
		initializeTabs();
	}
	
	public static void initializeTabs()
	{
		heavenBlocks = new CreativeTabBlocks("HeavenBlocks");
		heavenItems = new CreativeTabItems("HeavenItems");
	}
}
