package net.cyber_rat.extra_compat.core.registry.extension;

import com.seacroak.basicweapons.item.DaggerItem;
import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.cyber_rat.extra_compat.common.item.ForgottenDaggerItem;
import net.cyber_rat.extra_compat.common.item.FroststeelDaggerItem;
import net.cyber_rat.extra_compat.common.item.UtheriumDaggerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;

public interface DaggerExtension {

    default RegistryObject<DaggerItem> createDagger(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<DaggerItem>) factory.createTyped(name, () -> new DaggerItem(tier, damage, speed, properties));
    }

    default RegistryObject<DaggerItem> createForgottenDagger(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<DaggerItem>) factory.createTyped(name, () -> new ForgottenDaggerItem(tier, damage, speed, properties));
    }

    default RegistryObject<DaggerItem> createFroststeelDagger(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<DaggerItem>) factory.createTyped(name, () -> new FroststeelDaggerItem(tier, damage, speed, properties));
    }
    default RegistryObject<DaggerItem> createUtheriumDagger(String name, Tier tier, double damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<DaggerItem>) factory.createTyped(name, () -> new UtheriumDaggerItem(tier, damage, speed, properties));
    }
}
