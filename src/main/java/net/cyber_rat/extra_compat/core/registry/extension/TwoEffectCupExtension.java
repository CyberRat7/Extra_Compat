package net.cyber_rat.extra_compat.core.registry.extension;

import com.sammy.minersdelight.content.item.CopperCupFoodItem;
import com.sammy.minersdelight.setup.MDItems;
import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public interface TwoEffectCupExtension {

    default RegistryObject<CopperCupFoodItem> createTwoEffectCup(String name, int nutrition, float saturation, Supplier<MobEffect> effect,  int duration, int amplifier, float probability, Supplier<MobEffect> secondeffect, int secondduration, int secondamplifier, float secondprobability) {
        ItemFactory itemFactory = InjectionContext.getInstance().getObject(ItemFactory.class);
        return (RegistryObject<CopperCupFoodItem>) itemFactory.createTyped(name, () -> new CopperCupFoodItem(new Item.Properties().craftRemainder(MDItems.COPPER_CUP.get()).stacksTo(16).food(new FoodProperties.Builder().nutrition(nutrition).saturationMod(saturation).effect(() -> new MobEffectInstance(effect.get(), duration, amplifier), probability).effect(() -> new MobEffectInstance(secondeffect.get(), secondduration, secondamplifier), secondprobability).build())));
    }

    default RegistryObject<? extends CopperCupFoodItem> createTwoEffectCup(String name, Supplier<? extends CopperCupFoodItem> tTypedSupplier) {
        ItemFactory itemFactory = InjectionContext.getInstance().getObject(ItemFactory.class);
        return (RegistryObject<? extends CopperCupFoodItem>) itemFactory.createTyped(name, tTypedSupplier);
    }
}


