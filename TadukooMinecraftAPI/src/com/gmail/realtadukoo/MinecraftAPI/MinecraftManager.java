package com.gmail.realtadukoo.MinecraftAPI;

import com.gmail.realtadukoo.MinecraftAPI.Entity.PlayerManager;

public abstract class MinecraftManager{
	// TODO: Eventually support multiple versions (not sure if multiple branches or in same branch)
	private static final String supportedMCVersion = "1.14.4";
	private String MCVersion;
	
	private FormatManager formatMan;
	private ConsoleManager consoleMan;
	private PlayerManager playerMan;
	
	public MinecraftManager(String MCVersion, FormatManager formatMan, ConsoleManager consoleMan, PlayerManager playerMan){
		this.MCVersion = MCVersion;
		this.formatMan = formatMan;
		this.consoleMan = consoleMan;
		this.playerMan = playerMan;
	}
	
	public String getSupportedMCVersion(){
		return supportedMCVersion;
	}
	
	public String getMCVersion(){
		return MCVersion;
	}
	
	public FormatManager getFormatMan(){
		return formatMan;
	}
	
	public ConsoleManager getConsoleMan(){
		return consoleMan;
	}
	
	public PlayerManager getPlayerMan(){
		return playerMan;
	}
}
