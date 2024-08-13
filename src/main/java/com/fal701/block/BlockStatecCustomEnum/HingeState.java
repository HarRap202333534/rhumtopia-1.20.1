package com.fal701.block.BlockStatecCustomEnum;

import net.minecraft.util.StringIdentifiable;

public enum HingeState implements StringIdentifiable {
    RIGHT("right"),
    LEFT("left");
    private final String name;

    private HingeState(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String asString() {
        return name;
    }
}
