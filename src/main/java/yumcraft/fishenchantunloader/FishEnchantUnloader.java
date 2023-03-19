package yumcraft.fishenchantunloader;

import org.bukkit.plugin.java.JavaPlugin;

public final class FishEnchantUnloader extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("EnchantUnloader").setExecutor(new FEL(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
