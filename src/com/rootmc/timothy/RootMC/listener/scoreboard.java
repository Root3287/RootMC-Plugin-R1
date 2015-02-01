package com.rootmc.timothy.RootMC.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

import com.rootmc.timothy.RootMC.main.Main;
import com.rootmc.timothy.RootMC.main.messages.MainFormat;

public class scoreboard{
	
	public static ScoreboardManager manager = Bukkit.getScoreboardManager();
	
	public static Scoreboard Board = manager.getNewScoreboard();
	
	public static Objective object = Board.registerNewObjective("Welcome", "dummy");
	@SuppressWarnings("deprecation")
	public static void Welcome(String rank, Player p){
		
	
		object.setDisplaySlot(DisplaySlot.SIDEBAR);
		
		object.setDisplayName("Welcome");
		
		if(rank == Main.Rank[0].toString()){ // owner
			Score name = object.getScore(Bukkit.getOfflinePlayer(ChatColor.DARK_RED+""+ChatColor.BOLD+p.getName()));
			name.setScore(15);
			
			Score Break = object.getScore(Bukkit.getOfflinePlayer("----------------"));
			Break.setScore(14);
			
			Score Rank = object.getScore(Bukkit.getOfflinePlayer(MainFormat.MainColor()+"Rank:"));
			Rank.setScore(13);
			
			Score RankType = object.getScore(Bukkit.getOfflinePlayer(MainFormat.MainColor()+rank));
			RankType.setScore(12);
			
			Score Break2 = object.getScore(Bukkit.getOfflinePlayer("----------------"));
			Break2.setScore(11);
			
			Score Website = object.getScore(Bukkit.getOfflinePlayer(MainFormat.SecColor()+"Website:"));
			Website.setScore(10);
			
			Score Link = object.getScore(Bukkit.getOfflinePlayer(MainFormat.SecColor()+"www.rootmc.com"));
			Link.setScore(9);
		}else if(rank == Main.Rank[1].toString()){ // Admin
			Score name = object.getScore(Bukkit.getOfflinePlayer(ChatColor.RED+""+ChatColor.BOLD+p.getName()));
			name.setScore(15);
			
			Score Break = object.getScore(Bukkit.getOfflinePlayer("----------------"));
			Break.setScore(14);
			
			Score Rank = object.getScore(Bukkit.getOfflinePlayer(MainFormat.MainColor()+"Rank:"));
			Rank.setScore(13);
			
			Score RankType = object.getScore(Bukkit.getOfflinePlayer(MainFormat.MainColor()+rank));
			RankType.setScore(12);
			
			Score Break2 = object.getScore(Bukkit.getOfflinePlayer("----------------"));
			Break2.setScore(11);
			
			Score Website = object.getScore(Bukkit.getOfflinePlayer(MainFormat.SecColor()+"Website:"));
			Website.setScore(10);
			
			Score Link = object.getScore(Bukkit.getOfflinePlayer(MainFormat.SecColor()+"www.rootmc.com"));
			Link.setScore(9);
		}else if(rank == Main.Rank[2].toString()){ // Mod
			Score name = object.getScore(Bukkit.getOfflinePlayer(ChatColor.RED+""+ChatColor.BOLD+p.getName()));
			name.setScore(15);
			
			Score Break = object.getScore(Bukkit.getOfflinePlayer("----------------"));
			Break.setScore(14);
			
			Score Rank = object.getScore(Bukkit.getOfflinePlayer(MainFormat.MainColor()+"Rank:"));
			Rank.setScore(13);
			
			Score RankType = object.getScore(Bukkit.getOfflinePlayer(MainFormat.MainColor()+rank));
			RankType.setScore(12);
			
			Score Break2 = object.getScore(Bukkit.getOfflinePlayer("----------------"));
			Break2.setScore(11);
			
			Score Website = object.getScore(Bukkit.getOfflinePlayer(MainFormat.SecColor()+"Website:"));
			Website.setScore(10);
			
			Score Link = object.getScore(Bukkit.getOfflinePlayer(MainFormat.SecColor()+"www.rootmc.com"));
			Link.setScore(9);
		}else if(rank == Main.Rank[3].toString()){ // Helper
			Score name = object.getScore(Bukkit.getOfflinePlayer(ChatColor.RED+""+ChatColor.BOLD+p.getName()));
			name.setScore(15);
			
			Score Break = object.getScore(Bukkit.getOfflinePlayer("----------------"));
			Break.setScore(14);
			
			Score Rank = object.getScore(Bukkit.getOfflinePlayer(MainFormat.MainColor()+"Rank:"));
			Rank.setScore(13);
			
			Score RankType = object.getScore(Bukkit.getOfflinePlayer(MainFormat.MainColor()+rank));
			RankType.setScore(12);
			
			Score Break2 = object.getScore(Bukkit.getOfflinePlayer("----------------"));
			Break2.setScore(11);
			
			Score Website = object.getScore(Bukkit.getOfflinePlayer(MainFormat.SecColor()+"Website:"));
			Website.setScore(10);
			
			Score Link = object.getScore(Bukkit.getOfflinePlayer(MainFormat.SecColor()+"www.rootmc.com"));
			Link.setScore(9);
		}else if(rank == Main.Rank[4].toString()){ //Iron
			Score name = object.getScore(Bukkit.getOfflinePlayer(ChatColor.RED+""+ChatColor.BOLD+p.getName()));
			name.setScore(15);
			
			Score Break = object.getScore(Bukkit.getOfflinePlayer("----------------"));
			Break.setScore(14);
			
			Score Rank = object.getScore(Bukkit.getOfflinePlayer(MainFormat.MainColor()+"Rank:"));
			Rank.setScore(13);
			
			Score RankType = object.getScore(Bukkit.getOfflinePlayer(MainFormat.MainColor()+rank));
			RankType.setScore(12);
			
			Score Break2 = object.getScore(Bukkit.getOfflinePlayer("----------------"));
			Break2.setScore(11);
			
			Score Website = object.getScore(Bukkit.getOfflinePlayer(MainFormat.SecColor()+"Website:"));
			Website.setScore(10);
			
			Score Link = object.getScore(Bukkit.getOfflinePlayer(MainFormat.SecColor()+"www.rootmc.com"));
			Link.setScore(9);
		}else if(rank == Main.Rank[5].toString()){ // Coal
			Score name = object.getScore(Bukkit.getOfflinePlayer(ChatColor.RED+""+ChatColor.BOLD+p.getName()));
			name.setScore(15);
			
			Score Break = object.getScore(Bukkit.getOfflinePlayer("----------------"));
			Break.setScore(14);
			
			Score Rank = object.getScore(Bukkit.getOfflinePlayer(MainFormat.MainColor()+"Rank:"));
			Rank.setScore(13);
			
			Score RankType = object.getScore(Bukkit.getOfflinePlayer(MainFormat.MainColor()+rank));
			RankType.setScore(12);
			
			Score Break2 = object.getScore(Bukkit.getOfflinePlayer("----------------"));
			Break2.setScore(11);
			
			Score Website = object.getScore(Bukkit.getOfflinePlayer(MainFormat.SecColor()+"Website:"));
			Website.setScore(10);
			
			Score Link = object.getScore(Bukkit.getOfflinePlayer(MainFormat.SecColor()+"www.rootmc.com"));
			Link.setScore(9);
		}else if(rank == Main.Rank[6].toString()){ // MEMBER
			Score name = object.getScore(Bukkit.getOfflinePlayer(ChatColor.RED+""+ChatColor.BOLD+p.getName()));
			name.setScore(15);
			
			Score Break = object.getScore(Bukkit.getOfflinePlayer("----------------"));
			Break.setScore(14);
			
			Score Rank = object.getScore(Bukkit.getOfflinePlayer(MainFormat.MainColor()+"Rank:"));
			Rank.setScore(13);
			
			Score RankType = object.getScore(Bukkit.getOfflinePlayer(MainFormat.MainColor()+rank));
			RankType.setScore(12);
			
			Score Break2 = object.getScore(Bukkit.getOfflinePlayer("----------------"));
			Break2.setScore(11);
			
			Score Website = object.getScore(Bukkit.getOfflinePlayer(MainFormat.SecColor()+"Website:"));
			Website.setScore(10);
			
			Score Link = object.getScore(Bukkit.getOfflinePlayer(MainFormat.SecColor()+"www.rootmc.com"));
			Link.setScore(9);
		}else if(rank=="OP"){ // OPERATOR
			Score name = object.getScore(Bukkit.getOfflinePlayer(ChatColor.RED+""+ChatColor.BOLD+p.getName()));
			name.setScore(15);
			
			Score Break = object.getScore(Bukkit.getOfflinePlayer("----------------"));
			Break.setScore(14);
			
			Score Rank = object.getScore(Bukkit.getOfflinePlayer(MainFormat.MainColor()+"Rank:"));
			Rank.setScore(13);
			
			Score RankType = object.getScore(Bukkit.getOfflinePlayer(MainFormat.MainColor()+"Operator"));
			RankType.setScore(12);
			
			Score Break2 = object.getScore(Bukkit.getOfflinePlayer("----------------"));
			Break2.setScore(11);
			
			Score Website = object.getScore(Bukkit.getOfflinePlayer(MainFormat.SecColor()+"Website:"));
			Website.setScore(10);
			
			Score Link = object.getScore(Bukkit.getOfflinePlayer(MainFormat.SecColor()+"www.rootmc.com"));
			Link.setScore(9);
		}
		
		
		
	}

}