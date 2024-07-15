package net.cyber_rat.extra_compat.core.registry.forge.miners_delight;

import com.sammy.minersdelight.content.item.CopperCupFoodItem;
import com.teamabnormals.autumnity.core.registry.AutumnityMobEffects;
import net.cyber_rat.extra_compat.ExtraCompat;
import net.cyber_rat.extra_compat.core.registry.factory.MDItemFactory;
import net.cyber_rat.extra_compat.core.registry.factory.NDItemFactory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class MDATExtraItems {

    public static final MDItemFactory ITEM_FACTORY = new MDItemFactory();
    public static final RegistryObject<CopperCupFoodItem> FOUL_SOUP_CUP = ITEM_FACTORY.createCup("foul_soup_cup", 1, 0.2f, () -> new MobEffectInstance(AutumnityMobEffects.FOUL_TASTE.get()).getEffect(), 1200, 0, 1.0F);

    public static void register() {
        ExtraCompat.LOGGER.info("Miner's Delight/Autumnity compatibility has been initialized!");
    }
}
