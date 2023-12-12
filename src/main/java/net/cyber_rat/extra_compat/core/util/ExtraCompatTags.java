package net.cyber_rat.extra_compat.core.util;

import net.cyber_rat.extra_compat.ExtraCompat;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ExtraCompatTags {
    public static class Items {
        public static final TagKey<Item> REINFORCED_GOLD_TOOL_REPAIRABLES = tag("reinforced_gold_tool_repairables");
        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(ExtraCompat.MODID, name));
        }
    }
}


