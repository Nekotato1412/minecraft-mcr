package com.bestwaifu.mcr.client.gui.event;

import com.bestwaifu.mcr.client.gui.PauseScreen;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraftforge.client.event.GuiOpenEvent;


public class PauseScreenHandler {
	@SubscribeEvent
	public void onScreenOpened(GuiOpenEvent event) 
	{
		if (event.gui instanceof GuiIngameMenu) {
			event.gui = new PauseScreen();
		}
	}
}
