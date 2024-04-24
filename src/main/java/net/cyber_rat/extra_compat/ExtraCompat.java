package net.cyber_rat.extra_compat;

import com.mojang.logging.LogUtils;
import com.temporal.api.core.engine.TemporalEngine;
import net.cyber_rat.extra_compat.core.CompatCore;
import net.cyber_rat.extra_compat.core.registry.forge.aether.SullysModAEExtraItems;
import net.cyber_rat.extra_compat.core.registry.object.ExtraCompatBlocks;
import net.cyber_rat.extra_compat.core.registry.object.ExtraCompatItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ExtraCompat.MOD_ID)
public class ExtraCompat {
    public static final String MOD_ID = "extra_compat";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ExtraCompat() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        TemporalEngine.process(ExtraCompat.class);

        CompatCore.register();
        ExtraCompatItems.register(modEventBus);
        ExtraCompatBlocks.register(modEventBus);

        modEventBus.addListener(this::addCreative);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        CompatCore.addCreative(event);
    }
}
