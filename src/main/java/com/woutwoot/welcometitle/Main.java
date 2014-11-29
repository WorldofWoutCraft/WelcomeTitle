package com.woutwoot.welcometitle;

import com.connorlinfoot.titleapi.TitleAPI;
import org.bukkit.ChatColor;
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

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        TitleAPI.sendTitle(event.getPlayer(), 3, 1, 2, ChatColor.RED + "Welcome " + event.getPlayer().getName(), ChatColor.AQUA + "To the World of WoutCraft!");
    }

}
