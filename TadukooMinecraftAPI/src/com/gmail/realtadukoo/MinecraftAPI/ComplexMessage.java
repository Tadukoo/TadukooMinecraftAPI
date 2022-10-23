package com.gmail.realtadukoo.MinecraftAPI;

import java.util.List;

public class ComplexMessage{
	
	public static class ComplexMessageBuilder{
		private List<Message> messagePieces;
		
		private ComplexMessageBuilder(){ }
		
		
		public ComplexMessage build(){
			return new ComplexMessage(messagePieces);
		}
	}
	
	private final List<Message> messagePieces;
	
	private ComplexMessage(List<Message> messagePieces){
		this.messagePieces = messagePieces;
	}
	
	public static ComplexMessageBuilder builder(){
		return new ComplexMessageBuilder();
	}
	
	public List<Message> getMessagePieces(){
		return messagePieces;
	}
}
