package net.cyber_rat.extra_compat.common.item;

import com.seacroak.basicweapons.item.DaggerItem;
import com.seacroak.basicweapons.item.HammerItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class ForgottenHammerItem extends HammerItem {

    public ForgottenHammerItem(Tier tier, int damage, float attackSpeed, Properties properties) {
        super(tier, damage, attackSpeed, properties);
    }
    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.extra_compat.forgotten_weapon").withStyle(ChatFormatting.GREEN));
        super.appendHoverText(stack, level, components, flag);
    }

}
