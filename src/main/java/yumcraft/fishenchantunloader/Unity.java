package yumcraft.fishenchantunloader;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Map;

/**
 * @author: Ayolk
 * @create: 2023-03-19 15:00
 * @url: github.com/AyolK0327/FishEnchantUnloader
 */
public class Unity implements FishEnchantUnloaderApi {
    @Override
    public void UnloadEnchant(ItemStack itemStack, Enchantment enchantment) {
        Map<Enchantment, Integer> itemStackEnchantments = itemStack.getEnchantments();
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.getEnchants();
        itemStackEnchantments.forEach((Enchantment,Integer) ->
                {
                    if (Enchantment.equals(enchantment) ) {
                        itemMeta.removeEnchant(Enchantment);
                    }
                }
        );
        itemStack.setItemMeta(itemMeta);
    }

    @Override
    public void UnloadEnchant(ItemStack itemStack, Enchantment enchantment, Boolean getBook) {

    }


    @Override
    public void getUnloadEnchantBook(ItemStack itemStack, Enchantment enchantment, Player player) {

    }

}
