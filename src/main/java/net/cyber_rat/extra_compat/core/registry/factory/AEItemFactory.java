package net.cyber_rat.extra_compat.core.registry.factory;

import com.temporal.api.core.engine.io.metadata.annotation.Injected;
import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.cyber_rat.extra_compat.core.registry.extension.AESkyrootMobBucketExtension;

@Injected
public class AEItemFactory extends ItemFactory implements AESkyrootMobBucketExtension {
}
