package com.gmail.realtadukoo.MinecraftAPI.Bukkit;

import java.util.UUID;

import com.gmail.realtadukoo.MinecraftAPI.Message;
import com.gmail.realtadukoo.MinecraftAPI.Entity.Player;
import com.gmail.realtadukoo.MinecraftAPI.Entity.PlayerManager;

public class BukkitPlayerManager extends BukkitManager implements PlayerManager{
	
	public BukkitPlayerManager(TadukooCorePlugin plugin){
		super(plugin);
	}
	
	public org.bukkit.entity.Player toBukkitPlayer(Player player){
		return plugin.getServer().getPlayer(player.getUUID());
	}
	
	public Player toAPIPlayer(org.bukkit.entity.Player player){
		return Player.builder()
						.name(player.getName())
						.UUID(player.getUniqueId())
						.build();
	}
	
	@Override
	public Player getPlayerFromName(String name){
		return toAPIPlayer(plugin.getServer().getPlayer(name));
	}
	
	@Override
	public Player getPlayerFromUUID(UUID UUID){
		return toAPIPlayer(plugin.getServer().getPlayer(UUID));
	}
	
	@Override
	public void sendMessage(Player player, Message message){
		// Send the formatted message to the player
		String formattedMessage = formatMan.getFormattedMessage(message);
		toBukkitPlayer(player).sendMessage(formattedMessage);
	}
	
	@Override
	public boolean hasPermission(Player player, String permission){
		return toBukkitPlayer(player).hasPermission(permission);
	}
}
