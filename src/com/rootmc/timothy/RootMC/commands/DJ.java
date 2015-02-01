package com.rootmc.timothy.RootMC.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.rootmc.timothy.RootMC.main.Main;
import com.rootmc.timothy.RootMC.main.messages.MainFormat;

public class DJ implements CommandExecutor{

	public static Main plugin;
	public DJ (Main instance){
		plugin = instance;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player p = (Player) sender;
		if(Main.Jummper.contains(p.getName())){
			Main.Jummper.remove(p.getName());
			p.sendMessage(MainFormat.Format("Jumper", "Disable"));
			p.setAllowFlight(false);
			p.setFlying(false);
		}else{
			Main.Jummper.add(p.getName());
			p.sendMessage(MainFormat.Format("Jumper", "Enable"));
			p.setAllowFlight(true);
			p.setFlying(false);
		}
		return true;
	}
}
