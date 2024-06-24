package net.cyber_rat.extra_compat.core.registry.factory;

import com.temporal.api.core.engine.io.metadata.annotation.Injected;
import com.temporal.api.core.registry.factory.common.BlockFactory;
import com.temporal.api.core.registry.factory.extension.block.DoorExtension;

@Injected
public class IncubationBlockFactory extends BlockFactory implements DoorExtension {
}
