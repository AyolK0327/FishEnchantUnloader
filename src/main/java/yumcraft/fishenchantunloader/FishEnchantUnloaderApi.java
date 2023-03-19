package yumcraft.fishenchantunloader;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * @author: Ayolk
 * @create: 2023-03-19 14:57
 * @url: github.com/AyolK0327/FishEnchantUnloader
 */
public interface FishEnchantUnloaderApi {
    void UnloadEnchant(ItemStack itemStack, Enchantment enchantment);
    void UnloadEnchant(ItemStack itemStack, Enchantment enchantment,Boolean getBook);
    void getUnloadEnchantBook(ItemStack itemStack, Enchantment enchantment, Player player);



    public static class Factory {
        private static FishEnchantUnloaderApi instance = null;

        public Factory() {
        }

        public static FishEnchantUnloaderApi getTeleportAPI() {
            if (instance == null) {
                instance = new Unity();
            }

            return instance;
        }
    }
}
