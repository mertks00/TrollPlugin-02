package me.troll.troll.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class VanisCommand implements CommandExecutor {

    private List<UUID> vanish = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.hasPermission("troll.admin")) {

                if (vanish.contains(player.getUniqueId())) {
                    vanish.remove(player.getUniqueId());

                    for (Player target : Bukkit.getOnlinePlayers()) {
                        target.showPlayer(player);

                    }
                    player.sendMessage(ChatColor.GREEN + "Artık Görünürsün.");

                } else {
                    vanish.add(player.getUniqueId());
                    for (Player target : Bukkit.getOnlinePlayers()) {
                        target.hidePlayer(player);
                    }

                    player.sendMessage(ChatColor.GREEN + "Artık Görünmezsin.");
                }
            }
        }
        return true;
    }

}
