package com.bryceblazegaming.baking.guis.recipes;

import com.bryceblazegaming.baking.items.ItemManager;
import com.bryceblazegaming.baking.items.guiItems;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class butterRecipeGUI implements InventoryHolder {
    private Inventory inv;

    public butterRecipeGUI() {

        inv = Bukkit.createInventory(this, 27, "Butter");
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

        lore.add("§fButter");
        lore.add("§f§oShapeless");

        item = ItemManager.createItem("§f§lCrafting Recipe", Material.CRAFTING_TABLE, lore, 0);
        inv.setItem(10, item);

        //Result
        item = ItemManager.butter;
        inv.setItem(16, item);

        //Recipe
        item = new ItemStack(Material.MILK_BUCKET, 1);
        inv.setItem(13, item);

        //Exit Button
        item = guiItems.exitButton;
        inv.setItem(26, item);

        //Back Button
        item = guiItems.backButton;
        inv.setItem(18, item);

    }

    @Override
    public Inventory getInventory() {
        return inv;
    }
}
