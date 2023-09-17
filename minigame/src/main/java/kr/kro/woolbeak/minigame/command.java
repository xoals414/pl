package kr.kro.woolbeak.minigame;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class command implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender Sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player p = (Player) Sender;
        if (args.length == 0) {
            p.sendMessage("§l§a[----------]");
            p.sendMessage("§l§a[§b미니게임 플러그인§a]");
            p.sendMessage("§l§a[§c/미니게임시작 (설정)§a]");
            p.sendMessage("§l§a[§c/미니게임자동설정§a]");
        }
        return false;
    }
}