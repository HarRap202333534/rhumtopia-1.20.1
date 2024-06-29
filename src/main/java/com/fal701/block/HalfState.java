package com.fal701.block;

import net.minecraft.util.StringIdentifiable;

public enum HalfState implements StringIdentifiable {
    UPPER("upper"),
    LOWER("lower");
    private final String name;

    private HalfState(String name) {
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
