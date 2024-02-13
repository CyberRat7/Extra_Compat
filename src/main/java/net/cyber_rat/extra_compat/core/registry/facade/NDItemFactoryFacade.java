package net.cyber_rat.extra_compat.core.registry.facade;

import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.cyber_rat.extra_compat.core.registry.extension.MacheteExtension;
import net.cyber_rat.extra_compat.core.registry.object.ExtraCompatItems;
import net.minecraftforge.registries.RegistryObject;
import umpaz.nethersdelight.common.item.MacheteItem;

public class NDItemFactoryFacade extends ItemFactory implements MacheteExtension {
    private static volatile NDItemFactoryFacade instance;

    private NDItemFactoryFacade() {
        super(ExtraCompatItems.ITEMS);
    }

    public RegistryObject<MacheteItem> createMachete(String name, Object... args) {
        return MacheteExtension.super.createMachete(name, this, args);
    }

    public static NDItemFactoryFacade getInstance() {
        if (instance == null) {
            synchronized (NDItemFactoryFacade.class) {
                if (instance == null) {
                    instance = new NDItemFactoryFacade();
                }
            }
        }

        return instance;
    }
}
