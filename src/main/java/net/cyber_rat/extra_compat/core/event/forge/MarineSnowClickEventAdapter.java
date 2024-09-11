package net.cyber_rat.extra_compat.core.event.forge;

import com.github.alexmodguy.alexscaves.server.block.ACBlockRegistry;
import com.github.alexmodguy.alexscaves.server.block.MusselBlock;
import com.github.alexmodguy.alexscaves.server.item.MarineSnowItem;
import com.google.common.collect.Maps;
import com.teamabnormals.upgrade_aquatic.core.registry.UABlocks;
import net.minecraft.Util;
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

import java.util.Map;

public class MarineSnowClickEventAdapter implements EventAdapter<PlayerInteractEvent.RightClickBlock> {
    private Map<Block, Block> growsInteractions;
    private Map<Block, ItemStack> duplicatesInteractions;

    public MarineSnowClickEventAdapter() {
        initGrowth();
    }

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
                if (growsInteractions.containsKey(clickedBlock)) {
                    flag = true;
                    BlockState transform = growsInteractions.getOrDefault(clickedBlock, Blocks.AIR).defaultBlockState();
                    for (Property property : clickedBlockState.getProperties()) {
                        transform = transform.hasProperty(property) ? transform.setValue(property, clickedBlockState.getValue(property)) : transform;
                    }
                    level.setBlockAndUpdate(clickedBlockPos, transform);
                } else if(duplicatesInteractions.containsKey(clickedBlock)) {
                    flag = true;
                    if (level.getRandom().nextInt(2) == 0) {
                        ItemStack spawn = duplicatesInteractions.getOrDefault(clickedBlock, ItemStack.EMPTY);
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

    private void initGrowth() {
        growsInteractions = Util.make(Maps.newHashMap(), map -> {
            map.put(UABlocks.DEAD_ACAN_CORAL_BLOCK.get(), UABlocks.ACAN_CORAL_BLOCK.get());
            map.put(UABlocks.DEAD_BRANCH_CORAL_BLOCK.get(), UABlocks.BRANCH_CORAL_BLOCK.get());
            map.put(UABlocks.DEAD_FINGER_CORAL_BLOCK.get(), UABlocks.FINGER_CORAL_BLOCK.get());
            map.put(UABlocks.DEAD_STAR_CORAL_BLOCK.get(), UABlocks.STAR_CORAL_BLOCK.get());
            map.put(UABlocks.DEAD_MOSS_CORAL_BLOCK.get(), UABlocks.MOSS_CORAL_BLOCK.get());
            map.put(UABlocks.DEAD_PETAL_CORAL_BLOCK.get(), UABlocks.PETAL_CORAL_BLOCK.get());
            map.put(UABlocks.DEAD_ROCK_CORAL_BLOCK.get(), UABlocks.ROCK_CORAL_BLOCK.get());
            map.put(UABlocks.DEAD_PILLOW_CORAL_BLOCK.get(), UABlocks.PILLOW_CORAL_BLOCK.get());
            map.put(UABlocks.DEAD_SILK_CORAL_BLOCK.get(), UABlocks.SILK_CORAL_BLOCK.get());
            map.put(UABlocks.DEAD_CHROME_CORAL_BLOCK.get(), UABlocks.CHROME_CORAL_BLOCK.get());
            map.put(UABlocks.ELDER_PRISMARINE_CORAL_BLOCK.get(), UABlocks.PRISMARINE_CORAL_BLOCK.get());

            map.put(UABlocks.DEAD_ACAN_CORAL.get(), UABlocks.ACAN_CORAL.get());
            map.put(UABlocks.DEAD_BRANCH_CORAL.get(), UABlocks.BRANCH_CORAL.get());
            map.put(UABlocks.DEAD_FINGER_CORAL.get(), UABlocks.FINGER_CORAL.get());
            map.put(UABlocks.DEAD_STAR_CORAL.get(), UABlocks.STAR_CORAL.get());
            map.put(UABlocks.DEAD_MOSS_CORAL.get(), UABlocks.MOSS_CORAL.get());
            map.put(UABlocks.DEAD_PETAL_CORAL.get(), UABlocks.PETAL_CORAL.get());
            map.put(UABlocks.DEAD_ROCK_CORAL.get(), UABlocks.ROCK_CORAL.get());
            map.put(UABlocks.DEAD_PILLOW_CORAL.get(), UABlocks.PILLOW_CORAL.get());
            map.put(UABlocks.DEAD_SILK_CORAL.get(), UABlocks.SILK_CORAL.get());
            map.put(UABlocks.DEAD_CHROME_CORAL.get(), UABlocks.CHROME_CORAL.get());
            map.put(UABlocks.ELDER_PRISMARINE_CORAL.get(), UABlocks.PRISMARINE_CORAL.get());

            map.put(UABlocks.DEAD_ACAN_CORAL_FAN.get(), UABlocks.ACAN_CORAL_FAN.get());
            map.put(UABlocks.DEAD_BRANCH_CORAL_FAN.get(), UABlocks.BRANCH_CORAL_FAN.get());
            map.put(UABlocks.DEAD_FINGER_CORAL_FAN.get(), UABlocks.FINGER_CORAL_FAN.get());
            map.put(UABlocks.DEAD_STAR_CORAL_FAN.get(), UABlocks.STAR_CORAL_FAN.get());
            map.put(UABlocks.DEAD_MOSS_CORAL_FAN.get(), UABlocks.MOSS_CORAL_FAN.get());
            map.put(UABlocks.DEAD_PETAL_CORAL_FAN.get(), UABlocks.PETAL_CORAL_FAN.get());
            map.put(UABlocks.DEAD_ROCK_CORAL_FAN.get(), UABlocks.ROCK_CORAL_FAN.get());
            map.put(UABlocks.DEAD_PILLOW_CORAL_FAN.get(), UABlocks.PILLOW_CORAL_FAN.get());
            map.put(UABlocks.DEAD_SILK_CORAL_FAN.get(), UABlocks.SILK_CORAL_FAN.get());
            map.put(UABlocks.DEAD_CHROME_CORAL_FAN.get(), UABlocks.CHROME_CORAL_FAN.get());
            map.put(UABlocks.ELDER_PRISMARINE_CORAL_FAN.get(), UABlocks.PRISMARINE_CORAL_FAN.get());

            map.put(UABlocks.DEAD_ACAN_CORAL_WALL_FAN.get(), UABlocks.ACAN_CORAL_WALL_FAN.get());
            map.put(UABlocks.DEAD_BRANCH_CORAL_WALL_FAN.get(), UABlocks.BRANCH_CORAL_WALL_FAN.get());
            map.put(UABlocks.DEAD_FINGER_CORAL_WALL_FAN.get(), UABlocks.FINGER_CORAL_WALL_FAN.get());
            map.put(UABlocks.DEAD_STAR_CORAL_WALL_FAN.get(), UABlocks.STAR_CORAL_WALL_FAN.get());
            map.put(UABlocks.DEAD_MOSS_CORAL_WALL_FAN.get(), UABlocks.MOSS_CORAL_WALL_FAN.get());
            map.put(UABlocks.DEAD_PETAL_CORAL_WALL_FAN.get(), UABlocks.PETAL_CORAL_WALL_FAN.get());
            map.put(UABlocks.DEAD_ROCK_CORAL_WALL_FAN.get(), UABlocks.ROCK_CORAL_WALL_FAN.get());
            map.put(UABlocks.DEAD_PILLOW_CORAL_WALL_FAN.get(), UABlocks.PILLOW_CORAL_WALL_FAN.get());
            map.put(UABlocks.DEAD_SILK_CORAL_WALL_FAN.get(), UABlocks.SILK_CORAL_WALL_FAN.get());
            map.put(UABlocks.DEAD_CHROME_CORAL_WALL_FAN.get(), UABlocks.CHROME_CORAL_WALL_FAN.get());
            map.put(UABlocks.ELDER_PRISMARINE_CORAL_WALL_FAN.get(), UABlocks.PRISMARINE_CORAL_WALL_FAN.get());
        });
        duplicatesInteractions = Util.make(Maps.newHashMap(), map -> {
            map.put(UABlocks.ACAN_CORAL_BLOCK.get(), new ItemStack(UABlocks.ACAN_CORAL_BLOCK.get()));
            map.put(UABlocks.BRANCH_CORAL_BLOCK.get(), new ItemStack(UABlocks.BRANCH_CORAL_BLOCK.get()));
            map.put(UABlocks.FINGER_CORAL_BLOCK.get(), new ItemStack(UABlocks.FINGER_CORAL_BLOCK.get()));
            map.put(UABlocks.STAR_CORAL_BLOCK.get(), new ItemStack(UABlocks.STAR_CORAL_BLOCK.get()));
            map.put(UABlocks.MOSS_CORAL_BLOCK.get(), new ItemStack(UABlocks.MOSS_CORAL_BLOCK.get()));
            map.put(UABlocks.PETAL_CORAL_BLOCK.get(), new ItemStack(UABlocks.PETAL_CORAL_BLOCK.get()));
            map.put(UABlocks.ROCK_CORAL_BLOCK.get(), new ItemStack(UABlocks.ROCK_CORAL_BLOCK.get()));
            map.put(UABlocks.PILLOW_CORAL_BLOCK.get(), new ItemStack(UABlocks.PILLOW_CORAL_BLOCK.get()));
            map.put(UABlocks.SILK_CORAL_BLOCK.get(), new ItemStack(UABlocks.SILK_CORAL_BLOCK.get()));
            map.put(UABlocks.CHROME_CORAL_BLOCK.get(), new ItemStack(UABlocks.CHROME_CORAL_BLOCK.get()));
            map.put(UABlocks.PRISMARINE_CORAL_BLOCK.get(), new ItemStack(UABlocks.PRISMARINE_CORAL_BLOCK.get()));

            map.put(UABlocks.ACAN_CORAL.get(), new ItemStack(UABlocks.ACAN_CORAL.get()));
            map.put(UABlocks.BRANCH_CORAL.get(), new ItemStack(UABlocks.BRANCH_CORAL.get()));
            map.put(UABlocks.FINGER_CORAL.get(), new ItemStack(UABlocks.FINGER_CORAL.get()));
            map.put(UABlocks.STAR_CORAL.get(), new ItemStack(UABlocks.STAR_CORAL.get()));
            map.put(UABlocks.MOSS_CORAL.get(), new ItemStack(UABlocks.MOSS_CORAL.get()));
            map.put(UABlocks.PETAL_CORAL.get(), new ItemStack(UABlocks.PETAL_CORAL.get()));
            map.put(UABlocks.ROCK_CORAL.get(), new ItemStack(UABlocks.ROCK_CORAL.get()));
            map.put(UABlocks.PILLOW_CORAL.get(), new ItemStack(UABlocks.PILLOW_CORAL.get()));
            map.put(UABlocks.SILK_CORAL.get(), new ItemStack(UABlocks.SILK_CORAL.get()));
            map.put(UABlocks.CHROME_CORAL.get(), new ItemStack(UABlocks.CHROME_CORAL.get()));
            map.put(UABlocks.PRISMARINE_CORAL.get(), new ItemStack(UABlocks.PRISMARINE_CORAL.get()));

            map.put(UABlocks.ACAN_CORAL_FAN.get(), new ItemStack(UABlocks.ACAN_CORAL_FAN.get()));
            map.put(UABlocks.BRANCH_CORAL_FAN.get(), new ItemStack(UABlocks.BRANCH_CORAL_FAN.get()));
            map.put(UABlocks.FINGER_CORAL_FAN.get(), new ItemStack(UABlocks.FINGER_CORAL_FAN.get()));
            map.put(UABlocks.STAR_CORAL_FAN.get(), new ItemStack(UABlocks.STAR_CORAL_FAN.get()));
            map.put(UABlocks.MOSS_CORAL_FAN.get(), new ItemStack(UABlocks.MOSS_CORAL_FAN.get()));
            map.put(UABlocks.PETAL_CORAL_FAN.get(), new ItemStack(UABlocks.PETAL_CORAL_FAN.get()));
            map.put(UABlocks.ROCK_CORAL_FAN.get(), new ItemStack(UABlocks.ROCK_CORAL_FAN.get()));
            map.put(UABlocks.PILLOW_CORAL_FAN.get(), new ItemStack(UABlocks.PILLOW_CORAL_FAN.get()));
            map.put(UABlocks.SILK_CORAL_FAN.get(), new ItemStack(UABlocks.SILK_CORAL_FAN.get()));
            map.put(UABlocks.CHROME_CORAL_FAN.get(), new ItemStack(UABlocks.CHROME_CORAL_FAN.get()));
            map.put(UABlocks.PRISMARINE_CORAL_FAN.get(), new ItemStack(UABlocks.PRISMARINE_CORAL_FAN.get()));

            map.put(UABlocks.ACAN_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.ACAN_CORAL_WALL_FAN.get()));
            map.put(UABlocks.BRANCH_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.BRANCH_CORAL_WALL_FAN.get()));
            map.put(UABlocks.FINGER_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.FINGER_CORAL_WALL_FAN.get()));
            map.put(UABlocks.STAR_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.STAR_CORAL_WALL_FAN.get()));
            map.put(UABlocks.MOSS_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.MOSS_CORAL_WALL_FAN.get()));
            map.put(UABlocks.PETAL_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.PETAL_CORAL_WALL_FAN.get()));
            map.put(UABlocks.ROCK_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.ROCK_CORAL_WALL_FAN.get()));
            map.put(UABlocks.PILLOW_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.PILLOW_CORAL_WALL_FAN.get()));
            map.put(UABlocks.SILK_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.SILK_CORAL_WALL_FAN.get()));
            map.put(UABlocks.CHROME_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.CHROME_CORAL_WALL_FAN.get()));
            map.put(UABlocks.PRISMARINE_CORAL_WALL_FAN.get(), new ItemStack(UABlocks.PRISMARINE_CORAL_WALL_FAN.get()));
        });
    }
}