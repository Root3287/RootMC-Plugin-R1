package com.rootmc.timothy.RootMC.main;


import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.rootmc.timothy.RootMC.commands.Crash;
import com.rootmc.timothy.RootMC.commands.DJ;
import com.rootmc.timothy.RootMC.commands.Damage;
import com.rootmc.timothy.RootMC.commands.PB;
import com.rootmc.timothy.RootMC.commands.Pink;
import com.rootmc.timothy.RootMC.commands.Trevor;
import com.rootmc.timothy.RootMC.commands.Vanish;
import com.rootmc.timothy.RootMC.commands.admin;
import com.rootmc.timothy.RootMC.commands.mod;
import com.rootmc.timothy.RootMC.commands.rainbows;
import com.rootmc.timothy.RootMC.commands.staff;
import com.rootmc.timothy.RootMC.listener.DobbleJump;
import com.rootmc.timothy.RootMC.listener.Hunt;
import com.rootmc.timothy.RootMC.listener.MOTD;
import com.rootmc.timothy.RootMC.listener.Painball;
import com.rootmc.timothy.RootMC.listener.PlayerDeath;
import com.rootmc.timothy.RootMC.listener.Quit;
import com.rootmc.timothy.RootMC.main.messages.RolesMessage;


public class Main extends JavaPlugin{
    public static RolesMessage Owner = new RolesMessage(Roles.OWNER);
    public static RolesMessage Admin = new RolesMessage(Roles.ADMIN);
    public static RolesMessage Mod = new RolesMessage(Roles.MOD);
    public static RolesMessage Helper = new RolesMessage(Roles.HELPER);
    public static RolesMessage Donor = new RolesMessage(Roles.DONOR);
    public static RolesMessage Iron = new RolesMessage(Roles.IRON);
    public static RolesMessage Coal = new RolesMessage(Roles.COAL);
    public static RolesMessage Member = new RolesMessage(Roles.MEMBER);
    
    public static String[] Rank = {"Owner","Admin","Mod","Helper","Donor","Iron","Coal","Member"};
    
    SettingManager sm = SettingManager.getInstance();
    
	public Main instance;
	public static final Plugin getPlugin(){
		return Bukkit.getServer().getPluginManager().getPlugin("RootMC");
	}
	public static List<String> Jummper = new ArrayList<String>();
	public List<String> PB = new ArrayList<String>();
	
	@Override
	public void onLoad(){
		getLogger().info("RootMC > LOADING");
	}
	@Override
	public void onEnable(){
		if (getServer().getPluginManager().getPlugin("TitleManager") != null && getServer().getPluginManager().getPlugin("TitleManager").isEnabled())
		    getLogger().info("Successfully hooked into TitleManager!");
		  else {
		    getLogger().warning("Failed to hook into TitleManager, disabling plugin!");
		    getPluginLoader().disablePlugin(this);
		  }
		
		sm.setup(this);
		
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new Hunt(this), this);
		//pm.registerEvents(new scoreboard(), this);
		pm.registerEvents(new MOTD(this), this);
		pm.registerEvents(new Quit(this), this);
		pm.registerEvents(new DobbleJump(this), this);
		pm.registerEvents(new Painball(this), this);
		pm.registerEvents(new PlayerDeath(), this);
		//pm.registerEvents(new Ant1Curse(this), this);
	
		getLogger().info("RootMC > has been enable");
		getCommand("trevor").setExecutor(new Trevor(this));
		getCommand("rainbows").setExecutor(new rainbows(this));
		getCommand("staff").setExecutor(new staff(this));
		getCommand("admin").setExecutor(new admin(this));
		getCommand("mod").setExecutor(new mod(this));
		getCommand("pink").setExecutor(new Pink(this));
		getCommand("crash").setExecutor(new Crash(this));
		getCommand("damage").setExecutor(new Damage(this));
		getCommand("vanish").setExecutor(new Vanish());
		getCommand("jumper").setExecutor(new DJ(this));
		getCommand("pb").setExecutor(new PB(this));
	}
	@Override
	public void onDisable(){
		getLogger().info("RootMC > Shutting down!");
	}
}
