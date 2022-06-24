package com.bestwaifu.mcr;

import com.bestwaifu.mcr.client.gui.event.PauseScreenHandler;
import com.bestwaifu.mcr.common.IProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = MCR.MODID, version = MCR.VERSION)
public class MCR
{
    public static final String MODID = "mcr";
    public static final String VERSION = "1.7.11";
    public static final String CLIENT = "com.bestwaifu.mcr.client.Client";
    public static final String SERVER = "com.bestwaifu.mcr.server.Server";
    
    @SidedProxy(clientSide = MCR.CLIENT, serverSide = MCR.SERVER)
    
    public static IProxy proxy;
    
    
    @EventHandler
    public void pre(FMLPreInitializationEvent event) 
    {
    	System.out.println("Common");
    	proxy.pre(event);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	System.out.println("Common");
    	proxy.init(event);
    }
    
    @EventHandler
    public void post(FMLPostInitializationEvent event) 
    {
    	System.out.println("Common");
    	proxy.post(event);
    }
}
