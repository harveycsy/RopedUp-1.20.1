package net.csy.ropedup;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RopedUp implements ModInitializer {
	public static final String MOD_ID = "ropedup";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("RopedUp! Has been released and is now free!");
	}
}