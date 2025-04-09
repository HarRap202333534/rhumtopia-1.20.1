package com.fal701.block.GrassDirt;

import com.fal701.Rhumtopia;
import com.fal701.block.SandGravel.SandGravel;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupGrassDirt {
    public static final ItemGroup GRASSDIRT = FabricItemGroup.builder()
            .icon(() -> new ItemStack(GrassDirt.BOG))
            .displayName(Text.translatable("itemGroup.WesterosGrassDirt"))
            .entries((context, entries) -> {
                entries.add(GrassDirt.BONE_DIRT);
                entries.add(GrassDirt.THICK_GRASS_BLOCK);
                entries.add(GrassDirt.CLASSIC_GRASS_BLOCK);
                entries.add(GrassDirt.DIRT);
                entries.add(GrassDirt.DIRT_SLAB);
                entries.add(GrassDirt.PATH_DIRT);
                entries.add(GrassDirt.GRASSY_DIRT);
                entries.add(GrassDirt.GRASSY_DIRT_SLAB);
                entries.add(GrassDirt.GRASSY_DIRT_PATH);
                entries.add(GrassDirt.GRAVEL);
                entries.add(GrassDirt.GRAVEL_SLAB);
                entries.add(GrassDirt.PATH_GRAVEL);
                entries.add(GrassDirt.REACH_GRAVEL);
                entries.add(GrassDirt.REACH_GRAVEL_SLAB);
                entries.add(GrassDirt.PATH_REACH_GRAVEL);
                entries.add(GrassDirt.DORNE_DUSTY_DIRT);
                entries.add(GrassDirt.DORNE_DUSTY_DIRT_SLAB);
                entries.add(GrassDirt.PATH_DORNE_DUSTY_DIRT);
                entries.add(GrassDirt.DORNE_DRY_SOIL);
                entries.add(GrassDirt.DORNE_DRY_SOIL_SLAB);
                entries.add(GrassDirt.PATH_DORNE_DRY_SOIL);
                entries.add(GrassDirt.MUD);
                entries.add(GrassDirt.MUD_SLAB);
                entries.add(GrassDirt.MUDDY_SNOW);
                entries.add(GrassDirt.MUDDY_SNOW_SLAB);
                entries.add(GrassDirt.BOG);
                entries.add(GrassDirt.BOG_SLAB);
                entries.add(GrassDirt.SCORCHED_EARTH);
                entries.add(GrassDirt.SCORCHED_EARTH_SLAB);
                entries.add(GrassDirt.PLOWED_SOIL);
                entries.add(GrassDirt.PLOWED_SOIL_SLAB);
                entries.add(GrassDirt.FALLEN_LEAVES);
                entries.add(GrassDirt.FALLEN_LEAVES_SLAB);
                entries.add(GrassDirt.PINE_NEEDLES);
                entries.add(GrassDirt.PINE_NEEDLES_SLAB);
                entries.add(GrassDirt.PEAT);
                entries.add(GrassDirt.PEAT_SLAB);
            }).build();


    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "grassdirt"), GRASSDIRT);
    }
}
