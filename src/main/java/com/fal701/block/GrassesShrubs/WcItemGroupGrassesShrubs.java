package com.fal701.block.GrassesShrubs;

import com.fal701.Rhumtopia;
import com.fal701.block.GrassDirt.GrassDirt;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupGrassesShrubs {
    public static final ItemGroup GRASSESSHRUBS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(GrassesShrubs.BRACKEN))
            .displayName(Text.translatable("itemGroup.WesterosGrassesShrubs"))
            .entries((context, entries) -> {
                entries.add(GrassesShrubs.THICK_GRASS);
                entries.add(GrassesShrubs.GRASS);
                entries.add(GrassesShrubs.GREEN_SPINY_HERB);
                entries.add(GrassesShrubs.GREEN_LEAFY_HERB);
                entries.add(GrassesShrubs.GREEN_SCRUB_GRASS);
                entries.add(GrassesShrubs.DEAD_SCRUB_GRASS);
                entries.add(GrassesShrubs.MEADOW_FESCUE);
                entries.add(GrassesShrubs.BROWN_MUSHROOM_1);
                entries.add(GrassesShrubs.BROWN_MUSHROOM_2);
                entries.add(GrassesShrubs.BROWN_MUSHROOM_3);
                entries.add(GrassesShrubs.BROWN_MUSHROOM_4);
                entries.add(GrassesShrubs.BROWN_MUSHROOM_5);
                entries.add(GrassesShrubs.BROWN_MUSHROOM_6);
                entries.add(GrassesShrubs.BROWN_MUSHROOM_7);
                entries.add(GrassesShrubs.BROWN_MUSHROOM_8);
                entries.add(GrassesShrubs.BROWN_MUSHROOM_9);
                entries.add(GrassesShrubs.BROWN_MUSHROOM_10);
                entries.add(GrassesShrubs.BROWN_MUSHROOM_11);
                entries.add(GrassesShrubs.BROWN_MUSHROOM_12);
                entries.add(GrassesShrubs.BROWN_MUSHROOM_13);
                entries.add(GrassesShrubs.RED_MUSHROOM_1);
                entries.add(GrassesShrubs.RED_MUSHROOM_2);
                entries.add(GrassesShrubs.RED_MUSHROOM_3);
                entries.add(GrassesShrubs.RED_MUSHROOM_4);
                entries.add(GrassesShrubs.RED_MUSHROOM_5);
                entries.add(GrassesShrubs.RED_MUSHROOM_6);
                entries.add(GrassesShrubs.RED_MUSHROOM_7);
                entries.add(GrassesShrubs.RED_MUSHROOM_8);
                entries.add(GrassesShrubs.RED_MUSHROOM_9);
                entries.add(GrassesShrubs.UNSHADED_GRASS);
                entries.add(GrassesShrubs.JUNGLE_TALL_FERN);
                entries.add(GrassesShrubs.JUNGLE_TALL_GRASS);
                entries.add(GrassesShrubs.SAVANNA_TALL_GRASS);
                entries.add(GrassesShrubs.DEAD_JUNGLE_TALL_GRASS);
                entries.add(GrassesShrubs.DEAD_SAVANNA_TALL_GRASS);
                entries.add(GrassesShrubs.CATTAILS);
                entries.add(GrassesShrubs.DEAD_BUSH);
                entries.add(GrassesShrubs.COW_PARSELY);
                entries.add(GrassesShrubs.LADY_FERN);
                entries.add(GrassesShrubs.NETTLE);
                entries.add(GrassesShrubs.DEAD_BRACKEN);
                entries.add(GrassesShrubs.FIREWEED);
                entries.add(GrassesShrubs.HEATHER);
                entries.add(GrassesShrubs.RED_FERN);
            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "grassesshrubs"), GRASSESSHRUBS);
    }
}
