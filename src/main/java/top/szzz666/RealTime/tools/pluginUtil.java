package top.szzz666.RealTime.tools;

import cn.nukkit.utils.TextFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static top.szzz666.RealTime.RealTimeMain.plugin;

public class pluginUtil {
    //获得对应现实的游戏时间
    public static int getGameTimeFromRealTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        String formattedDateTime = now.format(formatter);
        String[] timeSplit = formattedDateTime.split(":");
        int timeMinute = Integer.parseInt(timeSplit[0]) * 60 + Integer.parseInt(timeSplit[1]);
        return 18000 + (timeMinute * 50 / 3);
    }
    //将输入的字符串按行打印到控制台。
    public static void lineConsole(String s){
        String[] lines = s.split("\n");
        for (String line : lines) {
            nkConsole(line);
        }
    }
    //使用nk插件的控制台输出
    public static void nkConsole(String msg) {
        plugin.getLogger().info(TextFormat.colorize('&', msg));
    }
    public static void nkConsole(String msg, int typeNum) {
        if(typeNum == 1) {
            plugin.getLogger().warning(TextFormat.colorize('&', msg));
        }else if(typeNum == 2) {
            plugin.getLogger().error(TextFormat.colorize('&', msg));
        }else {
            plugin.getLogger().info(TextFormat.colorize('&', msg));
        }
    }
}
