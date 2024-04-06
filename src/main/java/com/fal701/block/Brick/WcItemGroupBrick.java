package com.fal701.block.Brick;

import com.fal701.Rhumtopia;
import com.fal701.block.HalfAshlar.HalfAshlar;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupBrick {
    public static final ItemGroup BRICK = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Brick.SMALL_ORANGE_BRICKS))
            .displayName(Text.translatable("itemGroup.westerosblocks.brick"))
            .entries((context, entries) -> {
                entries.add(Brick.ORANGE_BRICK_ROWLOCK);
                entries.add(Brick.ORANGE_BRICK_DENTIL);
                entries.add(Brick.ORANGE_BRICK_ARCH_SINGLE);
                entries.add(Brick.ORANGE_BRICK_ARCH_DOUBLE);
                entries.add(Brick.SOUTHERN_BRICK_LINTEL);
                entries.add(Brick.SOUTHERN_BRICK_ARCH);
                entries.add(Brick.SOUTHERN_BRICK_ARCH_FLAT);
                entries.add(Brick.SMALL_ORANGE_BRICKS);
                entries.add(Brick.SMALL_ORANGE_BRICKS_STAIRS);
                entries.add(Brick.SMALL_ORANGE_BRICKS_SLAB);
                entries.add(Brick.SMALL_ORANGE_BRICKS_WALL);
                entries.add(Brick.SMALL_ORANGE_BRICKS_FENCE);
                entries.add(Brick.SMALL_ORANGE_BRICKS_HOPPER);
                entries.add(Brick.SMALL_ORANGE_BRICKS_TIP);
                entries.add(Brick.SMALL_ORANGE_BRICKS_ARROW_SLIT);
                entries.add(Brick.SMALL_ORANGE_BRICKS_ARROW_SLIT_WINDOW);
                entries.add(Brick.SMALL_ORANGE_BRICKS_ARROW_SLIT_ORNATE);
                entries.add(Brick.ORANGE_BRICK);
                entries.add(Brick.BRICK_STAIRS);
                entries.add(Brick.ORANGE_BRICK_SLAB);
                entries.add(Brick.ORANGE_BRICK_WALL);
                entries.add(Brick.ORANGE_BRICK_FENCE);
                entries.add(Brick.ORANGE_BRICK_HOPPER);
                entries.add(Brick.ORANGE_BRICK_TIP);
                entries.add(Brick.DARK_ORANGE_BRICK);
                entries.add(Brick.DARK_ORANGE_BRICK_STAIRS);
                entries.add(Brick.DARK_ORANGE_BRICK_SLAB);
                entries.add(Brick.DARK_ORANGE_BRICK_WALL);
                entries.add(Brick.DARK_ORANGE_BRICK_FENCE);
                entries.add(Brick.DARK_ORANGE_BRICK_HOPPER);
                entries.add(Brick.DARK_ORANGE_BRICK_TIP);
                entries.add(Brick.SOUTHERN_BRICK);
                entries.add(Brick.SOUTHERN_BRICK_STAIRS);
                entries.add(Brick.SOUTHERN_BRICK_SLAB);
                entries.add(Brick.SOUTHERN_BRICK_WALL);
                entries.add(Brick.SOUTHERN_BRICK_FENCE);
                entries.add(Brick.SOUTHERN_BRICK_HOPPER);
                entries.add(Brick.SOUTHERN_BRICK_TIP);
                entries.add(Brick.SOUTHERN_BRICK_ARROW_SLIT);
                entries.add(Brick.SOUTHERN_BRICK_ARROW_SLIT_WINDOW);
                entries.add(Brick.SOUTHERN_BRICK_ARROW_SLIT_ORNATE);
                entries.add(Brick.ROUGH_SOUTHERN_BRICK);
                entries.add(Brick.ROUGH_SOUTHERN_BRICK_STAIRS);
                entries.add(Brick.ROUGH_SOUTHERN_BRICK_SLAB);
                entries.add(Brick.ROUGH_SOUTHERN_BRICK_WALL);
                entries.add(Brick.ROUGH_SOUTHERN_BRICK_FENCE);
                entries.add(Brick.ROUGH_SOUTHERN_BRICK_HOPPER);
                entries.add(Brick.ROUGH_SOUTHERN_BRICK_TIP);
                entries.add(Brick.DARK_SOUTHERN_BRICK);
                entries.add(Brick.DARK_SOUTHERN_BRICK_STAIRS);
                entries.add(Brick.DARK_SOUTHERN_BRICK_SLAB);
                entries.add(Brick.DARK_SOUTHERN_BRICK_WALL);
                entries.add(Brick.DARK_SOUTHERN_BRICK_FENCE);
                entries.add(Brick.DARK_SOUTHERN_BRICK_HOPPER);
                entries.add(Brick.DARK_SOUTHERN_BRICK_TIP);
            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "brick"), BRICK);
    }
}
