package net.cyber_rat.extra_compat.core.registry.extension;

import com.temporal.api.core.registry.factory.extension.item.AxeExtension;
import net.cyber_rat.extra_compat.common.item.ForgottenGreatAxeItem;
import net.cyber_rat.extra_compat.common.item.FroststeelGreatAxeItem;
import net.cyber_rat.extra_compat.common.item.UtheriumGreatAxeItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;
import nl.sniffiandros.sniffsweapons.item.GreatAxeItem;

public interface SWAxeExtension extends AxeExtension {
    default RegistryObject<? extends AxeItem> createGreatAxe(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        return createAxe(name, () -> new GreatAxeItem(tier, damage, speed, properties));
    }
    default RegistryObject<? extends AxeItem> createForgottenGreatAxe(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        return createAxe(name, () -> new ForgottenGreatAxeItem(tier, damage, speed, properties));
    }
    default RegistryObject<? extends AxeItem> createFroststeelGreatAxe(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        return createAxe(name, () -> new FroststeelGreatAxeItem(tier, damage, speed, properties));
    }
    default RegistryObject<? extends AxeItem> createUtheriumGreatAxe(String name, Tier tier, double damage, float speed, Item.Properties properties) {
        return createAxe(name, () -> new UtheriumGreatAxeItem(tier, damage, speed, properties));
    }
}
