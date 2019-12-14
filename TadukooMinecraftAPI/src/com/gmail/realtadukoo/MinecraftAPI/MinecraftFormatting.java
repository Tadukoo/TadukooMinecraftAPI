package com.gmail.realtadukoo.MinecraftAPI;

public class MinecraftFormatting{
	public static final char SECTION_SYMBOL = '§';
	public static final char AMPERSTAND = '&';
	
	public static enum Color{
		BLACK('0'),
		DARK_BLUE('1'),
		DARK_GREEN('2'),
		DARK_AQUA('3'),
		DARK_RED('4'),
		DARK_PURPLE('5'),
		GOLD('6'),
		GRAY('7'),
		DARK_GRAY('8'),
		BLUE('9'),
		GREEN('a'),
		AQUA('b'),
		RED('c'),
		LIGHT_PURPLE('d'),
		YELLOW('e'),
		WHITE('f');
		
		private char code;
		
		private Color(char code){
			this.code = code;
		}
		
		public char getCode(){
			return code;
		}
	}
	
	public static enum Format{
		OBFUSCATED('k'),
		BOLD('l'),
		STRIKETHROUGH('m'),
		UNDERLINE('n'),
		ITALIC('o'),
		RESET('r');
		
		private char code;
		
		private Format(char code){
			this.code = code;
		}
		
		public char getCode(){
			return code;
		}
	}
}
