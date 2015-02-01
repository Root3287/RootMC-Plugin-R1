package com.rootmc.timothy.RootMC.commands;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.rootmc.timothy.RootMC.main.Main;

/**
 * Created by newtj599zzzbro on 29-Jun-14.
 */
public class rainbows implements CommandExecutor{
    public static Main plugin;
    public rainbows (Main instance){
        plugin = instance;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p =(Player) sender;
            if(sender instanceof Player){
                p.sendMessage(ChatColor.RED+""+ ChatColor.BOLD+"M"+ChatColor.GOLD+""+ ChatColor.BOLD+"e"+ChatColor.YELLOW+""+ ChatColor.BOLD+"o"+ChatColor.GREEN+""+ ChatColor.BOLD+"w"+ChatColor.YELLOW+""+ ChatColor.BOLD+" > "+ChatColor.AQUA+""+ ChatColor.BOLD+"NYAN CAT ROCKS!");
                p.sendMessage(ChatColor.GREEN+""+ ChatColor.BOLD+"M"+ChatColor.RED+""+ ChatColor.BOLD+"e"+ChatColor.GOLD+""+ ChatColor.BOLD+"o"+ChatColor.YELLOW+""+ ChatColor.BOLD+"w"+ChatColor.YELLOW+""+ ChatColor.BOLD+" > "+ChatColor.AQUA+""+ ChatColor.BOLD+"NYAN CAT ROCKS!");
                p.sendMessage(ChatColor.YELLOW+""+ ChatColor.BOLD+"M"+ChatColor.GREEN+""+ ChatColor.BOLD+"e"+ChatColor.RED+""+ ChatColor.BOLD+"o"+ChatColor.GOLD+""+ ChatColor.BOLD+"w"+ChatColor.YELLOW+""+ ChatColor.BOLD+" > "+ChatColor.AQUA+""+ ChatColor.BOLD+"NYAN CAT ROCKS!");
                p.sendMessage(ChatColor.GOLD+""+ ChatColor.BOLD+"M"+ChatColor.YELLOW+""+ ChatColor.BOLD+"e"+ChatColor.GREEN+""+ ChatColor.BOLD+"o"+ChatColor.RED+""+ ChatColor.BOLD+"w"+ChatColor.YELLOW+""+ ChatColor.BOLD+" > "+ChatColor.AQUA+""+ ChatColor.BOLD+"NYAN CAT ROCKS!");
                p.playSound(p.getLocation(), Sound.CAT_MEOW, 1 , 1);
            }
        return true;
    }
}
