package net.cyber_rat.extra_compat.core.registry.extension;

import com.temporal.api.core.registry.factory.common.TypedFactory;
import com.temporal.api.core.registry.factory.extension.item.AxeExtension;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;
import nl.sniffiandros.sniffsweapons.item.GreatAxeItem;

@SuppressWarnings("unchecked")
public interface ExtraAxeExtension extends AxeExtension {
    /**
     * @param args = args[0] - tier, args[1] - damage, args[2] - speed
     */
    default RegistryObject<? extends AxeItem> createGreatAxe(String name, TypedFactory<Item> tTypedFactory, Object... args) {
        return createAxe(name, tTypedFactory, () -> new GreatAxeItem((Tier) args[0], (Integer) args[1], (Float) args[2], new Item.Properties()));
    }
}
