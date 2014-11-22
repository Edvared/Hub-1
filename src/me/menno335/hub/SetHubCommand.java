package me.menno335.hub;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetHubCommand implements CommandExecutor {
	Main plugin; 
	
	
	public SetHubCommand(Main passedplugin){
		this.plugin = passedplugin; 
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player me = (Player) sender;
		if (sender.hasPermission("Hub.setHub")){
			if (sender instanceof Player){
				me.getWorld().setSpawnLocation(
				me.getLocation().getBlockX(), 
				me.getLocation().getBlockY(), 
				me.getLocation().getBlockZ());
		me.sendMessage(ChatColor.DARK_GRAY + "[" + ChatColor.AQUA + "Hub" + ChatColor.DARK_GRAY + "]" + " " + ChatColor.GRAY + "Hub has been set." );
		}else{  sender.sendMessage("You must be a player to perform this command!");
		}
		}else{  sender.sendMessage(ChatColor.RED + "You Don't have this permission!");
		}
		return true;
	}
}
