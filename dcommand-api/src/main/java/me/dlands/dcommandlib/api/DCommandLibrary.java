package me.dlands.dcommandlib.api;

import org.bukkit.Bukkit;

public class DCommandLibrary {

    private static IDCommandLib instance;

    public static IDCommandLib getInstance() {
        if (instance == null) {
            IDCommandPlugin plugin = (IDCommandPlugin) Bukkit.getServer().getPluginManager().getPlugin("DCommandLib");
            if (plugin == null) {
                throw new IllegalStateException("DCommandLib plugin is not loaded!");
            }
            instance = plugin.getInstance();
        }
        return instance;
    }
}
