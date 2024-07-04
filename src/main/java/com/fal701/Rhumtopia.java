package com.fal701;

import com.fal701.block.Brick.Brick;
import com.fal701.block.Brick.WcItemGroupBrick;
import com.fal701.block.Cobblestone.Cobblestone;
import com.fal701.block.Cobblestone.WcItemGroupCobblestone;
import com.fal701.block.Decor.Decor;
import com.fal701.block.Decor.WcItemGroupDecor;
import com.fal701.block.Fieldstone.Fieldstone;
import com.fal701.block.Fieldstone.WcItemGroupFieldstone;
import com.fal701.block.Furniture.Furniture;
import com.fal701.block.Furniture.WcItemGroupFurniture;
import com.fal701.block.HalfAshlar.HalfAshlar;
import com.fal701.block.HalfAshlar.WcItemGroupHalfAshlar;
import com.fal701.block.MarbleAndPlaster.MarblePlaster;
import com.fal701.block.MarbleAndPlaster.WcItemGroupMarblePlaster;
import com.fal701.block.MediumAshlar.MediumAshlar;
import com.fal701.block.MediumAshlar.WcItemGroupMediumAshlar;
import com.fal701.block.Metal.Metal;
import com.fal701.block.Metal.WcItemGroupMetal;
import com.fal701.block.PannellingCarving.PannellingCarving;
import com.fal701.block.PannellingCarving.WcItemGroupPannellingCarving;
import com.fal701.block.QuarterAshlar.QuarterAshlar;
import com.fal701.block.QuarterAshlar.WcItemGroupQuarterAshlar;
import com.fal701.block.Roofing.Roofing;
import com.fal701.block.Roofing.WcItemGroupRoofing;
import com.fal701.block.SmoothAshlar.SmoothAshlar;
import com.fal701.block.SmoothAshlar.WcItemGroupSmoothAshlar;
import com.fal701.block.TimberFrame.TimberFrame;
import com.fal701.block.TimberFrame.WcItemGroupTimberFrame;
import com.fal701.block.WindowsGlass.WcItemGroupWindowsGlass;
import com.fal701.block.WindowsGlass.WindowsGlass;
import com.fal701.block.WoodPlanks.WcItemGroupWoodPlanks;
import com.fal701.block.WoodPlanks.WoodPlanks;
import com.fal701.block.Z_custom.WcBlockEntities;
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
		HalfAshlar.registerModBlocks();
		Brick.registerModBlocks();
		MarblePlaster.registerModBlocks();
		TimberFrame.registerModBlocks();
		Roofing.registerModBlocks();
		WoodPlanks.registerModBlocks();
		PannellingCarving.registerModBlocks();
		Metal.registerModBlocks();
		WindowsGlass.registerModBlocks();
		Furniture.registerModBlocks();
		Decor.registerModBlocks();

		WcItemGroupCobblestone.registerItemGroups();
		WcItemGroupFieldstone.registerItemGroups();
		WcItemGroupSmoothAshlar.registerItemGroups();
		WcItemGroupQuarterAshlar.registerItemGroups();
		WcItemGroupMediumAshlar.registerItemGroups();
		WcItemGroupHalfAshlar.registerItemGroups();
		WcItemGroupBrick.registerItemGroups();
		WcItemGroupMarblePlaster.registerItemGroups();
		WcItemGroupTimberFrame.registerItemGroups();
		WcItemGroupRoofing.registerItemGroups();
		WcItemGroupWoodPlanks.registerItemGroups();
		WcItemGroupPannellingCarving.registerItemGroups();
		WcItemGroupMetal.registerItemGroups();
		WcItemGroupWindowsGlass.registerItemGroups();
		WcItemGroupFurniture.registerItemGroups();
		WcItemGroupDecor.registerItemGroups();

		WcBlockEntities.registerBlockEntities();
	}

}