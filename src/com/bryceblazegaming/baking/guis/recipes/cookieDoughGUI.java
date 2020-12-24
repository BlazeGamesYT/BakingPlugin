package com.bryceblazegaming.baking.guis.recipes;

import com.bryceblazegaming.baking.items.ItemManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class cookieDoughGUI implements InventoryHolder {
    private Inventory inv;

    public cookieDoughGUI() {

        inv = Bukkit.createInventory(this, 27, "Cookie Dough");
        init();

    }

    private void init() {

        ItemStack item;

        //Glass Panes
        item = ItemManager.createItem(" ", Material.BLACK_STAINED_GLASS_PANE, Collections.singletonList(" "), 0);
        ItemStack air = new ItemStack(Material.AIR, 1);

        //First line
        inv.setItem(inv.firstEmpty(), item);
        inv.setItem(inv.firstEmpty(), item);
        inv.setItem(inv.firstEmpty(), item);
        inv.setItem(6, item);
        inv.setItem(7, item);
        inv.setItem(8, item);

        //Second line
        inv.setItem(9, item);
        inv.setItem(11, item);
        inv.setItem(15, item);
        inv.setItem(17, item);

        //Last line
        inv.setItem(18, item);
        inv.setItem(19, item);
        inv.setItem(20, item);
        inv.setItem(24, item);
        inv.setItem(25, item);
        inv.setItem(26, item);

        //Recipe Type
        List<String> lore = new ArrayList<>();

        lore.add("§fCookie Dough");
        lore.add("§f§oShapeless");

        item = ItemManager.createItem("§f§lCrafting Recipe", Material.CRAFTING_TABLE, lore, 0);
        inv.setItem(10, item);

        //Result
        item = ItemManager.cookieDough;
        inv.setItem(16, item);

        //Recipe
        item = ItemManager.dough;
        inv.setItem(13, item);

        item = new ItemStack(Material.SUGAR, 1);
        inv.setItem(5, item);
        item = new ItemStack(Material.COCOA_BEANS, 1);
        inv.setItem(14, item);
        item = ItemManager.butter;
        inv.setItem(23, item);

    }

    @Override
    public Inventory getInventory() {
        return inv;
    }
}
