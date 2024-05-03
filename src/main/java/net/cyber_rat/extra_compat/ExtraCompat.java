package net.cyber_rat.extra_compat;

import com.mojang.logging.LogUtils;
import com.temporal.api.core.engine.TemporalEngine;
import com.temporal.api.core.engine.io.context.Context;
import com.temporal.api.core.engine.io.context.InjectionContext;
import net.cyber_rat.extra_compat.core.CompatCore;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

@Mod(ExtraCompat.MOD_ID)
public class ExtraCompat {
    public static final String MOD_ID = "extra_compat";
    public static final Logger LOGGER = LogUtils.getLogger();
    public final Context context;

    public ExtraCompat() {
        TemporalEngine.run(ExtraCompat.class);
        this.context = InjectionContext.getInstance();
        this.context.getObject(IEventBus.class).addListener(this::addCreative);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        CompatCore compatCore = this.context.getObject(CompatCore.class);
        compatCore.addCreative(event);
    }
}
