package com.gmail.realtadukoo.MinecraftAPI;

import com.gmail.realtadukoo.MinecraftAPI.MinecraftFormatting.Color;
import com.gmail.realtadukoo.MinecraftAPI.MinecraftFormatting.Format;

public interface FormatManager{
	
	public String getFormattedMessage(Color color, Format[] otherFormatting, String message);
}
