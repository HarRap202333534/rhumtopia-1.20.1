package com.fal701.block.BlockStatecCustomEnum;

import net.minecraft.util.StringIdentifiable;

public enum StateStateBones implements StringIdentifiable {
    RANDOM("random"),
    BONES1("bones1"),
    BONES2("bones2"),
    BONES3("bones3");
    private final String name;

    private StateStateBones(String name){
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
