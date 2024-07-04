package com.fal701.block.BlockStatecCustomEnum;

import net.minecraft.util.StringIdentifiable;

public enum StateFood implements StringIdentifiable {
    FOOD("food"),
    EMPTY("empty");
    private final String name;

    private StateFood(String name){
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
