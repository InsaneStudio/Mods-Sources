package com.heaven.creativetabs;

import com.heaven.blocks.BlockHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBlocks extends CreativeTabs {

	public CreativeTabBlocks(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(BlockHandler.SkyStone);
	}

}
