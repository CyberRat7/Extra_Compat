package net.cyber_rat.extra_compat.core.registry.facade;

import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.cyber_rat.extra_compat.core.registry.extension.ExtraAxeExtension;
import net.cyber_rat.extra_compat.core.registry.extension.ExtraPickaxeExtension;
import net.cyber_rat.extra_compat.core.registry.extension.ExtraSwordExtension;
import net.cyber_rat.extra_compat.core.registry.object.ExtraCompatItems;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraftforge.registries.RegistryObject;

public class SWItemFactoryFacade extends ItemFactory implements ExtraSwordExtension, ExtraAxeExtension, ExtraPickaxeExtension {
    private static volatile SWItemFactoryFacade instance;

    private SWItemFactoryFacade() {
        super(ExtraCompatItems.ITEMS);
    }
    
    public RegistryObject<? extends AxeItem> createGreatAxe(String name, Tier tier, int damage, float speed) {
        return ExtraAxeExtension.super.createGreatAxe(name, this, tier, damage, speed);
    }
    
    public RegistryObject<? extends PickaxeItem> createGreatPickaxe(String name, Tier tier, int damage, float speed) {
        return ExtraPickaxeExtension.super.createGreatPickaxe(name, this, tier, damage, speed);
    }
    
    public RegistryObject<? extends SwordItem> createGreatSword(String name, Tier tier, int damage, float speed) {
        return ExtraSwordExtension.super.createGreatSword(name, this, tier, damage, speed);
    }

    public static SWItemFactoryFacade getInstance() {
        if (instance == null) {
            synchronized (SWItemFactoryFacade.class) {
                if (instance == null) {
                    instance = new SWItemFactoryFacade();
                }
            }
        }
        
        return instance;
    }
}
