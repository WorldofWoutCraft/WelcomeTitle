package com.woutwoot.welcometitle;

import com.woutwoot.welcometitle.tools.Title;
import org.bukkit.entity.Player;
/**
 * Created by Wout on 29/11/2014.
 */
public class WelcomeTask implements Runnable {

    private final Player p;
    private boolean b;

    public WelcomeTask(Player p, boolean b) {
        this.p = p;
        this.b = b;
    }

    @Override
    public void run() {
        if (b) {
            if (!p.getName().equals("darkova123")) {
                Title.showTitleToEveryone("Welcome back " + p.getName(), "We've missed you!");
            }
        } else {
            Title.showTitleToEveryone("Welcome " + p.getName(), "Enjoy the World of WoutCraft!");
        }
    }
}
