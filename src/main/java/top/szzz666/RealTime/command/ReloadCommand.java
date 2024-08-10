package top.szzz666.RealTime.command;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

import static top.szzz666.RealTime.config.RtConfig.loadConfig;


public class ReloadCommand extends Command {
    public ReloadCommand() {
        super("CommandName", "重新加载RealTime插件配置文件");
    }

    @Override
    public boolean execute(CommandSender sender, String label, String[] args) {
        if (sender.isPlayer()) {
            loadConfig();
        }
        return false;
    }

}
