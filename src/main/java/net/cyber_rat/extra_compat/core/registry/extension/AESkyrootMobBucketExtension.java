package net.cyber_rat.extra_compat.core.registry.extension;

import com.aetherteam.aether.item.AetherItems;
import com.aetherteam.aether.item.miscellaneous.bucket.SkyrootMobBucketItem;
import com.github.alexthe666.alexsmobs.entity.AMEntityRegistry;
import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.registry.factory.common.ItemFactory;
import com.uraneptus.sullysmod.core.registry.SMEntityTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

@SuppressWarnings("unchecked")
public interface AESkyrootMobBucketExtension {
    default RegistryObject<SkyrootMobBucketItem> createSkyrootLanternfishBucket(String name) {
        ItemFactory factory = InjectionContext.getInstance().getObject(ItemFactory.class);
        return (RegistryObject<SkyrootMobBucketItem>) factory.createTyped(name, () -> new SkyrootMobBucketItem(SMEntityTypes.LANTERNFISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().craftRemainder(AetherItems.SKYROOT_BUCKET.get()).stacksTo(1)));
    }
    
    default RegistryObject<SkyrootMobBucketItem> createSkyrootCatfishBucket(String name) {
        ItemFactory factory = InjectionContext.getInstance().getObject(ItemFactory.class);
        return (RegistryObject<SkyrootMobBucketItem>) factory.createTyped(name, () -> new SkyrootMobBucketItem(AMEntityRegistry.CATFISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().craftRemainder(AetherItems.SKYROOT_BUCKET.get()).stacksTo(1)));
    }
    
    default RegistryObject<SkyrootMobBucketItem> createSkyrootBlobfishBucket(String name) {
        ItemFactory factory = InjectionContext.getInstance().getObject(ItemFactory.class);
            return (RegistryObject<SkyrootMobBucketItem>) factory.createTyped(name, () -> new SkyrootMobBucketItem(AMEntityRegistry.BLOBFISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().craftRemainder(AetherItems.SKYROOT_BUCKET.get()).stacksTo(1)));
    }
    
    default RegistryObject<SkyrootMobBucketItem> createSkyrootCombJelleyBucket(String name) {
        ItemFactory factory = InjectionContext.getInstance().getObject(ItemFactory.class);
        return (RegistryObject<SkyrootMobBucketItem>) factory.createTyped(name, () -> new SkyrootMobBucketItem(AMEntityRegistry.COMB_JELLY, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().craftRemainder(AetherItems.SKYROOT_BUCKET.get()).stacksTo(1)));
    }
    
    default RegistryObject<SkyrootMobBucketItem> createSkyrootPupfishBucket(String name) {
        ItemFactory factory = InjectionContext.getInstance().getObject(ItemFactory.class);
        return (RegistryObject<SkyrootMobBucketItem>) factory.createTyped(name, () -> new SkyrootMobBucketItem(AMEntityRegistry.DEVILS_HOLE_PUPFISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().craftRemainder(AetherItems.SKYROOT_BUCKET.get()).stacksTo(1)));
    }
    
    default RegistryObject<SkyrootMobBucketItem> createSkyrootFrilledSharkBucket(String name) {
        ItemFactory factory = InjectionContext.getInstance().getObject(ItemFactory.class);
        return (RegistryObject<SkyrootMobBucketItem>) factory.createTyped(name, () -> new SkyrootMobBucketItem(AMEntityRegistry.FRILLED_SHARK, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().craftRemainder(AetherItems.SKYROOT_BUCKET.get()).stacksTo(1)));
    }
    
    default RegistryObject<SkyrootMobBucketItem> createSkyrootFlyingFishBucket(String name) {
        ItemFactory factory = InjectionContext.getInstance().getObject(ItemFactory.class);
        return (RegistryObject<SkyrootMobBucketItem>) factory.createTyped(name, () -> new SkyrootMobBucketItem(AMEntityRegistry.FLYING_FISH, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().craftRemainder(AetherItems.SKYROOT_BUCKET.get()).stacksTo(1)));
    }
    
    default RegistryObject<SkyrootMobBucketItem> createSkyrootLobsterBucket(String name) {
        ItemFactory factory = InjectionContext.getInstance().getObject(ItemFactory.class);
        return (RegistryObject<SkyrootMobBucketItem>) factory.createTyped(name, () -> new SkyrootMobBucketItem(AMEntityRegistry.LOBSTER, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().craftRemainder(AetherItems.SKYROOT_BUCKET.get()).stacksTo(1)));
    }
    
    default RegistryObject<SkyrootMobBucketItem> createSkyrootMudskipperBucket(String name) {
        ItemFactory factory = InjectionContext.getInstance().getObject(ItemFactory.class);
        return (RegistryObject<SkyrootMobBucketItem>) factory.createTyped(name, () -> new SkyrootMobBucketItem(AMEntityRegistry.MUDSKIPPER, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().craftRemainder(AetherItems.SKYROOT_BUCKET.get()).stacksTo(1)));
    }
    
    default RegistryObject<SkyrootMobBucketItem> createSkyrootMimicOctopusBucket(String name) {
        ItemFactory factory = InjectionContext.getInstance().getObject(ItemFactory.class);
        return (RegistryObject<SkyrootMobBucketItem>) factory.createTyped(name, () -> new SkyrootMobBucketItem(AMEntityRegistry.MIMIC_OCTOPUS, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().craftRemainder(AetherItems.SKYROOT_BUCKET.get()).stacksTo(1)));
    }
    
    default RegistryObject<SkyrootMobBucketItem> createSkyrootTriopsBucket(String name) {
        ItemFactory factory = InjectionContext.getInstance().getObject(ItemFactory.class);
        return (RegistryObject<SkyrootMobBucketItem>) factory.createTyped(name, () -> new SkyrootMobBucketItem(AMEntityRegistry.TRIOPS, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().craftRemainder(AetherItems.SKYROOT_BUCKET.get()).stacksTo(1)));
    }
    
    default RegistryObject<SkyrootMobBucketItem> createSkyrootTerrapinBucket(String name) {
        ItemFactory factory = InjectionContext.getInstance().getObject(ItemFactory.class);
        return (RegistryObject<SkyrootMobBucketItem>) factory.createTyped(name, () -> new SkyrootMobBucketItem(AMEntityRegistry.TERRAPIN, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().craftRemainder(AetherItems.SKYROOT_BUCKET.get()).stacksTo(1)));
    }
    
    default RegistryObject<SkyrootMobBucketItem> createSkyrootPlatypusBucket(String name) {
        ItemFactory factory = InjectionContext.getInstance().getObject(ItemFactory.class);
        return (RegistryObject<SkyrootMobBucketItem>) factory.createTyped(name, () -> new SkyrootMobBucketItem(AMEntityRegistry.PLATYPUS, () -> Fluids.WATER, () -> SoundEvents.BUCKET_EMPTY_FISH, new Item.Properties().craftRemainder(AetherItems.SKYROOT_BUCKET.get()).stacksTo(1)));
    }

    default RegistryObject<? extends SkyrootMobBucketItem> createSkyrootMobBucket(String name, Supplier<? extends SkyrootMobBucketItem> tTypedSupplier) {
        ItemFactory factory = InjectionContext.getInstance().getObject(ItemFactory.class);
        return (RegistryObject<SkyrootMobBucketItem>) factory.createTyped(name, tTypedSupplier);
    }
}
