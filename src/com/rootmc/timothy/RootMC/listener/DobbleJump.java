package com.rootmc.timothy.RootMC.listener;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;

import com.rootmc.timothy.RootMC.main.Main;

public class DobbleJump implements Listener{
	
	public static Main plugin;
	public DobbleJump (Main instance){
		plugin = instance;
	}
	/*
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent e){
		Player p = e.getPlayer();
		if((p.getGameMode() !=GameMode.CREATIVE)
				&& (p.getLocation().subtract(0, 1, 0).getBlock().getType() !=Material.AIR)
				&&(!p.isFlying())){
			p.setAllowFlight(true);
		}
	}
	*/
	@EventHandler
	public void onPlayerToggle(PlayerToggleFlightEvent e){
		Player p = e.getPlayer();
		if(p.getGameMode()==GameMode.CREATIVE){
			return;
		}else if(p.getGameMode()==GameMode.SURVIVAL){
			if(Main.Jummper.contains(p.getName())){
					p.setAllowFlight(false);
					e.setCancelled(true);
					p.setFlying(false);
					p.setVelocity(p.getLocation().getDirection().multiply(1.5).setY(1));
			}
		}
	}
	
	@EventHandler
	public void playerMove(PlayerMoveEvent e){
		Player p = e.getPlayer();
		if(p.getLocation().getBlock().getRelative(BlockFace.DOWN).getType() !=Material.AIR){
			if(Main.Jummper.contains(p.getName()))
			p.setAllowFlight(true);
		}
	}
}
