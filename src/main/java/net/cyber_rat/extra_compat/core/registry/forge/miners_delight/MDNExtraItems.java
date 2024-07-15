package net.cyber_rat.extra_compat.core.registry.forge.miners_delight;

import com.cosmicgelatin.seasonals.core.registry.SeasonalsMobEffects;
import com.sammy.minersdelight.content.item.CopperCupFoodItem;
import com.teamabnormals.autumnity.core.registry.AutumnityMobEffects;
import com.teamabnormals.neapolitan.core.registry.NeapolitanMobEffects;
import net.cyber_rat.extra_compat.ExtraCompat;
import net.cyber_rat.extra_compat.core.registry.factory.MDItemFactory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraftforge.registries.RegistryObject;

public class MDNExtraItems {
    public static final MDItemFactory ITEM_FACTORY = new MDItemFactory();
    public static final RegistryObject<CopperCupFoodItem> ADZUKI_STEW_CUP = ITEM_FACTORY.createCup("adzuki_stew_cup", 4, 0.6f, () -> new MobEffectInstance(NeapolitanMobEffects.HARMONY.get()).getEffect(), 200, 0, 1.0F);
    public static void register() {
        ExtraCompat.LOGGER.info("Miner's Delight/Neapolitan compatibility has been initialized!");
    }
}
