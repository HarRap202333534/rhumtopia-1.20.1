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
                entries.add(WindowsGlass.OAK_WINDOW_SHUTTERS);
                entries.add(WindowsGlass.STAINED_GLASS_RED);
            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "windows_glass"), WINDOWSGLASS);
    }
}
