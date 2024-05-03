package net.cyber_rat.extra_compat.core.registry.object;

import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.engine.io.metadata.annotation.Injected;
import com.temporal.api.core.engine.io.metadata.annotation.Registry;
import com.temporal.api.core.registry.factory.common.BlockFactory;

@Injected
public class ExtraCompatBlocks {
    @Registry
    public static final BlockFactory BLOCK_FACTORY = InjectionContext.getInstance().getObject(BlockFactory.class);
}