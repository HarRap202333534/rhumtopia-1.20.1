package com.fal701;

import com.fal701.block.Cobblestone.Cobblestone;
import com.fal701.block.Cobblestone.WcItemGroupCobblestone;
import com.fal701.block.Fieldstone.Fieldstone;
import com.fal701.block.Fieldstone.WcItemGroupFieldstone;
import com.fal701.block.MediumAshlar.MediumAshlar;
import com.fal701.block.MediumAshlar.WcItemGroupMediumAshlar;
import com.fal701.block.QuarterAshlar.QuarterAshlar;
import com.fal701.block.QuarterAshlar.WcItemGroupQuarterAshlar;
import com.fal701.block.SmoothAshlar.SmoothAshlar;
import com.fal701.block.SmoothAshlar.WcItemGroupSmoothAshlar;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rhumtopia implements ModInitializer {

	public static final String MOD_ID = "westerosblocks";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		Cobblestone.registerModBlocks();
		Fieldstone.registerModBlocks();
		SmoothAshlar.registerModBlocks();
		QuarterAshlar.registerModBlocks();
		MediumAshlar.registerModBlocks();

		WcItemGroupCobblestone.registerItemGroups();
		WcItemGroupFieldstone.registerItemGroups();
		WcItemGroupSmoothAshlar.registerItemGroups();
		WcItemGroupQuarterAshlar.registerItemGroups();
		WcItemGroupMediumAshlar.registerItemGroups();
	}

}