package com.bryceblazegaming.baking;

import com.bryceblazegaming.baking.commands.bakingCommands;
import com.bryceblazegaming.baking.events.bakingEvents;
import com.bryceblazegaming.baking.events.guiEvents;
import com.bryceblazegaming.baking.items.ItemManager;
import com.bryceblazegaming.baking.items.guiItems;
import com.bryceblazegaming.baking.methods.RecipeRemover;
import org.bukkit.plugin.java.JavaPlugin;

public class baking extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new bakingEvents(), this);
        getServer().getPluginManager().registerEvents(new guiEvents(), this);
        getCommand("recipes").setExecutor(new bakingCommands());
        guiItems.init();
        ItemManager.init();
        RecipeRemover.init();

    }

    @Override
    public void onDisable() {



    }

}