package net.cyber_rat.extra_compat.core.registry;

import net.cyber_rat.extra_compat.core.registry.object.ExtraCompatItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.RegistryObject;

import static net.cyber_rat.extra_compat.core.registry.object.ExtraCompatCreativeModeTabs.CREATIVE_MODE_TABS;


public class SWCompatRegistry {

    public static final RegistryObject<Item> REINFORCED_GREATSWORD = ExtraCompatItems.ITEMS.register("reinforced_gold_greatsword",
            () -> new SwordItem(ExtraCompatTiers.EXTRA_COMPAT_REINFORCED_GOLD, 8, -2.9F, (new Item.Properties().stacksTo(1))));

    public static final RegistryObject<Item> REINFORCED_GREAT_AXE = ExtraCompatItems.ITEMS.register("reinforced_gold_great_axe",
            () -> new SwordItem(ExtraCompatTiers.EXTRA_COMPAT_REINFORCED_GOLD, 10, -3.2F, (new Item.Properties().stacksTo(1))));

    public static final RegistryObject<CreativeModeTab> SW_COMPAT_TAB =
            CREATIVE_MODE_TABS.register("sw_compat_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(SWCompatRegistry.
                    REINFORCED_GREAT_AXE.get())).title(Component.translatable( "extra_compat.sniffs_weapons_tab")).displayItems((displayParameters, output) -> {
                output.accept(SWCompatRegistry.REINFORCED_GREAT_AXE.get());
                output.accept(SWCompatRegistry.REINFORCED_GREATSWORD.get());
            } ).build());

    public static void register() {

    }
}
