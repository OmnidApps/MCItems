package com.omnidapps.mcitems.items;

import com.omnidapps.mcitems.MCItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class BobDobbsItem extends Item {
    public BobDobbsItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(MCItems.BOB_SOUND_EVENT, 0.5F, 1.0F);
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}