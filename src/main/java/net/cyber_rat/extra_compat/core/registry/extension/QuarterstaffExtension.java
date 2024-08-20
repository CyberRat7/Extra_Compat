package net.cyber_rat.extra_compat.core.registry.extension;

import com.seacroak.basicweapons.item.QuarterstaffItem;
import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.cyber_rat.extra_compat.common.item.ForgottenQuarterstaffItem;
import net.cyber_rat.extra_compat.common.item.FroststeelQuarterstaffItem;
import net.cyber_rat.extra_compat.common.item.UtheriumQuarterstaffItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;

public interface QuarterstaffExtension {

    default RegistryObject<QuarterstaffItem> createQuarterstaff(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<QuarterstaffItem>) factory.createTyped(name, () -> new QuarterstaffItem(tier, damage, speed, properties));
    }
    default RegistryObject<QuarterstaffItem> createForgottenQuarterstaff(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<QuarterstaffItem>) factory.createTyped(name, () -> new ForgottenQuarterstaffItem(tier, damage, speed, properties));
    }
    default RegistryObject<QuarterstaffItem> createFroststeelQuarterstaff(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<QuarterstaffItem>) factory.createTyped(name, () -> new FroststeelQuarterstaffItem(tier, damage, speed, properties));
    }
    default RegistryObject<QuarterstaffItem> createUtheriumQuarterstaff(String name, Tier tier, double damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<QuarterstaffItem>) factory.createTyped(name, () -> new UtheriumQuarterstaffItem(tier, damage, speed, properties));
    }
}
