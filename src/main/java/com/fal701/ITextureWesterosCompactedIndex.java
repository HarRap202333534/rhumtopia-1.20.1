package com.fal701;

import net.minecraft.client.render.model.BakedQuad;
import team.chisel.ctm.api.texture.ITextureContext;

import java.util.List;

public interface ITextureWesterosCompactedIndex {
    // Get texture index from compacted
    public int getTextureIndexFromCompacted(int compacted);
    // Get row from compacted, given texture index
    public int getRowFromCompactedIndex(int compacted, int textureIdx);
    // Get column from compacted, given texture index
    public int getColumnFromCompactedIndex(int compacted, int textureIdx);
    // Make compacted index, given texture index, row, column
    public int getCompactedIndexFromTextureRowColumn(int textureIndex, int row, int column);
    // Get connection checks
    public List<TextureWesterosCommon.ConnectionCheck> getConnectionChecks();

    List<BakedQuad> transformQuad(BakedQuad bakedQuad, ITextureContext iTextureContext, int i);
}
