package com.bestwaifu.mcr.client.gui;

import com.bestwaifu.mcr.util.LangHelper;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiIngameMenu;
import net.minecraft.client.resources.I18n;

public class PauseScreen extends GuiIngameMenu {
	// TODO: Remove saving upon opening the menu.
	
	@Override
	public void initGui()
    {
		// Contains the buttons. Simply append to the button list to add one.
        this.buttonList.clear();
        byte b0 = -16;
        boolean flag = true;
        
        // TODO: Add save and quit dialogue
        // Default Quit Button
        this.buttonList.add(new GuiButton(1, this.width / 2 - 100, this.height / 4 + 120 + b0, LangHelper.translate("menu.returnToMenu", new Object[0])));

        if (!this.mc.isIntegratedServerRunning())
        {
            ((GuiButton)this.buttonList.get(0)).displayString = LangHelper.translate("menu.disconnect", new Object[0]);
        }
        
        this.buttonList.add(new GuiButton(4, this.width / 2 - 100, this.height / 4 + 24 + b0, LangHelper.translate("menu.returnToGame", new Object[0])));
        this.buttonList.add(new GuiButton(0, this.width / 2 - 100, this.height / 4 + 96 + b0, 98, 20, LangHelper.translate("menu.options", new Object[0])));
        this.buttonList.add(new GuiButton(12, this.width / 2 + 2, this.height / 4 + 96 + b0, 98, 20, "Mod Options..."));
        GuiButton guibutton;
        this.buttonList.add(guibutton = new GuiButton(7, this.width / 2 - 100, this.height / 4 + 72 + b0, 200, 20, LangHelper.translate("menu.shareToLan", new Object[0])));
        this.buttonList.add(new GuiButton(5, this.width / 2 - 100, this.height / 4 + 48 + b0, 98, 20, LangHelper.translate("gui.achievements", new Object[0])));
        this.buttonList.add(new GuiButton(6, this.width / 2 + 2, this.height / 4 + 48 + b0, 98, 20, LangHelper.translate("gui.stats", new Object[0])));
        guibutton.enabled = this.mc.isSingleplayer() && !this.mc.getIntegratedServer().getPublic();
    }
}
