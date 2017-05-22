package me.edgydaddy.core;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Core extends JavaPlugin implements Listener {

	public void onEnable() {
		getLogger().info(getDescription().getName() + " has been enabled!");
		getServer().getPluginManager().registerEvents(this, this);
		getConfig().options().copyDefaults(true);
		saveConfig();
	}

	public void onDisable() {
		getLogger().info(getDescription().getName() + " has been disabled!");

	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if (p.getName().equals("EdgyDaddy")) {
			World world = getServer().getWorld("flatroom");
			int x = 99;
			int y = 31;
			int z = 700;
			world.getBlockAt(x, y, z).setType(Material.EMERALD_BLOCK);
		} else if (p.getName().equals("EdgyDaddy")) {
			World world = getServer().getWorld("flatroom");
			int x = 99;
			int y = 31;
			int z = 700;
			world.getBlockAt(x, y, z).setType(Material.REDSTONE_BLOCK);
		}
	}

	@EventHandler
	public void onPlayerJoin1(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if (p.getName().equals("ItsQuib")) {
			World world = getServer().getWorld("flatroom");
			int x = 94;
			int y = 31;
			int z = 687;
			world.getBlockAt(x, y, z).setType(Material.EMERALD_BLOCK);
		}

		else if (p.getName().equals("ItsQuib")) {
			World world = getServer().getWorld("flatroom");
			int x = 94;
			int y = 31;
			int z = 687;
			world.getBlockAt(x, y, z).setType(Material.REDSTONE_BLOCK);
		}
	}
	
	public void onPlayerJoin2(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if (p.getName().equals("HomeWork")) {
			World world = getServer().getWorld("flatroom");
			int x = 99;
			int y = 31;
			int z = 688;
			world.getBlockAt(x, y, z).setType(Material.EMERALD_BLOCK);
		}

		else if (p.getName().equals("HomeWork")) {
			World world = getServer().getWorld("flatroom");
			int x = 99;
			int y = 31;
			int z = 688;
			world.getBlockAt(x, y, z).setType(Material.REDSTONE_BLOCK);
		}
	}


}