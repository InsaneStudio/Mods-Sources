package com.heaven.Main;

import com.heaven.blocks.SkyStone;
import com.heaven.item.HeavenLightier;
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
		HeavenLightier.mainRegistry();
		SkyStone.mainRegistry();
		proxy.registerRenderInfo();
	}
	@EventHandler
	public static void load(FMLInitializationEvent PreEvent)
	{
		
	}
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PreEvent)
	{
		
	}
}
