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

    @Override
    public void onEnable(){
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler(ignoreCancelled = true)
    public void onPlayerJoin(PlayerJoinEvent event){
        Bukkit.getScheduler().scheduleSyncDelayedTask(this, new WelcomeTask(event.getPlayer()), 60L);
    }

}
