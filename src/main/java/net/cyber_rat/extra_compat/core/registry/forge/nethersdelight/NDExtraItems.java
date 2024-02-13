package net.cyber_rat.extra_compat.core.registry.forge.nethersdelight;

import net.cyber_rat.extra_compat.ExtraCompat;
import net.cyber_rat.extra_compat.core.registry.facade.NDItemFactoryFacade;
import net.cyber_rat.extra_compat.core.registry.object.ExtraCompatTiers;
import net.minecraftforge.registries.RegistryObject;
import umpaz.nethersdelight.common.item.MacheteItem;

public class NDExtraItems {
    public static final NDItemFactoryFacade ITEM_FACTORY = NDItemFactoryFacade.getInstance();

    public static final RegistryObject<MacheteItem> REINFORCED_GOLD_MACHETE = ITEM_FACTORY.createMachete("reinforced_gold_machete", ExtraCompatTiers.EXTRA_COMPAT_REINFORCED_GOLD, 2, -2.6F);

    public static void register() {
        ExtraCompat.LOGGER.info("Nether's Delight compatibility has been initialized!");
    }
}