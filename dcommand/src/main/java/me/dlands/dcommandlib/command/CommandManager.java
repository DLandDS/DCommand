package me.dlands.dcommandlib.command;

import me.dlands.dcommandlib.api.command.ICommands;
import me.dlands.dcommandlib.api.command.ICommandManager;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class CommandManager implements ICommandManager {

    @Override
    public void registerCommand(Plugin plugin, ICommands commands) {
        JavaPlugin javaPlugin = (JavaPlugin) plugin;
        PluginCommand pluginCommand = javaPlugin.getCommand(commands.getCommandName());
        pluginCommand.setExecutor(new CommandsInstance(commands));
        plugin.getLogger().log(Level.INFO, "Registered command " + commands.getCommandName());
    }

}
