package com.gmail.realtadukoo.MinecraftAPI.Bukkit;

import org.bukkit.ChatColor;

import com.gmail.realtadukoo.MinecraftAPI.FormatManager;
import com.gmail.realtadukoo.MinecraftAPI.Message;
import com.gmail.realtadukoo.MinecraftAPI.MinecraftFormatting.Color;
import com.gmail.realtadukoo.MinecraftAPI.MinecraftFormatting.Format;

public class BukkitFormatManager implements FormatManager{
	
	public ChatColor toChatColor(Color color){
		switch(color){
			case AQUA:
				return ChatColor.AQUA;
			case BLACK:
				return ChatColor.BLACK;
			case BLUE:
				return ChatColor.BLUE;
			case DARK_AQUA:
				return ChatColor.DARK_AQUA;
			case DARK_BLUE:
				return ChatColor.DARK_BLUE;
			case DARK_GRAY:
				return ChatColor.DARK_GRAY;
			case DARK_GREEN:
				return ChatColor.DARK_GREEN;
			case DARK_PURPLE:
				return ChatColor.DARK_PURPLE;
			case DARK_RED:
				return ChatColor.DARK_RED;
			case GOLD:
				return ChatColor.GOLD;
			case GRAY:
				return ChatColor.GRAY;
			case GREEN:
				return ChatColor.GREEN;
			case LIGHT_PURPLE:
				return ChatColor.LIGHT_PURPLE;
			case RED:
				return ChatColor.RED;
			case WHITE:
				return ChatColor.WHITE;
			case YELLOW:
				return ChatColor.YELLOW;
			default:
				return null;
		}
	}
	
	public ChatColor toChatColor(Format format){
		switch(format){
			case BOLD:
				return ChatColor.BOLD;
			case ITALIC:
				return ChatColor.ITALIC;
			case OBFUSCATED:
				return ChatColor.MAGIC;
			case RESET:
				return ChatColor.RESET;
			case STRIKETHROUGH:
				return ChatColor.STRIKETHROUGH;
			case UNDERLINE:
				return ChatColor.UNDERLINE;
			default:
				return null;
		}
	}

	@Override
	public String getFormattedMessage(Message message){
		// Convert the formatting to Bukkit formatting
		String formatting = "";
		formatting += toChatColor(message.getColor());
		for(Format format: message.getOtherFormatting()){
			formatting += toChatColor(format);
		}
		
		// Return the formatted string
		return formatting + message.getMessage();
	}
}
