package top.szzz666.RealTime.task;


import cn.nukkit.level.Level;

import static top.szzz666.RealTime.RealTimeMain.nkServer;
import static top.szzz666.RealTime.RealTimeMain.plugin;
import static top.szzz666.RealTime.config.RtConfig.TaskDelay;
import static top.szzz666.RealTime.config.RtConfig.WorldStrList;
import static top.szzz666.RealTime.tools.pluginUtil.getGameTimeFromRealTime;


public class TimeTask {
    public TimeTask() {
        nkServer.getScheduler().scheduleRepeatingTask(plugin, () -> {
            for (String worldStr : WorldStrList) {
                Level world = nkServer.getLevelByName(worldStr);
                if (world != null) {
                    world.setTime(getGameTimeFromRealTime());
                }
            }
        },TaskDelay,true);
    }
}
