package com.woutwoot.welcometitle;

import org.bukkit.Server;
import org.bukkit.entity.Player;
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
        Server server = Main.getInstance().getServer();
        server.dispatchCommand(server.getConsoleSender(), "title " + p.getName() + " title {text:\"Welcome " + p.getName() + "!\", color:\"red\"}");
        server.dispatchCommand(server.getConsoleSender(), "title " + p.getName() + " subtitle {text:\"To the World of WoutCraft!\", color:\"yellow\"}");
    }
}
