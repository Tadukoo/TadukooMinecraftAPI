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
	
	/** {@inheritDoc} */
	@Override
	public Player getPlayerFromName(String name){
		org.bukkit.entity.Player bukkitPlayer = plugin.getServer().getPlayer(name);
		// Null check for player
		if(bukkitPlayer == null){
			return null;
		}
		return toAPIPlayer(bukkitPlayer);
	}
	
	/** {@inheritDoc} */
	@Override
	public Player getPlayerFromUUID(UUID UUID){
		org.bukkit.entity.Player bukkitPlayer = plugin.getServer().getPlayer(UUID);
		// Null check for player
		if(bukkitPlayer == null){
			return null;
		}
		return toAPIPlayer(bukkitPlayer);
	}
	
	/** {@inheritDoc} */
	@Override
	public void sendMessage(Player player, Message message){
		// Send the formatted message to the player
		String formattedMessage = formatMan.getFormattedMessage(message);
		toBukkitPlayer(player).sendMessage(formattedMessage);
	}
	
	/** {@inheritDoc} */
	@Override
	public boolean hasPermission(Player player, String permission){
		return toBukkitPlayer(player).hasPermission(permission);
	}
}
