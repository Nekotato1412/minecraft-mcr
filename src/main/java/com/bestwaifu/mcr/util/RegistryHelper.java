package com.bestwaifu.mcr.util;

import com.bestwaifu.mcr.MCR;

import net.minecraft.item.Item;

public class RegistryHelper {
	
	public static String namespace() {
		return MCR.MODID + ":";
	}
	
	public static Item setItemName(Item item, String name) 
	{
		item.setUnlocalizedName(namespace() + name).setTextureName(namespace() + name);
		return item;
	}
	
	public static Item nameAsVanilla(Item item, String name) 
	{
		item.setUnlocalizedName("minecraft:" + name).setTextureName("minecraft:" + name);
		return item;
	}
}
