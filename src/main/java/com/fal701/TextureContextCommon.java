package com.fal701;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ChunkHolder;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.event.listener.GameEventListener;
import team.chisel.ctm.api.texture.ITextureContext;

public abstract class TextureContextCommon implements ITextureContext {
    protected long compressedData; //
    private static final long masks[] = { 0x3FFL, 0x3FFL << 10, 0x3FFL << 20, 0x3FFL << 30, 0x3FFL << 40, 0x3FFL << 50 };

    public static final int COMPACTED_INDEX_NULL_QUAD = 0x3FF;

    public int getCompactedIndexByDirection(Direction dir) {
        return (int)((compressedData >> (10 * dir.ordinal())) & 0x3FFL);
    }
    public void setCompactedIndexByDirection(Direction dir, int compactedIndex) {
        int ord = dir.ordinal();
        compressedData = (compressedData & (~masks[ord])) | (((long)compactedIndex) << (10 * ord));
    }
    public String getBiomeName(BlockPos pos) {
        String biomeName = "";
        // Compute biome
        @SuppressWarnings("resource")
        PlayerEntity p = MinecraftClient.getInstance().player;
        if (p != null) {
            Biome b = p.getWorld().getBiome(pos).value();
            biomeName = b.toString();
        }
        return biomeName;
    }

    protected int getTextureIndex(int tidx, int trow, int tcol, TextureWesterosCommon<?> tex, World world, BlockPos pos, String biomeName,
                                  Direction dir, long[] ctmConnBits) {
        if (tex != null) {
            return tex.handler.resolveCond(tidx, trow, tcol, world, pos, biomeName, tex, dir, ctmConnBits);
        }
        else {
            return tex.getCompactedIndexFromTextureRowColumn(tidx, trow, tcol);
        }
    }

    @Override
    public long getCompressedData() {
        return this.compressedData;
    }
}
