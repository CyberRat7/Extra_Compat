package net.cyber_rat.extra_compat.core.registry.extension;

import com.seacroak.basicweapons.item.HammerItem;
import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.cyber_rat.extra_compat.common.item.ForgottenHammerItem;
import net.cyber_rat.extra_compat.common.item.FroststeelHammerItem;
import net.cyber_rat.extra_compat.common.item.UtheriumHammerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;

public interface HammerExtension {

    default RegistryObject<HammerItem> createHammer(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<HammerItem>) factory.createTyped(name, () -> new HammerItem(tier, damage, speed, properties));
    }
    default RegistryObject<HammerItem> createForgottenHammer(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<HammerItem>) factory.createTyped(name, () -> new ForgottenHammerItem(tier, damage, speed, properties));
    }

    default RegistryObject<HammerItem> createFroststeelHammer(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<HammerItem>) factory.createTyped(name, () -> new FroststeelHammerItem(tier, damage, speed, properties));
    }

    default RegistryObject<HammerItem> createUtheriumHammer(String name, Tier tier, double damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<HammerItem>) factory.createTyped(name, () -> new UtheriumHammerItem(tier, damage, speed, properties));
    }
}
