package net.cyber_rat.extra_compat.core.registry.forge.sniffsweapons;

import net.cyber_rat.extra_compat.ExtraCompat;
import net.cyber_rat.extra_compat.core.registry.factory.SWItemFactory;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.registries.RegistryObject;
import quek.undergarden.Undergarden;
import quek.undergarden.registry.*;


public class SWUndergardenExtraItems {
    public static final SWItemFactory ITEM_FACTORY = new SWItemFactory();

    public static final RegistryObject<? extends SwordItem> CLOGGRUM_GREATSWORD = ITEM_FACTORY.createGreatSword("cloggrum_great_sword", UGItemTiers.CLOGGRUM, 8, -2.9f, new Item.Properties());
    public static final RegistryObject<? extends AxeItem> CLOGGRUM_GREAT_AXE = ITEM_FACTORY.createGreatAxe("cloggrum_great_axe", UGItemTiers.CLOGGRUM, 10, -3.2f, new Item.Properties());
    public static final RegistryObject<? extends SwordItem> FORGOTTEN_GREATSWORD = ITEM_FACTORY.createForgottenGreatSword("forgotten_great_sword", UGItemTiers.CLOGGRUM, 8, -2.9f, new Item.Properties().rarity(UGItems.FORGOTTEN));
    public static final RegistryObject<? extends AxeItem> FORGOTTEN_GREAT_AXE = ITEM_FACTORY.createForgottenGreatAxe("forgotten_great_axe", UGItemTiers.CLOGGRUM, 10, -3.2f, new Item.Properties().rarity(UGItems.FORGOTTEN));
    public static final RegistryObject<? extends SwordItem> FROSTSTEEL_GREATSWORD = ITEM_FACTORY.createFroststeelGreatSword("froststeel_great_sword", UGItemTiers.FROSTSTEEL, 8, -2.9f, new Item.Properties());
    public static final RegistryObject<? extends AxeItem> FROSTSTEEL_GREAT_AXE = ITEM_FACTORY.createFroststeelGreatAxe("froststeel_great_axe", UGItemTiers.FROSTSTEEL, 8, -2.9f, new Item.Properties());
    public static final RegistryObject<? extends SwordItem> UTHERIUM_GREATSWORD = ITEM_FACTORY.createUtheriumGreatSword("utherium_great_sword", UGItemTiers.UTHERIUM, 8.5, -2.9f, new Item.Properties());
    public static final RegistryObject<? extends AxeItem> UTHERIUM_GREAT_AXE = ITEM_FACTORY.createUtheriumGreatAxe("utherium_great_axe", UGItemTiers.UTHERIUM, 8.5, -2.9f, new Item.Properties());

    public static void setupToolEvents() {
        MinecraftForge.EVENT_BUS.addListener(SWUndergardenExtraItems::SWforgottenAttackEvent);
        MinecraftForge.EVENT_BUS.addListener(SWUndergardenExtraItems::SWforgottenDigEvent);
        MinecraftForge.EVENT_BUS.addListener(SWUndergardenExtraItems::SWfroststeelAttackEvent);
        MinecraftForge.EVENT_BUS.addListener(SWUndergardenExtraItems::SWutheriumAttackEvent);
    }
    private static void SWforgottenAttackEvent(LivingHurtEvent event) {
        Entity source = event.getSource().getEntity();
        float damage = event.getAmount();

        if (source instanceof Player player) {
            if (player.getMainHandItem().getItem() == SWUndergardenExtraItems.FORGOTTEN_GREATSWORD.get()) {
                if (BuiltInRegistries.ENTITY_TYPE.getKey(event.getEntity().getType()).getNamespace().equals(Undergarden.MODID) && !event.getEntity().getType().is(Tags.EntityTypes.BOSSES)) {
                    event.setAmount(damage * 1.5F);
                }
            }
        }
    }
    private static void SWforgottenDigEvent(PlayerEvent.BreakSpeed event) {
        Player player = event.getEntity();
        BlockState state = event.getState();

        if (player.getMainHandItem().getItem() == SWUndergardenExtraItems.FORGOTTEN_GREAT_AXE.get()) {
            if (state != null && BuiltInRegistries.BLOCK.getKey(state.getBlock()).getNamespace().equals(Undergarden.MODID)) {
                event.setNewSpeed(event.getOriginalSpeed() * 1.5F);
            }
        }
    }

    private static void SWfroststeelAttackEvent(LivingHurtEvent event) {
        Entity source = event.getSource().getEntity();
        if (source instanceof Player player) {
            if (player.getMainHandItem().is(SWUndergardenExtraItems.FROSTSTEEL_GREATSWORD.get())) {
                event.getEntity().addEffect(new MobEffectInstance(UGEffects.CHILLY.get(), 600, 2, false, false));
            }
            if (player.getMainHandItem().is(SWUndergardenExtraItems.FROSTSTEEL_GREAT_AXE.get())) {
                event.getEntity().addEffect(new MobEffectInstance(UGEffects.CHILLY.get(), 600, 1, false, false));
            }
        }
    }

    private static void SWutheriumAttackEvent(LivingHurtEvent event) {
        Entity source = event.getSource().getEntity();
        float damage = event.getAmount();

        if (source instanceof Player player) {
            if (player.getMainHandItem().is(SWUndergardenExtraItems.UTHERIUM_GREATSWORD.get()) ||
                    player.getMainHandItem().is(SWUndergardenExtraItems.UTHERIUM_GREAT_AXE.get())){

                if (event.getEntity().getType().is(UGTags.Entities.ROTSPAWN)) {
                    event.setAmount(damage * 1.5F);
                    if (!event.getEntity().level().isClientSide()) {
                        spawnUtheriumCritParticles((ServerLevel) event.getEntity().level(), event.getEntity());
                    }
                }
            }
        }
    }

    private static void spawnUtheriumCritParticles(ServerLevel level, Entity entity) {
        level.sendParticles(UGParticleTypes.UTHERIUM_CRIT.get(),
                entity.getX(),
                entity.getY() + entity.getBbHeight() / 2.0,
                entity.getZ(),
                10,
                0.5, 0.5, 0.5,
                0.1);
    }
    public static void register() {
        ExtraCompat.LOGGER.info("Sniff's Weapons/Undergarden compat has been initialized!");
    }
}
