package net.cyber_rat.extra_compat.core.registry.forge.basicweapons;

import com.seacroak.basicweapons.item.*;
import net.cyber_rat.extra_compat.ExtraCompat;
import net.cyber_rat.extra_compat.common.item.*;
import net.cyber_rat.extra_compat.core.registry.factory.BasicWeaponsItemFactory;
import net.cyber_rat.extra_compat.core.registry.forge.sniffsweapons.SWUndergardenExtraItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.protocol.Packet;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.registries.RegistryObject;
import quek.undergarden.Undergarden;
import quek.undergarden.network.CreateCritParticlePacket;
import quek.undergarden.registry.*;



import java.util.function.Supplier;

public class BWUndergardenExtraItems {

    public static final BasicWeaponsItemFactory ITEM_FACTORY = new BasicWeaponsItemFactory();

    public static final RegistryObject<ClubItem> CLOGGRUM_CLUB = ITEM_FACTORY.createClub("cloggrum_club", UGItemTiers.CLOGGRUM, 5, -3.0f, new Item.Properties().stacksTo(1));
    public static final RegistryObject<SpearItem> CLOGGRUM_SPEAR = ITEM_FACTORY.createSpear("cloggrum_spear", UGItemTiers.CLOGGRUM, 2, -2.8f, new Item.Properties().stacksTo(1));
    public static final RegistryObject<HammerItem> CLOGGRUM_HAMMER = ITEM_FACTORY.createHammer("cloggrum_hammer", UGItemTiers.CLOGGRUM, 6, -3.4f, new Item.Properties().stacksTo(1));
    public static final RegistryObject<DaggerItem> CLOGGRUM_DAGGER = ITEM_FACTORY.createDagger("cloggrum_dagger", UGItemTiers.CLOGGRUM, 1, -2.0f, new Item.Properties().stacksTo(1));
    public static final RegistryObject<QuarterstaffItem> CLOGGRUM_QUARTERSTAFF = ITEM_FACTORY.createQuarterstaff("cloggrum_quarterstaff", UGItemTiers.CLOGGRUM, 1, -2.3f, new Item.Properties().stacksTo(1));
    public static final RegistryObject<ClubItem> FORGOTTEN_CLUB = ITEM_FACTORY.createForgottenClub("forgotten_club", UGItemTiers.FORGOTTEN, 5, -3.0f, new Item.Properties().stacksTo(1).rarity(UGItems.FORGOTTEN));
    public static final RegistryObject<SpearItem> FORGOTTEN_SPEAR = ITEM_FACTORY.createForgottenSpear("forgotten_spear", UGItemTiers.FORGOTTEN, 2, -2.8f, new Item.Properties().stacksTo(1).rarity(UGItems.FORGOTTEN));
    public static final RegistryObject<HammerItem> FORGOTTEN_HAMMER = ITEM_FACTORY.createForgottenHammer("forgotten_hammer", UGItemTiers.FORGOTTEN, 6, -3.4f, new Item.Properties().stacksTo(1).rarity(UGItems.FORGOTTEN));
    public static final RegistryObject<DaggerItem> FORGOTTEN_DAGGER = ITEM_FACTORY.createForgottenDagger("forgotten_dagger", UGItemTiers.FORGOTTEN, 1, -2.0f, new Item.Properties().stacksTo(1).rarity(UGItems.FORGOTTEN));
    public static final RegistryObject<QuarterstaffItem> FORGOTTEN_QUARTERSTAFF = ITEM_FACTORY.createForgottenQuarterstaff("forgotten_quarterstaff", UGItemTiers.FORGOTTEN, 1, -2.3f, new Item.Properties().stacksTo(1).rarity(UGItems.FORGOTTEN));

    public static final RegistryObject<ClubItem> FROSTSTEEL_CLUB = ITEM_FACTORY.createFroststeelClub("froststeel_club", UGItemTiers.FROSTSTEEL, 4, -3.0f, new Item.Properties().stacksTo(1));
    public static final RegistryObject<SpearItem> FROSTSTEEL_SPEAR = ITEM_FACTORY.createFroststeelSpear("froststeel_spear", UGItemTiers.FROSTSTEEL, 1, -2.8f, new Item.Properties().stacksTo(1));
    public static final RegistryObject<HammerItem> FROSTSTEEL_HAMMER = ITEM_FACTORY.createFroststeelHammer("froststeel_hammer", UGItemTiers.FROSTSTEEL, 5, -3.4f, new Item.Properties().stacksTo(1));
    public static final RegistryObject<DaggerItem> FROSTSTEEL_DAGGER = ITEM_FACTORY.createFroststeelDagger("froststeel_dagger", UGItemTiers.FROSTSTEEL, 0, -2.0f, new Item.Properties().stacksTo(1));
    public static final RegistryObject<QuarterstaffItem> FROSTSTEEL_QUARTERSTAFF = ITEM_FACTORY.createFroststeelQuarterstaff("froststeel_quarterstaff", UGItemTiers.FROSTSTEEL, 0, -2.3f, new Item.Properties().stacksTo(1));

