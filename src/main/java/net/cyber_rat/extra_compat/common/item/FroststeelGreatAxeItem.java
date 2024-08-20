package net.cyber_rat.extra_compat.common.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import nl.sniffiandros.sniffsweapons.item.GreatAxeItem;

import javax.annotation.Nullable;
import java.util.List;

public class FroststeelGreatAxeItem extends GreatAxeItem {


    public FroststeelGreatAxeItem(Tier tier, float damage, float speed, Properties properties) {
        super(tier, damage, speed, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.extra_compat.froststeel_weapon").withStyle(ChatFormatting.AQUA));
        super.appendHoverText(stack, level, components, flag);
    }

}



