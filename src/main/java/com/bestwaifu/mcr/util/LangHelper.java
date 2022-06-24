package com.bestwaifu.mcr.util;

import net.minecraft.client.resources.I18n;

public class LangHelper {
	public static String translate(String key, Object obj) 
	{
		// Basically just makes it clearer what it does.
		return(I18n.format(key, obj));
	}

}
