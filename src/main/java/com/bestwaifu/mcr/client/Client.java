package com.bestwaifu.mcr.client;

import com.bestwaifu.mcr.client.gui.event.PauseScreenHandler;
import com.bestwaifu.mcr.common.IProxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventBus;
import net.minecraftforge.common.MinecraftForge;

public class Client implements IProxy {

	@Override
	public void pre(FMLPreInitializationEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.description());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.description());
		
		// Events
    	MinecraftForge.EVENT_BUS.register(new PauseScreenHandler());
	}

	@Override
	public void post(FMLPostInitializationEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.description());
	}
	
}
