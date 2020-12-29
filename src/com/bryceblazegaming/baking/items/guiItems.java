package com.bryceblazegaming.baking.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class guiItems{

    public static ItemStack exitButton;
    public static ItemStack backButton;

    public static void init() {

        createExitButton();
        createBackButton();

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

    private static void createBackButton() {

        ItemStack item = new ItemStack(Material.ARROW, 1);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName("§f§lBack");
        meta.setLore(Collections.singletonList("§7Goes back to the main GUI."));
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        item.setItemMeta(meta);
        backButton = item;
    }

}
