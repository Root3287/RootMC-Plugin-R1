package com.rootmc.timothy.RootMC.commands;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.rootmc.timothy.RootMC.main.Main;
import com.rootmc.timothy.RootMC.main.messages.MainFormat;

public class mod implements CommandExecutor {
	public static Main plugin;
	public mod (Main instance){
		plugin = instance;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable,
			String[] args) {
		Player p= (Player) sender;
		if(p.hasPermission("mod")||p.hasPermission("admin")||p.hasPermission("owner")){
			p.sendMessage(MainFormat.MainColor()+"<-- Mod Commands -->");
			p.sendMessage(MainFormat.MainColor()+"/trevor");
			p.sendMessage(MainFormat.MainColor()+"/rainbows");
			p.playSound(p.getLocation(), Sound.NOTE_PLING, 1, 1);
		}else{
			p.sendMessage(Main.Mod.permissionError());
			p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
		}
		return true;
	}

}
