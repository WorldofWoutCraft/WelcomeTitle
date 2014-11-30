package com.woutwoot.welcometitle;

import com.woutwoot.welcometitle.tools.Title;
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
        Title.showTitleToEveryone("Welcome " + p.getName(), "To the World of WoutCraft!");
    }
}
