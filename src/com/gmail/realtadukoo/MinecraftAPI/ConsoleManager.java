package com.gmail.realtadukoo.MinecraftAPI;

import com.gmail.realtadukoo.MinecraftAPI.MinecraftFormatting.Color;
import com.gmail.realtadukoo.MinecraftAPI.MinecraftFormatting.Format;

public interface ConsoleManager{
	
	public void printMessage(String priority, Color color, Format[] otherFormatting, String message);
}
