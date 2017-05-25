package me.edgydaddy.core;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Core extends JavaPlugin implements Listener {
	FileConfiguration config = getConfig();

	public void onEnable() {
		super.onEnable();
		getLogger().info(getDescription().getName() + " has been enabled!");
		getServer().getPluginManager().registerEvents(this, this);
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
	}

	public void onDisable() {
		getLogger().info(getDescription().getName() + " has been disabled!");
		super.onDisable();
		this.saveConfig();
	}

	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();

		if (config.getString("username") != null) {
			World world = getServer().getWorld(config.getString("username.world"));
			int x = Integer.parseInt(config.getString("username.x"));
			int y = Integer.parseInt(config.getString("username.y"));
			int z = Integer.parseInt(config.getString("username.z"));
			world.getBlockAt(x, y, z).setType(Material.EMERALD_BLOCK);
		}

		else if (config.getString("username") != null) {
			World world = getServer().getWorld(config.getString("username.world"));
			int x = Integer.parseInt(config.getString("username.x"));
			int y = Integer.parseInt(config.getString("username.y"));
			int z = Integer.parseInt(config.getString("username.z"));
			world.getBlockAt(x, y, z).setType(Material.REDSTONE_BLOCK);
		}
	}

}