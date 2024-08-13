package com.fal701.block.Metal;

import com.fal701.Rhumtopia;
import com.fal701.block.MediumAshlar.MediumAshlar;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupMetal {
    public static final ItemGroup METAL = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Metal.VERTICAL_CHAIN))
            .displayName(Text.translatable("itemGroup.WesterosMetal"))
            .entries((context, entries) -> {
                entries.add(Metal.VERTICAL_CHAIN);
                entries.add(Metal.IRON_BARS);
                entries.add(Metal.IRON_CROSSBAR);
                entries.add(Metal.OXIDIZED_IRON_BARS);
                entries.add(Metal.OXIDIZED_IRON_CROSSBAR);
                entries.add(Metal.CHAIN_BLOCK_HARNESS);
                entries.add(Metal.HORIZONTAL_CHAIN);
                entries.add(Metal.IRON_RUNGS);
                entries.add(Metal.IRON_RUNGS_BROKEN);
                entries.add(Metal.IRON_BLOCK);
                entries.add(Metal.IRON_STAIRS);
                entries.add(Metal.IRON_SLAB);
                entries.add(Metal.IRON_WALL);
                entries.add(Metal.IRON_FENCE);
                entries.add(Metal.IRON_HOPPER);
                entries.add(Metal.IRON_TIP);
                entries.add(Metal.OXIDIZED_IRON_BLOCK);
                entries.add(Metal.OXIDIZED_IRON_STAIRS);
                entries.add(Metal.OXIDIZED_IRON_SLAB);
                entries.add(Metal.OXIDIZED_IRON_WALL);
                entries.add(Metal.OXIDIZED_IRON_FENCE);
                entries.add(Metal.OXIDIZED_IRON_HOPPER);
                entries.add(Metal.OXIDIZED_IRON_TIP);
                entries.add(Metal.STEEL_BLOCK);
                entries.add(Metal.STEEL_STAIRS);
                entries.add(Metal.STEEL_SLAB);
                entries.add(Metal.STEEL_WALL);
                entries.add(Metal.STEEL_FENCE);
                entries.add(Metal.STEEL_HOPPER);
                entries.add(Metal.STEEL_TIP);
                entries.add(Metal.OXIDIZED_STEEL_BLOCK);
                entries.add(Metal.OXIDIZED_STEEL_STAIRS);
                entries.add(Metal.OXIDIZED_STEEL_SLAB);
                entries.add(Metal.OXIDIZED_STEEL_WALL);
                entries.add(Metal.OXIDIZED_STEEL_FENCE);
                entries.add(Metal.OXIDIZED_STEEL_HOPPER);
                entries.add(Metal.OXIDIZED_STEEL_TIP);
                entries.add(Metal.BRONZE_BLOCK);
                entries.add(Metal.BRONZE_STAIRS);
                entries.add(Metal.BRONZE_SLAB);
                entries.add(Metal.BRONZE_WALL);
                entries.add(Metal.BRONZE_FENCE);
                entries.add(Metal.BRONZE_HOPPER);
                entries.add(Metal.BRONZE_TIP);
                entries.add(Metal.OXIDIZED_BRONZE_BLOCK);
                entries.add(Metal.OXIDIZED_BRONZE_STAIRS);
                entries.add(Metal.OXIDIZED_BRONZE_SLAB);
                entries.add(Metal.OXIDIZED_BRONZE_WALL);
                entries.add(Metal.OXIDIZED_BRONZE_FENCE);
                entries.add(Metal.OXIDIZED_BRONZE_HOPPER);
                entries.add(Metal.OXIDIZED_BRONZE_TIP);
                entries.add(Metal.GOLD_BLOCK);
                entries.add(Metal.GOLD_STAIRS);
                entries.add(Metal.GOLD_SLAB);
                entries.add(Metal.GOLD_WALL);
                entries.add(Metal.GOLD_FENCE);
                entries.add(Metal.GOLD_HOPPER);
                entries.add(Metal.GOLD_TIP);
                entries.add(Metal.GOLD_BRICK);
                entries.add(Metal.GOLD_BRICK_STAIRS);
                entries.add(Metal.GOLD_BRICK_SLAB);
                entries.add(Metal.GOLD_BRICK_WALL);
                entries.add(Metal.GOLD_BRICK_FENCE);
                entries.add(Metal.GOLD_BRICK_HOPPER);
                entries.add(Metal.GOLD_BRICK_TIP);
                entries.add(Metal.IRON_THRONE_BLADE_BLOCK);
                entries.add(Metal.IRON_THRONE_BLADE_STAIRS);
                entries.add(Metal.IRON_THRONE_BLADE_SLAB);
                entries.add(Metal.IRON_THRONE_BLADE_WALL);
                entries.add(Metal.IRON_THRONE_BLADE_FENCE);
                entries.add(Metal.IRON_THRONE_RANDOM_BLADES);
            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "metal"), METAL);
    }
}
