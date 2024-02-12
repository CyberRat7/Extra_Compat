package net.cyber_rat.extra_compat.core.registry.extension;

import com.temporal.api.core.registry.factory.common.TypedFactory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.KnifeItem;

import java.util.function.Supplier;

@SuppressWarnings("unchecked")
public interface KnifeExtension {
    /**
     * @param args = args[0] - tier, args[1] - damage, args[2] - speed
     */
    default RegistryObject<KnifeItem> createKnife(String name, TypedFactory<Item> tTypedFactory, Object... args) {
        return (RegistryObject<KnifeItem>) tTypedFactory.createTyped(name, () -> new KnifeItem((Tier) args[0], (Float) args[1], (Float) args[2], new Item.Properties()));
    }

    default RegistryObject<? extends KnifeItem> createKnife(String name, TypedFactory<Item> tTypedFactory, Supplier<? extends KnifeItem> tTypedSupplier) {
        return (RegistryObject<KnifeItem>) tTypedFactory.createTyped(name, tTypedSupplier);
    }
}
