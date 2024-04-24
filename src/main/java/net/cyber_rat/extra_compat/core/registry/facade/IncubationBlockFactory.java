package net.cyber_rat.extra_compat.core.registry.facade;

import com.temporal.api.core.registry.factory.common.BlockFactory;
import com.temporal.api.core.registry.factory.extension.block.DoorExtension;

public class IncubationBlockFactory extends BlockFactory implements DoorExtension {
    private static volatile IncubationBlockFactory instance;

    public static IncubationBlockFactory getInstance() {
        if (instance == null) {
            synchronized (FDItemFactory.class) {
                if (instance == null) {
                    instance = new IncubationBlockFactory();
                }
            }
        }

        return instance;
    }
}
