package com.fal701.block.BlockStatecCustomEnum;

import net.minecraft.util.StringIdentifiable;

public enum StateStatePaper implements StringIdentifiable {
    RANDOM("random"),
    PAPERWORK1("paperwork1"),
    PAPERWORK2("paperwork2"),
    PAPERWORK3("paperwork3"),
    PAPERWORK4("paperwork4"),
    PAPERWORK5("paperwork5"),
    PAPERWORK6("paperwork6");



    private final String name;

    private StateStatePaper(String name){
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
