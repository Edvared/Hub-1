package me.menno335.hub;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HubCommand implements CommandExecutor{
	Main plugin; 
	
	
	public HubCommand(Main passedplugin){
		this.plugin = passedplugin; 
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player me = (Player) sender;
		
		me.teleport(me.getWorld().getSpawnLocation());
		me.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "Hub" + ChatColor.DARK_GRAY + "]" + " " + ChatColor.GRAY + "Teleporting to Hub..."); 
		
		
		return false;
	}

}
