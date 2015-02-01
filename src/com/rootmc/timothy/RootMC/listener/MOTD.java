package com.rootmc.timothy.RootMC.listener;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.rootmc.timothy.RootMC.main.Main;
import com.rootmc.timothy.RootMC.main.messages.MainFormat;

public class MOTD implements Listener{
	public static Main plugin;
	public MOTD (Main instance){
		plugin = instance;
	}
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e){
		final Player player = e.getPlayer();
		
		Bukkit.getServer().broadcastMessage(MainFormat.Format("Join", player.getName()+" joined the Server!"));
		player.sendMessage(MainFormat.Format("Welcome", "Welcome back to the server "+player.getDisplayName()+" !"));
		player.sendMessage(MainFormat.Format("Website", "http://rootmc.com"));
		
		/*for(Player p: Bukkit.getOnlinePlayers()){
		if(p.hasPermission(Main.Rank[0].toString())){
			scoreboard.Welcome(Main.Rank[0].toString(), p);
			p.setScoreboard(scoreboard.Board);
		}else if(p.hasPermission(Main.Rank[1].toString())){
			scoreboard.Welcome(Main.Rank[1].toString(), p);
			p.setScoreboard(scoreboard.Board);
		}else if(p.hasPermission(Main.Rank[2].toString())){
			scoreboard.Welcome(Main.Rank[2].toString(), p);
			p.setScoreboard(scoreboard.Board);
		}else if(p.hasPermission(Main.Rank[3].toString())){
			scoreboard.Welcome(Main.Rank[3].toString(), p);
			p.setScoreboard(scoreboard.Board);
		}else if(p.hasPermission(Main.Rank[4].toString())){
			scoreboard.Welcome(Main.Rank[4].toString(), p);
			p.setScoreboard(scoreboard.Board);
		}else if(p.hasPermission(Main.Rank[5].toString())){
			scoreboard.Welcome(Main.Rank[5].toString(), p);
			p.setScoreboard(scoreboard.Board);
		}else if(p.hasPermission(Main.Rank[6].toString())){
			scoreboard.Welcome(Main.Rank[6].toString(), p);
			p.setScoreboard(scoreboard.Board);
		}else if(p.isOp()){
			scoreboard.Welcome("OP", p);
			p.setScoreboard(scoreboard.Board);
		}
	}*/
	}

}
