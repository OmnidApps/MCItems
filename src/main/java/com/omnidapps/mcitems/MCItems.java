package com.omnidapps.mcitems;

import com.omnidapps.mcitems.items.BobDobbsItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MCItems implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("mcitems");

	public static final BobDobbsItem BOB_DOBBS_ITEM = new BobDobbsItem(new FabricItemSettings().group(ItemGroup.MISC));
	public static final Identifier BOB_SOUND_ID = new Identifier("mcitems:bob");
	public static SoundEvent BOB_SOUND_EVENT = new SoundEvent(BOB_SOUND_ID);
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("onInitialize start");
		Registry.register(Registry.ITEM, new Identifier("mcitems", "bob_dobbs"), BOB_DOBBS_ITEM);
		Registry.register(Registry.SOUND_EVENT, BOB_SOUND_ID, BOB_SOUND_EVENT);
		LOGGER.info("onInitialize end");
	}
}
