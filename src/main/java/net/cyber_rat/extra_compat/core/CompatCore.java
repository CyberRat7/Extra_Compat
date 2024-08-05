package net.cyber_rat.extra_compat.core;

import com.aetherteam.aether.item.AetherCreativeTabs;
import com.temporal.api.core.engine.io.metadata.annotation.Dependency;
import com.temporal.api.core.engine.io.metadata.annotation.Execution;
import com.temporal.api.core.engine.io.metadata.annotation.Injected;
import com.temporal.api.core.event.tab.SimpleTabDirector;
import com.temporal.api.core.event.tab.TabDirector;
import net.cyber_rat.extra_compat.core.registry.forge.aether.AEAMExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.aether.AESMExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.farmersdelight.GoatedFDExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.farmersdelight.NetherDungeonFDExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.incubation.IncubationSMExtraBlocks;
import net.cyber_rat.extra_compat.core.registry.forge.miners_delight.*;
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
    @Dependency("goated")
    private boolean hasGoated;
    @Dependency("miners_delight")
    private boolean hasMinersDelight;
    @Dependency("autumnity")
    private boolean hasAutumnity;
    @Dependency("quarkdelight")
    private boolean hasQuarkDelight;
    @Dependency("neapolitan")
    private boolean hasNeapolitan;
    @Dependency("seasonals")
    private boolean hasSeasonals;
    @Dependency("alexsdelight")
    private boolean hasAlexsDelight;

    @Execution
    public void register() {

        if (hasMinersDelight){
            if (hasAlexsDelight){
                MDADExtraItems.register();
            }
            if (hasAlexsMobs){
                MDAMExtraItems.register();
            }
            if (hasNeapolitan){
                MDNExtraItems.register();
            }
            if (hasSeasonals){
                MDSExtraItems.register();
            }
            if (hasQuarkDelight){
                MDQDExtraItems.register();
            }
            if (hasAutumnity){
                MDATExtraItems.register();
            }
        }
        if (hasIncubation){
            if (hasSullysMod){
                IncubationSMExtraBlocks.register();
            }
        }

        if (hasAether) {
            if (hasAlexsMobs){
                AEAMExtraItems.register();
                AEAMExtraItems.setupBucketReplacements();
            }
            if (hasSullysMod) {
                AESMExtraItems.register();
                AESMExtraItems.setupBucketReplacements();
            }
        }

        if (hasFarmersDelight){
            if (hasGoated){
                GoatedFDExtraItems.register();
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
    public void addCreative(BuildCreativeModeTabContentsEvent event) {
        final TabDirector tabDirector = SimpleTabDirector.create(event);

        if (hasFarmersDelight){
            if(hasGoated){
                tabDirector.direct(ModCreativeTabs.TAB_FARMERS_DELIGHT.getKey(), GoatedFDExtraItems.CHEVON_CHOP, GoatedFDExtraItems.COOKED_CHEVON_CHOP);
            }
        }

       if (hasMinersDelight){
            if(hasAlexsMobs){
                tabDirector.direct(ModCreativeTabs.TAB_FARMERS_DELIGHT.getKey(), MDAMExtraItems.MOSQUITO_REPELLENT_STEW_CUP);
            }
            if(hasAlexsDelight){
                tabDirector.direct(ModCreativeTabs.TAB_FARMERS_DELIGHT.getKey(), MDADExtraItems.KANGAROO_STEW_CUP, MDADExtraItems.ACACIA_BLOSSOM_SOUP_CUP);
            }
            if(hasQuarkDelight){
                tabDirector.direct(ModCreativeTabs.TAB_FARMERS_DELIGHT.getKey(), MDQDExtraItems.CAVERN_EXPLORER_STEW_CUP, MDQDExtraItems.MISO_WITH_BAMBOO_SPROUTS_CUP);
            }
            if(hasAutumnity){
                tabDirector.direct(ModCreativeTabs.TAB_FARMERS_DELIGHT.getKey(), MDATExtraItems.FOUL_SOUP_CUP);
            }
            if(hasSeasonals){
                tabDirector.direct(ModCreativeTabs.TAB_FARMERS_DELIGHT.getKey(), MDSExtraItems.PUMPKIN_ADZUKI_STEW_CUP);
            }
            if(hasNeapolitan){
                tabDirector.direct(ModCreativeTabs.TAB_FARMERS_DELIGHT.getKey(), MDNExtraItems.ADZUKI_STEW_CUP);
            }
        }



        if (hasIncubation) {
            if (hasSullysMod) {
                tabDirector.direct(CreativeModeTabs.BUILDING_BLOCKS, IncubationSMExtraBlocks.TORTOISE_EGG_CRATE);
            }
        }

        if (hasAether) {
            if (hasSullysMod) {
                tabDirector.direct(AetherCreativeTabs.AETHER_EQUIPMENT_AND_UTILITIES.getKey(), AESMExtraItems.SKYROOT_LANTERNFISH_BUCKET);
            }

            if (hasAlexsMobs) {
                tabDirector.direct(AetherCreativeTabs.AETHER_EQUIPMENT_AND_UTILITIES.getKey(),
                        AEAMExtraItems.SKYROOT_SMALL_CATFISH_BUCKET,
                        AEAMExtraItems.SKYROOT_MEDIUM_CATFISH_BUCKET,
                        AEAMExtraItems.SKYROOT_LARGE_CATFISH_BUCKET,
                        AEAMExtraItems.SKYROOT_COMB_JELLEY_BUCKET,
                        AEAMExtraItems.SKYROOT_BLOBFISH_BUCKET,
                        AEAMExtraItems.SKYROOT_DEVILS_HOLE_PUPFISH_BUCKET,
                        AEAMExtraItems.SKYROOT_FRILLED_SHARK_BUCKET,
                        AEAMExtraItems.SKYROOT_FLYING_FISH_BUCKET,
                        AEAMExtraItems.SKYROOT_LOBSTER_BUCKET,
                        AEAMExtraItems.SKYROOT_MIMIC_OCTOPUS_BUCKET,
                        AEAMExtraItems.SKYROOT_MUDSKIPPER_BUCKET,
                        AEAMExtraItems.SKYROOT_TERRAPIN_BUCKET,
                        AEAMExtraItems.SKYROOT_TRIOPS_BUCKET,
                        AEAMExtraItems.SKYROOT_PLATYPUS_BUCKET
                );
            }
        }

        if (hasNetherDungeons) {
            if (hasFarmersDelight) {
                tabDirector.direct(ModCreativeTabs.TAB_FARMERS_DELIGHT.getKey(), NetherDungeonFDExtraItems.REINFORCED_GOLD_KNIFE);
            }

            if (hasSniffsWeapons) {
                tabDirector.direct(CreativeModeTabs.COMBAT,
                        NetherDungeonSWExtraItems.REINFORCED_GREATSWORD,
                        NetherDungeonSWExtraItems.REINFORCED_GREAT_AXE,
                        NetherDungeonSWExtraItems.REINFORCED_GREAT_PICKAXE
                );
            }

            if (hasNetherDelight) {
                tabDirector.direct(NDCreativeTab.NETHERS_DELIGHT_TAB.getKey(), NetherDungeonNDExtraItems.REINFORCED_GOLD_MACHETE)
                        .direct(CreativeModeTabs.TOOLS_AND_UTILITIES, NetherDungeonNDExtraItems.REINFORCED_GOLD_MACHETE);
            }
        }
    }
}
