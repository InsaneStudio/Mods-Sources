package com.heaven.creativetabs;

import com.heaven.item.ItemHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabItems extends CreativeTabs {

	public CreativeTabItems(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return ItemHandler.skyDust;
	}

}
