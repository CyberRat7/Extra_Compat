package net.cyber_rat.extra_compat.core.registry.extension;

import com.temporal.api.core.registry.factory.extension.item.AxeExtension;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;
import nl.sniffiandros.sniffsweapons.item.GreatAxeItem;

public interface SWAxeExtension extends AxeExtension {
    default RegistryObject<? extends AxeItem> createGreatAxe(String name, Tier tier, int damage, float speed) {
        return createAxe(name, () -> new GreatAxeItem(tier, damage, speed, new Item.Properties()));
    }
}
