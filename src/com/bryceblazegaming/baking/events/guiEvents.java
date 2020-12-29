package com.bryceblazegaming.baking.events;

import com.bryceblazegaming.baking.guis.recipes.*;
import com.bryceblazegaming.baking.guis.recipesGUI;
import com.bryceblazegaming.baking.items.ItemManager;
import com.bryceblazegaming.baking.items.guiItems;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class guiEvents implements Listener {

    @EventHandler
    public static void onClick(InventoryClickEvent event) {
        //Boring Setup

        if (event.getClickedInventory() == null) { return; }
        if (event.getClickedInventory().getHolder() instanceof recipesGUI) {
            event.setCancelled(true);
            Player player = (Player) event.getWhoClicked();
            if (event.getCurrentItem() == null) { return; }

            if (event.getCurrentItem().getType() == Material.BARRIER) {
                player.closeInventory();
            }

            if (event.getCurrentItem().getType() == Material.ARROW) {
                if (event.getClickedInventory().getHolder() instanceof flourRecipeGUI || event.getClickedInventory().getHolder() instanceof doughRecipeGUI || event.getClickedInventory().getHolder() instanceof butterRecipeGUI || event.getClickedInventory().getHolder() instanceof breadDoughGUI || event.getClickedInventory().getHolder() instanceof cookieDoughGUI) {
                    recipesGUI gui = new recipesGUI();
                    player.openInventory(gui.getInventory());
                }
            }

            // Buttons
            if (event.getCurrentItem().getType() == Material.SUGAR) {
                flourRecipeGUI gui = new flourRecipeGUI();
                player.openInventory(gui.getInventory());
                player.sendMessage(ChatColor.AQUA + "This is the flour recipe!");
            }

            if (event.getCurrentItem().getType() == Material.BRICK) {

                butterRecipeGUI gui = new butterRecipeGUI();
                player.openInventory(gui.getInventory());
                player.sendMessage(ChatColor.AQUA + "This is the butter recipe!");

            }

            if (event.getCurrentItem().getType() == Material.LEATHER) {
                if (event.getCurrentItem().getItemMeta().getCustomModelData() == 1) {
                    doughRecipeGUI gui = new doughRecipeGUI();
                    player.openInventory(gui.getInventory());
                    player.sendMessage(ChatColor.AQUA + "This is the dough recipe!");
                }
            }

            if (event.getCurrentItem().getType() == Material.LEATHER) {
                if (event.getCurrentItem().getItemMeta().getCustomModelData() == 2) {
                    breadDoughGUI gui = new breadDoughGUI();
                    player.openInventory(gui.getInventory());
                    player.sendMessage(ChatColor.AQUA + "This is the bread dough recipe!");
                }
            }

            if (event.getCurrentItem().getType() == Material.LEATHER) {
                if (event.getCurrentItem().getItemMeta().getCustomModelData() == 3) {
                    cookieDoughGUI gui = new cookieDoughGUI();
                    player.openInventory(gui.getInventory());
                    player.sendMessage(ChatColor.AQUA + "This is the cookie dough recipe!");
                }
            }

            if (event.getCurrentItem().getType() == Material.LEATHER) {
                if (event.getCurrentItem().getItemMeta().getCustomModelData() == 4) {
                    cakeBatterGUI gui = new cakeBatterGUI();
                    player.openInventory(gui.getInventory());
                    player.sendMessage(ChatColor.AQUA + "This is the cake batter recipe!");
                }
            }

        }

        else if (event.getClickedInventory().getHolder() instanceof flourRecipeGUI) {
            Player player = (Player) event.getWhoClicked();
            event.setCancelled(true);

            if (event.getCurrentItem() == guiItems.exitButton) {
                player.closeInventory();
            }

            if (event.getCurrentItem() == guiItems.backButton) {
                recipesGUI gui = new recipesGUI();
                player.openInventory(gui.getInventory());
            }
        }
        else if (event.getClickedInventory().getHolder() instanceof butterRecipeGUI) {
            Player player = (Player) event.getWhoClicked();
            event.setCancelled(true);

            if (event.getCurrentItem() == guiItems.exitButton) {
                player.closeInventory();
            }

            if (event.getCurrentItem() == guiItems.backButton) {
                recipesGUI gui = new recipesGUI();
                player.openInventory(gui.getInventory());
            }
        }
        else if (event.getClickedInventory().getHolder() instanceof doughRecipeGUI) {
            Player player = (Player) event.getWhoClicked();
            event.setCancelled(true);

            if (event.getCurrentItem() == guiItems.exitButton) {
                player.closeInventory();
            }

            if (event.getCurrentItem() == guiItems.backButton) {
                recipesGUI gui = new recipesGUI();
                player.openInventory(gui.getInventory());
            }
        }
        else if (event.getClickedInventory().getHolder() instanceof breadDoughGUI) {
            Player player = (Player) event.getWhoClicked();
            event.setCancelled(true);

            if (event.getCurrentItem() == guiItems.exitButton) {
                player.closeInventory();
            }

            if (event.getCurrentItem() == guiItems.backButton) {
                recipesGUI gui = new recipesGUI();
                player.openInventory(gui.getInventory());
            }
        }
        else if (event.getClickedInventory().getHolder() instanceof cookieDoughGUI) {
            Player player = (Player) event.getWhoClicked();
            event.setCancelled(true);

            if (event.getCurrentItem() == guiItems.exitButton) {
                player.closeInventory();
            }

            if (event.getCurrentItem() == guiItems.backButton) {
                recipesGUI gui = new recipesGUI();
                player.openInventory(gui.getInventory());
            }
        }
        else if (event.getClickedInventory().getHolder() instanceof cakeBatterGUI) {
            Player player = (Player) event.getWhoClicked();
            event.setCancelled(true);

            if (event.getCurrentItem() == guiItems.exitButton) {
                player.closeInventory();
            }

            if (event.getCurrentItem() == guiItems.backButton) {
                recipesGUI gui = new recipesGUI();
                player.openInventory(gui.getInventory());
            }
        }
    }

}
