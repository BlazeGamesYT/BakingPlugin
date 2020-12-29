package com.bryceblazegaming.baking.methods;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;

public class RecipeRemover {

    public static void init(){

        removeRecipes();

    }


    private static void removeRecipes() {

        Bukkit.getServer().removeRecipe(NamespacedKey.minecraft("bread"));
        Bukkit.getServer().removeRecipe(NamespacedKey.minecraft("cookie"));
        Bukkit.getServer().removeRecipe(NamespacedKey.minecraft("cake"));

    }


}
