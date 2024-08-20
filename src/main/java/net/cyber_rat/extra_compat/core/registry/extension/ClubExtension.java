package net.cyber_rat.extra_compat.core.registry.extension;

import com.seacroak.basicweapons.item.ClubItem;
import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.cyber_rat.extra_compat.common.item.ForgottenClubItem;
import net.cyber_rat.extra_compat.common.item.FroststeelClubItem;
import net.cyber_rat.extra_compat.common.item.UtheriumClubItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;

public interface ClubExtension {

    default RegistryObject<ClubItem> createClub(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<ClubItem>) factory.createTyped(name, () -> new ClubItem(tier, damage, speed, properties));
    }

    default RegistryObject<ClubItem> createForgottenClub(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<ClubItem>) factory.createTyped(name, () -> new ForgottenClubItem(tier, damage, speed, properties));
    }

    default RegistryObject<ClubItem> createFroststeelClub(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<ClubItem>) factory.createTyped(name, () -> new FroststeelClubItem(tier, damage, speed, properties));
    }
    default RegistryObject<ClubItem> createUtheriumClub(String name, Tier tier, double damage, float speed, Item.Properties properties) {
        ItemFactory factory = InjectionContext.getFromInstance(ItemFactory.class);
        return (RegistryObject<ClubItem>) factory.createTyped(name, () -> new UtheriumClubItem(tier, damage, speed, properties));
    }
}
