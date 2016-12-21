package bspkrs.statuseffecthud;

import bspkrs.fml.util.DelayedGuiDisplayTicker;
import bspkrs.statuseffecthud.fml.gui.GuiSEHConfig;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public class CommandStatusEffect extends CommandBase
{
    @Override
    public String getName()
    {
        return "statuseffect";
    }

    @Override
    public String getUsage(ICommandSender var1)
    {
        return "commands.statuseffect.usage";
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender)
    {
        return true;
    }

    @Override
    public int getRequiredPermissionLevel()
    {
        return 1;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
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
            return this.getName().compareTo(((CommandBase) object).getName());

        return 0;
    }
}
