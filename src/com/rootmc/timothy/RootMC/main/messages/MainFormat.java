package com.rootmc.timothy.RootMC.main.messages;

import org.bukkit.ChatColor;

public class MainFormat {
	
	public static String Format(String Topic, String sentence){
		return ChatColor.GOLD+""+ChatColor.BOLD+Topic+ChatColor.YELLOW+""+ChatColor.BOLD+" > "+ChatColor.GOLD+""+ChatColor.BOLD+ sentence;
	}
	
	public static String MainColor(){
		return ChatColor.GOLD+""+ChatColor.BOLD;
	}
	public static String SecColor(){
		return ChatColor.YELLOW+""+ChatColor.BOLD;
	}
}
