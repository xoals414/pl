package kr.kro.woolbeak.minigame;

import org.bukkit.plugin.java.JavaPlugin;

public final class Minigame extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("미니게임").setExecutor(new command());
        getCommand("미니게임시작").setExecutor(new command2());
        getCommand("미니게임자동설정").setExecutor(new command3());
        getLogger().info("미니게임 플러그인 정삭 작동");
    }

    @Override
    public void onDisable() {
        getLogger().info("미니게임 플러그인 종료");
    }
}
