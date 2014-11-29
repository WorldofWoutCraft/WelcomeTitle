package com.woutwoot.welcometitle;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import static com.connorlinfoot.titleapi.TitleAPI.sendTitle;

/**
 * Created by Wout on 29/11/2014.
 */
public class WelcomeTask implements Runnable {

    private final Player p;

    public WelcomeTask(Player p) {
        this.p = p;
    }

    @Override
    public void run() {
        sendTitle(p, 40, 80, 40, ChatColor.RED + "Welcome " + p.getName(), ChatColor.AQUA + "to the World of WoutCraft!");
    }
}
