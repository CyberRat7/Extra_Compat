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
        ItemFactory factory = InjectionContext.getInstance().getObject(ItemFactory.class);
        return (RegistryObject<KnifeItem>) factory.createTyped(name, () -> new KnifeItem(tier, damage, speed, new Item.Properties()));
    }

    default RegistryObject<? extends KnifeItem> createKnife(String name, Supplier<? extends KnifeItem> tTypedSupplier) {
        ItemFactory factory = InjectionContext.getInstance().getObject(ItemFactory.class);
        return (RegistryObject<KnifeItem>) factory.createTyped(name, tTypedSupplier);
    }
}
