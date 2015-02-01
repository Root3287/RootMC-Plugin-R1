package com.rootmc.timothy.RootMC.commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import com.rootmc.timothy.RootMC.main.Main;
import com.rootmc.timothy.RootMC.main.messages.MainFormat;

public class PB implements CommandExecutor{
	public static Main plugin;
	public PB(Main instance){
		plugin = instance;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable,
			String[] args) {
		if(!(sender instanceof Player)) return false;
		
		Player p = (Player) sender;
		
		if(args.length == 1){
			if(args[0].equalsIgnoreCase("toggle")){
				
				if(!plugin.PB.contains(p.getUniqueId().toString())){
					plugin.PB.add(p.getUniqueId().toString());
					p.sendMessage(MainFormat.Format("PaintBall", "You Enable Paintball!"));
					return true;
				}
		
				if(plugin.PB.contains(p.getUniqueId().toString())){
					plugin.PB.remove(p.getUniqueId().toString());
					p.sendMessage(MainFormat.Format("PainBall", "You Disable Paintball!"));
					return true;
				}
			}else if(args[0].equalsIgnoreCase("gun")){
				PlayerInventory pi = p.getInventory();
				ItemStack gun = new ItemStack(Material.DIAMOND_BARDING,1);
				ItemMeta gunMeta = gun.getItemMeta();
				gunMeta.setDisplayName(ChatColor.RESET+"PAINTBALL GUN");
				gun.setItemMeta(gunMeta);
				pi.addItem(gun);
			}
		}
		return false;
	}

}
