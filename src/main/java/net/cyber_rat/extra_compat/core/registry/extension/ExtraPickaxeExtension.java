package net.cyber_rat.extra_compat.core.registry.extension;

import com.temporal.api.core.registry.factory.common.TypedFactory;
import com.temporal.api.core.registry.factory.extension.item.PickaxeExtension;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;
import nl.sniffiandros.sniffsweapons.item.GreatPickaxeItem;

@SuppressWarnings("unchecked")
public interface ExtraPickaxeExtension extends PickaxeExtension {
    /**
     * @param args = args[0] - tier, args[1] - damage, args[2] - speed
     */
    default RegistryObject<? extends PickaxeItem> createGreatPickaxe(String name, TypedFactory<Item> tTypedFactory, Object... args) {
        return createPickaxe(name, tTypedFactory, () -> new GreatPickaxeItem((Tier) args[0], (Integer) args[1], (Float) args[2], new Item.Properties()));
    }
}
