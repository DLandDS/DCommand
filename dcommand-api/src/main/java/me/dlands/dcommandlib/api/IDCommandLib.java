package me.dlands.dcommandlib.api;

import me.dlands.dcommandlib.api.command.ICommandManager;

public interface IDCommandLib {

    String getVersion();
    ICommandManager getCommandManager();
}
