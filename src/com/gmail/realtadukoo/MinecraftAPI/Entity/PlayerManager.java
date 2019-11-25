package com.gmail.realtadukoo.MinecraftAPI.Entity;

import java.util.UUID;

import com.gmail.realtadukoo.MinecraftAPI.MinecraftFormatting.Color;
import com.gmail.realtadukoo.MinecraftAPI.MinecraftFormatting.Format;

public interface PlayerManager{
	
	public Player getPlayerFromName(String name);
	
	public Player getPlayerFromUUID(UUID UUID);
	
	public default void sendMessage(Player player, Color color, String message){
		sendMessage(player, color, new Format[0], message);
	}
	
	public void sendMessage(Player player, Color color, Format[] otherFormatting, String message);
	
	public boolean hasPermission(Player player, String permission);
}
