package net.cyber_rat.extra_compat.core.registry;

import net.cyber_rat.extra_compat.core.registry.ExtraCompatTiers;
import net.cyber_rat.extra_compat.core.registry.object.ExtraCompatItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.KnifeItem;

import static net.cyber_rat.extra_compat.core.registry.object.ExtraCompatCreativeModeTabs.CREATIVE_MODE_TABS;


public class FDCompatRegistry {

    public static final RegistryObject<Item> REINFORCED_GOLD_KNIFE = ExtraCompatItems.ITEMS.register("reinforced_gold_knife",
            () -> new KnifeItem(ExtraCompatTiers.EXTRA_COMPAT_REINFORCED_GOLD, 3.5F, -2F, (new Item.Properties().stacksTo(1))));

    public static final RegistryObject<CreativeModeTab> FD_COMPAT_TAB =
            CREATIVE_MODE_TABS.register("fd_compat_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(FDCompatRegistry.REINFORCED_GOLD_KNIFE.get())).title(Component.translatable( "extra_compat.farmers_delight_tab")).displayItems((displayParameters, output) -> {
                output.accept(FDCompatRegistry.REINFORCED_GOLD_KNIFE.get());
            } ).build());



    public static void register() {

    }
}