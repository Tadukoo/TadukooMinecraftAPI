package com.gmail.realtadukoo.MinecraftAPI;

import java.util.ArrayList;
import java.util.List;

import com.gmail.realtadukoo.MinecraftAPI.MinecraftFormatting.Color;
import com.gmail.realtadukoo.MinecraftAPI.MinecraftFormatting.Format;

public class Message{
	
	public static class MessageBuilder{
		private Color color = Color.BLACK;
		private List<Format> otherFormatting = new ArrayList<>();
		private String message = "";
		
		private MessageBuilder(){ }
		
		public MessageBuilder color(Color color){
			this.color = color;
			return this;
		}
		
		public MessageBuilder otherFormatting(List<Format> otherFormatting){
			this.otherFormatting = otherFormatting;
			return this;
		}
		
		public MessageBuilder format(Format format){
			otherFormatting.add(format);
			return this;
		}
		
		public MessageBuilder bold(){
			otherFormatting.add(Format.BOLD);
			return this;
		}
		
		public MessageBuilder italic(){
			otherFormatting.add(Format.ITALIC);
			return this;
		}
		
		public MessageBuilder underline(){
			otherFormatting.add(Format.UNDERLINE);
			return this;
		}
		
		public MessageBuilder strikethrough(){
			otherFormatting.add(Format.STRIKETHROUGH);
			return this;
		}
		
		public MessageBuilder obfuscated(){
			otherFormatting.add(Format.OBFUSCATED);
			return this;
		}
		
		public MessageBuilder message(String message){
			this.message = message;
			return this;
		}
		
		public Message build(){
			return new Message(color, otherFormatting, message);
		}
	}
	
	private Color color;
	private List<Format> otherFormatting;
	private String message;
	
	private Message(Color color, List<Format> otherFormatting, String message){
		this.color = color;
		this.otherFormatting = otherFormatting;
		this.message = message;
	}
	
	public static MessageBuilder builder(){
		return new MessageBuilder();
	}
		
	public Color getColor(){
		return color;
	}
	
	public List<Format> getOtherFormatting(){
		return otherFormatting;
	}
	
	public String getMessage(){
		return message;
	}
}
