package net.cyber_rat.extra_compat.core.tag;

import com.temporal.api.core.util.tag.factory.ItemTagFactory;
import com.temporal.api.core.util.tag.factory.TagFactory;
import net.cyber_rat.extra_compat.ExtraCompat;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ExtraCompatTags {
    public static class Items {
        private static final TagFactory<Item> ITEM_TAG_FACTORY = new ItemTagFactory(ExtraCompat.MOD_ID);

        public static final TagKey<Item> REINFORCED_GOLD_TOOL_REPAIRABLES = ITEM_TAG_FACTORY.createTag("reinforced_gold_tool_repairables");
    }
}