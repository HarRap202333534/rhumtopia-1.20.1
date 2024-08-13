package com.fal701;

import com.fal701.block.Brick.Brick;
import com.fal701.block.Brick.WcItemGroupBrick;
import com.fal701.block.ClothFibers.ClothFibers;
import com.fal701.block.ClothFibers.WcItemGroupClothFibers;
import com.fal701.block.Cobblestone.Cobblestone;
import com.fal701.block.Cobblestone.WcItemGroupCobblestone;
import com.fal701.block.Decor.Decor;
import com.fal701.block.Decor.WcItemGroupDecor;
import com.fal701.block.Fieldstone.Fieldstone;
import com.fal701.block.Fieldstone.WcItemGroupFieldstone;
import com.fal701.block.Flowers.Flowers;
import com.fal701.block.Flowers.WcItemGroupFlowers;
import com.fal701.block.Foliage.Foliage;
import com.fal701.block.Foliage.WcItemGroupFoliage;
import com.fal701.block.FoodBlocks.FoodBlocks;
import com.fal701.block.FoodBlocks.WcItemGroupFoodBlocks;
import com.fal701.block.Furniture.Furniture;
import com.fal701.block.Furniture.WcItemGroupFurniture;
import com.fal701.block.GrassDirt.GrassDirt;
import com.fal701.block.GrassDirt.WcItemGroupGrassDirt;
import com.fal701.block.GrassesShrubs.GrassesShrubs;
import com.fal701.block.GrassesShrubs.WcItemGroupGrassesShrubs;
import com.fal701.block.HalfAshlar.HalfAshlar;
import com.fal701.block.HalfAshlar.WcItemGroupHalfAshlar;
import com.fal701.block.Lighting.Lighting;
import com.fal701.block.Lighting.WcItemGroupLighting;
import com.fal701.block.Logs.Logs;
import com.fal701.block.Logs.WcItemGroupLogs;
import com.fal701.block.MarbleAndPlaster.MarblePlaster;
import com.fal701.block.MarbleAndPlaster.WcItemGroupMarblePlaster;
import com.fal701.block.MediumAshlar.MediumAshlar;
import com.fal701.block.MediumAshlar.WcItemGroupMediumAshlar;
import com.fal701.block.Metal.Metal;
import com.fal701.block.Metal.WcItemGroupMetal;
import com.fal701.block.Miscellaneous.Miscellaneous;
import com.fal701.block.Miscellaneous.WcItemGroupMiscellaneous;
import com.fal701.block.PannellingCarving.PannellingCarving;
import com.fal701.block.PannellingCarving.WcItemGroupPannellingCarving;
import com.fal701.block.QuarterAshlar.QuarterAshlar;
import com.fal701.block.QuarterAshlar.WcItemGroupQuarterAshlar;
import com.fal701.block.Roofing.Roofing;
import com.fal701.block.Roofing.WcItemGroupRoofing;
import com.fal701.block.SandGravel.SandGravel;
import com.fal701.block.SandGravel.WcItemGroupSandGravel;
import com.fal701.block.SmoothAshlar.SmoothAshlar;
import com.fal701.block.SmoothAshlar.WcItemGroupSmoothAshlar;
import com.fal701.block.TerrainSet.TerrainSet;
import com.fal701.block.TerrainSet.WcItemGroupTerrainSet;
import com.fal701.block.TimberFrame.TimberFrame;
import com.fal701.block.TimberFrame.WcItemGroupTimberFrame;
import com.fal701.block.WaterAir.WaterAir;
import com.fal701.block.WaterAir.WcItemGroupWaterAir;
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
		Lighting.registerModBlocks();
		TerrainSet.registerModBlocks();
		SandGravel.registerModBlocks();
		GrassDirt.registerModBlocks();
		Logs.registerModBlocks();
		FoodBlocks.registerModBlocks();
		ClothFibers.registerModBlocks();
		Foliage.registerModBlocks();
		GrassesShrubs.registerModBlocks();
		Flowers.registerModBlocks();
		WaterAir.registerModBlocks();
		Miscellaneous.registerModBlocks();

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
		WcItemGroupLighting.registerItemGroups();
		WcItemGroupTerrainSet.registerItemGroups();
		WcItemGroupSandGravel.registerItemGroups();
		WcItemGroupGrassDirt.registerItemGroups();
		WcItemGroupLogs.registerItemGroups();
		WcItemGroupFoodBlocks.registerItemGroups();
		WcItemGroupClothFibers.registerItemGroups();
		WcItemGroupFoliage.registerItemGroups();
		WcItemGroupGrassesShrubs.registerItemGroups();
		WcItemGroupFlowers.registerItemGroups();
		WcItemGroupWaterAir.registerItemGroups();
		WcItemGroupMiscellaneous.registerItemGroups();

		WcBlockEntities.registerBlockEntities();
	}

}