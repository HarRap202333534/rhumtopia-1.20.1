package com.fal701.block.Roofing;

import com.fal701.Rhumtopia;
import com.fal701.block.QuarterAshlar.QuarterAshlar;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupRoofing {
    public static final ItemGroup ROOFING = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Roofing.BLACK_SLATE))
            .displayName(Text.translatable("itemGroup.westerosblocks.roofing"))
            .entries((context, entries) -> {
                entries.add(Roofing.BLACK_SLATE);
                entries.add(Roofing.BLACK_SLATE_STAIRS);
                entries.add(Roofing.BLACK_SLATE_SLAB);
                entries.add(Roofing.BLACK_SLATE_WALL);
                entries.add(Roofing.BLACK_SLATE_FENCE);
                entries.add(Roofing.BLACK_SLATE_HOPPER);
                entries.add(Roofing.BLACK_SLATE_TIP);
                entries.add(Roofing.BLUE_SLATE);
                entries.add(Roofing.BLUE_SLATE_STAIRS);
                entries.add(Roofing.BLUE_SLATE_SLAB);
                entries.add(Roofing.BLUE_SLATE_WALL);
                entries.add(Roofing.BLUE_SLATE_FENCE);
                entries.add(Roofing.BLUE_SLATE_HOPPER);
                entries.add(Roofing.BLUE_SLATE_TIP);
                entries.add(Roofing.RED_SLATE);
                entries.add(Roofing.RED_SLATE_STAIRS);
                entries.add(Roofing.RED_SLATE_SLAB);
                entries.add(Roofing.RED_SLATE_WALL);
                entries.add(Roofing.RED_SLATE_FENCE);
                entries.add(Roofing.RED_SLATE_HOPPER);
                entries.add(Roofing.RED_SLATE_TIP);
                entries.add(Roofing.BROWN_SLATE);
                entries.add(Roofing.BROWN_SLATE_STAIRS);
                entries.add(Roofing.BROWN_SLATE_SLAB);
                entries.add(Roofing.BROWN_SLATE_WALL);
                entries.add(Roofing.BROWN_SLATE_FENCE);
                entries.add(Roofing.BROWN_SLATE_HOPPER);
                entries.add(Roofing.BROWN_SLATE_TIP);
                entries.add(Roofing.GREEN_SLATE);
                entries.add(Roofing.GREEN_SLATE_STAIRS);
                entries.add(Roofing.GREEN_SLATE_SLAB);
                entries.add(Roofing.GREEN_SLATE_WALL);
                entries.add(Roofing.GREEN_SLATE_FENCE);
                entries.add(Roofing.GREEN_SLATE_HOPPER);
                entries.add(Roofing.GREEN_SLATE_TIP);
                entries.add(Roofing.ORANGE_SLATE);
                entries.add(Roofing.ORANGE_SLATE_STAIRS);
                entries.add(Roofing.ORANGE_SLATE_SLAB);
                entries.add(Roofing.ORANGE_SLATE_WALL);
                entries.add(Roofing.ORANGE_SLATE_FENCE);
                entries.add(Roofing.ORANGE_SLATE_HOPPER);
                entries.add(Roofing.ORANGE_SLATE_TIP);
                entries.add(Roofing.REDORANGE_SLATE);
                entries.add(Roofing.REDORANGE_SLATE_STAIRS);
                entries.add(Roofing.REDORANGE_SLATE_SLAB);
                entries.add(Roofing.REDORANGE_SLATE_WALL);
                entries.add(Roofing.REDORANGE_SLATE_FENCE);
                entries.add(Roofing.REDORANGE_SLATE_HOPPER);
                entries.add(Roofing.REDORANGE_SLATE_TIP);
                entries.add(Roofing.THATCH_LIGHT_FUR);
                entries.add(Roofing.THATCH_LIGHT_FUR_STAIRS);
                entries.add(Roofing.THATCH_LIGHT_FUR_SLAB);
                entries.add(Roofing.THATCH_LIGHT_WALL);
                entries.add(Roofing.THATCH_LIGHT_FUR_FENCE);
                entries.add(Roofing.THATCH_LIGHT_FUR_TIP);
                entries.add(Roofing.THATCH_LIGHT_FUR_CARPET);
                entries.add(Roofing.THATCH_DARK_FUR);
                entries.add(Roofing.THATCH_DARK_FUR_STAIRS);
                entries.add(Roofing.THATCH_DARK_FUR_SLAB);
                entries.add(Roofing.THATCH_DARK_WALL);
                entries.add(Roofing.THATCH_DARK_FUR_FENCE);
                entries.add(Roofing.THATCH_DARK_FUR_TIP);
                entries.add(Roofing.THATCH_DARK_FUR_CARPET);
                entries.add(Roofing.SNOWY_THATCH_LIGHT_FUR);
                entries.add(Roofing.SNOWY_THATCH_LIGHT_FUR_STAIRS);
                entries.add(Roofing.SNOWY_THATCH_LIGHT_FUR_SLAB);
                entries.add(Roofing.SNOWY_THATCH_LIGHT_WALL);
                entries.add(Roofing.SNOWY_THATCH_LIGHT_FUR_FENCE);
                entries.add(Roofing.SNOWY_THATCH_LIGHT_FUR_TIP);
                entries.add(Roofing.SNOWY_THATCH_LIGHT_FUR_CARPET);
                entries.add(Roofing.SNOWY_THATCH_LIGHT_FUR2);
                entries.add(Roofing.SNOWY_THATCH_DARK_FUR);
                entries.add(Roofing.SNOWY_THATCH_DARK_FUR_STAIRS);
                entries.add(Roofing.SNOWY_THATCH_DARK_FUR_SLAB);
                entries.add(Roofing.SNOWY_THATCH_DARK_WALL);
                entries.add(Roofing.SNOWY_THATCH_DARK_FUR_FENCE);
                entries.add(Roofing.SNOWY_THATCH_DARK_FUR_TIP);
                entries.add(Roofing.SNOWY_THATCH_DARK_FUR_CARPET);
                entries.add(Roofing.SNOWY_THATCH_DARK_FUR2);
            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "roofing"), ROOFING);
    }
}
