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

public class VisiblePlayer implements CommandExecutor {

    private List<UUID> visible = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.hasPermission("troll.admin")) {

                if (visible.contains(player.getUniqueId())) {
                    visible.remove(player.getUniqueId());

                    for (Player target : Bukkit.getOnlinePlayers()) {
                        player.showPlayer(target);

                    }
                    player.sendMessage(ChatColor.GREEN + "Oyuncolar Görünür.");

                } else {
                    visible.add(player.getUniqueId());
                    for (Player target : Bukkit.getOnlinePlayers()) {
                        player.hidePlayer(target);
                    }

                    player.sendMessage(ChatColor.GREEN + "Oyuncolar Gizli.");
                }
            }
        }
        return true;
    }
}
