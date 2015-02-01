package com.rootmc.timothy.RootMC.commands;
import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.rootmc.timothy.RootMC.main.messages.MainFormat;

public class Vanish implements CommandExecutor{

	public static List<String> vanish = new ArrayList<String>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String c,
			String[] args) {
		Player p = (Player) sender;
		if(p.hasPermission("mod")||p.hasPermission("admin")||p.hasPermission("owner")){
			if(args.length == 1){
				if(args[0].equalsIgnoreCase("toggle")){
					if(!(vanish.contains(p.getName()))){
						p.sendMessage(MainFormat.Format("Condition", "You have been vanished!"));
						for(Player aPlayers : Bukkit.getServer().getOnlinePlayers()) {
							aPlayers.hidePlayer(p);;
						}
						vanish.add(p.getName());
					}else if(vanish.contains(p.getName())){
						p.sendMessage(MainFormat.Format("Condition", "You be came visible"));
						for(Player aPlayers : Bukkit.getServer().getOnlinePlayers()) {
							aPlayers.showPlayer(p);
						}
						vanish.remove(p.getName());
					}
				}else if(args[0].equalsIgnoreCase("check")){
					if(vanish.contains(p.getName())){
						p.sendMessage(MainFormat.Format("Condition", "You are vanish"));
					}else{
						p.sendMessage(MainFormat.Format("Condition", "You are visble"));
					}
				}else{
					p.sendMessage(ChatColor.GOLD+""+ChatColor.BOLD+"/vanish toggle");
					p.sendMessage(ChatColor.GOLD+""+ChatColor.BOLD+"/vanish check");
				}
			}else{
				p.sendMessage(ChatColor.GOLD+""+ChatColor.BOLD+"/vanish toggle");
				p.sendMessage(ChatColor.GOLD+""+ChatColor.BOLD+"/vanish check");
			}
		}
		return true;
	}
}
