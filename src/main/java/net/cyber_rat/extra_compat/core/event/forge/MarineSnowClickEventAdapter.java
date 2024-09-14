package net.cyber_rat.extra_compat.core.event.forge;

import com.github.alexmodguy.alexscaves.server.block.ACBlockRegistry;
import com.github.alexmodguy.alexscaves.server.block.MusselBlock;
import com.github.alexmodguy.alexscaves.server.item.MarineSnowItem;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.FluidTags;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import java.util.HashMap;
import java.util.Map;

public class MarineSnowClickEventAdapter implements EventAdapter<PlayerInteractEvent.RightClickBlock> {
    public static final Map<Block, Block> GROWTH_INTERACTIONS = new HashMap<>();
    public static final Map<Block, ItemStack> DUPLICATES_INTERACTIONS = new HashMap<>();

    @Override
    public void adapt(PlayerInteractEvent.RightClickBlock event) {
        ItemStack handItemStack = event.getItemStack();
        Item itemInHand = handItemStack.getItem();
        if (itemInHand instanceof MarineSnowItem) {
            Level level = event.getLevel();
            BlockPos clickedBlockPos = event.getHitVec().getBlockPos();
            if (scanForWater(clickedBlockPos, level)) {
                boolean flag = false;
                BlockState clickedBlockState = level.getBlockState(clickedBlockPos);
                Block clickedBlock = clickedBlockState.getBlock();
                if (GROWTH_INTERACTIONS.containsKey(clickedBlock)) {
                    flag = true;
                    BlockState transform = GROWTH_INTERACTIONS.getOrDefault(clickedBlock, Blocks.AIR).defaultBlockState();
                    for (Property property : clickedBlockState.getProperties()) {
                        transform = transform.hasProperty(property) ? transform.setValue(property, clickedBlockState.getValue(property)) : transform;
                    }
                    level.setBlockAndUpdate(clickedBlockPos, transform);
                } else if(DUPLICATES_INTERACTIONS.containsKey(clickedBlock)) {
                    flag = true;
                    if (level.getRandom().nextInt(2) == 0) {
                        ItemStack spawn = DUPLICATES_INTERACTIONS.getOrDefault(clickedBlock, ItemStack.EMPTY);
                        Vec3 spawnItemAt = event.getHitVec().getLocation();
                        ItemEntity itemEntity = new ItemEntity(level, spawnItemAt.x, spawnItemAt.y, spawnItemAt.z, spawn);
                        level.addFreshEntity(itemEntity);
                    }
                } else if(clickedBlockState.is(ACBlockRegistry.MUSSEL.get()) && clickedBlockState.getValue(MusselBlock.MUSSELS) < 5) {
                    flag = true;
                    level.setBlockAndUpdate(clickedBlockPos, clickedBlockState.setValue(MusselBlock.MUSSELS, clickedBlockState.getValue(MusselBlock.MUSSELS) + 1));
                }

                if (flag) {
                    Player player = event.getEntity();
                    player.swing(event.getHand());
                    if (!level.isClientSide) {
                        level.levelEvent(1505, clickedBlockPos, 0);
                    }
                    if(!player.isCreative()){
                        handItemStack.shrink(1);
                    }

                    event.setResult(event.getUseItem());
                }
            }
        }
    }

    private static boolean scanForWater(BlockPos blockPos, BlockGetter blockGetter) {
        if (blockGetter.getBlockState(blockPos).getFluidState().is(FluidTags.WATER)) {
            return true;
        } else {
            for(Direction direction : Direction.values()) {
                if (blockGetter.getFluidState(blockPos.relative(direction)).is(FluidTags.WATER)) {
                    return true;
                }
            }
            return false;
        }
    }
}