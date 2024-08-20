package net.cyber_rat.extra_compat.core.registry.extension;

import com.temporal.api.core.registry.factory.extension.item.PickaxeExtension;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;
import nl.sniffiandros.sniffsweapons.item.GreatPickaxeItem;

public interface SWPickaxeExtension extends PickaxeExtension {
    default RegistryObject<? extends PickaxeItem> createGreatPickaxe(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        return createPickaxe(name, () -> new GreatPickaxeItem(tier, damage, speed, properties));
    }
}
