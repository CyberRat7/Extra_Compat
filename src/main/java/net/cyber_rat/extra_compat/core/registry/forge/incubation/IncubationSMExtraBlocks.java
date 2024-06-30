package net.cyber_rat.extra_compat.core.registry.forge.incubation;

import net.cyber_rat.extra_compat.ExtraCompat;
import net.cyber_rat.extra_compat.core.registry.factory.IncubationBlockFactory;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.RegistryObject;

public class IncubationSMExtraBlocks {
    public static final IncubationBlockFactory BLOCK_FACTORY = new IncubationBlockFactory();

    public static final RegistryObject<Block> TORTOISE_EGG_CRATE = BLOCK_FACTORY.create("tortoise_egg_crate", BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS));

    public static void register() {
        ExtraCompat.LOGGER.info("Incubation compatibility has been initialized!");
    }
}
