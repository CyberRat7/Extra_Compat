package net.cyber_rat.extra_compat.core.event.forge;

import com.google.common.collect.Maps;
import com.teamabnormals.upgrade_aquatic.core.registry.UABlocks;
import net.minecraft.Util;
import net.minecraft.world.item.ItemStack;

public class UAMarineSnowInteractionsInitializer implements MarineSnowInteractionsInitializer {
    @Override
    public void initialize() {
        MarineSnowClickEventAdapter.GROWTH_INTERACTIONS.putAll(Util.make(Maps.newHashMap(), map -> {
            map.put(UABlocks.DEAD_ACAN_CORAL_BLOCK.get(), UABlocks.ACAN_CORAL_BLOCK.get());
            map.put(UABlocks.DEAD_BRANCH_CORAL_BLOCK.get(), UABlocks.BRANCH_CORAL_BLOCK.get());
            map.put(UABlocks.DEAD_FINGER_CORAL_BLOCK.get(), UABlocks.FINGER_CORAL_BLOCK.get());
            map.put(UABlocks.DEAD_STAR_CORAL_BLOCK.get(), UABlocks.STAR_CORAL_BLOCK.get());
            map.put(UABlocks.DEAD_MOSS_CORAL_BLOCK.get(), UABlocks.MOSS_CORAL_BLOCK.get());
            map.put(UABlocks.DEAD_PETAL_CORAL_BLOCK.get(), UABlocks.PETAL_CORAL_BLOCK.get());
            map.put(UABlocks.DEAD_ROCK_CORAL_BLOCK.get(), UABlocks.ROCK_CORAL_BLOCK.get());
            map.put(UABlocks.DEAD_PILLOW_CORAL_BLOCK.get(), UABlocks.PILLOW_CORAL_BLOCK.get());
            map.put(UABlocks.DEAD_SILK_CORAL_BLOCK.get(), UABlocks.SILK_CORAL_BLOCK.get());
            map.put(UABlocks.DEAD_CHROME_CORAL_BLOCK.get(), UABlocks.CHROME_CORAL_BLOCK.get());
            map.put(UABlocks.ELDER_PRISMARINE_CORAL_BLOCK.get(), UABlocks.PRISMARINE_CORAL_BLOCK.get());

            map.put(UABlocks.DEAD_ACAN_CORAL.get(), UABlocks.ACAN_CORAL.get());
            map.put(UABlocks.DEAD_BRANCH_CORAL.get(), UABlocks.BRANCH_CORAL.get());
            map.put(UABlocks.DEAD_FINGER_CORAL.get(), UABlocks.FINGER_CORAL.get());
            map.put(UABlocks.DEAD_STAR_CORAL.get(), UABlocks.STAR_CORAL.get());
            map.put(UABlocks.DEAD_MOSS_CORAL.get(), UABlocks.MOSS_CORAL.get());
            map.put(UABlocks.DEAD_PETAL_CORAL.get(), UABlocks.PETAL_CORAL.get());
            map.put(UABlocks.DEAD_ROCK_CORAL.get(), UABlocks.ROCK_CORAL.get());
            map.put(UABlocks.DEAD_PILLOW_CORAL.get(), UABlocks.PILLOW_CORAL.get());
            map.put(UABlocks.DEAD_SILK_CORAL.get(), UABlocks.SILK_CORAL.get());
            map.put(UABlocks.DEAD_CHROME_CORAL.get(), UABlocks.CHROME_CORAL.get());
            map.put(UABlocks.ELDER_PRISMARINE_CORAL.get(), UABlocks.PRISMARINE_CORAL.get());

            map.put(UABlocks.DEAD_ACAN_CORAL_FAN.get(), UABlocks.ACAN_CORAL_FAN.get());
            map.put(UABlocks.DEAD_BRANCH_CORAL_FAN.get(), UABlocks.BRANCH_CORAL_FAN.get());
            map.put(UABlocks.DEAD_FINGER_CORAL_FAN.get(), UABlocks.FINGER_CORAL_FAN.get());
            map.put(UABlocks.DEAD_STAR_CORAL_FAN.get(), UABlocks.STAR_CORAL_FAN.get());
            map.put(UABlocks.DEAD_MOSS_CORAL_FAN.get(), UABlocks.MOSS_CORAL_FAN.get());
            map.put(UABlocks.DEAD_PETAL_CORAL_FAN.get(), UABlocks.PETAL_CORAL_FAN.get());
            map.put(UABlocks.DEAD_ROCK_CORAL_FAN.get(), UABlocks.ROCK_CORAL_FAN.get());
            map.put(UABlocks.DEAD_PILLOW_CORAL_FAN.get(), UABlocks.PILLOW_CORAL_FAN.get());
            map.put(UABlocks.DEAD_SILK_CORAL_FAN.get(), UABlocks.SILK_CORAL_FAN.get());
            map.put(UABlocks.DEAD_CHROME_CORAL_FAN.get(), UABlocks.CHROME_CORAL_FAN.get());
            map.put(UABlocks.ELDER_PRISMARINE_CORAL_FAN.get(), UABlocks.PRISMARINE_CORAL_FAN.get());

            map.put(UABlocks.DEAD_ACAN_CORAL_WALL_FAN.get(), UABlocks.ACAN_CORAL_WALL_FAN.get());
            map.put(UABlocks.DEAD_BRANCH_CORAL_WALL_FAN.get(), UABlocks.BRANCH_CORAL_WALL_FAN.get());
            map.put(UABlocks.DEAD_FINGER_CORAL_WALL_FAN.get(), UABlocks.FINGER_CORAL_WALL_FAN.get());
            map.put(UABlocks.DEAD_STAR_CORAL_WALL_FAN.get(), UABlocks.STAR_CORAL_WALL_FAN.get());
            map.put(UABlocks.DEAD_MOSS_CORAL_WALL_FAN.get(), UABlocks.MOSS_CORAL_WALL_FAN.get());
            map.put(UABlocks.DEAD_PETAL_CORAL_WALL_FAN.get(), UABlocks.PETAL_CORAL_WALL_FAN.get());
            map.put(UABlocks.DEAD_ROCK_CORAL_WALL_FAN.get(), UABlocks.ROCK_CORAL_WALL_FAN.get());
            map.put(UABlocks.DEAD_PILLOW_CORAL_WALL_FAN.get(), UABlocks.PILLOW_CORAL_WALL_FAN.get());
            map.put(UABlocks.DEAD_SILK_CORAL_WALL_FAN.get(), UABlocks.SILK_CORAL_WALL_FAN.get());
            map.put(UABlocks.DEAD_CHROME_CORAL_WALL_FAN.get(), UABlocks.CHROME_CORAL_WALL_FAN.get());
            map.put(UABlocks.ELDER_PRISMARINE_CORAL_WALL_FAN.get(), UABlocks.PRISMARINE_CORAL_WALL_FAN.get());
        }));

        MarineSnowClickEventAdapter.DUPLICATES_INTERACTIONS.putAll(Util.make(Maps.newHashMap(), map -> {
            map.put(UABlocks.ACAN_CORAL_BLOCK.get(), new ItemStack(UABlocks.ACAN_CORAL_BLOCK.get()));
            map.put(UABlocks.BRANCH_CORAL_BLOCK.get(), new ItemStack(UABlocks.BRANCH_CORAL_BLOCK.get()));
            map.put(UABlocks.FINGER_CORAL_BLOCK.get(), new ItemStack(UABlocks.FINGER_CORAL_BLOCK.get()));
            map.put(UABlocks.STAR_CORAL_BLOCK.get(), new ItemStack(UABlocks.STAR_CORAL_BLOCK.get()));
            map.put(UABlocks.MOSS_CORAL_BLOCK.get(), new ItemStack(UABlocks.MOSS_CORAL_BLOCK.get()));
            map.put(UABlocks.PETAL_CORAL_BLOCK.get(), new ItemStack(UABlocks.PETAL_CORAL_BLOCK.get()));
            map.put(UABlocks.ROCK_CORAL_BLOCK.get(), new ItemStack(UABlocks.ROCK_CORAL_BLOCK.get()));
            map.put(UABlocks.PILLOW_CORAL_BLOCK.get(), new ItemStack(UABlocks.PILLOW_CORAL_BLOCK.get()));
            map.put(UABlocks.SILK_CORAL_BLOCK.get(), new ItemStack(UABlocks.SILK_CORAL_BLOCK.get()));
            map.put(UABlocks.CHROME_CORAL_BLOCK.get(), new ItemStack(UABlocks.CHROME_CORAL_BLOCK.get()));
            map.put(UABlocks.PRISMARINE_CORAL_BLOCK.get(), new ItemStack(UABlocks.PRISMARINE_CORAL_BLOCK.get()));

            map.put(UABlocks.ACAN_CORAL.get(), new ItemStack(UABlocks.ACAN_CORAL.get()));
            map.put(UABlocks.BRANCH_CORAL.get(), new ItemStack(UABlocks.BRANCH_CORAL.get()));
            map.put(UABlocks.FINGER_CORAL.get(), new ItemStack(UABlocks.FINGER_CORAL.get()));
            map.put(UABlocks.STAR_CORAL.get(), new ItemStack(UABlocks.STAR_CORAL.get()));
            map.put(UABlocks.MOSS_CORAL.get(), new ItemStack(UABlocks.MOSS_CORAL.get()));
            map.put(UABlocks.PETAL_CORAL.get(), new ItemStack(UABlocks.PETAL_CORAL.get()));
            map.put(UABlocks.ROCK_CORAL.get(), new ItemStack(UABlocks.ROCK_CORAL.get()));
            map.put(UABlocks.PILLOW_CORAL.get(), new ItemStack(UABlocks.PILLOW_CORAL.get()));
            map.put(UABlocks.SILK_CORAL.get(), new ItemStack(UABlocks.SILK_CORAL.get()));
            map.put(UABlocks.CHROME_CORAL.get(), new ItemStack(UABlocks.CHROME_CORAL.get()));
            map.put(UABlocks.PRISMARINE_CORAL.get(), new ItemStack(UABlocks.PRISMARINE_CORAL.get()));

            map.put(UABlocks.ACAN_CORAL_FAN.get(), new ItemStack(UABlocks.ACAN_CORAL_FAN.get()));
            map.put(UABlocks.BRANCH_CORAL_FAN.get(), new ItemStack(UABlocks.BRANCH_CORAL_FAN.get()));
            map.put(UABlocks.FINGER_CORAL_FAN.get(), new ItemStack(UABlocks.FINGER_CORAL_FAN.get()));
            map.put(UABlocks.STAR_CORAL_FAN.get(), new ItemStack(UABlocks.STAR_CORAL_FAN.get()));
            map.put(UABlocks.MOSS_CORAL_FAN.get(), new ItemStack(UABlocks.MOSS_CORAL_FAN.get()));
            map.put(UABlocks.PETAL_CORAL_FAN.get(), new ItemStack(UABlocks.PETAL_CORAL_FAN.get()));
            map.put(UABlocks.ROCK_CORAL_FAN.get(), new ItemStack(UABlocks.ROCK_CORAL_FAN.get()));
            map.put(UABlocks.PILLOW_CORAL_FAN.get(), new ItemStack(UABlocks.PILLOW_CORAL_FAN.get()));
            map.put(UABlocks.SILK_CORAL_FAN.get(), new ItemStack(UABlocks.SILK_CORAL_FAN.get()));
            map.put(UABlocks.CHROME_CORAL_FAN.get(), new ItemStack(UABlocks.CHROME_CORAL_FAN.get()));
            map.put(UABlocks.PRISMARINE_CORAL_FAN.get(), new ItemStack(UABlocks.PRISMARINE_CORAL_FAN.get()));

            map.put(UABlocks.ACAN_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.ACAN_CORAL_WALL_FAN.get()));
            map.put(UABlocks.BRANCH_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.BRANCH_CORAL_WALL_FAN.get()));
            map.put(UABlocks.FINGER_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.FINGER_CORAL_WALL_FAN.get()));
            map.put(UABlocks.STAR_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.STAR_CORAL_WALL_FAN.get()));
            map.put(UABlocks.MOSS_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.MOSS_CORAL_WALL_FAN.get()));
            map.put(UABlocks.PETAL_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.PETAL_CORAL_WALL_FAN.get()));
            map.put(UABlocks.ROCK_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.ROCK_CORAL_WALL_FAN.get()));
            map.put(UABlocks.PILLOW_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.PILLOW_CORAL_WALL_FAN.get()));
            map.put(UABlocks.SILK_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.SILK_CORAL_WALL_FAN.get()));
            map.put(UABlocks.CHROME_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.CHROME_CORAL_WALL_FAN.get()));
            map.put(UABlocks.PRISMARINE_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.PRISMARINE_CORAL_WALL_FAN.get()));
        }));
    }
}
