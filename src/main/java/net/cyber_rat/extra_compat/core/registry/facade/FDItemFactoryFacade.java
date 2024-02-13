package net.cyber_rat.extra_compat.core.registry.facade;

import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.cyber_rat.extra_compat.core.registry.extension.KnifeExtension;
import net.cyber_rat.extra_compat.core.registry.object.ExtraCompatItems;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class FDItemFactoryFacade extends ItemFactory implements KnifeExtension {
    private static volatile FDItemFactoryFacade instance;

    private FDItemFactoryFacade() {
        super(ExtraCompatItems.ITEMS);
    }

    public RegistryObject<KnifeItem> createKnife(String name, Tier tier, int damage, float speed) {
        return KnifeExtension.super.createKnife(name, this, tier, damage, speed);
    }

    public static FDItemFactoryFacade getInstance() {
        if (instance == null) {
            synchronized (FDItemFactoryFacade.class) {
                if (instance == null) {
                    instance = new FDItemFactoryFacade();
                }
            }
        }

        return instance;
    }
}
