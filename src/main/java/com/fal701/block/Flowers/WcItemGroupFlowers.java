package com.fal701.block.Flowers;

import com.fal701.Rhumtopia;
import com.fal701.block.Decor.Decor;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.concurrent.Flow;

public class WcItemGroupFlowers {
    public static final ItemGroup FLOWERS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Flowers.BLUE_BELLS))
            .displayName(Text.translatable("itemGroup.WesterosFlowers"))
            .entries((context, entries) -> {
                entries.add(Flowers.YELLOW_BEDSTRAW);
                entries.add(Flowers.YELLOW_WILDFLOWERS);
                entries.add(Flowers.ORANGE_MARIGOLDS);
                entries.add(Flowers.ORANGE_TROLLIUS);
                entries.add(Flowers.BLUE_FORGETMENOTS);
                entries.add(Flowers.PINK_WILDFLOWERS);
                entries.add(Flowers.YELLOW_TANSY);
                entries.add(Flowers.BLUE_FLAX);
                entries.add(Flowers.WHITE_DAISIES);
                entries.add(Flowers.YELLOW_DAISIES);
                entries.add(Flowers.ORANGE_BELLS);
                entries.add(Flowers.BLUE_BELLS);
                entries.add(Flowers.BLUE_SWAMP_BELLS);
                entries.add(Flowers.YELLOW_BUTTERCUPS);
                entries.add(Flowers.ORANGE_BOG_ASPHODEL);
                entries.add(Flowers.YELLOW_LUPINE);
                entries.add(Flowers.BLUE_HYACINTH);
                entries.add(Flowers.PINK_THISTLE);
                entries.add(Flowers.YELLOW_DANDELIONS);
                entries.add(Flowers.YELLOW_DAFFODILS);
                entries.add(Flowers.YELLOW_ROSES);
                entries.add(Flowers.WHITE_LILYOFTHEVALLEY);
                entries.add(Flowers.YELLOW_BELLS);
                entries.add(Flowers.YELLOW_SUNFLOWER);
                entries.add(Flowers.WHITE_ROSES);
                entries.add(Flowers.RED_DARK_ROSES);
                entries.add(Flowers.YELLOW_HELLEBORE);
                entries.add(Flowers.RED_POPPIES);
                entries.add(Flowers.RED_ROSES);
                entries.add(Flowers.PURPLE_PANSIES);
                entries.add(Flowers.PURPLE_ROSES);
                entries.add(Flowers.ORANGE_SUN_STAR);
                entries.add(Flowers.PINK_PRIMROSE);
                entries.add(Flowers.RED_ASTER);
                entries.add(Flowers.BLUE_CHICORY);
                entries.add(Flowers.RED_FLOWERING_SPINY_HERB);
                entries.add(Flowers.PURPLE_FOXGLOVE);
                entries.add(Flowers.PINK_ALLIUM);
                entries.add(Flowers.PURPLE_VIOLETS);
                entries.add(Flowers.WHITE_CHAMOMILE);
                entries.add(Flowers.RED_TULIPS);
                entries.add(Flowers.WHITE_PEONY);
                entries.add(Flowers.PURPLE_ALPINE_SOWTHISTLE);
                entries.add(Flowers.RED_CARNATIONS);
                entries.add(Flowers.MAGENTA_ROSES);
                entries.add(Flowers.RED_CHRYSANTHEMUM);
                entries.add(Flowers.BLUE_ORCHID);
                entries.add(Flowers.YELLOW_RUDBECKIA);
                entries.add(Flowers.PINK_TULIPS);
                entries.add(Flowers.PURPLE_LAVENDER);
                entries.add(Flowers.PINK_SWEET_PEAS);
                entries.add(Flowers.RED_SORREL);
                entries.add(Flowers.PINK_ROSES);
            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "flowers"), FLOWERS);
    }
}
