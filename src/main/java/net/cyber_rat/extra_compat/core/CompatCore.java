package net.cyber_rat.extra_compat.core;

import com.temporal.api.core.event.tab.SimpleTabAdder;
import com.temporal.api.core.event.tab.TabAdder;
import com.temporal.api.core.util.forge.ModListContainer;
import net.cyber_rat.extra_compat.core.registry.forge.farmersdelight.NetherDungeonFDExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.nethersdelight.NetherDungeonNDExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.sniffsweapons.NetherDungeonSWExtraItems;
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
        if (hasNetherDungeons) {
            if (hasFarmersDelight) {
                NetherDungeonFDExtraItems.register();
            }

            if (hasSniffsWeapons) {
                NetherDungeonSWExtraItems.register();
            }

            if (hasNetherDelight) {
                NetherDungeonNDExtraItems.register();
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        TabAdder tabAdder = new SimpleTabAdder(event);
        if (hasNetherDungeons) {
            if (hasFarmersDelight) {
                tabAdder.addAllToTab(ModCreativeTabs.TAB_FARMERS_DELIGHT.getKey(),
                        NetherDungeonFDExtraItems.REINFORCED_GOLD_KNIFE
                );
            }

            if (hasSniffsWeapons) {
                tabAdder.addAllToTab(CreativeModeTabs.COMBAT,
                        NetherDungeonSWExtraItems.REINFORCED_GREATSWORD, NetherDungeonSWExtraItems.REINFORCED_GREAT_AXE, NetherDungeonSWExtraItems.REINFORCED_GREAT_PICKAXE
                );
            }

            if (hasNetherDelight) {
                tabAdder.addAllToTab(NDCreativeTab.NETHERS_DELIGHT_TAB.getKey(),
                        NetherDungeonNDExtraItems.REINFORCED_GOLD_MACHETE
                ).addAllToTab(CreativeModeTabs.TOOLS_AND_UTILITIES,
                        NetherDungeonNDExtraItems.REINFORCED_GOLD_MACHETE
                );
            }
        }
    }
}
