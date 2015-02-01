package com.rootmc.timothy.RootMC.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.rootmc.timothy.RootMC.main.Main;
import com.rootmc.timothy.RootMC.main.messages.MainFormat;

public class Damage implements CommandExecutor{
	public static Main plugin;
	public Damage (Main instance){
		plugin = instance;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable,String[] args) {
		if(sender instanceof Player){
			Player p = (Player) sender;
			
			Player t = Bukkit.getServer().getPlayer(args[0]);
			
			if(args.length == 0){
				p.setHealth(1);
				p.sendMessage(MainFormat.Format("Health", "You have been damaged"));
			}else if(args.length == 1){
				if(t !=null){
					p.sendMessage(MainFormat.Format("Health", "You have Damage "+ t.getName()));
					t.setHealth(1);
				}
			}
		}
		return true;
	}
}
