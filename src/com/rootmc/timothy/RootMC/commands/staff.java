package com.rootmc.timothy.RootMC.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.rootmc.timothy.RootMC.main.Main;

public class staff implements CommandExecutor{
	public static Main plugin;
	public staff (Main instance){
		plugin = instance;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable,
			String[] args) {
		if(args.length == 0){
			Player p = (Player) sender;
			p.sendMessage(ChatColor.GOLD+""+ChatColor.BOLD+"WEBSITE TO SIGN UP:");
			p.sendMessage(ChatColor.GOLD+""+ChatColor.BOLD+"https://www.root.tk/forums");
		}else if(args.length == 1){
			Player p = (Player) sender;
			if (args[0].equalsIgnoreCase("newtj599zzzbro")||args[0].equalsIgnoreCase("root")){
				p.sendMessage(ChatColor.GOLD+""+ChatColor.BOLD+"Root is an Owner");
			}else if(args[0].equalsIgnoreCase("Qtkttte")){
				p.sendMessage(ChatColor.GOLD+""+ChatColor.BOLD+"QTKTTTE is an Owner");
			}else if(args[0].equalsIgnoreCase("trevor")){
				p.sendMessage(ChatColor.GOLD+""+ChatColor.BOLD+"trevor is an Owner");
			}else if(args[0].equalsIgnoreCase("pink")){
				p.sendMessage(ChatColor.GOLD+""+ChatColor.BOLD+"pink is an admin");
			}else{
				p.sendMessage(ChatColor.GOLD+""+ChatColor.BOLD+"Root, Qtkttte, trevor, pink");
			}
		}
		return true;
	}

}
