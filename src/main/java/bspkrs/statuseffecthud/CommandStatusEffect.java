package bspkrs.statuseffecthud;

import bspkrs.fml.util.DelayedGuiDisplayTicker;
import bspkrs.statuseffecthud.fml.gui.GuiSEHConfig;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public class CommandStatusEffect extends CommandBase
{
    @Override
    public String getCommandName()
    {
        return "statuseffect";
    }

    @Override
    public String getCommandUsage(ICommandSender var1)
    {
        return "commands.statuseffect.usage";
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender par1ICommandSender)
    {
        return true;
    }

    @Override
    public int getRequiredPermissionLevel()
    {
        return 1;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender var1, String[] var2)
    {
        try
        {
            new DelayedGuiDisplayTicker(10, new GuiSEHConfig(null));
        }
        catch (Throwable e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public int compareTo(ICommand object)
    {
        if (object instanceof CommandBase)
            return this.getCommandName().compareTo(((CommandBase) object).getCommandName());

        return 0;
    }
}
