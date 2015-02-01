package com.rootmc.timothy.RootMC.commands;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import com.rootmc.timothy.RootMC.main.Main;

public class Trevor implements CommandExecutor{
	public static Main plugin;
	public Trevor (Main instance){
		plugin = instance;
	}
	
	ArrayList<Player> trevor = new ArrayList<Player>();
	
	public void trevorZom(Player p){
		Zombie trevorZom = (Zombie) p.getLocation().getWorld().spawn(p.getLocation(), Zombie.class);
		trevorZom.setCustomName(ChatColor.YELLOW + "" + ChatColor.BOLD + "Trevor");
		trevorZom.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 1000000000, 1000000000));
		trevorZom.setCustomNameVisible(true);
		trevorZom.setCanPickupItems(false);
		trevorZom.getEquipment().setItemInHand(new ItemStack(Material.DIAMOND_SWORD));
		trevorZom.getEquipment().setHelmet(new ItemStack(Material.LEATHER_HELMET));
		trevorZom.getEquipment().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
		trevorZom.getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
		trevorZom.getEquipment().setBoots(new ItemStack(Material.GOLD_BOOTS));
		trevorZom.setMaxHealth(1);
		trevorZom.damage(0, p);
		trevorZom.damage(0);
		trevorZom.setBaby(false);
		trevorZom.setVillager(false);;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
       final Player p = (Player) sender;
        if(!(p.hasPermission("mod")||!p.hasPermission("admin")||!p.hasPermission("owner"))){
            p.sendMessage(ChatColor.GOLD+""+ChatColor.BOLD+"Permission"+ ChatColor.YELLOW+""+ChatColor.BOLD+" > "+ChatColor.GOLD+""+ChatColor.BOLD+"You dont have Permission "+ChatColor.YELLOW+""+ChatColor.BOLD+"["+ChatColor.GOLD+""+ChatColor.BOLD+"MOD"+ChatColor.YELLOW+""+ChatColor.BOLD+"]"+ChatColor.GOLD+""+ChatColor.BOLD+"!");
        }else{
            if(sender instanceof Player){
            	if(!(trevor.contains(p)))
                p.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Trevor" + ChatColor.YELLOW+""+ChatColor.BOLD+" > "+ChatColor.GOLD+""+ChatColor.BOLD+ "I'm going to get you");
                trevorZom(p);
                p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);
                trevor.add(p);
Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Bukkit.getServer().getPluginManager().getPlugin("RootMC"), new Runnable() {
					
					@Override
					public void run() {
						trevor.remove(p);
					}
				}, 72000);
            }
        }
        return true;
    }
}
