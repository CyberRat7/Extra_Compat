package net.cyber_rat.extra_compat.core.registry.object;

import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.minecraftforge.eventbus.api.IEventBus;

public class ExtraCompatItems {
    public static void register(IEventBus eventBus) {
        ItemFactory.getInstance().register(eventBus);
    }
}