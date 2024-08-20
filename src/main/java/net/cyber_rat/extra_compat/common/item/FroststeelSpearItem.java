package net.cyber_rat.extra_compat.common.item;

import com.seacroak.basicweapons.item.SpearItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class FroststeelSpearItem extends SpearItem {
    public FroststeelSpearItem(Tier tier, int damage, float attackSpeed, Properties properties) {
        super(tier, damage, attackSpeed, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.extra_compat.froststeel_weapon").withStyle(ChatFormatting.AQUA));
        super.appendHoverText(stack, level, components, flag);
    }
}
