package com.fal701.block;

import net.minecraft.util.StringIdentifiable;

import java.util.function.BooleanSupplier;

public enum OpenState implements BooleanSupplier {
    TRUE(true),
    FALSE(false);


    private final boolean open;

    private OpenState(boolean open) {
        this.open = open;
    }

    @Override
    public boolean getAsBoolean() {
        return open;
    }
}
