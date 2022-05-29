package me.troll.troll.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FlyCommand implements CommandExecutor {

    private List<UUID> fly = new  ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (player.hasPermission("troll.admin")) {

                if (fly.contains(player.getUniqueId())) {
                    fly.remove(player.getUniqueId());

                    player.setAllowFlight(false);
                    player.sendMessage(ChatColor.GREEN+"Uçma DeAktif.");

                }else {
                    fly.add(player.getUniqueId());

                    player.setAllowFlight(true);
                    player.sendMessage(ChatColor.GREEN+"Uçma Aktif.");
                }

            }

        }



        return true;
    }
}
