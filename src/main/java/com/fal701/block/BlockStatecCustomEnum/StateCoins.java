package com.fal701.block.BlockStatecCustomEnum;

import net.minecraft.util.StringIdentifiable;

public enum StateCoins implements StringIdentifiable {

    RANDOM("random"),
    COINS1("coins1"),
    COINS2("coins2"),
    COINS3("coins3"),
    COINS4("coins4"),
    COINS5("coins5"),
    COINS6("coins6");



    private final String name;

    private StateCoins(String name){
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
