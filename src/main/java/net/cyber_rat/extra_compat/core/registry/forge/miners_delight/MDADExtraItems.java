package net.cyber_rat.extra_compat.core.registry.forge.miners_delight;

import com.sammy.minersdelight.content.item.CopperCupFoodItem;
import net.cyber_rat.extra_compat.ExtraCompat;
import net.cyber_rat.extra_compat.core.registry.factory.MDItemFactory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class MDADExtraItems {
    public static final MDItemFactory ITEM_FACTORY = new MDItemFactory();
    public static final RegistryObject<CopperCupFoodItem> KANGAROO_STEW_CUP = ITEM_FACTORY.createCup("kangaroo_stew_cup", 5, 0.6f, () -> new MobEffectInstance(ModEffects.NOURISHMENT.get()).getEffect(), 3400, 0, 1.0F);

    public static final RegistryObject<CopperCupFoodItem> ACACIA_BLOSSOM_SOUP_CUP = ITEM_FACTORY.createCup("acacia_blossom_soup_cup", 6, 0.8f, () -> new MobEffectInstance(ModEffects.NOURISHMENT.get()).getEffect(), 3400, 0, 1.0F);



    public static void register() {
        ExtraCompat.LOGGER.info("Miner's Delight/Alex's Delight compatibility has been initialized!");
    }
}


