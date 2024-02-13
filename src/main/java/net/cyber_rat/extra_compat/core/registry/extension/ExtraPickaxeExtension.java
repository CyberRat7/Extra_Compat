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
    default RegistryObject<? extends PickaxeItem> createGreatPickaxe(String name, TypedFactory<Item> tTypedFactory, Tier tier, int damage, float speed) {
        return createPickaxe(name, tTypedFactory, () -> new GreatPickaxeItem(tier, damage, speed, new Item.Properties()));
    }
}
