package net.cyber_rat.extra_compat.core.registry.extension;

import com.temporal.api.core.registry.factory.extension.item.SwordExtension;
import net.cyber_rat.extra_compat.common.item.ForgottenGreatSwordItem;
import net.cyber_rat.extra_compat.common.item.FroststeelGreatSwordItem;
import net.cyber_rat.extra_compat.common.item.UtheriumGreatSwordItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;
import nl.sniffiandros.sniffsweapons.item.GreatSwordItem;

public interface SWSwordExtension extends SwordExtension {
    default RegistryObject<? extends SwordItem> createGreatSword(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        return createSword(name, () -> new GreatSwordItem(tier, damage, speed, properties));
    }

    default RegistryObject<? extends SwordItem> createForgottenGreatSword(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        return createSword(name, () -> new ForgottenGreatSwordItem(tier, damage, speed, properties));
    }

    default RegistryObject<? extends SwordItem> createFroststeelGreatSword(String name, Tier tier, int damage, float speed, Item.Properties properties) {
        return createSword(name, () -> new FroststeelGreatSwordItem(tier, damage, speed, properties));
    }

    default RegistryObject<? extends SwordItem> createUtheriumGreatSword(String name, Tier tier, double damage, float speed, Item.Properties properties) {
        return createSword(name, () -> new UtheriumGreatSwordItem(tier, damage, speed, properties));
    }
}
