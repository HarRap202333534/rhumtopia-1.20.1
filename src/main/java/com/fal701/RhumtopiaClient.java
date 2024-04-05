package com.fal701;

import com.fal701.block.Fieldstone.Fieldstone;
import com.fal701.block.QuarterAshlar.QuarterAshlar;
import com.fal701.block.SmoothAshlar.SmoothAshlar;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class RhumtopiaClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {











//All transparent blocks
        //Fieldstone
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.FAINT_BROWN_GREY_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.FAINT_BROWN_GREY_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.FAINT_BROWN_GREY_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//1
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.LIGHT_GREY_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.LIGHT_GREY_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.LIGHT_GREY_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//2
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.REACH_LIGHT_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.REACH_LIGHT_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.REACH_LIGHT_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//3
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.BROWN_GREY_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.BROWN_GREY_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.BROWN_GREY_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//4
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.FAINT_LIGHT_GREY_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.FAINT_LIGHT_GREY_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.FAINT_LIGHT_GREY_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//5
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.WHITE_LIGHT_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.WHITE_LIGHT_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.WHITE_LIGHT_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//6
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.PALE_PINK_FAINT_LIGHT_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.PALE_PINK_FAINT_LIGHT_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.PALE_PINK_FAINT_LIGHT_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//7
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.PALE_PINK_LIGHT_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.PALE_PINK_LIGHT_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.PALE_PINK_LIGHT_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//8
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.SANDY_PINK_FAINT_LIGHT_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.SANDY_PINK_FAINT_LIGHT_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.SANDY_PINK_FAINT_LIGHT_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//9
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.SANDY_PINK_LIGHT_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.SANDY_PINK_LIGHT_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.SANDY_PINK_LIGHT_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//10
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.LIGHT_OLDTOWN_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.LIGHT_OLDTOWN_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.LIGHT_OLDTOWN_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//11
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.OLDTOWN_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.OLDTOWN_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.OLDTOWN_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//12
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.ARBOR_SMALL_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.ARBOR_SMALL_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.ARBOR_SMALL_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//13
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.LANNISPORT_LIGHT_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.LANNISPORT_LIGHT_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Fieldstone.LANNISPORT_LIGHT_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//14

        //Smooth Ashlar
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.BLACK_LIGHT_STONE_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.BLACK_LIGHT_STONE_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.BLACK_LIGHT_STONE_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//1
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.BROWN_GREY_LIGHT_STONE_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.BROWN_GREY_LIGHT_STONE_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.BROWN_GREY_LIGHT_STONE_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//2
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.GREY_LIGHT_STONE_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.GREY_LIGHT_STONE_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.GREY_LIGHT_STONE_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//3
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.FAINT_LIGHT_GREY_LIGHT_STONE_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.FAINT_LIGHT_GREY_LIGHT_STONE_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.FAINT_LIGHT_GREY_LIGHT_STONE_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//4
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.WHITE_LIGHT_STONE_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.WHITE_LIGHT_STONE_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.WHITE_LIGHT_STONE_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//5
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.LIGHT_STONE_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.LIGHT_STONE_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.LIGHT_STONE_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//6
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.PALE_PINK_LIGHT_STONE_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.PALE_PINK_LIGHT_STONE_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.PALE_PINK_LIGHT_STONE_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//7
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.RED_LIGHT_STONE_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.RED_LIGHT_STONE_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.RED_LIGHT_STONE_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//8
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.DARK_RED_LIGHT_STONE_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.DARK_RED_LIGHT_STONE_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.DARK_RED_LIGHT_STONE_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//9
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.OLDTOWN_LIGHT_STONE_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.OLDTOWN_LIGHT_STONE_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.OLDTOWN_LIGHT_STONE_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//10
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.ARBOR_LIGHT_STONE_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.ARBOR_LIGHT_STONE_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.ARBOR_LIGHT_STONE_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//11
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.LANNISPORT_LIGHT_STONE_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.LANNISPORT_LIGHT_STONE_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.LANNISPORT_LIGHT_STONE_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//12
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.STORMLANDS_LIGHT_STONE_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.STORMLANDS_LIGHT_STONE_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.STORMLANDS_LIGHT_STONE_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//13
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.TERRACOTTA_LIGHT_STONE_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.TERRACOTTA_LIGHT_STONE_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SmoothAshlar.TERRACOTTA_LIGHT_STONE_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//10

        //Quarter Ashlar
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.BASALT_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.BASALT_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.BASALT_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//1
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_DARK_GREY_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_DARK_GREY_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_DARK_GREY_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//2
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_SMOOTH_BROWN_GREY_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_SMOOTH_BROWN_GREY_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_SMOOTH_BROWN_GREY_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//3
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_BROWN_GREY_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_BROWN_GREY_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_BROWN_GREY_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//4
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_STONE_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_STONE_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_STONE_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//5
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_SMOOTH_STONE_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_SMOOTH_STONE_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_SMOOTH_STONE_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//6
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_FAINT_LIGHT_GREY_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_FAINT_LIGHT_GREY_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_FAINT_LIGHT_GREY_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//7
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_WHITE_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_WHITE_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_WHITE_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//8
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.REACH_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.REACH_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.REACH_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//9
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SANDY_PINK_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SANDY_PINK_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SANDY_PINK_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//10
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_KL_DUN_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_KL_DUN_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_KL_DUN_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//11
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_COARSE_RED_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_COARSE_RED_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_COARSE_RED_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//12
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.UNUSED_PURPLE_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.UNUSED_PURPLE_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.UNUSED_PURPLE_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//13
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.DARK_RED_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.DARK_RED_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.DARK_RED_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//14
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_SMOOTH_OLDTOWN_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_SMOOTH_OLDTOWN_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_SMOOTH_OLDTOWN_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//15
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_OLDTOWN_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_OLDTOWN_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_OLDTOWN_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//16
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_ARBOR_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_ARBOR_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_ARBOR_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//17
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_SMOOTH_LANNISPORT_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_SMOOTH_LANNISPORT_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_SMOOTH_LANNISPORT_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//18
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_LANNISPORT_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_LANNISPORT_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_LANNISPORT_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//19
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.UNUSED_BROWN_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.UNUSED_BROWN_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.UNUSED_BROWN_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//20
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.STORMLANDS_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.STORMLANDS_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.STORMLANDS_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//21
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_TERRACOTTA_BRICK_ARROW_SLIT, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_TERRACOTTA_BRICK_ARROW_SLIT_WINDOW, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(QuarterAshlar.SMALL_TERRACOTTA_BRICK_ARROW_SLIT_ORNATE, RenderLayer.getCutout());//22

    }
}
