package com.gmail.realtadukoo.MinecraftAPI.Bukkit;

import org.bukkit.ChatColor;

import com.gmail.realtadukoo.MinecraftAPI.FormatManager;
import com.gmail.realtadukoo.MinecraftAPI.Message;
import com.gmail.realtadukoo.MinecraftAPI.MinecraftFormatting.Color;
import com.gmail.realtadukoo.MinecraftAPI.MinecraftFormatting.Format;

public class BukkitFormatManager implements FormatManager{
	
	public ChatColor toChatColor(Color color){
		return switch(color){
			case AQUA -> ChatColor.AQUA;
			case BLACK -> ChatColor.BLACK;
			case BLUE -> ChatColor.BLUE;
			case DARK_AQUA -> ChatColor.DARK_AQUA;
			case DARK_BLUE -> ChatColor.DARK_BLUE;
			case DARK_GRAY -> ChatColor.DARK_GRAY;
			case DARK_GREEN -> ChatColor.DARK_GREEN;
			case DARK_PURPLE -> ChatColor.DARK_PURPLE;
			case DARK_RED -> ChatColor.DARK_RED;
			case GOLD -> ChatColor.GOLD;
			case GRAY -> ChatColor.GRAY;
			case GREEN -> ChatColor.GREEN;
			case LIGHT_PURPLE -> ChatColor.LIGHT_PURPLE;
			case RED -> ChatColor.RED;
			case WHITE -> ChatColor.WHITE;
			case YELLOW -> ChatColor.YELLOW;
		};
	}
	
	public ChatColor toChatColor(Format format){
		return switch(format){
			case BOLD -> ChatColor.BOLD;
			case ITALIC -> ChatColor.ITALIC;
			case OBFUSCATED -> ChatColor.MAGIC;
			case RESET -> ChatColor.RESET;
			case STRIKETHROUGH -> ChatColor.STRIKETHROUGH;
			case UNDERLINE -> ChatColor.UNDERLINE;
		};
	}
	
	/** {@inheritDoc} */
	@Override
	public String getFormattedMessage(Message message){
		// Convert the formatting to Bukkit formatting
		StringBuilder formatting = new StringBuilder();
		formatting.append(toChatColor(message.getColor()));
		for(Format format: message.getOtherFormatting()){
			formatting.append(toChatColor(format));
		}
		
		// Return the formatted string
		return formatting + message.getMessage();
	}
}
