package com.rootmc.timothy.RootMC.listener;

import io.puharesource.mc.titlemanager.api.TitleObject;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeath implements Listener{
	@EventHandler
	public void death(PlayerDeathEvent e){
		Player t = e.getEntity();
		Player p = t.getKiller();
		if(p.getUniqueId().toString() == "ScoutLogan24"){
			if(t.getUniqueId().toString() == "newtj599zzzbro"){
				TitleSubtitle(p, ChatColor.DARK_RED+""+ChatColor.BOLD+"YOU KILLED", ChatColor.DARK_RED+""+ChatColor.BOLD+t.getUniqueId().toString(), 1, 5);
			}
		}else{
			return;
		}
	}
	
	private void TitleSubtitle(Player p, String title, String Subtitle, int stay, int Fade){
		new TitleObject(title, Subtitle).setStay(stay).setFadeIn(Fade).setFadeOut(Fade).send(p);
	}
}
