package top.szzz666.RealTime.command;

import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

import static top.szzz666.RealTime.config.RtConfig.ReloadCmd;
import static top.szzz666.RealTime.config.RtConfig.loadConfig;


public class ReloadCommand extends Command {
    public ReloadCommand() {
        super(ReloadCmd, "重新加载RealTime插件配置文件");
    }

    @Override
    public boolean execute(CommandSender sender, String label, String[] args) {
        if (sender.isPlayer()) {
            loadConfig();
            sender.sendMessage("RealTime配置文件重新加载成功！");
            return true;
        }
        return false;
    }

}
