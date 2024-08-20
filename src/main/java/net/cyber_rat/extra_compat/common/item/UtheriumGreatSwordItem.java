package net.cyber_rat.extra_compat.common.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import nl.sniffiandros.sniffsweapons.item.GreatSwordItem;

import javax.annotation.Nullable;
import java.util.List;

public class UtheriumGreatSwordItem extends GreatSwordItem {

    public UtheriumGreatSwordItem(Tier tier, double damage, float attackSpeed, Properties properties) {
        super(tier, (int) damage, attackSpeed, properties);
    }
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.extra_compat.utherium_weapon").withStyle(ChatFormatting.RED));
        super.appendHoverText(stack, level, components, flag);
    }

}
