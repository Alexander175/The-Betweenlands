package thebetweenlands;

import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import thebetweenlands.blocks.BLBlockRegistry;
import thebetweenlands.blocks.BLFluidRegistry;
import thebetweenlands.entities.BLEntityRegistry;
import thebetweenlands.event.debugging.DebugHandler;
import thebetweenlands.event.player.DecayEventHandler;
import thebetweenlands.event.player.OctineArmorHandler;
import thebetweenlands.event.player.RottenFoodHandler;
import thebetweenlands.event.player.TorchPlaceEventHandler;
import thebetweenlands.event.render.FireflyHandler;
import thebetweenlands.event.render.FogHandler;
import thebetweenlands.event.render.ShaderHandler;
import thebetweenlands.event.render.WispHandler;
import thebetweenlands.event.world.ThemHandler;
import thebetweenlands.items.BLItemRegistry;
import thebetweenlands.lib.ModInfo;
import thebetweenlands.message.MessageAltarCraftingProgress;
import thebetweenlands.message.MessageDruidTeleportParticle;
import thebetweenlands.message.MessageSnailHatchParticle;
import thebetweenlands.message.MessageSyncPlayerDecay;
import thebetweenlands.message.MessageSyncWeather;
import thebetweenlands.proxy.CommonProxy;
import thebetweenlands.recipes.RecipeHandler;
import thebetweenlands.tileentities.TileEntityAnimator;
import thebetweenlands.utils.PotionHelper;
import thebetweenlands.utils.confighandler.ConfigHandler;
import thebetweenlands.utils.network.SidedPacketHandler;
import thebetweenlands.utils.network.impl.CommonPacketProxy;
import thebetweenlands.world.WorldProviderBetweenlands;
import thebetweenlands.world.biomes.base.BLBiomeRegistry;
import thebetweenlands.world.feature.structure.WorlGenDruidCircle;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION, guiFactory = ModInfo.CONFIG_GUI)
public class TheBetweenlands
{
	@SidedProxy(modId = ModInfo.ID, clientSide = ModInfo.CLIENTPROXY_LOCATION, serverSide = ModInfo.COMMONPROXY_LOCATION)
	public static CommonProxy proxy;
	public static SimpleNetworkWrapper networkWrapper;

	public static SidedPacketHandler sidedPacketHandler = new SidedPacketHandler();

	@SidedProxy(modId = ModInfo.ID, clientSide = "thebetweenlands.utils.network.impl.ClientPacketProxy", serverSide = "thebetweenlands.utils.network.impl.CommonPacketProxy")
	public static CommonPacketProxy packetProxy;
	
	@Instance(ModInfo.ID)
	public static TheBetweenlands instance;

	/**
	 * True for debug mode
	 * Keys:
	 * - F: Fullbright
	 * - C: Fast flight
	 */
	public static boolean DEBUG = true;

	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {

		//Configuration File
		ConfigHandler.INSTANCE.loadConfig(event);

		//BL Registry
		BLFluidRegistry.init();
		BLBlockRegistry.init();
		BLBiomeRegistry.init();
		BLItemRegistry.init();
		BLEntityRegistry.init();

		GameRegistry.registerWorldGenerator(new WorlGenDruidCircle(), 0);
		//GameRegistry.registerWorldGenerator(new WorldGenGiantTree(), 0);
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);

		//TODO: Just temporary to test some stuff
		DimensionManager.registerProviderType(ModInfo.DIMENSION_ID, WorldProviderBetweenlands.class, true);
		DimensionManager.registerDimension(ModInfo.DIMENSION_ID, ModInfo.DIMENSION_ID);

		//Packet Registry
		networkWrapper = NetworkRegistry.INSTANCE.newSimpleChannel(ModInfo.CHANNEL);
		networkWrapper.registerMessage(MessageAltarCraftingProgress.class, MessageAltarCraftingProgress.class, 0, Side.CLIENT);
		networkWrapper.registerMessage(MessageDruidTeleportParticle.class, MessageDruidTeleportParticle.class, 1, Side.CLIENT);
        networkWrapper.registerMessage(MessageSyncPlayerDecay.class, MessageSyncPlayerDecay.class, 2, Side.CLIENT);
        networkWrapper.registerMessage(MessageSyncPlayerDecay.class, MessageSyncPlayerDecay.class, 3, Side.SERVER);
        networkWrapper.registerMessage(MessageSyncWeather.class, MessageSyncWeather.class, 4, Side.CLIENT);
        networkWrapper.registerMessage(MessageSnailHatchParticle.class, MessageSnailHatchParticle.class, 5, Side.CLIENT);
        
        sidedPacketHandler.setProxy(packetProxy).setNetworkWrapper(networkWrapper, 5, 6);
		//Packets
		try {
			sidedPacketHandler.registerPacketHandler(TileEntityAnimator.class, Side.CLIENT);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerTileEntities();
		proxy.preInit();

        PotionHelper.initPotionArray();
        PotionHelper.registerPotions();

		FMLCommonHandler.instance().bus().register(ConfigHandler.INSTANCE);
        FMLCommonHandler.instance().bus().register(DecayEventHandler.INSTANCE);
        FMLCommonHandler.instance().bus().register(ThemHandler.INSTANCE);
		MinecraftForge.EVENT_BUS.register(FogHandler.INSTANCE);
		MinecraftForge.EVENT_BUS.register(BLFluidRegistry.INSTANCE);
		MinecraftForge.EVENT_BUS.register(new OctineArmorHandler());
		MinecraftForge.EVENT_BUS.register(new TorchPlaceEventHandler());
        MinecraftForge.EVENT_BUS.register(DecayEventHandler.INSTANCE);
        MinecraftForge.EVENT_BUS.register(WispHandler.INSTANCE);
        MinecraftForge.EVENT_BUS.register(FireflyHandler.INSTANCE);
        FMLCommonHandler.instance().bus().register(ShaderHandler.INSTANCE);
		MinecraftForge.EVENT_BUS.register(ShaderHandler.INSTANCE);
		MinecraftForge.EVENT_BUS.register(RottenFoodHandler.INSTANCE);

		if(DEBUG) {
			FMLCommonHandler.instance().bus().register(DebugHandler.INSTANCE);
			MinecraftForge.EVENT_BUS.register(DebugHandler.INSTANCE);
		}

		RecipeHandler.init();
	}
}
