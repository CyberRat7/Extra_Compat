package net.cyber_rat.extra_compat.core.registry.facade;

import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.cyber_rat.extra_compat.core.registry.extension.FDKnifeExtension;

public class FDItemFactory extends ItemFactory implements FDKnifeExtension {
    private static volatile FDItemFactory instance;

    public static FDItemFactory getInstance() {
        if (instance == null) {
            synchronized (FDItemFactory.class) {
                if (instance == null) {
                    instance = new FDItemFactory();
                }
            }
        }

        return instance;
    }
}
