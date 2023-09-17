package kr.kro.woolbeak.minigame;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class command3 implements CommandExecutor {

        @Override
        public boolean onCommand(@NotNull CommandSender Sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
            Player p = (Player) Sender;
            p.sendMessage("미니게임 플러그인 자동설정을 시작합니다.");
            return false;
            }
        }