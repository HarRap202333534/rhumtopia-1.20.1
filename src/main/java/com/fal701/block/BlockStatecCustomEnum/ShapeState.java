package com.fal701.block.BlockStatecCustomEnum;

import net.minecraft.util.StringIdentifiable;

public enum ShapeState implements StringIdentifiable {
    EAST_WEST("east_west"),
    ASCENDING_WEST("ascending_west"),
    NORTH_EAST("north_east"),
    SOUTH_WEST("south_west"),
    SOUTH_EAST("south_east"),
    NORTH_SOUTH("north_south"),
    ASCENDING_SOUTH("ascending_south"),
    ASCENDING_EAST("ascending_east"),
    NORTH_WEST("north_west"),
    ASCENDING_NORTH("ascending_north");


    private final String name;

    private ShapeState(String name){
        this.name = name;
    }

    public String toString(){
        return this.name;
    }

    @Override
    public String asString() {
        return name;
    }
}
