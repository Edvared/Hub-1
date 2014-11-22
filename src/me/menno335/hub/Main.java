package me.menno335.hub;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public static Logger log = Logger.getLogger("Minecraft");
	public void onEnable(){
		log.info(ChatColor.GREEN + "[Hub] Enabled! :D");
		this.getCommand("sethub").setExecutor(new SetHubCommand(this));	
		this.getCommand("hub").setExecutor(new HubCommand(this));
		
			saveConfig();
	}
	public void onDisable(){
		log.info(ChatColor.GREEN + "[Hub] Disabled! See you soon!");
			saveConfig();
	}
	
		/*
		public void onPlayerJoin(PlayerJoinEvent event){
			Player p = event.getPlayer();
			
		} */

		
	
}
