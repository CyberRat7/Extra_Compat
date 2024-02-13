package net.cyber_rat.extra_compat.core.registry.extension;

import com.temporal.api.core.registry.factory.common.TypedFactory;
import com.temporal.api.core.registry.factory.extension.item.SwordExtension;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;
import nl.sniffiandros.sniffsweapons.item.GreatSwordItem;

@SuppressWarnings("unchecked")
public interface ExtraSwordExtension extends SwordExtension {
    default RegistryObject<? extends SwordItem> createGreatSword(String name, TypedFactory<Item> tTypedFactory, Tier tier, int damage, float speed) {
        return createSword(name, tTypedFactory, () -> new GreatSwordItem(tier, damage, speed, new Item.Properties()));
    }
}
