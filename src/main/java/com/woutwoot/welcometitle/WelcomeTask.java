package com.woutwoot.welcometitle;

import com.woutwoot.welcometitle.tools.Title;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.Random;

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
            Title.showTitleToEveryone(getRandomChatColor() + "Welcome back " + getRandomChatColor() + p.getName(), getRandomChatColor() + "We've missed you!");
        } else {
            Title.showTitleToEveryone(getRandomChatColor() + "Welcome " + getRandomChatColor() + p.getName(), getRandomChatColor() + "Enjoy the World of WoutCraft!");
        }
    }

    private ChatColor getRandomChatColor() {
        Random rand = new Random();
        int lol = rand.nextInt(10);
        switch (lol) {
            case 0:
                return ChatColor.LIGHT_PURPLE;
            case 1:
                return ChatColor.DARK_RED;
            case 2:
                return ChatColor.YELLOW;
            case 3:
                return ChatColor.WHITE;
            case 4:
                return ChatColor.AQUA;
            case 5:
                return ChatColor.GOLD;
            case 6:
                return ChatColor.RED;
            case 7:
                return ChatColor.DARK_BLUE;
            case 8:
                return ChatColor.DARK_GRAY;
            case 9:
                return ChatColor.BLACK;
            case 10:
                return ChatColor.DARK_AQUA;
            default:
                return ChatColor.DARK_GREEN;
        }
    }
}
