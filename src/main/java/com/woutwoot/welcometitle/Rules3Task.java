package com.woutwoot.welcometitle;

import com.woutwoot.welcometitle.tools.Title;
import org.bukkit.Server;
import org.bukkit.entity.Player;

/**
 * Created by Wout on 29/11/2014.
 */
public class Rules3Task implements Runnable {

    private final Player p;

    public Rules3Task(Player p) {
        this.p = p;
    }

    @Override
    public void run() {
        Server server = Main.getInstance().getServer();
        Title.showTitleToEveryone("Rule 2", "Don't ask for OP and don't ask for spawning items!");

    }
}
