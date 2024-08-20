package net.cyber_rat.extra_compat.core;

import com.aetherteam.aether.item.AetherCreativeTabs;
import com.temporal.api.core.engine.io.metadata.annotation.Dependency;
import com.temporal.api.core.engine.io.metadata.annotation.Execution;
import com.temporal.api.core.engine.io.metadata.annotation.Injected;
import com.temporal.api.core.event.tab.SimpleTabDirector;
import com.temporal.api.core.event.tab.TabDirector;
import net.cyber_rat.extra_compat.ExtraCompat;
import net.cyber_rat.extra_compat.core.registry.forge.aether.AEAlexsMobsExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.aether.AESullysModExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.aether.AEUndergardenExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.basicweapons.BWUndergardenExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.farmersdelight.GoatedFDExtraItems;
import net.cyber_rat.extra_compat.core.registry.forge.incubation.IncubationSMExtraBlocks;
import net.cyber_rat.extra_compat.core.registry.forge.miners_delight.*;
import net.cyber_rat.extra_compat.core.registry.forge.sniffsweapons.SWUndergardenExtraItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import quek.undergarden.registry.UGCreativeModeTabs;
import umpaz.nethersdelight.common.registry.NDCreativeTab;
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

        if (hasBasicWeapons){
            if (hasUndergarden){
                BWUndergardenExtraItems.register();
                BWUndergardenExtraItems.setupToolEvents();
            }
        }

        if (hasAether) {
            if (hasUndergarden){
                AEUndergardenExtraItems.register();
            }
            if (hasAlexsMobs){
                AEAlexsMobsExtraItems.register();
                AEAlexsMobsExtraItems.setupBucketReplacements();
            }
            if (hasSullysMod) {
                AESullysModExtraItems.register();
                AESullysModExtraItems.setupBucketReplacements();
            }
        }

        if (hasFarmersDelight){
            if (hasGoated){
                GoatedFDExtraItems.register();
            }
        }


        if (hasUndergarden){
            if(hasSniffsWeapons){
                SWUndergardenExtraItems.register();
               SWUndergardenExtraItems.setupToolEvents();
            }
        }
    }



    public void registerCuriosRenders(){
        if (hasAether){
            if(hasUndergarden)
                AEUndergardenExtraItems.registerCuriosRenderers();
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

       /* if (hasMinersDelight){
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
        */


        if (hasIncubation) {
            if (hasSullysMod) {
                tabDirector.direct(CreativeModeTabs.BUILDING_BLOCKS, IncubationSMExtraBlocks.TORTOISE_EGG_CRATE);
            }
        }

        if (hasBasicWeapons){
            if(hasUndergarden){
                tabDirector.direct(UGCreativeModeTabs.TAB.getKey(), BWUndergardenExtraItems.CLOGGRUM_CLUB, BWUndergardenExtraItems.CLOGGRUM_SPEAR, BWUndergardenExtraItems.CLOGGRUM_QUARTERSTAFF, BWUndergardenExtraItems.CLOGGRUM_DAGGER, BWUndergardenExtraItems.CLOGGRUM_HAMMER, BWUndergardenExtraItems.FORGOTTEN_HAMMER, BWUndergardenExtraItems.FORGOTTEN_CLUB, BWUndergardenExtraItems.FORGOTTEN_SPEAR, BWUndergardenExtraItems.FORGOTTEN_QUARTERSTAFF, BWUndergardenExtraItems.FORGOTTEN_DAGGER, BWUndergardenExtraItems.FROSTSTEEL_CLUB, BWUndergardenExtraItems.FROSTSTEEL_HAMMER, BWUndergardenExtraItems.FROSTSTEEL_SPEAR, BWUndergardenExtraItems.FROSTSTEEL_QUARTERSTAFF, BWUndergardenExtraItems.FROSTSTEEL_DAGGER, BWUndergardenExtraItems.UTHERIUM_DAGGER,  BWUndergardenExtraItems.UTHERIUM_HAMMER,  BWUndergardenExtraItems.UTHERIUM_SPEAR,  BWUndergardenExtraItems.UTHERIUM_QUARTERSTAFF,  BWUndergardenExtraItems.UTHERIUM_CLUB);
            }
        }

        if (hasAether) {
            if (hasSullysMod) {
                tabDirector.direct(AetherCreativeTabs.AETHER_EQUIPMENT_AND_UTILITIES.getKey(), AESullysModExtraItems.SKYROOT_LANTERNFISH_BUCKET);
            }
            
            if (hasUndergarden){
                tabDirector.direct(UGCreativeModeTabs.TAB.getKey(), AEUndergardenExtraItems.CLOGGRUM_GLOVES, AEUndergardenExtraItems.FROSTSTEEL_GLOVES, AEUndergardenExtraItems.UTHERIUM_GLOVES);
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

        if (hasUndergarden){
            if(hasSniffsWeapons){
                tabDirector.direct(UGCreativeModeTabs.TAB.getKey(), SWUndergardenExtraItems.CLOGGRUM_GREAT_AXE, SWUndergardenExtraItems.CLOGGRUM_GREATSWORD, SWUndergardenExtraItems.FORGOTTEN_GREATSWORD, SWUndergardenExtraItems.FORGOTTEN_GREAT_AXE, SWUndergardenExtraItems.UTHERIUM_GREAT_AXE, SWUndergardenExtraItems.UTHERIUM_GREATSWORD, SWUndergardenExtraItems.FROSTSTEEL_GREAT_AXE, SWUndergardenExtraItems.FROSTSTEEL_GREATSWORD);

            }
        }
    }
}
