package me.dlands.dcommandlib.command;

import me.dlands.dcommandlib.api.command.DCommands;
import me.dlands.dcommandlib.api.command.ICommandManager;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class CommandManager implements ICommandManager {

    @Override
    public void registerCommand(Plugin plugin, DCommands DCommands) {
        JavaPlugin javaPlugin = (JavaPlugin) plugin;
        PluginCommand pluginCommand = javaPlugin.getCommand(DCommands.getCommandName());
        pluginCommand.setExecutor(new CommandsInstance(DCommands));
        plugin.getLogger().log(Level.INFO, "Registered command " + DCommands.getCommandName());
    }

}
