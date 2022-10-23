package com.gmail.realtadukoo.MinecraftAPI.Bukkit;

import com.gmail.realtadukoo.MinecraftAPI.ConsoleManager;
import com.gmail.realtadukoo.MinecraftAPI.ConsolePriority;
import com.gmail.realtadukoo.MinecraftAPI.Message;

public class BukkitConsoleManager extends BukkitManager implements ConsoleManager{
	
	public BukkitConsoleManager(TadukooCorePlugin plugin){
		super(plugin);
	}
	
	@Override
	public void printMessage(ConsolePriority priority, Message message){
		String formattedMessage = formatMan.getFormattedMessage(message);
		plugin.getLogger().log(priority.getLogLevel(), formattedMessage);
	}
}
