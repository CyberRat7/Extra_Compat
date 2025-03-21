package net.cyber_rat.extra_compat.core;

import com.aetherteam.aether.item.AetherCreativeTabs;
import com.temporal.api.core.engine.io.metadata.annotation.Dependency;
import com.temporal.api.core.engine.io.metadata.annotation.Execution;
import com.temporal.api.core.engine.io.metadata.annotation.Injected;
import com.temporal.api.core.event.tab.SimpleTabDirector;
import com.temporal.api.core.event.tab.TabDirector;
import net.cyber_rat.extra_compat.core.event.forge.*;
import net.cyber_rat.extra_compat.core.registry.forge.aether.AEAlexsMobsExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.aether.AESullysModExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.aether.AEUndergardenExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.basicweapons.BWUndergardenExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.farmersdelight.GoatedFDExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.incubation.IncubationSMExtraBlocks;
import net.cyber_rat.extra_compat.core.registry.forge.miners_delight.*;
import net.cyber_rat.extra_compat.core.registry.forge.sniffsweapons.SWUndergardenExtraItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import quek.undergarden.registry.UGCreativeModeTabs;
import vectorwing.farmersdelight.common.registry.ModCreativeTabs;

@Injected
public class CompatCore {
    @Dependency("farmersdelight")
    private boolean hasFarmersDelight;
    @Dependency("sniffsweapons")
    private boolean hasSniffsWeapons;
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
    @Dependency("undergarden")
    private boolean hasUndergarden;
    @Dependency("basicweapons")
    private boolean hasBasicWeapons;
    @Dependency("alexscaves")
    private boolean hasAlexCaves;
    @Dependency("upgrade_aquatic")
    private boolean hasUpgradeAquatic;
    @Dependency("unusualprehistory")
    private boolean hasUnusualPrehistory;

    @Execution
    public void register() {
        if (hasMinersDelight) {
            if (hasAlexsDelight) {
                MDADExtraItems.register();
            }
            if (hasAlexsMobs) {
                MDAMExtraItems.register();
            }
            if (hasNeapolitan) {
                MDNExtraItems.register();
            }
            if (hasSeasonals) {
                MDSExtraItems.register();
            }
            if (hasQuarkDelight) {
                MDQDExtraItems.register();
            }
            if (hasAutumnity) {
                MDATExtraItems.register();
            }

        }
        if (hasIncubation) {
            if (hasSullysMod) {
                IncubationSMExtraBlocks.register();
            }
        }

        if (hasBasicWeapons) {
            if (hasUndergarden) {
                BWUndergardenExtraItems.register();
                BWUndergardenExtraItems.setupToolEvents();
            }
        }

        if (hasAether) {
            if (hasUndergarden) {
                AEUndergardenExtraItems.register();
            }
            if (hasAlexsMobs) {
                AEAlexsMobsExtraItems.register();
                AEAlexsMobsExtraItems.setupBucketReplacements();
            }
            if (hasSullysMod) {
                AESullysModExtraItems.register();
                AESullysModExtraItems.setupBucketReplacements();
            }
        }

        if (hasFarmersDelight) {
            if (hasGoated) {
                GoatedFDExtraItems.register();
            }
        }

        if (hasUndergarden) {
            if(hasSniffsWeapons) {
                SWUndergardenExtraItems.register();
               SWUndergardenExtraItems.setupToolEvents();
            }
        }
    }



    public void registerCuriosRenders() {
        if (hasAether) {
            if (hasUndergarden) {
                AEUndergardenExtraItems.registerCuriosRenderers();
            }
        }
    }


