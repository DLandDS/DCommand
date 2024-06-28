package me.dlands.dcommand.exampleplugin;

import me.dlands.dcommandlib.api.DCommandLibrary;
import me.dlands.dcommandlib.api.command.CommandEvent;
import me.dlands.dcommandlib.api.command.DCommands;
import me.dlands.dcommandlib.api.command.annotation.AutoComplete;
import me.dlands.dcommandlib.api.command.annotation.CommandExecute;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public final class Main extends JavaPlugin implements DCommands {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().log(Level.INFO, "DCommand hooked version " + DCommandLibrary.getInstance().getVersion());
        DCommandLibrary.getInstance().getCommandManager().registerCommand(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public String getCommandName() {
        return "testcommand";
    }

    @CommandExecute(command = "say", usages = "<player> <message>", description = "Say something to a player")
    public boolean say(CommandEvent event) {
        String playerName = event.getArgs()[1];
        Player player = getServer().getPlayer(playerName);
        if (player == null) {
            event.getSender().sendMessage("Player not found");
            return true;
        }
        String message = event.getArgs()[2];
        player.sendMessage(message);
        event.getSender().sendMessage("You said " + message + " to " + player);
        return true;
    }

    @AutoComplete(command = "say")
    public List<String> sayCompleter(CommandEvent event) {
        List<String> completions = new ArrayList<>();
        switch (event.getArgs().length){
            case 2 -> {
                return null;
            }
            case 3 -> {
                completions.add("Hello");
                completions.add("Hi");
                completions.add("How are you?");
            }
        }
        return completions;
    }

}
