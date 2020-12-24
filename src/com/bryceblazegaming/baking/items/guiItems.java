package com.bryceblazegaming.baking.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class guiItems{

    public static ItemStack exitButton;

    public static void init() {

        createExitButton();

    }

    private static void createExitButton() {

        ItemStack item = new ItemStack(Material.BARRIER, 1);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName("§c§lExit");
        meta.setLore(Collections.singletonList("§7Exits the GUI."));
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        item.setItemMeta(meta);
        exitButton = item;

    }

}
