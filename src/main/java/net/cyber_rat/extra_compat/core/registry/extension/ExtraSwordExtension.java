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
    /**
     * @param args = args[0] - tier, args[1] - damage, args[2] - speed
     */
    default RegistryObject<? extends SwordItem> createGreatSword(String name, TypedFactory<Item> tTypedFactory, Object... args) {
        return createSword(name, tTypedFactory, () -> new GreatSwordItem((Tier) args[0], (Integer) args[1], (Float) args[2], new Item.Properties()));
    }
}
