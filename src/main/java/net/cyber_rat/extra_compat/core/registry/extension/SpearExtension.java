package net.cyber_rat.extra_compat.core.registry.extension;

import com.seacroak.basicweapons.item.SpearItem;
import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.cyber_rat.extra_compat.common.item.ForgottenSpearItem;
import net.cyber_rat.extra_compat.common.item.FroststeelSpearItem;
import net.cyber_rat.extra_compat.common.item.UtheriumSpearItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;

public interface SpearExtension {

    default RegistryObject<SpearItem> createSpear(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<SpearItem>) factory.createTyped(name, () -> new SpearItem(tier, damage, speed, properties));
    }

    default RegistryObject<SpearItem> createForgottenSpear(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<SpearItem>) factory.createTyped(name, () -> new ForgottenSpearItem(tier, damage, speed, properties));
    }

    default RegistryObject<SpearItem> createFroststeelSpear(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<SpearItem>) factory.createTyped(name, () -> new FroststeelSpearItem(tier, damage, speed, properties));
    }
    default RegistryObject<SpearItem> createUtheriumSpear(String name, Tier tier, double damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<SpearItem>) factory.createTyped(name, () -> new UtheriumSpearItem(tier, damage, speed, properties));
    }
}
