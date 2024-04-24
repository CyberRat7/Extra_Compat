package net.cyber_rat.extra_compat.core.registry.object;

import com.temporal.api.core.registry.factory.common.BlockFactory;
import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.minecraftforge.eventbus.api.IEventBus;

public class ExtraCompatBlocks {
    public static void register(IEventBus eventBus) {
        BlockFactory.getInstance().register(eventBus);
    }
}