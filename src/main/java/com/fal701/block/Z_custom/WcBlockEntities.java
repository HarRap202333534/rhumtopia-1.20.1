package com.fal701.block.Z_custom;

import com.fal701.Rhumtopia;
import com.fal701.block.Furniture.Furniture;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.FurnaceBlockEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class WcBlockEntities {
    public static final BlockEntityType<WcBedEntity> HAMMOCK =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Rhumtopia.MOD_ID,"hammock"),
                    FabricBlockEntityTypeBuilder.create(WcBedEntity::new,
                            Furniture.HAMMOCK).build());

    public static final BlockEntityType<WcBedEntity> ITCHY_STRAW_BED =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Rhumtopia.MOD_ID,"itchy_straw_bed"),
                    FabricBlockEntityTypeBuilder.create(WcBedEntity::new,
                            Furniture.ITCHY_STRAW_BED).build());

    public static final BlockEntityType<WcBedEntity> STRAW_BED =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Rhumtopia.MOD_ID,"straw_bed"),
                    FabricBlockEntityTypeBuilder.create(WcBedEntity::new,
                            Furniture.STRAW_BED).build());

    public static final BlockEntityType<WcBedEntity> PALE_GREEN_BED =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Rhumtopia.MOD_ID,"pale_green_bed"),
                    FabricBlockEntityTypeBuilder.create(WcBedEntity::new,
                            Furniture.PALE_GREEN_BED).build());

    public static final BlockEntityType<WcBedEntity> PALE_RED_BED =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Rhumtopia.MOD_ID,"pale_red_bed"),
                    FabricBlockEntityTypeBuilder.create(WcBedEntity::new,
                            Furniture.PALE_RED_BED).build());

    public static final BlockEntityType<WcBedEntity> NORTHERN_BED =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Rhumtopia.MOD_ID,"northern_bed"),
                    FabricBlockEntityTypeBuilder.create(WcBedEntity::new,
                            Furniture.NORTHERN_BED).build());

    public static final BlockEntityType<WcBedEntity> NIGHTS_WATCH_BED =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(Rhumtopia.MOD_ID,"nights_watch_bed"),
                    FabricBlockEntityTypeBuilder.create(WcBedEntity::new,
                            Furniture.NIGHTS_WATCH_BED).build());

    public static void registerBlockEntities(){

    }
}
