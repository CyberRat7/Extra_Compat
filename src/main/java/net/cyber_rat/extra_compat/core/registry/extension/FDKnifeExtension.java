package net.cyber_rat.extra_compat.core.registry.extension;

import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.KnifeItem;

import java.util.function.Supplier;

@SuppressWarnings("unchecked")
public interface FDKnifeExtension {
    default RegistryObject<KnifeItem> createKnife(String name, Tier tier, float damage, float speed) {
        return this.createKnife(name, tier, damage, speed, new Item.Properties());
    }

    default RegistryObject<KnifeItem> createKnife(String name, Tier tier, float damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<KnifeItem>) factory.createTyped(name, () -> new KnifeItem(tier, damage, speed, properties));
    }

    default RegistryObject<? extends KnifeItem> createKnife(String name, Supplier<? extends KnifeItem> tTypedSupplier) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<KnifeItem>) factory.createTyped(name, tTypedSupplier);
    }
}
