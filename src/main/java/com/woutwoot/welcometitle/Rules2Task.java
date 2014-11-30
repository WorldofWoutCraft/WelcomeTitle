package com.woutwoot.welcometitle;

import com.woutwoot.welcometitle.tools.Title;
import org.bukkit.Server;
import org.bukkit.entity.Player;

/**
 * Created by Wout on 29/11/2014.
 */
public class Rules2Task implements Runnable {

    private final Player p;

    public Rules2Task(Player p) {
        this.p = p;
    }

    @Override
    public void run() {
        Server server = Main.getInstance().getServer();
        Title.showTitleToEveryone("Rule 2", "No swearing or talking in full caps!");

    }
}
