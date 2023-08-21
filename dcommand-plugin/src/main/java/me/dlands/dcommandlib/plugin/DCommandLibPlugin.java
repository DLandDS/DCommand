package me.dlands.dcommandlib.plugin;
import me.dlands.dcommandlib.DCommandLib;
import me.dlands.dcommandlib.api.IDCommandLib;
import me.dlands.dcommandlib.api.IDCommandPlugin;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Level;

public final class DCommandLibPlugin extends JavaPlugin implements IDCommandPlugin {

    private static IDCommandLib instance;

    @Override
    public void onEnable() {
        instance = new DCommandLib();
        getLogger().log(Level.INFO, "DCommand instance created!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public IDCommandLib getInstance() {
        return instance;
    }
}
