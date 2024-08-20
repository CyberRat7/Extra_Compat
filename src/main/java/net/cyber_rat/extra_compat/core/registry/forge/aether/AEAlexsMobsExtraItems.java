package net.cyber_rat.extra_compat.core.registry.forge.aether;


import com.aetherteam.aether.item.miscellaneous.bucket.SkyrootBucketItem;
import com.aetherteam.aether.item.miscellaneous.bucket.SkyrootMobBucketItem;
import com.github.alexthe666.alexsmobs.item.AMItemRegistry;
import net.cyber_rat.extra_compat.ExtraCompat;
import net.cyber_rat.extra_compat.core.registry.factory.AEItemFactory;
import net.minecraftforge.registries.RegistryObject;


public class AEAlexsMobsExtraItems {
    public static final AEItemFactory ITEM_FACTORY = new AEItemFactory();

    public static final RegistryObject<SkyrootMobBucketItem> SKYROOT_SMALL_CATFISH_BUCKET = ITEM_FACTORY.createSkyrootCatfishBucket("skyroot_small_catfish_bucket");
    public static final RegistryObject<SkyrootMobBucketItem> SKYROOT_MEDIUM_CATFISH_BUCKET = ITEM_FACTORY.createSkyrootCatfishBucket("skyroot_medium_catfish_bucket");
    public static final RegistryObject<SkyrootMobBucketItem> SKYROOT_LARGE_CATFISH_BUCKET = ITEM_FACTORY.createSkyrootCatfishBucket("skyroot_large_catfish_bucket");
    public static final RegistryObject<SkyrootMobBucketItem> SKYROOT_DEVILS_HOLE_PUPFISH_BUCKET = ITEM_FACTORY.createSkyrootPupfishBucket("skyroot_devils_hole_pupfish_bucket");
    public static final RegistryObject<SkyrootMobBucketItem> SKYROOT_BLOBFISH_BUCKET = ITEM_FACTORY.createSkyrootBlobfishBucket("skyroot_blobfish_bucket");
    public static final RegistryObject<SkyrootMobBucketItem> SKYROOT_COMB_JELLEY_BUCKET = ITEM_FACTORY.createSkyrootCombJelleyBucket("skyroot_comb_jelley_bucket");
    public static final RegistryObject<SkyrootMobBucketItem> SKYROOT_FLYING_FISH_BUCKET = ITEM_FACTORY.createSkyrootFlyingFishBucket("skyroot_flying_fish_bucket");
    public static final RegistryObject<SkyrootMobBucketItem> SKYROOT_MUDSKIPPER_BUCKET = ITEM_FACTORY.createSkyrootMudskipperBucket("skyroot_mudskipper_bucket");
    public static final RegistryObject<SkyrootMobBucketItem> SKYROOT_MIMIC_OCTOPUS_BUCKET = ITEM_FACTORY.createSkyrootMimicOctopusBucket("skyroot_mimic_octopus_bucket");
    public static final RegistryObject<SkyrootMobBucketItem> SKYROOT_LOBSTER_BUCKET = ITEM_FACTORY.createSkyrootLobsterBucket("skyroot_lobster_bucket");
    public static final RegistryObject<SkyrootMobBucketItem> SKYROOT_FRILLED_SHARK_BUCKET = ITEM_FACTORY.createSkyrootFrilledSharkBucket("skyroot_frilled_shark_bucket");
    public static final RegistryObject<SkyrootMobBucketItem> SKYROOT_PLATYPUS_BUCKET = ITEM_FACTORY.createSkyrootPlatypusBucket("skyroot_platypus_bucket");
    public static final RegistryObject<SkyrootMobBucketItem> SKYROOT_TRIOPS_BUCKET = ITEM_FACTORY.createSkyrootTriopsBucket("skyroot_triops_bucket");
    public static final RegistryObject<SkyrootMobBucketItem> SKYROOT_TERRAPIN_BUCKET = ITEM_FACTORY.createSkyrootTerrapinBucket("skyroot_terrapin_bucket");

    public static void setupBucketReplacements() {
        SkyrootBucketItem.REPLACEMENTS.put(AMItemRegistry.SMALL_CATFISH_BUCKET, AEAlexsMobsExtraItems.SKYROOT_SMALL_CATFISH_BUCKET);
        SkyrootBucketItem.REPLACEMENTS.put(AMItemRegistry.MEDIUM_CATFISH_BUCKET, AEAlexsMobsExtraItems.SKYROOT_MEDIUM_CATFISH_BUCKET);
        SkyrootBucketItem.REPLACEMENTS.put(AMItemRegistry.LARGE_CATFISH_BUCKET, AEAlexsMobsExtraItems.SKYROOT_LARGE_CATFISH_BUCKET);
        SkyrootBucketItem.REPLACEMENTS.put(AMItemRegistry.BLOBFISH_BUCKET, AEAlexsMobsExtraItems.SKYROOT_BLOBFISH_BUCKET);
        SkyrootBucketItem.REPLACEMENTS.put(AMItemRegistry.COMB_JELLY_BUCKET, AEAlexsMobsExtraItems.SKYROOT_COMB_JELLEY_BUCKET);
        SkyrootBucketItem.REPLACEMENTS.put(AMItemRegistry.DEVILS_HOLE_PUPFISH_BUCKET, AEAlexsMobsExtraItems.SKYROOT_DEVILS_HOLE_PUPFISH_BUCKET);
        SkyrootBucketItem.REPLACEMENTS.put(AMItemRegistry.FLYING_FISH_BUCKET, AEAlexsMobsExtraItems.SKYROOT_FLYING_FISH_BUCKET);
        SkyrootBucketItem.REPLACEMENTS.put(AMItemRegistry.FRILLED_SHARK_BUCKET, AEAlexsMobsExtraItems.SKYROOT_FRILLED_SHARK_BUCKET);
        SkyrootBucketItem.REPLACEMENTS.put(AMItemRegistry.MIMIC_OCTOPUS_BUCKET, AEAlexsMobsExtraItems.SKYROOT_MIMIC_OCTOPUS_BUCKET);
        SkyrootBucketItem.REPLACEMENTS.put(AMItemRegistry.MUDSKIPPER_BUCKET, AEAlexsMobsExtraItems.SKYROOT_MUDSKIPPER_BUCKET);
        SkyrootBucketItem.REPLACEMENTS.put(AMItemRegistry.LOBSTER_BUCKET, AEAlexsMobsExtraItems.SKYROOT_LOBSTER_BUCKET);
        SkyrootBucketItem.REPLACEMENTS.put(AMItemRegistry.PLATYPUS_BUCKET, AEAlexsMobsExtraItems.SKYROOT_PLATYPUS_BUCKET);
        SkyrootBucketItem.REPLACEMENTS.put(AMItemRegistry.TRIOPS_BUCKET, AEAlexsMobsExtraItems.SKYROOT_TRIOPS_BUCKET);
        SkyrootBucketItem.REPLACEMENTS.put(AMItemRegistry.TERRAPIN_BUCKET, AEAlexsMobsExtraItems.SKYROOT_TERRAPIN_BUCKET);
    }

    public static void register() {
        ExtraCompat.LOGGER.info("Aether/Alexs Mobs compatibility has been initialized!");
    }
}
