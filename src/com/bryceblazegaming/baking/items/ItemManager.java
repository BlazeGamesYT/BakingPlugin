package com.bryceblazegaming.baking.items;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack flour;
    public static ItemStack butter;
    public static ItemStack dough;
    public static ItemStack breadDough;
    public static ItemStack cookieDough;

    public static void init() {

        createFlour();
        createButter();
        createDough();
        createBreadDough();
        createCookieDough();

    }

    public static ItemStack createItem(String  name, Material mat, List<String> lore, int custommodeldata) {
        ItemStack item = new ItemStack(mat, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setCustomModelData(custommodeldata);
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public static void createFlour() {

        ItemStack item = new ItemStack(Material.SUGAR, 1);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName("§rFlour");
        List<String> lore = new ArrayList<>();

        lore.add("§7Baking XV");
        lore.add("");
        lore.add("§6Use to bake!");
        lore.add("");
        lore.add("§7§lCOMMON");
        meta.setLore(lore);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        item.setItemMeta(meta);
        flour = item;


        ShapelessRecipe recipe = new ShapelessRecipe(NamespacedKey.minecraft("flour"), item);
        recipe.addIngredient(1, Material.WHEAT);
        Bukkit.getServer().addRecipe(recipe);

    }

    public static void createButter() {

        ItemStack item = new ItemStack(Material.BRICK, 1);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName("§rButter");
        List<String> lore = new ArrayList<>();

        lore.add("§7Baking X");
        lore.add("");
        lore.add("§6Use to bake things!");
        lore.add("");
        lore.add("§7§lCOMMON");
        meta.setLore(lore);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setCustomModelData(1);

        item.setItemMeta(meta);

        butter = item;

        ShapelessRecipe recipe = new ShapelessRecipe(NamespacedKey.minecraft("butter"), item);
        recipe.addIngredient(1, Material.MILK_BUCKET);
        Bukkit.getServer().addRecipe(recipe);
    }

    public static void createDough() {

        ItemStack item = new ItemStack(Material.LEATHER, 1);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName("§rDough");
        List<String> lore = new ArrayList<>();

        lore.add("§7Baking IV");
        lore.add("");
        lore.add("§6Its dough.");
        lore.add("");
        lore.add("§7§lCOMMON");
        meta.setLore(lore);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setCustomModelData(1);

        item.setItemMeta(meta);
        dough = item;
        ShapedRecipe doughRecipe = new ShapedRecipe(NamespacedKey.minecraft("dough"), item);
        doughRecipe.shape(" F ",
                          "FEF",
                          " F ");
        doughRecipe.setIngredient('E', Material.WATER_BUCKET);
        doughRecipe.setIngredient('F', new RecipeChoice.ExactChoice(flour));
        Bukkit.addRecipe(doughRecipe);

    }

    public static void createBreadDough() {

        ItemStack item = new ItemStack(Material.LEATHER, 1);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName("§rBread Dough");
        List<String> lore = new ArrayList<>();

        lore.add("§7Baking II");
        lore.add("");
        lore.add("§6Cook it to make bread.");
        lore.add("");
        lore.add("§7§lCOMMON");
        meta.setLore(lore);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setCustomModelData(2);

        item.setItemMeta(meta);

        breadDough = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("bread_dough"), item);
        recipe.shape("   ",
                     "DDD",
                     "   ");
        recipe.setIngredient('D', new RecipeChoice.ExactChoice(dough));
        Bukkit.addRecipe(recipe);

        FurnaceRecipe smelt = new FurnaceRecipe(NamespacedKey.minecraft("bread_from_furnace"), new ItemStack(Material.BREAD, 1),
                new RecipeChoice.ExactChoice(breadDough), 3.0f, 30 * 20);
        Bukkit.addRecipe(smelt);

        SmokingRecipe smoke = new SmokingRecipe(NamespacedKey.minecraft("bread_from_smoker"), new ItemStack(Material.BREAD, 1),
                new RecipeChoice.ExactChoice(breadDough), 3.0f, 15 * 20);
        Bukkit.addRecipe(smoke);
    }

    public static void createCookieDough() {

        ItemStack item = new ItemStack(Material.LEATHER, 1);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName("§rBatch Of Cookie Dough");
        List<String> lore = new ArrayList<>();

        lore.add("§7Baking II");
        lore.add("");
        lore.add("§6Cook it to make cookies!");
        lore.add("");
        lore.add("§7§lCOMMON");
        meta.setLore(lore);

        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setCustomModelData(3);

        item.setItemMeta(meta);

        cookieDough = item;

        ShapelessRecipe recipe = new ShapelessRecipe(NamespacedKey.minecraft("cookie_dough"), item);
        recipe.addIngredient(new RecipeChoice.ExactChoice(dough));
        recipe.addIngredient(new RecipeChoice.ExactChoice(new ItemStack(Material.COCOA_BEANS, 1)));
        recipe.addIngredient(new RecipeChoice.ExactChoice(new ItemStack(Material.SUGAR, 1)));
        recipe.addIngredient(new RecipeChoice.ExactChoice(butter));

        FurnaceRecipe smelt = new FurnaceRecipe(NamespacedKey.minecraft("cookie_from_furnace"), new ItemStack(Material.COOKIE, 8),
                new RecipeChoice.ExactChoice(cookieDough), 6.0f, 30 * 20);

        SmokingRecipe smoke = new SmokingRecipe(NamespacedKey.minecraft("cookie_from_furnace"), new ItemStack(Material.COOKIE, 8),
                new RecipeChoice.ExactChoice(cookieDough), 2.0f, 10 * 20);

        Bukkit.addRecipe(recipe);
        Bukkit.addRecipe(smelt);
        Bukkit.addRecipe(smoke);

    }


}
