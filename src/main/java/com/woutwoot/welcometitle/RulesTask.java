package com.woutwoot.welcometitle;

import com.woutwoot.welcometitle.tools.Title;
import org.bukkit.entity.Player;

/**
 * Created by Wout on 29/11/2014.
 */
public class RulesTask implements Runnable {

    private final Player p;

    public RulesTask(Player p) {
        this.p = p;
    }

    @Override
    public void run() {
        Title.showTitle(p, "No griefing please.", "We can rollback anyway...");
    }
}
