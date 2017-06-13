package bspkrs.statuseffecthud.fml.gui;

import java.util.Set;

import bspkrs.bspkrscore.fml.gui.GuiBSConfig;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.fml.client.IModGuiFactory;

public class ModGuiFactoryHandler implements IModGuiFactory
{
    @Override
    public void initialize(Minecraft minecraftInstance)
    {

    }

  @Override
  public boolean hasConfigGui() {
    return true;
  }

  @Override
  public GuiScreen createConfigGui(GuiScreen parentScreen) {
    return new GuiSEHConfig(parentScreen);
  }

  @Override
    public Class<? extends GuiScreen> mainConfigGuiClass()
    {
        return GuiSEHConfig.class;
    }

    @Override
    public Set<RuntimeOptionCategoryElement> runtimeGuiCategories()
    {
        return null;
    }

    @Override
    public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element)
    {
        return null;
    }
}
