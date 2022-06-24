package com.bestwaifu.mcr.server;

import com.bestwaifu.mcr.common.IProxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Server implements IProxy {

	@Override
	public void pre(FMLPreInitializationEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.description());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.description());
	}

	@Override
	public void post(FMLPostInitializationEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.description());
	}
	
}
