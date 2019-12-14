package com.gmail.realtadukoo.MinecraftAPI.Entity;

import java.util.UUID;

import com.gmail.realtadukoo.MinecraftAPI.Message;

/**
 * A manager used for general {@link Player} functions.
 * 
 * @author Logan Ferree (Tadukoo)
 * @version 0.1-Alpha-SNAPSHOT
 */
public interface PlayerManager{
	
	/**
	 * Retrieves a {@link Player} based on their name.
	 * 
	 * @param name The name of the Player
	 * @return The Player with the given name
	 */
	public Player getPlayerFromName(String name);
	
	/**
	 * Retrieves a {@link Player} based on their UUID.
	 * 
	 * @param UUID The UUID of the Player
	 * @return The Player with the given UUID
	 */
	public Player getPlayerFromUUID(UUID UUID);
	
	/**
	 * Sends a message to the given {@link Player}.
	 * 
	 * @param player The Player to send a message to
	 * @param message The message to send to the Player
	 */
	public void sendMessage(Player player, Message message);
	
	/**
	 * Checks if the given {@link Player} has the given permission or not.
	 * 
	 * @param player The Player to check permissions of
	 * @param permission The permission string to check for the Player
	 * @return Whether the Player has the permission or not
	 */
	public boolean hasPermission(Player player, String permission);
}
