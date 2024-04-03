package com.fal701.util;

import com.fal701.Rhumtopia;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class WcTags {
    public static class Blocks {
        public static final TagKey<Block> COBBLESTONE = createTag("cobblestone");


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Rhumtopia.MOD_ID, name));
        }
    }

    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(Rhumtopia.MOD_ID, name));
        }
    }
}
