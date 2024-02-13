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
    default RegistryObject<? extends AxeItem> createGreatAxe(String name, TypedFactory<Item> tTypedFactory, Tier tier, int damage, float speed) {
        return createAxe(name, tTypedFactory, () -> new GreatAxeItem(tier, damage, speed, new Item.Properties()));
    }
}
