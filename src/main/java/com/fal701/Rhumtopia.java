package com.fal701;

import com.fal701.block.Cobblestone;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rhumtopia implements ModInitializer {

	public static final String MOD_ID = "wcdom";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Cobblestone.registerModBlocks();
	}
}