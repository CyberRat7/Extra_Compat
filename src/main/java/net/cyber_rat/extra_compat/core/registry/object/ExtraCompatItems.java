package net.cyber_rat.extra_compat.core.registry.object;

import net.cyber_rat.extra_compat.ExtraCompat;
import net.cyber_rat.extra_compat.core.registry.facade.ExtraCompatItemFactoryFacade;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;

public class ExtraCompatItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, ExtraCompat.MOD_ID);
    public static final ExtraCompatItemFactoryFacade ITEM_FACTORY = ExtraCompatItemFactoryFacade.getInstance();

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}