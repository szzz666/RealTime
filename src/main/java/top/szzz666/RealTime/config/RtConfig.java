package top.szzz666.RealTime.config;

import cn.nukkit.level.Level;
import cn.nukkit.utils.Config;

import java.util.ArrayList;

import static top.szzz666.RealTime.RealTimeMain.*;

public class RtConfig {
    public static String ReloadCmd;
    public static int TaskDelay;
    public static ArrayList<String> WorldStrList = new ArrayList<>();
    public static boolean loadConfig() {
        plugin.saveResource("config.yml");
        Config config = new Config(ConfigPath + "/config.yml", Config.YAML);
        ReloadCmd = config.getString("ReloadCmd");
        TaskDelay = config.getInt("TaskDelay");
        WorldStrList = (ArrayList<String>) config.get("World");
        config.save();
        return true;
    }

}
