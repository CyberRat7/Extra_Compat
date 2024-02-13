package net.cyber_rat.extra_compat.core.registry.extension;

import com.temporal.api.core.registry.factory.common.TypedFactory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;
import umpaz.nethersdelight.common.item.MacheteItem;

import java.util.function.Supplier;

@SuppressWarnings("unchecked")
public interface MacheteExtension {
    default RegistryObject<MacheteItem> createMachete(String name, TypedFactory<Item> tTypedFactory, Tier tier, int damage, float speed) {
        return (RegistryObject<MacheteItem>) tTypedFactory.createTyped(name, () -> new MacheteItem(tier, damage, speed, new Item.Properties()));
    }

    default RegistryObject<? extends MacheteItem> createMachete(String name, TypedFactory<Item> tTypedFactory, Supplier<? extends MacheteItem> tTypedSupplier) {
        return (RegistryObject<MacheteItem>) tTypedFactory.createTyped(name, tTypedSupplier);
    }
}
