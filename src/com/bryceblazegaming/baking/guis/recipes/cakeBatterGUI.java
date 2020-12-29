package com.bryceblazegaming.baking.guis.recipes;

import com.bryceblazegaming.baking.items.ItemManager;
import com.bryceblazegaming.baking.items.guiItems;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;

import java.util.Collections;

public class cakeBatterGUI implements InventoryHolder {
    private Inventory inv;

    public cakeBatterGUI() {

        inv = Bukkit.createInventory(this, 27, "Cake Batter");
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
        item = ItemManager.createItem("§f§lCrafting Recipe", Material.CRAFTING_TABLE, Collections.singletonList("§fCake Batter"), 0);
        inv.setItem(10, item);

        //Result
        item = ItemManager.cakeBatter;
        inv.setItem(16, item);

        //Recipe
        item = ItemManager.dough;
        inv.setItem(12, item);
        inv.setItem(13, item);
        inv.setItem(14, item);
        inv.setItem(21, item);
        inv.setItem(22, item);
        inv.setItem(23, item);

        item = ItemManager.butter;
        inv.setItem(3, item);
        item = new ItemStack(Material.EGG, 1);
        inv.setItem(4, item);
        item = new ItemStack(Material.SUGAR, 1);
        inv.setItem(5, item);

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