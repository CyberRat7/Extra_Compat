package net.cyber_rat.extra_compat.core.registry.forge.incubation;

import com.temporal.api.core.engine.io.context.InjectionContext;
import net.cyber_rat.extra_compat.ExtraCompat;
import net.cyber_rat.extra_compat.core.registry.facade.IncubationBlockFactory;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

public class IncubationSMExtraBlocks {
    public static final IncubationBlockFactory BLOCK_FACTORY = InjectionContext.getInstance().getObject(IncubationBlockFactory.class);

    public static final RegistryObject<Block> TORTOISE_EGG_CRATE = BLOCK_FACTORY.create("tortoise_egg_crate", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));
    public static void register() {
        ExtraCompat.LOGGER.info("Incubation compatibility has been initialized!");
    }
}
