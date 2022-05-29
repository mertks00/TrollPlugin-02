package me.troll.troll.events;

import me.troll.troll.ItemBuilder;
import me.troll.troll.Troll;
import me.troll.troll.commands.VanisCommand;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class MenuListener implements Listener {

    Troll plugin;
    public MenuListener(Troll plugin) {
        this.plugin = plugin;
    }


    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {

        Player p = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA + "Troll Panel")) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;

            } else if (e.getCurrentItem().getType().equals(Material.SHEARS)) {
                this.plugin.ItemMenu(p);
            } else if (e.getCurrentItem().getType().equals(Material.ENDER_CHEST)) {
                this.plugin.KomutMenu(p);

            }


        }
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA + "Troll Itemler")) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;

            } else if (e.getCurrentItem().getType().equals(Material.TNT)) {
                ItemStack tnt = new ItemStack(Material.TNT, 64);
                p.getInventory().addItem(tnt);
                p.closeInventory();


            } else if (e.getCurrentItem().getType().equals(Material.ENDER_PEARL)) {
                ItemStack endp = new ItemStack(Material.ENDER_PEARL, 16);
                p.getInventory().addItem(endp);
                p.closeInventory();

            } else if (e.getCurrentItem().getType().equals(Material.FIREBALL)) {
                ItemStack frb = new ItemStack(Material.FIREBALL, 64);
                p.getInventory().addItem(frb);
                p.closeInventory();

            } else if (e.getCurrentItem().getType().equals(Material.FISHING_ROD)) {
                ItemStack olt = new ItemStack(Material.FISHING_ROD, 1);
                p.getInventory().addItem(olt);
                p.closeInventory();

            } else if (e.getCurrentItem().getType().equals(Material.SNOW_BALL)) {
                ItemStack snw = new ItemStack(Material.SNOW_BALL, 16);
                p.getInventory().addItem(snw);
                p.closeInventory();

            } else if (e.getCurrentItem().getType().equals(Material.EGG)) {
                ItemStack egg = new ItemStack(Material.EGG, 16);
                p.getInventory().addItem(egg);
                p.closeInventory();

            } else if (e.getCurrentItem().getType().equals(Material.MILK_BUCKET)) {
                ItemStack sut = new ItemStack(Material.MILK_BUCKET, 1);
                p.getInventory().addItem(sut);
                p.closeInventory();

            } else if (e.getCurrentItem().getType().equals(Material.STICK)) {
                ItemStack swd = new ItemBuilder(Material.STICK).setDisplayName(ChatColor.AQUA + "Süper Çubuk").addEnchant(Enchantment.KNOCKBACK, 10).build();
                p.getInventory().addItem(swd);
                p.closeInventory();

            }

        }
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA + "Troll Komutlar")) {
            e.setCancelled(true);
            if (e.getCurrentItem() == null) {
                return;

            } else if (e.getCurrentItem().getType().equals(Material.POTION)) {
                p.performCommand("vanish");
                p.closeInventory();
            } else if (e.getCurrentItem().getType().equals(Material.FEATHER)) {
                p.performCommand("fly");
                p.closeInventory();

            } else if (e.getCurrentItem().getType().equals(Material.COMPASS)) {
                p.performCommand("fakerestart");
                p.closeInventory();
                
            } else if (e.getCurrentItem().getType().equals(Material.QUARTZ)) {
                p.performCommand("hiz");

                
            }

        }
    }
}