    public static final RegistryObject<ClubItem> UTHERIUM_CLUB = ITEM_FACTORY.createUtheriumClub("utherium_club", UGItemTiers.UTHERIUM, 5.5, -3.0f, new Item.Properties().stacksTo(1));
    public static final RegistryObject<SpearItem> UTHERIUM_SPEAR = ITEM_FACTORY.createUtheriumSpear("utherium_spear", UGItemTiers.UTHERIUM, 2.5, -2.8f, new Item.Properties().stacksTo(1));
    public static final RegistryObject<HammerItem> UTHERIUM_HAMMER = ITEM_FACTORY.createUtheriumHammer("utherium_hammer", UGItemTiers.UTHERIUM, 6.5, -3.4f, new Item.Properties().stacksTo(1));
    public static final RegistryObject<DaggerItem> UTHERIUM_DAGGER = ITEM_FACTORY.createUtheriumDagger("utherium_dagger", UGItemTiers.UTHERIUM, 1.5, -2.0f, new Item.Properties().stacksTo(1));
    public static final RegistryObject<QuarterstaffItem> UTHERIUM_QUARTERSTAFF = ITEM_FACTORY.createUtheriumQuarterstaff("utherium_quarterstaff", UGItemTiers.UTHERIUM, 1.5, -2.3f, new Item.Properties().stacksTo(1));
  
  
    public static void setupToolEvents() {
        MinecraftForge.EVENT_BUS.addListener(BWUndergardenExtraItems::BWforgottenAttackEvent);
        MinecraftForge.EVENT_BUS.addListener(BWUndergardenExtraItems::BWfroststeelAttackEvent);
        MinecraftForge.EVENT_BUS.addListener(BWUndergardenExtraItems::BWutheriumAttackEvent);
    }
    private static void BWforgottenAttackEvent(LivingHurtEvent event) {
        Entity source = event.getSource().getEntity();
        float damage = event.getAmount();

        if (source instanceof Player player) {
            if (player.getMainHandItem().getItem() == BWUndergardenExtraItems.FORGOTTEN_CLUB.get() || player.getMainHandItem().getItem() == BWUndergardenExtraItems.FORGOTTEN_DAGGER.get() || player.getMainHandItem().getItem() == BWUndergardenExtraItems.FORGOTTEN_HAMMER.get()|| player.getMainHandItem().getItem() == BWUndergardenExtraItems.FORGOTTEN_SPEAR.get()|| player.getMainHandItem().getItem() == BWUndergardenExtraItems.FORGOTTEN_QUARTERSTAFF.get()) {
                if (BuiltInRegistries.ENTITY_TYPE.getKey(event.getEntity().getType()).getNamespace().equals(Undergarden.MODID) && !event.getEntity().getType().is(Tags.EntityTypes.BOSSES)) {
                    event.setAmount(damage * 1.5F);
                }
            }
        }
    }
    private static void BWfroststeelAttackEvent(LivingHurtEvent event) {
        Entity source = event.getSource().getEntity();
        if (source instanceof Player player) {
            if (player.getMainHandItem().is(BWUndergardenExtraItems.FROSTSTEEL_CLUB.get()) || player.getMainHandItem().is(BWUndergardenExtraItems.FROSTSTEEL_QUARTERSTAFF.get())|| player.getMainHandItem().is(BWUndergardenExtraItems.FROSTSTEEL_HAMMER.get())|| player.getMainHandItem().is(BWUndergardenExtraItems.FROSTSTEEL_SPEAR.get())|| player.getMainHandItem().is(BWUndergardenExtraItems.FROSTSTEEL_DAGGER.get())) {
                event.getEntity().addEffect(new MobEffectInstance(UGEffects.CHILLY.get(), 600, 2, false, false));
            }
        }
    }

    private static void BWutheriumAttackEvent(LivingHurtEvent event) {
        Entity source = event.getSource().getEntity();
        float damage = event.getAmount();

        if (source instanceof Player player) {
            // Check if the player is holding one of the specified Utherium weapons
            if (player.getMainHandItem().is(BWUndergardenExtraItems.UTHERIUM_CLUB.get()) ||
                    player.getMainHandItem().is(BWUndergardenExtraItems.UTHERIUM_DAGGER.get()) ||
                    player.getMainHandItem().is(BWUndergardenExtraItems.UTHERIUM_SPEAR.get()) ||
                    player.getMainHandItem().is(BWUndergardenExtraItems.UTHERIUM_QUARTERSTAFF.get()) ||
                    player.getMainHandItem().is(BWUndergardenExtraItems.UTHERIUM_HAMMER.get())) {

                // Check if the target entity is of type ROTSPAWN
                if (event.getEntity().getType().is(UGTags.Entities.ROTSPAWN)) {
                    // Apply the damage multiplier
                    event.setAmount(damage * 1.5F);

                    // Server-side check before spawning particles
                    if (!event.getEntity().level().isClientSide()) {
                        // Spawn particles directly on the server side
                        spawnUtheriumCritParticles((ServerLevel) event.getEntity().level(), event.getEntity());
                    }
                }
            }
        }
    }

    // Custom method to handle particle spawning
    private static void spawnUtheriumCritParticles(ServerLevel level, Entity entity) {
        // Create and spawn the particles at the entity's location
        level.sendParticles(UGParticleTypes.UTHERIUM_CRIT.get(),
                entity.getX(),
                entity.getY() + entity.getBbHeight() / 2.0,
                entity.getZ(),
                10,  // Number of particles
                0.5, 0.5, 0.5, // Spread of the particles
                0.1); // Speed of the particles
    }


    public static void register() {
        ExtraCompat.LOGGER.info("BasicWeapons/Undergarden compatibility has been initialized!");
    }
}
