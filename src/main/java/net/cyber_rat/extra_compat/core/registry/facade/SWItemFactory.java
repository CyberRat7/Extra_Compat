package net.cyber_rat.extra_compat.core.registry.facade;

import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.cyber_rat.extra_compat.core.registry.extension.SWAxeExtension;
import net.cyber_rat.extra_compat.core.registry.extension.SWPickaxeExtension;
import net.cyber_rat.extra_compat.core.registry.extension.SWSwordExtension;

public class SWItemFactory extends ItemFactory implements SWSwordExtension, SWAxeExtension, SWPickaxeExtension {
    private static volatile SWItemFactory instance;

    public static SWItemFactory getInstance() {
        if (instance == null) {
            synchronized (SWItemFactory.class) {
                if (instance == null) {
                    instance = new SWItemFactory();
                }
            }
        }
        
        return instance;
    }
}
