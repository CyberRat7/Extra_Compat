package net.cyber_rat.extra_compat.core.registry.forge.aether;

import com.aetherteam.aether.client.renderer.accessory.GlovesRenderer;
import com.aetherteam.aether.item.accessories.gloves.GlovesItem;
import net.cyber_rat.extra_compat.ExtraCompat;
import net.cyber_rat.extra_compat.core.registry.factory.AEItemFactory;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;
import quek.undergarden.registry.UGArmorMaterials;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

public class AEUndergardenExtraItems {
    public static final AEItemFactory ITEM_FACTORY = new AEItemFactory();

    public static final RegistryObject<GlovesItem> UTHERIUM_GLOVES = ITEM_FACTORY.createGloves("utherium_gloves", UGArmorMaterials.CLOGGRUM, 0.75, "utherium_gloves", () -> SoundEvents.ARMOR_EQUIP_IRON, new Item.Properties().stacksTo(1).durability(1279));
    public static final RegistryObject<GlovesItem> CLOGGRUM_GLOVES = ITEM_FACTORY.createGloves("cloggrum_gloves", UGArmorMaterials.CLOGGRUM, 0.75, "cloggrum_gloves", () -> SoundEvents.ARMOR_EQUIP_IRON, new Item.Properties().stacksTo(1).durability(286));
    public static final RegistryObject<GlovesItem> FROSTSTEEL_GLOVES = ITEM_FACTORY.createGloves("froststeel_gloves", UGArmorMaterials.FROSTSTEEL, 0.75, "froststeel_gloves", () -> SoundEvents.ARMOR_EQUIP_IRON, new Item.Properties().stacksTo(1).durability(575));



  public static void registerCuriosRenderers() {
       CuriosRendererRegistry.register(AEUndergardenExtraItems.FROSTSTEEL_GLOVES.get(), GlovesRenderer::new);
        CuriosRendererRegistry.register(AEUndergardenExtraItems.CLOGGRUM_GLOVES.get(), GlovesRenderer::new);
       CuriosRendererRegistry.register(AEUndergardenExtraItems.UTHERIUM_GLOVES.get(), GlovesRenderer::new);
    }

    public static void register() {
        ExtraCompat.LOGGER.info("Aether/Undergarden compatibility has been initialized!");
    }
}
