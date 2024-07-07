package net.cyber_rat.extra_compat.core.registry.factory;

import com.temporal.api.core.registry.factory.common.ItemFactory;
import com.temporal.api.core.registry.factory.extension.item.FoodExtension;
import net.cyber_rat.extra_compat.core.registry.extension.FDKnifeExtension;

public class FDItemFactory extends ItemFactory implements FDKnifeExtension, FoodExtension {
}
