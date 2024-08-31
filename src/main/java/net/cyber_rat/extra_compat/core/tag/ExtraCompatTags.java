package net.cyber_rat.extra_compat.core.tag;

import com.temporal.api.core.engine.io.context.InjectionContext;
import com.temporal.api.core.tag.factory.ItemTagFactory;
import com.temporal.api.core.tag.factory.TagFactory;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ExtraCompatTags {
    public static class Items {
        private static final TagFactory<Item> ITEM_TAG_FACTORY = InjectionContext.getFromInstance(ItemTagFactory.class);
        public static final TagKey<Item>  FLOWERED_PAPER_LANTERNS = ITEM_TAG_FACTORY.createTag("flowered_paper_lanterns");
        public static final TagKey<Item>  WALLPAPER_ADHESIVES = ITEM_TAG_FACTORY.createTag("wallpaper_adhesives");
    }
}