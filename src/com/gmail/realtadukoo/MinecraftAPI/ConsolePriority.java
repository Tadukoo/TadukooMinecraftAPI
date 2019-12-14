package com.gmail.realtadukoo.MinecraftAPI;

import java.util.logging.Level;

public enum ConsolePriority{
	ALL(Level.ALL),
	SEVERE(Level.SEVERE),
	WARNING(Level.WARNING),
	INFO(Level.INFO),
	CONFIG(Level.CONFIG),
	FINE(Level.FINE),
	FINER(Level.FINER),
	FINEST(Level.FINEST);
	
	private Level logLevel;
	
	private ConsolePriority(Level logLevel){
		this.logLevel = logLevel;
	}
	
	public Level getLogLevel(){
		return logLevel;
	}
}
