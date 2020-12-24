package com.bryceblazegaming.baking.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class bakingEvents implements Listener {


    @EventHandler
    public static void onJoin(PlayerJoinEvent event) {

        event.getPlayer().setResourcePack("https://www.dropbox.com/sh/vg2432oci74qxhc/AACIX_jYfB__ueuPrtNYkRbqa?dl=1");

    }

}
