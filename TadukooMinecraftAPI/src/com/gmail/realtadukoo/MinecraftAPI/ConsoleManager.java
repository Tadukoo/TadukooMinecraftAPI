package com.gmail.realtadukoo.MinecraftAPI;

/**
 * A manager used for general console functions.
 * 
 * @author Logan Ferree (Tadukoo)
 * @version 0.1-Alpha1-SNAPSHOT
 */
public interface ConsoleManager{
	
	/**
	 * 
	 * 
	 * @param priority
	 * @param message
	 */
	public void printMessage(ConsolePriority priority, Message message);
}
