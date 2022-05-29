package me.troll.troll.commands;

import me.troll.troll.Troll;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commands implements CommandExecutor {

    Troll plugin;
    public commands(Troll plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("troll.admin")) {
                this.plugin.AnaMenu(player);

            }

        }


        return true;

    }




}




