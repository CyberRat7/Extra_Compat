package net.cyber_rat.extra_compat.core;

import com.aetherteam.aether.item.AetherCreativeTabs;
import com.temporal.api.core.engine.io.metadata.annotation.Dependency;
import com.temporal.api.core.engine.io.metadata.annotation.Execution;
import com.temporal.api.core.engine.io.metadata.annotation.Injected;
import com.temporal.api.core.event.tab.SimpleTabDirector;
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

@Injected
public class CompatCore {
    @Dependency("farmersdelight")
    private boolean hasFarmersDelight;
    @Dependency("sniffsweapons")
    private boolean hasSniffsWeapons;
    @Dependency("nethersdelight")
    private boolean hasNetherDelight;
    @Dependency("netherdungeons")
    private boolean hasNetherDungeons;
    @Dependency("aether")
    private boolean hasAether;
    @Dependency("sullysmod")
    private boolean hasSullysMod;
    @Dependency("alexsmobs")
    private boolean hasAlexsMobs;
    @Dependency("incubation")
    private boolean hasIncubation;

    @Execution
    public void register() {
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

    public void addCreative(BuildCreativeModeTabContentsEvent event) {
        final SimpleTabDirector tabDirector = SimpleTabDirector.create(event);
        if (hasIncubation) {
            if (hasSullysMod) {
                tabDirector.addToTab(CreativeModeTabs.BUILDING_BLOCKS, IncubationSMExtraBlocks.TORTOISE_EGG_CRATE);
            }
        }

        if (hasAether) {
            if (hasSullysMod) {
                tabDirector.addToTab(AetherCreativeTabs.AETHER_EQUIPMENT_AND_UTILITIES.getKey(), SullysModAEExtraItems.SKYROOT_LANTERNFISH_BUCKET);
            }

            if (hasAlexsMobs) {
                tabDirector.addToTab(AetherCreativeTabs.AETHER_EQUIPMENT_AND_UTILITIES.getKey(),
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
                tabDirector.addToTab(ModCreativeTabs.TAB_FARMERS_DELIGHT.getKey(), NetherDungeonFDExtraItems.REINFORCED_GOLD_KNIFE);
            }

            if (hasSniffsWeapons) {
                tabDirector.addToTab(CreativeModeTabs.COMBAT,
                        NetherDungeonSWExtraItems.REINFORCED_GREATSWORD,
                        NetherDungeonSWExtraItems.REINFORCED_GREAT_AXE,
                        NetherDungeonSWExtraItems.REINFORCED_GREAT_PICKAXE
                );
            }

            if (hasNetherDelight) {
                tabDirector.addToTab(NDCreativeTab.NETHERS_DELIGHT_TAB.getKey(), NetherDungeonNDExtraItems.REINFORCED_GOLD_MACHETE)
                        .addToTab(CreativeModeTabs.TOOLS_AND_UTILITIES, NetherDungeonNDExtraItems.REINFORCED_GOLD_MACHETE);
            }
        }
    }
}
