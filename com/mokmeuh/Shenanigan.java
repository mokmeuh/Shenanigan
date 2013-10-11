package mokmeuh;

import mokmeuh.lib.ConfigHandler;
import mokmeuh.lib.ModInfo;
import mokmeuh.network.PacketHandler;
import mokmeuh.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION)
@NetworkMod(channels = { ModInfo.CHANNEL }, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)
public class Shenanigan
	{
		@Instance(ModInfo.ID)
		public static Shenanigan instance;

		@SidedProxy(clientSide = "mokmeuh.proxies.ClientProxy", serverSide = "mokmeuh.proxies.CommonProxy")
		public static CommonProxy proxy;

		@EventHandler
		public void preInit(FMLPreInitializationEvent event)
		{
			ConfigHandler.init(event.getSuggestedConfigurationFile());
			proxy.initSounds();
			proxy.initRenderers();
		}

		@EventHandler
		public void Init(FMLInitializationEvent event)
		{

		}

		@EventHandler
		public void postInit(FMLPostInitializationEvent event)
		{

		}

	}
