package net.cyber_rat.extra_compat.core.registry.extension;

import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;
import umpaz.nethersdelight.common.item.MacheteItem;

import java.util.function.Supplier;

@SuppressWarnings("unchecked")
public interface NDMacheteExtension {
    default RegistryObject<MacheteItem> createMachete(String name, Tier tier, int damage, float speed) {
        return this.createMachete(name, tier, damage, speed, new Item.Properties());
    }

    default RegistryObject<MacheteItem> createMachete(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<MacheteItem>) factory.createTyped(name, () -> new MacheteItem(tier, damage, speed, properties));
    }

    default RegistryObject<? extends MacheteItem> createMachete(String name, Supplier<? extends MacheteItem> tTypedSupplier) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<MacheteItem>) factory.createTyped(name, tTypedSupplier);
    }
}
