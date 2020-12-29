package com.bryceblazegaming.baking.guis;

import com.bryceblazegaming.baking.items.ItemManager;
import com.bryceblazegaming.baking.items.guiItems;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;
import java.util.List;

public class recipesGUI implements InventoryHolder {

    private Inventory inv;

    public recipesGUI() {

        inv = Bukkit.createInventory(this, 9, "Recipes");//54 Max
        init();

    }

    private void init() {

        ItemStack item;

        //Flour
        item = ItemManager.createItem("§f§lFlour Recipe", Material.SUGAR, Collections.singletonList("§7Shows the recipe."), 0);
        inv.setItem(inv.firstEmpty(), item);

        //Butter
        item = ItemManager.createItem("§f§lButter Recipe", Material.BRICK, Collections.singletonList("§7Shows the recipe."), 1);
        inv.setItem(inv.firstEmpty(), item);

        //Dough
        item = ItemManager.createItem("§f§lDough Recipe", Material.LEATHER, Collections.singletonList("§7Shows the recipe."), 1);
        inv.setItem(inv.firstEmpty(), item);

        //Bread Dough
        item = ItemManager.createItem("§f§lBread Dough Recipe", Material.LEATHER, Collections.singletonList("§7Shows the recipe."), 2);
        inv.setItem(inv.firstEmpty(), item);

        //Cookie Dough
        item = ItemManager.createItem("§f§lCookie Dough Recipe", Material.LEATHER, Collections.singletonList("§7Shows the recipe."), 3);
        inv.setItem(inv.firstEmpty(), item);

        //Cake Batter
        item = ItemManager.createItem("§f§lCake Batter Recipe", Material.LEATHER, Collections.singletonList("§7Shows the recipe"), 4);
        inv.setItem(inv.firstEmpty(), item);

        //Exit Button
        item = guiItems.exitButton;
        inv.setItem(8, item);


    }

    @Override
    public Inventory getInventory() {
        return inv;
    }
}
