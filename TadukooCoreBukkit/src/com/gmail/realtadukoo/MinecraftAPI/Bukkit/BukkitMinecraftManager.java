package com.gmail.realtadukoo.MinecraftAPI.Bukkit;

import com.gmail.realtadukoo.MinecraftAPI.MinecraftManager;

public class BukkitMinecraftManager extends MinecraftManager{
	private static final String MCVersion = "1.19.2";
	
	public BukkitMinecraftManager(TadukooCorePlugin plugin){
		super(MCVersion, new BukkitFormatManager(), new BukkitConsoleManager(plugin), new BukkitPlayerManager(plugin));
	}
	
}
