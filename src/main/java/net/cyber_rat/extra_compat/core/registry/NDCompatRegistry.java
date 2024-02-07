package net.cyber_rat.extra_compat.core.registry;

import net.cyber_rat.extra_compat.core.registry.ExtraCompatTiers;
import net.cyber_rat.extra_compat.core.registry.object.ExtraCompatItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;
import umpaz.nethersdelight.common.item.MacheteItem;


import static net.cyber_rat.extra_compat.core.registry.object.ExtraCompatCreativeModeTabs.CREATIVE_MODE_TABS;


public class NDCompatRegistry {

    public static final RegistryObject<Item> REINFORCED_GOLD_MACHETE = ExtraCompatItems.ITEMS.register("reinforced_gold_machete",
            () -> new MacheteItem(ExtraCompatTiers.EXTRA_COMPAT_REINFORCED_GOLD, 2, -2.6F, (new Item.Properties().stacksTo(1))));

    public static final RegistryObject<CreativeModeTab> ND_COMPAT_TAB =
            CREATIVE_MODE_TABS.register("nd_compat_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(NDCompatRegistry.REINFORCED_GOLD_MACHETE.get())).title(Component.translatable( "extra_compat.nethers_delight_tab")).displayItems((displayParameters, output) -> {
                output.accept(NDCompatRegistry.REINFORCED_GOLD_MACHETE.get());
            } ).build());



    public static void register() {

    }
}