package net.cyber_rat.extra_compat.core.registry.forge.miners_delight;

import com.sammy.minersdelight.content.item.CopperCupFoodItem;
import com.teamabnormals.autumnity.core.registry.AutumnityMobEffects;
import net.cyber_rat.extra_compat.ExtraCompat;
import net.cyber_rat.extra_compat.core.registry.factory.MDItemFactory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class MDQDExtraItems {
        public static final MDItemFactory ITEM_FACTORY = new MDItemFactory();
    public static final RegistryObject<CopperCupFoodItem> MISO_WITH_BAMBOO_SPROUTS_CUP = ITEM_FACTORY.createCup("miso_with_bamboo_sprouts_cup", 5, 0.8f, () -> new MobEffectInstance(ModEffects.COMFORT.get()).getEffect(), 2400, 0, 1.0F);

    public static final RegistryObject<CopperCupFoodItem> CAVERN_EXPLORER_STEW_CUP = ITEM_FACTORY.createTwoEffectCup("cavern_explorer_stew_cup", 5, 0.4f, () -> new MobEffectInstance(MobEffects.NIGHT_VISION).getEffect(), 2400, 0, 1.0F, () -> new MobEffectInstance(MobEffects.DIG_SPEED).getEffect(), 2400, 0, 1.0F);

    public static void register() {
        ExtraCompat.LOGGER.info("Miner's Delight/Quark Delight compatibility has been initialized!");
    }
}


