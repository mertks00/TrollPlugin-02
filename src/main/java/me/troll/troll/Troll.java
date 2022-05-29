package me.troll.troll;

import me.troll.troll.commands.*;
import me.troll.troll.events.MenuListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

import java.util.Collections;

public final class Troll extends JavaPlugin implements CommandExecutor, Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic


        getCommand("troll").setExecutor(new commands(this));
        getCommand("fakerestart").setExecutor(this);
        getCommand("vanish").setExecutor(new VanisCommand());
        getCommand("fly").setExecutor(new FlyCommand());
        getServer().getPluginManager().registerEvents(new MenuListener(this), this);


    }

    public void AnaMenu(Player player) {

        Inventory ana = Bukkit.createInventory(player, 27, ChatColor.AQUA + "Troll Panel");

        ItemStack items = new ItemStack(Material.SHEARS);
        ItemMeta items_meta = items.getItemMeta();
        items_meta.setDisplayName(ChatColor.AQUA + "ITEMLER");
        items_meta.setLore(Collections.singletonList(ChatColor.WHITE + "➥" + ChatColor.GRAY + " Tıkla Ve Gör."));
        items.setItemMeta(items_meta);

        //
        ItemStack commands = new ItemStack(Material.ENDER_CHEST);
        ItemMeta commands_meta = commands.getItemMeta();
        commands_meta.setDisplayName(ChatColor.GREEN + "KOMUTLAR");
        commands_meta.setLore(Collections.singletonList(ChatColor.WHITE + "➥" + ChatColor.GRAY + " Tıkla Ve Gör."));
        commands.setItemMeta(commands_meta);


        ana.setItem(12, items);
        ana.setItem(14, commands);
        player.openInventory(ana);

    }

    public void ItemMenu(Player player) {

        Inventory itemler = Bukkit.createInventory(player, 36, ChatColor.AQUA + "Troll Itemler");

        ItemStack tnt = new ItemBuilder(Material.TNT).build();
        ItemStack endp = new ItemBuilder(Material.ENDER_PEARL).build();
        ItemStack olt = new ItemBuilder(Material.FISHING_ROD).build();
        ItemStack frb = new ItemBuilder(Material.FIREBALL).build();
        ItemStack mlck = new ItemBuilder(Material.MILK_BUCKET).build();
        ItemStack snw = new ItemBuilder(Material.SNOW_BALL).build();
        ItemStack egg = new ItemBuilder(Material.EGG).build();
        ItemStack swd = new ItemBuilder(Material.STICK).setDisplayName(ChatColor.AQUA + "Süper Çubuk").setGlow(true).build();

        itemler.setItem(10, tnt);
        itemler.setItem(11, endp);
        itemler.setItem(12, olt);
        itemler.setItem(13, frb);
        itemler.setItem(14, mlck);
        itemler.setItem(15, snw);
        itemler.setItem(16, egg);
        itemler.setItem(19, swd);

        player.openInventory(itemler);


    }

    public void KomutMenu(Player player) {

        Inventory komutlar = Bukkit.createInventory(player, 36, ChatColor.AQUA + "Troll Komutlar");

        ItemStack pearl = new ItemBuilder(Material.POTION)
                .setDisplayName(ChatColor.GRAY + "(" + ChatColor.YELLOW + "Görünmezlik" + ChatColor.GRAY + ")")
                .build();
        ItemStack speed = new ItemBuilder(Material.QUARTZ).setDisplayName(ChatColor.GOLD + "Speed " + ChatColor.GRAY + "(" + ChatColor.DARK_GREEN + "Hız" + ChatColor.GRAY + ")").build();
        ItemStack fly = new ItemBuilder(Material.FEATHER).setDisplayName(ChatColor.RED + "Fly " + ChatColor.GRAY + "(" + ChatColor.LIGHT_PURPLE + "Uçma" + ChatColor.GRAY + ")").build();
        ItemStack frestart = new ItemBuilder(Material.COMPASS).setDisplayName(ChatColor.GREEN + "Fake Restart").build();

        komutlar.setItem(11, fly);
        komutlar.setItem(10, pearl);
        komutlar.setItem(13, speed);
        komutlar.setItem(12, frestart);

        player.openInventory(komutlar);

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("troll.admin")) {

                Bukkit.broadcastMessage("                                             ");
                Bukkit.broadcastMessage(ChatColor.YELLOW + "> " + ChatColor.GREEN + "Sunucu " + ChatColor.YELLOW + "1 " + ChatColor.GREEN + "dakika içerisinde yeniden başlıycaktır!");
                Bukkit.broadcastMessage("                                             ");

                Bukkit.getScheduler().runTaskLater(this, () -> {
                    Bukkit.broadcastMessage("                                             ");
                    Bukkit.broadcastMessage(ChatColor.YELLOW + "> " + ChatColor.GREEN + "Sunucu " + ChatColor.YELLOW + "45 " + ChatColor.GREEN + "saniye içerisinde yeniden başlıycaktır!");
                    Bukkit.broadcastMessage("                                             ");
                    Bukkit.getScheduler().runTaskLater(this, () -> {
                        Bukkit.broadcastMessage("                                             ");
                        Bukkit.broadcastMessage(ChatColor.YELLOW + "> " + ChatColor.GREEN + "Sunucu " + ChatColor.YELLOW + "30 " + ChatColor.GREEN + "saniye içerisinde yeniden başlıycaktır!");
                        Bukkit.broadcastMessage("                                             ");
                        Bukkit.getScheduler().runTaskLater(this, () -> {
                            Bukkit.broadcastMessage("                                             ");
                            Bukkit.broadcastMessage(ChatColor.YELLOW + "> " + ChatColor.GREEN + "Sunucu " + ChatColor.YELLOW + "15 " + ChatColor.GREEN + "saniye içerisinde yeniden başlıycaktır!");
                            Bukkit.broadcastMessage("                                             ");
                            Bukkit.getScheduler().runTaskLater(this, () -> {
                                Bukkit.broadcastMessage("                                             ");
                                Bukkit.broadcastMessage(ChatColor.YELLOW + "> " + ChatColor.GREEN + "Sunucu " + ChatColor.YELLOW + "10 " + ChatColor.GREEN + "saniye içerisinde yeniden başlıycaktır!");
                                Bukkit.broadcastMessage("                                             ");
                                Bukkit.getScheduler().runTaskLater(this, () -> {
                                    Bukkit.broadcastMessage("                                             ");
                                    Bukkit.broadcastMessage(ChatColor.YELLOW + "> " + ChatColor.GREEN + "Sunucu " + ChatColor.YELLOW + "9 " + ChatColor.GREEN + "saniye içerisinde yeniden başlıycaktır!");
                                    Bukkit.broadcastMessage("                                             ");
                                    Bukkit.getScheduler().runTaskLater(this, () -> {
                                        Bukkit.broadcastMessage("                                             ");
                                        Bukkit.broadcastMessage(ChatColor.YELLOW + "> " + ChatColor.GREEN + "Sunucu " + ChatColor.YELLOW + "8 " + ChatColor.GREEN + "saniye içerisinde yeniden başlıycaktır!");
                                        Bukkit.broadcastMessage("                                             ");
                                        Bukkit.getScheduler().runTaskLater(this, () -> {
                                            Bukkit.broadcastMessage("                                             ");
                                            Bukkit.broadcastMessage(ChatColor.YELLOW + "> " + ChatColor.GREEN + "Sunucu " + ChatColor.YELLOW + "7 " + ChatColor.GREEN + "saniye içerisinde yeniden başlıycaktır!");
                                            Bukkit.broadcastMessage("                                             ");
                                            Bukkit.getScheduler().runTaskLater(this, () -> {
                                                Bukkit.broadcastMessage("                                             ");
                                                Bukkit.broadcastMessage(ChatColor.YELLOW + "> " + ChatColor.GREEN + "Sunucu " + ChatColor.YELLOW + "6 " + ChatColor.GREEN + "saniye içerisinde yeniden başlıycaktır!");
                                                Bukkit.broadcastMessage("                                             ");
                                                Bukkit.getScheduler().runTaskLater(this, () -> {
                                                    Bukkit.broadcastMessage("                                             ");
                                                    Bukkit.broadcastMessage(ChatColor.YELLOW + "> " + ChatColor.GREEN + "Sunucu " + ChatColor.YELLOW + "5 " + ChatColor.GREEN + "saniye içerisinde yeniden başlıycaktır!");
                                                    Bukkit.broadcastMessage("                                             ");
                                                    Bukkit.getScheduler().runTaskLater(this, () -> {
                                                        Bukkit.broadcastMessage("                                             ");
                                                        Bukkit.broadcastMessage(ChatColor.YELLOW + "> " + ChatColor.GREEN + "Sunucu " + ChatColor.YELLOW + "4 " + ChatColor.GREEN + "saniye içerisinde yeniden başlıycaktır!");
                                                        Bukkit.broadcastMessage("                                             ");
                                                        Bukkit.getScheduler().runTaskLater(this, () -> {
                                                            Bukkit.broadcastMessage("                                             ");
                                                            Bukkit.broadcastMessage(ChatColor.YELLOW + "> " + ChatColor.GREEN + "Sunucu " + ChatColor.YELLOW + "3 " + ChatColor.GREEN + "saniye içerisinde yeniden başlıycaktır!");
                                                            Bukkit.broadcastMessage("                                             ");
                                                            Bukkit.getScheduler().runTaskLater(this, () -> {
                                                                Bukkit.broadcastMessage("                                             ");
                                                                Bukkit.broadcastMessage(ChatColor.YELLOW + "> " + ChatColor.GREEN + "Sunucu " + ChatColor.YELLOW + "2 " + ChatColor.GREEN + "saniye içerisinde yeniden başlıycaktır!");
                                                                Bukkit.broadcastMessage("                                             ");
                                                                Bukkit.getScheduler().runTaskLater(this, () -> {
                                                                    Bukkit.broadcastMessage("                                             ");
                                                                    Bukkit.broadcastMessage(ChatColor.YELLOW + "> " + ChatColor.GREEN + "Sunucu " + ChatColor.YELLOW + "1 " + ChatColor.GREEN + "saniye içerisinde yeniden başlıycaktır!");
                                                                    Bukkit.broadcastMessage("                                             ");
                                                                    Bukkit.getScheduler().runTaskLater(this, () -> {
                                                                        Bukkit.broadcastMessage("                                             ");
                                                                        Bukkit.broadcastMessage("                                             ");
                                                                        Bukkit.broadcastMessage("                                             ");
                                                                        Bukkit.broadcastMessage("                                             ");
                                                                        Bukkit.broadcastMessage("                                             ");
                                                                        Bukkit.broadcastMessage(ChatColor.YELLOW + "> " + ChatColor.GREEN + "Sunucu " + ChatColor.GREEN + "yeniden başlıyor!");
                                                                        Bukkit.broadcastMessage("                                             ");
                                                                        Bukkit.broadcastMessage("                                             ");
                                                                        Bukkit.broadcastMessage("                                             ");
                                                                        Bukkit.broadcastMessage("                                             ");
                                                                        Bukkit.broadcastMessage("                                             ");
                                                                        Bukkit.getScheduler().runTaskLater(this, () -> {
                                                                            Bukkit.broadcastMessage("                                             ");
                                                                            Bukkit.broadcastMessage("                                             ");
                                                                            Bukkit.broadcastMessage("                                             ");
                                                                            Bukkit.broadcastMessage("                                             ");
                                                                            Bukkit.broadcastMessage("                                             ");
                                                                            Bukkit.broadcastMessage("                                             ");
                                                                            Bukkit.broadcastMessage("                                             ");
                                                                            Bukkit.broadcastMessage("                                             ");
                                                                            Bukkit.broadcastMessage("                                             ");
                                                                            Bukkit.broadcastMessage("                                             ");
                                                                            Bukkit.broadcastMessage("                                             ");
                                                                            Bukkit.getScheduler().runTaskLater(this, () -> {
                                                                                Bukkit.broadcastMessage("                                             ");
                                                                                Bukkit.broadcastMessage("                                             ");
                                                                                Bukkit.broadcastMessage("                                             ");
                                                                                Bukkit.broadcastMessage("                                             ");
                                                                                Bukkit.broadcastMessage("                                             ");
                                                                                Bukkit.broadcastMessage(ChatColor.YELLOW + "> " + ChatColor.GREEN + "Tüm Server Yetkililer Tarafından Trollendi!");
                                                                                Bukkit.broadcastMessage("                                             ");
                                                                                Bukkit.broadcastMessage("                                             ");
                                                                                Bukkit.broadcastMessage("                                             ");
                                                                                Bukkit.broadcastMessage("                                             ");
                                                                                Bukkit.broadcastMessage("                                             ");
                                                                            }, 20);
                                                                        }, 20);
                                                                    }, 20);
                                                                }, 20);
                                                            }, 20);
                                                        }, 20);
                                                    }, 20);
                                                }, 20);
                                            }, 20);
                                        }, 20);
                                    }, 20);
                                }, 20);
                            }, 100);
                        }, 300);
                    }, 300);
                }, 300);

            }

        }
        return true;
    }

}




