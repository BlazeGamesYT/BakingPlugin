package com.bryceblazegaming.baking.commands;

import com.bryceblazegaming.baking.guis.recipes.*;
import com.bryceblazegaming.baking.guis.recipesGUI;
import com.bryceblazegaming.baking.items.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class bakingCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("Only players can open GUIS");
            return true;
        }

        Player player = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("recipes")) {
            if(args.length >= 1) {

                String firstArg = args[0];

                if (firstArg.equalsIgnoreCase("flour")) {

                    flourRecipeGUI gui = new flourRecipeGUI();
                    player.openInventory(gui.getInventory());
                    player.sendMessage(ChatColor.AQUA + "This is the flour recipe!");

                }

                if (firstArg.equalsIgnoreCase("butter")) {

                    butterRecipeGUI gui = new butterRecipeGUI();
                    player.openInventory(gui.getInventory());
                    player.sendMessage(ChatColor.AQUA + "This is the butter recipe!");

                }

                if (firstArg.equalsIgnoreCase("dough")) {

                    doughRecipeGUI gui = new doughRecipeGUI();
                    player.openInventory(gui.getInventory());
                    player.sendMessage(ChatColor.AQUA + "This is the dough recipe!");

                }

                if (firstArg.equalsIgnoreCase("breaddough")) {

                    breadDoughGUI gui = new breadDoughGUI();
                    player.openInventory(gui.getInventory());
                    player.sendMessage(ChatColor.AQUA + "This is the bread dough recipe!");

                }

                if (firstArg.equalsIgnoreCase("cookiedough")) {

                    cookieDoughGUI gui = new cookieDoughGUI();
                    player.openInventory(gui.getInventory());
                    player.sendMessage(ChatColor.AQUA + "This is the cookie dough recipe!");

                }

                if (firstArg.equalsIgnoreCase("cakebatter")) {

                    cakeBatterGUI gui = new cakeBatterGUI();
                    player.openInventory(gui.getInventory());
                    player.sendMessage(ChatColor.AQUA + "This is the cake batter recipe!");

                }

            }
            else {
                recipesGUI gui = new recipesGUI();
                player.openInventory(gui.getInventory());
                player.sendMessage(ChatColor.AQUA + "Click an item to see its recipe!");
            }
        }

        if (cmd.getName().equalsIgnoreCase("bgive")) {

            if(args.length >= 1) {

                String firstArg = args[0];

                if (firstArg.equalsIgnoreCase("flour")) {

                    player.getInventory().addItem(ItemManager.flour);

                }

                if (firstArg.equalsIgnoreCase("butter")) {

                    player.getInventory().addItem(ItemManager.butter);

                }

                if (firstArg.equalsIgnoreCase("dough")) {

                    player.getInventory().addItem(ItemManager.dough);

                }

                if (firstArg.equalsIgnoreCase("breaddough")) {

                    player.getInventory().addItem(ItemManager.breadDough);

                }

                if (firstArg.equalsIgnoreCase("cookiedough")) {

                    player.getInventory().addItem(ItemManager.cookieDough);

                }

                if (firstArg.equalsIgnoreCase("cakebatter")) {

                    player.getInventory().addItem(ItemManager.cakeBatter);

                }

                if (firstArg.equalsIgnoreCase("piecrust")) {

                    //TODO give the pie crust

                }

            }
            else {

                player.sendMessage("Please type the item you want!");

            }

        }
        return true;
    }
}
