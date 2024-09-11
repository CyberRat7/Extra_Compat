package net.cyber_rat.extra_compat.core.event.forge;

import com.google.common.collect.Maps;
import com.peeko32213.unusualprehistory.core.registry.UPBlocks;
import net.minecraft.Util;
import net.minecraft.world.item.ItemStack;

public class UPMarineSnowInteractionsInitializer implements MarineSnowInteractionsInitializer {
    @Override
    public void initialize() {
        MarineSnowClickEventAdapter.GROWTH_INTERACTIONS.putAll(Util.make(Maps.newHashMap(), map -> {
            map.put(UPBlocks.DEAD_CLATHRODICTYON_BLOCK.get(), UPBlocks.CLATHRODICTYON_BLOCK.get());
            map.put(UPBlocks.DEAD_CLATHRODICTYON.get(), UPBlocks.CLATHRODICTYON.get());
            map.put(UPBlocks.DEAD_CLATHRODICTYON_FAN.get(), UPBlocks.CLATHRODICTYON_FAN.get());
            map.put(UPBlocks.DEAD_CLATHRODICTYON_WALL_FAN.get(), UPBlocks.CLATHRODICTYON_WALL_FAN.get());
        }));

        MarineSnowClickEventAdapter.DUPLICATES_INTERACTIONS.putAll(Util.make(Maps.newHashMap(), map -> {
            map.put(UPBlocks.CLATHRODICTYON_BLOCK.get(), new ItemStack(UPBlocks.CLATHRODICTYON_BLOCK.get()));
            map.put(UPBlocks.CLATHRODICTYON.get(), new ItemStack(UPBlocks.CLATHRODICTYON.get()));
            map.put(UPBlocks.CLATHRODICTYON_FAN.get(), new ItemStack(UPBlocks.CLATHRODICTYON_FAN.get()));
            map.put(UPBlocks.CLATHRODICTYON_WALL_FAN.get(), new ItemStack(UPBlocks.CLATHRODICTYON_WALL_FAN.get()));
        }));
    }
}
