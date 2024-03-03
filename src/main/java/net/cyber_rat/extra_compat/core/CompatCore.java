package net.cyber_rat.extra_compat.core;

import com.temporal.api.core.event.tab.SimpleTabAdder;
import com.temporal.api.core.event.tab.TabAdder;
import com.temporal.api.core.util.forge.ModListContainer;
import net.cyber_rat.extra_compat.core.registry.forge.farmersdelight.FDExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.nethersdelight.NDExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.sniffsweapons.SWExtraItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import umpaz.nethersdelight.common.registry.NDCreativeTab;
import vectorwing.farmersdelight.common.registry.ModCreativeTabs;

public class CompatCore {
    private static final ModListContainer MOD_LIST_CONTAINER = ModListContainer.getInstance();
    private static final boolean hasFarmersDelight = MOD_LIST_CONTAINER.contains("farmersdelight");
    private static final boolean hasSniffsWeapons = MOD_LIST_CONTAINER.contains("sniffsweapons");
    private static final boolean hasNetherDelight = MOD_LIST_CONTAINER.contains("nethersdelight");
    private static final boolean hasNetherDungeons = MOD_LIST_CONTAINER.contains("netherdungeons");

    public static void register() {
        if (hasFarmersDelight) {
            FDExtraItems.register();
        }

        if (hasSniffsWeapons) {
            SWExtraItems.register();
        }

        if (hasNetherDelight) {
            NDExtraItems.register();
        }
    }

    @SuppressWarnings("unchecked")
    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        TabAdder tabAdder = new SimpleTabAdder(event);
        if (hasNetherDungeons) {
            tabAdder.addAllToTab(ModCreativeTabs.TAB_FARMERS_DELIGHT.getKey(),
                    FDExtraItems.REINFORCED_GOLD_KNIFE
            );
        }

        if (hasNetherDungeons) {
            tabAdder.addAllToTab(CreativeModeTabs.COMBAT,
                    SWExtraItems.REINFORCED_GREATSWORD, SWExtraItems.REINFORCED_GREAT_AXE, SWExtraItems.REINFORCED_GREAT_PICKAXE
            );
        }

        if (hasNetherDungeons) {
            tabAdder.addAllToTab(NDCreativeTab.NETHERS_DELIGHT_TAB.getKey(),
                    NDExtraItems.REINFORCED_GOLD_MACHETE
            ).addAllToTab(CreativeModeTabs.TOOLS_AND_UTILITIES,
                    NDExtraItems.REINFORCED_GOLD_MACHETE
            );
        }
    }
}
