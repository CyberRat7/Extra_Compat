package net.cyber_rat.extra_compat.core.registry.facade;

import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.cyber_rat.extra_compat.core.registry.extension.ExtraAxeExtension;
import net.cyber_rat.extra_compat.core.registry.extension.ExtraSwordExtension;
import net.cyber_rat.extra_compat.core.registry.extension.KnifeExtension;
import net.cyber_rat.extra_compat.core.registry.extension.MacheteExtension;
import net.cyber_rat.extra_compat.core.registry.object.ExtraCompatItems;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.RegistryObject;
import umpaz.nethersdelight.common.item.MacheteItem;
import vectorwing.farmersdelight.common.item.KnifeItem;

public class ExtraCompatItemFactoryFacade extends ItemFactory implements ExtraSwordExtension, ExtraAxeExtension, KnifeExtension, MacheteExtension {
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
