package com.rootmc.timothy.RootMC.commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;

import com.rootmc.timothy.RootMC.main.Main;

public class Pink implements CommandExecutor {
	public static Main plugin;
	public Pink (Main instance){
		plugin = instance;
	}
	public static ArrayList<Player> pinkCooldown = new ArrayList<Player>();
	
	public void pink(Player p){
		Sheep pink = (Sheep) p.getLocation().getWorld().spawn(p.getLocation(), Sheep.class);
		pink.setBreed(false);
		pink.setAgeLock(true);
		pink.setCustomName(ChatColor.LIGHT_PURPLE+""+ChatColor.BOLD+"Pink");
		pink.setCustomNameVisible(true);
		pink.setColor(DyeColor.PINK);
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		final Player p = (Player) sender;
		if(p.hasPermission("mod")||p.hasPermission("admin")||p.hasPermission("owner")||p.hasPermission("iron")||p.hasPermission("Coal")){
			if(!(pinkCooldown.contains(p))){
				pink(p);
				pinkCooldown.add(p);
				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Bukkit.getServer().getPluginManager().getPlugin("RootMC"), new Runnable() {
					
					@Override
					public void run() {
						pinkCooldown.remove(p);
					}
				}, 72000);
			}
		}else{
			p.sendMessage(Main.Donor.permissionError());
		}
		return true;
	}
}
