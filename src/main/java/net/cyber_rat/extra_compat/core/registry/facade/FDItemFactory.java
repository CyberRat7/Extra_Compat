package net.cyber_rat.extra_compat.core.registry.facade;

import com.temporal.api.core.engine.io.metadata.annotation.Injected;
import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.cyber_rat.extra_compat.core.registry.extension.FDKnifeExtension;

@Injected
public class FDItemFactory extends ItemFactory implements FDKnifeExtension {
}
