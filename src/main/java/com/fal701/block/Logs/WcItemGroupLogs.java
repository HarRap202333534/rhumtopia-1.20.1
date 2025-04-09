package com.fal701.block.Logs;

import com.fal701.Rhumtopia;
import com.fal701.block.Lighting.Lighting;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class WcItemGroupLogs {
    public static final ItemGroup LOGS = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Logs.OAK_LOG_CHAIN))
            .displayName(Text.translatable("itemGroup.WesterosLogs"))
            .entries((context, entries) -> {
                entries.add(Logs.WEIRWOOD_FACE_0);
                entries.add(Logs.WEIRWOOD_FACE_1);
                entries.add(Logs.WEIRWOOD_FACE_2);
                entries.add(Logs.WEIRWOOD_FACE_3);
                entries.add(Logs.WEIRWOOD_FACE_4);
                entries.add(Logs.WEIRWOOD_FACE_5);
                entries.add(Logs.WEIRWOOD_FACE_6);
                entries.add(Logs.WEIRWOOD_FACE_7);
                entries.add(Logs.WEIRWOOD_FACE_8);
                entries.add(Logs.OAK);
                entries.add(Logs.THIN_OAK_LOG);
                entries.add(Logs.OAK_BARK_FENCE);
                entries.add(Logs.LOCKED_OAK_BARK_FENCE_GATE);
                entries.add(Logs.MOSSY_OAK_LOG);
                entries.add(Logs.OAK_LOG_ROPE);
                entries.add(Logs.OAK_LOG_CHAIN);
                entries.add(Logs.SPRUCE);
                entries.add(Logs.THIN_SPRUCE_LOG);
                entries.add(Logs.SPRUCE_BARK_FENCE);
                entries.add(Logs.LOCKED_SPRUCE_BARK_FENCE_GATE);
                entries.add(Logs.MOSSY_SPRUCE_LOG);
                entries.add(Logs.SPRUCE_LOG_ROPE);
                entries.add(Logs.SPRUCE_LOG_CHAIN);
                entries.add(Logs.JUNGLE);
                entries.add(Logs.THIN_JUNGLE_LOG);
                entries.add(Logs.JUNGLE_BARK_FENCE);
                entries.add(Logs.LOCKED_JUNGLE_BARK_FENCE_GATE);
                entries.add(Logs.MOSSY_JUNGLE_LOG);
                entries.add(Logs.JUNGLE_LOG_ROPE);
                entries.add(Logs.JUNGLE_LOG_CHAIN);
                entries.add(Logs.BIRCH);
                entries.add(Logs.THIN_BIRCH_LOG);
                entries.add(Logs.BIRCH_BARK_FENCE);
                entries.add(Logs.LOCKED_BIRCH_BARK_FENCE_GATE);
                entries.add(Logs.MOSSY_BIRCH_LOG);
                entries.add(Logs.PALM_TREE_LOG);
                entries.add(Logs.THIN_PALM_LOG);
                entries.add(Logs.PALM_FENCE);
            }).build();

    public static void registerItemGroups() {
        Registry.register(Registries.ITEM_GROUP, new Identifier(Rhumtopia.MOD_ID, "logs"), LOGS);
    }
}
