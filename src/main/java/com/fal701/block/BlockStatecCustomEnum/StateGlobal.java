package com.fal701.block.BlockStatecCustomEnum;

import net.minecraft.util.StringIdentifiable;

public enum  StateGlobal implements StringIdentifiable {
    RANDOM("random"),
    BONES1("bones1"),
    BONES2("bones2"),
    BONES3("bones3"),
    COINS1("coins1"),
    COINS2("coins2"),
    COINS3("coins3"),
    COINS4("coins4"),
    COINS5("coins5"),
    COINS6("coins6"),
    PAPERWORK1("paperwork1"),
    PAPERWORK2("paperwork2"),
    PAPERWORK3("paperwork3"),
    PAPERWORK4("paperwork4"),
    PAPERWORK5("paperwork5"),
    PAPERWORK6("paperwork6"),
    COBWEB1("cobweb1"),
    COBWEB2("cobweb2"),
    COBWEB3("cobweb3"),
    COBWEB4("cobweb4"),
    COBWEB5("cobweb5"),
    COBWEB6("cobweb6"),
    COBWEB7("cobweb7"),
    COBWEB8("cobweb8"),
    LIT("lit"),
    UNLIT("unlit");


    private final String name;

    private StateGlobal(String name){
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
