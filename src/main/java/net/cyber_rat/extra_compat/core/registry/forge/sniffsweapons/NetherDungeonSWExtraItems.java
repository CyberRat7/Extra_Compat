package net.cyber_rat.extra_compat.core.registry.forge.sniffsweapons;

import net.cyber_rat.extra_compat.ExtraCompat;
import net.cyber_rat.extra_compat.core.registry.factory.SWItemFactory;
import net.cyber_rat.extra_compat.core.registry.object.ExtraCompatTiers;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.RegistryObject;

public class NetherDungeonSWExtraItems {
    public static final SWItemFactory ITEM_FACTORY = new SWItemFactory();

    public static final RegistryObject<? extends SwordItem> REINFORCED_GREATSWORD = ITEM_FACTORY.createGreatSword("reinforced_gold_greatsword", ExtraCompatTiers.EXTRA_COMPAT_REINFORCED_GOLD, 8, -2.9f);
    public static final RegistryObject<? extends AxeItem> REINFORCED_GREAT_AXE = ITEM_FACTORY.createGreatAxe("reinforced_gold_great_axe", ExtraCompatTiers.EXTRA_COMPAT_REINFORCED_GOLD, 10, -3.2f);
    public static final RegistryObject<? extends PickaxeItem> REINFORCED_GREAT_PICKAXE = ITEM_FACTORY.createGreatPickaxe("reinforced_gold_great_pickaxe", ExtraCompatTiers.EXTRA_COMPAT_REINFORCED_GOLD,  6, -3.35F);

    public static void register() {
        ExtraCompat.LOGGER.info("Sniff's Weapons' compatibility with Nether Dungeons mod has been initialized!");
    }
}
