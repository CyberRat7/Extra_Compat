package net.cyber_rat.extra_compat.core.registry.facade;

import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.cyber_rat.extra_compat.core.registry.extension.AESkyrootMobBucketExtension;

public class AEItemFactory extends ItemFactory implements AESkyrootMobBucketExtension {
    private static volatile AEItemFactory instance;

    public static AEItemFactory getInstance() {
        if (instance == null) {
            synchronized (AEItemFactory.class) {
                if (instance == null) {
                    instance = new AEItemFactory();
                }
            }
        }

        return instance;
    }
}
