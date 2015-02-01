package com.rootmc.timothy.RootMC.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import com.rootmc.timothy.RootMC.main.Main;
import com.rootmc.timothy.RootMC.main.messages.MainFormat;

public class Quit implements Listener{
	public static Main plugin;
	public Quit (Main instance){
		plugin = instance;
	}
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent e){
		Player p = e.getPlayer();
		Bukkit.getServer().broadcastMessage(MainFormat.Format("Quit",p.getName()+" quit the server."));
	}
}
