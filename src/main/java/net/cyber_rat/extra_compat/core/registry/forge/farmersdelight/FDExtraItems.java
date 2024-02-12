package net.cyber_rat.extra_compat.core.registry.forge.farmersdelight;

import net.cyber_rat.extra_compat.ExtraCompat;
import net.cyber_rat.extra_compat.core.registry.object.ExtraCompatTiers;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.KnifeItem;

import static net.cyber_rat.extra_compat.core.registry.object.ExtraCompatItems.ITEM_FACTORY;

public class FDExtraItems {
    public static final RegistryObject<KnifeItem> REINFORCED_GOLD_KNIFE = ITEM_FACTORY.createKnife("reinforced_gold_knife", ExtraCompatTiers.EXTRA_COMPAT_REINFORCED_GOLD, 3.5f, -2f);

    public static void register() {
        ExtraCompat.LOGGER.info("Farmers Delight's compatibility has been initialized!");
    }
}