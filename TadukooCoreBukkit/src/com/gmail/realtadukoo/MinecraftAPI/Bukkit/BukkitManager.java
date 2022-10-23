package com.gmail.realtadukoo.MinecraftAPI.Bukkit;

public abstract class BukkitManager{
	protected TadukooCorePlugin plugin;
	protected BukkitFormatManager formatMan;
	
	public BukkitManager(TadukooCorePlugin plugin){
		formatMan = new BukkitFormatManager();
	}
}
