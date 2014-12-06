package com.woutwoot.welcometitle;

import com.woutwoot.welcometitle.tools.WootConfig;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wout on 29/11/2014.
 */
public class Main extends JavaPlugin implements Listener {

    private static Main instance;
    private static List<String> users = new ArrayList<>();

    public static Main getInstance() {
        return instance;
    }

    @Override
    public void onEnable(){
        instance = this;
        loadTheConfig();
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        saveTheConfig();
    }


    @EventHandler(ignoreCancelled = true)
    public void onPlayerJoin(PlayerJoinEvent event){
        if (event.getPlayer().hasPlayedBefore())
        if (users.contains(event.getPlayer().getUniqueId().toString())) {
            Bukkit.getScheduler().scheduleSyncDelayedTask(this, new WelcomeTask(event.getPlayer(), true), 20L);
        } else {
            users.add(event.getPlayer().getUniqueId().toString());
            Bukkit.getScheduler().scheduleSyncDelayedTask(this, new WelcomeTask(event.getPlayer(), false), 20L);
            Bukkit.getScheduler().scheduleSyncDelayedTask(this, new RulesTask(event.getPlayer()), 200L);
        }
    }

    private void loadTheConfig() {
        this.getDataFolder().mkdir();
        File f = new File(this.getDataFolder() + File.separator + "users.properties");
        WootConfig config = new WootConfig(f);
        try {
            config.loadFile();
        } catch (IOException e) {
            return;
        }
        users = new ArrayList<>();
        if (config.getStringList("users") != null) {
            users.addAll(config.getStringList("users"));
        }
    }

    private void saveTheConfig() {
        File f = new File(this.getDataFolder() + File.separator + "users.properties");
        WootConfig config = new WootConfig(f);
        config.setStringList("users", users);
        try {
            config.saveFile("Do not edit.");
        } catch (IOException e) {
            return;
        }
    }
}
