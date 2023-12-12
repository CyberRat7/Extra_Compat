package net.cyber_rat.extra_compat;

import com.mojang.logging.LogUtils;
import net.cyber_rat.extra_compat.core.registry.object.ExtraCompatCreativeModeTabs;
import net.cyber_rat.extra_compat.core.registry.object.ExtraCompatItems;
import net.cyber_rat.extra_compat.core.util.CompatHandler;
import net.cyber_rat.extra_compat.core.util.CompatHandlerClient;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ExtraCompat.MODID)
public class ExtraCompat
{
    public static final String MODID = "extra_compat";
    private static final Logger LOGGER = LogUtils.getLogger();
    public ExtraCompat() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ExtraCompatCreativeModeTabs.register(modEventBus);
        ExtraCompatItems.register(modEventBus);
        CompatHandler.register();
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative); // Register the item to a creative tab
        MinecraftForge.EVENT_BUS.register(this);
    }



    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {

    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }



    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            CompatHandlerClient.setup(event);
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
