package net.cyber_rat.extra_compat.core.registry.forge.sniffsweapons;

import net.cyber_rat.extra_compat.ExtraCompat;
import net.cyber_rat.extra_compat.core.registry.object.ExtraCompatTiers;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.RegistryObject;

import static net.cyber_rat.extra_compat.core.registry.object.ExtraCompatItems.ITEM_FACTORY;

public class SWExtraItems {
    public static final RegistryObject<? extends SwordItem> REINFORCED_GREATSWORD = ITEM_FACTORY.createGreatSword("reinforced_gold_greatsword", ExtraCompatTiers.EXTRA_COMPAT_REINFORCED_GOLD, 8, -2.9f);
    public static final RegistryObject<? extends AxeItem> REINFORCED_GREAT_AXE = ITEM_FACTORY.createGreatAxe("reinforced_gold_great_axe", ExtraCompatTiers.EXTRA_COMPAT_REINFORCED_GOLD, 10, -3.2f);

    public static void register() {
        ExtraCompat.LOGGER.info("Sniff's Weapons' compatibility has been initialized!");
    }
}
