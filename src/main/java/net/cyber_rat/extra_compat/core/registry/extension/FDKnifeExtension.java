package net.cyber_rat.extra_compat.core.registry.extension;

import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.KnifeItem;

import java.util.function.Supplier;

@SuppressWarnings("unchecked")
public interface FDKnifeExtension {
    default RegistryObject<KnifeItem> createKnife(String name, Tier tier, float damage, float speed) {
        return (RegistryObject<KnifeItem>) ItemFactory.getInstance().createTyped(name, () -> new KnifeItem(tier, damage, speed, new Item.Properties()));
    }

    default RegistryObject<? extends KnifeItem> createKnife(String name, Supplier<? extends KnifeItem> tTypedSupplier) {
        return (RegistryObject<KnifeItem>) ItemFactory.getInstance().createTyped(name, tTypedSupplier);
    }
}
