package me.dlands.dcommandlib;

import me.dlands.dcommandlib.api.IDCommandLib;
import me.dlands.dcommandlib.api.command.ICommandManager;
import me.dlands.dcommandlib.command.CommandManager;

public class DCommandLib implements IDCommandLib {

    CommandManager commandManager = new CommandManager();

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public ICommandManager getCommandManager() {
        return commandManager;
    }
}
