package com.bestwaifu.mcr.common;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public interface IProxy {
	public void pre(FMLPreInitializationEvent event);

    public void init(FMLInitializationEvent event);
    
    public void post(FMLPostInitializationEvent event);

}
