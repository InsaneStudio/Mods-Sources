package com.heaven.Main;

import net.minecraft.world.WorldType;
import assets.heaven.dimension.dimensionRegistry;
import assets.heavenmod.biome.BiomeRegistry;
import assets.heavenmod.biome.WorldTypeHeaven;

import com.heaven.blocks.BlockHandler;
import com.heaven.blocks.ores.OreHandler;
import com.heaven.creativetabs.CreativeTabsHandler;
import com.heaven.item.ItemHandler;
import com.heaven.lib.RefStrings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry {

	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	{
		
	}
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent)
	{
		CreativeTabsHandler.mainRegistry();
		ItemHandler.mainRegistry();
		BlockHandler.mainRegistry();
		OreHandler.mainRegistry();
		CraftingMenager.mainRegistry();
		BiomeRegistry.mainRegistry();
		dimensionRegistry.mainRegistry();
		proxy.registerRenderInfo();
	}
	@EventHandler
	public static void load(FMLInitializationEvent PreEvent)
	{
		
	}
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PreEvent)
	{
		WorldType HEAVEN = new WorldTypeHeaven(3, "heaven");
	}
}
