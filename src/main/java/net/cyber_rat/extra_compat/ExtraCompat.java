package net.cyber_rat.extra_compat;

import com.mojang.logging.LogUtils;
import com.temporal.api.core.engine.TemporalEngine;
import com.temporal.api.core.engine.io.context.InjectionContext;
import net.cyber_rat.extra_compat.core.CompatCore;
import net.cyber_rat.extra_compat.core.registry.forge.aether.AEUndergardenExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.basicweapons.BWUndergardenExtraItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.slf4j.Logger;

@Mod(ExtraCompat.MODID)
public class ExtraCompat {
    public static final String MODID = "extra_compat";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ExtraCompat() {
        TemporalEngine.run(ExtraCompat.class);
        InjectionContext.getFromInstance(IEventBus.class).addListener(this::addCreative);
        MinecraftForge.EVENT_BUS.register(this);
    }


    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        CompatCore compatCore = InjectionContext.getFromInstance(CompatCore.class);
        compatCore.addCreative(event);
    }

    @Mod.EventBusSubscriber(modid = ExtraCompat.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public class ExtraCompatClientEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        CompatCore compatCore = InjectionContext.getFromInstance(CompatCore.class);
        compatCore.registerCuriosRenders();
        }
    }
}
