package net.cyber_rat.extra_compat.core;

import com.aetherteam.aether.item.AetherCreativeTabs;
import com.temporal.api.core.event.tab.SimpleTabAdder;
import com.temporal.api.core.event.tab.TabAdder;
import com.temporal.api.core.util.forge.ModListContainer;
import net.cyber_rat.extra_compat.core.registry.forge.aether.AlexsMobsAEExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.aether.SullysModAEExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.farmersdelight.NetherDungeonFDExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.incubation.IncubationSMExtraBlocks;
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
    private static final boolean hasAether = MOD_LIST_CONTAINER.contains("aether");
    private static final boolean hasSullysMod = MOD_LIST_CONTAINER.contains("sullysmod");
    private static final boolean hasAlexsMobs = MOD_LIST_CONTAINER.contains("alexsmobs");

    private static final boolean hasIncubation = MOD_LIST_CONTAINER.contains("incubation");

    public static void register() {
        if(hasIncubation){
            if (hasSullysMod){
                IncubationSMExtraBlocks.register();
            }
        }
        if (hasAether) {
            if (hasAlexsMobs){
                AlexsMobsAEExtraItems.register();
                AlexsMobsAEExtraItems.setupBucketReplacements();
            }
            if (hasSullysMod) {
                SullysModAEExtraItems.register();
                SullysModAEExtraItems.setupBucketReplacements();
            }
        }
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
        if (hasIncubation){
            if (hasSullysMod){
                tabAdder.addAllToTab(CreativeModeTabs.BUILDING_BLOCKS,
                        IncubationSMExtraBlocks.TORTOISE_EGG_CRATE
                );
            }
        }

        if (hasAether) {
            if (hasSullysMod){
                tabAdder.addAllToTab(AetherCreativeTabs.AETHER_EQUIPMENT_AND_UTILITIES.getKey(),
                        SullysModAEExtraItems.SKYROOT_LANTERNFISH_BUCKET
                );
            }
            if (hasAlexsMobs){
                tabAdder.addAllToTab(AetherCreativeTabs.AETHER_EQUIPMENT_AND_UTILITIES.getKey(),
                        AlexsMobsAEExtraItems.SKYROOT_SMALL_CATFISH_BUCKET,
                        AlexsMobsAEExtraItems.SKYROOT_MEDIUM_CATFISH_BUCKET,
                        AlexsMobsAEExtraItems.SKYROOT_LARGE_CATFISH_BUCKET,
                        AlexsMobsAEExtraItems.SKYROOT_COMB_JELLEY_BUCKET,
                        AlexsMobsAEExtraItems.SKYROOT_BLOBFISH_BUCKET,
                        AlexsMobsAEExtraItems.SKYROOT_DEVILS_HOLE_PUPFISH_BUCKET,
                        AlexsMobsAEExtraItems.SKYROOT_FRILLED_SHARK_BUCKET,
                        AlexsMobsAEExtraItems.SKYROOT_FLYING_FISH_BUCKET,
                        AlexsMobsAEExtraItems.SKYROOT_LOBSTER_BUCKET,
                        AlexsMobsAEExtraItems.SKYROOT_MIMIC_OCTOPUS_BUCKET,
                        AlexsMobsAEExtraItems.SKYROOT_MUDSKIPPER_BUCKET,
                        AlexsMobsAEExtraItems.SKYROOT_TERRAPIN_BUCKET,
                        AlexsMobsAEExtraItems.SKYROOT_TRIOPS_BUCKET,
                        AlexsMobsAEExtraItems.SKYROOT_PLATYPUS_BUCKET
                );
            }
        }

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
