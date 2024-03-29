package net.cyber_rat.extra_compat.core.registry.facade;

import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.cyber_rat.extra_compat.core.registry.extension.NDMacheteExtension;

public class NDItemFactory extends ItemFactory implements NDMacheteExtension {
    private static volatile NDItemFactory instance;

    public static NDItemFactory getInstance() {
        if (instance == null) {
            synchronized (NDItemFactory.class) {
                if (instance == null) {
                    instance = new NDItemFactory();
                }
            }
        }

        return instance;
    }
}
