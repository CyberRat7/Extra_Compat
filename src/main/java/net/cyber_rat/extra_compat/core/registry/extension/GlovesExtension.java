package net.cyber_rat.extra_compat.core.registry.extension;

import com.aetherteam.aether.Aether;
import com.aetherteam.aether.item.accessories.gloves.GlovesItem;
import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.registry.factory.common.ItemFactory;
import net.cyber_rat.extra_compat.ExtraCompat;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public interface GlovesExtension {

    default RegistryObject<GlovesItem> createGloves(String name, ArmorMaterial material, double punchDamage, String glovesName, Supplier<? extends SoundEvent> glovesSound, Item.Properties properties) {
        ItemFactory itemFactory = InjectionContext.getInstance().getObject(ItemFactory.class);
        return (RegistryObject<GlovesItem>) itemFactory.createTyped(name, () -> new GlovesItem(material, punchDamage, new ResourceLocation(ExtraCompat.MODID, glovesName), glovesSound, properties));

    }
}
