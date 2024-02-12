package net.cyber_rat.extra_compat.core.registry.extension;

import com.temporal.api.core.registry.factory.common.TypedFactory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;
import umpaz.nethersdelight.common.item.MacheteItem;

import java.util.function.Supplier;

@SuppressWarnings("unchecked")
public interface MacheteExtension {
    /**
     * @param args = args[0] - tier, args[1] - damage, args[2] - speed
     */
    default RegistryObject<MacheteItem> createMachete(String name, TypedFactory<Item> tTypedFactory, Object... args) {
        return (RegistryObject<MacheteItem>) tTypedFactory.createTyped(name, () -> new MacheteItem((Tier) args[0], (Integer) args[1], (Float) args[2], new Item.Properties()));
    }

    default RegistryObject<? extends MacheteItem> createMachete(String name, TypedFactory<Item> tTypedFactory, Supplier<? extends MacheteItem> tTypedSupplier) {
        return (RegistryObject<MacheteItem>) tTypedFactory.createTyped(name, tTypedSupplier);
    }
}
