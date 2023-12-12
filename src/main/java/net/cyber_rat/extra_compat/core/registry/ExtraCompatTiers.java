package net.cyber_rat.extra_compat.core.registry;

import net.cyber_rat.extra_compat.core.registry.object.ExtraCompatItems;
import net.cyber_rat.extra_compat.core.util.ExtraCompatTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ExtraCompatTiers {
    public static final ForgeTier EXTRA_COMPAT_REINFORCED_GOLD = new ForgeTier(2, 750, 6.0F, 0.0F, 17, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ExtraCompatTags.Items.REINFORCED_GOLD_TOOL_REPAIRABLES));
}