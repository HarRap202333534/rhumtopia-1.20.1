package com.fal701.block.Miscellaneous;

import com.fal701.Rhumtopia;
import com.fal701.block.WaterAir.WaterAir;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupMiscellaneous {
    public static final ItemGroup MISC = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Miscellaneous.ARCHERY_TARGET))
            .displayName(Text.translatable("itemGroup.WesterosMisc"))
            .entries((context, entries) -> {
                entries.add(Miscellaneous.BEES);
                entries.add(Miscellaneous.DRAGONFLY);
                entries.add(Miscellaneous.BUTTERFLY_BLUE);
                entries.add(Miscellaneous.BUTTERFLY_ORANGE);
                entries.add(Miscellaneous.BUTTERFLY_RED);
                entries.add(Miscellaneous.BUTTERFLY_YELLOW);
                entries.add(Miscellaneous.BUTTERFLY_WHITE);
                entries.add(Miscellaneous.WINTERFELL_STONE_LADDER);
                entries.add(Miscellaneous.ROPE_PULLEY);
                entries.add(Miscellaneous.CHAIN_PULLEY);
                entries.add(Miscellaneous.ARCHERY_TARGET);
                entries.add(Miscellaneous.STACKED_BONES_SOLID);
                entries.add(Miscellaneous.STACKED_BONES);
                entries.add(Miscellaneous.STACKED_BONES_SLAB);
                entries.add(Miscellaneous.STACKED_BONES_STAIRS);
                entries.add(Miscellaneous.STACKED_BONES_WALL);
                entries.add(Miscellaneous.PILED_BONES);
                entries.add(Miscellaneous.PILED_BONES_SLAB);
                entries.add(Miscellaneous.PILED_BONES_STAIRS);
                entries.add(Miscellaneous.PILED_BONES_WALL);
                entries.add(Miscellaneous.ASH);
                entries.add(Miscellaneous.ASH_SLAB);
                entries.add(Miscellaneous.ASH_LAYER);
            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "misc"), MISC);
    }
}
