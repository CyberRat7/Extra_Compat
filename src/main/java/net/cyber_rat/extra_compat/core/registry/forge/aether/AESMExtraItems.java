package net.cyber_rat.extra_compat.core.registry.forge.aether;


import com.aetherteam.aether.item.miscellaneous.bucket.SkyrootBucketItem;
import com.aetherteam.aether.item.miscellaneous.bucket.SkyrootMobBucketItem;
import com.uraneptus.sullysmod.core.registry.SMItems;
import net.cyber_rat.extra_compat.ExtraCompat;
import net.cyber_rat.extra_compat.core.registry.factory.AEItemFactory;
import net.minecraftforge.registries.RegistryObject;


public class AESMExtraItems {
    public static final AEItemFactory ITEM_FACTORY = new AEItemFactory();

    public static final RegistryObject<SkyrootMobBucketItem> SKYROOT_LANTERNFISH_BUCKET = ITEM_FACTORY.createSkyrootLanternfishBucket("skyroot_lanternfish_bucket");

    public static void setupBucketReplacements() {
        SkyrootBucketItem.REPLACEMENTS.put(SMItems.LANTERNFISH_BUCKET, AESMExtraItems.SKYROOT_LANTERNFISH_BUCKET);
    }

    public static void register() {
        ExtraCompat.LOGGER.info("Aether compatibility has been initialized!");
    }
}
