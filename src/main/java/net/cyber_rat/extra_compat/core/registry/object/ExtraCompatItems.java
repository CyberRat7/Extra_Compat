package net.cyber_rat.extra_compat.core.registry.object;

import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.engine.io.metadata.annotation.Injected;
import com.temporal.api.core.engine.io.metadata.annotation.Registry;
import com.temporal.api.core.registry.factory.common.ItemFactory;
import com.temporal.api.core.registry.factory.common.ObjectFactory;
import net.minecraft.world.item.Item;
@Injected
public class ExtraCompatItems {
    @Registry
    private static final ObjectFactory<Item> ITEM_FACTORY = InjectionContext.getInstance().getObject(ItemFactory.class);
}