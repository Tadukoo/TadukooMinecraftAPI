package com.gmail.realtadukoo.MinecraftAPI.Entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Player object used for storing general player information.
 * 
 * @author Logan Ferree (Tadukoo)
 * @version 0.1-Alpha-SNAPSHOT
 */
public class Player{
	
	/**
	 * Builder for constructing a {@link Player} object.
	 * <br><br>
	 * <b>MUST</b> specify the following:
	 * <ul>
	 * <li>name</li>
	 * </ul>
	 * Defaults are:
	 * <ul>
	 * <li>UUID - null (for fake players to be created)</li>
	 * </ul>
	 * 
	 * @author Logan Ferree (Tadukoo)
	 * @version Alpha v.0.1
	 */
	public static class PlayerBuilder{
		private UUID UUID = null;
		private String name = null;
		
		private PlayerBuilder(){ }
		
		/**
		 * Sets the UUID to be used on the {@link Player} object
		 * 
		 * @param UUID The UUID for the Player object
		 */
		public PlayerBuilder UUID(UUID UUID){
			this.UUID = UUID;
			return this;
		}
		
		/**
		 * Sets the name to be used on the {@link Player} object
		 * 
		 * @param name The name for the Player object
		 */
		public PlayerBuilder name(String name){
			this.name = name;
			return this;
		}
		
		/**
		 * Checks for errors with the current settings for the {@link Player} object
		 */
		private void checkForErrors(){
			List<String> errors = new ArrayList<String>();
			
			// Name is required
			if(name == null){
				errors.add("Name must be specified");
			}
			
			if(!errors.isEmpty()){
				throw new IllegalArgumentException("Failed to create Player object: " + errors.toString());
			}
		}
		
		/**
		 * Builds the Player object based on the input data if it's valid.
		 * 
		 * @return The built Player object
		 */
		public Player build(){
			checkForErrors();
			
			return new Player(UUID, name);
		}
	}
	
	/** The UUID of the Player */
	private UUID UUID;
	/** The Name of the Player */
	private String name;
	
	/**
	 * Constructs a Player object with the given UUID and name.
	 * 
	 * @param UUID The UUID of the Player
	 * @param name The name of the Player
	 */
	private Player(UUID UUID, String name){
		this.UUID = UUID;
	}
	
	/**
	 * Constructs a {@link PlayerBuilder} to create a Player object.
	 * 
	 * @return A new PlayerBuilder
	 */
	public static PlayerBuilder builder(){
		return new PlayerBuilder();
	}
	
	/**
	 * @return The UUID of the Player
	 */
	public UUID getUUID(){
		return UUID;
	}
	
	/**
	 * @return The Name of the Player
	 */
	public String getName(){
		return name;
	}
}
