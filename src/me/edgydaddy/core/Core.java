package me.edgydaddy.core;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Core
  extends JavaPlugin
  implements Listener
{
  
  public void onEnable()
  {
    getLogger().info(getDescription().getName() + " has been enabled!");
    getServer().getPluginManager().registerEvents(this, this);
    getConfig().options().copyDefaults(true);
    saveConfig();
  }
  
  public void onDisable()
  {
    getLogger().info(getDescription().getName() + " has been disabled!");
  }
  
  public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args)
  {
    Player player = (Player)sender;
    if (commandLabel.equalsIgnoreCase("coreapi"))
    {
      player.sendMessage(ChatColor.RED + "WORKS");
      return true;
    }
    return false;
  }
  
  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent e)
  {
    Player p = e.getPlayer();
    if (p.getName().equals("EdgyDaddy"))
    {
      World world = getServer().getWorld("flatroom");
      int x = 99;
      int y = 31;
      int z = 700;
      world.getBlockAt(x, y, z).setType(Material.EMERALD_BLOCK);
    }
  }
  
  @EventHandler
  public void onPlayerLeave(PlayerQuitEvent e)
  {
    Player p = e.getPlayer();
    if (p.getName().equals("EdgyDaddy"))
    {
      World world = getServer().getWorld("flatroom");
      int x = 99;
      int y = 31;
      int z = 700;
      world.getBlockAt(x, y, z).setType(Material.REDSTONE_BLOCK);
    }
  }
  
  @EventHandler
  public void onPlayerJoin1(PlayerJoinEvent e)
  {
    Player p = e.getPlayer();
    if (p.getName().equals("ItsQuib"))
    {
      World world = getServer().getWorld("flatroom");
      int x = 99;
      int y = 31;
      int z = 688;
      world.getBlockAt(x, y, z).setType(Material.EMERALD_BLOCK);
    }
  }
  
  @EventHandler
  public void onPlayerLeave1(PlayerQuitEvent e)
  {
    Player p = e.getPlayer();
    if (p.getName().equals("ItsQuib"))
    {
      World world = getServer().getWorld("flatroom");
      int x = 99;
      int y = 31;
      int z = 688;
      world.getBlockAt(x, y, z).setType(Material.REDSTONE_BLOCK);
    }
  }
  
  @EventHandler
  public void onDeath(PlayerDeathEvent e)
  {
    if (e.getEntity().getKiller() != null) {
      e.getEntity().getWorld().strikeLightningEffect(e.getEntity().getLocation());
    }
  }
}