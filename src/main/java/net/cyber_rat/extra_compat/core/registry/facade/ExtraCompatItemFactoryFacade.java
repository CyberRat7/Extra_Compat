package net.cyber_rat.extra_compat.core.registry.facade;

import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.cyber_rat.extra_compat.core.registry.extension.*;
import net.cyber_rat.extra_compat.core.registry.object.ExtraCompatItems;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.RegistryObject;
import umpaz.nethersdelight.common.item.MacheteItem;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class ExtraCompatItemFactoryFacade extends ItemFactory implements ExtraSwordExtension, ExtraAxeExtension, ExtraPickaxeExtension, KnifeExtension, MacheteExtension {
    private static volatile ExtraCompatItemFactoryFacade instance;

    private ExtraCompatItemFactoryFacade() {
        super(ExtraCompatItems.ITEMS);
    }

    public RegistryObject<? extends SwordItem> createGreatSword(String name, Object... args) {
        return ExtraSwordExtension.super.createGreatSword(name, this, args);
    }

    public RegistryObject<? extends AxeItem> createGreatAxe(String name, Object... args) {
        return ExtraAxeExtension.super.createGreatAxe(name, this, args);
    }

    public RegistryObject<? extends PickaxeItem> createGreatPickaxe(String name, Object... args) {
        return ExtraPickaxeExtension.super.createGreatPickaxe(name, this, args);
    }

    public RegistryObject<KnifeItem> createKnife(String name, Object... args) {
        return KnifeExtension.super.createKnife(name, this, args);
    }

    public RegistryObject<MacheteItem> createMachete(String name, Object... args) {
        return MacheteExtension.super.createMachete(name, this, args);
    }

    public static ExtraCompatItemFactoryFacade getInstance() {
        if (instance == null) {
            synchronized (ExtraCompatItemFactoryFacade.class) {
                if (instance == null) {
                    instance = new ExtraCompatItemFactoryFacade();
                }
            }
        }

        return instance;
    }
}
