package net.csy.ropedup;

import net.csy.ropedup.block.ModBlocks;
import net.csy.ropedup.item.ModItemGroups;
import net.csy.ropedup.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RopedUp implements ModInitializer {
	public static final String MOD_ID = "ropedup";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("RopedUp! Has been released and is now in the wilderness!");

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}