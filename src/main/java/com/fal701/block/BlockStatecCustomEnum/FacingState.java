package com.fal701.block.BlockStatecCustomEnum;

import net.minecraft.util.StringIdentifiable;

public enum FacingState implements StringIdentifiable {
    NORTH("north"),
    EAST("east"),
    WEST("west"),
    SOUTH("south");

    private final String name;

    private FacingState(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String asString() {
        return this.name;
    }
}