    @SuppressWarnings("unchecked")
    public void addCreative(BuildCreativeModeTabContentsEvent event) {
        final TabDirector tabDirector = SimpleTabDirector.create(event);

        if (hasFarmersDelight) {
            if (hasGoated) {
                tabDirector.direct(ModCreativeTabs.TAB_FARMERS_DELIGHT.getKey(), GoatedFDExtraItems.CHEVON_CHOP, GoatedFDExtraItems.COOKED_CHEVON_CHOP);
            }
        }


        if (hasIncubation) {
            if (hasSullysMod) {
                tabDirector.direct(CreativeModeTabs.BUILDING_BLOCKS, IncubationSMExtraBlocks.TORTOISE_EGG_CRATE);
            }
        }


        if (hasBasicWeapons) {
            if (hasUndergarden) {
                tabDirector.direct(CreativeModeTabs.COMBAT, BWUndergardenExtraItems.CLOGGRUM_CLUB, BWUndergardenExtraItems.CLOGGRUM_SPEAR, BWUndergardenExtraItems.CLOGGRUM_QUARTERSTAFF, BWUndergardenExtraItems.CLOGGRUM_DAGGER, BWUndergardenExtraItems.CLOGGRUM_HAMMER, BWUndergardenExtraItems.FORGOTTEN_HAMMER, BWUndergardenExtraItems.FORGOTTEN_CLUB, BWUndergardenExtraItems.FORGOTTEN_SPEAR, BWUndergardenExtraItems.FORGOTTEN_QUARTERSTAFF, BWUndergardenExtraItems.FORGOTTEN_DAGGER, BWUndergardenExtraItems.FROSTSTEEL_CLUB, BWUndergardenExtraItems.FROSTSTEEL_HAMMER, BWUndergardenExtraItems.FROSTSTEEL_SPEAR, BWUndergardenExtraItems.FROSTSTEEL_QUARTERSTAFF, BWUndergardenExtraItems.FROSTSTEEL_DAGGER, BWUndergardenExtraItems.UTHERIUM_DAGGER, BWUndergardenExtraItems.UTHERIUM_HAMMER, BWUndergardenExtraItems.UTHERIUM_SPEAR, BWUndergardenExtraItems.UTHERIUM_QUARTERSTAFF, BWUndergardenExtraItems.UTHERIUM_CLUB);
            }
        }


        if (hasUndergarden) {
            if (hasAether) {
                tabDirector.direct(CreativeModeTabs.COMBAT, AEUndergardenExtraItems.CLOGGRUM_GLOVES, AEUndergardenExtraItems.FROSTSTEEL_GLOVES, AEUndergardenExtraItems.UTHERIUM_GLOVES);
            }

            if (hasUndergarden) {
                if (hasSniffsWeapons) {
                    tabDirector.direct(CreativeModeTabs.COMBAT, SWUndergardenExtraItems.CLOGGRUM_GREAT_AXE,
                            SWUndergardenExtraItems.CLOGGRUM_GREATSWORD, SWUndergardenExtraItems.FORGOTTEN_GREATSWORD,
                            SWUndergardenExtraItems.FORGOTTEN_GREAT_AXE, SWUndergardenExtraItems.UTHERIUM_GREAT_AXE,
                            SWUndergardenExtraItems.UTHERIUM_GREATSWORD, SWUndergardenExtraItems.FROSTSTEEL_GREAT_AXE,
                            SWUndergardenExtraItems.FROSTSTEEL_GREATSWORD, SWUndergardenExtraItems.UTHERIUM_GREATSWORD, SWUndergardenExtraItems.UTHERIUM_GREAT_AXE, SWUndergardenExtraItems.FORGOTTEN_GREAT_AXE, SWUndergardenExtraItems.FORGOTTEN_GREATSWORD, SWUndergardenExtraItems.FROSTSTEEL_GREAT_AXE, SWUndergardenExtraItems.FROSTSTEEL_GREATSWORD, SWUndergardenExtraItems.CLOGGRUM_GREAT_AXE, SWUndergardenExtraItems.CLOGGRUM_GREATSWORD);
                }
            }


            if (hasAether) {
                if (hasSullysMod) {
                    tabDirector.direct(AetherCreativeTabs.AETHER_EQUIPMENT_AND_UTILITIES.getKey(), AESullysModExtraItems.SKYROOT_LANTERNFISH_BUCKET);
                }


                if (hasAlexsMobs) {
                    tabDirector.direct(AetherCreativeTabs.AETHER_EQUIPMENT_AND_UTILITIES.getKey(),
                            AEAlexsMobsExtraItems.SKYROOT_SMALL_CATFISH_BUCKET,
                            AEAlexsMobsExtraItems.SKYROOT_MEDIUM_CATFISH_BUCKET,
                            AEAlexsMobsExtraItems.SKYROOT_LARGE_CATFISH_BUCKET,
                            AEAlexsMobsExtraItems.SKYROOT_COMB_JELLEY_BUCKET,
                            AEAlexsMobsExtraItems.SKYROOT_BLOBFISH_BUCKET,
                            AEAlexsMobsExtraItems.SKYROOT_DEVILS_HOLE_PUPFISH_BUCKET,
                            AEAlexsMobsExtraItems.SKYROOT_FRILLED_SHARK_BUCKET,
                            AEAlexsMobsExtraItems.SKYROOT_FLYING_FISH_BUCKET,
                            AEAlexsMobsExtraItems.SKYROOT_LOBSTER_BUCKET,
                            AEAlexsMobsExtraItems.SKYROOT_MIMIC_OCTOPUS_BUCKET,
                            AEAlexsMobsExtraItems.SKYROOT_MUDSKIPPER_BUCKET,
                            AEAlexsMobsExtraItems.SKYROOT_TERRAPIN_BUCKET,
                            AEAlexsMobsExtraItems.SKYROOT_TRIOPS_BUCKET,
                            AEAlexsMobsExtraItems.SKYROOT_PLATYPUS_BUCKET
                    );
                }
            }

        }
    }
    public void rightClick(PlayerInteractEvent.RightClickBlock event) {
        if (hasAlexCaves) {
            EventAdapter<PlayerInteractEvent.RightClickBlock> marineSnowClickEventAdapter = new MarineSnowClickEventAdapter();
            if (hasUpgradeAquatic) {
                MarineSnowInteractionsInitializer initializer = new UAMarineSnowInteractionsInitializer();
                initializer.initialize();
            }

            if (hasUnusualPrehistory) {
                MarineSnowInteractionsInitializer initializer = new UPMarineSnowInteractionsInitializer();
                initializer.initialize();
            }

            marineSnowClickEventAdapter.adapt(event);
        }
    }
}
