package com.rootmc.timothy.RootMC.listener;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import com.rootmc.timothy.RootMC.main.Main;

public class Hunt implements Listener{
	public static Main plugin;
	public Hunt (Main instance){
		plugin = instance;
	}
	
	ArrayList<Player> cooldown = new ArrayList<Player>();
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent playerEvent){
		final Player player = playerEvent.getPlayer();
		if(!(playerEvent.getAction() == Action.RIGHT_CLICK_BLOCK)) return;
		if(playerEvent.getClickedBlock().getState() instanceof Sign){
			Sign s = (Sign) playerEvent.getClickedBlock().getState();
			if(s.getLine(0).equals("§6§l[Hunt]")){
				if(!(cooldown.contains(player))){
					player.getInventory().addItem(new ItemStack(Material.DIAMOND , 5));
					player.teleport(player.getWorld().getSpawnLocation());
					cooldown.add(player);
					Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Bukkit.getServer().getPluginManager().getPlugin("RootMC"), new Runnable(){
						public void run(){
							cooldown.remove(player);
						}
					}, 132000);
				}
			}
		}
	}
	@EventHandler
	public void onSignChange(SignChangeEvent signEvent){
		if(signEvent.getLine(0).equalsIgnoreCase("[hunt]")){
			if(signEvent.getPlayer().hasPermission("admin")||signEvent.getPlayer().hasPermission("owner")){
				signEvent.setLine(0, "§6§l[Hunt]");
				signEvent.getPlayer().playSound(signEvent.getPlayer().getLocation(), Sound.NOTE_PLING, 1, 1);
			}else{
				signEvent.getPlayer().sendMessage(Main.Admin.permissionError());
				signEvent.getPlayer().playSound(signEvent.getPlayer().getLocation(), Sound.ITEM_BREAK, 1, 1);
			}
		}
	}
}