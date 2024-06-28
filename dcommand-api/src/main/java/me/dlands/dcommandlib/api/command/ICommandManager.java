package me.dlands.dcommandlib.api.command;

import org.bukkit.plugin.Plugin;

public interface ICommandManager {
    void registerCommand(Plugin plugin, DCommands DCommands);
}
