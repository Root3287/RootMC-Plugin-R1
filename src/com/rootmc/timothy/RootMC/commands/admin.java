package com.rootmc.timothy.RootMC.commands;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.rootmc.timothy.RootMC.main.Main;
import com.rootmc.timothy.RootMC.main.messages.MainFormat;

public class admin implements CommandExecutor {
	public static Main plugin;
	public admin (Main instance){
		plugin = instance;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable,
			String[] args) {
		Player p= (Player) sender;
		if(p.hasPermission("admin") || (p.hasPermission("owner"))){
			p.sendMessage(MainFormat.MainColor()+"<-- ADMIN Commands -->");
			p.sendMessage(MainFormat.MainColor()+"/trevor");
			p.sendMessage(MainFormat.MainColor()+"/rainbows");
			p.sendMessage(MainFormat.MainColor()+"/crash <target> <ErrorType>");
			p.sendMessage(MainFormat.MainColor()+"/damage <target>");
			p.sendMessage(MainFormat.MainColor()+"/staff");
			p.sendMessage(MainFormat.MainColor()+"/mod");
			p.sendMessage(MainFormat.MainColor()+"/pink");
			p.sendMessage(MainFormat.MainColor()+"/countdown");
			p.sendMessage(MainFormat.MainColor()+"<-- END OF ADMIN COMMANDS -->");
			p.playSound(p.getLocation(), Sound.NOTE_PLING, 1, 1);
		}else{
			p.sendMessage(Main.Admin.permissionError());
			p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
		}
		return true;
	}

}
