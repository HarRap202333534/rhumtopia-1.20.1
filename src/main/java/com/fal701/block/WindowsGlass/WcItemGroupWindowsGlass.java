package com.fal701.block.WindowsGlass;

import com.fal701.Rhumtopia;
import com.fal701.block.Metal.Metal;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupWindowsGlass {
    public static final ItemGroup WINDOWSGLASS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(WindowsGlass.OAK_WINDOW_SHUTTERS))
            .displayName(Text.translatable("itemGroup.WesterosWindowsGlass"))
            .entries((context, entries) -> {
                entries.add(WindowsGlass.SEPT_CRYSTAL_LARGE);
                entries.add(WindowsGlass.COLOURED_SEPT_WINDOW);
                entries.add(WindowsGlass.OAK_WINDOW_SHUTTERS);
                entries.add(WindowsGlass.SPRUCE_WINDOW_SHUTTERS);
                entries.add(WindowsGlass.BIRCH_WINDOW_SHUTTERS);
                entries.add(WindowsGlass.JUNGLE_WINDOW_SHUTTERS);
                entries.add(WindowsGlass.NORTHERN_WOOD_WINDOW_SHUTTERS);
                entries.add(WindowsGlass.GREY_WOOD_WINDOW_SHUTTERS);
                entries.add(WindowsGlass.WHITE_WOOD_WINDOW_SHUTTERS);
                entries.add(WindowsGlass.DORNE_RED_WINDOW_SHUTTERS);
                entries.add(WindowsGlass.GREEN_LANNISPORT_WINDOW_SHUTTERS);
                entries.add(WindowsGlass.REACH_BLUE_WINDOW_SHUTTERS);
                entries.add(WindowsGlass.STAINED_GLASS_RED);
                entries.add(WindowsGlass.STAINED_GLASS_BLACK);
                entries.add(WindowsGlass.STAINED_GLASS_ORANGE);
                entries.add(WindowsGlass.STAINED_GLASS_YELLOW);
                entries.add(WindowsGlass.STAINED_GLASS_GREEN);
                entries.add(WindowsGlass.STAINED_GLASS_BLUE);
                entries.add(WindowsGlass.STAINED_GLASS_PURPLE);
                entries.add(WindowsGlass.STAINED_GLASS_PINK);
                entries.add(WindowsGlass.GLASS);
                entries.add(WindowsGlass.GLASS_PANE);
                entries.add(WindowsGlass.STAINED_GLASS_PANE_RED);
                entries.add(WindowsGlass.STAINED_GLASS_PANE_BLACK);
                entries.add(WindowsGlass.STAINED_GLASS_PANE_ORANGE);
                entries.add(WindowsGlass.STAINED_GLASS_PANE_YELLOW);
                entries.add(WindowsGlass.STAINED_GLASS_PANE_GREEN);
                entries.add(WindowsGlass.STAINED_GLASS_PANE_BLUE);
                entries.add(WindowsGlass.STAINED_GLASS_PANE_PURPLE);
                entries.add(WindowsGlass.STAINED_GLASS_PANE_PINK);
                entries.add(WindowsGlass.DORNE_CARVED_STONE_WINDOW);
                entries.add(WindowsGlass.DORNE_CARVED_WOODEN_WINDOW);
            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "windows_glass"), WINDOWSGLASS);
    }
}
