package yumcraft.fishenchantunloader;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

/**
 * @author: Ayolk
 * @create: 2023-03-19 15:01
 * @url: github.com/AyolK0327/FishEnchantUnloader
 */
public class FEL implements CommandExecutor {
    private Plugin plugin;
    FEL(Plugin plugin){
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        /*
        Player player = (Player) sender;
        player.sendRawMessage("hihihi");
        ItemStack itemStack = player.getInventory().getItemInMainHand();
        Enchantment enchantment = Enchantment.PROTECTION_FALL;
        player.sendRawMessage(itemStack.getEnchantments().toString());
        FishEnchantUnloaderApi api= FishEnchantUnloaderApi.Factory.getTeleportAPI();
        //itemStack.getEnchantments().forEach((Enchantment,integer) -> api.UnloadEnchant(itemStack,Enchantment));
        return false;
        测试用
         */
        return false;
    }
}
