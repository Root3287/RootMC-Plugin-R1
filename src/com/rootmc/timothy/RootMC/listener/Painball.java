package com.rootmc.timothy.RootMC.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import com.rootmc.timothy.RootMC.main.Main;

public class Painball implements Listener{
	public static Main plugin;
	public Painball(Main instance){
		plugin = instance;
	}
	
	@EventHandler
	public static void Gun(PlayerInteractEvent e){
		String PBNAME = "PAINTBALL GUN";
		ItemStack GUN = new ItemStack(Material.DIAMOND_BARDING);
		
		Player p = e.getPlayer();
		
		if(plugin.PB.contains(p.getUniqueId().toString())){
        if(e.getAction() == Action.RIGHT_CLICK_AIR ||e.getAction() == Action.RIGHT_CLICK_BLOCK)
        {
            if(p.getItemInHand() != null)
            {
            	if(!p.getItemInHand().getItemMeta().hasDisplayName()) return;
                if(p.getItemInHand().getItemMeta().getDisplayName().equals(PBNAME)&&p.getItemInHand().equals(GUN)){
                	p.launchProjectile(Snowball.class);
                	}
               
            }
        }
				
		if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK ){
			p.launchProjectile(Snowball.class);
		}
		}
	}
}
