package top.szzz666.RealTime;

import cn.nukkit.Server;
import cn.nukkit.command.CommandSender;
import cn.nukkit.plugin.Plugin;
import cn.nukkit.plugin.PluginBase;
import top.szzz666.RealTime.command.ReloadCommand;
import top.szzz666.RealTime.event.Listeners;
import top.szzz666.RealTime.task.TimeTask;

import static top.szzz666.RealTime.config.RtConfig.loadConfig;
import static top.szzz666.RealTime.tools.pluginUtil.nkConsole;


public class RealTimeMain extends PluginBase {
    public static Plugin plugin;
    public static Server nkServer;
    public static CommandSender consoleObjects;
    public static String ConfigPath;

    @Override
    public void onLoad() {
        //插件读取
        nkServer = getServer();
        plugin = this;
        consoleObjects = getServer().getConsoleSender();
        ConfigPath = getDataFolder().getPath();
        loadConfig();
        nkConsole("&bRealTime插件读取...");
    }

    @Override
    public void onEnable() {
        //注册监听器
        this.getServer().getPluginManager().registerEvents(new Listeners(), this);
        //注册命令
        this.getServer().getCommandMap().register(this.getName(), new ReloadCommand());
        //注册任务
        new TimeTask();
        nkConsole("&bRealTime插件开启");
        nkConsole("&c如果遇到任何bug，请加入Q群进行反馈：894279534", 2);
    }

    @Override
    public void onDisable() {
        //插件关闭
        nkConsole("&bRealTime插件关闭");
    }

}
