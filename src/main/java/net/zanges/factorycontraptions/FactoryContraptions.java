package net.zanges.factorycontraptions;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.zanges.factorycontraptions.handler.ConfigurationHandler;
import net.zanges.factorycontraptions.proxy.IProxy;
import net.zanges.factorycontraptions.reference.Reference;
import net.zanges.factorycontraptions.utility.LogHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, dependencies = Reference.DEPENDENCIES, guiFactory = Reference.GUI_FACTORY_CLASS)
public class FactoryContraptions
{
    @Mod.Instance(Reference.MOD_ID)
    public static FactoryContraptions instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        LogHelper.info("Starting Pre Initialization...");
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        LogHelper.info("Pre Initialization Complete!");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Starting Initialization...");

        LogHelper.info("Initialization Complete!");

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Starting Post Initialization...");

        LogHelper.info("Post Initialization Complete!");
    }
}
