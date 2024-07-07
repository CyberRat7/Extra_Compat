package net.cyber_rat.extra_compat.core.registry.forge.farmersdelight;

import net.cyber_rat.extra_compat.ExtraCompat;
import net.cyber_rat.extra_compat.core.registry.factory.FDItemFactory;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class GoatedFDExtraItems {

    public static final FDItemFactory ITEM_FACTORY = new FDItemFactory();

    public static final RegistryObject<Item> CHEVON_CHOP = ITEM_FACTORY.createFood("chevon_chop", 1, 0.2f);
    public static final RegistryObject<Item> COOKED_CHEVON_CHOP = ITEM_FACTORY.createFood("cooked_chevon_chop", 3, 1f);
    public static void register() {
        ExtraCompat.LOGGER.info("Farmers Delight's compatibility has been initialized!");
    }
}
