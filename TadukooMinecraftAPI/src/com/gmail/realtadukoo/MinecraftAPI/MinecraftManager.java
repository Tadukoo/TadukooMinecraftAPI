package com.gmail.realtadukoo.MinecraftAPI;

import com.gmail.realtadukoo.MinecraftAPI.Entity.PlayerManager;

public abstract class MinecraftManager{
	// TODO: Eventually support multiple versions (not sure if multiple branches or in same branch)
	private static final String supportedMCVersion = "1.19.2";
	private final String MCVersion;
	
	private final FormatManager formatMan;
	private final ConsoleManager consoleMan;
	private final PlayerManager playerMan;
	
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
