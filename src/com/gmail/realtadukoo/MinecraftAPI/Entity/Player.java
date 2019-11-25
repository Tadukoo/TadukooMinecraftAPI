package com.gmail.realtadukoo.MinecraftAPI.Entity;

import java.util.UUID;

public class Player{
	
	public static class PlayerBuilder{
		private UUID UUID = null;
		private String name = null;
		
		private PlayerBuilder(){ }
		
		public PlayerBuilder UUID(UUID UUID){
			this.UUID = UUID;
			return this;
		}
		
		public PlayerBuilder name(String name){
			this.name = name;
			return this;
		}
		
		public Player build(){
			return new Player(UUID, name);
		}
	}
	
	private UUID UUID;
	private String name;
	
	private Player(UUID UUID, String name){
		this.UUID = UUID;
	}
	
	public static PlayerBuilder builder(){
		return new PlayerBuilder();
	}
	
	public UUID getUUID(){
		return UUID;
	}
	
	public String getName(){
		return name;
	}
}
