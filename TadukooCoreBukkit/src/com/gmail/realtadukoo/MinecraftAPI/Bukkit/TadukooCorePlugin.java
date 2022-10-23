package com.gmail.realtadukoo.MinecraftAPI.Bukkit;

import org.bukkit.plugin.java.JavaPlugin;

public abstract class TadukooCorePlugin extends JavaPlugin{
	private BukkitMinecraftManager minecraftMan;
	
	@Override
	public void onEnable(){
		minecraftMan = new BukkitMinecraftManager(this);
	}
	
	protected BukkitMinecraftManager getMinecraftMan(){
		return minecraftMan;
	}
}
