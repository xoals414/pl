package kr.kro.woolbeak.minigame;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;

public class command2 implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender Sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player p = (Player) Sender;
        if (args.length == 0) {
            p.sendMessage("§l§a/미니게임시작 (설정)");
        }else{
            p.sendMessage("§l§e----------");
            p.sendMessage("§l§a미니게임 플러그인");
            p.sendMessage("§l§e----------");
            p.sendMessage("§l§b미니게임 §f: §b머더");
            p.sendMessage("§l§e----------");
            p.sendMessage("§l§c맵 출저 : ");
            p.sendMessage("§l§e----------");
            p.sendMessage("§l§3 미니게임 시작");
            p.teleport(Bukkit.getWorld("murder").getSpawnLocation());
            }
        return false;
    }
}
