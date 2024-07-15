package net.cyber_rat.extra_compat.core.registry.forge.miners_delight;

import com.github.alexthe666.alexsmobs.effect.AMEffectRegistry;
import com.sammy.minersdelight.content.item.CopperCupFoodItem;
import net.cyber_rat.extra_compat.ExtraCompat;
import net.cyber_rat.extra_compat.core.registry.factory.MDItemFactory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class MDAMExtraItems {
    public static final MDItemFactory ITEM_FACTORY = new MDItemFactory();
    public static final RegistryObject<CopperCupFoodItem> MOSQUITO_REPELLENT_STEW_CUP = ITEM_FACTORY.createCup("mosquito_repellent_stew_cup", 2, 0.2f, () -> new MobEffectInstance(AMEffectRegistry.MOSQUITO_REPELLENT.get()).getEffect(), 12000, 0, 1.0F);




    public static void register() {
        ExtraCompat.LOGGER.info("Miner's Delight/Alex's Mobs compatibility has been initialized!");
    }
}
