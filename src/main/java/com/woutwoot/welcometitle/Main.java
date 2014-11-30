package com.woutwoot.welcometitle;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Wout on 29/11/2014.
 */
public class Main extends JavaPlugin implements Listener {

    private static Main instance;

    public static Main getInstance() {
        return instance;
    }

    @Override
    public void onEnable(){
        instance = this;
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerJoin(PlayerJoinEvent event){
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new WelcomeTask(event.getPlayer()), 20L);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new RulesTask(event.getPlayer()), 100L);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Rules2Task(event.getPlayer()), 180L);
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new Rules3Task(event.getPlayer()), 260L);
    }
}
